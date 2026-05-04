package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraCaptureCallbacks {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {
        private final List<CameraCaptureCallback> mCallbacks = new ArrayList();

        public ComboCameraCaptureCallback(@NonNull List<CameraCaptureCallback> list) {
            for (CameraCaptureCallback cameraCaptureCallback : list) {
                if (!(cameraCaptureCallback instanceof NoOpCameraCaptureCallback)) {
                    this.mCallbacks.add(cameraCaptureCallback);
                }
            }
        }

        @NonNull
        public List<CameraCaptureCallback> getCallbacks() {
            return this.mCallbacks;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(i11);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(i11, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i11, @NonNull CameraCaptureFailure cameraCaptureFailure) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(i11, cameraCaptureFailure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i11, int i12) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(i11, i12);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(i11);
            }
        }
    }

    private CameraCaptureCallbacks() {
    }

    @NonNull
    public static CameraCaptureCallback createComboCallback(@NonNull List<CameraCaptureCallback> list) {
        return list.isEmpty() ? createNoOpCallback() : list.size() == 1 ? list.get(0) : new ComboCameraCaptureCallback(list);
    }

    @NonNull
    public static CameraCaptureCallback createNoOpCallback() {
        return new NoOpCameraCaptureCallback();
    }

    @NonNull
    public static CameraCaptureCallback createComboCallback(@NonNull CameraCaptureCallback... cameraCaptureCallbackArr) {
        return createComboCallback((List<CameraCaptureCallback>) Arrays.asList(cameraCaptureCallbackArr));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i11) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i11, @NonNull CameraCaptureFailure cameraCaptureFailure) {
        }
    }
}
