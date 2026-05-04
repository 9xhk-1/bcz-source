package androidx.camera.video;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.p1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class VideoEncoderSession {
    private static final String TAG = "VideoEncoderSession";
    private final Executor mExecutor;
    private final Executor mSequentialExecutor;
    private final EncoderFactory mVideoEncoderFactory;
    private Encoder mVideoEncoder = null;
    private Surface mActiveSurface = null;
    private SurfaceRequest mSurfaceRequest = null;
    private Executor mOnSurfaceUpdateExecutor = null;
    private Encoder.SurfaceInput.OnSurfaceUpdateListener mOnSurfaceUpdateListener = null;
    private VideoEncoderState mVideoEncoderState = VideoEncoderState.NOT_INITIALIZED;
    private p1<Void> mReleasedFuture = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));
    private CallbackToFutureAdapter.Completer<Void> mReleasedCompleter = null;
    private p1<Encoder> mReadyToReleaseFuture = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));
    private CallbackToFutureAdapter.Completer<Encoder> mReadyToReleaseCompleter = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum VideoEncoderState {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public VideoEncoderSession(@NonNull EncoderFactory encoderFactory, @NonNull Executor executor, @NonNull Executor executor2) {
        this.mExecutor = executor2;
        this.mSequentialExecutor = executor;
        this.mVideoEncoderFactory = encoderFactory;
    }

    public static /* synthetic */ Object a(VideoEncoderSession videoEncoderSession, SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, CallbackToFutureAdapter.Completer completer) {
        videoEncoderSession.configureVideoEncoderInternal(surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
        return "ConfigureVideoEncoderFuture " + videoEncoderSession;
    }

    private void closeInternal() {
        int ordinal = this.mVideoEncoderState.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            terminateNow();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            Logger.d(TAG, "closeInternal in " + this.mVideoEncoderState + " state");
            this.mVideoEncoderState = VideoEncoderState.PENDING_RELEASE;
            return;
        }
        if (ordinal == 4) {
            Logger.d(TAG, "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
    }

    private void configureVideoEncoderInternal(@NonNull final SurfaceRequest surfaceRequest, @NonNull Timebase timebase, @Nullable VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, @NonNull MediaSpec mediaSpec, @NonNull final CallbackToFutureAdapter.Completer<Encoder> completer) {
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        try {
            Encoder createEncoder = this.mVideoEncoderFactory.createEncoder(this.mExecutor, VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), timebase, mediaSpec.getVideoSpec(), surfaceRequest.getResolution(), dynamicRange, surfaceRequest.getExpectedFrameRate()));
            this.mVideoEncoder = createEncoder;
            Encoder.EncoderInput input = createEncoder.getInput();
            if (input instanceof Encoder.SurfaceInput) {
                ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(this.mSequentialExecutor, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.q0
                    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
                    public final void onSurfaceUpdate(Surface surface) {
                        VideoEncoderSession.g(VideoEncoderSession.this, completer, surfaceRequest, surface);
                    }
                });
            } else {
                completer.setException(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e11) {
            Logger.e(TAG, "Unable to initialize video encoder.", e11);
            completer.setException(e11);
        }
    }

    public static /* synthetic */ Object d(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        videoEncoderSession.mReleasedCompleter = completer;
        return "ReleasedFuture " + videoEncoderSession;
    }

    public static /* synthetic */ Object f(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        videoEncoderSession.mReadyToReleaseCompleter = completer;
        return "ReadyToReleaseFuture " + videoEncoderSession;
    }

    public static /* synthetic */ void g(final VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer, SurfaceRequest surfaceRequest, final Surface surface) {
        Executor executor;
        int ordinal = videoEncoderSession.mVideoEncoderState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (surfaceRequest.isServiced()) {
                    Logger.d(TAG, "Not provide surface, " + Objects.toString(surfaceRequest, "EMPTY") + " is already serviced.");
                    completer.set(null);
                    videoEncoderSession.closeInternal();
                    return;
                }
                videoEncoderSession.mActiveSurface = surface;
                Logger.d(TAG, "provide surface: " + surface);
                surfaceRequest.provideSurface(surface, videoEncoderSession.mSequentialExecutor, new Consumer() { // from class: androidx.camera.video.v0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        VideoEncoderSession.this.onSurfaceRequestComplete((SurfaceRequest.Result) obj);
                    }
                });
                videoEncoderSession.mVideoEncoderState = VideoEncoderState.READY;
                completer.set(videoEncoderSession.mVideoEncoder);
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (videoEncoderSession.mOnSurfaceUpdateListener != null && (executor = videoEncoderSession.mOnSurfaceUpdateExecutor) != null) {
                        executor.execute(new Runnable() { // from class: androidx.camera.video.w0
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoEncoderSession.this.mOnSurfaceUpdateListener.onSurfaceUpdate(surface);
                            }
                        });
                    }
                    Logger.w(TAG, "Surface is updated in READY state: " + surface);
                    return;
                }
                if (ordinal != 4) {
                    throw new IllegalStateException("State " + videoEncoderSession.mVideoEncoderState + " is not handled");
                }
            }
        }
        Logger.d(TAG, "Not provide surface in " + videoEncoderSession.mVideoEncoderState);
        completer.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceRequestComplete(@NonNull SurfaceRequest.Result result) {
        Logger.d(TAG, "Surface can be closed: " + result.getSurface().hashCode());
        Surface surface = result.getSurface();
        if (surface != this.mActiveSurface) {
            surface.release();
            return;
        }
        this.mActiveSurface = null;
        this.mReadyToReleaseCompleter.set(this.mVideoEncoder);
        closeInternal();
    }

    @NonNull
    public p1<Encoder> configure(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase, @NonNull final MediaSpec mediaSpec, @Nullable final VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        if (this.mVideoEncoderState.ordinal() != 0) {
            return Futures.immediateFailedFuture(new IllegalStateException("configure() shouldn't be called in " + this.mVideoEncoderState));
        }
        this.mVideoEncoderState = VideoEncoderState.INITIALIZING;
        this.mSurfaceRequest = surfaceRequest;
        Logger.d(TAG, "Create VideoEncoderSession: " + this);
        this.mReleasedFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.s0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.d(VideoEncoderSession.this, completer);
            }
        });
        this.mReadyToReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.t0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.f(VideoEncoderSession.this, completer);
            }
        });
        p1 future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.u0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.a(VideoEncoderSession.this, surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
            }
        });
        Futures.addCallback(future, new FutureCallback<Encoder>() { // from class: androidx.camera.video.VideoEncoderSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Logger.w(VideoEncoderSession.TAG, "VideoEncoder configuration failed.", th2);
                VideoEncoderSession.this.terminateNow();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Encoder encoder) {
            }
        }, this.mSequentialExecutor);
        return Futures.nonCancellationPropagating(future);
    }

    @Nullable
    public Surface getActiveSurface() {
        if (this.mVideoEncoderState != VideoEncoderState.READY) {
            return null;
        }
        return this.mActiveSurface;
    }

    @NonNull
    public p1<Encoder> getReadyToReleaseFuture() {
        return Futures.nonCancellationPropagating(this.mReadyToReleaseFuture);
    }

    @Nullable
    public Encoder getVideoEncoder() {
        return this.mVideoEncoder;
    }

    public boolean isConfiguredSurfaceRequest(@NonNull SurfaceRequest surfaceRequest) {
        int ordinal = this.mVideoEncoderState.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
                        }
                    }
                }
            }
            if (this.mSurfaceRequest == surfaceRequest) {
                return true;
            }
        }
        return false;
    }

    public void setOnSurfaceUpdateListener(@NonNull Executor executor, @NonNull Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
        this.mOnSurfaceUpdateExecutor = executor;
        this.mOnSurfaceUpdateListener = onSurfaceUpdateListener;
    }

    @NonNull
    public p1<Void> signalTermination() {
        closeInternal();
        return Futures.nonCancellationPropagating(this.mReleasedFuture);
    }

    public void terminateNow() {
        int ordinal = this.mVideoEncoderState.ordinal();
        if (ordinal == 0) {
            this.mVideoEncoderState = VideoEncoderState.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
            }
            Logger.d(TAG, "terminateNow in " + this.mVideoEncoderState + ", No-op");
            return;
        }
        this.mVideoEncoderState = VideoEncoderState.RELEASED;
        this.mReadyToReleaseCompleter.set(this.mVideoEncoder);
        this.mSurfaceRequest = null;
        if (this.mVideoEncoder == null) {
            Logger.w(TAG, "There's no VideoEncoder to release! Finish release completer.");
            this.mReleasedCompleter.set(null);
            return;
        }
        Logger.d(TAG, "VideoEncoder is releasing: " + this.mVideoEncoder);
        this.mVideoEncoder.release();
        this.mVideoEncoder.getReleasedFuture().addListener(new Runnable() { // from class: androidx.camera.video.r0
            @Override // java.lang.Runnable
            public final void run() {
                VideoEncoderSession.this.mReleasedCompleter.set(null);
            }
        }, this.mSequentialExecutor);
        this.mVideoEncoder = null;
    }

    @NonNull
    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.mSurfaceRequest, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
