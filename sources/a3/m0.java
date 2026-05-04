package a3;

import a3.j0;
import com.badlogic.gdx.math.Rectangle;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m0 implements j0.a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f1577n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f1578o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f1579p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f1580q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final j0<m0> f1581r = new a(128, 4096);

    /* renamed from: a, reason: collision with root package name */
    public final int f1582a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1583b;

    /* renamed from: c, reason: collision with root package name */
    public float f1584c;

    /* renamed from: d, reason: collision with root package name */
    public float f1585d;

    /* renamed from: e, reason: collision with root package name */
    public float f1586e;

    /* renamed from: f, reason: collision with root package name */
    public float f1587f;

    /* renamed from: g, reason: collision with root package name */
    public int f1588g;

    /* renamed from: h, reason: collision with root package name */
    @d0
    public m0 f1589h;

    /* renamed from: i, reason: collision with root package name */
    @d0
    public m0 f1590i;

    /* renamed from: j, reason: collision with root package name */
    @d0
    public m0 f1591j;

    /* renamed from: k, reason: collision with root package name */
    @d0
    public m0 f1592k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f1593l;

    /* renamed from: m, reason: collision with root package name */
    public int f1594m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0 {
        public a(int i11, int i12) {
            super(i11, i12);
        }

        @Override // a3.j0
        public Object g() {
            return new m0();
        }
    }

    public m0() {
        this(16, 8);
    }

    public void a(float f11, float f12, float f13) {
        int i11 = this.f1594m;
        if (i11 == -1) {
            b(f11, f12, f13);
            return;
        }
        if (this.f1588g >= this.f1583b) {
            float[] fArr = this.f1593l;
            if (i11 == fArr.length) {
                this.f1593l = Arrays.copyOf(fArr, d());
            }
        } else if (i11 == this.f1582a) {
            k(f11, f12, f13);
            return;
        }
        float[] fArr2 = this.f1593l;
        fArr2[i11] = f11;
        fArr2[i11 + 1] = f12;
        fArr2[i11 + 2] = f13;
        this.f1594m += 3;
    }

    public final void b(float f11, float f12, float f13) {
        m0 m0Var;
        float f14 = this.f1586e / 2.0f;
        float f15 = this.f1587f / 2.0f;
        float f16 = this.f1584c;
        if (f12 < f16 + f14) {
            float f17 = this.f1585d;
            if (f13 < f17 + f15) {
                m0Var = this.f1591j;
                if (m0Var == null) {
                    m0Var = f(f16, f17, f14, f15, this.f1588g + 1);
                    this.f1591j = m0Var;
                }
            } else {
                m0Var = this.f1589h;
                if (m0Var == null) {
                    m0Var = f(f16, f17 + f15, f14, f15, this.f1588g + 1);
                    this.f1589h = m0Var;
                }
            }
        } else {
            float f18 = this.f1585d;
            if (f13 < f18 + f15) {
                m0Var = this.f1592k;
                if (m0Var == null) {
                    m0Var = f(f16 + f14, f18, f14, f15, this.f1588g + 1);
                    this.f1592k = m0Var;
                }
            } else {
                m0Var = this.f1590i;
                if (m0Var == null) {
                    m0Var = f(f16 + f14, f18 + f15, f14, f15, this.f1588g + 1);
                    this.f1590i = m0Var;
                }
            }
        }
        m0Var.a(f11, f12, f13);
    }

    public final void c(float f11, float f12, r rVar) {
        float f13 = this.f1584c;
        if (f13 >= f11 || f13 + this.f1586e <= f11) {
            return;
        }
        float f14 = this.f1585d;
        if (f14 >= f12 || f14 + this.f1587f <= f12) {
            return;
        }
        int i11 = this.f1594m;
        if (i11 == -1) {
            m0 m0Var = this.f1589h;
            if (m0Var != null) {
                m0Var.c(f11, f12, rVar);
            }
            m0 m0Var2 = this.f1591j;
            if (m0Var2 != null) {
                m0Var2.c(f11, f12, rVar);
            }
            m0 m0Var3 = this.f1590i;
            if (m0Var3 != null) {
                m0Var3.c(f11, f12, rVar);
            }
            m0 m0Var4 = this.f1592k;
            if (m0Var4 != null) {
                m0Var4.c(f11, f12, rVar);
                return;
            }
            return;
        }
        float m11 = rVar.m();
        float n11 = rVar.n(1);
        float n12 = rVar.n(2);
        float n13 = rVar.n(3);
        float[] fArr = this.f1593l;
        for (int i12 = 1; i12 < i11; i12 += 3) {
            float f15 = fArr[i12];
            float f16 = fArr[i12 + 1];
            float f17 = f15 - f11;
            float f18 = f16 - f12;
            float f19 = (f17 * f17) + (f18 * f18);
            if (f19 < n13) {
                m11 = fArr[i12 - 1];
                n11 = f15;
                n12 = f16;
                n13 = f19;
            }
        }
        rVar.H(0, m11);
        rVar.H(1, n11);
        rVar.H(2, n12);
        rVar.H(3, n13);
    }

    public int d() {
        return this.f1594m + 30;
    }

    public boolean e(float f11, float f12, r rVar) {
        rVar.i();
        rVar.a(0.0f);
        rVar.a(0.0f);
        rVar.a(0.0f);
        rVar.a(Float.POSITIVE_INFINITY);
        c(f11, f12, rVar);
        float m11 = rVar.m();
        float n11 = rVar.n(1);
        float n12 = rVar.n(2);
        float n13 = rVar.n(3);
        boolean z11 = n13 != Float.POSITIVE_INFINITY;
        if (!z11) {
            float max = Math.max(this.f1586e, this.f1587f);
            n13 = max * max;
        }
        rVar.i();
        h(f11, f12, (float) Math.sqrt(n13), rVar);
        int i11 = rVar.f1626b;
        for (int i12 = 3; i12 < i11; i12 += 4) {
            float n14 = rVar.n(i12);
            if (n14 < n13) {
                m11 = rVar.n(i12 - 3);
                n11 = rVar.n(i12 - 2);
                n12 = rVar.n(i12 - 1);
                n13 = n14;
            }
        }
        if (!z11 && rVar.t()) {
            return false;
        }
        rVar.i();
        rVar.a(m11);
        rVar.a(n11);
        rVar.a(n12);
        rVar.a(n13);
        return true;
    }

    public final m0 f(float f11, float f12, float f13, float f14, int i11) {
        m0 h11 = f1581r.h();
        h11.f1584c = f11;
        h11.f1585d = f12;
        h11.f1586e = f13;
        h11.f1587f = f14;
        h11.f1588g = i11;
        return h11;
    }

    public final void g(float f11, float f12, float f13, float f14, float f15, float f16, r rVar) {
        float f17 = this.f1584c;
        if (f17 >= f14 + f16 || f17 + this.f1586e <= f14) {
            return;
        }
        float f18 = this.f1585d;
        if (f18 >= f15 + f16 || f18 + this.f1587f <= f15) {
            return;
        }
        int i11 = this.f1594m;
        if (i11 == -1) {
            m0 m0Var = this.f1589h;
            if (m0Var != null) {
                m0Var.g(f11, f12, f13, f14, f15, f16, rVar);
            }
            m0 m0Var2 = this.f1591j;
            if (m0Var2 != null) {
                m0Var2.g(f11, f12, f13, f14, f15, f16, rVar);
            }
            m0 m0Var3 = this.f1590i;
            if (m0Var3 != null) {
                m0Var3.g(f11, f12, f13, f14, f15, f16, rVar);
            }
            m0 m0Var4 = this.f1592k;
            if (m0Var4 != null) {
                m0Var4.g(f11, f12, f13, f14, f15, f16, rVar);
                return;
            }
            return;
        }
        float[] fArr = this.f1593l;
        for (int i12 = 1; i12 < i11; i12 += 3) {
            float f19 = fArr[i12];
            float f21 = fArr[i12 + 1];
            float f22 = f19 - f11;
            float f23 = f21 - f12;
            float f24 = (f22 * f22) + (f23 * f23);
            if (f24 <= f13) {
                rVar.a(fArr[i12 - 1]);
                rVar.a(f19);
                rVar.a(f21);
                rVar.a(f24);
            }
        }
    }

    public void h(float f11, float f12, float f13, r rVar) {
        g(f11, f12, f13 * f13, f11 - f13, f12 - f13, f13 * 2.0f, rVar);
    }

    public void i(Rectangle rectangle, r rVar) {
        float f11 = this.f1584c;
        float f12 = rectangle.f12533x;
        if (f11 >= rectangle.width + f12 || f11 + this.f1586e <= f12) {
            return;
        }
        float f13 = this.f1585d;
        float f14 = rectangle.f12534y;
        if (f13 >= rectangle.height + f14 || f13 + this.f1587f <= f14) {
            return;
        }
        int i11 = this.f1594m;
        if (i11 != -1) {
            float[] fArr = this.f1593l;
            for (int i12 = 1; i12 < i11; i12 += 3) {
                float f15 = fArr[i12];
                float f16 = fArr[i12 + 1];
                if (rectangle.contains(f15, f16)) {
                    rVar.a(fArr[i12 - 1]);
                    rVar.a(f15);
                    rVar.a(f16);
                }
            }
            return;
        }
        m0 m0Var = this.f1589h;
        if (m0Var != null) {
            m0Var.i(rectangle, rVar);
        }
        m0 m0Var2 = this.f1591j;
        if (m0Var2 != null) {
            m0Var2.i(rectangle, rVar);
        }
        m0 m0Var3 = this.f1590i;
        if (m0Var3 != null) {
            m0Var3.i(rectangle, rVar);
        }
        m0 m0Var4 = this.f1592k;
        if (m0Var4 != null) {
            m0Var4.i(rectangle, rVar);
        }
    }

    public void j(float f11, float f12, float f13, float f14) {
        this.f1584c = f11;
        this.f1585d = f12;
        this.f1586e = f13;
        this.f1587f = f14;
    }

    public final void k(float f11, float f12, float f13) {
        float[] fArr = this.f1593l;
        for (int i11 = 0; i11 < this.f1582a; i11 += 3) {
            b(fArr[i11], fArr[i11 + 1], fArr[i11 + 2]);
        }
        this.f1594m = -1;
        b(f11, f12, f13);
    }

    @Override // a3.j0.a
    public void reset() {
        if (this.f1594m == -1) {
            m0 m0Var = this.f1589h;
            if (m0Var != null) {
                f1581r.d(m0Var);
                this.f1589h = null;
            }
            m0 m0Var2 = this.f1591j;
            if (m0Var2 != null) {
                f1581r.d(m0Var2);
                this.f1591j = null;
            }
            m0 m0Var3 = this.f1590i;
            if (m0Var3 != null) {
                f1581r.d(m0Var3);
                this.f1590i = null;
            }
            m0 m0Var4 = this.f1592k;
            if (m0Var4 != null) {
                f1581r.d(m0Var4);
                this.f1592k = null;
            }
        }
        this.f1594m = 0;
        int length = this.f1593l.length;
        int i11 = this.f1582a;
        if (length > i11) {
            this.f1593l = new float[i11];
        }
    }

    public m0(int i11, int i12) {
        int i13 = i11 * 3;
        this.f1582a = i13;
        this.f1583b = i12;
        this.f1593l = new float[i13];
    }
}
