package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class MeteringRepeatingSession {
    private static final int IMAGE_FORMAT = 34;
    private static final String TAG = "MeteringRepeating";
    private DeferrableSurface mDeferrableSurface;

    @NonNull
    private final Size mMeteringRepeatingSize;

    @NonNull
    private SessionConfig mSessionConfig;

    @Nullable
    private final SurfaceResetCallback mSurfaceResetCallback;

    @NonNull
    private final SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize = new SupportedRepeatingSurfaceSize();

    @Nullable
    private SessionConfig.CloseableErrorListener mCloseableErrorListener = null;

    @NonNull
    private final MeteringRepeatingConfig mConfigWithDefaults = new MeteringRepeatingConfig();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {

        @NonNull
        private final Config mConfig;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new Camera2SessionOptionUnpacker());
            create.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
            setTargetConfigs(create);
            this.mConfig = create;
        }

        private void setTargetConfigs(MutableOptionsBundle mutableOptionsBundle) {
            mutableOptionsBundle.insertOption(TargetConfig.OPTION_TARGET_CLASS, MeteringRepeatingSession.class);
            mutableOptionsBundle.insertOption(TargetConfig.OPTION_TARGET_NAME, MeteringRepeatingSession.class.getCanonicalName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        @NonNull
        public UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        @NonNull
        public Config getConfig() {
            return this.mConfig;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SurfaceResetCallback {
        void onSurfaceReset();
    }

    public MeteringRepeatingSession(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull DisplayInfoManager displayInfoManager, @Nullable SurfaceResetCallback surfaceResetCallback) {
        this.mSurfaceResetCallback = surfaceResetCallback;
        Size properPreviewSize = getProperPreviewSize(cameraCharacteristicsCompat, displayInfoManager);
        this.mMeteringRepeatingSize = properPreviewSize;
        Logger.d(TAG, "MeteringSession SurfaceTexture size: " + properPreviewSize);
        this.mSessionConfig = createSessionConfig();
    }

    public static /* synthetic */ void a(MeteringRepeatingSession meteringRepeatingSession, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        meteringRepeatingSession.mSessionConfig = meteringRepeatingSession.createSessionConfig();
        SurfaceResetCallback surfaceResetCallback = meteringRepeatingSession.mSurfaceResetCallback;
        if (surfaceResetCallback != null) {
            surfaceResetCallback.onSurfaceReset();
        }
    }

    @NonNull
    private Size getProperPreviewSize(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull DisplayInfoManager displayInfoManager) {
        Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes == null) {
            Logger.e(TAG, "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.mSupportedRepeatingSurfaceSize.getSupportedSizes(outputSizes);
        List asList = Arrays.asList(supportedSizes);
        Collections.sort(asList, new Comparator() { // from class: androidx.camera.camera2.internal.b3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int signum;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                return signum;
            }
        });
        Size previewSize = displayInfoManager.getPreviewSize();
        long min = Math.min(previewSize.getWidth() * previewSize.getHeight(), 307200L);
        int length = supportedSizes.length;
        Size size = null;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Size size2 = supportedSizes[i11];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i11++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    public void clear() {
        Logger.d(TAG, "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    @NonNull
    public SessionConfig createSessionConfig() {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.mMeteringRepeatingSize.getWidth(), this.mMeteringRepeatingSize.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.mConfigWithDefaults, this.mMeteringRepeatingSize);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r12) {
                surface.release();
                surfaceTexture.release();
            }
        }, CameraXExecutors.directExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.camera2.internal.a3
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                MeteringRepeatingSession.a(MeteringRepeatingSession.this, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        createFrom.setErrorListener(closeableErrorListener2);
        return createFrom.build();
    }

    @NonNull
    public Size getMeteringRepeatingSize() {
        return this.mMeteringRepeatingSize;
    }

    @NonNull
    public String getName() {
        return TAG;
    }

    @NonNull
    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    @NonNull
    public UseCaseConfig<?> getUseCaseConfig() {
        return this.mConfigWithDefaults;
    }
}
