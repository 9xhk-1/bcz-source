package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LifecycleCameraController extends CameraController {
    private static final String TAG = "CamLifecycleController";

    @Nullable
    private LifecycleOwner mLifecycleOwner;

    public LifecycleCameraController(@NonNull Context context) {
        super(context);
    }

    @SuppressLint({"MissingPermission"})
    @MainThread
    public void bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner) {
        Threads.checkMainThread();
        this.mLifecycleOwner = lifecycleOwner;
        startCameraAndTrackStates();
    }

    @VisibleForTesting
    public void shutDownForTests() {
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.shutdownAsync();
        }
    }

    @Override // androidx.camera.view.CameraController
    @Nullable
    @RequiresPermission("android.permission.CAMERA")
    public Camera startCamera() {
        if (this.mLifecycleOwner == null) {
            Log.d(TAG, "Lifecycle is not set.");
            return null;
        }
        if (this.mCameraProvider == null) {
            Log.d(TAG, "CameraProvider is not ready.");
            return null;
        }
        UseCaseGroup createUseCaseGroup = createUseCaseGroup();
        if (createUseCaseGroup == null) {
            return null;
        }
        try {
            return this.mCameraProvider.bindToLifecycle(this.mLifecycleOwner, this.mCameraSelector, createUseCaseGroup);
        } catch (IllegalArgumentException e11) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e11);
        }
    }

    @MainThread
    public void unbind() {
        Threads.checkMainThread();
        this.mLifecycleOwner = null;
        this.mCamera = null;
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbindAll();
        }
    }

    @VisibleForTesting
    public LifecycleCameraController(@NonNull Context context, @NonNull p1<ProcessCameraProviderWrapper> p1Var) {
        super(context, p1Var);
    }
}
