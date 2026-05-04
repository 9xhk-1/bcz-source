package w1;

import a3.q;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a extends q {
    public static final int C0 = 0;
    public static final int D0 = 1;
    public static final int E0 = 2;
    public static final int F0 = 3;
    public static final int G0 = 4;
    public static final int H0 = 5;
    public static final int I0 = 6;
    public static final int J0 = 7;
    public static final int K0 = 8;
    public static final int L0 = 9;
    public static final int M0 = 10;
    public static final int N0 = 11;
    public static final int O0 = 12;
    public static final int P0 = 13;
    public static final int Q0 = 14;
    public static final int R0 = 15;
    public static final int S0 = 16;
    public static final int T0 = 17;
    public static final int U0 = 18;
    public static final int V0 = 19;

    Matrix4 B0();

    boolean E0();

    void F();

    void G(float f11);

    int H0();

    int J();

    void K(Texture texture, float f11, float f12, int i11, int i12, int i13, int i14);

    void K0(w wVar);

    void L(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11);

    float N0();

    void O0(o oVar, float f11, float f12, Affine2 affine2);

    void R0(Matrix4 matrix4);

    void T0(Texture texture, float f11, float f12, float f13, float f14);

    int X0();

    void Z0(Matrix4 matrix4);

    int b0();

    void c();

    void c0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    com.badlogic.gdx.graphics.b e();

    boolean e0();

    void end();

    void f0(Texture texture, float f11, float f12);

    void flush();

    void g0(int i11, int i12);

    w getShader();

    void h(com.badlogic.gdx.graphics.b bVar);

    void k(float f11, float f12, float f13, float f14);

    void k0(int i11, int i12, int i13, int i14);

    void q(o oVar, float f11, float f12);

    void q0(Texture texture, float f11, float f12, float f13, float f14, int i11, int i12, int i13, int i14, boolean z11, boolean z12);

    void s(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19);

    void t0(Texture texture, float[] fArr, int i11, int i12);

    void u0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, int i12, int i13, int i14, boolean z11, boolean z12);

    void v();

    void v0(o oVar, float f11, float f12, float f13, float f14);

    Matrix4 x0();
}
