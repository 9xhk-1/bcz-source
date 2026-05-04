package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.camera.core.CameraState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i11, @Nullable Throwable th2) {
        this.code = i11;
        this.cause = th2;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState.StateError) {
            CameraState.StateError stateError = (CameraState.StateError) obj;
            if (this.code == stateError.getCode() && ((th2 = this.cause) != null ? th2.equals(stateError.getCause()) : stateError.getCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i11 = (this.code ^ 1000003) * 1000003;
        Throwable th2 = this.cause;
        return i11 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + com.alipay.sdk.m.u.i.f11099d;
    }
}
