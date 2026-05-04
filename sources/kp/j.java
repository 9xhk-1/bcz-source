package kp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f68571a;

    /* renamed from: b, reason: collision with root package name */
    public final float f68572b;

    /* renamed from: c, reason: collision with root package name */
    public final float f68573c;

    /* renamed from: d, reason: collision with root package name */
    public final float f68574d;

    /* renamed from: e, reason: collision with root package name */
    public final float f68575e;

    /* renamed from: f, reason: collision with root package name */
    public final float f68576f;

    /* renamed from: g, reason: collision with root package name */
    public final float f68577g;

    /* renamed from: h, reason: collision with root package name */
    public final float f68578h;

    /* renamed from: i, reason: collision with root package name */
    public final float f68579i;

    public j(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f68571a = f11;
        this.f68572b = f14;
        this.f68573c = f17;
        this.f68574d = f12;
        this.f68575e = f15;
        this.f68576f = f18;
        this.f68577g = f13;
        this.f68578h = f16;
        this.f68579i = f19;
    }

    public static j b(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
        return d(f19, f21, f22, f23, f24, f25, f26, f27).e(c(f11, f12, f13, f14, f15, f16, f17, f18));
    }

    public static j c(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return d(f11, f12, f13, f14, f15, f16, f17, f18).a();
    }

    public static j d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = ((f11 - f13) + f15) - f17;
        float f21 = ((f12 - f14) + f16) - f18;
        if (f19 == 0.0f && f21 == 0.0f) {
            return new j(f13 - f11, f15 - f13, f11, f14 - f12, f16 - f14, f12, 0.0f, 0.0f, 1.0f);
        }
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = f14 - f16;
        float f25 = f18 - f16;
        float f26 = (f22 * f25) - (f23 * f24);
        float f27 = ((f25 * f19) - (f23 * f21)) / f26;
        float f28 = ((f22 * f21) - (f19 * f24)) / f26;
        return new j((f13 - f11) + (f27 * f13), (f17 - f11) + (f28 * f17), f11, (f14 - f12) + (f27 * f14), (f18 - f12) + (f28 * f18), f12, f27, f28, 1.0f);
    }

    public j a() {
        float f11 = this.f68575e;
        float f12 = this.f68579i;
        float f13 = this.f68576f;
        float f14 = this.f68578h;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = this.f68577g;
        float f17 = this.f68574d;
        float f18 = (f13 * f16) - (f17 * f12);
        float f19 = (f17 * f14) - (f11 * f16);
        float f21 = this.f68573c;
        float f22 = this.f68572b;
        float f23 = (f21 * f14) - (f22 * f12);
        float f24 = this.f68571a;
        return new j(f15, f18, f19, f23, (f12 * f24) - (f21 * f16), (f16 * f22) - (f14 * f24), (f22 * f13) - (f21 * f11), (f21 * f17) - (f13 * f24), (f24 * f11) - (f22 * f17));
    }

    public j e(j jVar) {
        float f11 = this.f68571a;
        float f12 = jVar.f68571a;
        float f13 = this.f68574d;
        float f14 = jVar.f68572b;
        float f15 = this.f68577g;
        float f16 = jVar.f68573c;
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = jVar.f68574d;
        float f19 = jVar.f68575e;
        float f21 = jVar.f68576f;
        float f22 = (f11 * f18) + (f13 * f19) + (f15 * f21);
        float f23 = jVar.f68577g;
        float f24 = jVar.f68578h;
        float f25 = jVar.f68579i;
        float f26 = (f11 * f23) + (f13 * f24) + (f15 * f25);
        float f27 = this.f68572b;
        float f28 = this.f68575e;
        float f29 = (f27 * f12) + (f28 * f14);
        float f31 = this.f68578h;
        float f32 = f29 + (f31 * f16);
        float f33 = (f27 * f18) + (f28 * f19) + (f31 * f21);
        float f34 = (f27 * f23) + (f28 * f24) + (f31 * f25);
        float f35 = this.f68573c;
        float f36 = f12 * f35;
        float f37 = this.f68576f;
        float f38 = f36 + (f14 * f37);
        float f39 = this.f68579i;
        return new j(f17, f22, f26, f32, f33, f34, f38 + (f16 * f39), (f35 * f18) + (f19 * f37) + (f21 * f39), (f35 * f23) + (f37 * f24) + (f39 * f25));
    }

    public void f(float[] fArr) {
        int length = fArr.length;
        float f11 = this.f68571a;
        float f12 = this.f68572b;
        float f13 = this.f68573c;
        float f14 = this.f68574d;
        float f15 = this.f68575e;
        float f16 = this.f68576f;
        float f17 = this.f68577g;
        float f18 = this.f68578h;
        float f19 = this.f68579i;
        for (int i11 = 0; i11 < length; i11 += 2) {
            float f21 = fArr[i11];
            int i12 = i11 + 1;
            float f22 = fArr[i12];
            float f23 = (f13 * f21) + (f16 * f22) + f19;
            fArr[i11] = (((f11 * f21) + (f14 * f22)) + f17) / f23;
            fArr[i12] = (((f21 * f12) + (f22 * f15)) + f18) / f23;
        }
    }

    public void g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr[i11];
            float f12 = fArr2[i11];
            float f13 = (this.f68573c * f11) + (this.f68576f * f12) + this.f68579i;
            fArr[i11] = (((this.f68571a * f11) + (this.f68574d * f12)) + this.f68577g) / f13;
            fArr2[i11] = (((this.f68572b * f11) + (this.f68575e * f12)) + this.f68578h) / f13;
        }
    }
}
