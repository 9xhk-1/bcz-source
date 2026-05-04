package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import vn.h;
import vn.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends h implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final int f30686g = 90;

    /* renamed from: h, reason: collision with root package name */
    public static final int f30687h = 180;

    /* renamed from: i, reason: collision with root package name */
    public static final int f30688i = 270;

    /* renamed from: j, reason: collision with root package name */
    public static final int f30689j = 180;

    /* renamed from: k, reason: collision with root package name */
    public static final float f30690k = 1.75f;

    /* renamed from: a, reason: collision with root package name */
    public float f30691a;

    /* renamed from: b, reason: collision with root package name */
    public float f30692b;

    /* renamed from: c, reason: collision with root package name */
    public float f30693c;

    /* renamed from: d, reason: collision with root package name */
    public float f30694d;

    /* renamed from: e, reason: collision with root package name */
    public float f30695e;

    /* renamed from: f, reason: collision with root package name */
    public float f30696f = -1.0f;

    public d(float f11, float f12, float f13) {
        this.f30692b = f11;
        this.f30691a = f12;
        j(f13);
        this.f30695e = 0.0f;
    }

    @Override // vn.h
    public void b(float f11, float f12, float f13, @NonNull r rVar) {
        float f14;
        float f15;
        float f16 = this.f30693c;
        if (f16 == 0.0f) {
            rVar.n(f11, 0.0f);
            return;
        }
        float f17 = ((this.f30692b * 2.0f) + f16) / 2.0f;
        float f18 = f13 * this.f30691a;
        float f19 = f12 + this.f30695e;
        float f21 = (this.f30694d * f13) + ((1.0f - f13) * f17);
        if (f21 / f17 >= 1.0f) {
            rVar.n(f11, 0.0f);
            return;
        }
        float f22 = this.f30696f;
        float f23 = f22 * f13;
        boolean z11 = f22 == -1.0f || Math.abs((f22 * 2.0f) - f16) < 0.1f;
        if (z11) {
            f14 = f21;
            f15 = 0.0f;
        } else {
            f15 = 1.75f;
            f14 = 0.0f;
        }
        float f24 = f17 + f18;
        float f25 = f14 + f18;
        float sqrt = (float) Math.sqrt((f24 * f24) - (f25 * f25));
        float f26 = f19 - sqrt;
        float f27 = f19 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f25));
        float f28 = (90.0f - degrees) + f15;
        rVar.n(f26, 0.0f);
        float f29 = f26 - f18;
        float f31 = f26 + f18;
        float f32 = f18 * 2.0f;
        rVar.a(f29, 0.0f, f31, f32, 270.0f, degrees);
        if (z11) {
            rVar.a(f19 - f17, (-f17) - f14, f19 + f17, f17 - f14, 180.0f - f28, (f28 * 2.0f) - 180.0f);
        } else {
            float f33 = this.f30692b;
            float f34 = f23 * 2.0f;
            float f35 = f33 + f34;
            float f36 = f19 - f17;
            rVar.a(f36, -(f23 + f33), f35 + f36, f33 + f23, 180.0f - f28, ((f28 * 2.0f) - 180.0f) / 2.0f);
            float f37 = f19 + f17;
            float f38 = this.f30692b;
            rVar.n(f37 - ((f38 / 2.0f) + f23), f38 + f23);
            float f39 = this.f30692b;
            rVar.a(f37 - (f34 + f39), -(f23 + f39), f37, f39 + f23, 90.0f, f28 - 90.0f);
        }
        rVar.a(f27 - f18, 0.0f, f27 + f18, f32, 270.0f - degrees, degrees);
        rVar.n(f11, 0.0f);
    }

    public float d() {
        return this.f30694d;
    }

    public float e() {
        return this.f30696f;
    }

    public float f() {
        return this.f30692b;
    }

    public float g() {
        return this.f30691a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float h() {
        return this.f30693c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float i() {
        return this.f30695e;
    }

    public void j(@FloatRange(from = 0.0d) float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f30694d = f11;
    }

    public void l(float f11) {
        this.f30696f = f11;
    }

    public void m(float f11) {
        this.f30692b = f11;
    }

    public void n(float f11) {
        this.f30691a = f11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void o(float f11) {
        this.f30693c = f11;
    }

    public void p(float f11) {
        this.f30695e = f11;
    }
}
