package vn;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends f {

    /* renamed from: a, reason: collision with root package name */
    public float f94090a;

    public g() {
        this.f94090a = -1.0f;
    }

    @Override // vn.f
    public void b(@NonNull r rVar, float f11, float f12, float f13) {
        rVar.r(0.0f, f13 * f12, 180.0f, 180.0f - f11);
        double d11 = f13;
        double d12 = f12;
        rVar.n((float) (Math.sin(Math.toRadians(f11)) * d11 * d12), (float) (Math.sin(Math.toRadians(90.0f - f11)) * d11 * d12));
    }

    @Deprecated
    public g(float f11) {
        this.f94090a = f11;
    }
}
