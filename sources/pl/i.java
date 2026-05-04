package pl;

import a3.d0;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import n2.w;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i implements w1.f {
    public static final int A = 6;
    public static final int B = 24;

    /* renamed from: a, reason: collision with root package name */
    public final Mesh f80828a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f80829b;

    /* renamed from: c, reason: collision with root package name */
    public final short[] f80830c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix4 f80831d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix4 f80832e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix4 f80833f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f80834g;

    /* renamed from: h, reason: collision with root package name */
    public w f80835h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80836i;

    /* renamed from: j, reason: collision with root package name */
    public w f80837j;

    /* renamed from: k, reason: collision with root package name */
    public int f80838k;

    /* renamed from: l, reason: collision with root package name */
    public int f80839l;

    /* renamed from: m, reason: collision with root package name */
    @d0
    public Texture f80840m;

    /* renamed from: n, reason: collision with root package name */
    public float f80841n;

    /* renamed from: o, reason: collision with root package name */
    public float f80842o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f80843p;

    /* renamed from: q, reason: collision with root package name */
    public int f80844q;

    /* renamed from: r, reason: collision with root package name */
    public int f80845r;

    /* renamed from: s, reason: collision with root package name */
    public int f80846s;

    /* renamed from: t, reason: collision with root package name */
    public int f80847t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f80848u;

    /* renamed from: v, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f80849v;

    /* renamed from: w, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f80850w;

    /* renamed from: x, reason: collision with root package name */
    public float f80851x;

    /* renamed from: y, reason: collision with root package name */
    public float f80852y;

    /* renamed from: z, reason: collision with root package name */
    public int f80853z;

    public i() {
        this(2000);
    }

    private void V0(Texture texture) {
        flush();
        this.f80840m = texture;
        this.f80841n = 1.0f / texture.C0();
        this.f80842o = 1.0f / texture.I();
    }

    public static w o() {
        w wVar = new w("attribute vec4 a_position;\nattribute vec4 a_light;\nattribute vec4 a_dark;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_light;\nvarying vec4 v_dark;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n  v_light = a_light;\n  v_light.a = v_light.a * (255.0/254.0);\n  v_dark = a_dark;\n  v_texCoords = a_texCoord0;\n  gl_Position = u_projTrans * a_position;\n}\n", "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP \n#endif\nvarying LOWP vec4 v_light;\nvarying LOWP vec4 v_dark;\nuniform float u_pma;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  vec4 texColor = texture2D(u_texture, v_texCoords);\n  gl_FragColor.a = texColor.a * v_light.a;\n  gl_FragColor.rgb = ((texColor.a - 1.0) * u_pma + 1.0 - texColor.rgb) * v_dark.rgb + texColor.rgb * v_light.rgb;\n}");
        if (wVar.q1()) {
            return wVar;
        }
        throw new IllegalArgumentException("Error compiling shader: " + wVar.f1());
    }

    @Override // w1.a
    public Matrix4 B0() {
        return this.f80831d;
    }

    public void C0(float f11) {
        com.badlogic.gdx.graphics.b.a(this.f80850w, f11);
        this.f80852y = f11;
    }

    public void D(Texture texture, float[] fArr, int i11, int i12, short[] sArr, int i13, int i14) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr2 = this.f80830c;
        float[] fArr2 = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + i14 > sArr2.length || this.f80838k + i12 > fArr2.length) {
            flush();
        }
        int i15 = this.f80839l;
        int i16 = this.f80838k;
        int i17 = i16 / 6;
        int i18 = i14 + i13;
        while (i13 < i18) {
            sArr2[i15] = (short) (sArr[i13] + i17);
            i13++;
            i15++;
        }
        this.f80839l = i15;
        g.a(fArr, i11, fArr2, i16, i12);
        this.f80838k += i12;
    }

    @Override // w1.a
    public boolean E0() {
        return !this.f80834g;
    }

    @Override // w1.a
    public void F() {
        flush();
        this.f80834g = false;
    }

    @Override // w1.a
    public void G(float f11) {
        com.badlogic.gdx.graphics.b.a(this.f80849v, f11);
        this.f80851x = f11;
    }

    @Override // w1.f
    public void H(w1.g gVar, float f11, float f12, float f13, float f14) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        short[] c11 = gVar.c();
        int length = c11.length;
        float[] d11 = gVar.d();
        int length2 = d11.length;
        Texture f15 = gVar.a().f();
        if (f15 != this.f80840m) {
            V0(f15);
        } else if (this.f80839l + length > sArr.length || this.f80838k + ((length2 * 6) / 2) > this.f80829b.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k;
        int i13 = i12 / 6;
        int length3 = c11.length;
        int i14 = 0;
        while (i14 < length3) {
            sArr[i11] = (short) (c11[i14] + i13);
            i14++;
            i11++;
        }
        this.f80839l = i11;
        float[] fArr = this.f80829b;
        float f16 = this.f80851x;
        float f17 = this.f80852y;
        float[] b11 = gVar.b();
        float c12 = f13 / r5.c();
        float b12 = f14 / r5.b();
        for (int i15 = 0; i15 < length2; i15 += 2) {
            fArr[i12] = (d11[i15] * c12) + f11;
            int i16 = i15 + 1;
            fArr[i12 + 1] = (d11[i16] * b12) + f12;
            fArr[i12 + 2] = f16;
            fArr[i12 + 3] = f17;
            int i17 = i12 + 5;
            fArr[i12 + 4] = b11[i15];
            i12 += 6;
            fArr[i17] = b11[i16];
        }
        this.f80838k = i12;
    }

    @Override // w1.a
    public int H0() {
        return this.f80845r;
    }

    public com.badlogic.gdx.graphics.b I() {
        return this.f80850w;
    }

    @Override // w1.a
    public int J() {
        return this.f80847t;
    }

    public void J0(boolean z11) {
        if (this.f80848u == z11) {
            return;
        }
        if (this.f80843p) {
            flush();
        }
        this.f80848u = z11;
        if (this.f80843p) {
            Q0();
        }
    }

    @Override // w1.a
    public void K(Texture texture, float f11, float f12, int i11, int i12, int i13, int i14) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i15 = this.f80839l;
        int i16 = this.f80838k;
        int i17 = i16 / 6;
        short s11 = (short) i17;
        sArr[i15] = s11;
        sArr[i15 + 1] = (short) (i17 + 1);
        short s12 = (short) (i17 + 2);
        sArr[i15 + 2] = s12;
        sArr[i15 + 3] = s12;
        sArr[i15 + 4] = (short) (i17 + 3);
        sArr[i15 + 5] = s11;
        this.f80839l = i15 + 6;
        float f13 = this.f80841n;
        float f14 = i11 * f13;
        float f15 = this.f80842o;
        float f16 = (i12 + i14) * f15;
        float f17 = (i11 + i13) * f13;
        float f18 = i12 * f15;
        float f19 = i13 + f11;
        float f21 = i14 + f12;
        float f22 = this.f80851x;
        float f23 = this.f80852y;
        fArr[i16] = f11;
        fArr[i16 + 1] = f12;
        fArr[i16 + 2] = f22;
        fArr[i16 + 3] = f23;
        fArr[i16 + 4] = f14;
        fArr[i16 + 5] = f16;
        fArr[i16 + 6] = f11;
        fArr[i16 + 7] = f21;
        fArr[i16 + 8] = f22;
        fArr[i16 + 9] = f23;
        fArr[i16 + 10] = f14;
        fArr[i16 + 11] = f18;
        fArr[i16 + 12] = f19;
        fArr[i16 + 13] = f21;
        fArr[i16 + 14] = f22;
        fArr[i16 + 15] = f23;
        fArr[i16 + 16] = f17;
        fArr[i16 + 17] = f18;
        fArr[i16 + 18] = f19;
        fArr[i16 + 19] = f12;
        fArr[i16 + 20] = f22;
        fArr[i16 + 21] = f23;
        fArr[i16 + 22] = f17;
        fArr[i16 + 23] = f16;
        this.f80838k = i16 + 24;
    }

    @Override // w1.a
    public void K0(@d0 w wVar) {
        if (wVar == null) {
            wVar = this.f80835h;
        }
        if (this.f80837j == wVar) {
            return;
        }
        if (this.f80843p) {
            flush();
        }
        this.f80837j = wVar;
        if (this.f80843p) {
            wVar.S();
            Q0();
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
        float g11;
        float i11;
        float h11;
        float i12;
        float h12;
        float j11;
        float g12;
        float j12;
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        Texture f28 = oVar.f();
        if (f28 != this.f80840m) {
            V0(f28);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i13 = this.f80839l;
        int i14 = this.f80838k / 6;
        short s11 = (short) i14;
        sArr[i13] = s11;
        sArr[i13 + 1] = (short) (i14 + 1);
        short s12 = (short) (i14 + 2);
        sArr[i13 + 2] = s12;
        sArr[i13 + 3] = s12;
        sArr[i13 + 4] = (short) (i14 + 3);
        sArr[i13 + 5] = s11;
        this.f80839l = i13 + 6;
        float f29 = f11 + f13;
        float f31 = f12 + f14;
        float f32 = -f13;
        float f33 = -f14;
        float f34 = f15 - f13;
        float f35 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f32 *= f17;
            f33 *= f18;
            f34 *= f17;
            f35 *= f18;
        }
        if (f19 != 0.0f) {
            float e11 = g.e(f19);
            float g13 = g.g(f19);
            float f36 = e11 * f32;
            f22 = f36 - (g13 * f33);
            float f37 = f32 * g13;
            float f38 = (f33 * e11) + f37;
            float f39 = g13 * f35;
            f21 = f36 - f39;
            float f41 = f35 * e11;
            f25 = f37 + f41;
            float f42 = (e11 * f34) - f39;
            float f43 = f41 + (g13 * f34);
            f24 = f43 - (f25 - f38);
            f27 = (f42 - f21) + f22;
            f34 = f42;
            f23 = f38;
            f26 = f43;
        } else {
            f21 = f32;
            f22 = f21;
            f23 = f33;
            f24 = f23;
            f25 = f35;
            f26 = f25;
            f27 = f34;
        }
        float f44 = f22 + f29;
        float f45 = f23 + f31;
        float f46 = f21 + f29;
        float f47 = f25 + f31;
        float f48 = f34 + f29;
        float f49 = f26 + f31;
        float f51 = f27 + f29;
        float f52 = f24 + f31;
        if (z11) {
            g11 = oVar.h();
            i11 = oVar.j();
            h11 = oVar.g();
            i12 = oVar.j();
            h12 = oVar.g();
            j11 = oVar.i();
            g12 = oVar.h();
            j12 = oVar.i();
        } else {
            g11 = oVar.g();
            i11 = oVar.i();
            h11 = oVar.h();
            i12 = oVar.i();
            h12 = oVar.h();
            j11 = oVar.j();
            g12 = oVar.g();
            j12 = oVar.j();
        }
        float f53 = this.f80851x;
        float f54 = this.f80852y;
        int i15 = this.f80838k;
        fArr[i15] = f44;
        fArr[i15 + 1] = f45;
        fArr[i15 + 2] = f53;
        fArr[i15 + 3] = f54;
        fArr[i15 + 4] = g11;
        fArr[i15 + 5] = i11;
        fArr[i15 + 6] = f46;
        fArr[i15 + 7] = f47;
        fArr[i15 + 8] = f53;
        fArr[i15 + 9] = f54;
        fArr[i15 + 10] = h11;
        fArr[i15 + 11] = i12;
        fArr[i15 + 12] = f48;
        fArr[i15 + 13] = f49;
        fArr[i15 + 14] = f53;
        fArr[i15 + 15] = f54;
        fArr[i15 + 16] = h12;
        fArr[i15 + 17] = j11;
        fArr[i15 + 18] = f51;
        fArr[i15 + 19] = f52;
        fArr[i15 + 20] = f53;
        fArr[i15 + 21] = f54;
        fArr[i15 + 22] = g12;
        fArr[i15 + 23] = j12;
        this.f80838k = i15 + 24;
    }

    @Override // w1.f
    public void L0(Texture texture, float[] fArr, int i11, int i12, short[] sArr, int i13, int i14) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr2 = this.f80830c;
        float[] fArr2 = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + i14 > sArr2.length || this.f80838k + ((i12 / 5) * 6) > fArr2.length) {
            flush();
        }
        int i15 = this.f80839l;
        int i16 = this.f80838k / 6;
        int i17 = i14 + i13;
        while (i13 < i17) {
            sArr2[i15] = (short) (sArr[i13] + i16);
            i13++;
            i15++;
        }
        this.f80839l = i15;
        int i18 = this.f80838k;
        int i19 = i12 + i11;
        while (i11 < i19) {
            fArr2[i18] = fArr[i11];
            fArr2[i18 + 1] = fArr[i11 + 1];
            fArr2[i18 + 2] = fArr[i11 + 2];
            fArr2[i18 + 3] = 0.0f;
            int i21 = i18 + 5;
            fArr2[i18 + 4] = fArr[i11 + 3];
            i18 += 6;
            fArr2[i21] = fArr[i11 + 4];
            i11 += 5;
        }
        this.f80838k = i18;
    }

    @Override // w1.a
    public float N0() {
        return this.f80851x;
    }

    @Override // w1.a
    public void O0(o oVar, float f11, float f12, Affine2 affine2) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        Texture f13 = oVar.f();
        if (f13 != this.f80840m) {
            V0(f13);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k / 6;
        short s11 = (short) i12;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i12 + 1);
        short s12 = (short) (i12 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i12 + 3);
        sArr[i11 + 5] = s11;
        this.f80839l = i11 + 6;
        float f14 = affine2.m02;
        float f15 = affine2.m12;
        float f16 = affine2.m01;
        float f17 = (f16 * f12) + f14;
        float f18 = affine2.m11;
        float f19 = (f18 * f12) + f15;
        float f21 = affine2.f12517m00;
        float f22 = (f21 * f11) + (f16 * f12) + f14;
        float f23 = affine2.f12518m10;
        float f24 = (f23 * f11) + (f18 * f12) + f15;
        float f25 = (f23 * f11) + f15;
        float g11 = oVar.g();
        float j11 = oVar.j();
        float h11 = oVar.h();
        float i13 = oVar.i();
        float f26 = this.f80851x;
        float f27 = this.f80852y;
        int i14 = this.f80838k;
        fArr[i14] = f14;
        fArr[i14 + 1] = f15;
        fArr[i14 + 2] = f26;
        fArr[i14 + 3] = f27;
        fArr[i14 + 4] = g11;
        fArr[i14 + 5] = j11;
        fArr[i14 + 6] = f17;
        fArr[i14 + 7] = f19;
        fArr[i14 + 8] = f26;
        fArr[i14 + 9] = f27;
        fArr[i14 + 10] = g11;
        fArr[i14 + 11] = i13;
        fArr[i14 + 12] = f22;
        fArr[i14 + 13] = f24;
        fArr[i14 + 14] = f26;
        fArr[i14 + 15] = f27;
        fArr[i14 + 16] = h11;
        fArr[i14 + 17] = i13;
        fArr[i14 + 18] = (f21 * f11) + f14;
        fArr[i14 + 19] = f25;
        fArr[i14 + 20] = f26;
        fArr[i14 + 21] = f27;
        fArr[i14 + 22] = h11;
        fArr[i14 + 23] = j11;
        this.f80838k = i14 + 24;
    }

    public void Q0() {
        this.f80833f.set(this.f80832e).mul(this.f80831d);
        this.f80837j.W1("u_pma", this.f80848u ? 1.0f : 0.0f);
        this.f80837j.I1("u_projTrans", this.f80833f);
        this.f80837j.i2("u_texture", 0);
    }

    public w R() {
        return this.f80835h;
    }

    @Override // w1.a
    public void R0(Matrix4 matrix4) {
        if (this.f80843p) {
            flush();
        }
        this.f80831d.set(matrix4);
        if (this.f80843p) {
            Q0();
        }
    }

    @Override // w1.f
    public void T(w1.g gVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        short[] c11 = gVar.c();
        int length = c11.length;
        float[] d11 = gVar.d();
        int length2 = d11.length;
        Texture f21 = gVar.a().f();
        if (f21 != this.f80840m) {
            V0(f21);
        } else if (this.f80839l + length > sArr.length || this.f80838k + ((length2 * 6) / 2) > this.f80829b.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k;
        int i13 = i12 / 6;
        int i14 = 0;
        while (i14 < length) {
            sArr[i11] = (short) (c11[i14] + i13);
            i14++;
            i11++;
        }
        this.f80839l = i11;
        float[] fArr = this.f80829b;
        float f22 = this.f80851x;
        float f23 = this.f80852y;
        float[] b11 = gVar.b();
        float f24 = f11 + f13;
        float f25 = f12 + f14;
        float c12 = f15 / r6.c();
        float b12 = f16 / r6.b();
        float e11 = g.e(f19);
        float g11 = g.g(f19);
        for (int i15 = 0; i15 < length2; i15 += 2) {
            float f26 = ((d11[i15] * c12) - f13) * f17;
            int i16 = i15 + 1;
            float f27 = ((d11[i16] * b12) - f14) * f18;
            fArr[i12] = ((e11 * f26) - (g11 * f27)) + f24;
            fArr[i12 + 1] = (f26 * g11) + (f27 * e11) + f25;
            fArr[i12 + 2] = f22;
            fArr[i12 + 3] = f23;
            int i17 = i12 + 5;
            fArr[i12 + 4] = b11[i15];
            i12 += 6;
            fArr[i17] = b11[i16];
        }
        this.f80838k = i12;
    }

    @Override // w1.a
    public void T0(Texture texture, float f11, float f12, float f13, float f14) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k;
        int i13 = i12 / 6;
        short s11 = (short) i13;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i13 + 1);
        short s12 = (short) (i13 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i13 + 3);
        sArr[i11 + 5] = s11;
        this.f80839l = i11 + 6;
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        float f17 = this.f80851x;
        float f18 = this.f80852y;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f17;
        fArr[i12 + 3] = f18;
        fArr[i12 + 4] = 0.0f;
        fArr[i12 + 5] = 1.0f;
        fArr[i12 + 6] = f11;
        fArr[i12 + 7] = f16;
        fArr[i12 + 8] = f17;
        fArr[i12 + 9] = f18;
        fArr[i12 + 10] = 0.0f;
        fArr[i12 + 11] = 0.0f;
        fArr[i12 + 12] = f15;
        fArr[i12 + 13] = f16;
        fArr[i12 + 14] = f17;
        fArr[i12 + 15] = f18;
        fArr[i12 + 16] = 1.0f;
        fArr[i12 + 17] = 0.0f;
        fArr[i12 + 18] = f15;
        fArr[i12 + 19] = f12;
        fArr[i12 + 20] = f17;
        fArr[i12 + 21] = f18;
        fArr[i12 + 22] = 1.0f;
        fArr[i12 + 23] = 1.0f;
        this.f80838k = i12 + 24;
    }

    public float X() {
        return this.f80852y;
    }

    @Override // w1.a
    public int X0() {
        return this.f80846s;
    }

    @Override // w1.f
    public void Y(w1.g gVar, float f11, float f12) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        short[] c11 = gVar.c();
        int length = c11.length;
        float[] d11 = gVar.d();
        int length2 = d11.length;
        Texture f13 = gVar.a().f();
        if (f13 != this.f80840m) {
            V0(f13);
        } else if (this.f80839l + length > sArr.length || this.f80838k + ((length2 * 6) / 2) > this.f80829b.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k;
        int i13 = i12 / 6;
        int i14 = 0;
        while (i14 < length) {
            sArr[i11] = (short) (c11[i14] + i13);
            i14++;
            i11++;
        }
        this.f80839l = i11;
        float[] fArr = this.f80829b;
        float f14 = this.f80851x;
        float f15 = this.f80852y;
        float[] b11 = gVar.b();
        for (int i15 = 0; i15 < length2; i15 += 2) {
            fArr[i12] = d11[i15] + f11;
            int i16 = i15 + 1;
            fArr[i12 + 1] = d11[i16] + f12;
            fArr[i12 + 2] = f14;
            fArr[i12 + 3] = f15;
            int i17 = i12 + 5;
            fArr[i12 + 4] = b11[i15];
            i12 += 6;
            fArr[i17] = b11[i16];
        }
        this.f80838k = i12;
    }

    public boolean Z() {
        return this.f80848u;
    }

    @Override // w1.a
    public void Z0(Matrix4 matrix4) {
        if (this.f80843p) {
            flush();
        }
        this.f80832e.set(matrix4);
        if (this.f80843p) {
            Q0();
        }
    }

    public void b(Texture texture) {
        texture.S();
    }

    @Override // w1.a
    public int b0() {
        return this.f80844q;
    }

    @Override // w1.a
    public void c() {
        if (this.f80843p) {
            throw new IllegalStateException("end must be called before begin.");
        }
        q1.g.f81384g.glDepthMask(false);
        this.f80837j.S();
        Q0();
        this.f80843p = true;
    }

    @Override // w1.a
    public void c0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k;
        int i13 = i12 / 6;
        short s11 = (short) i13;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i13 + 1);
        short s12 = (short) (i13 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i13 + 3);
        sArr[i11 + 5] = s11;
        this.f80839l = i11 + 6;
        float f19 = f13 + f11;
        float f21 = f14 + f12;
        float f22 = this.f80851x;
        float f23 = this.f80852y;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f22;
        fArr[i12 + 3] = f23;
        fArr[i12 + 4] = f15;
        fArr[i12 + 5] = f16;
        fArr[i12 + 6] = f11;
        fArr[i12 + 7] = f21;
        fArr[i12 + 8] = f22;
        fArr[i12 + 9] = f23;
        fArr[i12 + 10] = f15;
        fArr[i12 + 11] = f18;
        fArr[i12 + 12] = f19;
        fArr[i12 + 13] = f21;
        fArr[i12 + 14] = f22;
        fArr[i12 + 15] = f23;
        fArr[i12 + 16] = f17;
        fArr[i12 + 17] = f18;
        fArr[i12 + 18] = f19;
        fArr[i12 + 19] = f12;
        fArr[i12 + 20] = f22;
        fArr[i12 + 21] = f23;
        fArr[i12 + 22] = f17;
        fArr[i12 + 23] = f16;
        this.f80838k = i12 + 24;
    }

    @Override // a3.q
    public void dispose() {
        this.f80828a.dispose();
        if (this.f80836i) {
            this.f80835h.dispose();
        }
    }

    @Override // w1.a
    public com.badlogic.gdx.graphics.b e() {
        return this.f80849v;
    }

    @Override // w1.a
    public boolean e0() {
        return this.f80843p;
    }

    @Override // w1.a
    public void end() {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before end.");
        }
        if (this.f80838k > 0) {
            flush();
        }
        q1.g.f81384g.glDepthMask(true);
        if (!this.f80834g) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
        this.f80840m = null;
        this.f80843p = false;
    }

    @Override // w1.a
    public void f0(Texture texture, float f11, float f12) {
        T0(texture, f11, f12, texture.C0(), texture.I());
    }

    @Override // w1.a
    public void flush() {
        if (this.f80838k == 0) {
            return;
        }
        this.f80853z++;
        b(this.f80840m);
        Mesh mesh = this.f80828a;
        mesh.O1(this.f80829b, 0, this.f80838k);
        mesh.I1(this.f80830c, 0, this.f80839l);
        if (this.f80834g) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        } else {
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            int i11 = this.f80844q;
            if (i11 != -1) {
                q1.g.f81384g.a5(i11, this.f80845r, this.f80846s, this.f80847t);
            }
        }
        mesh.D1(this.f80837j, 4, 0, this.f80839l);
        this.f80838k = 0;
        this.f80839l = 0;
    }

    @Override // w1.a
    public void g0(int i11, int i12) {
        k0(i11, i12, i11, i12);
    }

    @Override // w1.a
    public w getShader() {
        return this.f80837j;
    }

    @Override // w1.a
    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f80849v.H(bVar);
        this.f80851x = bVar.L();
    }

    public void i0(float f11, float f12, float f13, float f14) {
        this.f80850w.F(f11, f12, f13, f14);
        this.f80852y = this.f80850w.L();
    }

    @Override // w1.a
    public void k(float f11, float f12, float f13, float f14) {
        this.f80849v.F(f11, f12, f13, f14);
        this.f80851x = this.f80849v.L();
    }

    @Override // w1.a
    public void k0(int i11, int i12, int i13, int i14) {
        if (this.f80844q == i11 && this.f80845r == i12 && this.f80846s == i13 && this.f80847t == i14) {
            return;
        }
        flush();
        this.f80844q = i11;
        this.f80845r = i12;
        this.f80846s = i13;
        this.f80847t = i14;
    }

    public void n0(com.badlogic.gdx.graphics.b bVar) {
        this.f80850w.H(bVar);
        this.f80852y = bVar.L();
    }

    @Override // w1.a
    public void q(o oVar, float f11, float f12) {
        v0(oVar, f11, f12, oVar.c(), oVar.b());
    }

    @Override // w1.a
    public void q0(Texture texture, float f11, float f12, float f13, float f14, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i15 = this.f80839l;
        int i16 = this.f80838k;
        int i17 = i16 / 6;
        short s11 = (short) i17;
        sArr[i15] = s11;
        sArr[i15 + 1] = (short) (i17 + 1);
        short s12 = (short) (i17 + 2);
        sArr[i15 + 2] = s12;
        sArr[i15 + 3] = s12;
        sArr[i15 + 4] = (short) (i17 + 3);
        sArr[i15 + 5] = s11;
        this.f80839l = i15 + 6;
        float f15 = this.f80841n;
        float f16 = i11 * f15;
        float f17 = this.f80842o;
        float f18 = (i12 + i14) * f17;
        float f19 = (i11 + i13) * f15;
        float f21 = i12 * f17;
        float f22 = f11 + f13;
        float f23 = f12 + f14;
        if (z11) {
            f19 = f16;
            f16 = f19;
        }
        if (z12) {
            f18 = f21;
            f21 = f18;
        }
        float f24 = this.f80851x;
        float f25 = this.f80852y;
        fArr[i16] = f11;
        fArr[i16 + 1] = f12;
        fArr[i16 + 2] = f24;
        fArr[i16 + 3] = f25;
        fArr[i16 + 4] = f16;
        fArr[i16 + 5] = f18;
        fArr[i16 + 6] = f11;
        fArr[i16 + 7] = f23;
        fArr[i16 + 8] = f24;
        fArr[i16 + 9] = f25;
        fArr[i16 + 10] = f16;
        fArr[i16 + 11] = f21;
        fArr[i16 + 12] = f22;
        fArr[i16 + 13] = f23;
        fArr[i16 + 14] = f24;
        fArr[i16 + 15] = f25;
        fArr[i16 + 16] = f19;
        fArr[i16 + 17] = f21;
        fArr[i16 + 18] = f22;
        fArr[i16 + 19] = f12;
        fArr[i16 + 20] = f24;
        fArr[i16 + 21] = f25;
        fArr[i16 + 22] = f19;
        fArr[i16 + 23] = f18;
        this.f80838k = i16 + 24;
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
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        Texture f28 = oVar.f();
        if (f28 != this.f80840m) {
            V0(f28);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k / 6;
        short s11 = (short) i12;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i12 + 1);
        short s12 = (short) (i12 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i12 + 3);
        sArr[i11 + 5] = s11;
        this.f80839l = i11 + 6;
        float f29 = f11 + f13;
        float f31 = f12 + f14;
        float f32 = -f13;
        float f33 = -f14;
        float f34 = f15 - f13;
        float f35 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f32 *= f17;
            f33 *= f18;
            f34 *= f17;
            f35 *= f18;
        }
        if (f19 != 0.0f) {
            float e11 = g.e(f19);
            float g11 = g.g(f19);
            float f36 = e11 * f32;
            f22 = f36 - (g11 * f33);
            float f37 = f32 * g11;
            float f38 = (f33 * e11) + f37;
            float f39 = g11 * f35;
            f21 = f36 - f39;
            float f41 = f35 * e11;
            f25 = f37 + f41;
            float f42 = (e11 * f34) - f39;
            float f43 = f41 + (g11 * f34);
            f24 = f43 - (f25 - f38);
            f27 = (f42 - f21) + f22;
            f34 = f42;
            f23 = f38;
            f26 = f43;
        } else {
            f21 = f32;
            f22 = f21;
            f23 = f33;
            f24 = f23;
            f25 = f35;
            f26 = f25;
            f27 = f34;
        }
        float f44 = f22 + f29;
        float f45 = f23 + f31;
        float f46 = f21 + f29;
        float f47 = f25 + f31;
        float f48 = f34 + f29;
        float f49 = f26 + f31;
        float f51 = f27 + f29;
        float f52 = f24 + f31;
        float g12 = oVar.g();
        float j11 = oVar.j();
        float h11 = oVar.h();
        float i13 = oVar.i();
        float f53 = this.f80851x;
        float f54 = this.f80852y;
        int i14 = this.f80838k;
        fArr[i14] = f44;
        fArr[i14 + 1] = f45;
        fArr[i14 + 2] = f53;
        fArr[i14 + 3] = f54;
        fArr[i14 + 4] = g12;
        fArr[i14 + 5] = j11;
        fArr[i14 + 6] = f46;
        fArr[i14 + 7] = f47;
        fArr[i14 + 8] = f53;
        fArr[i14 + 9] = f54;
        fArr[i14 + 10] = g12;
        fArr[i14 + 11] = i13;
        fArr[i14 + 12] = f48;
        fArr[i14 + 13] = f49;
        fArr[i14 + 14] = f53;
        fArr[i14 + 15] = f54;
        fArr[i14 + 16] = h11;
        fArr[i14 + 17] = i13;
        fArr[i14 + 18] = f51;
        fArr[i14 + 19] = f52;
        fArr[i14 + 20] = f53;
        fArr[i14 + 21] = f54;
        fArr[i14 + 22] = h11;
        fArr[i14 + 23] = j11;
        this.f80838k = i14 + 24;
    }

    @Override // w1.a
    public void t0(Texture texture, float[] fArr, int i11, int i12) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr2 = this.f80829b;
        int i13 = (i12 / 20) * 6;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + i13 > sArr.length || this.f80838k + ((i12 / 5) * 6) > fArr2.length) {
            flush();
        }
        int i14 = this.f80838k;
        int i15 = this.f80839l;
        short s11 = (short) (i14 / 6);
        int i16 = i13 + i15;
        while (i15 < i16) {
            sArr[i15] = s11;
            sArr[i15 + 1] = (short) (s11 + 1);
            short s12 = (short) (s11 + 2);
            sArr[i15 + 2] = s12;
            sArr[i15 + 3] = s12;
            sArr[i15 + 4] = (short) (s11 + 3);
            sArr[i15 + 5] = s11;
            i15 += 6;
            s11 = (short) (s11 + 4);
        }
        this.f80839l = i15;
        int i17 = this.f80838k;
        int i18 = i12 + i11;
        while (i11 < i18) {
            fArr2[i17] = fArr[i11];
            fArr2[i17 + 1] = fArr[i11 + 1];
            fArr2[i17 + 2] = fArr[i11 + 2];
            fArr2[i17 + 3] = 0.0f;
            int i19 = i17 + 5;
            fArr2[i17 + 4] = fArr[i11 + 3];
            i17 += 6;
            fArr2[i19] = fArr[i11 + 4];
            i11 += 5;
        }
        this.f80838k = i17;
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
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i15 = this.f80839l;
        int i16 = this.f80838k / 6;
        short s11 = (short) i16;
        sArr[i15] = s11;
        sArr[i15 + 1] = (short) (i16 + 1);
        short s12 = (short) (i16 + 2);
        sArr[i15 + 2] = s12;
        sArr[i15 + 3] = s12;
        sArr[i15 + 4] = (short) (i16 + 3);
        sArr[i15 + 5] = s11;
        this.f80839l = i15 + 6;
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
            float e11 = g.e(f19);
            float g11 = g.g(f19);
            float f35 = e11 * f31;
            f22 = f35 - (g11 * f32);
            float f36 = f31 * g11;
            float f37 = (f32 * e11) + f36;
            float f38 = g11 * f34;
            f21 = f35 - f38;
            float f39 = f34 * e11;
            f25 = f36 + f39;
            float f41 = (e11 * f33) - f38;
            float f42 = f39 + (g11 * f33);
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
        float f52 = this.f80841n;
        float f53 = i11 * f52;
        float f54 = this.f80842o;
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
        float f58 = this.f80851x;
        float f59 = this.f80852y;
        int i17 = this.f80838k;
        fArr[i17] = f43;
        fArr[i17 + 1] = f44;
        fArr[i17 + 2] = f58;
        fArr[i17 + 3] = f59;
        fArr[i17 + 4] = f53;
        fArr[i17 + 5] = f55;
        fArr[i17 + 6] = f45;
        fArr[i17 + 7] = f46;
        fArr[i17 + 8] = f58;
        fArr[i17 + 9] = f59;
        fArr[i17 + 10] = f53;
        fArr[i17 + 11] = f57;
        fArr[i17 + 12] = f47;
        fArr[i17 + 13] = f48;
        fArr[i17 + 14] = f58;
        fArr[i17 + 15] = f59;
        fArr[i17 + 16] = f56;
        fArr[i17 + 17] = f57;
        fArr[i17 + 18] = f49;
        fArr[i17 + 19] = f51;
        fArr[i17 + 20] = f58;
        fArr[i17 + 21] = f59;
        fArr[i17 + 22] = f56;
        fArr[i17 + 23] = f55;
        this.f80838k = i17 + 24;
    }

    @Override // w1.a
    public void v() {
        flush();
        this.f80834g = true;
    }

    @Override // w1.a
    public void v0(o oVar, float f11, float f12, float f13, float f14) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr = this.f80829b;
        Texture f15 = oVar.f();
        if (f15 != this.f80840m) {
            V0(f15);
        } else if (this.f80839l + 6 > sArr.length || this.f80838k + 24 > fArr.length) {
            flush();
        }
        int i11 = this.f80839l;
        int i12 = this.f80838k / 6;
        short s11 = (short) i12;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i12 + 1);
        short s12 = (short) (i12 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i12 + 3);
        sArr[i11 + 5] = s11;
        this.f80839l = i11 + 6;
        float f16 = f13 + f11;
        float f17 = f14 + f12;
        float g11 = oVar.g();
        float j11 = oVar.j();
        float h11 = oVar.h();
        float i13 = oVar.i();
        float f18 = this.f80851x;
        float f19 = this.f80852y;
        int i14 = this.f80838k;
        fArr[i14] = f11;
        fArr[i14 + 1] = f12;
        fArr[i14 + 2] = f18;
        fArr[i14 + 3] = f19;
        fArr[i14 + 4] = g11;
        fArr[i14 + 5] = j11;
        fArr[i14 + 6] = f11;
        fArr[i14 + 7] = f17;
        fArr[i14 + 8] = f18;
        fArr[i14 + 9] = f19;
        fArr[i14 + 10] = g11;
        fArr[i14 + 11] = i13;
        fArr[i14 + 12] = f16;
        fArr[i14 + 13] = f17;
        fArr[i14 + 14] = f18;
        fArr[i14 + 15] = f19;
        fArr[i14 + 16] = h11;
        fArr[i14 + 17] = i13;
        fArr[i14 + 18] = f16;
        fArr[i14 + 19] = f12;
        fArr[i14 + 20] = f18;
        fArr[i14 + 21] = f19;
        fArr[i14 + 22] = h11;
        fArr[i14 + 23] = j11;
        this.f80838k = i14 + 24;
    }

    public void w0(w wVar) {
        boolean z11 = false;
        boolean z12 = this.f80837j == this.f80835h;
        if (z12 && this.f80843p) {
            z11 = true;
        }
        if (z11) {
            flush();
        }
        if (this.f80836i) {
            this.f80835h.dispose();
        }
        this.f80835h = wVar;
        if (z12) {
            this.f80837j = wVar;
        }
        if (z11) {
            wVar.S();
            Q0();
        }
    }

    @Override // w1.a
    public Matrix4 x0() {
        return this.f80832e;
    }

    public void z(Texture texture, float[] fArr, int i11, int i12) {
        if (!this.f80843p) {
            throw new IllegalStateException("begin must be called before draw.");
        }
        short[] sArr = this.f80830c;
        float[] fArr2 = this.f80829b;
        int i13 = (i12 / 24) * 6;
        if (texture != this.f80840m) {
            V0(texture);
        } else if (this.f80839l + i13 > sArr.length || this.f80838k + i12 > fArr2.length) {
            flush();
        }
        int i14 = this.f80838k;
        int i15 = this.f80839l;
        short s11 = (short) (i14 / 6);
        int i16 = i13 + i15;
        while (i15 < i16) {
            sArr[i15] = s11;
            sArr[i15 + 1] = (short) (s11 + 1);
            short s12 = (short) (s11 + 2);
            sArr[i15 + 2] = s12;
            sArr[i15 + 3] = s12;
            sArr[i15 + 4] = (short) (s11 + 3);
            sArr[i15 + 5] = s11;
            i15 += 6;
            s11 = (short) (s11 + 4);
        }
        this.f80839l = i15;
        g.a(fArr, i11, fArr2, i14, i12);
        this.f80838k += i12;
    }

    public i(int i11) {
        this(i11, i11 << 1, null);
    }

    public i(int i11, int i12) {
        this(i12, i12, null);
    }

    public i(int i11, int i12, @d0 w wVar) {
        this.f80831d = new Matrix4();
        Matrix4 matrix4 = new Matrix4();
        this.f80832e = matrix4;
        this.f80833f = new Matrix4();
        this.f80841n = 0.0f;
        this.f80842o = 0.0f;
        this.f80844q = com.badlogic.gdx.graphics.f.f11653r;
        this.f80845r = com.badlogic.gdx.graphics.f.f11659s;
        this.f80846s = com.badlogic.gdx.graphics.f.f11653r;
        this.f80847t = com.badlogic.gdx.graphics.f.f11659s;
        this.f80849v = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f80850w = new com.badlogic.gdx.graphics.b(0.0f, 0.0f, 0.0f, 1.0f);
        this.f80851x = com.badlogic.gdx.graphics.b.f11522e.L();
        this.f80852y = com.badlogic.gdx.graphics.b.f11526i.L();
        this.f80853z = 0;
        if (i11 <= 32767) {
            int i13 = i12 * 3;
            this.f80828a = new Mesh(q1.g.f81386i != null ? Mesh.VertexDataType.VertexBufferObjectWithVAO : Mesh.VertexDataType.VertexArray, false, i11, i13, new r(1, 2, w.f74225u), new r(4, 4, "a_light"), new r(4, 4, "a_dark"), new r(16, 2, "a_texCoord0"));
            this.f80829b = new float[i11 * 6];
            this.f80830c = new short[i13];
            boolean z11 = wVar == null;
            this.f80836i = z11;
            w o11 = z11 ? o() : wVar;
            this.f80835h = o11;
            this.f80837j = o11;
            matrix4.setToOrtho2D(0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
            return;
        }
        throw new IllegalArgumentException("Can't have more than 32767 vertices per batch: " + i12);
    }
}
