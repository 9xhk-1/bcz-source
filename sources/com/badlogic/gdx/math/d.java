package com.badlogic.gdx.math;

import com.badlogic.gdx.math.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d<T extends t<T>> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    public T[] f12562a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12563b;

    /* renamed from: c, reason: collision with root package name */
    public int f12564c;

    /* renamed from: d, reason: collision with root package name */
    public T f12565d;

    /* renamed from: e, reason: collision with root package name */
    public T f12566e;

    /* renamed from: f, reason: collision with root package name */
    public T f12567f;

    public d() {
    }

    public static <T extends t<T>> T i(T t11, float f11, T[] tArr, boolean z11, T t12) {
        int length = tArr.length;
        if (!z11) {
            length -= 3;
        }
        float f12 = length * f11;
        int i11 = f11 >= 1.0f ? length - 1 : (int) f12;
        return (T) j(t11, i11, f12 - i11, tArr, z11, t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T j(T t11, int i11, float f11, T[] tArr, boolean z11, T t12) {
        int length = tArr.length;
        float f12 = f11 * f11;
        float f13 = f12 * f11;
        t11.set(tArr[i11]).scl(((1.5f * f13) - (2.5f * f12)) + 1.0f);
        if (z11 || i11 > 0) {
            t11.add(t12.set(tArr[((length + i11) - 1) % length]).scl((((-0.5f) * f13) + f12) - (f11 * 0.5f)));
        }
        if (z11 || i11 < length - 1) {
            t11.add(t12.set(tArr[(i11 + 1) % length]).scl(((-1.5f) * f13) + (2.0f * f12) + (f11 * 0.5f)));
        }
        if (!z11 && i11 >= length - 2) {
            return t11;
        }
        t11.add(t12.set(tArr[(i11 + 2) % length]).scl((f13 * 0.5f) - (f12 * 0.5f)));
        return t11;
    }

    public static <T extends t<T>> T k(T t11, float f11, T[] tArr, boolean z11, T t12) {
        int length = tArr.length;
        if (!z11) {
            length -= 3;
        }
        float f12 = length * f11;
        int i11 = f11 >= 1.0f ? length - 1 : (int) f12;
        return (T) l(t11, i11, f12 - i11, tArr, z11, t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T l(T t11, int i11, float f11, T[] tArr, boolean z11, T t12) {
        int length = tArr.length;
        float f12 = f11 * f11;
        float f13 = -f11;
        float f14 = 4.5f * f12;
        t11.set(tArr[i11]).scl((5.0f * f13) + f14);
        if (z11 || i11 > 0) {
            t11.add(t12.set(tArr[((length + i11) - 1) % length]).scl(((2.0f * f11) - 0.5f) - (f12 * 1.5f)));
        }
        if (z11 || i11 < length - 1) {
            t11.add(t12.set(tArr[(i11 + 1) % length]).scl(((f11 * 4.0f) + 0.5f) - f14));
        }
        if (!z11 && i11 >= length - 2) {
            return t11;
        }
        t11.add(t12.set(tArr[(i11 + 2) % length]).scl(f13 + (f12 * 1.5f)));
        return t11;
    }

    @Override // com.badlogic.gdx.math.p
    public float b(int i11) {
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12566e.set(this.f12567f);
            d(this.f12567f, i12 / (i11 - 1.0f));
            if (i12 > 0) {
                f11 += this.f12566e.dst(this.f12567f);
            }
        }
        return f11;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float e(T t11) {
        return g(t11, p(t11));
    }

    public float g(T t11, int i11) {
        T[] tArr = this.f12562a;
        T t12 = tArr[i11];
        T t13 = tArr[i11 > 0 ? i11 - 1 : this.f12564c - 1];
        T t14 = tArr[(i11 + 1) % this.f12564c];
        if (t11.dst2(t14) >= t11.dst2(t13)) {
            if (i11 <= 0) {
                i11 = this.f12564c;
            }
            i11--;
            t14 = t12;
            t12 = t13;
        }
        float dst2 = t12.dst2(t14);
        float dst22 = t11.dst2(t14);
        float dst23 = t11.dst2(t12);
        float sqrt = (float) Math.sqrt(dst2);
        return (i11 + n.o((sqrt - (((dst22 + dst2) - dst23) / (2.0f * sqrt))) / sqrt, 0.0f, 1.0f)) / this.f12564c;
    }

    public float h(T t11, int i11, int i12) {
        return g(t11, q(t11, i11, i12));
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public T c(T t11, float f11) {
        int i11 = this.f12564c;
        float f12 = i11 * f11;
        int i12 = f11 >= 1.0f ? i11 - 1 : (int) f12;
        return n(t11, i12, f12 - i12);
    }

    public T n(T t11, int i11, float f11) {
        boolean z11 = this.f12563b;
        if (!z11) {
            i11++;
        }
        return (T) l(t11, i11, f11, this.f12562a, z11, this.f12565d);
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public float a(T t11) {
        return e(t11);
    }

    public int p(T t11) {
        return q(t11, 0, this.f12564c);
    }

    public int q(T t11, int i11, int i12) {
        while (i11 < 0) {
            i11 += this.f12564c;
        }
        int i13 = i11 % this.f12564c;
        float dst2 = t11.dst2(this.f12562a[i13]);
        for (int i14 = 1; i14 < i12; i14++) {
            int i15 = (i11 + i14) % this.f12564c;
            float dst22 = t11.dst2(this.f12562a[i15]);
            if (dst22 < dst2) {
                i13 = i15;
                dst2 = dst22;
            }
        }
        return i13;
    }

    public d r(T[] tArr, boolean z11) {
        if (this.f12565d == null) {
            this.f12565d = (T) tArr[0].cpy();
        }
        if (this.f12566e == null) {
            this.f12566e = (T) tArr[0].cpy();
        }
        if (this.f12567f == null) {
            this.f12567f = (T) tArr[0].cpy();
        }
        this.f12562a = tArr;
        this.f12563b = z11;
        int length = tArr.length;
        if (!z11) {
            length -= 3;
        }
        this.f12564c = length;
        return this;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public T d(T t11, float f11) {
        int i11 = this.f12564c;
        float f12 = i11 * f11;
        int i12 = f11 >= 1.0f ? i11 - 1 : (int) f12;
        return t(t11, i12, f12 - i12);
    }

    public T t(T t11, int i11, float f11) {
        boolean z11 = this.f12563b;
        if (!z11) {
            i11++;
        }
        return (T) j(t11, i11, f11, this.f12562a, z11, this.f12565d);
    }

    public d(T[] tArr, boolean z11) {
        r(tArr, z11);
    }
}
