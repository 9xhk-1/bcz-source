package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final String TAG = "CameraStateRegistry";

    @GuardedBy("mLock")
    private int mAvailableCameras;

    @GuardedBy("mLock")
    private final CameraCoordinator mCameraCoordinator;

    @GuardedBy("mLock")
    private final Map<Camera, CameraRegistration> mCameraStates;
    private final StringBuilder mDebugString = new StringBuilder();
    private final Object mLock;
    private int mMaxAllowedOpenedCameras;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CameraRegistration {
        private final Executor mNotifyExecutor;
        private final OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final OnOpenAvailableListener mOnOpenAvailableListener;
        private CameraInternal.State mState;

        public CameraRegistration(@Nullable CameraInternal.State state, @NonNull Executor executor, @NonNull OnConfigureAvailableListener onConfigureAvailableListener, @NonNull OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mOnConfigureAvailableListener = onConfigureAvailableListener;
            this.mOnOpenAvailableListener = onOpenAvailableListener;
        }

        public CameraInternal.State getState() {
            return this.mState;
        }

        public void notifyOnConfigureAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnConfigureAvailableListener onConfigureAvailableListener = this.mOnConfigureAvailableListener;
                Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraStateRegistry.OnConfigureAvailableListener.this.onConfigureAvailable();
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to configure.", e11);
            }
        }

        public void notifyOnOpenAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnOpenAvailableListener onOpenAvailableListener = this.mOnOpenAvailableListener;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraStateRegistry.OnOpenAvailableListener.this.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to open.", e11);
            }
        }

        public CameraInternal.State setState(@Nullable CameraInternal.State state) {
            CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(@NonNull CameraCoordinator cameraCoordinator, int i11) {
        Object obj = new Object();
        this.mLock = obj;
        this.mCameraStates = new HashMap();
        this.mMaxAllowedOpenedCameras = i11;
        synchronized (obj) {
            this.mCameraCoordinator = cameraCoordinator;
            this.mAvailableCameras = this.mMaxAllowedOpenedCameras;
        }
    }

    @Nullable
    @GuardedBy("mLock")
    private CameraRegistration getCameraRegistration(@NonNull String str) {
        for (Camera camera : this.mCameraStates.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return this.mCameraStates.get(camera);
            }
        }
        return null;
    }

    private static boolean isOpen(@Nullable CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    @GuardedBy("mLock")
    @WorkerThread
    private void recalculateAvailableCameras() {
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i11 = 0;
        for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i11++;
            }
        }
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i11), Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = Math.max(this.mMaxAllowedOpenedCameras - i11, 0);
    }

    private static void traceState(Camera camera, CameraInternal.State state) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:State[" + camera + "]", state.ordinal());
        }
    }

    @Nullable
    @GuardedBy("mLock")
    private CameraInternal.State unregisterCamera(@NonNull Camera camera) {
        CameraRegistration remove = this.mCameraStates.remove(camera);
        if (remove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return remove.getState();
    }

    @Nullable
    @GuardedBy("mLock")
    private CameraInternal.State updateAndVerifyState(@NonNull Camera camera, @NonNull CameraInternal.State state) {
        CameraInternal.State state2 = ((CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).setState(state);
        CameraInternal.State state3 = CameraInternal.State.OPENING;
        if (state == state3) {
            Preconditions.checkState(isOpen(state) || state2 == state3, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (state2 != state) {
            traceState(camera, state);
            recalculateAvailableCameras();
        }
        return state2;
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            try {
                Iterator<Map.Entry<Camera, CameraRegistration>> it = this.mCameraStates.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().getState() == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void markCameraState(@NonNull Camera camera, @NonNull CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i11, int i12) {
        synchronized (this.mLock) {
            boolean z11 = true;
            this.mMaxAllowedOpenedCameras = i12 == 2 ? 2 : 1;
            boolean z12 = i11 != 2 && i12 == 2;
            if (i11 != 2 || i12 == 2) {
                z11 = false;
            }
            if (z12 || z11) {
                recalculateAvailableCameras();
            }
        }
    }

    public void registerCamera(@NonNull Camera camera, @NonNull Executor executor, @NonNull OnConfigureAvailableListener onConfigureAvailableListener, @NonNull OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mCameraStates.containsKey(camera), "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    public boolean tryOpenCamera(@NonNull Camera camera) {
        boolean z11;
        synchronized (this.mLock) {
            try {
                CameraRegistration cameraRegistration = (CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Camera must first be registered with registerCamera()");
                z11 = false;
                if (Logger.isDebugEnabled(TAG)) {
                    this.mDebugString.setLength(0);
                    this.mDebugString.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, Integer.valueOf(this.mAvailableCameras), Boolean.valueOf(isOpen(cameraRegistration.getState())), cameraRegistration.getState()));
                }
                if (this.mAvailableCameras > 0 || isOpen(cameraRegistration.getState())) {
                    CameraInternal.State state = CameraInternal.State.OPENING;
                    cameraRegistration.setState(state);
                    traceState(camera, state);
                    z11 = true;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    this.mDebugString.append(String.format(Locale.US, " --> %s", z11 ? com.alipay.sdk.m.f0.c.f10532p : "FAIL"));
                    Logger.d(TAG, this.mDebugString.toString());
                }
                if (z11) {
                    recalculateAvailableCameras();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tryOpenCaptureSession(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r5.mCameraCoordinator     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r6 = move-exception
            goto L5b
        L11:
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r6 = r5.getCameraRegistration(r6)     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r6 == 0) goto L1d
            androidx.camera.core.impl.CameraInternal$State r6 = r6.getState()     // Catch: java.lang.Throwable -> Lf
            goto L1e
        L1d:
            r6 = r1
        L1e:
            if (r7 == 0) goto L25
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r7 = r5.getCameraRegistration(r7)     // Catch: java.lang.Throwable -> Lf
            goto L26
        L25:
            r7 = r1
        L26:
            if (r7 == 0) goto L2c
            androidx.camera.core.impl.CameraInternal$State r1 = r7.getState()     // Catch: java.lang.Throwable -> Lf
        L2c:
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            if (r2 != 0) goto L40
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L3e
            goto L40
        L3e:
            r6 = r4
            goto L41
        L40:
            r6 = r3
        L41:
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L52
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L50
            goto L52
        L50:
            r7 = r4
            goto L53
        L52:
            r7 = r3
        L53:
            if (r6 == 0) goto L58
            if (r7 == 0) goto L58
            goto L59
        L58:
            r3 = r4
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCaptureSession(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void markCameraState(@androidx.annotation.NonNull androidx.camera.core.Camera r7, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal.State r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L11
            androidx.camera.core.impl.CameraInternal$State r2 = r6.unregisterCamera(r7)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r7 = move-exception
            goto Lbf
        L11:
            androidx.camera.core.impl.CameraInternal$State r2 = r6.updateAndVerifyState(r7, r8)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r8) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            androidx.camera.core.concurrent.CameraCoordinator r2 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Le
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L3e
            androidx.camera.core.CameraInfo r2 = r7.getCameraInfo()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getCameraId()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.concurrent.CameraCoordinator r3 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.getPairedConcurrentCameraId(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = r6.getCameraRegistration(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Le
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r3     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r3 = r3.getState()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r3 != r5) goto L55
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.Camera r3 = (androidx.camera.core.Camera) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> Le
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r8 != r1) goto L97
            int r8 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8     // Catch: java.lang.Throwable -> Le
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r9 != 0) goto L9e
            r4.remove(r7)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8
            r8.notifyOnOpenAvailableListener()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.notifyOnConfigureAvailableListener()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.markCameraState(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }
}
