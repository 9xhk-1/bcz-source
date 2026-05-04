package cn;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final float f8817i = 0.1f;

    /* renamed from: a, reason: collision with root package name */
    public final int f8818a;

    /* renamed from: b, reason: collision with root package name */
    public float f8819b;

    /* renamed from: c, reason: collision with root package name */
    public int f8820c;

    /* renamed from: d, reason: collision with root package name */
    public int f8821d;

    /* renamed from: e, reason: collision with root package name */
    public float f8822e;

    /* renamed from: f, reason: collision with root package name */
    public float f8823f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8824g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8825h;

    public a(int i11, float f11, float f12, float f13, int i12, float f14, int i13, float f15, int i14, float f16) {
        this.f8818a = i11;
        this.f8819b = MathUtils.clamp(f11, f12, f13);
        this.f8820c = i12;
        this.f8822e = f14;
        this.f8821d = i13;
        this.f8823f = f15;
        this.f8824g = i14;
        d(f16, f12, f13, f15);
        this.f8825h = b(f15);
    }

    public static a c(float f11, float f12, float f13, float f14, int[] iArr, float f15, int[] iArr2, float f16, int[] iArr3) {
        a aVar = null;
        int i11 = 1;
        for (int i12 : iArr3) {
            int length = iArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = iArr2[i13];
                int length2 = iArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    int i16 = length;
                    int i17 = i13;
                    int i18 = i11;
                    int i19 = length2;
                    int i21 = i15;
                    a aVar2 = new a(i18, f12, f13, f14, iArr[i15], f15, i14, f16, i12, f11);
                    if (aVar == null || aVar2.f8825h < aVar.f8825h) {
                        if (aVar2.f8825h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i22 = i18 + 1;
                    i15 = i21 + 1;
                    i13 = i17;
                    i11 = i22;
                    length = i16;
                    length2 = i19;
                }
                i13++;
                i11 = i11;
                length = length;
            }
        }
        return aVar;
    }

    public final float a(float f11, int i11, float f12, int i12, int i13) {
        if (i11 <= 0) {
            f12 = 0.0f;
        }
        float f13 = i12 / 2.0f;
        return (f11 - ((i11 + f13) * f12)) / (i13 + f13);
    }

    public final float b(float f11) {
        if (g()) {
            return Math.abs(f11 - this.f8823f) * this.f8818a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f11, float f12, float f13, float f14) {
        float f15 = f11 - f();
        int i11 = this.f8820c;
        if (i11 > 0 && f15 > 0.0f) {
            float f16 = this.f8819b;
            this.f8819b = f16 + Math.min(f15 / i11, f13 - f16);
        } else if (i11 > 0 && f15 < 0.0f) {
            float f17 = this.f8819b;
            this.f8819b = f17 + Math.max(f15 / i11, f12 - f17);
        }
        int i12 = this.f8820c;
        float f18 = i12 > 0 ? this.f8819b : 0.0f;
        this.f8819b = f18;
        float a11 = a(f11, i12, f18, this.f8821d, this.f8824g);
        this.f8823f = a11;
        float f19 = (this.f8819b + a11) / 2.0f;
        this.f8822e = f19;
        int i13 = this.f8821d;
        if (i13 <= 0 || a11 == f14) {
            return;
        }
        float f21 = (f14 - a11) * this.f8824g;
        float min = Math.min(Math.abs(f21), f19 * 0.1f * i13);
        if (f21 > 0.0f) {
            this.f8822e -= min / this.f8821d;
            this.f8823f += min / this.f8824g;
        } else {
            this.f8822e += min / this.f8821d;
            this.f8823f -= min / this.f8824g;
        }
    }

    public int e() {
        return this.f8820c + this.f8821d + this.f8824g;
    }

    public final float f() {
        return (this.f8823f * this.f8824g) + (this.f8822e * this.f8821d) + (this.f8819b * this.f8820c);
    }

    public final boolean g() {
        int i11 = this.f8824g;
        if (i11 <= 0 || this.f8820c <= 0 || this.f8821d <= 0) {
            return i11 <= 0 || this.f8820c <= 0 || this.f8823f > this.f8819b;
        }
        float f11 = this.f8823f;
        float f12 = this.f8822e;
        return f11 > f12 && f12 > this.f8819b;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f8818a + ", smallCount=" + this.f8820c + ", smallSize=" + this.f8819b + ", mediumCount=" + this.f8821d + ", mediumSize=" + this.f8822e + ", largeCount=" + this.f8824g + ", largeSize=" + this.f8823f + ", cost=" + this.f8825h + "]";
    }
}
