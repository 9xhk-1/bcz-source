package vn;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j extends h {

    /* renamed from: a, reason: collision with root package name */
    public final float f94098a;

    public j(float f11) {
        this.f94098a = f11 - 0.001f;
    }

    @Override // vn.h
    public boolean a() {
        return true;
    }

    @Override // vn.h
    public void b(float f11, float f12, float f13, @NonNull r rVar) {
        float sqrt = (float) ((this.f94098a * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f94098a, 2.0d) - Math.pow(sqrt, 2.0d));
        rVar.q(f12 - sqrt, ((float) (-((this.f94098a * Math.sqrt(2.0d)) - this.f94098a))) + sqrt2);
        rVar.n(f12, (float) (-((this.f94098a * Math.sqrt(2.0d)) - this.f94098a)));
        rVar.n(f12 + sqrt, ((float) (-((this.f94098a * Math.sqrt(2.0d)) - this.f94098a))) + sqrt2);
    }
}
