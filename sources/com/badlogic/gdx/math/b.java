package com.badlogic.gdx.math;

import com.badlogic.gdx.math.t;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b<T extends t<T>> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f12553a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: b, reason: collision with root package name */
    public T f12554b;

    /* renamed from: c, reason: collision with root package name */
    public T f12555c;

    /* renamed from: d, reason: collision with root package name */
    public T f12556d;

    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T g(T t11, float f11, T t12, T t13, T t14, T t15, T t16) {
        float f12 = 1.0f - f11;
        float f13 = f12 * f12;
        float f14 = f11 * f11;
        return (T) t11.set(t12).scl(f13 * f12).add(t16.set(t13).scl(f13 * 3.0f * f11)).add(t16.set(t14).scl(f12 * 3.0f * f14)).add(t16.set(t15).scl(f14 * f11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T h(T t11, float f11, T t12, T t13, T t14, T t15, T t16) {
        float f12 = 1.0f - f11;
        return (T) t11.set(t13).sub(t12).scl(f12 * f12 * 3.0f).add(t16.set(t14).sub(t13).scl(f12 * f11 * 6.0f)).add(t16.set(t15).sub(t14).scl(f11 * f11 * 3.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T j(T t11, float f11, T t12, T t13, T t14) {
        return (T) t11.set(t12).scl(1.0f - f11).add(t14.set(t13).scl(f11));
    }

    public static <T extends t<T>> T k(T t11, float f11, T t12, T t13, T t14) {
        return (T) t11.set(t13).sub(t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T m(T t11, float f11, T t12, T t13, T t14, T t15) {
        float f12 = 1.0f - f11;
        return (T) t11.set(t12).scl(f12 * f12).add(t15.set(t13).scl(f12 * 2.0f * f11)).add(t15.set(t14).scl(f11 * f11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends t<T>> T n(T t11, float f11, T t12, T t13, T t14, T t15) {
        return (T) t11.set(t13).sub(t12).scl(2.0f).scl(1.0f - f11).add(t15.set(t14).sub(t13).scl(f11).scl(2.0f));
    }

    @Override // com.badlogic.gdx.math.p
    public float b(int i11) {
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12555c.set(this.f12556d);
            d(this.f12556d, i12 / (i11 - 1.0f));
            if (i12 > 0) {
                f11 += this.f12555c.dst(this.f12556d);
            }
        }
        return f11;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float e(T t11) {
        T t12 = this.f12553a.get(0);
        T t13 = this.f12553a.get(r1.f13179b - 1);
        float dst2 = t12.dst2(t13);
        float dst22 = t11.dst2(t13);
        float dst23 = t11.dst2(t12);
        float sqrt = (float) Math.sqrt(dst2);
        return n.o((sqrt - (((dst22 + dst2) - dst23) / (2.0f * sqrt))) / sqrt, 0.0f, 1.0f);
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public T c(T t11, float f11) {
        com.badlogic.gdx.utils.a<T> aVar = this.f12553a;
        int i11 = aVar.f13179b;
        if (i11 == 2) {
            k(t11, f11, aVar.get(0), this.f12553a.get(1), this.f12554b);
            return t11;
        }
        if (i11 == 3) {
            n(t11, f11, aVar.get(0), this.f12553a.get(1), this.f12553a.get(2), this.f12554b);
            return t11;
        }
        if (i11 == 4) {
            h(t11, f11, aVar.get(0), this.f12553a.get(1), this.f12553a.get(2), this.f12553a.get(3), this.f12554b);
        }
        return t11;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public float a(T t11) {
        return e(t11);
    }

    public b o(com.badlogic.gdx.utils.a<T> aVar, int i11, int i12) {
        if (i12 < 2 || i12 > 4) {
            throw new GdxRuntimeException("Only first, second and third degree Bezier curves are supported.");
        }
        if (this.f12554b == null) {
            this.f12554b = (T) aVar.get(0).cpy();
        }
        if (this.f12555c == null) {
            this.f12555c = (T) aVar.get(0).cpy();
        }
        if (this.f12556d == null) {
            this.f12556d = (T) aVar.get(0).cpy();
        }
        this.f12553a.clear();
        this.f12553a.h(aVar, i11, i12);
        return this;
    }

    public b p(T... tArr) {
        return q(tArr, 0, tArr.length);
    }

    public b q(T[] tArr, int i11, int i12) {
        if (i12 < 2 || i12 > 4) {
            throw new GdxRuntimeException("Only first, second and third degree Bezier curves are supported.");
        }
        if (this.f12554b == null) {
            this.f12554b = (T) tArr[0].cpy();
        }
        if (this.f12555c == null) {
            this.f12555c = (T) tArr[0].cpy();
        }
        if (this.f12556d == null) {
            this.f12556d = (T) tArr[0].cpy();
        }
        this.f12553a.clear();
        this.f12553a.k(tArr, i11, i12);
        return this;
    }

    @Override // com.badlogic.gdx.math.p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public T d(T t11, float f11) {
        com.badlogic.gdx.utils.a<T> aVar = this.f12553a;
        int i11 = aVar.f13179b;
        if (i11 == 2) {
            j(t11, f11, aVar.get(0), this.f12553a.get(1), this.f12554b);
            return t11;
        }
        if (i11 == 3) {
            m(t11, f11, aVar.get(0), this.f12553a.get(1), this.f12553a.get(2), this.f12554b);
            return t11;
        }
        if (i11 == 4) {
            g(t11, f11, aVar.get(0), this.f12553a.get(1), this.f12553a.get(2), this.f12553a.get(3), this.f12554b);
        }
        return t11;
    }

    public b(T... tArr) {
        p(tArr);
    }

    public b(T[] tArr, int i11, int i12) {
        q(tArr, i11, i12);
    }

    public b(com.badlogic.gdx.utils.a<T> aVar, int i11, int i12) {
        o(aVar, i11, i12);
    }
}
