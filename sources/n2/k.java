package n2;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f74166a;

    /* renamed from: b, reason: collision with root package name */
    public int f74167b;

    /* renamed from: c, reason: collision with root package name */
    public int f74168c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74169d;

    /* renamed from: e, reason: collision with root package name */
    public int f74170e;

    /* renamed from: f, reason: collision with root package name */
    public final Mesh f74171f;

    /* renamed from: g, reason: collision with root package name */
    public w f74172g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74173h;

    /* renamed from: i, reason: collision with root package name */
    public final int f74174i;

    /* renamed from: j, reason: collision with root package name */
    public final int f74175j;

    /* renamed from: k, reason: collision with root package name */
    public final int f74176k;

    /* renamed from: l, reason: collision with root package name */
    public final int f74177l;

    /* renamed from: m, reason: collision with root package name */
    public final int f74178m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix4 f74179n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f74180o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f74181p;

    public k(boolean z11, boolean z12, int i11) {
        this(5000, z11, z12, i11, b(z11, z12, i11));
        this.f74173h = true;
    }

    public static w b(boolean z11, boolean z12, int i11) {
        w wVar = new w(d(z11, z12, i11), c(z11, z12, i11));
        if (wVar.q1()) {
            return wVar;
        }
        throw new GdxRuntimeException("Error compiling shader: " + wVar.f1());
    }

    public static String c(boolean z11, boolean z12, int i11) {
        String str = z12 ? "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_col;\n" : "#ifdef GL_ES\nprecision mediump float;\n#endif\n";
        for (int i12 = 0; i12 < i11; i12++) {
            str = (str + "varying vec2 v_tex" + i12 + ";\n") + "uniform sampler2D u_sampler" + i12 + ";\n";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("void main() {\n   gl_FragColor = ");
        sb2.append(z12 ? "v_col" : "vec4(1, 1, 1, 1)");
        String sb3 = sb2.toString();
        if (i11 > 0) {
            sb3 = sb3 + " * ";
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb3 = i13 == i11 - 1 ? sb3 + " texture2D(u_sampler" + i13 + ",  v_tex" + i13 + pn.j.f81007d : sb3 + " texture2D(u_sampler" + i13 + ",  v_tex" + i13 + ") *";
        }
        return sb3 + ";\n}";
    }

    public static String d(boolean z11, boolean z12, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("attribute vec4 a_position;\n");
        sb2.append(z11 ? "attribute vec3 a_normal;\n" : "");
        sb2.append(z12 ? "attribute vec4 a_color;\n" : "");
        String sb3 = sb2.toString();
        for (int i12 = 0; i12 < i11; i12++) {
            sb3 = sb3 + "attribute vec2 a_texCoord" + i12 + ";\n";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb3);
        sb4.append("uniform mat4 u_projModelView;\n");
        sb4.append(z12 ? "varying vec4 v_col;\n" : "");
        String sb5 = sb4.toString();
        for (int i13 = 0; i13 < i11; i13++) {
            sb5 = sb5 + "varying vec2 v_tex" + i13 + ";\n";
        }
        String str = sb5 + "void main() {\n   gl_Position = u_projModelView * a_position;\n";
        if (z12) {
            str = str + "   v_col = a_color;\n   v_col.a *= 255.0 / 254.0;\n";
        }
        for (int i14 = 0; i14 < i11; i14++) {
            str = str + "   v_tex" + i14 + " = " + w.f74228x + i14 + ";\n";
        }
        return str + "   gl_PointSize = 1.0;\n}\n";
    }

    public final com.badlogic.gdx.graphics.r[] a(boolean z11, boolean z12, int i11) {
        com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a();
        aVar.a(new com.badlogic.gdx.graphics.r(1, 3, w.f74225u));
        if (z11) {
            aVar.a(new com.badlogic.gdx.graphics.r(8, 3, w.f74226v));
        }
        if (z12) {
            aVar.a(new com.badlogic.gdx.graphics.r(4, 4, w.f74227w));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            aVar.a(new com.badlogic.gdx.graphics.r(16, 2, w.f74228x + i12));
        }
        com.badlogic.gdx.graphics.r[] rVarArr = new com.badlogic.gdx.graphics.r[aVar.f13179b];
        for (int i13 = 0; i13 < aVar.f13179b; i13++) {
            rVarArr[i13] = (com.badlogic.gdx.graphics.r) aVar.get(i13);
        }
        return rVarArr;
    }

    @Override // n2.l
    public void dispose() {
        w wVar;
        if (this.f74173h && (wVar = this.f74172g) != null) {
            wVar.dispose();
        }
        this.f74171f.dispose();
    }

    public w e() {
        return this.f74172g;
    }

    @Override // n2.l
    public void end() {
        flush();
    }

    public void f(w wVar) {
        if (this.f74173h) {
            this.f74172g.dispose();
        }
        this.f74172g = wVar;
        this.f74173h = false;
    }

    @Override // n2.l
    public void flush() {
        if (this.f74170e == 0) {
            return;
        }
        this.f74172g.S();
        this.f74172g.I1("u_projModelView", this.f74179n);
        for (int i11 = 0; i11 < this.f74174i; i11++) {
            this.f74172g.i2(this.f74181p[i11], i11);
        }
        this.f74171f.O1(this.f74180o, 0, this.f74167b);
        this.f74171f.C1(this.f74172g, this.f74166a);
        this.f74168c = 0;
        this.f74167b = 0;
        this.f74170e = 0;
    }

    @Override // n2.l
    public int m() {
        return this.f74170e;
    }

    @Override // n2.l
    public void n(float f11) {
        this.f74180o[this.f74167b + this.f74177l] = f11;
    }

    @Override // n2.l
    public void o(float f11, float f12, float f13, float f14) {
        this.f74180o[this.f74167b + this.f74177l] = com.badlogic.gdx.graphics.b.M(f11, f12, f13, f14);
    }

    @Override // n2.l
    public void p(com.badlogic.gdx.graphics.b bVar) {
        this.f74180o[this.f74167b + this.f74177l] = bVar.L();
    }

    @Override // n2.l
    public void q(float f11, float f12, float f13) {
        int i11 = this.f74167b;
        float[] fArr = this.f74180o;
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
        fArr[i11 + 2] = f13;
        this.f74168c = 0;
        this.f74167b = i11 + this.f74175j;
        this.f74170e++;
    }

    @Override // n2.l
    public void r(float f11, float f12) {
        int i11 = this.f74167b + this.f74178m;
        float[] fArr = this.f74180o;
        int i12 = this.f74168c;
        fArr[i11 + i12] = f11;
        fArr[i11 + i12 + 1] = f12;
        this.f74168c = i12 + 2;
    }

    @Override // n2.l
    public int s() {
        return this.f74169d;
    }

    @Override // n2.l
    public void t(Matrix4 matrix4, int i11) {
        this.f74179n.set(matrix4);
        this.f74166a = i11;
    }

    @Override // n2.l
    public void u(float f11, float f12, float f13) {
        int i11 = this.f74167b + this.f74176k;
        float[] fArr = this.f74180o;
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
        fArr[i11 + 2] = f13;
    }

    public k(int i11, boolean z11, boolean z12, int i12) {
        this(i11, z11, z12, i12, b(z11, z12, i12));
        this.f74173h = true;
    }

    public k(int i11, boolean z11, boolean z12, int i12, w wVar) {
        this.f74179n = new Matrix4();
        this.f74169d = i11;
        this.f74174i = i12;
        this.f74172g = wVar;
        Mesh mesh = new Mesh(false, i11, 0, a(z11, z12, i12));
        this.f74171f = mesh;
        this.f74180o = new float[i11 * (mesh.r1().f12497b / 4)];
        this.f74175j = mesh.r1().f12497b / 4;
        this.f74176k = mesh.q1(8) != null ? mesh.q1(8).f12492e / 4 : 0;
        this.f74177l = mesh.q1(4) != null ? mesh.q1(4).f12492e / 4 : 0;
        this.f74178m = mesh.q1(16) != null ? mesh.q1(16).f12492e / 4 : 0;
        this.f74181p = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            this.f74181p[i13] = "u_sampler" + i13;
        }
    }
}
