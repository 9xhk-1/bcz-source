package z2;

import a3.d0;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.utils.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: t, reason: collision with root package name */
    public static final Vector2 f100668t = new Vector2();

    /* renamed from: a, reason: collision with root package name */
    public c f100669a;

    /* renamed from: b, reason: collision with root package name */
    public b f100670b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f100671c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f100672d;

    /* renamed from: e, reason: collision with root package name */
    public d f100673e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100674f;

    /* renamed from: j, reason: collision with root package name */
    public int f100678j;

    /* renamed from: m, reason: collision with root package name */
    public float f100681m;

    /* renamed from: n, reason: collision with root package name */
    public float f100682n;

    /* renamed from: o, reason: collision with root package name */
    public long f100683o;

    /* renamed from: g, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f100675g = new com.badlogic.gdx.utils.a<>(8);

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.utils.l<c, i> f100676h = new com.badlogic.gdx.utils.l<>(8);

    /* renamed from: i, reason: collision with root package name */
    public float f100677i = 8.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f100679k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f100680l = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public int f100684p = 250;

    /* renamed from: q, reason: collision with root package name */
    public int f100685q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f100686r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f100687s = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends i {

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ c f100688p;

        public a(c cVar) {
            this.f100688p = cVar;
        }

        @Override // z2.i
        public void m(InputEvent inputEvent, float f11, float f12, int i11) {
            float f13;
            float f14;
            d dVar;
            h hVar = h.this;
            if (hVar.f100670b != null && i11 == hVar.f100685q) {
                this.f100688p.a(inputEvent, f11, f12, i11);
                com.badlogic.gdx.scenes.scene2d.c d11 = inputEvent.d();
                com.badlogic.gdx.scenes.scene2d.a aVar = h.this.f100671c;
                if (aVar != null) {
                    f13 = aVar.K1();
                    f14 = aVar.M1();
                    aVar.C2(2.14748365E9f, 2.14748365E9f);
                } else {
                    f13 = 0.0f;
                    f14 = 0.0f;
                }
                float x11 = inputEvent.x() + h.this.f100681m;
                float y11 = inputEvent.y() + h.this.f100682n;
                com.badlogic.gdx.scenes.scene2d.a x12 = inputEvent.d().x1(x11, y11, true);
                if (x12 == null) {
                    x12 = inputEvent.d().x1(x11, y11, false);
                }
                if (aVar != null) {
                    aVar.C2(f13, f14);
                }
                h hVar2 = h.this;
                hVar2.f100674f = false;
                if (x12 != null) {
                    int i12 = hVar2.f100675g.f13179b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        d dVar2 = h.this.f100675g.get(i13);
                        if (dVar2.f100695a.U1(x12)) {
                            dVar2.f100695a.X2(h.f100668t.set(x11, y11));
                            dVar = dVar2;
                            break;
                        }
                    }
                }
                dVar = null;
                h hVar3 = h.this;
                d dVar3 = hVar3.f100673e;
                if (dVar != dVar3) {
                    if (dVar3 != null) {
                        dVar3.d(this.f100688p, hVar3.f100670b);
                    }
                    h.this.f100673e = dVar;
                }
                if (dVar != null) {
                    h hVar4 = h.this;
                    c cVar = this.f100688p;
                    b bVar = hVar4.f100670b;
                    Vector2 vector2 = h.f100668t;
                    hVar4.f100674f = dVar.a(cVar, bVar, vector2.f12535x, vector2.f12536y, i11);
                }
                h hVar5 = h.this;
                com.badlogic.gdx.scenes.scene2d.a aVar2 = hVar5.f100673e != null ? hVar5.f100674f ? hVar5.f100670b.f100691b : hVar5.f100670b.f100692c : null;
                if (aVar2 == null) {
                    aVar2 = hVar5.f100670b.f100690a;
                }
                if (aVar2 != aVar) {
                    if (aVar != null && hVar5.f100672d) {
                        aVar.j2();
                    }
                    h hVar6 = h.this;
                    hVar6.f100671c = aVar2;
                    hVar6.f100672d = aVar2.F1() == null;
                    if (h.this.f100672d) {
                        d11.Q0(aVar2);
                    }
                }
                if (aVar2 == null) {
                    return;
                }
                float x13 = (inputEvent.x() - aVar2.J1()) + h.this.f100679k;
                float y12 = inputEvent.y();
                h hVar7 = h.this;
                float f15 = y12 + hVar7.f100680l;
                if (hVar7.f100687s) {
                    if (x13 < 0.0f) {
                        x13 = 0.0f;
                    }
                    float f16 = f15 >= 0.0f ? f15 : 0.0f;
                    if (aVar2.J1() + x13 > d11.w1()) {
                        x13 = d11.w1() - aVar2.J1();
                    }
                    f15 = aVar2.v1() + f16 > d11.r1() ? d11.r1() - aVar2.v1() : f16;
                }
                aVar2.C2(x13, f15);
            }
        }

        @Override // z2.i
        public void n(InputEvent inputEvent, float f11, float f12, int i11) {
            com.badlogic.gdx.scenes.scene2d.c F1;
            h hVar = h.this;
            if (hVar.f100685q != -1) {
                inputEvent.p();
                return;
            }
            hVar.f100685q = i11;
            long currentTimeMillis = System.currentTimeMillis();
            h hVar2 = h.this;
            hVar.f100683o = currentTimeMillis + hVar2.f100684p;
            c cVar = this.f100688p;
            hVar2.f100669a = cVar;
            hVar2.f100670b = cVar.b(inputEvent, A(), B(), i11);
            inputEvent.p();
            h hVar3 = h.this;
            if (!hVar3.f100686r || hVar3.f100670b == null || (F1 = this.f100688p.d().F1()) == null) {
                return;
            }
            F1.f1(this, this.f100688p.d());
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
        @Override // z2.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void o(com.badlogic.gdx.scenes.scene2d.InputEvent r12, float r13, float r14, int r15) {
            /*
                Method dump skipped, instructions count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z2.h.a.o(com.badlogic.gdx.scenes.scene2d.InputEvent, float, float, int):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @d0
        public com.badlogic.gdx.scenes.scene2d.a f100690a;

        /* renamed from: b, reason: collision with root package name */
        @d0
        public com.badlogic.gdx.scenes.scene2d.a f100691b;

        /* renamed from: c, reason: collision with root package name */
        @d0
        public com.badlogic.gdx.scenes.scene2d.a f100692c;

        /* renamed from: d, reason: collision with root package name */
        @d0
        public Object f100693d;

        @d0
        public com.badlogic.gdx.scenes.scene2d.a a() {
            return this.f100690a;
        }

        @d0
        public com.badlogic.gdx.scenes.scene2d.a b() {
            return this.f100692c;
        }

        @d0
        public Object c() {
            return this.f100693d;
        }

        @d0
        public com.badlogic.gdx.scenes.scene2d.a d() {
            return this.f100691b;
        }

        public void e(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            this.f100690a = aVar;
        }

        public void f(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            this.f100692c = aVar;
        }

        public void g(@d0 Object obj) {
            this.f100693d = obj;
        }

        public void h(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            this.f100691b = aVar;
        }
    }

    public void a(c cVar) {
        a aVar = new a(cVar);
        aVar.G(this.f100677i);
        aVar.D(this.f100678j);
        cVar.f100694a.c1(aVar);
        this.f100676h.r(cVar, aVar);
    }

    public void b(d dVar) {
        this.f100675g.a(dVar);
    }

    public void c(c cVar) {
        com.badlogic.gdx.scenes.scene2d.c F1;
        i k11 = this.f100676h.k(cVar);
        if (k11 == null || (F1 = cVar.d().F1()) == null) {
            return;
        }
        F1.f1(k11, cVar.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        this.f100675g.clear();
        l.a<c, i> it = this.f100676h.g().iterator();
        while (it.hasNext()) {
            l.b next = it.next();
            ((c) next.f13394a).f100694a.l2((x2.c) next.f13395b);
        }
        this.f100676h.a(8);
    }

    @d0
    public com.badlogic.gdx.scenes.scene2d.a e() {
        return this.f100671c;
    }

    @d0
    public b f() {
        return this.f100670b;
    }

    @d0
    public c g() {
        return this.f100669a;
    }

    public int h() {
        return this.f100684p;
    }

    public boolean i() {
        return this.f100670b != null && System.currentTimeMillis() >= this.f100683o;
    }

    public boolean j() {
        return this.f100670b != null;
    }

    public void k(c cVar) {
        cVar.f100694a.l2(this.f100676h.u(cVar));
    }

    public void l(d dVar) {
        this.f100675g.C(dVar, true);
    }

    public void m(int i11) {
        this.f100678j = i11;
    }

    public void n(boolean z11) {
        this.f100686r = z11;
    }

    public void o(float f11, float f12) {
        this.f100679k = f11;
        this.f100680l = f12;
    }

    public void p(int i11) {
        this.f100684p = i11;
    }

    public void q(boolean z11) {
        this.f100687s = z11;
    }

    public void r(float f11) {
        this.f100677i = f11;
    }

    public void s(float f11, float f12) {
        this.f100681m = f11;
        this.f100682n = f12;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final com.badlogic.gdx.scenes.scene2d.a f100695a;

        public d(com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            this.f100695a = aVar;
            com.badlogic.gdx.scenes.scene2d.c F1 = aVar.F1();
            if (F1 != null && aVar == F1.t1()) {
                throw new IllegalArgumentException("The stage root cannot be a drag and drop target.");
            }
        }

        public abstract boolean a(c cVar, b bVar, float f11, float f12, int i11);

        public abstract void b(c cVar, b bVar, float f11, float f12, int i11);

        public com.badlogic.gdx.scenes.scene2d.a c() {
            return this.f100695a;
        }

        public void d(c cVar, b bVar) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.badlogic.gdx.scenes.scene2d.a f100694a;

        public c(com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            this.f100694a = aVar;
        }

        @d0
        public abstract b b(InputEvent inputEvent, float f11, float f12, int i11);

        public com.badlogic.gdx.scenes.scene2d.a d() {
            return this.f100694a;
        }

        public void a(InputEvent inputEvent, float f11, float f12, int i11) {
        }

        public void c(InputEvent inputEvent, float f11, float f12, int i11, @d0 b bVar, @d0 d dVar) {
        }
    }
}
