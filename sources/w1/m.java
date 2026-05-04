package w1;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ShortBuffer;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m implements a {

    /* renamed from: y, reason: collision with root package name */
    @Deprecated
    public static Mesh.VertexDataType f94563y = Mesh.VertexDataType.VertexBufferObject;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static Mesh.VertexDataType f94564z = null;

    /* renamed from: a, reason: collision with root package name */
    public Mesh.VertexDataType f94565a;

    /* renamed from: b, reason: collision with root package name */
    public Mesh f94566b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f94567c;

    /* renamed from: d, reason: collision with root package name */
    public int f94568d;

    /* renamed from: e, reason: collision with root package name */
    public Texture f94569e;

    /* renamed from: f, reason: collision with root package name */
    public float f94570f;

    /* renamed from: g, reason: collision with root package name */
    public float f94571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f94572h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix4 f94573i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix4 f94574j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix4 f94575k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f94576l;

    /* renamed from: m, reason: collision with root package name */
    public int f94577m;

    /* renamed from: n, reason: collision with root package name */
    public int f94578n;

    /* renamed from: o, reason: collision with root package name */
    public int f94579o;

    /* renamed from: p, reason: collision with root package name */
    public int f94580p;

    /* renamed from: q, reason: collision with root package name */
    public final w f94581q;

    /* renamed from: r, reason: collision with root package name */
    public w f94582r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f94583s;

    /* renamed from: t, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94584t;

    /* renamed from: u, reason: collision with root package name */
    public float f94585u;

    /* renamed from: v, reason: collision with root package name */
    public int f94586v;

    /* renamed from: w, reason: collision with root package name */
    public int f94587w;

    /* renamed from: x, reason: collision with root package name */
    public int f94588x;

    public m() {
        this(1000, null);
    }

    public static w b() {
        w wVar = new w("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n", "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP \n#endif\nvarying LOWP vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}");
        if (wVar.q1()) {
            return wVar;
        }
        throw new IllegalArgumentException("Error compiling shader: " + wVar.f1());
    }

    @Override // w1.a
    public Matrix4 B0() {
        return this.f94573i;
    }

    @Override // w1.a
    public boolean E0() {
        return !this.f94576l;
    }

    @Override // w1.a
    public void F() {
        if (this.f94576l) {
            flush();
            this.f94576l = false;
        }
    }

    @Override // w1.a
    public void G(float f11) {
        com.badlogic.gdx.graphics.b.a(this.f94584t, f11);
        this.f94585u = f11;
    }

    @Override // w1.a
    public int H0() {
        return this.f94578n;
    }

    @Override // w1.a
    public int J() {
        return this.f94580p;
    }

    @Override // w1.a
    public void K(Texture texture, float f11, float f12, int i11, int i12, int i13, int i14) {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f13 = this.f94570f;
        float f14 = i11 * f13;
        float f15 = this.f94571g;
        float f16 = (i12 + i14) * f15;
        float f17 = (i11 + i13) * f13;
        float f18 = i12 * f15;
        float f19 = i13 + f11;
        float f21 = i14 + f12;
        float f22 = this.f94585u;
        int i15 = this.f94568d;
        fArr[i15] = f11;
        fArr[i15 + 1] = f12;
        fArr[i15 + 2] = f22;
        fArr[i15 + 3] = f14;
        fArr[i15 + 4] = f16;
        fArr[i15 + 5] = f11;
        fArr[i15 + 6] = f21;
        fArr[i15 + 7] = f22;
        fArr[i15 + 8] = f14;
        fArr[i15 + 9] = f18;
        fArr[i15 + 10] = f19;
        fArr[i15 + 11] = f21;
        fArr[i15 + 12] = f22;
        fArr[i15 + 13] = f17;
        fArr[i15 + 14] = f18;
        fArr[i15 + 15] = f19;
        fArr[i15 + 16] = f12;
        fArr[i15 + 17] = f22;
        fArr[i15 + 18] = f17;
        fArr[i15 + 19] = f16;
        this.f94568d = i15 + 20;
    }

    @Override // w1.a
    public void K0(w wVar) {
        if (wVar == this.f94582r) {
            return;
        }
        if (this.f94572h) {
            flush();
        }
        this.f94582r = wVar;
        if (this.f94572h) {
            if (wVar != null) {
                wVar.S();
            } else {
                this.f94581q.S();
            }
            o();
        }
    }

    @Override // w1.a
    public void L(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f31;
        float f32;
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        Texture texture = oVar.f94611a;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f33 = f11 + f13;
        float f34 = f12 + f14;
        float f35 = -f13;
        float f36 = -f14;
        float f37 = f15 - f13;
        float f38 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f35 *= f17;
            f36 *= f18;
            f37 *= f17;
            f38 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f39 = t11 * f35;
            f22 = f39 - (a02 * f36);
            float f41 = f35 * a02;
            float f42 = (f36 * t11) + f41;
            float f43 = a02 * f38;
            f21 = f39 - f43;
            float f44 = f38 * t11;
            f25 = f41 + f44;
            float f45 = (t11 * f37) - f43;
            float f46 = f44 + (a02 * f37);
            f24 = f46 - (f25 - f42);
            f27 = (f45 - f21) + f22;
            f37 = f45;
            f23 = f42;
            f26 = f46;
        } else {
            f21 = f35;
            f22 = f21;
            f23 = f36;
            f24 = f23;
            f25 = f38;
            f26 = f25;
            f27 = f37;
        }
        float f47 = f22 + f33;
        float f48 = f23 + f34;
        float f49 = f21 + f33;
        float f51 = f25 + f34;
        float f52 = f37 + f33;
        float f53 = f26 + f34;
        float f54 = f27 + f33;
        float f55 = f24 + f34;
        if (z11) {
            f28 = oVar.f94614d;
            f29 = oVar.f94615e;
            f31 = oVar.f94612b;
            f32 = oVar.f94613c;
        } else {
            f28 = oVar.f94612b;
            f29 = oVar.f94613c;
            f31 = oVar.f94614d;
            f32 = oVar.f94615e;
        }
        float f56 = f32;
        float f57 = f29;
        float f58 = f31;
        float f59 = f28;
        float f61 = this.f94585u;
        int i11 = this.f94568d;
        fArr[i11] = f47;
        fArr[i11 + 1] = f48;
        fArr[i11 + 2] = f61;
        fArr[i11 + 3] = f59;
        fArr[i11 + 4] = f57;
        fArr[i11 + 5] = f49;
        fArr[i11 + 6] = f51;
        fArr[i11 + 7] = f61;
        fArr[i11 + 8] = f58;
        fArr[i11 + 9] = f57;
        fArr[i11 + 10] = f52;
        fArr[i11 + 11] = f53;
        fArr[i11 + 12] = f61;
        fArr[i11 + 13] = f58;
        fArr[i11 + 14] = f56;
        fArr[i11 + 15] = f54;
        fArr[i11 + 16] = f55;
        fArr[i11 + 17] = f61;
        fArr[i11 + 18] = f59;
        fArr[i11 + 19] = f56;
        this.f94568d = i11 + 20;
    }

    @Override // w1.a
    public float N0() {
        return this.f94585u;
    }

    @Override // w1.a
    public void O0(o oVar, float f11, float f12, Affine2 affine2) {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        Texture texture = oVar.f94611a;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f13 = affine2.m02;
        float f14 = affine2.m12;
        float f15 = affine2.m01;
        float f16 = (f15 * f12) + f13;
        float f17 = affine2.m11;
        float f18 = (f17 * f12) + f14;
        float f19 = affine2.f12517m00;
        float f21 = (f19 * f11) + (f15 * f12) + f13;
        float f22 = affine2.f12518m10;
        float f23 = (f22 * f11) + (f17 * f12) + f14;
        float f24 = (f19 * f11) + f13;
        float f25 = (f22 * f11) + f14;
        float f26 = oVar.f94612b;
        float f27 = oVar.f94615e;
        float f28 = oVar.f94614d;
        float f29 = oVar.f94613c;
        float f31 = this.f94585u;
        int i11 = this.f94568d;
        fArr[i11] = f13;
        fArr[i11 + 1] = f14;
        fArr[i11 + 2] = f31;
        fArr[i11 + 3] = f26;
        fArr[i11 + 4] = f27;
        fArr[i11 + 5] = f16;
        fArr[i11 + 6] = f18;
        fArr[i11 + 7] = f31;
        fArr[i11 + 8] = f26;
        fArr[i11 + 9] = f29;
        fArr[i11 + 10] = f21;
        fArr[i11 + 11] = f23;
        fArr[i11 + 12] = f31;
        fArr[i11 + 13] = f28;
        fArr[i11 + 14] = f29;
        fArr[i11 + 15] = f24;
        fArr[i11 + 16] = f25;
        fArr[i11 + 17] = f31;
        fArr[i11 + 18] = f28;
        fArr[i11 + 19] = f27;
        this.f94568d = i11 + 20;
    }

    @Override // w1.a
    public void R0(Matrix4 matrix4) {
        if (this.f94572h) {
            flush();
        }
        this.f94573i.set(matrix4);
        if (this.f94572h) {
            o();
        }
    }

    @Override // w1.a
    public void T0(Texture texture, float f11, float f12, float f13, float f14) {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        float f17 = this.f94585u;
        int i11 = this.f94568d;
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
        fArr[i11 + 2] = f17;
        fArr[i11 + 3] = 0.0f;
        fArr[i11 + 4] = 1.0f;
        fArr[i11 + 5] = f11;
        fArr[i11 + 6] = f16;
        fArr[i11 + 7] = f17;
        fArr[i11 + 8] = 0.0f;
        fArr[i11 + 9] = 0.0f;
        fArr[i11 + 10] = f15;
        fArr[i11 + 11] = f16;
        fArr[i11 + 12] = f17;
        fArr[i11 + 13] = 1.0f;
        fArr[i11 + 14] = 0.0f;
        fArr[i11 + 15] = f15;
        fArr[i11 + 16] = f12;
        fArr[i11 + 17] = f17;
        fArr[i11 + 18] = 1.0f;
        fArr[i11 + 19] = 1.0f;
        this.f94568d = i11 + 20;
    }

    @Override // w1.a
    public int X0() {
        return this.f94579o;
    }

    @Override // w1.a
    public void Z0(Matrix4 matrix4) {
        if (this.f94572h) {
            flush();
        }
        this.f94574j.set(matrix4);
        if (this.f94572h) {
            o();
        }
    }

    @Override // w1.a
    public int b0() {
        return this.f94577m;
    }

    @Override // w1.a
    public void c() {
        if (this.f94572h) {
            throw new IllegalStateException("SpriteBatch.end must be called before begin.");
        }
        this.f94586v = 0;
        q1.g.f81384g.glDepthMask(false);
        w wVar = this.f94582r;
        if (wVar != null) {
            wVar.S();
        } else {
            this.f94581q.S();
        }
        o();
        this.f94572h = true;
    }

    @Override // w1.a
    public void c0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f19 = f13 + f11;
        float f21 = f14 + f12;
        float f22 = this.f94585u;
        int i11 = this.f94568d;
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
        fArr[i11 + 2] = f22;
        fArr[i11 + 3] = f15;
        fArr[i11 + 4] = f16;
        fArr[i11 + 5] = f11;
        fArr[i11 + 6] = f21;
        fArr[i11 + 7] = f22;
        fArr[i11 + 8] = f15;
        fArr[i11 + 9] = f18;
        fArr[i11 + 10] = f19;
        fArr[i11 + 11] = f21;
        fArr[i11 + 12] = f22;
        fArr[i11 + 13] = f17;
        fArr[i11 + 14] = f18;
        fArr[i11 + 15] = f19;
        fArr[i11 + 16] = f12;
        fArr[i11 + 17] = f22;
        fArr[i11 + 18] = f17;
        fArr[i11 + 19] = f16;
        this.f94568d = i11 + 20;
    }

    @Override // a3.q
    public void dispose() {
        w wVar;
        this.f94566b.dispose();
        if (!this.f94583s || (wVar = this.f94581q) == null) {
            return;
        }
        wVar.dispose();
    }

    @Override // w1.a
    public com.badlogic.gdx.graphics.b e() {
        return this.f94584t;
    }

    @Override // w1.a
    public boolean e0() {
        return this.f94572h;
    }

    @Override // w1.a
    public void end() {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before end.");
        }
        if (this.f94568d > 0) {
            flush();
        }
        this.f94569e = null;
        this.f94572h = false;
        com.badlogic.gdx.graphics.f fVar = q1.g.f81384g;
        fVar.glDepthMask(true);
        if (E0()) {
            fVar.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
    }

    @Override // w1.a
    public void f0(Texture texture, float f11, float f12) {
        T0(texture, f11, f12, texture.C0(), texture.I());
    }

    @Override // w1.a
    public void flush() {
        int i11 = this.f94568d;
        if (i11 == 0) {
            return;
        }
        this.f94586v++;
        this.f94587w++;
        int i12 = i11 / 20;
        if (i12 > this.f94588x) {
            this.f94588x = i12;
        }
        int i13 = i12 * 6;
        this.f94569e.S();
        Mesh mesh = this.f94566b;
        mesh.O1(this.f94567c, 0, this.f94568d);
        if (this.f94565a == Mesh.VertexDataType.VertexArray) {
            ShortBuffer l12 = mesh.l1(true);
            l12.position(0);
            l12.limit(i13);
        }
        if (this.f94576l) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        } else {
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            int i14 = this.f94577m;
            if (i14 != -1) {
                q1.g.f81384g.a5(i14, this.f94578n, this.f94579o, this.f94580p);
            }
        }
        w wVar = this.f94582r;
        if (wVar == null) {
            wVar = this.f94581q;
        }
        mesh.D1(wVar, 4, 0, i13);
        this.f94568d = 0;
    }

    @Override // w1.a
    public void g0(int i11, int i12) {
        k0(i11, i12, i11, i12);
    }

    @Override // w1.a
    public w getShader() {
        w wVar = this.f94582r;
        return wVar == null ? this.f94581q : wVar;
    }

    @Override // w1.a
    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f94584t.H(bVar);
        this.f94585u = bVar.L();
    }

    @Override // w1.a
    public void k(float f11, float f12, float f13, float f14) {
        this.f94584t.F(f11, f12, f13, f14);
        this.f94585u = this.f94584t.L();
    }

    @Override // w1.a
    public void k0(int i11, int i12, int i13, int i14) {
        if (this.f94577m == i11 && this.f94578n == i12 && this.f94579o == i13 && this.f94580p == i14) {
            return;
        }
        flush();
        this.f94577m = i11;
        this.f94578n = i12;
        this.f94579o = i13;
        this.f94580p = i14;
    }

    public void o() {
        this.f94575k.set(this.f94574j).mul(this.f94573i);
        w wVar = this.f94582r;
        if (wVar != null) {
            wVar.I1("u_projTrans", this.f94575k);
            this.f94582r.i2("u_texture", 0);
        } else {
            this.f94581q.I1("u_projTrans", this.f94575k);
            this.f94581q.i2("u_texture", 0);
        }
    }

    @Override // w1.a
    public void q(o oVar, float f11, float f12) {
        v0(oVar, f11, f12, oVar.c(), oVar.b());
    }

    @Override // w1.a
    public void q0(Texture texture, float f11, float f12, float f13, float f14, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f15 = this.f94570f;
        float f16 = i11 * f15;
        float f17 = this.f94571g;
        float f18 = (i14 + i12) * f17;
        float f19 = (i11 + i13) * f15;
        float f21 = i12 * f17;
        float f22 = f13 + f11;
        float f23 = f14 + f12;
        if (z11) {
            f19 = f16;
            f16 = f19;
        }
        if (z12) {
            f18 = f21;
            f21 = f18;
        }
        float f24 = this.f94585u;
        int i15 = this.f94568d;
        fArr[i15] = f11;
        fArr[i15 + 1] = f12;
        fArr[i15 + 2] = f24;
        fArr[i15 + 3] = f16;
        fArr[i15 + 4] = f18;
        fArr[i15 + 5] = f11;
        fArr[i15 + 6] = f23;
        fArr[i15 + 7] = f24;
        fArr[i15 + 8] = f16;
        fArr[i15 + 9] = f21;
        fArr[i15 + 10] = f22;
        fArr[i15 + 11] = f23;
        fArr[i15 + 12] = f24;
        fArr[i15 + 13] = f19;
        fArr[i15 + 14] = f21;
        fArr[i15 + 15] = f22;
        fArr[i15 + 16] = f12;
        fArr[i15 + 17] = f24;
        fArr[i15 + 18] = f19;
        fArr[i15 + 19] = f18;
        this.f94568d = i15 + 20;
    }

    @Override // w1.a
    public void s(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        Texture texture = oVar.f94611a;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f28 = f11 + f13;
        float f29 = f12 + f14;
        float f31 = -f13;
        float f32 = -f14;
        float f33 = f15 - f13;
        float f34 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f31 *= f17;
            f32 *= f18;
            f33 *= f17;
            f34 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f35 = t11 * f31;
            f22 = f35 - (a02 * f32);
            float f36 = f31 * a02;
            float f37 = (f32 * t11) + f36;
            float f38 = a02 * f34;
            f21 = f35 - f38;
            float f39 = f34 * t11;
            f25 = f36 + f39;
            float f41 = (t11 * f33) - f38;
            float f42 = f39 + (a02 * f33);
            f24 = f42 - (f25 - f37);
            f27 = (f41 - f21) + f22;
            f33 = f41;
            f23 = f37;
            f26 = f42;
        } else {
            f21 = f31;
            f22 = f21;
            f23 = f32;
            f24 = f23;
            f25 = f34;
            f26 = f25;
            f27 = f33;
        }
        float f43 = f22 + f28;
        float f44 = f23 + f29;
        float f45 = f21 + f28;
        float f46 = f25 + f29;
        float f47 = f33 + f28;
        float f48 = f26 + f29;
        float f49 = f27 + f28;
        float f51 = f24 + f29;
        float f52 = oVar.f94612b;
        float f53 = oVar.f94615e;
        float f54 = oVar.f94614d;
        float f55 = oVar.f94613c;
        float f56 = this.f94585u;
        int i11 = this.f94568d;
        fArr[i11] = f43;
        fArr[i11 + 1] = f44;
        fArr[i11 + 2] = f56;
        fArr[i11 + 3] = f52;
        fArr[i11 + 4] = f53;
        fArr[i11 + 5] = f45;
        fArr[i11 + 6] = f46;
        fArr[i11 + 7] = f56;
        fArr[i11 + 8] = f52;
        fArr[i11 + 9] = f55;
        fArr[i11 + 10] = f47;
        fArr[i11 + 11] = f48;
        fArr[i11 + 12] = f56;
        fArr[i11 + 13] = f54;
        fArr[i11 + 14] = f55;
        fArr[i11 + 15] = f49;
        fArr[i11 + 16] = f51;
        fArr[i11 + 17] = f56;
        fArr[i11 + 18] = f54;
        fArr[i11 + 19] = f53;
        this.f94568d = i11 + 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[LOOP:0: B:8:0x0029->B:10:0x002c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[SYNTHETIC] */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t0(com.badlogic.gdx.graphics.Texture r4, float[] r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r0 = r3.f94572h
            if (r0 == 0) goto L41
            float[] r0 = r3.f94567c
            int r0 = r0.length
            com.badlogic.gdx.graphics.Texture r1 = r3.f94569e
            if (r4 == r1) goto Lf
            r3.z(r4)
            goto L18
        Lf:
            int r4 = r3.f94568d
            int r4 = r0 - r4
            if (r4 != 0) goto L19
            r3.flush()
        L18:
            r4 = r0
        L19:
            int r4 = java.lang.Math.min(r4, r7)
            float[] r1 = r3.f94567c
            int r2 = r3.f94568d
            java.lang.System.arraycopy(r5, r6, r1, r2, r4)
            int r1 = r3.f94568d
            int r1 = r1 + r4
            r3.f94568d = r1
        L29:
            int r7 = r7 - r4
            if (r7 <= 0) goto L40
            int r6 = r6 + r4
            r3.flush()
            int r4 = java.lang.Math.min(r0, r7)
            float[] r1 = r3.f94567c
            r2 = 0
            java.lang.System.arraycopy(r5, r6, r1, r2, r4)
            int r1 = r3.f94568d
            int r1 = r1 + r4
            r3.f94568d = r1
            goto L29
        L40:
            return
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "SpriteBatch.begin must be called before draw."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.m.t0(com.badlogic.gdx.graphics.Texture, float[], int, int):void");
    }

    @Override // w1.a
    public void u0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f28 = f11 + f13;
        float f29 = f12 + f14;
        float f31 = -f13;
        float f32 = -f14;
        float f33 = f15 - f13;
        float f34 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f31 *= f17;
            f32 *= f18;
            f33 *= f17;
            f34 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f35 = t11 * f31;
            f22 = f35 - (a02 * f32);
            float f36 = f31 * a02;
            float f37 = (f32 * t11) + f36;
            float f38 = a02 * f34;
            f21 = f35 - f38;
            float f39 = f34 * t11;
            f25 = f36 + f39;
            float f41 = (t11 * f33) - f38;
            float f42 = f39 + (a02 * f33);
            f24 = f42 - (f25 - f37);
            f27 = (f41 - f21) + f22;
            f33 = f41;
            f23 = f37;
            f26 = f42;
        } else {
            f21 = f31;
            f22 = f21;
            f23 = f32;
            f24 = f23;
            f25 = f34;
            f26 = f25;
            f27 = f33;
        }
        float f43 = f22 + f28;
        float f44 = f23 + f29;
        float f45 = f21 + f28;
        float f46 = f25 + f29;
        float f47 = f33 + f28;
        float f48 = f26 + f29;
        float f49 = f27 + f28;
        float f51 = f24 + f29;
        float f52 = this.f94570f;
        float f53 = i11 * f52;
        float f54 = this.f94571g;
        float f55 = (i12 + i14) * f54;
        float f56 = (i11 + i13) * f52;
        float f57 = i12 * f54;
        if (z11) {
            f53 = f56;
            f56 = f53;
        }
        if (z12) {
            f55 = f57;
            f57 = f55;
        }
        float f58 = this.f94585u;
        int i15 = this.f94568d;
        fArr[i15] = f43;
        fArr[i15 + 1] = f44;
        fArr[i15 + 2] = f58;
        fArr[i15 + 3] = f53;
        fArr[i15 + 4] = f55;
        fArr[i15 + 5] = f45;
        fArr[i15 + 6] = f46;
        fArr[i15 + 7] = f58;
        fArr[i15 + 8] = f53;
        fArr[i15 + 9] = f57;
        fArr[i15 + 10] = f47;
        fArr[i15 + 11] = f48;
        fArr[i15 + 12] = f58;
        fArr[i15 + 13] = f56;
        fArr[i15 + 14] = f57;
        fArr[i15 + 15] = f49;
        fArr[i15 + 16] = f51;
        fArr[i15 + 17] = f58;
        fArr[i15 + 18] = f56;
        fArr[i15 + 19] = f55;
        this.f94568d = i15 + 20;
    }

    @Override // w1.a
    public void v() {
        if (this.f94576l) {
            return;
        }
        flush();
        this.f94576l = true;
    }

    @Override // w1.a
    public void v0(o oVar, float f11, float f12, float f13, float f14) {
        if (!this.f94572h) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] fArr = this.f94567c;
        Texture texture = oVar.f94611a;
        if (texture != this.f94569e) {
            z(texture);
        } else if (this.f94568d == fArr.length) {
            flush();
        }
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        float f17 = oVar.f94612b;
        float f18 = oVar.f94615e;
        float f19 = oVar.f94614d;
        float f21 = oVar.f94613c;
        float f22 = this.f94585u;
        int i11 = this.f94568d;
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
        fArr[i11 + 2] = f22;
        fArr[i11 + 3] = f17;
        fArr[i11 + 4] = f18;
        fArr[i11 + 5] = f11;
        fArr[i11 + 6] = f16;
        fArr[i11 + 7] = f22;
        fArr[i11 + 8] = f17;
        fArr[i11 + 9] = f21;
        fArr[i11 + 10] = f15;
        fArr[i11 + 11] = f16;
        fArr[i11 + 12] = f22;
        fArr[i11 + 13] = f19;
        fArr[i11 + 14] = f21;
        fArr[i11 + 15] = f15;
        fArr[i11 + 16] = f12;
        fArr[i11 + 17] = f22;
        fArr[i11 + 18] = f19;
        fArr[i11 + 19] = f18;
        this.f94568d = i11 + 20;
    }

    @Override // w1.a
    public Matrix4 x0() {
        return this.f94574j;
    }

    public void z(Texture texture) {
        flush();
        this.f94569e = texture;
        this.f94570f = 1.0f / texture.C0();
        this.f94571g = 1.0f / texture.I();
    }

    public m(int i11) {
        this(i11, null);
    }

    public m(int i11, w wVar) {
        this.f94568d = 0;
        this.f94569e = null;
        this.f94570f = 0.0f;
        this.f94571g = 0.0f;
        this.f94572h = false;
        this.f94573i = new Matrix4();
        Matrix4 matrix4 = new Matrix4();
        this.f94574j = matrix4;
        this.f94575k = new Matrix4();
        this.f94576l = false;
        this.f94577m = com.badlogic.gdx.graphics.f.f11653r;
        this.f94578n = com.badlogic.gdx.graphics.f.f11659s;
        this.f94579o = com.badlogic.gdx.graphics.f.f11653r;
        this.f94580p = com.badlogic.gdx.graphics.f.f11659s;
        this.f94582r = null;
        this.f94584t = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94585u = com.badlogic.gdx.graphics.b.f11527j;
        this.f94586v = 0;
        this.f94587w = 0;
        this.f94588x = 0;
        if (i11 <= 8191) {
            Mesh.VertexDataType vertexDataType = q1.g.f81386i != null ? Mesh.VertexDataType.VertexBufferObjectWithVAO : f94563y;
            Mesh.VertexDataType vertexDataType2 = f94564z;
            vertexDataType = vertexDataType2 != null ? vertexDataType2 : vertexDataType;
            this.f94565a = vertexDataType;
            int i12 = i11 * 6;
            this.f94566b = new Mesh(this.f94565a, false, i11 * 4, i12, new r(1, 2, w.f74225u), new r(4, 4, w.f74227w), new r(16, 2, "a_texCoord0"));
            matrix4.setToOrtho2D(0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
            this.f94567c = new float[i11 * 20];
            short[] sArr = new short[i12];
            int i13 = 0;
            short s11 = 0;
            while (i13 < i12) {
                sArr[i13] = s11;
                sArr[i13 + 1] = (short) (s11 + 1);
                short s12 = (short) (s11 + 2);
                sArr[i13 + 2] = s12;
                sArr[i13 + 3] = s12;
                sArr[i13 + 4] = (short) (s11 + 3);
                sArr[i13 + 5] = s11;
                i13 += 6;
                s11 = (short) (s11 + 4);
            }
            this.f94566b.H1(sArr);
            if (wVar == null) {
                this.f94581q = b();
                this.f94583s = true;
            } else {
                this.f94581q = wVar;
            }
            if (vertexDataType != Mesh.VertexDataType.VertexArray) {
                this.f94566b.f1().S();
                this.f94566b.f1().p();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Can't have more than 8191 sprites per batch: " + i11);
    }
}
