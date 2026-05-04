package vn;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class y extends h {

    /* renamed from: a, reason: collision with root package name */
    public final float f94250a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94251b;

    public y(float f11, boolean z11) {
        this.f94250a = f11;
        this.f94251b = z11;
    }

    @Override // vn.h
    public void b(float f11, float f12, float f13, @NonNull r rVar) {
        if (!this.f94251b) {
            float f14 = this.f94250a;
            rVar.o(f12 - (f14 * f13), 0.0f, f12, (-f14) * f13);
            rVar.o(f12 + (this.f94250a * f13), 0.0f, f11, 0.0f);
        } else {
            rVar.n(f12 - (this.f94250a * f13), 0.0f);
            float f15 = this.f94250a;
            rVar.o(f12, f15 * f13, (f15 * f13) + f12, 0.0f);
            rVar.n(f11, 0.0f);
        }
    }
}
