package com.esotericsoftware.spine;

import a3.d0;
import a3.j0;
import a3.r;
import a3.u0;
import a3.v;
import com.badlogic.gdx.utils.m;
import com.esotericsoftware.spine.Animation;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: k, reason: collision with root package name */
    public static final Animation f29208k = new Animation("<empty>", new com.badlogic.gdx.utils.a(0), 0.0f);

    /* renamed from: l, reason: collision with root package name */
    public static final int f29209l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f29210m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f29211n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f29212o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f29213p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f29214q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f29215r = 2;

    /* renamed from: a, reason: collision with root package name */
    public jl.a f29216a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29222g;

    /* renamed from: i, reason: collision with root package name */
    public int f29224i;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<g> f29217b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<jl.c> f29218c = new com.badlogic.gdx.utils.a<>();

    /* renamed from: d, reason: collision with root package name */
    public final u0<d> f29219d = new u0<>();

    /* renamed from: e, reason: collision with root package name */
    public final e f29220e = new e();

    /* renamed from: f, reason: collision with root package name */
    public final m<String> f29221f = new m<>();

    /* renamed from: h, reason: collision with root package name */
    public float f29223h = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public final j0<g> f29225j = new C0342a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.esotericsoftware.spine.a$a, reason: collision with other inner class name */
    public class C0342a extends j0 {
        public C0342a() {
        }

        @Override // a3.j0
        public Object g() {
            return new g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29227a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29228b;

        static {
            int[] iArr = new int[f.values().length];
            f29228b = iArr;
            try {
                iArr[f.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29228b[f.interrupt.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29228b[f.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29228b[f.dispose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29228b[f.complete.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29228b[f.event.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Animation.MixBlend.values().length];
            f29227a = iArr2;
            try {
                iArr2[Animation.MixBlend.setup.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29227a[Animation.MixBlend.first.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);

        void d(g gVar, jl.c cVar);

        void e(g gVar);

        void f(g gVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a f29229a = new com.badlogic.gdx.utils.a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f29230b;

        public e() {
        }

        public void a() {
            this.f29229a.clear();
        }

        public void b(g gVar) {
            this.f29229a.a(f.complete);
            this.f29229a.a(gVar);
        }

        public void c(g gVar) {
            this.f29229a.a(f.dispose);
            this.f29229a.a(gVar);
        }

        public void d() {
            if (this.f29230b) {
                return;
            }
            this.f29230b = true;
            u0<d> u0Var = a.this.f29219d;
            int i11 = 0;
            while (true) {
                com.badlogic.gdx.utils.a aVar = this.f29229a;
                if (i11 >= aVar.f13179b) {
                    a();
                    this.f29230b = false;
                    return;
                }
                f fVar = (f) aVar.get(i11);
                int i12 = i11 + 1;
                g gVar = (g) this.f29229a.get(i12);
                int i13 = u0Var.f13179b;
                d[] U = u0Var.U();
                switch (b.f29228b[fVar.ordinal()]) {
                    case 1:
                        d dVar = gVar.f29244f;
                        if (dVar != null) {
                            dVar.f(gVar);
                        }
                        for (int i14 = 0; i14 < i13; i14++) {
                            U[i14].f(gVar);
                        }
                        continue;
                    case 2:
                        d dVar2 = gVar.f29244f;
                        if (dVar2 != null) {
                            dVar2.e(gVar);
                        }
                        for (int i15 = 0; i15 < i13; i15++) {
                            U[i15].e(gVar);
                        }
                        continue;
                    case 3:
                        d dVar3 = gVar.f29244f;
                        if (dVar3 != null) {
                            dVar3.a(gVar);
                        }
                        for (int i16 = 0; i16 < i13; i16++) {
                            U[i16].a(gVar);
                        }
                        break;
                    case 5:
                        d dVar4 = gVar.f29244f;
                        if (dVar4 != null) {
                            dVar4.c(gVar);
                        }
                        for (int i17 = 0; i17 < i13; i17++) {
                            U[i17].c(gVar);
                        }
                        continue;
                    case 6:
                        jl.c cVar = (jl.c) this.f29229a.get(i11 + 2);
                        d dVar5 = gVar.f29244f;
                        if (dVar5 != null) {
                            dVar5.d(gVar, cVar);
                        }
                        for (int i18 = 0; i18 < i13; i18++) {
                            U[i18].d(gVar, cVar);
                        }
                        i11 = i12;
                        continue;
                }
                d dVar6 = gVar.f29244f;
                if (dVar6 != null) {
                    dVar6.b(gVar);
                }
                for (int i19 = 0; i19 < i13; i19++) {
                    U[i19].b(gVar);
                }
                a.this.f29225j.d(gVar);
                u0Var.V();
                i11 += 2;
            }
        }

        public void e(g gVar) {
            this.f29229a.a(f.end);
            this.f29229a.a(gVar);
            a.this.f29222g = true;
        }

        public void f(g gVar, jl.c cVar) {
            this.f29229a.a(f.event);
            this.f29229a.a(gVar);
            this.f29229a.a(cVar);
        }

        public void g(g gVar) {
            this.f29229a.a(f.interrupt);
            this.f29229a.a(gVar);
        }

        public void h(g gVar) {
            this.f29229a.a(f.start);
            this.f29229a.a(gVar);
            a.this.f29222g = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum f {
        start,
        interrupt,
        end,
        dispose,
        complete,
        event
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements j0.a {
        public float A;
        public float B;
        public float C;
        public float D;
        public Animation.MixBlend E = Animation.MixBlend.replace;
        public final v F = new v();
        public final com.badlogic.gdx.utils.a<g> G = new com.badlogic.gdx.utils.a<>();
        public final r H = new r();

        /* renamed from: a, reason: collision with root package name */
        public Animation f29239a;

        /* renamed from: b, reason: collision with root package name */
        @d0
        public g f29240b;

        /* renamed from: c, reason: collision with root package name */
        @d0
        public g f29241c;

        /* renamed from: d, reason: collision with root package name */
        @d0
        public g f29242d;

        /* renamed from: e, reason: collision with root package name */
        @d0
        public g f29243e;

        /* renamed from: f, reason: collision with root package name */
        @d0
        public d f29244f;

        /* renamed from: g, reason: collision with root package name */
        public int f29245g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f29246h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f29247i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f29248j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f29249k;

        /* renamed from: l, reason: collision with root package name */
        public float f29250l;

        /* renamed from: m, reason: collision with root package name */
        public float f29251m;

        /* renamed from: n, reason: collision with root package name */
        public float f29252n;

        /* renamed from: o, reason: collision with root package name */
        public float f29253o;

        /* renamed from: p, reason: collision with root package name */
        public float f29254p;

        /* renamed from: q, reason: collision with root package name */
        public float f29255q;

        /* renamed from: r, reason: collision with root package name */
        public float f29256r;

        /* renamed from: s, reason: collision with root package name */
        public float f29257s;

        /* renamed from: t, reason: collision with root package name */
        public float f29258t;

        /* renamed from: u, reason: collision with root package name */
        public float f29259u;

        /* renamed from: v, reason: collision with root package name */
        public float f29260v;

        /* renamed from: w, reason: collision with root package name */
        public float f29261w;

        /* renamed from: x, reason: collision with root package name */
        public float f29262x;

        /* renamed from: y, reason: collision with root package name */
        public float f29263y;

        /* renamed from: z, reason: collision with root package name */
        public float f29264z;

        public int A() {
            return this.f29245g;
        }

        public float B() {
            return this.f29259u;
        }

        public boolean C() {
            return this.f29259u >= this.f29255q - this.f29254p;
        }

        public boolean D() {
            return this.f29239a == a.f29208k;
        }

        public boolean E() {
            g gVar = this.f29241c;
            return gVar != null && this.f29261w - gVar.f29258t >= 0.0f;
        }

        public void F() {
            this.H.i();
        }

        public void G(float f11) {
            this.f29264z = f11;
        }

        public void H(float f11) {
            this.f29252n = f11;
        }

        public void I(Animation animation) {
            if (animation == null) {
                throw new IllegalArgumentException("animation cannot be null.");
            }
            this.f29239a = animation;
        }

        public void J(float f11) {
            this.f29255q = f11;
        }

        public void K(float f11) {
            this.f29256r = f11;
            this.f29257s = f11;
        }

        public void L(float f11) {
            this.f29254p = f11;
        }

        public void M(float f11) {
            this.f29258t = f11;
        }

        public void N(float f11) {
            this.f29250l = f11;
        }

        public void O(boolean z11) {
            this.f29247i = z11;
        }

        public void P(@d0 d dVar) {
            this.f29244f = dVar;
        }

        public void Q(boolean z11) {
            this.f29246h = z11;
        }

        public void R(float f11) {
            this.f29251m = f11;
        }

        public void S(Animation.MixBlend mixBlend) {
            if (mixBlend == null) {
                throw new IllegalArgumentException("mixBlend cannot be null.");
            }
            this.E = mixBlend;
        }

        public void T(float f11) {
            this.f29253o = f11;
        }

        public void U(float f11) {
            this.B = f11;
        }

        public void V(float f11, float f12) {
            this.B = f11;
            g gVar = this.f29240b;
            if (gVar != null && f12 <= 0.0f) {
                f12 += gVar.y() - f11;
            }
            this.f29258t = f12;
        }

        public void W(float f11) {
            this.A = f11;
        }

        public void X(boolean z11) {
            this.f29248j = z11;
        }

        public void Y(boolean z11) {
            this.f29249k = z11;
        }

        public void Z(float f11) {
            this.f29263y = f11;
        }

        public float a() {
            return this.f29264z;
        }

        public void a0(float f11) {
            this.f29262x = f11;
        }

        public float b() {
            return this.f29252n;
        }

        public void b0(float f11) {
            this.f29259u = f11;
        }

        public Animation c() {
            return this.f29239a;
        }

        public boolean c0() {
            return this.f29261w != -1.0f;
        }

        public float d() {
            return this.f29255q;
        }

        public float e() {
            return this.f29256r;
        }

        public float f() {
            return this.f29254p;
        }

        public float g() {
            if (!this.f29246h) {
                float f11 = this.f29259u + this.f29254p;
                float f12 = this.f29255q;
                return f12 >= this.f29239a.f29041d ? f11 : Math.min(f11, f12);
            }
            float f13 = this.f29255q;
            float f14 = this.f29254p;
            float f15 = f13 - f14;
            return f15 == 0.0f ? f14 : (this.f29259u % f15) + f14;
        }

        public float h() {
            return this.f29258t;
        }

        public float i() {
            return this.f29250l;
        }

        public boolean j() {
            return this.f29247i;
        }

        @d0
        public d k() {
            return this.f29244f;
        }

        public boolean l() {
            return this.f29246h;
        }

        public float m() {
            return this.f29251m;
        }

        public Animation.MixBlend n() {
            return this.E;
        }

        public float o() {
            return this.f29253o;
        }

        public float p() {
            return this.B;
        }

        public float q() {
            return this.A;
        }

        @d0
        public g r() {
            return this.f29242d;
        }

        @Override // a3.j0.a
        public void reset() {
            this.f29240b = null;
            this.f29241c = null;
            this.f29242d = null;
            this.f29243e = null;
            this.f29239a = null;
            this.f29244f = null;
            this.F.i();
            this.G.clear();
            this.H.i();
        }

        @d0
        public g s() {
            return this.f29243e;
        }

        @d0
        public g t() {
            return this.f29241c;
        }

        public String toString() {
            Animation animation = this.f29239a;
            return animation == null ? "<none>" : animation.f29038a;
        }

        @d0
        public g u() {
            return this.f29240b;
        }

        public boolean v() {
            return this.f29248j;
        }

        public boolean w() {
            return this.f29249k;
        }

        public float x() {
            return this.f29263y;
        }

        public float y() {
            float f11 = this.f29255q - this.f29254p;
            if (f11 != 0.0f) {
                if (this.f29246h) {
                    return f11 * (((int) (this.f29259u / f11)) + 1);
                }
                if (this.f29259u < f11) {
                    return f11;
                }
            }
            return this.f29259u;
        }

        public float z() {
            return this.f29262x;
        }
    }

    public a() {
    }

    public void A(jl.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        this.f29216a = aVar;
    }

    public g B(int i11, float f11) {
        g w11 = w(i11, f29208k, false);
        w11.B = f11;
        w11.f29262x = f11;
        return w11;
    }

    public void C(float f11) {
        e eVar = this.f29220e;
        boolean z11 = eVar.f29230b;
        eVar.f29230b = true;
        com.badlogic.gdx.utils.a<g> aVar = this.f29217b;
        g[] gVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar = gVarArr[i12];
            if (gVar != null) {
                B(gVar.f29245g, f11);
            }
        }
        e eVar2 = this.f29220e;
        eVar2.f29230b = z11;
        eVar2.d();
    }

    public void D(float f11) {
        this.f29223h = f11;
    }

    public final g E(int i11, Animation animation, boolean z11, @d0 g gVar) {
        g h11 = this.f29225j.h();
        h11.f29245g = i11;
        h11.f29239a = animation;
        h11.f29246h = z11;
        h11.f29247i = false;
        h11.f29248j = false;
        h11.f29249k = false;
        h11.f29250l = 0.0f;
        h11.f29252n = 0.0f;
        h11.f29251m = 0.0f;
        h11.f29253o = 0.0f;
        h11.f29254p = 0.0f;
        h11.f29255q = animation.b();
        h11.f29256r = -1.0f;
        h11.f29257s = -1.0f;
        h11.f29258t = 0.0f;
        h11.f29259u = 0.0f;
        h11.f29260v = -1.0f;
        h11.f29261w = -1.0f;
        h11.f29262x = Float.MAX_VALUE;
        h11.f29263y = 1.0f;
        h11.f29264z = 1.0f;
        h11.A = 0.0f;
        h11.B = gVar == null ? 0.0f : this.f29216a.b(gVar.f29239a, animation);
        h11.C = 1.0f;
        h11.D = 0.0f;
        h11.E = Animation.MixBlend.replace;
        return h11;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[LOOP:2: B:32:0x008c->B:33:0x008e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(float r12) {
        /*
            r11 = this;
            float r0 = r11.f29223h
            float r12 = r12 * r0
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.a$g> r0 = r11.f29217b
            T[] r1 = r0.f13178a
            int r0 = r0.f13179b
            r2 = 0
        La:
            if (r2 >= r0) goto L9f
            r3 = r1[r2]
            com.esotericsoftware.spine.a$g r3 = (com.esotericsoftware.spine.a.g) r3
            if (r3 != 0) goto L14
            goto L9b
        L14:
            float r4 = r3.f29257s
            r3.f29256r = r4
            float r4 = r3.f29261w
            r3.f29260v = r4
            float r5 = r3.f29263y
            float r6 = r12 * r5
            float r7 = r3.f29258t
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto L33
            float r7 = r7 - r6
            r3.f29258t = r7
            int r6 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r6 <= 0) goto L30
            goto L9b
        L30:
            float r6 = -r7
            r3.f29258t = r8
        L33:
            com.esotericsoftware.spine.a$g r7 = r3.f29241c
            r9 = 0
            if (r7 == 0) goto L65
            float r10 = r7.f29258t
            float r4 = r4 - r10
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L7a
            r7.f29258t = r8
            float r9 = r7.f29259u
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L48
            goto L4e
        L48:
            float r4 = r4 / r5
            float r4 = r4 + r12
            float r5 = r7.f29263y
            float r8 = r4 * r5
        L4e:
            float r9 = r9 + r8
            r7.f29259u = r9
            float r4 = r3.f29259u
            float r4 = r4 + r6
            r3.f29259u = r4
            r3 = 1
            r11.z(r2, r7, r3)
        L5a:
            com.esotericsoftware.spine.a$g r3 = r7.f29242d
            if (r3 == 0) goto L9b
            float r4 = r7.A
            float r4 = r4 + r12
            r7.A = r4
            r7 = r3
            goto L5a
        L65:
            float r5 = r3.f29262x
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L7a
            com.esotericsoftware.spine.a$g r4 = r3.f29242d
            if (r4 != 0) goto L7a
            r1[r2] = r9
            com.esotericsoftware.spine.a$e r4 = r11.f29220e
            r4.e(r3)
            r11.l(r3)
            goto L9b
        L7a:
            com.esotericsoftware.spine.a$g r4 = r3.f29242d
            if (r4 == 0) goto L96
            boolean r4 = r11.G(r3, r12)
            if (r4 == 0) goto L96
            com.esotericsoftware.spine.a$g r4 = r3.f29242d
            r3.f29242d = r9
            if (r4 == 0) goto L8c
            r4.f29243e = r9
        L8c:
            if (r4 == 0) goto L96
            com.esotericsoftware.spine.a$e r5 = r11.f29220e
            r5.e(r4)
            com.esotericsoftware.spine.a$g r4 = r4.f29242d
            goto L8c
        L96:
            float r4 = r3.f29259u
            float r4 = r4 + r6
            r3.f29259u = r4
        L9b:
            int r2 = r2 + 1
            goto La
        L9f:
            com.esotericsoftware.spine.a$e r12 = r11.f29220e
            r12.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.a.F(float):void");
    }

    public final boolean G(g gVar, float f11) {
        g gVar2 = gVar.f29242d;
        if (gVar2 == null) {
            return true;
        }
        boolean G = G(gVar2, f11);
        gVar2.f29256r = gVar2.f29257s;
        gVar2.f29260v = gVar2.f29261w;
        float f12 = gVar.A;
        if (f12 > 0.0f) {
            float f13 = gVar.B;
            if (f12 >= f13) {
                if (gVar2.D != 0.0f && f13 != 0.0f) {
                    return G;
                }
                gVar.f29242d = gVar2.f29242d;
                g gVar3 = gVar2.f29242d;
                if (gVar3 != null) {
                    gVar3.f29243e = gVar;
                }
                gVar.C = gVar2.C;
                this.f29220e.e(gVar2);
                return G;
            }
        }
        gVar2.f29259u += gVar2.f29263y * f11;
        gVar.A = f12 + f11;
        return false;
    }

    public g a(int i11, Animation animation, boolean z11, float f11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        if (animation == null) {
            throw new IllegalArgumentException("animation cannot be null.");
        }
        g p11 = p(i11);
        if (p11 != null) {
            while (true) {
                g gVar = p11.f29241c;
                if (gVar == null) {
                    break;
                }
                p11 = gVar;
            }
        }
        g E = E(i11, animation, z11, p11);
        if (p11 == null) {
            z(i11, E, true);
            this.f29220e.d();
        } else {
            p11.f29241c = E;
            E.f29240b = p11;
            if (f11 <= 0.0f) {
                f11 += p11.y() - E.B;
            }
        }
        E.f29258t = f11;
        return E;
    }

    public g b(int i11, String str, boolean z11, float f11) {
        Animation a11 = this.f29216a.f64297a.a(str);
        if (a11 != null) {
            return a(i11, a11, z11, f11);
        }
        throw new IllegalArgumentException("Animation not found: " + str);
    }

    public g c(int i11, float f11, float f12) {
        g a11 = a(i11, f29208k, false, f12);
        if (f12 <= 0.0f) {
            a11.f29258t += a11.B - f11;
        }
        a11.B = f11;
        a11.f29262x = f11;
        return a11;
    }

    public void d(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        }
        this.f29219d.a(dVar);
    }

    public void e() {
        this.f29222g = false;
        this.f29221f.j(2048);
        com.badlogic.gdx.utils.a<g> aVar = this.f29217b;
        int i11 = aVar.f13179b;
        g[] gVarArr = aVar.f13178a;
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar = gVarArr[i12];
            if (gVar != null) {
                while (true) {
                    g gVar2 = gVar.f29242d;
                    if (gVar2 == null) {
                        break;
                    } else {
                        gVar = gVar2;
                    }
                }
                do {
                    if (gVar.f29243e == null || gVar.E != Animation.MixBlend.add) {
                        o(gVar);
                    }
                    gVar = gVar.f29243e;
                } while (gVar != null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(com.esotericsoftware.spine.Skeleton r29) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.a.f(com.esotericsoftware.spine.Skeleton):boolean");
    }

    public final void g(Animation.c cVar, Skeleton skeleton, float f11, Animation.MixBlend mixBlend, boolean z11) {
        jl.m mVar = skeleton.f29194c.get(cVar.f29061c);
        if (mVar.f64408b.A) {
            float[] fArr = cVar.f29113b;
            if (f11 >= fArr[0]) {
                y(skeleton, mVar, cVar.f29062d[Animation.m0.i(fArr, f11)], z11);
            } else if (mixBlend == Animation.MixBlend.setup || mixBlend == Animation.MixBlend.first) {
                y(skeleton, mVar, mVar.f64407a.f64420f, z11);
            }
            int i11 = mVar.f64414h;
            int i12 = this.f29224i;
            if (i11 <= i12) {
                mVar.f64414h = i12 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float h(com.esotericsoftware.spine.a.g r33, com.esotericsoftware.spine.Skeleton r34, com.esotericsoftware.spine.Animation.MixBlend r35) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.a.h(com.esotericsoftware.spine.a$g, com.esotericsoftware.spine.Skeleton, com.esotericsoftware.spine.Animation$MixBlend):float");
    }

    public final void i(Animation.d0 d0Var, Skeleton skeleton, float f11, float f12, Animation.MixBlend mixBlend, float[] fArr, int i11, boolean z11) {
        float s11;
        float f13;
        float f14;
        float f15;
        float f16;
        if (z11) {
            fArr[i11] = 0.0f;
        }
        if (f12 == 1.0f) {
            d0Var.c(skeleton, 0.0f, f11, null, 1.0f, mixBlend, Animation.MixDirection.in);
            return;
        }
        com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(d0Var.f29068j);
        if (bVar.A) {
            if (f11 < d0Var.f29113b[0]) {
                int i12 = b.f29227a[mixBlend.ordinal()];
                if (i12 == 1) {
                    bVar.f29336g = bVar.f29330a.f29170g;
                    return;
                } else {
                    if (i12 != 2) {
                        return;
                    }
                    f13 = bVar.f29336g;
                    s11 = bVar.f29330a.f29170g;
                }
            } else {
                float f17 = mixBlend == Animation.MixBlend.setup ? bVar.f29330a.f29170g : bVar.f29336g;
                s11 = bVar.f29330a.f29170g + d0Var.s(f11);
                f13 = f17;
            }
            float ceil = (s11 - f13) - (((float) Math.ceil((r1 / 360.0f) - 0.5f)) * 360.0f);
            if (ceil == 0.0f) {
                f16 = fArr[i11];
            } else {
                if (z11) {
                    f14 = 0.0f;
                    f15 = ceil;
                } else {
                    f14 = fArr[i11];
                    f15 = fArr[i11 + 1];
                }
                float f18 = f14 - (f14 % 360.0f);
                float f19 = ceil + f18;
                boolean z12 = ceil >= 0.0f;
                boolean z13 = f14 >= 0.0f;
                if (Math.abs(f15) <= 90.0f && Math.signum(f15) != Math.signum(ceil)) {
                    if (Math.abs(f14 - f18) > 180.0f) {
                        f19 += Math.signum(f14) * 360.0f;
                    } else if (f18 != 0.0f) {
                        f19 -= Math.signum(f14) * 360.0f;
                    }
                    z13 = z12;
                }
                if (z13 != z12) {
                    f19 += Math.signum(f14) * 360.0f;
                }
                f16 = f19;
                fArr[i11] = f16;
            }
            fArr[i11 + 1] = ceil;
            bVar.f29336g = f13 + (f16 * f12);
        }
    }

    public void j() {
        this.f29220e.a();
    }

    public void k() {
        this.f29219d.clear();
    }

    public void l(g gVar) {
        for (g gVar2 = gVar.f29241c; gVar2 != null; gVar2 = gVar2.f29241c) {
            this.f29220e.c(gVar2);
        }
        gVar.f29241c = null;
    }

    public void m(int i11) {
        g gVar;
        if (i11 < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        com.badlogic.gdx.utils.a<g> aVar = this.f29217b;
        if (i11 >= aVar.f13179b || (gVar = aVar.get(i11)) == null) {
            return;
        }
        this.f29220e.e(gVar);
        l(gVar);
        g gVar2 = gVar;
        while (true) {
            g gVar3 = gVar2.f29242d;
            if (gVar3 == null) {
                this.f29217b.K(gVar.f29245g, null);
                this.f29220e.d();
                return;
            } else {
                this.f29220e.e(gVar3);
                gVar2.f29242d = null;
                gVar2.f29243e = null;
                gVar2 = gVar3;
            }
        }
    }

    public void n() {
        e eVar = this.f29220e;
        boolean z11 = eVar.f29230b;
        eVar.f29230b = true;
        int i11 = this.f29217b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            m(i12);
        }
        this.f29217b.clear();
        e eVar2 = this.f29220e;
        eVar2.f29230b = z11;
        eVar2.d();
    }

    public final void o(g gVar) {
        g gVar2 = gVar.f29243e;
        com.badlogic.gdx.utils.a<Animation.m0> aVar = gVar.f29239a.f29039b;
        Animation.m0[] m0VarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        int[] H = gVar.F.H(i11);
        gVar.G.clear();
        g[] L = gVar.G.L(i11);
        m<String> mVar = this.f29221f;
        if (gVar2 != null && gVar2.f29247i) {
            for (int i12 = 0; i12 < i11; i12++) {
                H[i12] = mVar.f(m0VarArr[i12].h()) ? 3 : 2;
            }
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            Animation.m0 m0Var = m0VarArr[i13];
            String[] h11 = m0Var.h();
            if (!mVar.f(h11)) {
                H[i13] = 0;
            } else if (gVar2 == null || (m0Var instanceof Animation.c) || (m0Var instanceof Animation.i) || (m0Var instanceof Animation.j) || !gVar2.f29239a.e(h11)) {
                H[i13] = 1;
            } else {
                g gVar3 = gVar2.f29243e;
                while (true) {
                    if (gVar3 == null) {
                        break;
                    }
                    if (gVar3.f29239a.e(h11)) {
                        gVar3 = gVar3.f29243e;
                    } else if (gVar3.B > 0.0f) {
                        H[i13] = 4;
                        L[i13] = gVar3;
                    }
                }
                H[i13] = 3;
            }
        }
    }

    public final g p(int i11) {
        com.badlogic.gdx.utils.a<g> aVar = this.f29217b;
        int i12 = aVar.f13179b;
        if (i11 < i12) {
            return aVar.get(i11);
        }
        aVar.o((i11 - i12) + 1);
        this.f29217b.f13179b = i11 + 1;
        return null;
    }

    @d0
    public g q(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        com.badlogic.gdx.utils.a<g> aVar = this.f29217b;
        if (i11 >= aVar.f13179b) {
            return null;
        }
        return aVar.get(i11);
    }

    public jl.a r() {
        return this.f29216a;
    }

    public float s() {
        return this.f29223h;
    }

    public com.badlogic.gdx.utils.a<g> t() {
        return this.f29217b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        com.badlogic.gdx.utils.a<g> aVar = this.f29217b;
        g[] gVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar = gVarArr[i12];
            if (gVar != null) {
                if (sb2.length() > 0) {
                    sb2.append(j2.O);
                }
                sb2.append(gVar.toString());
            }
        }
        return sb2.length() == 0 ? "<none>" : sb2.toString();
    }

    public final void u(g gVar, float f11) {
        int i11;
        float f12 = gVar.f29254p;
        float f13 = gVar.f29255q;
        float f14 = f13 - f12;
        float f15 = gVar.f29260v % f14;
        com.badlogic.gdx.utils.a<jl.c> aVar = this.f29218c;
        jl.c[] cVarArr = aVar.f13178a;
        int i12 = aVar.f13179b;
        int i13 = 0;
        while (i13 < i12) {
            jl.c cVar = cVarArr[i13];
            float f16 = cVar.f64312g;
            if (f16 < f15) {
                break;
            }
            if (f16 <= f13) {
                this.f29220e.f(gVar, cVar);
            }
            i13++;
        }
        if (!gVar.f29246h ? !(f11 < f13 || gVar.f29256r >= f13) : !(f14 != 0.0f && ((i11 = (int) (gVar.f29259u / f14)) <= 0 || i11 <= ((int) (gVar.f29260v / f14))))) {
            this.f29220e.b(gVar);
        }
        while (i13 < i12) {
            jl.c cVar2 = cVarArr[i13];
            if (cVar2.f64312g >= f12) {
                this.f29220e.f(gVar, cVar2);
            }
            i13++;
        }
    }

    public void v(d dVar) {
        this.f29219d.C(dVar, true);
    }

    public g w(int i11, Animation animation, boolean z11) {
        boolean z12;
        if (i11 < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        if (animation == null) {
            throw new IllegalArgumentException("animation cannot be null.");
        }
        g p11 = p(i11);
        if (p11 != null) {
            if (p11.f29261w == -1.0f) {
                this.f29217b.K(i11, p11.f29242d);
                this.f29220e.g(p11);
                this.f29220e.e(p11);
                l(p11);
                p11 = p11.f29242d;
                z12 = false;
                g E = E(i11, animation, z11, p11);
                z(i11, E, z12);
                this.f29220e.d();
                return E;
            }
            l(p11);
        }
        z12 = true;
        g E2 = E(i11, animation, z11, p11);
        z(i11, E2, z12);
        this.f29220e.d();
        return E2;
    }

    public g x(int i11, String str, boolean z11) {
        Animation a11 = this.f29216a.f64297a.a(str);
        if (a11 != null) {
            return w(i11, a11, z11);
        }
        throw new IllegalArgumentException("Animation not found: " + str);
    }

    public final void y(Skeleton skeleton, jl.m mVar, String str, boolean z11) {
        mVar.i(str == null ? null : skeleton.g(mVar.f64407a.f64415a, str));
        if (z11) {
            mVar.f64414h = this.f29224i + 2;
        }
    }

    public final void z(int i11, g gVar, boolean z11) {
        g p11 = p(i11);
        this.f29217b.K(i11, gVar);
        gVar.f29240b = null;
        if (p11 != null) {
            if (z11) {
                this.f29220e.g(p11);
            }
            gVar.f29242d = p11;
            p11.f29243e = gVar;
            gVar.A = 0.0f;
            if (p11.f29242d != null) {
                float f11 = p11.B;
                if (f11 > 0.0f) {
                    gVar.C *= Math.min(1.0f, p11.A / f11);
                }
            }
            p11.H.i();
        }
        this.f29220e.h(gVar);
    }

    public a(jl.a aVar) {
        if (aVar != null) {
            this.f29216a = aVar;
            return;
        }
        throw new IllegalArgumentException("data cannot be null.");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c implements d {
        @Override // com.esotericsoftware.spine.a.d
        public void a(g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void b(g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void c(g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void e(g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void f(g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void d(g gVar, jl.c cVar) {
        }
    }
}
