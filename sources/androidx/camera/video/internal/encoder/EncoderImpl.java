package androidx.camera.video.internal.encoder;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.VideoTimebaseConverter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class EncoderImpl implements Encoder {
    private static final boolean DEBUG = false;
    private static final long NO_LIMIT_LONG = Long.MAX_VALUE;
    private static final Range<Long> NO_RANGE = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    private static final long SIGNAL_EOS_TIMEOUT_MS = 1000;
    private static final long STOP_TIMEOUT_MS = 1000;
    final Executor mEncoderExecutor;
    private final EncoderInfo mEncoderInfo;
    final Encoder.EncoderInput mEncoderInput;
    final Timebase mInputTimebase;
    final boolean mIsVideoEncoder;
    final MediaCodec mMediaCodec;
    private final MediaFormat mMediaFormat;
    private final CallbackToFutureAdapter.Completer<Void> mReleasedCompleter;
    private final p1<Void> mReleasedFuture;

    @Nullable
    private Future<?> mSignalEosTimeoutFuture;
    InternalState mState;
    final String mTag;
    final Object mLock = new Object();
    final Queue<Integer> mFreeInputBufferIndexQueue = new ArrayDeque();
    private final Queue<CallbackToFutureAdapter.Completer<InputBuffer>> mAcquisitionQueue = new ArrayDeque();
    private final Set<InputBuffer> mInputBufferSet = new HashSet();
    final Set<EncodedDataImpl> mEncodedDataSet = new HashSet();
    final Deque<Range<Long>> mActivePauseResumeTimeRanges = new ArrayDeque();
    final TimeProvider mTimeProvider = new SystemTimeProvider();

    @GuardedBy("mLock")
    EncoderCallback mEncoderCallback = EncoderCallback.EMPTY;

    @GuardedBy("mLock")
    Executor mEncoderCallbackExecutor = CameraXExecutors.directExecutor();
    Range<Long> mStartStopTimeRangeUs = NO_RANGE;
    long mTotalPausedDurationUs = 0;
    boolean mPendingCodecStop = false;
    Long mLastDataStopTimestamp = null;
    Future<?> mStopTimeoutFuture = null;
    private MediaCodecCallback mMediaCodecCallback = null;
    private boolean mIsFlushedAfterEndOfStream = false;
    private boolean mSourceStoppedSignalled = false;
    boolean mMediaCodecEosSignalled = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @NonNull
        public static Surface createPersistentInputSurface() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void setInputSurface(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ByteBufferInput implements Encoder.ByteBufferInput {
        private final Map<Observable.Observer<? super BufferProvider.State>, Executor> mStateObservers = new LinkedHashMap();
        private BufferProvider.State mBufferProviderState = BufferProvider.State.INACTIVE;
        private final List<p1<InputBuffer>> mAcquisitionList = new ArrayList();

        public ByteBufferInput() {
        }

        public static /* synthetic */ Object c(final ByteBufferInput byteBufferInput, final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.y
                @Override // java.lang.Runnable
                public final void run() {
                    completer.set(EncoderImpl.ByteBufferInput.this.mBufferProviderState);
                }
            });
            return "fetchData";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancelInputBuffer(@NonNull p1<InputBuffer> p1Var) {
            if (p1Var.cancel(true)) {
                return;
            }
            Preconditions.checkState(p1Var.isDone());
            try {
                p1Var.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e11) {
                Logger.w(EncoderImpl.this.mTag, "Unable to cancel the input buffer: " + e11);
            }
        }

        public static /* synthetic */ void d(ByteBufferInput byteBufferInput, final Observable.Observer observer, Executor executor) {
            byteBufferInput.mStateObservers.put((Observable.Observer) Preconditions.checkNotNull(observer), (Executor) Preconditions.checkNotNull(executor));
            final BufferProvider.State state = byteBufferInput.mBufferProviderState;
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.c0
                @Override // java.lang.Runnable
                public final void run() {
                    Observable.Observer.this.onNewData(state);
                }
            });
        }

        public static /* synthetic */ Object h(final ByteBufferInput byteBufferInput, final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.x
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.i(EncoderImpl.ByteBufferInput.this, completer);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void i(final ByteBufferInput byteBufferInput, CallbackToFutureAdapter.Completer completer) {
            BufferProvider.State state = byteBufferInput.mBufferProviderState;
            if (state == BufferProvider.State.ACTIVE) {
                final p1<InputBuffer> acquireInputBuffer = EncoderImpl.this.acquireInputBuffer();
                Futures.propagate(acquireInputBuffer, completer);
                completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.ByteBufferInput.this.cancelInputBuffer(acquireInputBuffer);
                    }
                }, CameraXExecutors.directExecutor());
                byteBufferInput.mAcquisitionList.add(acquireInputBuffer);
                acquireInputBuffer.addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.ByteBufferInput.this.mAcquisitionList.remove(acquireInputBuffer);
                    }
                }, EncoderImpl.this.mEncoderExecutor);
                return;
            }
            if (state == BufferProvider.State.INACTIVE) {
                completer.setException(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            completer.setException(new IllegalStateException("Unknown state: " + byteBufferInput.mBufferProviderState));
        }

        @Override // androidx.camera.video.internal.BufferProvider
        @NonNull
        public p1<InputBuffer> acquireBuffer() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.w
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.ByteBufferInput.h(EncoderImpl.ByteBufferInput.this, completer);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(@NonNull final Executor executor, @NonNull final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.u
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.d(EncoderImpl.ByteBufferInput.this, observer, executor);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        @NonNull
        public p1<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.v
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.ByteBufferInput.c(EncoderImpl.ByteBufferInput.this, completer);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(@NonNull final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.d0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.this.mStateObservers.remove(Preconditions.checkNotNull(observer));
                }
            });
        }

        public void setActive(boolean z11) {
            final BufferProvider.State state = z11 ? BufferProvider.State.ACTIVE : BufferProvider.State.INACTIVE;
            if (this.mBufferProviderState == state) {
                return;
            }
            this.mBufferProviderState = state;
            if (state == BufferProvider.State.INACTIVE) {
                Iterator<p1<InputBuffer>> it = this.mAcquisitionList.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.mAcquisitionList.clear();
            }
            for (final Map.Entry<Observable.Observer<? super BufferProvider.State>, Executor> entry : this.mStateObservers.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((Observable.Observer) entry.getKey()).onNewData(state);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum InternalState {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class SurfaceInput implements Encoder.SurfaceInput {
        private final Object mLock = new Object();

        @GuardedBy("mLock")
        private final Set<Surface> mObsoleteSurfaces = new HashSet();

        @GuardedBy("mLock")
        private Surface mSurface;

        @GuardedBy("mLock")
        private Executor mSurfaceUpdateExecutor;

        @GuardedBy("mLock")
        private Encoder.SurfaceInput.OnSurfaceUpdateListener mSurfaceUpdateListener;

        public SurfaceInput() {
        }

        private void notifySurfaceUpdate(@NonNull Executor executor, @NonNull final Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, @NonNull final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Encoder.SurfaceInput.OnSurfaceUpdateListener.this.onSurfaceUpdate(surface);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
            }
        }

        public void releaseSurface() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.mLock) {
                surface = this.mSurface;
                this.mSurface = null;
                hashSet = new HashSet(this.mObsoleteSurfaces);
                this.mObsoleteSurfaces.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        @SuppressLint({"NewApi"})
        public void resetSurface() {
            Surface createInputSurface;
            Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.mLock) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.mSurface == null) {
                            createInputSurface = Api23Impl.createPersistentInputSurface();
                            this.mSurface = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        Api23Impl.setInputSurface(EncoderImpl.this.mMediaCodec, this.mSurface);
                    } else {
                        Surface surface = this.mSurface;
                        if (surface != null) {
                            this.mObsoleteSurfaces.add(surface);
                        }
                        createInputSurface = EncoderImpl.this.mMediaCodec.createInputSurface();
                        this.mSurface = createInputSurface;
                    }
                    onSurfaceUpdateListener = this.mSurfaceUpdateListener;
                    executor = this.mSurfaceUpdateExecutor;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (createInputSurface == null || onSurfaceUpdateListener == null || executor == null) {
                return;
            }
            notifySurfaceUpdate(executor, onSurfaceUpdateListener, createInputSurface);
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public void setOnSurfaceUpdateListener(@NonNull Executor executor, @NonNull Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
            Surface surface;
            synchronized (this.mLock) {
                this.mSurfaceUpdateListener = (Encoder.SurfaceInput.OnSurfaceUpdateListener) Preconditions.checkNotNull(onSurfaceUpdateListener);
                this.mSurfaceUpdateExecutor = (Executor) Preconditions.checkNotNull(executor);
                surface = this.mSurface;
            }
            if (surface != null) {
                notifySurfaceUpdate(executor, onSurfaceUpdateListener, surface);
            }
        }
    }

    public EncoderImpl(@NonNull Executor executor, @NonNull EncoderConfig encoderConfig) throws InvalidConfigException {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(encoderConfig);
        MediaCodec createCodec = CodecUtil.createCodec(encoderConfig);
        this.mMediaCodec = createCodec;
        MediaCodecInfo codecInfo = createCodec.getCodecInfo();
        this.mEncoderExecutor = CameraXExecutors.newSequentialExecutor(executor);
        MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.mMediaFormat = mediaFormat;
        Timebase inputTimebase = encoderConfig.getInputTimebase();
        this.mInputTimebase = inputTimebase;
        if (encoderConfig instanceof AudioEncoderConfig) {
            this.mTag = "AudioEncoder";
            this.mIsVideoEncoder = false;
            this.mEncoderInput = new ByteBufferInput();
            this.mEncoderInfo = new AudioEncoderInfoImpl(codecInfo, encoderConfig.getMimeType());
        } else {
            if (!(encoderConfig instanceof VideoEncoderConfig)) {
                throw new InvalidConfigException("Unknown encoder config type");
            }
            this.mTag = "VideoEncoder";
            this.mIsVideoEncoder = true;
            this.mEncoderInput = new SurfaceInput();
            VideoEncoderInfoImpl videoEncoderInfoImpl = new VideoEncoderInfoImpl(codecInfo, encoderConfig.getMimeType());
            clampVideoBitrateIfNotSupported(videoEncoderInfoImpl, mediaFormat);
            this.mEncoderInfo = videoEncoderInfoImpl;
        }
        Logger.d(this.mTag, "mInputTimebase = " + inputTimebase);
        Logger.d(this.mTag, "mMediaFormat = " + mediaFormat);
        try {
            reset();
            final AtomicReference atomicReference = new AtomicReference();
            this.mReleasedFuture = Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.k
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.n(atomicReference, completer);
                }
            }));
            this.mReleasedCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
            setState(InternalState.CONFIGURED);
        } catch (MediaCodec.CodecException e11) {
            throw new InvalidConfigException(e11);
        }
    }

    public static /* synthetic */ void a(EncoderImpl encoderImpl) {
        if (encoderImpl.mPendingCodecStop) {
            Logger.w(encoderImpl.mTag, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            encoderImpl.mLastDataStopTimestamp = null;
            encoderImpl.signalCodecStop();
            encoderImpl.mPendingCodecStop = false;
        }
    }

    private void addSignalEosTimeoutIfNeeded() {
        if (DeviceQuirks.get(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final MediaCodecCallback mediaCodecCallback = this.mMediaCodecCallback;
            final Executor executor = this.mEncoderExecutor;
            Future<?> future = this.mSignalEosTimeoutFuture;
            if (future != null) {
                future.cancel(false);
            }
            this.mSignalEosTimeoutFuture = CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.internal.encoder.f
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.f(executor, mediaCodecCallback);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void c(EncoderImpl encoderImpl) {
        int ordinal = encoderImpl.mState.ordinal();
        if (ordinal == 1) {
            encoderImpl.requestKeyFrameToMediaCodec();
        } else if (ordinal == 6 || ordinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    private void clampVideoBitrateIfNotSupported(@NonNull VideoEncoderInfo videoEncoderInfo, @NonNull MediaFormat mediaFormat) {
        Preconditions.checkState(this.mIsVideoEncoder);
        if (mediaFormat.containsKey(IjkMediaMeta.IJKM_KEY_BITRATE)) {
            int integer = mediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_BITRATE);
            int intValue = videoEncoderInfo.getSupportedBitrateRange().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, intValue);
                Logger.d(this.mTag, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    public static /* synthetic */ void e(EncoderImpl encoderImpl, long j11) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                Logger.d(encoderImpl.mTag, "Pause on " + DebugUtils.readableUs(j11));
                encoderImpl.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(j11), Long.MAX_VALUE));
                encoderImpl.setState(InternalState.PAUSED);
                return;
            case PENDING_START:
                encoderImpl.setState(InternalState.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    public static /* synthetic */ void f(Executor executor, final MediaCodecCallback mediaCodecCallback) {
        Objects.requireNonNull(mediaCodecCallback);
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.MediaCodecCallback.this.reachEndData();
            }
        });
    }

    public static boolean hasEndOfStreamFlag(@NonNull MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk() {
        return DeviceQuirks.get(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    public static /* synthetic */ void i(EncoderImpl encoderImpl) {
        encoderImpl.mSourceStoppedSignalled = true;
        if (encoderImpl.mIsFlushedAfterEndOfStream) {
            encoderImpl.mMediaCodec.stop();
            encoderImpl.reset();
        }
    }

    public static boolean isKeyFrame(@NonNull MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void k(final androidx.camera.video.internal.encoder.EncoderImpl r6, long r7, long r9) {
        /*
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r6.mState
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto Lba;
                case 1: goto L30;
                case 2: goto L30;
                case 3: goto Lba;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L22;
                case 7: goto Lba;
                case 8: goto L22;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown state: "
            r8.append(r9)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r6 = r6.mState
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L22:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Encoder is released"
            r6.<init>(r7)
            throw r6
        L2a:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r7 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED
            r6.setState(r7)
            return
        L30:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r6.mState
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING
            r6.setState(r1)
            android.util.Range<java.lang.Long> r1 = r6.mStartStopTimeRangeUs
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto Lb2
            r4 = -1
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L53
            goto L5e
        L53:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L5f
            java.lang.String r7 = r6.mTag
            java.lang.String r8 = "The expected stop time is less than the start time. Use current time as stop time."
            androidx.camera.core.Logger.w(r7, r8)
        L5e:
            r7 = r9
        L5f:
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto Laa
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            android.util.Range r9 = android.util.Range.create(r1, r9)
            r6.mStartStopTimeRangeUs = r9
            java.lang.String r9 = r6.mTag
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Stop on "
            r10.append(r1)
            java.lang.String r7 = androidx.camera.video.internal.DebugUtils.readableUs(r7)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            androidx.camera.core.Logger.d(r9, r7)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r7 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
            if (r0 != r7) goto L93
            java.lang.Long r7 = r6.mLastDataStopTimestamp
            if (r7 == 0) goto L93
            r6.signalCodecStop()
            return
        L93:
            r7 = 1
            r6.mPendingCodecStop = r7
            java.util.concurrent.ScheduledExecutorService r7 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.video.internal.encoder.t r8 = new androidx.camera.video.internal.encoder.t
            r8.<init>()
            r9 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r0)
            r6.mStopTimeoutFuture = r7
            return
        Laa:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "The start time should be before the stop time."
            r6.<init>(r7)
            throw r6
        Lb2:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "There should be a \"start\" before \"stop\""
            r6.<init>(r7)
            throw r6
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.EncoderImpl.k(androidx.camera.video.internal.encoder.EncoderImpl, long, long):void");
    }

    public static /* synthetic */ void l(EncoderImpl encoderImpl, long j11) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
                encoderImpl.mLastDataStopTimestamp = null;
                Logger.d(encoderImpl.mTag, "Start on " + DebugUtils.readableUs(j11));
                try {
                    if (encoderImpl.mIsFlushedAfterEndOfStream) {
                        encoderImpl.reset();
                    }
                    encoderImpl.mStartStopTimeRangeUs = Range.create(Long.valueOf(j11), Long.MAX_VALUE);
                    encoderImpl.mMediaCodec.start();
                    Encoder.EncoderInput encoderInput = encoderImpl.mEncoderInput;
                    if (encoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput).setActive(true);
                    }
                    encoderImpl.setState(InternalState.STARTED);
                    return;
                } catch (MediaCodec.CodecException e11) {
                    encoderImpl.handleEncodeError(e11);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                encoderImpl.mLastDataStopTimestamp = null;
                Range<Long> removeLast = encoderImpl.mActivePauseResumeTimeRanges.removeLast();
                Preconditions.checkState(removeLast != null && removeLast.getUpper().longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long lower = removeLast.getLower();
                long longValue = lower.longValue();
                encoderImpl.mActivePauseResumeTimeRanges.addLast(Range.create(lower, Long.valueOf(j11)));
                Logger.d(encoderImpl.mTag, "Resume on " + DebugUtils.readableUs(j11) + "\nPaused duration = " + DebugUtils.readableUs(j11 - longValue));
                if ((encoderImpl.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!encoderImpl.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    encoderImpl.setMediaCodecPaused(false);
                    Encoder.EncoderInput encoderInput2 = encoderImpl.mEncoderInput;
                    if (encoderInput2 instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput2).setActive(true);
                    }
                }
                if (encoderImpl.mIsVideoEncoder) {
                    encoderImpl.requestKeyFrameToMediaCodec();
                }
                encoderImpl.setState(InternalState.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                encoderImpl.setState(InternalState.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    public static /* synthetic */ Object n(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "mReleasedFuture";
    }

    public static /* synthetic */ void o(EncoderImpl encoderImpl, List list, Runnable runnable) {
        if (encoderImpl.mState != InternalState.ERROR) {
            if (!list.isEmpty()) {
                Logger.d(encoderImpl.mTag, "encoded data and input buffers are returned");
            }
            if (!(encoderImpl.mEncoderInput instanceof SurfaceInput) || encoderImpl.mSourceStoppedSignalled || encoderImpl.hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk()) {
                encoderImpl.mMediaCodec.stop();
            } else {
                encoderImpl.mMediaCodec.flush();
                encoderImpl.mIsFlushedAfterEndOfStream = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        encoderImpl.handleStopped();
    }

    public static /* synthetic */ void p(EncoderImpl encoderImpl) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                encoderImpl.releaseInternal();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                encoderImpl.setState(InternalState.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    public static /* synthetic */ Object q(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "acquireInputBuffer";
    }

    private void releaseInternal() {
        if (this.mIsFlushedAfterEndOfStream) {
            this.mMediaCodec.stop();
            this.mIsFlushedAfterEndOfStream = false;
        }
        this.mMediaCodec.release();
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).releaseSurface();
        }
        setState(InternalState.RELEASED);
        this.mReleasedCompleter.set(null);
    }

    private void reset() {
        this.mStartStopTimeRangeUs = NO_RANGE;
        this.mTotalPausedDurationUs = 0L;
        this.mActivePauseResumeTimeRanges.clear();
        this.mFreeInputBufferIndexQueue.clear();
        Iterator<CallbackToFutureAdapter.Completer<InputBuffer>> it = this.mAcquisitionQueue.iterator();
        while (it.hasNext()) {
            it.next().setCancelled();
        }
        this.mAcquisitionQueue.clear();
        this.mMediaCodec.reset();
        this.mIsFlushedAfterEndOfStream = false;
        this.mSourceStoppedSignalled = false;
        this.mMediaCodecEosSignalled = false;
        this.mPendingCodecStop = false;
        Future<?> future = this.mStopTimeoutFuture;
        if (future != null) {
            future.cancel(true);
            this.mStopTimeoutFuture = null;
        }
        Future<?> future2 = this.mSignalEosTimeoutFuture;
        if (future2 != null) {
            future2.cancel(false);
            this.mSignalEosTimeoutFuture = null;
        }
        MediaCodecCallback mediaCodecCallback = this.mMediaCodecCallback;
        if (mediaCodecCallback != null) {
            mediaCodecCallback.stop();
        }
        MediaCodecCallback mediaCodecCallback2 = new MediaCodecCallback();
        this.mMediaCodecCallback = mediaCodecCallback2;
        this.mMediaCodec.setCallback(mediaCodecCallback2);
        this.mMediaCodec.configure(this.mMediaFormat, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).resetSurface();
        }
    }

    private void setState(InternalState internalState) {
        if (this.mState == internalState) {
            return;
        }
        Logger.d(this.mTag, "Transitioning encoder internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfInputStream() {
        Futures.addCallback(acquireInputBuffer(), new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                EncoderImpl.this.handleEncodeError(0, "Unable to acquire InputBuffer.", th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(InputBuffer inputBuffer) {
                inputBuffer.setPresentationTimeUs(EncoderImpl.this.generatePresentationTimeUs());
                inputBuffer.setEndOfStream(true);
                inputBuffer.submit();
                Futures.addCallback(inputBuffer.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(@NonNull Throwable th2) {
                        if (th2 instanceof MediaCodec.CodecException) {
                            EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th2);
                        } else {
                            EncoderImpl.this.handleEncodeError(0, th2.getMessage(), th2);
                        }
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(@Nullable Void r12) {
                    }
                }, EncoderImpl.this.mEncoderExecutor);
            }
        }, this.mEncoderExecutor);
    }

    @NonNull
    public p1<InputBuffer> acquireInputBuffer() {
        switch (this.mState) {
            case CONFIGURED:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                p1<InputBuffer> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.h
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return EncoderImpl.q(atomicReference, completer);
                    }
                });
                final CallbackToFutureAdapter.Completer<InputBuffer> completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.mAcquisitionQueue.offer(completer);
                completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.this.mAcquisitionQueue.remove(completer);
                    }
                }, this.mEncoderExecutor);
                matchAcquisitionsAndFreeBufferIndexes();
                return future;
            case ERROR:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    public long generatePresentationTimeUs() {
        return this.mTimeProvider.uptimeUs();
    }

    public long getAdjustedTimeUs(@NonNull MediaCodec.BufferInfo bufferInfo) {
        long j11 = this.mTotalPausedDurationUs;
        return j11 > 0 ? bufferInfo.presentationTimeUs - j11 : bufferInfo.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public int getConfiguredBitrate() {
        if (this.mMediaFormat.containsKey(IjkMediaMeta.IJKM_KEY_BITRATE)) {
            return this.mMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_BITRATE);
        }
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public EncoderInfo getEncoderInfo() {
        return this.mEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public Encoder.EncoderInput getInput() {
        return this.mEncoderInput;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public p1<Void> getReleasedFuture() {
        return this.mReleasedFuture;
    }

    public void handleEncodeError(@NonNull MediaCodec.CodecException codecException) {
        handleEncodeError(1, codecException.getMessage(), codecException);
    }

    public void handleStopped() {
        InternalState internalState = this.mState;
        if (internalState == InternalState.PENDING_RELEASE) {
            releaseInternal();
            return;
        }
        if (!this.mIsFlushedAfterEndOfStream) {
            reset();
        }
        setState(InternalState.CONFIGURED);
        if (internalState == InternalState.PENDING_START || internalState == InternalState.PENDING_START_PAUSED) {
            start();
            if (internalState == InternalState.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    public boolean isInPauseRange(long j11) {
        for (Range<Long> range : this.mActivePauseResumeTimeRanges) {
            if (range.contains((Range<Long>) Long.valueOf(j11))) {
                return true;
            }
            if (j11 < range.getLower().longValue()) {
                break;
            }
        }
        return false;
    }

    public void matchAcquisitionsAndFreeBufferIndexes() {
        while (!this.mAcquisitionQueue.isEmpty() && !this.mFreeInputBufferIndexQueue.isEmpty()) {
            CallbackToFutureAdapter.Completer poll = this.mAcquisitionQueue.poll();
            Objects.requireNonNull(poll);
            Integer poll2 = this.mFreeInputBufferIndexQueue.poll();
            Objects.requireNonNull(poll2);
            try {
                final InputBufferImpl inputBufferImpl = new InputBufferImpl(this.mMediaCodec, poll2.intValue());
                if (poll.set(inputBufferImpl)) {
                    this.mInputBufferSet.add(inputBufferImpl);
                    inputBufferImpl.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.this.mInputBufferSet.remove(inputBufferImpl);
                        }
                    }, this.mEncoderExecutor);
                } else {
                    inputBufferImpl.cancel();
                }
            } catch (MediaCodec.CodecException e11) {
                handleEncodeError(e11);
                return;
            }
        }
    }

    public void notifyError(final int i11, @Nullable final String str, @Nullable final Throwable th2) {
        final EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.mLock) {
            encoderCallback = this.mEncoderCallback;
            executor = this.mEncoderCallbackExecutor;
        }
        try {
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.c
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderCallback.this.onEncodeError(new EncodeException(i11, str, th2));
                }
            });
        } catch (RejectedExecutionException e11) {
            Logger.e(this.mTag, "Unable to post to the supplied executor.", e11);
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
        final long generatePresentationTimeUs = generatePresentationTimeUs();
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.l
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.e(EncoderImpl.this, generatePresentationTimeUs);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.n
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.p(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.o
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.c(EncoderImpl.this);
            }
        });
    }

    public void requestKeyFrameToMediaCodec() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.mMediaCodec.setParameters(bundle);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(@NonNull EncoderCallback encoderCallback, @NonNull Executor executor) {
        synchronized (this.mLock) {
            this.mEncoderCallback = encoderCallback;
            this.mEncoderCallbackExecutor = executor;
        }
    }

    public void setMediaCodecPaused(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z11 ? 1 : 0);
        this.mMediaCodec.setParameters(bundle);
    }

    public void signalCodecStop() {
        Logger.d(this.mTag, "signalCodecStop");
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof ByteBufferInput) {
            ((ByteBufferInput) encoderInput).setActive(false);
            ArrayList arrayList = new ArrayList();
            Iterator<InputBuffer> it = this.mInputBufferSet.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTerminationFuture());
            }
            Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.s
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.this.signalEndOfInputStream();
                }
            }, this.mEncoderExecutor);
            return;
        }
        if (encoderInput instanceof SurfaceInput) {
            try {
                addSignalEosTimeoutIfNeeded();
                this.mMediaCodec.signalEndOfInputStream();
                this.mMediaCodecEosSignalled = true;
            } catch (MediaCodec.CodecException e11) {
                handleEncodeError(e11);
            }
        }
    }

    public void signalSourceStopped() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.i(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
        final long generatePresentationTimeUs = generatePresentationTimeUs();
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.d
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.l(EncoderImpl.this, generatePresentationTimeUs);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
        stop(-1L);
    }

    public void stopMediaCodec(@Nullable final Runnable runnable) {
        Logger.d(this.mTag, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<EncodedDataImpl> it = this.mEncodedDataSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClosedFuture());
        }
        Iterator<InputBuffer> it2 = this.mInputBufferSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTerminationFuture());
        }
        if (!arrayList.isEmpty()) {
            Logger.d(this.mTag, "Waiting for resources to return. encoded data = " + this.mEncodedDataSet.size() + ", input buffers = " + this.mInputBufferSet.size());
        }
        Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.o(EncoderImpl.this, arrayList, runnable);
            }
        }, this.mEncoderExecutor);
    }

    public void updateTotalPausedDuration(long j11) {
        while (!this.mActivePauseResumeTimeRanges.isEmpty()) {
            Range<Long> first = this.mActivePauseResumeTimeRanges.getFirst();
            if (j11 <= first.getUpper().longValue()) {
                return;
            }
            this.mActivePauseResumeTimeRanges.removeFirst();
            this.mTotalPausedDurationUs += first.getUpper().longValue() - first.getLower().longValue();
            Logger.d(this.mTag, "Total paused duration = " + DebugUtils.readableUs(this.mTotalPausedDurationUs));
        }
    }

    public void handleEncodeError(final int i11, @Nullable final String str, @Nullable final Throwable th2) {
        switch (this.mState) {
            case CONFIGURED:
                notifyError(i11, str, th2);
                reset();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                setState(InternalState.ERROR);
                stopMediaCodec(new Runnable() { // from class: androidx.camera.video.internal.encoder.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.this.notifyError(i11, str, th2);
                    }
                });
                break;
            case ERROR:
                Logger.w(this.mTag, "Get more than one error: " + str + pn.j.f81006c + i11 + pn.j.f81007d, th2);
                break;
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop(final long j11) {
        final long generatePresentationTimeUs = generatePresentationTimeUs();
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.e
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.k(EncoderImpl.this, j11, generatePresentationTimeUs);
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class MediaCodecCallback extends MediaCodec.Callback {
        private boolean mReachStopTimeAsEos;

        @Nullable
        private final VideoTimebaseConverter mVideoTimestampConverter;
        private boolean mHasSendStartCallback = false;
        private boolean mHasFirstData = false;
        private boolean mHasEndData = false;
        private long mLastPresentationTimeUs = 0;
        private long mLastSentAdjustedTimeUs = 0;
        private boolean mIsOutputBufferInPauseState = false;
        private boolean mIsKeyFrameRequired = false;
        private boolean mStopped = false;

        public MediaCodecCallback() {
            this.mReachStopTimeAsEos = true;
            if (EncoderImpl.this.mIsVideoEncoder) {
                this.mVideoTimestampConverter = new VideoTimebaseConverter(EncoderImpl.this.mTimeProvider, EncoderImpl.this.mInputTimebase, (CameraUseInconsistentTimebaseQuirk) DeviceQuirks.get(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.mVideoTimestampConverter = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) DeviceQuirks.get(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.isProblematicMimeType(EncoderImpl.this.mMediaFormat.getString(IMediaFormat.KEY_MIME))) {
                return;
            }
            this.mReachStopTimeAsEos = false;
        }

        public static /* synthetic */ void b(MediaCodecCallback mediaCodecCallback, Executor executor, final EncoderCallback encoderCallback) {
            if (EncoderImpl.this.mState == InternalState.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodeStop();
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
            }
        }

        private boolean checkBufferInfo(@NonNull MediaCodec.BufferInfo bufferInfo) {
            if (this.mHasEndData) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by codec config.");
                return false;
            }
            VideoTimebaseConverter videoTimebaseConverter = this.mVideoTimestampConverter;
            if (videoTimebaseConverter != null) {
                bufferInfo.presentationTimeUs = videoTimebaseConverter.convertToUptimeUs(bufferInfo.presentationTimeUs);
            }
            long j11 = bufferInfo.presentationTimeUs;
            if (j11 <= this.mLastPresentationTimeUs) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.mLastPresentationTimeUs = j11;
            if (!EncoderImpl.this.mStartStopTimeRangeUs.contains((Range<Long>) Long.valueOf(j11))) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by not in start-stop range.");
                EncoderImpl encoderImpl = EncoderImpl.this;
                if (encoderImpl.mPendingCodecStop && bufferInfo.presentationTimeUs >= encoderImpl.mStartStopTimeRangeUs.getUpper().longValue()) {
                    Future<?> future = EncoderImpl.this.mStopTimeoutFuture;
                    if (future != null) {
                        future.cancel(true);
                    }
                    EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                    EncoderImpl.this.signalCodecStop();
                    EncoderImpl.this.mPendingCodecStop = false;
                }
                return false;
            }
            if (updatePauseRangeStateAndCheckIfBufferPaused(bufferInfo)) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by pause.");
                return false;
            }
            if (EncoderImpl.this.getAdjustedTimeUs(bufferInfo) <= this.mLastSentAdjustedTimeUs) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by adjusted time is less than the last sent time.");
                if (EncoderImpl.this.mIsVideoEncoder && EncoderImpl.isKeyFrame(bufferInfo)) {
                    this.mIsKeyFrameRequired = true;
                }
                return false;
            }
            if (!this.mHasFirstData && !this.mIsKeyFrameRequired && EncoderImpl.this.mIsVideoEncoder) {
                this.mIsKeyFrameRequired = true;
            }
            if (this.mIsKeyFrameRequired) {
                if (!EncoderImpl.isKeyFrame(bufferInfo)) {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by not a key frame.");
                    EncoderImpl.this.requestKeyFrameToMediaCodec();
                    return false;
                }
                this.mIsKeyFrameRequired = false;
            }
            return true;
        }

        public static /* synthetic */ void e(MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i11) {
            final EncoderCallback encoderCallback;
            Executor executor;
            if (mediaCodecCallback.mStopped) {
                Logger.w(EncoderImpl.this.mTag, "Receives frame after codec is reset.");
                return;
            }
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (EncoderImpl.this.mLock) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.mEncoderCallback;
                        executor = encoderImpl.mEncoderCallbackExecutor;
                    }
                    if (!mediaCodecCallback.mHasSendStartCallback) {
                        mediaCodecCallback.mHasSendStartCallback = true;
                        try {
                            Objects.requireNonNull(encoderCallback);
                            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.i0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    EncoderCallback.this.onEncodeStart();
                                }
                            });
                        } catch (RejectedExecutionException e11) {
                            Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                        }
                    }
                    if (mediaCodecCallback.checkBufferInfo(bufferInfo)) {
                        if (!mediaCodecCallback.mHasFirstData) {
                            mediaCodecCallback.mHasFirstData = true;
                            Logger.d(EncoderImpl.this.mTag, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + EncoderImpl.this.mInputTimebase + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo resolveOutputBufferInfo = mediaCodecCallback.resolveOutputBufferInfo(bufferInfo);
                        mediaCodecCallback.mLastSentAdjustedTimeUs = resolveOutputBufferInfo.presentationTimeUs;
                        try {
                            mediaCodecCallback.sendEncodedData(new EncodedDataImpl(mediaCodec, i11, resolveOutputBufferInfo), encoderCallback, executor);
                        } catch (MediaCodec.CodecException e12) {
                            EncoderImpl.this.handleEncodeError(e12);
                            return;
                        }
                    } else {
                        try {
                            EncoderImpl.this.mMediaCodec.releaseOutputBuffer(i11, false);
                        } catch (MediaCodec.CodecException e13) {
                            EncoderImpl.this.handleEncodeError(e13);
                            return;
                        }
                    }
                    if (mediaCodecCallback.mHasEndData || !mediaCodecCallback.isEndOfStream(bufferInfo)) {
                        return;
                    }
                    mediaCodecCallback.reachEndData();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        public static /* synthetic */ void f(MediaCodecCallback mediaCodecCallback, final MediaFormat mediaFormat) {
            final EncoderCallback encoderCallback;
            Executor executor;
            if (mediaCodecCallback.mStopped) {
                Logger.w(EncoderImpl.this.mTag, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (EncoderImpl.this.mLock) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.mEncoderCallback;
                        executor = encoderImpl.mEncoderCallbackExecutor;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.m0
                            @Override // java.lang.Runnable
                            public final void run() {
                                EncoderCallback.this.onOutputConfigUpdate(new OutputConfig() { // from class: androidx.camera.video.internal.encoder.l0
                                    @Override // androidx.camera.video.internal.encoder.OutputConfig
                                    public final MediaFormat getMediaFormat() {
                                        return EncoderImpl.MediaCodecCallback.a(r1);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e11) {
                        Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        public static /* synthetic */ void g(MediaCodecCallback mediaCodecCallback, int i11) {
            if (mediaCodecCallback.mStopped) {
                Logger.w(EncoderImpl.this.mTag, "Receives input frame after codec is reset.");
                return;
            }
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    EncoderImpl.this.mFreeInputBufferIndexQueue.offer(Integer.valueOf(i11));
                    EncoderImpl.this.matchAcquisitionsAndFreeBufferIndexes();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        public static /* synthetic */ void h(MediaCodecCallback mediaCodecCallback, MediaCodec.CodecException codecException) {
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    EncoderImpl.this.handleEncodeError(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        private boolean isEndOfStream(@NonNull MediaCodec.BufferInfo bufferInfo) {
            if (EncoderImpl.hasEndOfStreamFlag(bufferInfo)) {
                return true;
            }
            return this.mReachStopTimeAsEos && isEosSignalledAndStopTimeReached(bufferInfo);
        }

        private boolean isEosSignalledAndStopTimeReached(@NonNull MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            return encoderImpl.mMediaCodecEosSignalled && bufferInfo.presentationTimeUs > encoderImpl.mStartStopTimeRangeUs.getUpper().longValue();
        }

        @NonNull
        private MediaCodec.BufferInfo resolveOutputBufferInfo(@NonNull MediaCodec.BufferInfo bufferInfo) {
            long adjustedTimeUs = EncoderImpl.this.getAdjustedTimeUs(bufferInfo);
            if (bufferInfo.presentationTimeUs == adjustedTimeUs) {
                return bufferInfo;
            }
            Preconditions.checkState(adjustedTimeUs > this.mLastSentAdjustedTimeUs);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, adjustedTimeUs, bufferInfo.flags);
            return bufferInfo2;
        }

        private void sendEncodedData(@NonNull final EncodedDataImpl encodedDataImpl, @NonNull final EncoderCallback encoderCallback, @NonNull Executor executor) {
            EncoderImpl.this.mEncodedDataSet.add(encodedDataImpl);
            Futures.addCallback(encodedDataImpl.getClosedFuture(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@NonNull Throwable th2) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                    if (th2 instanceof MediaCodec.CodecException) {
                        EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th2);
                    } else {
                        EncoderImpl.this.handleEncodeError(0, th2.getMessage(), th2);
                    }
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(@Nullable Void r22) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                }
            }, EncoderImpl.this.mEncoderExecutor);
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodedData(encodedDataImpl);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                encodedDataImpl.close();
            }
        }

        private boolean updatePauseRangeStateAndCheckIfBufferPaused(@NonNull MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final EncoderCallback encoderCallback;
            EncoderImpl.this.updateTotalPausedDuration(bufferInfo.presentationTimeUs);
            boolean isInPauseRange = EncoderImpl.this.isInPauseRange(bufferInfo.presentationTimeUs);
            boolean z11 = this.mIsOutputBufferInPauseState;
            if (!z11 && isInPauseRange) {
                Logger.d(EncoderImpl.this.mTag, "Switch to pause state");
                this.mIsOutputBufferInPauseState = true;
                synchronized (EncoderImpl.this.mLock) {
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    executor = encoderImpl.mEncoderCallbackExecutor;
                    encoderCallback = encoderImpl.mEncoderCallback;
                }
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodePaused();
                    }
                });
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (encoderImpl2.mState == InternalState.PAUSED && ((encoderImpl2.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    Encoder.EncoderInput encoderInput = EncoderImpl.this.mEncoderInput;
                    if (encoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput).setActive(false);
                    }
                    EncoderImpl.this.setMediaCodecPaused(true);
                }
                EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                EncoderImpl encoderImpl3 = EncoderImpl.this;
                if (encoderImpl3.mPendingCodecStop) {
                    Future<?> future = encoderImpl3.mStopTimeoutFuture;
                    if (future != null) {
                        future.cancel(true);
                    }
                    EncoderImpl.this.signalCodecStop();
                    EncoderImpl.this.mPendingCodecStop = false;
                }
            } else if (z11 && !isInPauseRange) {
                Logger.d(EncoderImpl.this.mTag, "Switch to resume state");
                this.mIsOutputBufferInPauseState = false;
                if (EncoderImpl.this.mIsVideoEncoder && !EncoderImpl.isKeyFrame(bufferInfo)) {
                    this.mIsKeyFrameRequired = true;
                }
            }
            return this.mIsOutputBufferInPauseState;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(@NonNull MediaCodec mediaCodec, @NonNull final MediaCodec.CodecException codecException) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.o0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.h(EncoderImpl.MediaCodecCallback.this, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, final int i11) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.e0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.g(EncoderImpl.MediaCodecCallback.this, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(@NonNull final MediaCodec mediaCodec, final int i11, @NonNull final MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.e(EncoderImpl.MediaCodecCallback.this, bufferInfo, mediaCodec, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull final MediaFormat mediaFormat) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.f(EncoderImpl.MediaCodecCallback.this, mediaFormat);
                }
            });
        }

        public void reachEndData() {
            EncoderImpl encoderImpl;
            final EncoderCallback encoderCallback;
            final Executor executor;
            if (this.mHasEndData) {
                return;
            }
            this.mHasEndData = true;
            if (EncoderImpl.this.mSignalEosTimeoutFuture != null) {
                EncoderImpl.this.mSignalEosTimeoutFuture.cancel(false);
                EncoderImpl.this.mSignalEosTimeoutFuture = null;
            }
            synchronized (EncoderImpl.this.mLock) {
                encoderImpl = EncoderImpl.this;
                encoderCallback = encoderImpl.mEncoderCallback;
                executor = encoderImpl.mEncoderCallbackExecutor;
            }
            encoderImpl.stopMediaCodec(new Runnable() { // from class: androidx.camera.video.internal.encoder.j0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.b(EncoderImpl.MediaCodecCallback.this, executor, encoderCallback);
                }
            });
        }

        public void stop() {
            this.mStopped = true;
        }

        public static /* synthetic */ MediaFormat a(MediaFormat mediaFormat) {
            return mediaFormat;
        }
    }
}
