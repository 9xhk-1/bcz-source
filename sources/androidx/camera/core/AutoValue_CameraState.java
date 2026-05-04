package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_CameraState extends CameraState {
    private final CameraState.StateError error;
    private final CameraState.Type type;

    public AutoValue_CameraState(CameraState.Type type, @Nullable CameraState.StateError stateError) {
        if (type == null) {
            throw new NullPointerException("Null type");
        }
        this.type = type;
        this.error = stateError;
    }

    public boolean equals(Object obj) {
        CameraState.StateError stateError;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState) {
            CameraState cameraState = (CameraState) obj;
            if (this.type.equals(cameraState.getType()) && ((stateError = this.error) != null ? stateError.equals(cameraState.getError()) : cameraState.getError() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState
    @Nullable
    public CameraState.StateError getError() {
        return this.error;
    }

    @Override // androidx.camera.core.CameraState
    @NonNull
    public CameraState.Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.error;
        return hashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.type + ", error=" + this.error + com.alipay.sdk.m.u.i.f11099d;
    }
}
