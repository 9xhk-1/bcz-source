package l2;

import a3.t0;
import a3.x;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import l2.k;
import n2.w;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j implements k {
    public static final int L = 65536;
    public static final int M = 65535;
    public static final t0 N = new t0();
    public static final a3.r O = new a3.r();
    public static final Vector3 P = new Vector3();
    public static x Q = null;
    public float[] E;

    /* renamed from: f, reason: collision with root package name */
    public com.badlogic.gdx.graphics.s f69203f;

    /* renamed from: i, reason: collision with root package name */
    public int f69206i;

    /* renamed from: j, reason: collision with root package name */
    public int f69207j;

    /* renamed from: k, reason: collision with root package name */
    public int f69208k;

    /* renamed from: l, reason: collision with root package name */
    public int f69209l;

    /* renamed from: m, reason: collision with root package name */
    public int f69210m;

    /* renamed from: n, reason: collision with root package name */
    public int f69211n;

    /* renamed from: o, reason: collision with root package name */
    public int f69212o;

    /* renamed from: p, reason: collision with root package name */
    public int f69213p;

    /* renamed from: q, reason: collision with root package name */
    public int f69214q;

    /* renamed from: r, reason: collision with root package name */
    public int f69215r;

    /* renamed from: s, reason: collision with root package name */
    public int f69216s;

    /* renamed from: t, reason: collision with root package name */
    public int f69217t;

    /* renamed from: u, reason: collision with root package name */
    public c2.b f69218u;

    /* renamed from: y, reason: collision with root package name */
    public int f69222y;

    /* renamed from: a, reason: collision with root package name */
    public final k.a f69198a = new k.a();

    /* renamed from: b, reason: collision with root package name */
    public final k.a f69199b = new k.a();

    /* renamed from: c, reason: collision with root package name */
    public final k.a f69200c = new k.a();

    /* renamed from: d, reason: collision with root package name */
    public final k.a f69201d = new k.a();

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f69202e = new com.badlogic.gdx.graphics.b();

    /* renamed from: g, reason: collision with root package name */
    public a3.r f69204g = new a3.r();

    /* renamed from: h, reason: collision with root package name */
    public t0 f69205h = new t0();

    /* renamed from: v, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<c2.b> f69219v = new com.badlogic.gdx.utils.a<>();

    /* renamed from: w, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f69220w = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f11522e);

    /* renamed from: x, reason: collision with root package name */
    public boolean f69221x = false;

    /* renamed from: z, reason: collision with root package name */
    public float f69223z = 0.0f;
    public float A = 1.0f;
    public float B = 0.0f;
    public float C = 1.0f;
    public boolean D = false;
    public boolean F = false;
    public final Matrix4 G = new Matrix4();
    public final Matrix3 H = new Matrix3();
    public final BoundingBox I = new BoundingBox();
    public int J = -1;
    public final Vector3 K = new Vector3();

    public static final void b1(float[] fArr, int i11, int i12, Matrix3 matrix3) {
        if (i12 > 2) {
            Vector3 vector3 = P;
            int i13 = i11 + 1;
            int i14 = i11 + 2;
            vector3.set(fArr[i11], fArr[i13], fArr[i14]).mul(matrix3).nor();
            fArr[i11] = vector3.f12537x;
            fArr[i13] = vector3.f12538y;
            fArr[i14] = vector3.f12539z;
            return;
        }
        if (i12 <= 1) {
            fArr[i11] = P.set(fArr[i11], 0.0f, 0.0f).mul(matrix3).nor().f12537x;
            return;
        }
        Vector3 vector32 = P;
        int i15 = i11 + 1;
        vector32.set(fArr[i11], fArr[i15], 0.0f).mul(matrix3).nor();
        fArr[i11] = vector32.f12537x;
        fArr[i15] = vector32.f12538y;
    }

    public static final void c1(float[] fArr, int i11, int i12, Matrix4 matrix4) {
        if (i12 > 2) {
            Vector3 vector3 = P;
            int i13 = i11 + 1;
            int i14 = i11 + 2;
            vector3.set(fArr[i11], fArr[i13], fArr[i14]).mul(matrix4);
            fArr[i11] = vector3.f12537x;
            fArr[i13] = vector3.f12538y;
            fArr[i14] = vector3.f12539z;
            return;
        }
        if (i12 <= 1) {
            fArr[i11] = P.set(fArr[i11], 0.0f, 0.0f).mul(matrix4).f12537x;
            return;
        }
        Vector3 vector32 = P;
        int i15 = i11 + 1;
        vector32.set(fArr[i11], fArr[i15], 0.0f).mul(matrix4);
        fArr[i11] = vector32.f12537x;
        fArr[i15] = vector32.f12538y;
    }

    public static com.badlogic.gdx.graphics.s g(long j11) {
        com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a();
        if ((j11 & 1) == 1) {
            aVar.a(new com.badlogic.gdx.graphics.r(1, 3, w.f74225u));
        }
        if ((j11 & 2) == 2) {
            aVar.a(new com.badlogic.gdx.graphics.r(2, 4, w.f74227w));
        }
        if ((j11 & 4) == 4) {
            aVar.a(new com.badlogic.gdx.graphics.r(4, 4, w.f74227w));
        }
        if ((j11 & 8) == 8) {
            aVar.a(new com.badlogic.gdx.graphics.r(8, 3, w.f74226v));
        }
        if ((j11 & 16) == 16) {
            aVar.a(new com.badlogic.gdx.graphics.r(16, 2, "a_texCoord0"));
        }
        int i11 = aVar.f13179b;
        com.badlogic.gdx.graphics.r[] rVarArr = new com.badlogic.gdx.graphics.r[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            rVarArr[i12] = (com.badlogic.gdx.graphics.r) aVar.get(i12);
        }
        return new com.badlogic.gdx.graphics.s(rVarArr);
    }

    @Override // l2.k
    public void A(short s11, short s12, short s13, short s14) {
        int i11 = this.f69222y;
        if (i11 == 4) {
            x(s11, s12, s13, s13, s14, s11);
        } else if (i11 == 1) {
            R(s11, s12, s12, s13, s13, s14, s14, s11);
        } else {
            if (i11 != 0) {
                throw new GdxRuntimeException("Incorrect primitive type");
            }
            Q(s11, s12, s13, s14);
        }
    }

    @Override // l2.k
    @Deprecated
    public void A0(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, float f13, float f14) {
        m2.g.o(this, f11, f12, i11, vector3, vector32, vector33, vector34, f13, f14);
    }

    @Override // l2.k
    @Deprecated
    public void B(Matrix4 matrix4, float f11, float f12, float f13, int i11, int i12, float f14, float f15, float f16, float f17) {
        m2.k.g(this, matrix4, f11, f12, f13, i11, i12, f14, f15, f16, f17);
    }

    @Override // l2.k
    @Deprecated
    public void B0(float f11, float f12, float f13, int i11, float f14, float f15, boolean z11) {
        m2.f.f(this, f11, f12, f13, i11, f14, f15, z11);
    }

    @Override // l2.k
    public void C(c2.b bVar) {
        if (bVar.f7487b != this.f69222y) {
            throw new GdxRuntimeException("Primitive type doesn't match");
        }
        d0(bVar.f7490e, bVar.f7488c, bVar.f7489d);
    }

    @Override // l2.k
    @Deprecated
    public void C0(float f11, float f12, float f13, float f14, float f15, float f16) {
        m2.c.e(this, f11, f12, f13, f14, f15, f16);
    }

    @Override // l2.k
    @Deprecated
    public void D(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17) {
        m2.g.p(this, f11, i11, f12, f13, f14, f15, f16, f17);
    }

    @Override // l2.k
    public void D0(short s11, short s12) {
        x0(2);
        this.f69205h.b(s11);
        this.f69205h.b(s12);
    }

    @Override // l2.k
    @Deprecated
    public void E(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25) {
        m2.g.j(this, f11, f12, i11, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25);
    }

    @Override // l2.k
    public void E0(Mesh mesh) {
        d0(mesh, 0, mesh.D0());
    }

    @Override // l2.k
    @Deprecated
    public void F(float f11, float f12, float f13, int i11) {
        o(f11, f12, f13, i11, 0.0f, 360.0f);
    }

    @Override // l2.k
    @Deprecated
    public void F0(float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23) {
        m2.g.e(this, f11, f12, f13, f14, i11, f15, f16, f17, f18, f19, f21, f22, f23);
    }

    @Override // l2.k
    public void G(float f11, float f12, float f13, float f14, float f15, float f16) {
        N(this.f69198a.b(null, null, null, null).h(f11, f12, f13), this.f69199b.b(null, null, null, null).h(f14, f15, f16));
    }

    @Override // l2.k
    @Deprecated
    public void G0(float f11, float f12, float f13, int i11) {
        m2.f.d(this, f11, f12, f13, i11);
    }

    @Override // l2.k
    public void H(short s11) {
        this.f69205h.b(s11);
    }

    @Override // l2.k
    @Deprecated
    public void H0(Matrix4 matrix4, float f11, float f12, float f13, int i11, int i12) {
        m2.k.f(this, matrix4, f11, f12, f13, i11, i12);
    }

    @Override // l2.k
    @Deprecated
    public void I(k.a aVar, k.a aVar2, k.a aVar3, k.a aVar4, int i11, int i12) {
        m2.i.f(this, aVar, aVar2, aVar3, aVar4, i11, i12);
    }

    @Override // l2.k
    @Deprecated
    public void I0(float f11, int i11, Vector3 vector3, Vector3 vector32, float f12, float f13) {
        m2.g.u(this, f11, i11, vector3, vector32, f12, f13);
    }

    @Override // l2.k
    public void J(boolean z11) {
        this.F = z11;
    }

    @Override // l2.k
    public void J0(k.a aVar, k.a aVar2, k.a aVar3) {
        y(3);
        g0(L0(aVar), L0(aVar2), L0(aVar3));
    }

    @Override // l2.k
    @Deprecated
    public void K(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i11) {
        m2.a.d(this, f11, f12, f13, f14, f15, f16, f17, f18, i11);
    }

    @Override // l2.k
    public void K0(Matrix4 matrix4) {
        boolean z11 = matrix4 != null;
        this.F = z11;
        if (z11) {
            this.G.set(matrix4);
            this.H.set(matrix4).inv().transpose();
        } else {
            this.G.idt();
            this.H.idt();
        }
    }

    @Override // l2.k
    @Deprecated
    public void L(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        m2.g.q(this, f11, i11, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    @Override // l2.k
    public short L0(k.a aVar) {
        return s(aVar.f69225b ? aVar.f69224a : null, aVar.f69227d ? aVar.f69226c : null, aVar.f69229f ? aVar.f69228e : null, aVar.f69231h ? aVar.f69230g : null);
    }

    @Override // l2.k
    public void M(float[] fArr, short[] sArr) {
        int i11 = this.J + 1;
        y(fArr.length / this.f69206i);
        int i12 = 0;
        while (i12 < fArr.length) {
            a(fArr, i12);
            i12 += this.f69206i;
        }
        x0(sArr.length);
        for (short s11 : sArr) {
            H((short) ((s11 & c2.f100412d) + i11));
        }
    }

    @Override // l2.k
    public void M0(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        J0(this.f69198a.b(vector3, null, null, null), this.f69199b.b(vector32, null, null, null), this.f69200c.b(vector33, null, null, null));
    }

    @Override // l2.k
    public void N(k.a aVar, k.a aVar2) {
        y(2);
        v(L0(aVar), L0(aVar2));
    }

    public final void N0() {
        c2.b bVar = this.f69218u;
        if (bVar != null) {
            this.I.getCenter(bVar.f7491f);
            this.I.getDimensions(this.f69218u.f7492g).scl(0.5f);
            c2.b bVar2 = this.f69218u;
            bVar2.f7493h = bVar2.f7492g.len();
            this.I.inf();
            c2.b bVar3 = this.f69218u;
            int i11 = this.f69208k;
            bVar3.f7488c = i11;
            int i12 = this.f69205h.f1634b;
            bVar3.f7489d = i12 - i11;
            this.f69208k = i12;
            this.f69218u = null;
        }
    }

    @Override // l2.k
    public void O(Vector3 vector3, com.badlogic.gdx.graphics.b bVar, Vector3 vector32, com.badlogic.gdx.graphics.b bVar2) {
        N(this.f69198a.b(vector3, null, bVar, null), this.f69199b.b(vector32, null, bVar2, null));
    }

    @Deprecated
    public void O0(int i11) {
        y(i11 * 4);
        a0(i11);
    }

    @Override // l2.k
    @Deprecated
    public void P(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, float f13, float f14) {
        m2.g.m(this, f11, f12, i11, vector3, vector32, f13, f14);
    }

    @Deprecated
    public void P0(int i11, int i12) {
        y(i11);
        a0(i12);
    }

    @Override // l2.k
    public void Q(short s11, short s12, short s13, short s14) {
        x0(4);
        this.f69205h.b(s11);
        this.f69205h.b(s12);
        this.f69205h.b(s13);
        this.f69205h.b(s14);
    }

    @Deprecated
    public void Q0(int i11) {
        y(i11 * 3);
        u0(i11);
    }

    @Override // l2.k
    public void R(short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18) {
        x0(8);
        this.f69205h.b(s11);
        this.f69205h.b(s12);
        this.f69205h.b(s13);
        this.f69205h.b(s14);
        this.f69205h.b(s15);
        this.f69205h.b(s16);
        this.f69205h.b(s17);
        this.f69205h.b(s18);
    }

    @Deprecated
    public void R0(int i11, int i12) {
        y(i11);
        u0(i12);
    }

    @Override // l2.k
    @Deprecated
    public void S(float f11, float f12, float f13, float f14, int i11, Vector3 vector3, Vector3 vector32) {
        m2.g.g(this, f11, f12, f13, f14, i11, vector3, vector32);
    }

    public int S0() {
        return this.f69206i;
    }

    @Override // l2.k
    @Deprecated
    public void T(float f11, float f12, float f13, int i11, int i12, float f14, float f15, float f16, float f17) {
        m2.k.e(this, f11, f12, f13, i11, i12, f14, f15, f16, f17);
    }

    public void T0(short[] sArr, int i11) {
        if (this.f69203f == null) {
            throw new GdxRuntimeException("Must be called in between #begin and #end");
        }
        if (i11 >= 0) {
            int length = sArr.length;
            t0 t0Var = this.f69205h;
            int i12 = t0Var.f1634b;
            if (i11 <= length - i12) {
                System.arraycopy(t0Var.f1633a, 0, sArr, i11, i12);
                return;
            }
        }
        throw new GdxRuntimeException("Array too small or offset out of range");
    }

    @Override // l2.k
    @Deprecated
    public void U(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35, Vector3 vector36, Vector3 vector37, Vector3 vector38) {
        m2.c.g(this, vector3, vector32, vector33, vector34, vector35, vector36, vector37, vector38);
    }

    public short[] U0() {
        return this.f69205h.f1633a;
    }

    @Override // l2.k
    @Deprecated
    public void V(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26) {
        m2.g.s(this, f11, i11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26);
    }

    public int V0() {
        return this.f69205h.f1634b;
    }

    @Override // l2.k
    @Deprecated
    public void W(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21) {
        m2.g.i(this, f11, f12, i11, f13, f14, f15, f16, f17, f18, f19, f21);
    }

    public int W0() {
        return this.f69204g.f1626b / this.f69206i;
    }

    @Override // l2.k
    @Deprecated
    public void X(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18) {
        m2.g.h(this, f11, f12, i11, f13, f14, f15, f16, f17, f18);
    }

    public void X0(float[] fArr, int i11) {
        if (this.f69203f == null) {
            throw new GdxRuntimeException("Must be called in between #begin and #end");
        }
        if (i11 >= 0) {
            int length = fArr.length;
            a3.r rVar = this.f69204g;
            int i12 = rVar.f1626b;
            if (i11 <= length - i12) {
                System.arraycopy(rVar.f1625a, 0, fArr, i11, i12);
                return;
            }
        }
        throw new GdxRuntimeException("Array too small or offset out of range");
    }

    @Override // l2.k
    public boolean Y() {
        return this.F;
    }

    public float[] Y0() {
        return this.f69204g.f1625a;
    }

    @Override // l2.k
    @Deprecated
    public void Z(float f11, float f12, float f13, int i11, float f14, float f15) {
        m2.f.e(this, f11, f12, f13, i11, f14, f15);
    }

    public c2.b Z0(String str, int i11) {
        return a1(str, i11, new c2.b());
    }

    public final void a(float[] fArr, int i11) {
        int i12;
        a3.r rVar = this.f69204g;
        int i13 = rVar.f1626b;
        rVar.h(fArr, i11, this.f69206i);
        int i14 = this.f69207j;
        this.f69207j = i14 + 1;
        this.J = i14;
        if (this.F) {
            c1(this.f69204g.f1625a, this.f69209l + i13, this.f69210m, this.G);
            int i15 = this.f69211n;
            if (i15 >= 0) {
                b1(this.f69204g.f1625a, i15 + i13, 3, this.H);
            }
            int i16 = this.f69212o;
            if (i16 >= 0) {
                b1(this.f69204g.f1625a, i16 + i13, 3, this.H);
            }
            int i17 = this.f69213p;
            if (i17 >= 0) {
                b1(this.f69204g.f1625a, i17 + i13, 3, this.H);
            }
        }
        float[] fArr2 = this.f69204g.f1625a;
        int i18 = this.f69209l;
        float f11 = fArr2[i13 + i18];
        int i19 = this.f69210m;
        this.I.ext(f11, i19 > 1 ? fArr2[i13 + i18 + 1] : 0.0f, i19 > 2 ? fArr2[i18 + i13 + 2] : 0.0f);
        if (this.f69221x) {
            int i21 = this.f69214q;
            if (i21 >= 0) {
                float[] fArr3 = this.f69204g.f1625a;
                int i22 = i13 + i21;
                float f12 = fArr3[i22];
                com.badlogic.gdx.graphics.b bVar = this.f69220w;
                fArr3[i22] = f12 * bVar.f11544a;
                int i23 = i13 + i21 + 1;
                fArr3[i23] = fArr3[i23] * bVar.f11545b;
                int i24 = i13 + i21 + 2;
                fArr3[i24] = fArr3[i24] * bVar.f11546c;
                if (this.f69215r > 3) {
                    int i25 = i21 + i13 + 3;
                    fArr3[i25] = fArr3[i25] * bVar.f11547d;
                }
            } else {
                int i26 = this.f69216s;
                if (i26 >= 0) {
                    com.badlogic.gdx.graphics.b.a(this.f69202e, this.f69204g.f1625a[i26 + i13]);
                    this.f69204g.f1625a[this.f69216s + i13] = this.f69202e.r(this.f69220w).L();
                }
            }
        }
        if (!this.D || (i12 = this.f69217t) < 0) {
            return;
        }
        float[] fArr4 = this.f69204g.f1625a;
        fArr4[i13 + i12] = this.f69223z + (this.A * fArr4[i13 + i12]);
        fArr4[i13 + i12 + 1] = this.B + (this.C * fArr4[i13 + i12 + 1]);
    }

    @Override // l2.k
    public void a0(int i11) {
        int i12 = this.f69222y;
        if (i12 == 0) {
            x0(i11 * 4);
        } else if (i12 == 1) {
            x0(i11 * 8);
        } else {
            x0(i11 * 6);
        }
    }

    public c2.b a1(String str, int i11, c2.b bVar) {
        if (this.f69203f == null) {
            throw new RuntimeException("Call begin() first");
        }
        N0();
        this.f69218u = bVar;
        bVar.f7486a = str;
        bVar.f7487b = i11;
        this.f69222y = i11;
        this.f69219v.a(bVar);
        h(null);
        K0(null);
        j0(null);
        return this.f69218u;
    }

    public void b(long j11) {
        e(g(j11), -1);
    }

    @Override // l2.k
    public int b0() {
        return this.f69222y;
    }

    public void c(long j11, int i11) {
        e(g(j11), i11);
    }

    @Override // l2.k
    public void c0(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35) {
        r(this.f69198a.b(vector3, vector35, null, null).j(0.0f, 1.0f), this.f69199b.b(vector32, vector35, null, null).j(1.0f, 1.0f), this.f69200c.b(vector33, vector35, null, null).j(1.0f, 0.0f), this.f69201d.b(vector34, vector35, null, null).j(0.0f, 0.0f));
    }

    public void d(com.badlogic.gdx.graphics.s sVar) {
        e(sVar, -1);
    }

    @Override // l2.k
    public void d0(Mesh mesh, int i11, int i12) {
        if (!this.f69203f.equals(mesh.r1())) {
            throw new GdxRuntimeException("Vertex attributes do not match");
        }
        if (i12 <= 0) {
            return;
        }
        int m11 = mesh.m() * this.f69206i;
        a3.r rVar = O;
        rVar.i();
        rVar.k(m11);
        rVar.f1626b = m11;
        mesh.w1(rVar.f1625a);
        t0 t0Var = N;
        t0Var.j();
        t0Var.l(i12);
        t0Var.f1634b = i12;
        mesh.g1(i11, i12, t0Var.f1633a, 0);
        q(rVar.f1625a, t0Var.f1633a, 0, i12);
    }

    public void e(com.badlogic.gdx.graphics.s sVar, int i11) {
        if (this.f69203f != null) {
            throw new RuntimeException("Call end() first");
        }
        this.f69203f = sVar;
        this.f69204g.i();
        this.f69205h.j();
        this.f69219v.clear();
        this.f69207j = 0;
        this.J = -1;
        this.f69208k = 0;
        this.f69218u = null;
        int i12 = sVar.f12497b / 4;
        this.f69206i = i12;
        float[] fArr = this.E;
        if (fArr == null || fArr.length < i12) {
            this.E = new float[i12];
        }
        com.badlogic.gdx.graphics.r d11 = sVar.d(1);
        if (d11 == null) {
            throw new GdxRuntimeException("Cannot build mesh without position attribute");
        }
        this.f69209l = d11.f12492e / 4;
        this.f69210m = d11.f12489b;
        com.badlogic.gdx.graphics.r d12 = sVar.d(8);
        this.f69211n = d12 == null ? -1 : d12.f12492e / 4;
        com.badlogic.gdx.graphics.r d13 = sVar.d(256);
        this.f69212o = d13 == null ? -1 : d13.f12492e / 4;
        com.badlogic.gdx.graphics.r d14 = sVar.d(128);
        this.f69213p = d14 == null ? -1 : d14.f12492e / 4;
        com.badlogic.gdx.graphics.r d15 = sVar.d(2);
        this.f69214q = d15 == null ? -1 : d15.f12492e / 4;
        this.f69215r = d15 != null ? d15.f12489b : 0;
        com.badlogic.gdx.graphics.r d16 = sVar.d(4);
        this.f69216s = d16 == null ? -1 : d16.f12492e / 4;
        com.badlogic.gdx.graphics.r d17 = sVar.d(16);
        this.f69217t = d17 != null ? d17.f12492e / 4 : -1;
        h(null);
        K0(null);
        j0(null);
        this.f69222y = i11;
        this.I.inf();
    }

    @Override // l2.k
    @Deprecated
    public void e0(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32) {
        m2.g.l(this, f11, f12, i11, vector3, vector32);
    }

    public void f() {
        this.f69204g.i();
        this.f69205h.j();
        this.f69219v.clear();
        this.f69207j = 0;
        this.J = -1;
        this.f69208k = 0;
        this.f69218u = null;
    }

    @Override // l2.k
    @Deprecated
    public void f0(float f11, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, float f12, float f13) {
        V(f11, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, vector33.f12537x, vector33.f12538y, vector33.f12539z, vector34.f12537x, vector34.f12538y, vector34.f12539z, f12, f13);
    }

    @Override // l2.k
    public void g0(short s11, short s12, short s13) {
        int i11 = this.f69222y;
        if (i11 == 4 || i11 == 0) {
            s0(s11, s12, s13);
        } else {
            if (i11 != 1) {
                throw new GdxRuntimeException("Incorrect primitive type");
            }
            x(s11, s12, s12, s13, s13, s11);
        }
    }

    @Override // l2.k
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f69203f;
    }

    @Override // l2.k
    public void h(com.badlogic.gdx.graphics.b bVar) {
        com.badlogic.gdx.graphics.b bVar2 = this.f69220w;
        boolean z11 = bVar != null;
        this.f69221x = z11;
        if (!z11) {
            bVar = com.badlogic.gdx.graphics.b.f11522e;
        }
        bVar2.H(bVar);
    }

    @Override // l2.k
    @Deprecated
    public void h0(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24) {
        m2.g.r(this, f11, i11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24);
    }

    public Mesh i() {
        return j(new Mesh(true, Math.min(this.f69204g.f1626b / this.f69206i, 65536), this.f69205h.f1634b, this.f69203f));
    }

    @Override // l2.k
    public void i0(int i11, int i12) {
        y(i11);
        x0(i12);
    }

    public Mesh j(Mesh mesh) {
        N0();
        com.badlogic.gdx.graphics.s sVar = this.f69203f;
        if (sVar == null) {
            throw new GdxRuntimeException("Call begin() first");
        }
        if (!sVar.equals(mesh.r1())) {
            throw new GdxRuntimeException("Mesh attributes don't match");
        }
        if (mesh.p1() * this.f69206i < this.f69204g.f1626b) {
            throw new GdxRuntimeException("Mesh can't hold enough vertices: " + mesh.p1() + " * " + this.f69206i + " < " + this.f69204g.f1626b);
        }
        if (mesh.o1() < this.f69205h.f1634b) {
            throw new GdxRuntimeException("Mesh can't hold enough indices: " + mesh.o1() + " < " + this.f69205h.f1634b);
        }
        a3.r rVar = this.f69204g;
        mesh.O1(rVar.f1625a, 0, rVar.f1626b);
        t0 t0Var = this.f69205h;
        mesh.I1(t0Var.f1633a, 0, t0Var.f1634b);
        a.b<c2.b> it = this.f69219v.iterator();
        while (it.hasNext()) {
            it.next().f7490e = mesh;
        }
        this.f69219v.clear();
        this.f69203f = null;
        this.f69204g.i();
        this.f69205h.j();
        return mesh;
    }

    @Override // l2.k
    public void j0(w1.o oVar) {
        if (oVar != null) {
            this.D = true;
            t(oVar.g(), oVar.i(), oVar.h(), oVar.j());
            return;
        }
        this.D = false;
        this.B = 0.0f;
        this.f69223z = 0.0f;
        this.C = 1.0f;
        this.A = 1.0f;
    }

    @Override // l2.k
    public void k(float f11, float f12, float f13, float f14) {
        this.f69220w.F(f11, f12, f13, f14);
        this.f69221x = !this.f69220w.equals(com.badlogic.gdx.graphics.b.f11522e);
    }

    @Override // l2.k
    @Deprecated
    public void k0(Matrix4 matrix4) {
        m2.c.f(this, matrix4);
    }

    @Override // l2.k
    @Deprecated
    public void l(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
        m2.g.k(this, f11, f12, i11, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26, f27);
    }

    @Override // l2.k
    public void l0(Vector3 vector3, com.badlogic.gdx.graphics.b bVar, Vector3 vector32, com.badlogic.gdx.graphics.b bVar2, Vector3 vector33, com.badlogic.gdx.graphics.b bVar3) {
        J0(this.f69198a.b(vector3, null, bVar, null), this.f69199b.b(vector32, null, bVar2, null), this.f69200c.b(vector33, null, bVar3, null));
    }

    @Override // l2.k
    public short m(float... fArr) {
        int length = fArr.length - this.f69206i;
        int i11 = 0;
        while (i11 <= length) {
            a(fArr, i11);
            i11 += this.f69206i;
        }
        return (short) this.J;
    }

    @Override // l2.k
    @Deprecated
    public void m0(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        m2.g.n(this, f11, f12, i11, vector3, vector32, vector33, vector34);
    }

    @Override // l2.k
    @Deprecated
    public void n(float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21) {
        m2.g.d(this, f11, f12, f13, f14, i11, f15, f16, f17, f18, f19, f21);
    }

    @Override // l2.k
    @Deprecated
    public void n0(float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29) {
        m2.g.f(this, f11, f12, f13, f14, i11, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26, f27, f28, f29);
    }

    @Override // l2.k
    @Deprecated
    public void o(float f11, float f12, float f13, int i11, float f14, float f15) {
        m2.e.e(this, f11, f12, f13, i11, f14, f15);
    }

    @Override // l2.k
    @Deprecated
    public void o0(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35, int i11, int i12) {
        m2.i.e(this, vector3, vector32, vector33, vector34, vector35, i11, i12);
    }

    @Override // l2.k
    @Deprecated
    public void p(k.a aVar, k.a aVar2, k.a aVar3, k.a aVar4, k.a aVar5, k.a aVar6, k.a aVar7, k.a aVar8) {
        m2.c.i(this, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    @Override // l2.k
    @Deprecated
    public void p0(float f11, int i11, Vector3 vector3, Vector3 vector32) {
        m2.g.t(this, f11, i11, vector3, vector32);
    }

    @Override // l2.k
    public void q(float[] fArr, short[] sArr, int i11, int i12) {
        x xVar = Q;
        if (xVar == null) {
            Q = new x(i12);
        } else {
            xVar.clear();
            Q.f(i12);
        }
        x0(i12);
        int length = fArr.length / this.f69206i;
        if (length >= i12) {
            length = i12;
        }
        y(length);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = sArr[i11 + i13] & c2.f100412d;
            int j11 = Q.j(i14, -1);
            if (j11 < 0) {
                a(fArr, this.f69206i * i14);
                x xVar2 = Q;
                int i15 = this.J;
                xVar2.q(i14, i15);
                j11 = i15;
            }
            H((short) j11);
        }
    }

    @Override // l2.k
    @Deprecated
    public void q0(float f11, float f12, float f13, int i11, int i12) {
        m2.k.d(this, f11, f12, f13, i11, i12);
    }

    @Override // l2.k
    public void r(k.a aVar, k.a aVar2, k.a aVar3, k.a aVar4) {
        y(4);
        A(L0(aVar), L0(aVar2), L0(aVar3), L0(aVar4));
    }

    @Override // l2.k
    public c2.b r0() {
        return this.f69218u;
    }

    @Override // l2.k
    public short s(Vector3 vector3, Vector3 vector32, com.badlogic.gdx.graphics.b bVar, Vector2 vector2) {
        int i11;
        if (this.f69207j > 65535) {
            throw new GdxRuntimeException("Too many vertices used");
        }
        float[] fArr = this.E;
        int i12 = this.f69209l;
        fArr[i12] = vector3.f12537x;
        int i13 = this.f69210m;
        if (i13 > 1) {
            fArr[i12 + 1] = vector3.f12538y;
        }
        if (i13 > 2) {
            fArr[i12 + 2] = vector3.f12539z;
        }
        if (this.f69211n >= 0) {
            if (vector32 == null) {
                vector32 = this.K.set(vector3).nor();
            }
            float[] fArr2 = this.E;
            int i14 = this.f69211n;
            fArr2[i14] = vector32.f12537x;
            fArr2[i14 + 1] = vector32.f12538y;
            fArr2[i14 + 2] = vector32.f12539z;
        }
        int i15 = this.f69214q;
        if (i15 >= 0) {
            if (bVar == null) {
                bVar = com.badlogic.gdx.graphics.b.f11522e;
            }
            float[] fArr3 = this.E;
            fArr3[i15] = bVar.f11544a;
            fArr3[i15 + 1] = bVar.f11545b;
            fArr3[i15 + 2] = bVar.f11546c;
            if (this.f69215r > 3) {
                fArr3[i15 + 3] = bVar.f11547d;
            }
        } else {
            int i16 = this.f69216s;
            if (i16 > 0) {
                if (bVar == null) {
                    bVar = com.badlogic.gdx.graphics.b.f11522e;
                }
                this.E[i16] = bVar.L();
            }
        }
        if (vector2 != null && (i11 = this.f69217t) >= 0) {
            float[] fArr4 = this.E;
            fArr4[i11] = vector2.f12535x;
            fArr4[i11 + 1] = vector2.f12536y;
        }
        a(this.E, 0);
        return (short) this.J;
    }

    @Override // l2.k
    public void s0(short s11, short s12, short s13) {
        x0(3);
        this.f69205h.b(s11);
        this.f69205h.b(s12);
        this.f69205h.b(s13);
    }

    @Override // l2.k
    public void t(float f11, float f12, float f13, float f14) {
        this.f69223z = f11;
        this.B = f12;
        this.A = f13 - f11;
        this.C = f14 - f12;
        this.D = (com.badlogic.gdx.math.n.z(f11) && com.badlogic.gdx.math.n.z(f12) && com.badlogic.gdx.math.n.w(f13, 1.0f) && com.badlogic.gdx.math.n.w(f14, 1.0f)) ? false : true;
    }

    @Override // l2.k
    public Matrix4 t0(Matrix4 matrix4) {
        return matrix4.set(this.G);
    }

    @Override // l2.k
    @Deprecated
    public void u(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, int i11, int i12) {
        m2.i.d(this, f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26, i11, i12);
    }

    @Override // l2.k
    public void u0(int i11) {
        int i12 = this.f69222y;
        if (i12 == 1) {
            x0(i11 * 6);
        } else {
            if (i12 != 4 && i12 != 0) {
                throw new GdxRuntimeException("Incorrect primtive type");
            }
            x0(i11 * 3);
        }
    }

    @Override // l2.k
    public void v(short s11, short s12) {
        if (this.f69222y != 1) {
            throw new GdxRuntimeException("Incorrect primitive type");
        }
        D0(s11, s12);
    }

    @Override // l2.k
    public void v0(Vector3 vector3, Vector3 vector32) {
        N(this.f69198a.b(vector3, null, null, null), this.f69199b.b(vector32, null, null, null));
    }

    @Override // l2.k
    public int w() {
        return this.J;
    }

    @Override // l2.k
    public void w0(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26) {
        r(this.f69198a.b(null, null, null, null).h(f11, f12, f13).f(f24, f25, f26).j(0.0f, 1.0f), this.f69199b.b(null, null, null, null).h(f14, f15, f16).f(f24, f25, f26).j(1.0f, 1.0f), this.f69200c.b(null, null, null, null).h(f17, f18, f19).f(f24, f25, f26).j(1.0f, 0.0f), this.f69201d.b(null, null, null, null).h(f21, f22, f23).f(f24, f25, f26).j(0.0f, 0.0f));
    }

    @Override // l2.k
    public void x(short s11, short s12, short s13, short s14, short s15, short s16) {
        x0(6);
        this.f69205h.b(s11);
        this.f69205h.b(s12);
        this.f69205h.b(s13);
        this.f69205h.b(s14);
        this.f69205h.b(s15);
        this.f69205h.b(s16);
    }

    @Override // l2.k
    public void x0(int i11) {
        this.f69205h.l(i11);
    }

    @Override // l2.k
    public void y(int i11) {
        this.f69204g.k(this.f69206i * i11);
    }

    @Override // l2.k
    @Deprecated
    public void y0(float f11, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        m2.g.v(this, f11, i11, vector3, vector32, vector33, vector34);
    }

    @Override // l2.k
    @Deprecated
    public void z(float f11, float f12, float f13) {
        m2.c.d(this, f11, f12, f13);
    }

    @Override // l2.k
    @Deprecated
    public void z0(float f11, float f12, int i11) {
        m2.d.d(this, f11, f12, i11);
    }
}
