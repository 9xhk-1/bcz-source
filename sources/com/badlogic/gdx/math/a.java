package com.badlogic.gdx.math;

import com.badlogic.gdx.math.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a<T extends t<T>> implements p<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final float f12544i = 0.16666667f;

    /* renamed from: a, reason: collision with root package name */
    public T[] f12545a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f12546b;

    /* renamed from: c, reason: collision with root package name */
    public int f12547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12548d;

    /* renamed from: e, reason: collision with root package name */
    public int f12549e;

    /* renamed from: f, reason: collision with root package name */
    public T f12550f;

    /* renamed from: g, reason: collision with root package name */
    public T f12551g;

    /* renamed from: h, reason: collision with root package name */
    public T f12552h;

    public a() {
    }

    public static <T extends t<T>> T i(T t11, float f11, T[] tArr, int i11, boolean z11, T t12) {
        int length = tArr.length;
        if (!z11) {
            length -= i11;
        }
        float f12 = length * f11;
        int i12 = f11 >= 1.0f ? length - 1 : (int) f12;
        return (T) j(t11, i12, f12 - i12, tArr, i11, z11, t12);
    }

    public static <T extends t<T>> T j(T t11, int i11, float f11, T[] tArr, int i12, boolean z11, T t12) {
        if (i12 == 3) {
            return (T) l(t11, i11, f11, tArr, z11, t12);
        }
        throw new IllegalArgumentException();
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
        float f12 = 1.0f - f11;
        float f13 = f11 * f11;
        float f14 = f13 * f11;
        t11.set(tArr[i11]).scl((((f14 * 3.0f) - (6.0f * f13)) + 4.0f) * 0.16666667f);
        if (z11 || i11 > 0) {
            t11.add(t12.set(tArr[((length + i11) - 1) % length]).scl(f12 * f12 * f12 * 0.16666667f));
        }
        if (z11 || i11 < length - 1) {
            t11.add(t12.set(tArr[(i11 + 1) % length]).scl((((-3.0f) * f14) + (f13 * 3.0f) + (f11 * 3.0f) + 1.0f) * 0.16666667f));
        }
        if (!z11 && i11 >= length - 2) {
            return t11;
        }
        t11.add(t12.set(tArr[(i11 + 2) % length]).scl(f14 * 0.16666667f));
        return t11;
    }

    public static <T extends t<T>> T m(T t11, float f11, T[] tArr, boolean z11, T t12) {
        int length = tArr.length;
        if (!z11) {
            length -= 3;
        }
        float f12 = length * f11;
        int i11 = f11 >= 1.0f ? length - 1 : (int) f12;
        return (T) l(t11, i11, f12 - i11, tArr, z11, t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T n(T t11, int i11, float f11, T[] tArr, boolean z11, T t12) {
        int length = tArr.length;
        float f12 = 1.0f - f11;
        float f13 = f11 * f11;
        t11.set(tArr[i11]).scl((1.5f * f13) - (2.0f * f11));
        if (z11 || i11 > 0) {
            t11.add(t12.set(tArr[((length + i11) - 1) % length]).scl((-0.5f) * f12 * f12));
        }
        if (z11 || i11 < length - 1) {
            t11.add(t12.set(tArr[(i11 + 1) % length]).scl(((-1.5f) * f13) + f11 + 0.5f));
        }
        if (!z11 && i11 >= length - 2) {
            return t11;
        }
        t11.add(t12.set(tArr[(i11 + 2) % length]).scl(f13 * 0.5f));
        return t11;
    }

    public static <T extends t<T>> T o(T t11, float f11, T[] tArr, int i11, boolean z11, T t12) {
        int length = tArr.length;
        if (!z11) {
            length -= i11;
        }
        float f12 = length * f11;
        int i12 = f11 >= 1.0f ? length - 1 : (int) f12;
        return (T) p(t11, i12, f12 - i12, tArr, i11, z11, t12);
    }

    public static <T extends t<T>> T p(T t11, int i11, float f11, T[] tArr, int i12, boolean z11, T t12) {
        if (i12 == 3) {
            return (T) n(t11, i11, f11, tArr, z11, t12);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.badlogic.gdx.math.p
    public float b(int i11) {
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12551g.set(this.f12552h);
            d(this.f12552h, i12 / (i11 - 1.0f));
            if (i12 > 0) {
                f11 += this.f12551g.dst(this.f12552h);
            }
        }
        return f11;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float e(T t11) {
        return g(t11, t(t11));
    }

    public float g(T t11, int i11) {
        T t12 = this.f12546b.get(i11);
        T t13 = this.f12546b.get(i11 > 0 ? i11 - 1 : this.f12549e - 1);
        T t14 = this.f12546b.get((i11 + 1) % this.f12549e);
        if (t11.dst2(t14) >= t11.dst2(t13)) {
            if (i11 <= 0) {
                i11 = this.f12549e;
            }
            i11--;
            t14 = t12;
            t12 = t13;
        }
        float dst2 = t12.dst2(t14);
        float dst22 = t11.dst2(t14);
        float dst23 = t11.dst2(t12);
        float sqrt = (float) Math.sqrt(dst2);
        return (i11 + n.o((sqrt - (((dst22 + dst2) - dst23) / (2.0f * sqrt))) / sqrt, 0.0f, 1.0f)) / this.f12549e;
    }

    public float h(T t11, int i11, int i12) {
        return g(t11, u(t11, i11, i12));
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public T c(T t11, float f11) {
        int i11 = this.f12549e;
        float f12 = i11 * f11;
        int i12 = f11 >= 1.0f ? i11 - 1 : (int) f12;
        return r(t11, i12, f12 - i12);
    }

    public T r(T t11, int i11, float f11) {
        boolean z11 = this.f12548d;
        if (!z11) {
            i11 += (int) (this.f12547c * 0.5f);
        }
        return (T) p(t11, i11, f11, this.f12545a, this.f12547c, z11, this.f12550f);
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public float a(T t11) {
        return e(t11);
    }

    public int t(T t11) {
        return u(t11, 0, this.f12549e);
    }

    public int u(T t11, int i11, int i12) {
        while (i11 < 0) {
            i11 += this.f12549e;
        }
        int i13 = i11 % this.f12549e;
        float dst2 = t11.dst2(this.f12546b.get(i13));
        for (int i14 = 1; i14 < i12; i14++) {
            int i15 = (i11 + i14) % this.f12549e;
            float dst22 = t11.dst2(this.f12546b.get(i15));
            if (dst22 < dst2) {
                i13 = i15;
                dst2 = dst22;
            }
        }
        return i13;
    }

    public a v(T[] tArr, int i11, boolean z11) {
        if (this.f12550f == null) {
            this.f12550f = (T) tArr[0].cpy();
        }
        if (this.f12551g == null) {
            this.f12551g = (T) tArr[0].cpy();
        }
        if (this.f12552h == null) {
            this.f12552h = (T) tArr[0].cpy();
        }
        this.f12545a = tArr;
        this.f12547c = i11;
        this.f12548d = z11;
        int length = tArr.length;
        if (!z11) {
            length -= i11;
        }
        this.f12549e = length;
        com.badlogic.gdx.utils.a<T> aVar = this.f12546b;
        if (aVar == null) {
            this.f12546b = new com.badlogic.gdx.utils.a<>(length);
        } else {
            aVar.clear();
            this.f12546b.o(this.f12549e);
        }
        int i12 = 0;
        while (i12 < this.f12549e) {
            T[] tArr2 = tArr;
            this.f12546b.a(j(tArr[0].cpy(), z11 ? i12 : (int) (i12 + (i11 * 0.5f)), 0.0f, tArr2, i11, z11, this.f12550f));
            i12++;
            tArr = tArr2;
        }
        return this;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public T d(T t11, float f11) {
        int i11 = this.f12549e;
        float f12 = i11 * f11;
        int i12 = f11 >= 1.0f ? i11 - 1 : (int) f12;
        return x(t11, i12, f12 - i12);
    }

    public T x(T t11, int i11, float f11) {
        boolean z11 = this.f12548d;
        if (!z11) {
            i11 += (int) (this.f12547c * 0.5f);
        }
        return (T) j(t11, i11, f11, this.f12545a, this.f12547c, z11, this.f12550f);
    }

    public a(T[] tArr, int i11, boolean z11) {
        v(tArr, i11, z11);
    }
}
