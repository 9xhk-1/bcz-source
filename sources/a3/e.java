package a3;

import a3.e.a;
import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e<T extends a> {

    /* renamed from: a, reason: collision with root package name */
    public int f1495a;

    /* renamed from: b, reason: collision with root package name */
    public a[] f1496b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1497c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public float f1498a;

        /* renamed from: b, reason: collision with root package name */
        public int f1499b;

        public a(float f11) {
            this.f1498a = f11;
        }

        public float a() {
            return this.f1498a;
        }

        public String toString() {
            return Float.toString(this.f1498a);
        }
    }

    public e() {
        this(16, false);
    }

    public T a(T t11) {
        int i11 = this.f1495a;
        a[] aVarArr = this.f1496b;
        if (i11 == aVarArr.length) {
            a[] aVarArr2 = new a[i11 << 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
            this.f1496b = aVarArr2;
        }
        int i12 = this.f1495a;
        t11.f1499b = i12;
        this.f1496b[i12] = t11;
        this.f1495a = i12 + 1;
        l(i12);
        return t11;
    }

    public T b(T t11, float f11) {
        t11.f1498a = f11;
        return a(t11);
    }

    public void c() {
        Arrays.fill(this.f1496b, 0, this.f1495a, (Object) null);
        this.f1495a = 0;
    }

    public boolean d(T t11, boolean z11) {
        if (t11 == null) {
            throw new IllegalArgumentException("node cannot be null.");
        }
        if (z11) {
            for (a aVar : this.f1496b) {
                if (aVar == t11) {
                    return true;
                }
            }
        } else {
            for (a aVar2 : this.f1496b) {
                if (aVar2.equals(t11)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(int i11) {
        a aVar;
        float f11;
        a[] aVarArr = this.f1496b;
        int i12 = this.f1495a;
        a aVar2 = aVarArr[i11];
        float f12 = aVar2.f1498a;
        while (true) {
            int i13 = i11 << 1;
            int i14 = i13 + 1;
            if (i14 >= i12) {
                break;
            }
            int i15 = i13 + 2;
            a aVar3 = aVarArr[i14];
            float f13 = aVar3.f1498a;
            if (i15 >= i12) {
                f11 = this.f1497c ? -3.4028235E38f : Float.MAX_VALUE;
                aVar = null;
            } else {
                aVar = aVarArr[i15];
                f11 = aVar.f1498a;
            }
            boolean z11 = f13 < f11;
            boolean z12 = this.f1497c;
            if (z11 ^ z12) {
                if (f13 == f12) {
                    break;
                }
                if ((f13 > f12) ^ z12) {
                    break;
                }
                aVarArr[i11] = aVar3;
                aVar3.f1499b = i11;
                i11 = i14;
            } else {
                if (f11 == f12) {
                    break;
                }
                if ((f11 > f12) ^ z12) {
                    break;
                }
                aVarArr[i11] = aVar;
                if (aVar != null) {
                    aVar.f1499b = i11;
                }
                i11 = i15;
            }
        }
        aVarArr[i11] = aVar2;
        aVar2.f1499b = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        int i11 = eVar.f1495a;
        int i12 = this.f1495a;
        if (i11 != i12) {
            return false;
        }
        a[] aVarArr = this.f1496b;
        a[] aVarArr2 = eVar.f1496b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (aVarArr[i13].f1498a != aVarArr2[i13].f1498a) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.f1495a == 0;
    }

    public boolean g() {
        return this.f1495a > 0;
    }

    public T h() {
        if (this.f1495a != 0) {
            return (T) this.f1496b[0];
        }
        throw new IllegalStateException("The heap is empty.");
    }

    public int hashCode() {
        a[] aVarArr = this.f1496b;
        int i11 = this.f1495a;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + Float.floatToIntBits(aVarArr[i13].f1498a);
        }
        return i12;
    }

    public T i() {
        a[] aVarArr = this.f1496b;
        T t11 = (T) aVarArr[0];
        int i11 = this.f1495a - 1;
        this.f1495a = i11;
        if (i11 <= 0) {
            aVarArr[0] = null;
            return t11;
        }
        aVarArr[0] = aVarArr[i11];
        aVarArr[i11] = null;
        e(0);
        return t11;
    }

    public T j(T t11) {
        int i11 = this.f1495a - 1;
        this.f1495a = i11;
        if (i11 <= 0) {
            this.f1496b[0] = null;
            return t11;
        }
        a[] aVarArr = this.f1496b;
        a aVar = aVarArr[i11];
        aVarArr[i11] = null;
        int i12 = t11.f1499b;
        aVarArr[i12] = aVar;
        if ((aVar.f1498a < t11.f1498a) ^ this.f1497c) {
            l(i12);
            return t11;
        }
        e(i12);
        return t11;
    }

    public void k(T t11, float f11) {
        float f12 = t11.f1498a;
        t11.f1498a = f11;
        if ((f11 < f12) ^ this.f1497c) {
            l(t11.f1499b);
        } else {
            e(t11.f1499b);
        }
    }

    public final void l(int i11) {
        a[] aVarArr = this.f1496b;
        a aVar = aVarArr[i11];
        float f11 = aVar.f1498a;
        while (i11 > 0) {
            int i12 = (i11 - 1) >> 1;
            a aVar2 = aVarArr[i12];
            if (!((f11 < aVar2.f1498a) ^ this.f1497c)) {
                break;
            }
            aVarArr[i11] = aVar2;
            aVar2.f1499b = i11;
            i11 = i12;
        }
        aVarArr[i11] = aVar;
        aVar.f1499b = i11;
    }

    public String toString() {
        if (this.f1495a == 0) {
            return okhttp3.i.f77289p;
        }
        a[] aVarArr = this.f1496b;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.n(aVarArr[0].f1498a);
        for (int i11 = 1; i11 < this.f1495a; i11++) {
            y0Var.O(j2.O);
            y0Var.n(aVarArr[i11].f1498a);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public e(int i11, boolean z11) {
        this.f1497c = z11;
        this.f1496b = new a[i11];
    }
}
