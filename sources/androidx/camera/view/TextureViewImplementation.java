package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class TextureViewImplementation extends PreviewViewImplementation {
    private static final String TAG = "TextureViewImpl";
    SurfaceTexture mDetachedSurfaceTexture;

    @Nullable
    Executor mFrameUpdateExecutor;
    boolean mIsSurfaceTextureDetachedFromView;
    AtomicReference<CallbackToFutureAdapter.Completer<Void>> mNextFrameCompleter;

    @Nullable
    PreviewView.OnFrameUpdateListener mOnFrameUpdateListener;

    @Nullable
    PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;
    p1<SurfaceRequest.Result> mSurfaceReleaseFuture;
    SurfaceRequest mSurfaceRequest;
    SurfaceTexture mSurfaceTexture;
    TextureView mTextureView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.camera.view.TextureViewImplementation$1, reason: invalid class name */
    public class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        public AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
            Logger.d(TextureViewImplementation.TAG, "SurfaceTexture available. Size: " + i11 + "x" + i12);
            TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
            textureViewImplementation.mSurfaceTexture = surfaceTexture;
            if (textureViewImplementation.mSurfaceReleaseFuture == null) {
                textureViewImplementation.tryToProvidePreviewSurface();
                return;
            }
            Preconditions.checkNotNull(textureViewImplementation.mSurfaceRequest);
            Logger.d(TextureViewImplementation.TAG, "Surface invalidated " + TextureViewImplementation.this.mSurfaceRequest);
            TextureViewImplementation.this.mSurfaceRequest.getDeferrableSurface().close();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull final SurfaceTexture surfaceTexture) {
            TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
            textureViewImplementation.mSurfaceTexture = null;
            p1<SurfaceRequest.Result> p1Var = textureViewImplementation.mSurfaceReleaseFuture;
            if (p1Var == null) {
                Logger.d(TextureViewImplementation.TAG, "SurfaceTexture about to be destroyed");
                return true;
            }
            Futures.addCallback(p1Var, new FutureCallback<SurfaceRequest.Result>() { // from class: androidx.camera.view.TextureViewImplementation.1.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@NonNull Throwable th2) {
                    throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(SurfaceRequest.Result result) {
                    Preconditions.checkState(result.getResultCode() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                    Logger.d(TextureViewImplementation.TAG, "SurfaceTexture about to manually be destroyed");
                    surfaceTexture.release();
                    TextureViewImplementation textureViewImplementation2 = TextureViewImplementation.this;
                    if (textureViewImplementation2.mDetachedSurfaceTexture != null) {
                        textureViewImplementation2.mDetachedSurfaceTexture = null;
                    }
                }
            }, ContextCompat.getMainExecutor(TextureViewImplementation.this.mTextureView.getContext()));
            TextureViewImplementation.this.mDetachedSurfaceTexture = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
            Logger.d(TextureViewImplementation.TAG, "SurfaceTexture size changed: " + i11 + "x" + i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull final SurfaceTexture surfaceTexture) {
            CallbackToFutureAdapter.Completer<Void> andSet = TextureViewImplementation.this.mNextFrameCompleter.getAndSet(null);
            if (andSet != null) {
                andSet.set(null);
            }
            TextureViewImplementation textureViewImplementation = TextureViewImplementation.this;
            final PreviewView.OnFrameUpdateListener onFrameUpdateListener = textureViewImplementation.mOnFrameUpdateListener;
            Executor executor = textureViewImplementation.mFrameUpdateExecutor;
            if (onFrameUpdateListener == null || executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.camera.view.h0
                @Override // java.lang.Runnable
                public final void run() {
                    PreviewView.OnFrameUpdateListener.this.onFrameUpdate(surfaceTexture.getTimestamp());
                }
            });
        }
    }

    public TextureViewImplementation(@NonNull FrameLayout frameLayout, @NonNull PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.mIsSurfaceTextureDetachedFromView = false;
        this.mNextFrameCompleter = new AtomicReference<>();
    }

    public static /* synthetic */ Object a(TextureViewImplementation textureViewImplementation, Surface surface, final CallbackToFutureAdapter.Completer completer) {
        textureViewImplementation.getClass();
        Logger.d(TAG, "Surface set on Preview.");
        SurfaceRequest surfaceRequest = textureViewImplementation.mSurfaceRequest;
        Executor directExecutor = CameraXExecutors.directExecutor();
        Objects.requireNonNull(completer);
        surfaceRequest.provideSurface(surface, directExecutor, new Consumer() { // from class: androidx.camera.view.e0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CallbackToFutureAdapter.Completer.this.set((SurfaceRequest.Result) obj);
            }
        });
        return "provideSurface[request=" + textureViewImplementation.mSurfaceRequest + " surface=" + surface + "]";
    }

    public static /* synthetic */ void b(TextureViewImplementation textureViewImplementation, Surface surface, p1 p1Var, SurfaceRequest surfaceRequest) {
        textureViewImplementation.getClass();
        Logger.d(TAG, "Safe to release surface.");
        textureViewImplementation.notifySurfaceNotInUse();
        surface.release();
        if (textureViewImplementation.mSurfaceReleaseFuture == p1Var) {
            textureViewImplementation.mSurfaceReleaseFuture = null;
        }
        if (textureViewImplementation.mSurfaceRequest == surfaceRequest) {
            textureViewImplementation.mSurfaceRequest = null;
        }
    }

    public static /* synthetic */ void c(TextureViewImplementation textureViewImplementation, SurfaceRequest surfaceRequest) {
        SurfaceRequest surfaceRequest2 = textureViewImplementation.mSurfaceRequest;
        if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
            textureViewImplementation.mSurfaceRequest = null;
            textureViewImplementation.mSurfaceReleaseFuture = null;
        }
        textureViewImplementation.notifySurfaceNotInUse();
    }

    public static /* synthetic */ Object d(TextureViewImplementation textureViewImplementation, CallbackToFutureAdapter.Completer completer) {
        textureViewImplementation.mNextFrameCompleter.set(completer);
        return "textureViewImpl_waitForNextFrame";
    }

    private void notifySurfaceNotInUse() {
        PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = this.mOnSurfaceNotInUseListener;
        if (onSurfaceNotInUseListener != null) {
            onSurfaceNotInUseListener.onSurfaceNotInUse();
            this.mOnSurfaceNotInUseListener = null;
        }
    }

    private void reattachSurfaceTexture() {
        if (!this.mIsSurfaceTextureDetachedFromView || this.mDetachedSurfaceTexture == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.mTextureView.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.mDetachedSurfaceTexture;
        if (surfaceTexture != surfaceTexture2) {
            this.mTextureView.setSurfaceTexture(surfaceTexture2);
            this.mDetachedSurfaceTexture = null;
            this.mIsSurfaceTextureDetachedFromView = false;
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @Nullable
    public View getPreview() {
        return this.mTextureView;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @Nullable
    public Bitmap getPreviewBitmap() {
        TextureView textureView = this.mTextureView;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.mTextureView.getBitmap();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void initializePreview() {
        Preconditions.checkNotNull(this.mParent);
        Preconditions.checkNotNull(this.mResolution);
        TextureView textureView = new TextureView(this.mParent.getContext());
        this.mTextureView = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mTextureView.setSurfaceTextureListener(new AnonymousClass1());
        this.mParent.removeAllViews();
        this.mParent.addView(this.mTextureView);
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void onAttachedToWindow() {
        reattachSurfaceTexture();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void onDetachedFromWindow() {
        this.mIsSurfaceTextureDetachedFromView = true;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void onSurfaceRequested(@NonNull final SurfaceRequest surfaceRequest, @Nullable PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        this.mResolution = surfaceRequest.getResolution();
        this.mOnSurfaceNotInUseListener = onSurfaceNotInUseListener;
        initializePreview();
        SurfaceRequest surfaceRequest2 = this.mSurfaceRequest;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.mSurfaceRequest = surfaceRequest;
        surfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.mTextureView.getContext()), new Runnable() { // from class: androidx.camera.view.d0
            @Override // java.lang.Runnable
            public final void run() {
                TextureViewImplementation.c(TextureViewImplementation.this, surfaceRequest);
            }
        });
        tryToProvidePreviewSurface();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void setFrameUpdateListener(@NonNull Executor executor, @NonNull PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        this.mOnFrameUpdateListener = onFrameUpdateListener;
        this.mFrameUpdateExecutor = executor;
    }

    public void tryToProvidePreviewSurface() {
        SurfaceTexture surfaceTexture;
        Size size = this.mResolution;
        if (size == null || (surfaceTexture = this.mSurfaceTexture) == null || this.mSurfaceRequest == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.mResolution.getHeight());
        final Surface surface = new Surface(this.mSurfaceTexture);
        final SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        final p1<SurfaceRequest.Result> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.f0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return TextureViewImplementation.a(TextureViewImplementation.this, surface, completer);
            }
        });
        this.mSurfaceReleaseFuture = future;
        future.addListener(new Runnable() { // from class: androidx.camera.view.g0
            @Override // java.lang.Runnable
            public final void run() {
                TextureViewImplementation.b(TextureViewImplementation.this, surface, future, surfaceRequest);
            }
        }, ContextCompat.getMainExecutor(this.mTextureView.getContext()));
        onSurfaceProvided();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @NonNull
    public p1<Void> waitForNextFrame() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.c0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return TextureViewImplementation.d(TextureViewImplementation.this, completer);
            }
        });
    }
}
