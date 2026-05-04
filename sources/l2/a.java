package l2;

import a3.j0;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends l2.b {

    /* renamed from: f, reason: collision with root package name */
    public final j0<b> f69130f;

    /* renamed from: g, reason: collision with root package name */
    public b f69131g;

    /* renamed from: h, reason: collision with root package name */
    public b f69132h;

    /* renamed from: i, reason: collision with root package name */
    public float f69133i;

    /* renamed from: j, reason: collision with root package name */
    public b f69134j;

    /* renamed from: k, reason: collision with root package name */
    public float f69135k;

    /* renamed from: l, reason: collision with root package name */
    public float f69136l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69137m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69138n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69139o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69140p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l2.a$a, reason: collision with other inner class name */
    public class C0833a extends j0<b> {
        public C0833a() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b g() {
            return new b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public c f69142a;

        /* renamed from: b, reason: collision with root package name */
        public c2.a f69143b;

        /* renamed from: c, reason: collision with root package name */
        public float f69144c;

        /* renamed from: d, reason: collision with root package name */
        public float f69145d;

        /* renamed from: e, reason: collision with root package name */
        public float f69146e;

        /* renamed from: f, reason: collision with root package name */
        public float f69147f;

        /* renamed from: g, reason: collision with root package name */
        public int f69148g;

        public float a(float f11) {
            int i11;
            c cVar;
            if (this.f69148g == 0 || this.f69143b == null) {
                return f11;
            }
            float f12 = this.f69144c * f11;
            if (com.badlogic.gdx.math.n.z(this.f69147f)) {
                i11 = 1;
            } else {
                float f13 = this.f69145d + f12;
                this.f69145d = f13;
                if (this.f69144c < 0.0f) {
                    float f14 = this.f69147f;
                    float f15 = f14 - f13;
                    i11 = (int) Math.abs(f15 / f14);
                    this.f69145d = this.f69147f - Math.abs(f15 % this.f69147f);
                } else {
                    i11 = (int) Math.abs(f13 / this.f69147f);
                    this.f69145d = Math.abs(this.f69145d % this.f69147f);
                }
            }
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = this.f69148g;
                if (i13 > 0) {
                    this.f69148g = i13 - 1;
                }
                if (this.f69148g != 0 && (cVar = this.f69142a) != null) {
                    cVar.b(this);
                }
                if (this.f69148g == 0) {
                    float f16 = this.f69147f;
                    float f17 = ((i11 - 1) - i12) * f16;
                    float f18 = this.f69145d;
                    if (f12 < 0.0f) {
                        f18 = f16 - f18;
                    }
                    float f19 = f17 + f18;
                    this.f69145d = f12 >= 0.0f ? f16 : 0.0f;
                    c cVar2 = this.f69142a;
                    if (cVar2 != null) {
                        cVar2.a(this);
                    }
                    return f19;
                }
            }
            return -1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(b bVar);

        void b(b bVar);
    }

    public a(x1.h hVar) {
        super(hVar);
        this.f69130f = new C0833a();
        this.f69140p = false;
    }

    public final b A(String str, float f11, float f12, int i11, float f13, c cVar) {
        if (str == null) {
            return null;
        }
        c2.a n11 = this.f69153c.n(str);
        if (n11 != null) {
            return z(n11, f11, f12, i11, f13, cVar);
        }
        throw new GdxRuntimeException("Unknown animation: " + str);
    }

    public final b B(b bVar) {
        return z(bVar.f69143b, bVar.f69146e, bVar.f69147f, bVar.f69148g, bVar.f69144c, bVar.f69142a);
    }

    public b C(c2.a aVar, float f11, float f12, int i11, float f13, c cVar, float f14) {
        return F(z(aVar, f11, f12, i11, f13, cVar), f14);
    }

    public b D(String str, float f11, float f12, int i11, float f13, c cVar, float f14) {
        return F(A(str, f11, f12, i11, f13, cVar), f14);
    }

    public b E(String str, int i11, float f11, c cVar, float f12) {
        return D(str, 0.0f, -1.0f, i11, f11, cVar, f12);
    }

    public b F(b bVar, float f11) {
        b bVar2 = this.f69131g;
        if (bVar2 == null || bVar2.f69148g == 0) {
            y(bVar, f11);
            return bVar;
        }
        b bVar3 = this.f69132h;
        if (bVar3 != null) {
            this.f69130f.d(bVar3);
        }
        this.f69132h = bVar;
        this.f69133i = f11;
        b bVar4 = this.f69131g;
        if (bVar4.f69148g < 0) {
            bVar4.f69148g = 1;
        }
        return bVar;
    }

    public b G(c2.a aVar, float f11, float f12, int i11, float f13, c cVar) {
        return N(z(aVar, f11, f12, i11, f13, cVar));
    }

    public b H(String str) {
        return K(str, 1, 1.0f, null);
    }

    public b I(String str, float f11, float f12, int i11, float f13, c cVar) {
        return N(A(str, f11, f12, i11, f13, cVar));
    }

    public b J(String str, int i11) {
        return K(str, i11, 1.0f, null);
    }

    public b K(String str, int i11, float f11, c cVar) {
        return I(str, 0.0f, -1.0f, i11, f11, cVar);
    }

    public b L(String str, int i11, c cVar) {
        return K(str, i11, 1.0f, cVar);
    }

    public b M(String str, c cVar) {
        return K(str, 1, 1.0f, cVar);
    }

    public b N(b bVar) {
        b bVar2 = this.f69131g;
        if (bVar2 == null) {
            this.f69131g = bVar;
        } else {
            if (this.f69139o || bVar == null || bVar2.f69143b != bVar.f69143b) {
                n(bVar2.f69143b);
            } else {
                bVar.f69145d = bVar2.f69145d;
            }
            this.f69130f.d(this.f69131g);
            this.f69131g = bVar;
        }
        this.f69140p = true;
        return bVar;
    }

    public void O(float f11) {
        b bVar;
        if (!this.f69138n) {
            b bVar2 = this.f69134j;
            if (bVar2 != null) {
                float f12 = this.f69135k + f11;
                this.f69135k = f12;
                if (f12 >= this.f69136l) {
                    n(bVar2.f69143b);
                    this.f69140p = true;
                    this.f69130f.d(this.f69134j);
                    this.f69134j = null;
                }
            }
            if (this.f69140p) {
                this.f69153c.d();
                this.f69140p = false;
            }
            b bVar3 = this.f69131g;
            if (bVar3 != null && bVar3.f69148g != 0 && bVar3.f69143b != null) {
                float a11 = bVar3.a(f11);
                if (a11 < 0.0f || (bVar = this.f69132h) == null) {
                    b bVar4 = this.f69134j;
                    if (bVar4 == null) {
                        b bVar5 = this.f69131g;
                        b(bVar5.f69143b, bVar5.f69146e + bVar5.f69145d);
                        return;
                    } else {
                        c2.a aVar = bVar4.f69143b;
                        float f13 = bVar4.f69146e + bVar4.f69145d;
                        b bVar6 = this.f69131g;
                        d(aVar, f13, bVar6.f69143b, bVar6.f69146e + bVar6.f69145d, this.f69135k / this.f69136l);
                        return;
                    }
                }
                this.f69137m = false;
                y(bVar, this.f69133i);
                this.f69132h = null;
                if (a11 > 0.0f) {
                    O(a11);
                }
            }
        }
    }

    public b o(c2.a aVar, float f11, float f12, int i11, float f13, c cVar, float f14) {
        return r(z(aVar, f11, f12, i11, f13, cVar), f14);
    }

    public b p(String str, float f11, float f12, int i11, float f13, c cVar, float f14) {
        return r(A(str, f11, f12, i11, f13, cVar), f14);
    }

    public b q(String str, int i11, float f11, c cVar, float f12) {
        return p(str, 0.0f, -1.0f, i11, f11, cVar, f12);
    }

    public b r(b bVar, float f11) {
        if (bVar.f69148g < 0) {
            throw new GdxRuntimeException("An action cannot be continuous");
        }
        b bVar2 = this.f69131g;
        if (bVar2 == null || bVar2.f69148g == 0) {
            y(bVar, f11);
            return bVar;
        }
        b B = this.f69137m ? null : B(bVar2);
        this.f69137m = false;
        y(bVar, f11);
        this.f69137m = true;
        if (B != null) {
            F(B, f11);
        }
        return bVar;
    }

    public b s(c2.a aVar, float f11, float f12, int i11, float f13, c cVar, float f14) {
        return y(z(aVar, f11, f12, i11, f13, cVar), f14);
    }

    public b t(String str, float f11) {
        return v(str, 1, 1.0f, null, f11);
    }

    public b u(String str, float f11, float f12, int i11, float f13, c cVar, float f14) {
        return y(A(str, f11, f12, i11, f13, cVar), f14);
    }

    public b v(String str, int i11, float f11, c cVar, float f12) {
        return u(str, 0.0f, -1.0f, i11, f11, cVar, f12);
    }

    public b w(String str, int i11, c cVar, float f11) {
        return v(str, i11, 1.0f, cVar, f11);
    }

    public b x(String str, c cVar, float f11) {
        return v(str, 1, 1.0f, cVar, f11);
    }

    public b y(b bVar, float f11) {
        b bVar2 = this.f69131g;
        if (bVar2 == null || bVar2.f69148g == 0) {
            this.f69131g = bVar;
            return bVar;
        }
        if (this.f69137m) {
            F(bVar, f11);
            return bVar;
        }
        if (!this.f69139o && bVar != null && bVar2.f69143b == bVar.f69143b) {
            bVar.f69145d = bVar2.f69145d;
            this.f69130f.d(bVar2);
            this.f69131g = bVar;
            return bVar;
        }
        b bVar3 = this.f69134j;
        if (bVar3 != null) {
            n(bVar3.f69143b);
            this.f69130f.d(this.f69134j);
        }
        this.f69134j = this.f69131g;
        this.f69131g = bVar;
        this.f69135k = 0.0f;
        this.f69136l = f11;
        return bVar;
    }

    public final b z(c2.a aVar, float f11, float f12, int i11, float f13, c cVar) {
        if (aVar == null) {
            return null;
        }
        b h11 = this.f69130f.h();
        h11.f69143b = aVar;
        h11.f69142a = cVar;
        h11.f69148g = i11;
        h11.f69144c = f13;
        h11.f69146e = f11;
        if (f12 < 0.0f) {
            f12 = aVar.f7483b - f11;
        }
        h11.f69147f = f12;
        h11.f69145d = f13 < 0.0f ? f12 : 0.0f;
        return h11;
    }
}
