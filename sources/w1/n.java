package w1;

import a3.q;
import a3.v;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.FloatBuffer;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n implements q {

    /* renamed from: p, reason: collision with root package name */
    public static final float[] f94589p = new float[30];

    /* renamed from: a, reason: collision with root package name */
    public final Mesh f94590a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f94591b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix4 f94592c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix4 f94593d;

    /* renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<a> f94594e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix4 f94595f;

    /* renamed from: g, reason: collision with root package name */
    public final w f94596g;

    /* renamed from: h, reason: collision with root package name */
    public a f94597h;

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<Texture> f94598i;

    /* renamed from: j, reason: collision with root package name */
    public final v f94599j;

    /* renamed from: k, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94600k;

    /* renamed from: l, reason: collision with root package name */
    public float f94601l;

    /* renamed from: m, reason: collision with root package name */
    public w f94602m;

    /* renamed from: n, reason: collision with root package name */
    public int f94603n;

    /* renamed from: o, reason: collision with root package name */
    public int f94604o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f94605a;

        /* renamed from: b, reason: collision with root package name */
        public final int f94606b;

        /* renamed from: c, reason: collision with root package name */
        public int f94607c;

        /* renamed from: d, reason: collision with root package name */
        public int f94608d;

        /* renamed from: e, reason: collision with root package name */
        public Texture[] f94609e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f94610f;

        public a(int i11, int i12) {
            this.f94605a = i11;
            this.f94606b = i12;
        }
    }

    public n() {
        this(1000, false);
    }

    public static w Q0() {
        w wVar = new w("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projectionViewMatrix;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projectionViewMatrix * a_position;\n}\n", "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}");
        if (wVar.q1()) {
            return wVar;
        }
        throw new IllegalArgumentException("Error compiling shader: " + wVar.f1());
    }

    public Matrix4 B0() {
        return this.f94592c;
    }

    public void C0(int i11) {
        if (this.f94591b) {
            throw new IllegalStateException("end must be called before beginCache");
        }
        if (this.f94597h != null) {
            throw new IllegalStateException("endCache must be called before begin.");
        }
        FloatBuffer y12 = this.f94590a.y1(true);
        com.badlogic.gdx.utils.a<a> aVar = this.f94594e;
        if (i11 == aVar.f13179b - 1) {
            y12.limit(aVar.A(i11).f94606b);
            w0();
        } else {
            a aVar2 = aVar.get(i11);
            this.f94597h = aVar2;
            y12.position(aVar2.f94606b);
        }
    }

    public void D(Texture texture, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = i11 + f11;
        float f19 = i12 + f12;
        float[] fArr = f94589p;
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f17;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f11;
        fArr[6] = f19;
        fArr[7] = f17;
        fArr[8] = f13;
        fArr[9] = f16;
        fArr[10] = f18;
        fArr[11] = f19;
        fArr[12] = f17;
        fArr[13] = f15;
        fArr[14] = f16;
        if (this.f94590a.D0() > 0) {
            fArr[15] = f18;
            fArr[16] = f12;
            fArr[17] = f17;
            fArr[18] = f15;
            fArr[19] = f14;
            R(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f18;
        fArr[16] = f19;
        fArr[17] = f17;
        fArr[18] = f15;
        fArr[19] = f16;
        fArr[20] = f18;
        fArr[21] = f12;
        fArr[22] = f17;
        fArr[23] = f15;
        fArr[24] = f14;
        fArr[25] = f11;
        fArr[26] = f12;
        fArr[27] = f17;
        fArr[28] = f13;
        fArr[29] = f14;
        R(texture, fArr, 0, 30);
    }

    public void G(float f11) {
        com.badlogic.gdx.graphics.b.a(this.f94600k, f11);
        this.f94601l = f11;
    }

    public void I(Texture texture, float f11, float f12, int i11, int i12, int i13, int i14) {
        float C0 = 1.0f / texture.C0();
        float I = 1.0f / texture.I();
        float f13 = i11 * C0;
        float f14 = (i12 + i14) * I;
        float f15 = (i11 + i13) * C0;
        float f16 = i12 * I;
        float f17 = f11 + i13;
        float f18 = f12 + i14;
        float[] fArr = f94589p;
        fArr[0] = f11;
        fArr[1] = f12;
        float f19 = this.f94601l;
        fArr[2] = f19;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f11;
        fArr[6] = f18;
        fArr[7] = f19;
        fArr[8] = f13;
        fArr[9] = f16;
        fArr[10] = f17;
        fArr[11] = f18;
        fArr[12] = f19;
        fArr[13] = f15;
        fArr[14] = f16;
        if (this.f94590a.D0() > 0) {
            fArr[15] = f17;
            fArr[16] = f12;
            fArr[17] = this.f94601l;
            fArr[18] = f15;
            fArr[19] = f14;
            R(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f17;
        fArr[16] = f18;
        float f21 = this.f94601l;
        fArr[17] = f21;
        fArr[18] = f15;
        fArr[19] = f16;
        fArr[20] = f17;
        fArr[21] = f12;
        fArr[22] = f21;
        fArr[23] = f15;
        fArr[24] = f14;
        fArr[25] = f11;
        fArr[26] = f12;
        fArr[27] = f21;
        fArr[28] = f13;
        fArr[29] = f14;
        R(texture, fArr, 0, 30);
    }

    public void J0() {
        this.f94594e.clear();
        this.f94590a.y1(true).clear().flip();
    }

    public void K0(w wVar) {
        this.f94602m = wVar;
    }

    public float N0() {
        return this.f94601l;
    }

    public void R(Texture texture, float[] fArr, int i11, int i12) {
        if (this.f94597h == null) {
            throw new IllegalStateException("beginCache must be called before add.");
        }
        int i13 = (i12 / ((this.f94590a.D0() > 0 ? 4 : 6) * 5)) * 6;
        com.badlogic.gdx.utils.a<Texture> aVar = this.f94598i;
        int i14 = aVar.f13179b - 1;
        if (i14 < 0 || aVar.get(i14) != texture) {
            this.f94598i.a(texture);
            this.f94599j.a(i13);
        } else {
            this.f94599j.o(i14, i13);
        }
        this.f94590a.y1(true).put(fArr, i11, i12);
    }

    public void R0(Matrix4 matrix4) {
        if (this.f94591b) {
            throw new IllegalStateException("Can't set the matrix within begin/end.");
        }
        this.f94592c.set(matrix4);
    }

    public void V0(int i11) {
        if (!this.f94591b) {
            throw new IllegalStateException("SpriteCache.begin must be called before draw.");
        }
        a aVar = this.f94594e.get(i11);
        int i12 = (aVar.f94606b / ((this.f94590a.D0() > 0 ? 4 : 6) * 5)) * 6;
        Texture[] textureArr = aVar.f94609e;
        int[] iArr = aVar.f94610f;
        int i13 = aVar.f94608d;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            textureArr[i14].S();
            w wVar = this.f94602m;
            if (wVar != null) {
                this.f94590a.D1(wVar, 4, i12, i15);
            } else {
                this.f94590a.D1(this.f94596g, 4, i12, i15);
            }
            i12 += i15;
        }
        this.f94603n += i13;
        this.f94604o += i13;
    }

    public void X(l lVar) {
        if (this.f94590a.D0() > 0) {
            R(lVar.f(), lVar.O(), 0, 20);
            return;
        }
        float[] O = lVar.O();
        float[] fArr = f94589p;
        System.arraycopy(O, 0, fArr, 0, 15);
        System.arraycopy(O, 10, fArr, 15, 5);
        System.arraycopy(O, 15, fArr, 20, 5);
        System.arraycopy(O, 0, fArr, 25, 5);
        R(lVar.f(), fArr, 0, 30);
    }

    public void Z(o oVar, float f11, float f12) {
        i0(oVar, f11, f12, oVar.c(), oVar.b());
    }

    public void Z0(Matrix4 matrix4) {
        if (this.f94591b) {
            throw new IllegalStateException("Can't set the matrix within begin/end.");
        }
        this.f94593d.set(matrix4);
    }

    public void a1(int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.f94591b) {
            throw new IllegalStateException("SpriteCache.begin must be called before draw.");
        }
        a aVar = this.f94594e.get(i11);
        int i16 = ((aVar.f94606b / ((this.f94590a.D0() > 0 ? 4 : 6) * 5)) * 6) + (i12 * 6);
        int i17 = i13 * 6;
        Texture[] textureArr = aVar.f94609e;
        int[] iArr = aVar.f94610f;
        int i18 = aVar.f94608d;
        int i19 = 0;
        while (i19 < i18) {
            textureArr[i19].S();
            int i21 = iArr[i19];
            if (i21 > i17) {
                i14 = i17;
                i15 = i18;
            } else {
                int i22 = i19;
                i14 = i17 - i21;
                i17 = i21;
                i15 = i22;
            }
            w wVar = this.f94602m;
            if (wVar != null) {
                this.f94590a.D1(wVar, 4, i16, i17);
            } else {
                this.f94590a.D1(this.f94596g, 4, i16, i17);
            }
            i16 += i17;
            int i23 = i14;
            i19 = i15 + 1;
            i17 = i23;
        }
        this.f94603n += aVar.f94608d;
        this.f94604o += i18;
    }

    public void b(Texture texture, float f11, float f12) {
        float C0 = texture.C0() + f11;
        float I = f12 + texture.I();
        float[] fArr = f94589p;
        fArr[0] = f11;
        fArr[1] = f12;
        float f13 = this.f94601l;
        fArr[2] = f13;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = f11;
        fArr[6] = I;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = C0;
        fArr[11] = I;
        fArr[12] = f13;
        fArr[13] = 1.0f;
        fArr[14] = 0.0f;
        if (this.f94590a.D0() > 0) {
            fArr[15] = C0;
            fArr[16] = f12;
            fArr[17] = this.f94601l;
            fArr[18] = 1.0f;
            fArr[19] = 1.0f;
            R(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = C0;
        fArr[16] = I;
        float f14 = this.f94601l;
        fArr[17] = f14;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[20] = C0;
        fArr[21] = f12;
        fArr[22] = f14;
        fArr[23] = 1.0f;
        fArr[24] = 1.0f;
        fArr[25] = f11;
        fArr[26] = f12;
        fArr[27] = f14;
        fArr[28] = 0.0f;
        fArr[29] = 1.0f;
        R(texture, fArr, 0, 30);
    }

    public int b1() {
        a aVar = this.f94597h;
        if (aVar == null) {
            throw new IllegalStateException("beginCache must be called before endCache.");
        }
        int position = this.f94590a.y1(false).position() - aVar.f94606b;
        Texture[] textureArr = aVar.f94609e;
        if (textureArr == null) {
            aVar.f94607c = position;
            com.badlogic.gdx.utils.a<Texture> aVar2 = this.f94598i;
            aVar.f94608d = aVar2.f13179b;
            aVar.f94609e = (Texture[]) aVar2.Q(Texture.class);
            aVar.f94610f = new int[aVar.f94608d];
            int i11 = this.f94599j.f1640b;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar.f94610f[i12] = this.f94599j.m(i12);
            }
            this.f94590a.y1(true).flip();
        } else {
            if (position > aVar.f94607c) {
                throw new GdxRuntimeException("If a cache is not the last created, it cannot be redefined with more entries than when it was first created: " + position + " (" + aVar.f94607c + " max)");
            }
            int i13 = this.f94598i.f13179b;
            aVar.f94608d = i13;
            if (textureArr.length < i13) {
                aVar.f94609e = new Texture[i13];
            }
            for (int i14 = 0; i14 < i13; i14++) {
                aVar.f94609e[i14] = this.f94598i.get(i14);
            }
            int length = aVar.f94610f.length;
            int i15 = aVar.f94608d;
            if (length < i15) {
                aVar.f94610f = new int[i15];
            }
            for (int i16 = 0; i16 < i15; i16++) {
                aVar.f94610f[i16] = this.f94599j.m(i16);
            }
            FloatBuffer y12 = this.f94590a.y1(true);
            y12.position(0);
            com.badlogic.gdx.utils.a<a> aVar3 = this.f94594e;
            a aVar4 = aVar3.get(aVar3.f13179b - 1);
            y12.limit(aVar4.f94606b + aVar4.f94607c);
        }
        this.f94597h = null;
        this.f94598i.clear();
        this.f94599j.i();
        return aVar.f94605a;
    }

    public void c() {
        if (this.f94591b) {
            throw new IllegalStateException("end must be called before begin.");
        }
        if (this.f94597h != null) {
            throw new IllegalStateException("endCache must be called before begin");
        }
        this.f94603n = 0;
        this.f94595f.set(this.f94593d).mul(this.f94592c);
        q1.g.f81385h.glDepthMask(false);
        w wVar = this.f94602m;
        if (wVar != null) {
            wVar.S();
            this.f94602m.I1("u_proj", this.f94593d);
            this.f94602m.I1("u_trans", this.f94592c);
            this.f94602m.I1("u_projTrans", this.f94595f);
            this.f94602m.i2("u_texture", 0);
            this.f94590a.n(this.f94602m);
        } else {
            this.f94596g.S();
            this.f94596g.I1("u_projectionViewMatrix", this.f94595f);
            this.f94596g.i2("u_texture", 0);
            this.f94590a.n(this.f94596g);
        }
        this.f94591b = true;
    }

    public w c1() {
        return this.f94602m;
    }

    @Override // a3.q
    public void dispose() {
        this.f94590a.dispose();
        w wVar = this.f94596g;
        if (wVar != null) {
            wVar.dispose();
        }
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f94600k;
    }

    public boolean e0() {
        return this.f94591b;
    }

    public void end() {
        if (!this.f94591b) {
            throw new IllegalStateException("begin must be called before end.");
        }
        this.f94591b = false;
        q1.g.f81385h.glDepthMask(true);
        w wVar = this.f94602m;
        if (wVar != null) {
            this.f94590a.f(wVar);
        } else {
            this.f94590a.f(this.f94596g);
        }
    }

    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f94600k.H(bVar);
        this.f94601l = bVar.L();
    }

    public void i0(o oVar, float f11, float f12, float f13, float f14) {
        float f15 = f11 + f13;
        float f16 = f12 + f14;
        float f17 = oVar.f94612b;
        float f18 = oVar.f94615e;
        float f19 = oVar.f94614d;
        float f21 = oVar.f94613c;
        float[] fArr = f94589p;
        fArr[0] = f11;
        fArr[1] = f12;
        float f22 = this.f94601l;
        fArr[2] = f22;
        fArr[3] = f17;
        fArr[4] = f18;
        fArr[5] = f11;
        fArr[6] = f16;
        fArr[7] = f22;
        fArr[8] = f17;
        fArr[9] = f21;
        fArr[10] = f15;
        fArr[11] = f16;
        fArr[12] = f22;
        fArr[13] = f19;
        fArr[14] = f21;
        if (this.f94590a.D0() > 0) {
            fArr[15] = f15;
            fArr[16] = f12;
            fArr[17] = this.f94601l;
            fArr[18] = f19;
            fArr[19] = f18;
            R(oVar.f94611a, fArr, 0, 20);
            return;
        }
        fArr[15] = f15;
        fArr[16] = f16;
        float f23 = this.f94601l;
        fArr[17] = f23;
        fArr[18] = f19;
        fArr[19] = f21;
        fArr[20] = f15;
        fArr[21] = f12;
        fArr[22] = f23;
        fArr[23] = f19;
        fArr[24] = f18;
        fArr[25] = f11;
        fArr[26] = f12;
        fArr[27] = f23;
        fArr[28] = f17;
        fArr[29] = f18;
        R(oVar.f94611a, fArr, 0, 30);
    }

    public void k(float f11, float f12, float f13, float f14) {
        this.f94600k.F(f11, f12, f13, f14);
        this.f94601l = this.f94600k.L();
    }

    public void n0(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
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
        float[] fArr = f94589p;
        fArr[0] = f43;
        fArr[1] = f44;
        float f56 = this.f94601l;
        fArr[2] = f56;
        fArr[3] = f52;
        fArr[4] = f53;
        fArr[5] = f45;
        fArr[6] = f46;
        fArr[7] = f56;
        fArr[8] = f52;
        fArr[9] = f55;
        fArr[10] = f47;
        fArr[11] = f48;
        fArr[12] = f56;
        fArr[13] = f54;
        fArr[14] = f55;
        if (this.f94590a.D0() > 0) {
            fArr[15] = f49;
            fArr[16] = f51;
            fArr[17] = this.f94601l;
            fArr[18] = f54;
            fArr[19] = f53;
            R(oVar.f94611a, fArr, 0, 20);
            return;
        }
        fArr[15] = f47;
        fArr[16] = f48;
        float f57 = this.f94601l;
        fArr[17] = f57;
        fArr[18] = f54;
        fArr[19] = f55;
        fArr[20] = f49;
        fArr[21] = f51;
        fArr[22] = f57;
        fArr[23] = f54;
        fArr[24] = f53;
        fArr[25] = f43;
        fArr[26] = f44;
        fArr[27] = f57;
        fArr[28] = f52;
        fArr[29] = f53;
        R(oVar.f94611a, fArr, 0, 30);
    }

    public void o(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
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
        float C0 = 1.0f / texture.C0();
        float I = 1.0f / texture.I();
        float f52 = i11 * C0;
        float f53 = (i12 + i14) * I;
        float f54 = (i11 + i13) * C0;
        float f55 = i12 * I;
        if (z11) {
            f52 = f54;
            f54 = f52;
        }
        if (z12) {
            f53 = f55;
            f55 = f53;
        }
        float[] fArr = f94589p;
        fArr[0] = f43;
        fArr[1] = f44;
        float f56 = this.f94601l;
        fArr[2] = f56;
        fArr[3] = f52;
        fArr[4] = f53;
        fArr[5] = f45;
        fArr[6] = f46;
        fArr[7] = f56;
        fArr[8] = f52;
        fArr[9] = f55;
        fArr[10] = f47;
        fArr[11] = f48;
        fArr[12] = f56;
        fArr[13] = f54;
        fArr[14] = f55;
        if (this.f94590a.D0() > 0) {
            fArr[15] = f49;
            fArr[16] = f51;
            fArr[17] = this.f94601l;
            fArr[18] = f54;
            fArr[19] = f53;
            R(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f47;
        fArr[16] = f48;
        float f57 = this.f94601l;
        fArr[17] = f57;
        fArr[18] = f54;
        fArr[19] = f55;
        fArr[20] = f49;
        fArr[21] = f51;
        fArr[22] = f57;
        fArr[23] = f54;
        fArr[24] = f53;
        fArr[25] = f43;
        fArr[26] = f44;
        fArr[27] = f57;
        fArr[28] = f52;
        fArr[29] = f53;
        R(texture, fArr, 0, 30);
    }

    public void w0() {
        if (this.f94591b) {
            throw new IllegalStateException("end must be called before beginCache");
        }
        if (this.f94597h != null) {
            throw new IllegalStateException("endCache must be called before begin.");
        }
        this.f94590a.D0();
        FloatBuffer y12 = this.f94590a.y1(true);
        a aVar = new a(this.f94594e.f13179b, y12.limit());
        this.f94597h = aVar;
        this.f94594e.a(aVar);
        y12.compact();
    }

    public Matrix4 x0() {
        return this.f94593d;
    }

    public void z(Texture texture, float f11, float f12, float f13, float f14, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        float C0 = 1.0f / texture.C0();
        float I = 1.0f / texture.I();
        float f15 = i11 * C0;
        float f16 = (i12 + i14) * I;
        float f17 = (i11 + i13) * C0;
        float f18 = i12 * I;
        float f19 = f11 + f13;
        float f21 = f12 + f14;
        if (!z11) {
            f15 = f17;
            f17 = f15;
        }
        if (z12) {
            f16 = f18;
            f18 = f16;
        }
        float[] fArr = f94589p;
        fArr[0] = f11;
        fArr[1] = f12;
        float f22 = this.f94601l;
        fArr[2] = f22;
        fArr[3] = f17;
        fArr[4] = f16;
        fArr[5] = f11;
        fArr[6] = f21;
        fArr[7] = f22;
        fArr[8] = f17;
        fArr[9] = f18;
        fArr[10] = f19;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f15;
        fArr[14] = f18;
        if (this.f94590a.D0() > 0) {
            fArr[15] = f19;
            fArr[16] = f12;
            fArr[17] = this.f94601l;
            fArr[18] = f15;
            fArr[19] = f16;
            R(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f19;
        fArr[16] = f21;
        float f23 = this.f94601l;
        fArr[17] = f23;
        fArr[18] = f15;
        fArr[19] = f18;
        fArr[20] = f19;
        fArr[21] = f12;
        fArr[22] = f23;
        fArr[23] = f15;
        fArr[24] = f16;
        fArr[25] = f11;
        fArr[26] = f12;
        fArr[27] = f23;
        fArr[28] = f17;
        fArr[29] = f16;
        R(texture, fArr, 0, 30);
    }

    public n(int i11, boolean z11) {
        this(i11, Q0(), z11);
    }

    public n(int i11, w wVar, boolean z11) {
        this.f94592c = new Matrix4();
        this.f94593d = new Matrix4();
        this.f94594e = new com.badlogic.gdx.utils.a<>();
        this.f94595f = new Matrix4();
        this.f94598i = new com.badlogic.gdx.utils.a<>(8);
        this.f94599j = new v(8);
        this.f94600k = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94601l = com.badlogic.gdx.graphics.b.f11527j;
        this.f94602m = null;
        int i12 = 0;
        this.f94603n = 0;
        this.f94604o = 0;
        this.f94596g = wVar;
        if (z11 && i11 > 8191) {
            throw new IllegalArgumentException("Can't have more than 8191 sprites per batch: " + i11);
        }
        Mesh mesh = new Mesh(true, (z11 ? 4 : 6) * i11, z11 ? i11 * 6 : 0, new r(1, 2, w.f74225u), new r(4, 4, w.f74227w), new r(16, 2, "a_texCoord0"));
        this.f94590a = mesh;
        mesh.G1(false);
        if (z11) {
            int i13 = i11 * 6;
            short[] sArr = new short[i13];
            short s11 = 0;
            while (i12 < i13) {
                sArr[i12] = s11;
                sArr[i12 + 1] = (short) (s11 + 1);
                short s12 = (short) (s11 + 2);
                sArr[i12 + 2] = s12;
                sArr[i12 + 3] = s12;
                sArr[i12 + 4] = (short) (s11 + 3);
                sArr[i12 + 5] = s11;
                i12 += 6;
                s11 = (short) (s11 + 4);
            }
            this.f94590a.H1(sArr);
        }
        this.f94593d.setToOrtho2D(0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
    }
}
