package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SurfaceEdge {
    private final Rect mCropRect;
    private final int mFormat;
    private final boolean mHasCameraTransform;
    private final boolean mMirroring;

    @Nullable
    private SurfaceRequest mProviderSurfaceRequest;
    private int mRotationDegrees;
    private final Matrix mSensorToBufferTransform;

    @NonNull
    private SettableSurface mSettableSurface;
    private final StreamSpec mStreamSpec;
    private int mTargetRotation;
    private final int mTargets;
    private boolean mHasConsumer = false;

    @NonNull
    private final Set<Runnable> mOnInvalidatedListeners = new HashSet();
    private boolean mIsClosed = false;
    private final List<Consumer<SurfaceRequest.TransformationInfo>> mTransformationUpdatesListeners = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SettableSurface extends DeferrableSurface {
        CallbackToFutureAdapter.Completer<Surface> mCompleter;

        @Nullable
        private SurfaceOutputImpl mConsumer;
        private DeferrableSurface mProvider;
        final p1<Surface> mSurfaceFuture;

        public SettableSurface(@NonNull Size size, int i11) {
            super(size, i11);
            this.mSurfaceFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.b0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return SurfaceEdge.SettableSurface.e(SurfaceEdge.SettableSurface.this, completer);
                }
            });
        }

        public static /* synthetic */ void d(SettableSurface settableSurface) {
            SurfaceOutputImpl surfaceOutputImpl = settableSurface.mConsumer;
            if (surfaceOutputImpl != null) {
                surfaceOutputImpl.requestClose();
            }
            if (settableSurface.mProvider == null) {
                settableSurface.mCompleter.setCancelled();
            }
        }

        public static /* synthetic */ Object e(SettableSurface settableSurface, CallbackToFutureAdapter.Completer completer) {
            settableSurface.mCompleter = completer;
            return "SettableFuture hashCode: " + settableSurface.hashCode();
        }

        @MainThread
        public boolean canSetProvider() {
            Threads.checkMainThread();
            return this.mProvider == null && !isClosed();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void close() {
            super.close();
            Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.z
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceEdge.SettableSurface.d(SurfaceEdge.SettableSurface.this);
                }
            });
        }

        @VisibleForTesting
        public boolean hasProvider() {
            return this.mProvider != null;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @NonNull
        public p1<Surface> provideSurface() {
            return this.mSurfaceFuture;
        }

        @MainThread
        public void setConsumer(@NonNull SurfaceOutputImpl surfaceOutputImpl) {
            Preconditions.checkState(this.mConsumer == null, "Consumer can only be linked once.");
            this.mConsumer = surfaceOutputImpl;
        }

        @MainThread
        public boolean setProvider(@NonNull final DeferrableSurface deferrableSurface, @NonNull Runnable runnable) throws DeferrableSurface.SurfaceClosedException {
            Threads.checkMainThread();
            Preconditions.checkNotNull(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.mProvider;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            Preconditions.checkState(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            Preconditions.checkArgument(getPrescribedSize().equals(deferrableSurface.getPrescribedSize()), String.format("The provider's size(%s) must match the parent(%s)", getPrescribedSize(), deferrableSurface.getPrescribedSize()));
            Preconditions.checkArgument(getPrescribedStreamFormat() == deferrableSurface.getPrescribedStreamFormat(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(getPrescribedStreamFormat()), Integer.valueOf(deferrableSurface.getPrescribedStreamFormat())));
            Preconditions.checkState(!isClosed(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.mProvider = deferrableSurface;
            Futures.propagate(deferrableSurface.getSurface(), this.mCompleter);
            deferrableSurface.incrementUseCount();
            getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.processing.a0
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.this.decrementUseCount();
                }
            }, CameraXExecutors.directExecutor());
            deferrableSurface.getCloseFuture().addListener(runnable, CameraXExecutors.mainThreadExecutor());
            return true;
        }
    }

    public SurfaceEdge(int i11, int i12, @NonNull StreamSpec streamSpec, @NonNull Matrix matrix, boolean z11, @NonNull Rect rect, int i13, int i14, boolean z12) {
        this.mTargets = i11;
        this.mFormat = i12;
        this.mStreamSpec = streamSpec;
        this.mSensorToBufferTransform = matrix;
        this.mHasCameraTransform = z11;
        this.mCropRect = rect;
        this.mRotationDegrees = i13;
        this.mTargetRotation = i14;
        this.mMirroring = z12;
        this.mSettableSurface = new SettableSurface(streamSpec.getResolution(), i12);
    }

    public static /* synthetic */ void a(final SurfaceEdge surfaceEdge) {
        surfaceEdge.getClass();
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.processing.y
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.b(SurfaceEdge.this);
            }
        });
    }

    public static /* synthetic */ void b(SurfaceEdge surfaceEdge) {
        if (surfaceEdge.mIsClosed) {
            return;
        }
        surfaceEdge.invalidate();
    }

    public static /* synthetic */ void c(SurfaceEdge surfaceEdge, int i11, int i12) {
        boolean z11;
        boolean z12 = true;
        if (surfaceEdge.mRotationDegrees != i11) {
            surfaceEdge.mRotationDegrees = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        if (surfaceEdge.mTargetRotation != i12) {
            surfaceEdge.mTargetRotation = i12;
        } else {
            z12 = z11;
        }
        if (z12) {
            surfaceEdge.notifyTransformationInfoUpdate();
        }
    }

    private void checkAndSetHasConsumer() {
        Preconditions.checkState(!this.mHasConsumer, "Consumer can only be linked once.");
        this.mHasConsumer = true;
    }

    private void checkNotClosed() {
        Preconditions.checkState(!this.mIsClosed, "Edge is already closed.");
    }

    public static /* synthetic */ p1 d(SurfaceEdge surfaceEdge, final SettableSurface settableSurface, int i11, SurfaceOutput.CameraInputInfo cameraInputInfo, SurfaceOutput.CameraInputInfo cameraInputInfo2, Surface surface) {
        surfaceEdge.getClass();
        Preconditions.checkNotNull(surface);
        try {
            settableSurface.incrementUseCount();
            SurfaceOutputImpl surfaceOutputImpl = new SurfaceOutputImpl(surface, surfaceEdge.getTargets(), i11, surfaceEdge.mStreamSpec.getResolution(), cameraInputInfo, cameraInputInfo2, surfaceEdge.mSensorToBufferTransform);
            surfaceOutputImpl.getCloseFuture().addListener(new Runnable() { // from class: androidx.camera.core.processing.x
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceEdge.SettableSurface.this.decrementUseCount();
                }
            }, CameraXExecutors.directExecutor());
            settableSurface.setConsumer(surfaceOutputImpl);
            return Futures.immediateFuture(surfaceOutputImpl);
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            return Futures.immediateFailedFuture(e11);
        }
    }

    @MainThread
    private void notifyTransformationInfoUpdate() {
        Threads.checkMainThread();
        SurfaceRequest.TransformationInfo of2 = SurfaceRequest.TransformationInfo.of(this.mCropRect, this.mRotationDegrees, this.mTargetRotation, hasCameraTransform(), this.mSensorToBufferTransform, this.mMirroring);
        SurfaceRequest surfaceRequest = this.mProviderSurfaceRequest;
        if (surfaceRequest != null) {
            surfaceRequest.updateTransformationInfo(of2);
        }
        Iterator<Consumer<SurfaceRequest.TransformationInfo>> it = this.mTransformationUpdatesListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(of2);
        }
    }

    @MainThread
    public void addOnInvalidatedListener(@NonNull Runnable runnable) {
        Threads.checkMainThread();
        checkNotClosed();
        this.mOnInvalidatedListeners.add(runnable);
    }

    public void addTransformationUpdateListener(@NonNull Consumer<SurfaceRequest.TransformationInfo> consumer) {
        Preconditions.checkNotNull(consumer);
        this.mTransformationUpdatesListeners.add(consumer);
    }

    @MainThread
    public final void close() {
        Threads.checkMainThread();
        this.mSettableSurface.close();
        this.mIsClosed = true;
    }

    @NonNull
    @MainThread
    public p1<SurfaceOutput> createSurfaceOutputFuture(final int i11, @NonNull final SurfaceOutput.CameraInputInfo cameraInputInfo, @Nullable final SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        final SettableSurface settableSurface = this.mSettableSurface;
        return Futures.transformAsync(settableSurface.getSurface(), new AsyncFunction() { // from class: androidx.camera.core.processing.s
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final p1 apply(Object obj) {
                return SurfaceEdge.d(SurfaceEdge.this, settableSurface, i11, cameraInputInfo, cameraInputInfo2, (Surface) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    @NonNull
    @MainThread
    public SurfaceRequest createSurfaceRequest(@NonNull CameraInternal cameraInternal) {
        return createSurfaceRequest(cameraInternal, true);
    }

    @MainThread
    public final void disconnect() {
        Threads.checkMainThread();
        checkNotClosed();
        this.mSettableSurface.close();
    }

    @NonNull
    public Rect getCropRect() {
        return this.mCropRect;
    }

    @NonNull
    @MainThread
    public DeferrableSurface getDeferrableSurface() {
        Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        return this.mSettableSurface;
    }

    @NonNull
    @VisibleForTesting
    public DeferrableSurface getDeferrableSurfaceForTesting() {
        return this.mSettableSurface;
    }

    public int getFormat() {
        return this.mFormat;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    @NonNull
    public Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    @NonNull
    public StreamSpec getStreamSpec() {
        return this.mStreamSpec;
    }

    public int getTargets() {
        return this.mTargets;
    }

    public boolean hasCameraTransform() {
        return this.mHasCameraTransform;
    }

    @VisibleForTesting
    public boolean hasProvider() {
        return this.mSettableSurface.hasProvider();
    }

    @MainThread
    public void invalidate() {
        Threads.checkMainThread();
        checkNotClosed();
        if (this.mSettableSurface.canSetProvider()) {
            return;
        }
        this.mHasConsumer = false;
        this.mSettableSurface.close();
        this.mSettableSurface = new SettableSurface(this.mStreamSpec.getResolution(), this.mFormat);
        Iterator<Runnable> it = this.mOnInvalidatedListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @VisibleForTesting
    public boolean isClosed() {
        return this.mIsClosed;
    }

    public boolean isMirroring() {
        return this.mMirroring;
    }

    public void removeTransformationUpdateListener(@NonNull Consumer<SurfaceRequest.TransformationInfo> consumer) {
        Preconditions.checkNotNull(consumer);
        this.mTransformationUpdatesListeners.remove(consumer);
    }

    @MainThread
    public void setProvider(@NonNull DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
        Threads.checkMainThread();
        checkNotClosed();
        SettableSurface settableSurface = this.mSettableSurface;
        Objects.requireNonNull(settableSurface);
        settableSurface.setProvider(deferrableSurface, new u(settableSurface));
    }

    public void updateTransformation(int i11) {
        updateTransformation(i11, -1);
    }

    @NonNull
    @MainThread
    public SurfaceRequest createSurfaceRequest(@NonNull CameraInternal cameraInternal, boolean z11) {
        Threads.checkMainThread();
        checkNotClosed();
        SurfaceRequest surfaceRequest = new SurfaceRequest(this.mStreamSpec.getResolution(), cameraInternal, z11, this.mStreamSpec.getDynamicRange(), this.mStreamSpec.getExpectedFrameRateRange(), new Runnable() { // from class: androidx.camera.core.processing.t
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.a(SurfaceEdge.this);
            }
        });
        try {
            final DeferrableSurface deferrableSurface = surfaceRequest.getDeferrableSurface();
            SettableSurface settableSurface = this.mSettableSurface;
            Objects.requireNonNull(settableSurface);
            if (settableSurface.setProvider(deferrableSurface, new u(settableSurface))) {
                p1<Void> terminationFuture = settableSurface.getTerminationFuture();
                Objects.requireNonNull(deferrableSurface);
                terminationFuture.addListener(new Runnable() { // from class: androidx.camera.core.processing.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeferrableSurface.this.close();
                    }
                }, CameraXExecutors.directExecutor());
            }
            this.mProviderSurfaceRequest = surfaceRequest;
            notifyTransformationInfoUpdate();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        } catch (RuntimeException e12) {
            surfaceRequest.willNotProvideSurface();
            throw e12;
        }
    }

    public void updateTransformation(final int i11, final int i12) {
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.w
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.c(SurfaceEdge.this, i11, i12);
            }
        });
    }
}
