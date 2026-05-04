package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraControl {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @NonNull
    p1<Void> cancelFocusAndMetering();

    @NonNull
    p1<Void> enableTorch(boolean z11);

    @NonNull
    p1<Integer> setExposureCompensationIndex(int i11);

    @NonNull
    p1<Void> setLinearZoom(@FloatRange(from = 0.0d, to = 1.0d) float f11);

    @NonNull
    p1<Void> setZoomRatio(float f11);

    @NonNull
    p1<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction);
}
