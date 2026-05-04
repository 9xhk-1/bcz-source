package l2;

import a3.j0;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements j0.a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f69225b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f69227d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f69229f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f69231h;

        /* renamed from: a, reason: collision with root package name */
        public final Vector3 f69224a = new Vector3();

        /* renamed from: c, reason: collision with root package name */
        public final Vector3 f69226c = new Vector3(0.0f, 1.0f, 0.0f);

        /* renamed from: e, reason: collision with root package name */
        public final com.badlogic.gdx.graphics.b f69228e = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

        /* renamed from: g, reason: collision with root package name */
        public final Vector2 f69230g = new Vector2();

        public a a(a aVar, float f11) {
            if (this.f69225b && aVar.f69225b) {
                this.f69224a.lerp(aVar.f69224a, f11);
            }
            if (this.f69227d && aVar.f69227d) {
                this.f69226c.lerp(aVar.f69226c, f11);
            }
            if (this.f69229f && aVar.f69229f) {
                this.f69228e.n(aVar.f69228e, f11);
            }
            if (this.f69231h && aVar.f69231h) {
                this.f69230g.lerp(aVar.f69230g, f11);
            }
            return this;
        }

        public a b(Vector3 vector3, Vector3 vector32, com.badlogic.gdx.graphics.b bVar, Vector2 vector2) {
            reset();
            boolean z11 = vector3 != null;
            this.f69225b = z11;
            if (z11) {
                this.f69224a.set(vector3);
            }
            boolean z12 = vector32 != null;
            this.f69227d = z12;
            if (z12) {
                this.f69226c.set(vector32);
            }
            boolean z13 = bVar != null;
            this.f69229f = z13;
            if (z13) {
                this.f69228e.H(bVar);
            }
            boolean z14 = vector2 != null;
            this.f69231h = z14;
            if (z14) {
                this.f69230g.set(vector2);
            }
            return this;
        }

        public a c(a aVar) {
            if (aVar == null) {
                return b(null, null, null, null);
            }
            this.f69225b = aVar.f69225b;
            this.f69224a.set(aVar.f69224a);
            this.f69227d = aVar.f69227d;
            this.f69226c.set(aVar.f69226c);
            this.f69229f = aVar.f69229f;
            this.f69228e.H(aVar.f69228e);
            this.f69231h = aVar.f69231h;
            this.f69230g.set(aVar.f69230g);
            return this;
        }

        public a d(float f11, float f12, float f13, float f14) {
            this.f69228e.F(f11, f12, f13, f14);
            this.f69229f = true;
            return this;
        }

        public a e(com.badlogic.gdx.graphics.b bVar) {
            boolean z11 = bVar != null;
            this.f69229f = z11;
            if (z11) {
                this.f69228e.H(bVar);
            }
            return this;
        }

        public a f(float f11, float f12, float f13) {
            this.f69226c.set(f11, f12, f13);
            this.f69227d = true;
            return this;
        }

        public a g(Vector3 vector3) {
            boolean z11 = vector3 != null;
            this.f69227d = z11;
            if (z11) {
                this.f69226c.set(vector3);
            }
            return this;
        }

        public a h(float f11, float f12, float f13) {
            this.f69224a.set(f11, f12, f13);
            this.f69225b = true;
            return this;
        }

        public a i(Vector3 vector3) {
            boolean z11 = vector3 != null;
            this.f69225b = z11;
            if (z11) {
                this.f69224a.set(vector3);
            }
            return this;
        }

        public a j(float f11, float f12) {
            this.f69230g.set(f11, f12);
            this.f69231h = true;
            return this;
        }

        public a k(Vector2 vector2) {
            boolean z11 = vector2 != null;
            this.f69231h = z11;
            if (z11) {
                this.f69230g.set(vector2);
            }
            return this;
        }

        @Override // a3.j0.a
        public void reset() {
            this.f69224a.set(0.0f, 0.0f, 0.0f);
            this.f69226c.set(0.0f, 1.0f, 0.0f);
            this.f69228e.F(1.0f, 1.0f, 1.0f, 1.0f);
            this.f69230g.set(0.0f, 0.0f);
        }
    }

    void A(short s11, short s12, short s13, short s14);

    @Deprecated
    void A0(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, float f13, float f14);

    @Deprecated
    void B(Matrix4 matrix4, float f11, float f12, float f13, int i11, int i12, float f14, float f15, float f16, float f17);

    @Deprecated
    void B0(float f11, float f12, float f13, int i11, float f14, float f15, boolean z11);

    void C(c2.b bVar);

    @Deprecated
    void C0(float f11, float f12, float f13, float f14, float f15, float f16);

    @Deprecated
    void D(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17);

    void D0(short s11, short s12);

    @Deprecated
    void E(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25);

    void E0(Mesh mesh);

    @Deprecated
    void F(float f11, float f12, float f13, int i11);

    @Deprecated
    void F0(float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23);

    void G(float f11, float f12, float f13, float f14, float f15, float f16);

    @Deprecated
    void G0(float f11, float f12, float f13, int i11);

    void H(short s11);

    @Deprecated
    void H0(Matrix4 matrix4, float f11, float f12, float f13, int i11, int i12);

    @Deprecated
    void I(a aVar, a aVar2, a aVar3, a aVar4, int i11, int i12);

    @Deprecated
    void I0(float f11, int i11, Vector3 vector3, Vector3 vector32, float f12, float f13);

    void J(boolean z11);

    void J0(a aVar, a aVar2, a aVar3);

    @Deprecated
    void K(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i11);

    void K0(Matrix4 matrix4);

    @Deprecated
    void L(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19);

    short L0(a aVar);

    void M(float[] fArr, short[] sArr);

    void M0(Vector3 vector3, Vector3 vector32, Vector3 vector33);

    void N(a aVar, a aVar2);

    void O(Vector3 vector3, com.badlogic.gdx.graphics.b bVar, Vector3 vector32, com.badlogic.gdx.graphics.b bVar2);

    @Deprecated
    void P(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, float f13, float f14);

    void Q(short s11, short s12, short s13, short s14);

    void R(short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18);

    @Deprecated
    void S(float f11, float f12, float f13, float f14, int i11, Vector3 vector3, Vector3 vector32);

    @Deprecated
    void T(float f11, float f12, float f13, int i11, int i12, float f14, float f15, float f16, float f17);

    @Deprecated
    void U(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35, Vector3 vector36, Vector3 vector37, Vector3 vector38);

    @Deprecated
    void V(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26);

    @Deprecated
    void W(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21);

    @Deprecated
    void X(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18);

    boolean Y();

    @Deprecated
    void Z(float f11, float f12, float f13, int i11, float f14, float f15);

    void a0(int i11);

    int b0();

    void c0(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35);

    void d0(Mesh mesh, int i11, int i12);

    @Deprecated
    void e0(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32);

    @Deprecated
    void f0(float f11, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, float f12, float f13);

    void g0(short s11, short s12, short s13);

    com.badlogic.gdx.graphics.s getAttributes();

    void h(com.badlogic.gdx.graphics.b bVar);

    @Deprecated
    void h0(float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24);

    void i0(int i11, int i12);

    void j0(w1.o oVar);

    void k(float f11, float f12, float f13, float f14);

    @Deprecated
    void k0(Matrix4 matrix4);

    @Deprecated
    void l(float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27);

    void l0(Vector3 vector3, com.badlogic.gdx.graphics.b bVar, Vector3 vector32, com.badlogic.gdx.graphics.b bVar2, Vector3 vector33, com.badlogic.gdx.graphics.b bVar3);

    short m(float... fArr);

    @Deprecated
    void m0(float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34);

    @Deprecated
    void n(float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21);

    @Deprecated
    void n0(float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29);

    @Deprecated
    void o(float f11, float f12, float f13, int i11, float f14, float f15);

    @Deprecated
    void o0(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35, int i11, int i12);

    @Deprecated
    void p(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8);

    @Deprecated
    void p0(float f11, int i11, Vector3 vector3, Vector3 vector32);

    void q(float[] fArr, short[] sArr, int i11, int i12);

    @Deprecated
    void q0(float f11, float f12, float f13, int i11, int i12);

    void r(a aVar, a aVar2, a aVar3, a aVar4);

    c2.b r0();

    short s(Vector3 vector3, Vector3 vector32, com.badlogic.gdx.graphics.b bVar, Vector2 vector2);

    void s0(short s11, short s12, short s13);

    void t(float f11, float f12, float f13, float f14);

    Matrix4 t0(Matrix4 matrix4);

    @Deprecated
    void u(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, int i11, int i12);

    void u0(int i11);

    void v(short s11, short s12);

    void v0(Vector3 vector3, Vector3 vector32);

    int w();

    void w0(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26);

    void x(short s11, short s12, short s13, short s14, short s15, short s16);

    void x0(int i11);

    void y(int i11);

    @Deprecated
    void y0(float f11, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34);

    @Deprecated
    void z(float f11, float f12, float f13);

    @Deprecated
    void z0(float f11, float f12, int i11);
}
