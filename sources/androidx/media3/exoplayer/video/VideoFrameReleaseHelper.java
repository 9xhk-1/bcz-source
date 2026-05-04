package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;

    @Nullable
    private final DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final FixedFrameRateEstimator frameRateEstimator = new FixedFrameRateEstimator();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;

    @Nullable
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;

    @Nullable
    private final VSyncSampler vsyncSampler;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(Surface surface, float f11) {
            try {
                surface.setFrameRate(f11, f11 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e11) {
                Log.e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 1;
        private static final VSyncSampler INSTANCE = new VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 2;
        private static final int MSG_REMOVE_OBSERVER = 3;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = C.TIME_UNSET;

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            Handler createHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.handler = createHandler;
            createHandler.sendEmptyMessage(1);
        }

        private void addObserverInternal() {
            Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i11 = this.observerCount + 1;
                this.observerCount = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.choreographer = Choreographer.getInstance();
            } catch (RuntimeException e11) {
                Log.w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e11);
            }
        }

        public static VSyncSampler getInstance() {
            return INSTANCE;
        }

        private void removeObserverInternal() {
            Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i11 = this.observerCount - 1;
                this.observerCount = i11;
                if (i11 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.sampledVsyncTimeNs = C.TIME_UNSET;
                }
            }
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            this.sampledVsyncTimeNs = j11;
            ((Choreographer) Assertions.checkNotNull(this.choreographer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i11 == 2) {
                addObserverInternal();
                return true;
            }
            if (i11 != 3) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(3);
        }
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        DisplayHelper maybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.displayHelper = maybeBuildDisplayHelper;
        this.vsyncSampler = maybeBuildDisplayHelper != null ? VSyncSampler.getInstance() : null;
        this.vsyncDurationNs = C.TIME_UNSET;
        this.vsyncOffsetNs = C.TIME_UNSET;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    private static boolean adjustmentAllowed(long j11, long j12) {
        return Math.abs(j11 - j12) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        Api30.setSurfaceFrameRate(surface, 0.0f);
    }

    private static long closestVsync(long j11, long j12, long j13) {
        long j14;
        long j15 = j12 + (((j11 - j12) / j13) * j13);
        if (j11 <= j15) {
            j14 = j15 - j13;
        } else {
            long j16 = j13 + j15;
            j14 = j15;
            j15 = j16;
        }
        return j15 - j11 < j11 - j14 ? j15 : j14;
    }

    @Nullable
    private DisplayHelper maybeBuildDisplayHelper(@Nullable Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL)) == null) {
            return null;
        }
        return new DisplayHelper(displayManager);
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
        } else {
            Log.w(TAG, "Unable to query display refresh rate");
            this.vsyncDurationNs = C.TIME_UNSET;
            this.vsyncOffsetNs = C.TIME_UNSET;
        }
    }

    private void updateSurfaceMediaFrameRate() {
        if (Util.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f11 = this.surfaceMediaFrameRate;
        if (frameRate == f11) {
            return;
        }
        if (frameRate != -1.0f && f11 != -1.0f) {
            if (Math.abs(frameRate - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.isSynced() || this.frameRateEstimator.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE)) {
                return;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    private void updateSurfacePlaybackFrameRate(boolean z11) {
        Surface surface;
        float f11;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE) {
            return;
        }
        if (this.started) {
            float f12 = this.surfaceMediaFrameRate;
            if (f12 != -1.0f) {
                f11 = f12 * this.playbackSpeed;
                if (z11 && this.surfacePlaybackFrameRate == f11) {
                    return;
                }
                this.surfacePlaybackFrameRate = f11;
                Api30.setSurfaceFrameRate(surface, f11);
            }
        }
        f11 = 0.0f;
        if (z11) {
        }
        this.surfacePlaybackFrameRate = f11;
        Api30.setSurfaceFrameRate(surface, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long adjustReleaseTime(long r11) {
        /*
            r10 = this;
            long r0 = r10.lastAdjustedFrameIndex
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2f
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r0 = r10.frameRateEstimator
            boolean r0 = r0.isSynced()
            if (r0 == 0) goto L2f
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r0 = r10.frameRateEstimator
            long r0 = r0.getFrameDurationNs()
            long r2 = r10.lastAdjustedReleaseTimeNs
            long r4 = r10.frameIndex
            long r6 = r10.lastAdjustedFrameIndex
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.playbackSpeed
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = adjustmentAllowed(r11, r2)
            if (r0 == 0) goto L2c
            r4 = r2
            goto L30
        L2c:
            r10.resetAdjustment()
        L2f:
            r4 = r11
        L30:
            long r11 = r10.frameIndex
            r10.pendingLastAdjustedFrameIndex = r11
            r10.pendingLastAdjustedReleaseTimeNs = r4
            androidx.media3.exoplayer.video.VideoFrameReleaseHelper$VSyncSampler r11 = r10.vsyncSampler
            if (r11 == 0) goto L57
            long r0 = r10.vsyncDurationNs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L46
            goto L57
        L46:
            long r6 = r11.sampledVsyncTimeNs
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L4d
            goto L57
        L4d:
            long r8 = r10.vsyncDurationNs
            long r11 = closestVsync(r4, r6, r8)
            long r0 = r10.vsyncOffsetNs
            long r11 = r11 - r0
            return r11
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseHelper.adjustReleaseTime(long):long");
    }

    public void onFormatChanged(float f11) {
        this.formatFrameRate = f11;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j11) {
        long j12 = this.pendingLastAdjustedFrameIndex;
        if (j12 != -1) {
            this.lastAdjustedFrameIndex = j12;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j11 * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f11) {
        this.playbackSpeed = f11;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (this.displayHelper != null) {
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).addObserver();
            this.displayHelper.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        DisplayHelper displayHelper = this.displayHelper;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i11) {
        if (this.changeFrameRateStrategy == i11) {
            return;
        }
        this.changeFrameRateStrategy = i11;
        updateSurfacePlaybackFrameRate(true);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class DisplayHelper implements DisplayManager.DisplayListener {
        private final DisplayManager displayManager;

        public DisplayHelper(DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        private Display getDefaultDisplay() {
            return this.displayManager.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            if (i11 == 0) {
                VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
            }
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
            VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }
}
