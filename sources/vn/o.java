package vn;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o extends f {

    /* renamed from: a, reason: collision with root package name */
    public float f94153a;

    public o() {
        this.f94153a = -1.0f;
    }

    @Override // vn.f
    public void b(@NonNull r rVar, float f11, float f12, float f13) {
        rVar.r(0.0f, f13 * f12, 180.0f, 180.0f - f11);
        float f14 = f13 * 2.0f * f12;
        rVar.a(0.0f, 0.0f, f14, f14, 180.0f, f11);
    }

    @Deprecated
    public o(float f11) {
        this.f94153a = f11;
    }
}
