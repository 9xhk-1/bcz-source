package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceRequest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_SurfaceRequest_Result extends SurfaceRequest.Result {
    private final int resultCode;
    private final Surface surface;

    public AutoValue_SurfaceRequest_Result(int i11, Surface surface) {
        this.resultCode = i11;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceRequest.Result) {
            SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
            if (this.resultCode == result.getResultCode() && this.surface.equals(result.getSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public int getResultCode() {
        return this.resultCode;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    @NonNull
    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((this.resultCode ^ 1000003) * 1000003) ^ this.surface.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.resultCode + ", surface=" + this.surface + com.alipay.sdk.m.u.i.f11099d;
    }
}
