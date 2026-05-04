package rx.internal.util;

import a00.a0;
import java.util.Arrays;
import rx.internal.util.unsafe.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f86709f = -1640531527;

    /* renamed from: a, reason: collision with root package name */
    public final float f86710a;

    /* renamed from: b, reason: collision with root package name */
    public int f86711b;

    /* renamed from: c, reason: collision with root package name */
    public int f86712c;

    /* renamed from: d, reason: collision with root package name */
    public int f86713d;

    /* renamed from: e, reason: collision with root package name */
    public T[] f86714e;

    public h() {
        this(16, 0.75f);
    }

    public static int d(int i11) {
        int i12 = i11 * (-1640531527);
        return i12 ^ (i12 >>> 16);
    }

    public boolean a(T t11) {
        T t12;
        T[] tArr = this.f86714e;
        int i11 = this.f86711b;
        int d11 = d(t11.hashCode()) & i11;
        T t13 = tArr[d11];
        if (t13 != null) {
            if (t13.equals(t11)) {
                return false;
            }
            do {
                d11 = (d11 + 1) & i11;
                t12 = tArr[d11];
                if (t12 == null) {
                }
            } while (!t12.equals(t11));
            return false;
        }
        tArr[d11] = t11;
        int i12 = this.f86712c + 1;
        this.f86712c = i12;
        if (i12 >= this.f86713d) {
            e();
        }
        return true;
    }

    public void b(wb0.b<? super T> bVar) {
        if (this.f86712c == 0) {
            return;
        }
        T[] tArr = this.f86714e;
        for (a0.d dVar : tArr) {
            if (dVar != null) {
                bVar.call(dVar);
            }
        }
        Arrays.fill(tArr, (Object) null);
        this.f86712c = 0;
    }

    public boolean c() {
        return this.f86712c == 0;
    }

    public void e() {
        T t11;
        T[] tArr = this.f86714e;
        int length = tArr.length;
        int i11 = length << 1;
        int i12 = i11 - 1;
        T[] tArr2 = (T[]) new Object[i11];
        int i13 = this.f86712c;
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                this.f86711b = i12;
                this.f86713d = (int) (i11 * this.f86710a);
                this.f86714e = tArr2;
                return;
            }
            do {
                length--;
                t11 = tArr[length];
            } while (t11 == null);
            int d11 = d(t11.hashCode()) & i12;
            if (tArr2[d11] != null) {
                do {
                    d11 = (d11 + 1) & i12;
                } while (tArr2[d11] != null);
            }
            tArr2[d11] = tArr[length];
            i13 = i14;
        }
    }

    public boolean f(T t11) {
        T t12;
        T[] tArr = this.f86714e;
        int i11 = this.f86711b;
        int d11 = d(t11.hashCode()) & i11;
        T t13 = tArr[d11];
        if (t13 == null) {
            return false;
        }
        if (t13.equals(t11)) {
            return g(d11, tArr, i11);
        }
        do {
            d11 = (d11 + 1) & i11;
            t12 = tArr[d11];
            if (t12 == null) {
                return false;
            }
        } while (!t12.equals(t11));
        return g(d11, tArr, i11);
    }

    public boolean g(int i11, T[] tArr, int i12) {
        int i13;
        T t11;
        this.f86712c--;
        while (true) {
            int i14 = i11 + 1;
            while (true) {
                i13 = i14 & i12;
                t11 = tArr[i13];
                if (t11 == null) {
                    tArr[i11] = null;
                    return true;
                }
                int d11 = d(t11.hashCode()) & i12;
                if (i11 > i13) {
                    if (i11 >= d11 && d11 > i13) {
                        break;
                    }
                    i14 = i13 + 1;
                } else if (i11 < d11 && d11 <= i13) {
                    i14 = i13 + 1;
                }
            }
            tArr[i11] = t11;
            i11 = i13;
        }
    }

    public void h() {
        this.f86712c = 0;
        this.f86714e = (T[]) new Object[0];
    }

    public T[] i() {
        return this.f86714e;
    }

    public h(int i11) {
        this(i11, 0.75f);
    }

    public h(int i11, float f11) {
        this.f86710a = f11;
        int b11 = p.b(i11);
        this.f86711b = b11 - 1;
        this.f86713d = (int) (f11 * b11);
        this.f86714e = (T[]) new Object[b11];
    }
}
