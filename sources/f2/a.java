package f2;

import a3.j0;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShader;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.graphics.s;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.a;
import e2.a;
import e2.i;
import n2.w;
import x1.i;
import x1.k;
import y1.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends f2.b<i2.a> {
    public static final s A;
    public static final s B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L = 8191;
    public static final int M = 32764;

    /* renamed from: r, reason: collision with root package name */
    public static final Vector3 f50350r = new Vector3();

    /* renamed from: s, reason: collision with root package name */
    public static final Vector3 f50351s = new Vector3();

    /* renamed from: t, reason: collision with root package name */
    public static final Vector3 f50352t = new Vector3();

    /* renamed from: u, reason: collision with root package name */
    public static final Vector3 f50353u = new Vector3();

    /* renamed from: v, reason: collision with root package name */
    public static final Vector3 f50354v = new Vector3();

    /* renamed from: w, reason: collision with root package name */
    public static final Vector3 f50355w = new Vector3();

    /* renamed from: x, reason: collision with root package name */
    public static final Matrix3 f50356x = new Matrix3();

    /* renamed from: y, reason: collision with root package name */
    public static final int f50357y = 512;

    /* renamed from: z, reason: collision with root package name */
    public static final int f50358z = 1024;

    /* renamed from: f, reason: collision with root package name */
    public b f50359f;

    /* renamed from: g, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<i> f50360g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f50361h;

    /* renamed from: i, reason: collision with root package name */
    public short[] f50362i;

    /* renamed from: j, reason: collision with root package name */
    public int f50363j;

    /* renamed from: k, reason: collision with root package name */
    public s f50364k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f50365l;

    /* renamed from: m, reason: collision with root package name */
    public ParticleShader.AlignMode f50366m;

    /* renamed from: n, reason: collision with root package name */
    public Texture f50367n;

    /* renamed from: o, reason: collision with root package name */
    public y1.a f50368o;

    /* renamed from: p, reason: collision with root package name */
    public y1.d f50369p;

    /* renamed from: q, reason: collision with root package name */
    public k f50370q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: f2.a$a, reason: collision with other inner class name */
    public static class C0603a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f50371a;

        /* renamed from: b, reason: collision with root package name */
        public ParticleShader.AlignMode f50372b;

        public C0603a() {
        }

        public C0603a(boolean z11, ParticleShader.AlignMode alignMode) {
            this.f50371a = z11;
            this.f50372b = alignMode;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends j0<i> {
        public b() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public i g() {
            return a.this.l();
        }
    }

    static {
        s sVar = new s(new r(1, 3, w.f74225u), new r(16, 2, "a_texCoord0"), new r(2, 4, w.f74227w), new r(512, 4, "a_sizeAndRotation"));
        A = sVar;
        s sVar2 = new s(new r(1, 3, w.f74225u), new r(16, 2, "a_texCoord0"), new r(2, 4, w.f74227w));
        B = sVar2;
        C = (short) (sVar.d(1).f12492e / 4);
        D = (short) (sVar.d(16).f12492e / 4);
        E = (short) (sVar.d(512).f12492e / 4);
        F = (short) (sVar.d(2).f12492e / 4);
        G = sVar.f12497b / 4;
        H = (short) (sVar2.d(1).f12492e / 4);
        I = (short) (sVar2.d(16).f12492e / 4);
        J = (short) (sVar2.d(2).f12492e / 4);
        K = sVar2.f12497b / 4;
    }

    public a(ParticleShader.AlignMode alignMode, boolean z11, int i11, y1.a aVar, y1.d dVar) {
        super(i2.a.class);
        this.f50363j = 0;
        this.f50365l = false;
        this.f50366m = ParticleShader.AlignMode.Screen;
        this.f50360g = new com.badlogic.gdx.utils.a<>();
        this.f50359f = new b();
        this.f50368o = aVar;
        this.f50369p = dVar;
        if (aVar == null) {
            this.f50368o = new y1.a(1, f.f11659s, 1.0f);
        }
        if (this.f50369p == null) {
            this.f50369p = new y1.d(f.f11596h2, false);
        }
        k();
        x();
        d(i11);
        E(z11);
        C(alignMode);
    }

    public static void A(float[] fArr, int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24) {
        int i12 = C;
        fArr[i11 + i12] = f11;
        fArr[i11 + i12 + 1] = f12;
        fArr[i12 + i11 + 2] = f13;
        int i13 = D;
        fArr[i11 + i13] = f14;
        fArr[i13 + i11 + 1] = f15;
        int i14 = E;
        fArr[i11 + i14] = f16;
        fArr[i11 + i14 + 1] = f17;
        fArr[i11 + i14 + 2] = f18;
        fArr[i14 + i11 + 3] = f19;
        int i15 = F;
        fArr[i11 + i15] = f21;
        fArr[i11 + i15 + 1] = f22;
        fArr[i11 + i15 + 2] = f23;
        fArr[i11 + i15 + 3] = f24;
    }

    public static void B(float[] fArr, int i11, Vector3 vector3, float f11, float f12, float f13, float f14, float f15, float f16) {
        int i12 = H;
        fArr[i11 + i12] = vector3.f12537x;
        fArr[i11 + i12 + 1] = vector3.f12538y;
        fArr[i12 + i11 + 2] = vector3.f12539z;
        int i13 = I;
        fArr[i11 + i13] = f11;
        fArr[i13 + i11 + 1] = f12;
        int i14 = J;
        fArr[i11 + i14] = f13;
        fArr[i11 + i14 + 1] = f14;
        fArr[i11 + i14 + 2] = f15;
        fArr[i11 + i14 + 3] = f16;
    }

    public void C(ParticleShader.AlignMode alignMode) {
        if (alignMode != this.f50366m) {
            this.f50366m = alignMode;
            if (this.f50365l) {
                x();
                m(this.f50375b);
            }
        }
    }

    public void D(Texture texture) {
        this.f50359f.e(this.f50360g);
        this.f50360g.clear();
        int f11 = this.f50359f.f();
        for (int i11 = 0; i11 < f11; i11++) {
            ((j) this.f50359f.h().f97049c.l(j.f98991l)).f99005e.f69250a = texture;
        }
        this.f50367n = texture;
    }

    public void E(boolean z11) {
        if (this.f50365l != z11) {
            this.f50365l = z11;
            x();
            m(this.f50375b);
        }
    }

    public void F() {
        if (this.f50365l) {
            this.f50364k = A;
            this.f50363j = G;
        } else {
            this.f50364k = B;
            this.f50363j = K;
        }
    }

    @Override // f2.b
    public void a(int i11) {
        this.f50361h = new float[this.f50363j * 4 * i11];
        m(i11);
    }

    @Override // f2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        i.c g11 = iVar.g("billboardBatch");
        if (g11 != null) {
            D((Texture) eVar.Q0(g11.b()));
            C0603a c0603a = (C0603a) g11.a("cfg");
            E(c0603a.f50371a);
            C(c0603a.f50372b);
        }
    }

    @Override // f2.b, f2.d
    public void c() {
        super.c();
        this.f50359f.e(this.f50360g);
        this.f50360g.clear();
    }

    @Override // f2.b
    public void e(int[] iArr) {
        if (this.f50365l) {
            q(iArr);
        } else {
            ParticleShader.AlignMode alignMode = this.f50366m;
            if (alignMode == ParticleShader.AlignMode.Screen) {
                r(iArr);
            } else if (alignMode == ParticleShader.AlignMode.ViewPoint) {
                s(iArr);
            }
        }
        int i11 = this.f50375b * 4;
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i11 - i12, M);
            x1.i h11 = this.f50359f.h();
            c2.b bVar = h11.f97048b;
            bVar.f7489d = (min / 4) * 6;
            Mesh mesh = bVar.f7490e;
            float[] fArr = this.f50361h;
            int i13 = this.f50363j;
            mesh.O1(fArr, i13 * i12, i13 * min);
            h11.f97048b.f();
            this.f50360g.a(h11);
            i12 += min;
        }
    }

    public final void k() {
        this.f50362i = new short[49146];
        int i11 = 0;
        int i12 = 0;
        while (i11 < 49146) {
            short[] sArr = this.f50362i;
            short s11 = (short) i12;
            sArr[i11] = s11;
            sArr[i11 + 1] = (short) (i12 + 1);
            short s12 = (short) (i12 + 2);
            sArr[i11 + 2] = s12;
            sArr[i11 + 3] = s12;
            sArr[i11 + 4] = (short) (i12 + 3);
            sArr[i11 + 5] = s11;
            i11 += 6;
            i12 += 4;
        }
    }

    public x1.i l() {
        x1.i iVar = new x1.i();
        c2.b bVar = iVar.f97048b;
        bVar.f7487b = 4;
        bVar.f7488c = 0;
        iVar.f97049c = new x1.d(this.f50368o, this.f50369p, j.m(this.f50367n));
        iVar.f97048b.f7490e = new Mesh(false, M, 49146, this.f50364k);
        iVar.f97048b.f7490e.H1(this.f50362i);
        iVar.f97052f = this.f50370q;
        return iVar;
    }

    public final void m(int i11) {
        int l11 = n.l(i11 / L);
        int f11 = this.f50359f.f();
        if (f11 < l11) {
            int i12 = l11 - f11;
            for (int i13 = 0; i13 < i12; i13++) {
                b bVar = this.f50359f;
                bVar.d(bVar.g());
            }
        }
    }

    public final void n() {
        x1.i l11 = l();
        k v11 = v(l11);
        l11.f97052f = v11;
        this.f50370q = v11;
        this.f50359f.d(l11);
    }

    @Override // f2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        i.c b11 = iVar.b("billboardBatch");
        b11.c("cfg", new C0603a(this.f50365l, this.f50366m));
        b11.d(eVar.a1(this.f50367n), Texture.class);
    }

    public final void p() {
        this.f50359f.e(this.f50360g);
        int f11 = this.f50359f.f();
        for (int i11 = 0; i11 < f11; i11++) {
            this.f50359f.h().f97048b.f7490e.dispose();
        }
        this.f50360g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int[] iArr) {
        a.b it = this.f50374a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i2.a aVar = (i2.a) it.next();
            a.d dVar = aVar.f60116e;
            a.d dVar2 = aVar.f60114c;
            a.d dVar3 = aVar.f60127b;
            a.d dVar4 = aVar.f60115d;
            a.d dVar5 = aVar.f60117f;
            int i12 = aVar.f60126a.f48380e.f48329c;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = iArr[i11] * this.f50363j * 4;
                float f11 = dVar.f48337e[dVar.f48332c * i13];
                int i15 = dVar2.f48332c * i13;
                int i16 = dVar3.f48332c * i13;
                int i17 = dVar4.f48332c * i13;
                int i18 = dVar5.f48332c * i13;
                a.b bVar = it;
                float[] fArr = dVar3.f48337e;
                float f12 = fArr[i16];
                float f13 = fArr[i16 + 1];
                float f14 = fArr[i16 + 2];
                float[] fArr2 = dVar2.f48337e;
                float f15 = fArr2[i15];
                float f16 = fArr2[i15 + 1];
                float f17 = fArr2[i15 + 2];
                float f18 = fArr2[i15 + 3];
                float f19 = fArr2[i15 + 4] * f11;
                float f21 = fArr2[i15 + 5] * f11;
                float[] fArr3 = dVar4.f48337e;
                float f22 = fArr3[i17];
                float f23 = fArr3[i17 + 1];
                float f24 = fArr3[i17 + 2];
                float f25 = fArr3[i17 + 3];
                float[] fArr4 = dVar5.f48337e;
                float f26 = fArr4[i18];
                float f27 = fArr4[i18 + 1];
                float f28 = -f19;
                float f29 = -f21;
                A(this.f50361h, i14, f12, f13, f14, f15, f18, f28, f29, f26, f27, f22, f23, f24, f25);
                int i19 = i14 + this.f50363j;
                A(this.f50361h, i19, f12, f13, f14, f17, f18, f19, f29, f26, f27, f22, f23, f24, f25);
                int i21 = i19 + this.f50363j;
                A(this.f50361h, i21, f12, f13, f14, f17, f16, f19, f21, f26, f27, f22, f23, f24, f25);
                A(this.f50361h, i21 + this.f50363j, f12, f13, f14, f15, f16, f28, f21, f26, f27, f22, f23, f24, f25);
                i13++;
                i11++;
                it = bVar;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(int[] iArr) {
        Vector3 vector3;
        Vector3 vector32;
        Vector3 scl = f50352t.set(this.f50378e.f11509b).scl(-1.0f);
        Vector3 nor = f50353u.set(this.f50378e.f11510c).crs(scl).nor();
        Vector3 vector33 = this.f50378e.f11510c;
        a.b it = this.f50374a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i2.a aVar = (i2.a) it.next();
            a.d dVar = aVar.f60116e;
            a.d dVar2 = aVar.f60114c;
            a.d dVar3 = aVar.f60127b;
            a.d dVar4 = aVar.f60115d;
            a.d dVar5 = aVar.f60117f;
            int i12 = aVar.f60126a.f48380e.f48329c;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = iArr[i11] * this.f50363j * 4;
                float f11 = dVar.f48337e[dVar.f48332c * i13];
                int i15 = dVar2.f48332c * i13;
                int i16 = dVar3.f48332c * i13;
                a.b bVar = it;
                int i17 = dVar4.f48332c * i13;
                int i18 = dVar5.f48332c * i13;
                float[] fArr = dVar3.f48337e;
                float f12 = fArr[i16];
                float f13 = fArr[i16 + 1];
                int i19 = i11;
                float f14 = fArr[i16 + 2];
                int i21 = i12;
                float[] fArr2 = dVar2.f48337e;
                float f15 = fArr2[i15];
                float f16 = fArr2[i15 + 1];
                float f17 = fArr2[i15 + 2];
                float f18 = fArr2[i15 + 3];
                float f19 = fArr2[i15 + 4] * f11;
                float f21 = fArr2[i15 + 5] * f11;
                float[] fArr3 = dVar4.f48337e;
                float f22 = fArr3[i17];
                float f23 = fArr3[i17 + 1];
                float f24 = fArr3[i17 + 2];
                float f25 = fArr3[i17 + 3];
                float[] fArr4 = dVar5.f48337e;
                a.d dVar6 = dVar;
                float f26 = fArr4[i18];
                float f27 = fArr4[i18 + 1];
                a.d dVar7 = dVar2;
                Vector3 vector34 = f50350r;
                a.d dVar8 = dVar3;
                vector34.set(nor).scl(f19);
                Vector3 vector35 = f50351s;
                vector35.set(vector33).scl(f21);
                if (f26 != 1.0f) {
                    Matrix3 matrix3 = f50356x;
                    matrix3.setToRotation(scl, f26, f27);
                    float[] fArr5 = this.f50361h;
                    Vector3 vector36 = f50355w;
                    vector3 = scl;
                    vector32 = nor;
                    B(fArr5, i14, vector36.set((-vector34.f12537x) - vector35.f12537x, (-vector34.f12538y) - vector35.f12538y, (-vector34.f12539z) - vector35.f12539z).mul(matrix3).add(f12, f13, f14), f15, f18, f22, f23, f24, f25);
                    int i22 = i14 + this.f50363j;
                    B(this.f50361h, i22, vector36.set(vector34.f12537x - vector35.f12537x, vector34.f12538y - vector35.f12538y, vector34.f12539z - vector35.f12539z).mul(matrix3).add(f12, f13, f14), f17, f18, f22, f23, f24, f25);
                    int i23 = i22 + this.f50363j;
                    B(this.f50361h, i23, vector36.set(vector34.f12537x + vector35.f12537x, vector34.f12538y + vector35.f12538y, vector34.f12539z + vector35.f12539z).mul(matrix3).add(f12, f13, f14), f17, f16, f22, f23, f24, f25);
                    B(this.f50361h, i23 + this.f50363j, vector36.set((-vector34.f12537x) + vector35.f12537x, (-vector34.f12538y) + vector35.f12538y, (-vector34.f12539z) + vector35.f12539z).mul(matrix3).add(f12, f13, f14), f15, f16, f22, f23, f24, f25);
                } else {
                    vector3 = scl;
                    vector32 = nor;
                    float[] fArr6 = this.f50361h;
                    Vector3 vector37 = f50355w;
                    B(fArr6, i14, vector37.set(((-vector34.f12537x) - vector35.f12537x) + f12, ((-vector34.f12538y) - vector35.f12538y) + f13, ((-vector34.f12539z) - vector35.f12539z) + f14), f15, f18, f22, f23, f24, f25);
                    int i24 = i14 + this.f50363j;
                    B(this.f50361h, i24, vector37.set((vector34.f12537x - vector35.f12537x) + f12, (vector34.f12538y - vector35.f12538y) + f13, (vector34.f12539z - vector35.f12539z) + f14), f17, f18, f22, f23, f24, f25);
                    int i25 = i24 + this.f50363j;
                    B(this.f50361h, i25, vector37.set(vector34.f12537x + vector35.f12537x + f12, vector34.f12538y + vector35.f12538y + f13, vector34.f12539z + vector35.f12539z + f14), f17, f16, f22, f23, f24, f25);
                    B(this.f50361h, i25 + this.f50363j, vector37.set((-vector34.f12537x) + vector35.f12537x + f12, (-vector34.f12538y) + vector35.f12538y + f13, (-vector34.f12539z) + vector35.f12539z + f14), f15, f16, f22, f23, f24, f25);
                }
                i13++;
                i11 = i19 + 1;
                it = bVar;
                i12 = i21;
                dVar = dVar6;
                dVar2 = dVar7;
                dVar3 = dVar8;
                scl = vector3;
                nor = vector32;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(int[] iArr) {
        a.b it = this.f50374a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i2.a aVar = (i2.a) it.next();
            a.d dVar = aVar.f60116e;
            a.d dVar2 = aVar.f60114c;
            a.d dVar3 = aVar.f60127b;
            a.d dVar4 = aVar.f60115d;
            a.d dVar5 = aVar.f60117f;
            int i12 = aVar.f60126a.f48380e.f48329c;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = iArr[i11] * this.f50363j * 4;
                float f11 = dVar.f48337e[dVar.f48332c * i13];
                int i15 = dVar2.f48332c * i13;
                int i16 = dVar3.f48332c * i13;
                int i17 = dVar4.f48332c * i13;
                int i18 = dVar5.f48332c * i13;
                a.b bVar = it;
                float[] fArr = dVar3.f48337e;
                float f12 = fArr[i16];
                float f13 = fArr[i16 + 1];
                float f14 = fArr[i16 + 2];
                int i19 = i11;
                float[] fArr2 = dVar2.f48337e;
                float f15 = fArr2[i15];
                float f16 = fArr2[i15 + 1];
                float f17 = fArr2[i15 + 2];
                float f18 = fArr2[i15 + 3];
                float f19 = fArr2[i15 + 4] * f11;
                float f21 = fArr2[i15 + 5] * f11;
                float[] fArr3 = dVar4.f48337e;
                float f22 = fArr3[i17];
                float f23 = fArr3[i17 + 1];
                float f24 = fArr3[i17 + 2];
                float f25 = fArr3[i17 + 3];
                float[] fArr4 = dVar5.f48337e;
                float f26 = fArr4[i18];
                float f27 = fArr4[i18 + 1];
                int i21 = i12;
                a.d dVar6 = dVar;
                Vector3 nor = f50352t.set(this.f50378e.f11508a).sub(f12, f13, f14).nor();
                Vector3 vector3 = f50350r;
                a.d dVar7 = dVar2;
                Vector3 nor2 = vector3.set(this.f50378e.f11510c).crs(nor).nor();
                a.d dVar8 = dVar3;
                Vector3 vector32 = f50351s;
                a.d dVar9 = dVar4;
                Vector3 crs = vector32.set(nor).crs(nor2);
                nor2.scl(f19);
                crs.scl(f21);
                if (f26 != 1.0f) {
                    Matrix3 matrix3 = f50356x;
                    matrix3.setToRotation(nor, f26, f27);
                    float[] fArr5 = this.f50361h;
                    Vector3 vector33 = f50355w;
                    B(fArr5, i14, vector33.set((-vector3.f12537x) - vector32.f12537x, (-vector3.f12538y) - vector32.f12538y, (-vector3.f12539z) - vector32.f12539z).mul(matrix3).add(f12, f13, f14), f15, f18, f22, f23, f24, f25);
                    int i22 = i14 + this.f50363j;
                    B(this.f50361h, i22, vector33.set(vector3.f12537x - vector32.f12537x, vector3.f12538y - vector32.f12538y, vector3.f12539z - vector32.f12539z).mul(matrix3).add(f12, f13, f14), f17, f18, f22, f23, f24, f25);
                    int i23 = i22 + this.f50363j;
                    B(this.f50361h, i23, vector33.set(vector3.f12537x + vector32.f12537x, vector3.f12538y + vector32.f12538y, vector3.f12539z + vector32.f12539z).mul(matrix3).add(f12, f13, f14), f17, f16, f22, f23, f24, f25);
                    B(this.f50361h, i23 + this.f50363j, vector33.set((-vector3.f12537x) + vector32.f12537x, (-vector3.f12538y) + vector32.f12538y, (-vector3.f12539z) + vector32.f12539z).mul(matrix3).add(f12, f13, f14), f15, f16, f22, f23, f24, f25);
                } else {
                    float[] fArr6 = this.f50361h;
                    Vector3 vector34 = f50355w;
                    B(fArr6, i14, vector34.set(((-vector3.f12537x) - vector32.f12537x) + f12, ((-vector3.f12538y) - vector32.f12538y) + f13, ((-vector3.f12539z) - vector32.f12539z) + f14), f15, f18, f22, f23, f24, f25);
                    int i24 = i14 + this.f50363j;
                    B(this.f50361h, i24, vector34.set((vector3.f12537x - vector32.f12537x) + f12, (vector3.f12538y - vector32.f12538y) + f13, (vector3.f12539z - vector32.f12539z) + f14), f17, f18, f22, f23, f24, f25);
                    int i25 = i24 + this.f50363j;
                    B(this.f50361h, i25, vector34.set(vector3.f12537x + vector32.f12537x + f12, vector3.f12538y + vector32.f12538y + f13, vector3.f12539z + vector32.f12539z + f14), f17, f16, f22, f23, f24, f25);
                    B(this.f50361h, i25 + this.f50363j, vector34.set((-vector3.f12537x) + vector32.f12537x + f12, (-vector3.f12538y) + vector32.f12538y + f13, (-vector3.f12539z) + vector32.f12539z + f14), f15, f16, f22, f23, f24, f25);
                }
                i13++;
                i11 = i19 + 1;
                it = bVar;
                i12 = i21;
                dVar = dVar6;
                dVar2 = dVar7;
                dVar3 = dVar8;
                dVar4 = dVar9;
            }
        }
    }

    public ParticleShader.AlignMode t() {
        return this.f50366m;
    }

    public y1.a u() {
        return this.f50368o;
    }

    public k v(x1.i iVar) {
        k particleShader = this.f50365l ? new ParticleShader(iVar, new ParticleShader.a(this.f50366m)) : new k2.b(iVar);
        particleShader.init();
        return particleShader;
    }

    public Texture w() {
        return this.f50367n;
    }

    public final void x() {
        F();
        p();
        n();
        h();
    }

    public boolean y() {
        return this.f50365l;
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<x1.i> aVar, j0<x1.i> j0Var) {
        a.b<x1.i> it = this.f50360g.iterator();
        while (it.hasNext()) {
            aVar.a(j0Var.h().a(it.next()));
        }
    }

    public a(ParticleShader.AlignMode alignMode, boolean z11, int i11) {
        this(alignMode, z11, i11, null, null);
    }

    public a() {
        this(ParticleShader.AlignMode.Screen, false, 100);
    }

    public a(int i11) {
        this(ParticleShader.AlignMode.Screen, false, i11);
    }
}
