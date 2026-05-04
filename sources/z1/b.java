package z1;

import a3.e0;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static final int A = 11;
    public static final int B = 12;
    public static final int C = 13;
    public static final int D = 14;
    public static final int E = 15;
    public static final int F = 16;
    public static final int G = 17;
    public static final int H = 18;
    public static final int I = 19;
    public static final int J = 20;
    public static final int K = 21;
    public static final int L = 22;
    public static final int M = 23;

    /* renamed from: k, reason: collision with root package name */
    public static final int f100550k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final int f100551l = 24;

    /* renamed from: p, reason: collision with root package name */
    public static final int f100555p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final int f100556q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f100557r = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f100558s = 3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f100559t = 4;

    /* renamed from: u, reason: collision with root package name */
    public static final int f100560u = 5;

    /* renamed from: v, reason: collision with root package name */
    public static final int f100561v = 6;

    /* renamed from: w, reason: collision with root package name */
    public static final int f100562w = 7;

    /* renamed from: x, reason: collision with root package name */
    public static final int f100563x = 8;

    /* renamed from: y, reason: collision with root package name */
    public static final int f100564y = 9;

    /* renamed from: z, reason: collision with root package name */
    public static final int f100565z = 10;

    /* renamed from: a, reason: collision with root package name */
    public int f100566a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f100567b;

    /* renamed from: c, reason: collision with root package name */
    public Vector3 f100568c;

    /* renamed from: d, reason: collision with root package name */
    public Quaternion f100569d;

    /* renamed from: e, reason: collision with root package name */
    public Vector2 f100570e;

    /* renamed from: f, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f100571f;

    /* renamed from: g, reason: collision with root package name */
    public Vector2 f100572g;

    /* renamed from: h, reason: collision with root package name */
    public Vector2 f100573h;

    /* renamed from: i, reason: collision with root package name */
    public d f100574i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f100575j;

    /* renamed from: m, reason: collision with root package name */
    public static Vector3 f100552m = new Vector3();

    /* renamed from: n, reason: collision with root package name */
    public static Vector3 f100553n = new Vector3();

    /* renamed from: o, reason: collision with root package name */
    public static final Vector3 f100554o = new Vector3();
    public static Quaternion N = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);

    public b() {
        this.f100567b = new float[24];
        this.f100568c = new Vector3();
        this.f100569d = new Quaternion();
        this.f100570e = new Vector2(1.0f, 1.0f);
        this.f100571f = new com.badlogic.gdx.graphics.b();
        this.f100572g = null;
        this.f100573h = new Vector2();
        this.f100575j = false;
        this.f100574i = new d();
    }

    public static b o(float f11, float f12, o oVar) {
        return p(f11, f12, oVar, -1, -1);
    }

    public static b p(float f11, float f12, o oVar, int i11, int i12) {
        b bVar = new b();
        bVar.R(oVar);
        bVar.y(i11, i12);
        Vector2 vector2 = bVar.f100573h;
        vector2.f12535x = f11;
        vector2.f12536y = f12;
        bVar.z(1.0f, 1.0f, 1.0f, 1.0f);
        return bVar;
    }

    public static b q(float f11, float f12, o oVar, int i11, int i12, d dVar) {
        b bVar = new b(dVar);
        bVar.R(oVar);
        bVar.y(i11, i12);
        Vector2 vector2 = bVar.f100573h;
        vector2.f12535x = f11;
        vector2.f12536y = f12;
        bVar.z(1.0f, 1.0f, 1.0f, 1.0f);
        return bVar;
    }

    public static b r(float f11, float f12, o oVar, boolean z11) {
        return p(f11, f12, oVar, z11 ? com.badlogic.gdx.graphics.f.f11653r : -1, z11 ? com.badlogic.gdx.graphics.f.f11659s : -1);
    }

    public static b s(o oVar) {
        return p(oVar.c(), oVar.b(), oVar, -1, -1);
    }

    public static b t(o oVar, boolean z11) {
        return p(oVar.c(), oVar.b(), oVar, z11 ? com.badlogic.gdx.graphics.f.f11653r : -1, z11 ? com.badlogic.gdx.graphics.f.f11659s : -1);
    }

    public void A(com.badlogic.gdx.graphics.b bVar) {
        this.f100571f.H(bVar);
        float L2 = bVar.L();
        float[] fArr = this.f100567b;
        fArr[3] = L2;
        fArr[9] = L2;
        fArr[15] = L2;
        fArr[21] = L2;
    }

    public void B(float f11, float f12) {
        this.f100573h.set(f11, f12);
        this.f100575j = false;
    }

    public void C(float f11) {
        this.f100573h.f12536y = f11;
        this.f100575j = false;
    }

    public void D(d dVar) {
        this.f100574i = dVar;
    }

    public void E(float f11) {
        com.badlogic.gdx.graphics.b.a(this.f100571f, f11);
        float[] fArr = this.f100567b;
        fArr[3] = f11;
        fArr[9] = f11;
        fArr[15] = f11;
        fArr[21] = f11;
    }

    public void F(float f11, float f12, float f13) {
        this.f100568c.set(f11, f12, f13);
        this.f100575j = false;
    }

    public void G(Vector3 vector3) {
        this.f100568c.set(vector3);
        this.f100575j = false;
    }

    public void H(float f11, float f12, float f13) {
        this.f100569d.setEulerAngles(f11, f12, f13);
        this.f100575j = false;
    }

    public void I(Quaternion quaternion) {
        this.f100569d.set(quaternion);
        this.f100575j = false;
    }

    public void J(Vector3 vector3, Vector3 vector32) {
        f100552m.set(vector32).crs(vector3).nor();
        f100553n.set(vector3).crs(f100552m).nor();
        Quaternion quaternion = this.f100569d;
        Vector3 vector33 = f100552m;
        float f11 = vector33.f12537x;
        Vector3 vector34 = f100553n;
        quaternion.setFromAxes(f11, vector34.f12537x, vector3.f12537x, vector33.f12538y, vector34.f12538y, vector3.f12538y, vector33.f12539z, vector34.f12539z, vector3.f12539z);
        this.f100575j = false;
    }

    public void K(float f11) {
        this.f100569d.set(Vector3.X, f11);
        this.f100575j = false;
    }

    public void L(float f11) {
        this.f100569d.set(Vector3.Y, f11);
        this.f100575j = false;
    }

    public void M(float f11) {
        this.f100569d.set(Vector3.Z, f11);
        this.f100575j = false;
    }

    public void N(float f11) {
        this.f100570e.set(f11, f11);
        this.f100575j = false;
    }

    public void O(float f11, float f12) {
        this.f100570e.set(f11, f12);
        this.f100575j = false;
    }

    public void P(float f11) {
        this.f100570e.f12535x = f11;
        this.f100575j = false;
    }

    public void Q(float f11) {
        this.f100570e.f12536y = f11;
        this.f100575j = false;
    }

    public void R(o oVar) {
        this.f100574i.f100585a = oVar;
        d0();
    }

    public void S(float f11) {
        this.f100573h.f12535x = f11;
        this.f100575j = false;
    }

    public void T(float f11) {
        this.f100568c.f12537x = f11;
        this.f100575j = false;
    }

    public void U(float f11) {
        this.f100568c.f12538y = f11;
        this.f100575j = false;
    }

    public void V(float f11) {
        this.f100568c.f12539z = f11;
        this.f100575j = false;
    }

    public void W() {
        float f11;
        float f12;
        Vector2 vector2 = this.f100572g;
        if (vector2 != null) {
            f11 = -vector2.f12535x;
            f12 = -vector2.f12536y;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        float[] fArr = this.f100567b;
        float f13 = fArr[0] + f11;
        Vector2 vector22 = this.f100570e;
        float f14 = f13 * vector22.f12535x;
        float f15 = (fArr[1] + f12) * vector22.f12536y;
        float f16 = fArr[2];
        Quaternion quaternion = this.f100569d;
        float f17 = quaternion.f12529w;
        float f18 = quaternion.f12531y;
        float f19 = quaternion.f12532z;
        fArr[0] = ((f17 * f14) + (f18 * f16)) - (f19 * f15);
        float f21 = quaternion.f12530x;
        fArr[1] = ((f17 * f15) + (f19 * f14)) - (f21 * f16);
        fArr[2] = ((f17 * f16) + (f21 * f15)) - (f18 * f14);
        float f22 = (((-f21) * f14) - (f18 * f15)) - (f19 * f16);
        quaternion.conjugate();
        float[] fArr2 = this.f100567b;
        float f23 = fArr2[0];
        float f24 = fArr2[1];
        float f25 = fArr2[2];
        Quaternion quaternion2 = this.f100569d;
        float f26 = quaternion2.f12530x;
        float f27 = quaternion2.f12529w;
        float f28 = quaternion2.f12532z;
        float f29 = quaternion2.f12531y;
        fArr2[0] = (((f22 * f26) + (f23 * f27)) + (f24 * f28)) - (f25 * f29);
        fArr2[1] = (((f22 * f29) + (f24 * f27)) + (f25 * f26)) - (f23 * f28);
        fArr2[2] = (((f22 * f28) + (f25 * f27)) + (f23 * f29)) - (f24 * f26);
        quaternion2.conjugate();
        float[] fArr3 = this.f100567b;
        float f31 = fArr3[0];
        Vector3 vector3 = this.f100568c;
        fArr3[0] = f31 + (vector3.f12537x - f11);
        fArr3[1] = fArr3[1] + (vector3.f12538y - f12);
        fArr3[2] = fArr3[2] + vector3.f12539z;
        float f32 = fArr3[6] + f11;
        Vector2 vector23 = this.f100570e;
        float f33 = f32 * vector23.f12535x;
        float f34 = (fArr3[7] + f12) * vector23.f12536y;
        float f35 = fArr3[8];
        Quaternion quaternion3 = this.f100569d;
        float f36 = quaternion3.f12529w;
        float f37 = quaternion3.f12531y;
        float f38 = quaternion3.f12532z;
        fArr3[6] = ((f36 * f33) + (f37 * f35)) - (f38 * f34);
        float f39 = quaternion3.f12530x;
        fArr3[7] = ((f36 * f34) + (f38 * f33)) - (f39 * f35);
        fArr3[8] = ((f36 * f35) + (f39 * f34)) - (f37 * f33);
        float f41 = (((-f39) * f33) - (f37 * f34)) - (f38 * f35);
        quaternion3.conjugate();
        float[] fArr4 = this.f100567b;
        float f42 = fArr4[6];
        float f43 = fArr4[7];
        float f44 = fArr4[8];
        Quaternion quaternion4 = this.f100569d;
        float f45 = quaternion4.f12530x;
        float f46 = quaternion4.f12529w;
        float f47 = quaternion4.f12532z;
        float f48 = quaternion4.f12531y;
        fArr4[6] = (((f41 * f45) + (f42 * f46)) + (f43 * f47)) - (f44 * f48);
        fArr4[7] = (((f41 * f48) + (f43 * f46)) + (f44 * f45)) - (f42 * f47);
        fArr4[8] = (((f41 * f47) + (f44 * f46)) + (f42 * f48)) - (f43 * f45);
        quaternion4.conjugate();
        float[] fArr5 = this.f100567b;
        float f49 = fArr5[6];
        Vector3 vector32 = this.f100568c;
        fArr5[6] = f49 + (vector32.f12537x - f11);
        fArr5[7] = fArr5[7] + (vector32.f12538y - f12);
        fArr5[8] = fArr5[8] + vector32.f12539z;
        float f51 = fArr5[12] + f11;
        Vector2 vector24 = this.f100570e;
        float f52 = f51 * vector24.f12535x;
        float f53 = (fArr5[13] + f12) * vector24.f12536y;
        float f54 = fArr5[14];
        Quaternion quaternion5 = this.f100569d;
        float f55 = quaternion5.f12529w;
        float f56 = quaternion5.f12531y;
        float f57 = quaternion5.f12532z;
        fArr5[12] = ((f55 * f52) + (f56 * f54)) - (f57 * f53);
        float f58 = quaternion5.f12530x;
        fArr5[13] = ((f55 * f53) + (f57 * f52)) - (f58 * f54);
        fArr5[14] = ((f55 * f54) + (f58 * f53)) - (f56 * f52);
        float f59 = (((-f58) * f52) - (f56 * f53)) - (f57 * f54);
        quaternion5.conjugate();
        float[] fArr6 = this.f100567b;
        float f61 = fArr6[12];
        float f62 = fArr6[13];
        float f63 = fArr6[14];
        Quaternion quaternion6 = this.f100569d;
        float f64 = quaternion6.f12530x;
        float f65 = quaternion6.f12529w;
        float f66 = quaternion6.f12532z;
        float f67 = quaternion6.f12531y;
        fArr6[12] = (((f59 * f64) + (f61 * f65)) + (f62 * f66)) - (f63 * f67);
        fArr6[13] = (((f59 * f67) + (f62 * f65)) + (f63 * f64)) - (f61 * f66);
        fArr6[14] = (((f59 * f66) + (f63 * f65)) + (f61 * f67)) - (f62 * f64);
        quaternion6.conjugate();
        float[] fArr7 = this.f100567b;
        float f68 = fArr7[12];
        Vector3 vector33 = this.f100568c;
        fArr7[12] = f68 + (vector33.f12537x - f11);
        fArr7[13] = fArr7[13] + (vector33.f12538y - f12);
        fArr7[14] = fArr7[14] + vector33.f12539z;
        float f69 = fArr7[18] + f11;
        Vector2 vector25 = this.f100570e;
        float f71 = f69 * vector25.f12535x;
        float f72 = (fArr7[19] + f12) * vector25.f12536y;
        float f73 = fArr7[20];
        Quaternion quaternion7 = this.f100569d;
        float f74 = quaternion7.f12529w;
        float f75 = quaternion7.f12531y;
        float f76 = quaternion7.f12532z;
        fArr7[18] = ((f74 * f71) + (f75 * f73)) - (f76 * f72);
        float f77 = quaternion7.f12530x;
        fArr7[19] = ((f74 * f72) + (f76 * f71)) - (f77 * f73);
        fArr7[20] = ((f74 * f73) + (f77 * f72)) - (f75 * f71);
        float f78 = (((-f77) * f71) - (f75 * f72)) - (f76 * f73);
        quaternion7.conjugate();
        float[] fArr8 = this.f100567b;
        float f79 = fArr8[18];
        float f81 = fArr8[19];
        float f82 = fArr8[20];
        Quaternion quaternion8 = this.f100569d;
        float f83 = quaternion8.f12530x;
        float f84 = quaternion8.f12529w;
        float f85 = quaternion8.f12532z;
        float f86 = quaternion8.f12531y;
        fArr8[18] = (((f78 * f83) + (f79 * f84)) + (f81 * f85)) - (f82 * f86);
        fArr8[19] = (((f78 * f86) + (f81 * f84)) + (f82 * f83)) - (f79 * f85);
        fArr8[20] = (((f78 * f85) + (f82 * f84)) + (f79 * f86)) - (f81 * f83);
        quaternion8.conjugate();
        float[] fArr9 = this.f100567b;
        float f87 = fArr9[18];
        Vector3 vector34 = this.f100568c;
        fArr9[18] = f87 + (vector34.f12537x - f11);
        fArr9[19] = fArr9[19] + (vector34.f12538y - f12);
        fArr9[20] = fArr9[20] + vector34.f12539z;
        this.f100575j = true;
    }

    public void X(float f11, float f12, float f13) {
        this.f100568c.add(f11, f12, f13);
        this.f100575j = false;
    }

    public void Y(Vector3 vector3) {
        this.f100568c.add(vector3);
        this.f100575j = false;
    }

    public void Z(float f11) {
        this.f100568c.f12537x += f11;
        this.f100575j = false;
    }

    public com.badlogic.gdx.graphics.b a() {
        return this.f100571f;
    }

    public void a0(float f11) {
        this.f100568c.f12538y += f11;
        this.f100575j = false;
    }

    public float b() {
        return this.f100573h.f12536y;
    }

    public void b0(float f11) {
        this.f100568c.f12539z += f11;
        this.f100575j = false;
    }

    public d c() {
        return this.f100574i;
    }

    public void c0() {
        if (this.f100575j) {
            return;
        }
        u();
        W();
    }

    public Vector3 d() {
        return this.f100568c;
    }

    public void d0() {
        o oVar = this.f100574i.f100585a;
        this.f100567b[4] = oVar.g();
        this.f100567b[5] = oVar.i();
        this.f100567b[10] = oVar.h();
        this.f100567b[11] = oVar.i();
        this.f100567b[16] = oVar.g();
        this.f100567b[17] = oVar.j();
        this.f100567b[22] = oVar.h();
        this.f100567b[23] = oVar.j();
    }

    public Quaternion e() {
        return this.f100569d;
    }

    public float f() {
        return this.f100570e.f12535x;
    }

    public float g() {
        return this.f100570e.f12536y;
    }

    public o h() {
        return this.f100574i.f100585a;
    }

    public float[] i() {
        c0();
        return this.f100567b;
    }

    public float j() {
        return this.f100573h.f12535x;
    }

    public float k() {
        return this.f100568c.f12537x;
    }

    public float l() {
        return this.f100568c.f12538y;
    }

    public float m() {
        return this.f100568c.f12539z;
    }

    public void n(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = f100554o;
        vector33.set(vector3).sub(this.f100568c).nor();
        J(vector33, vector32);
    }

    public void u() {
        Vector2 vector2 = this.f100573h;
        float f11 = vector2.f12535x;
        float f12 = (-f11) / 2.0f;
        float f13 = f11 + f12;
        float f14 = vector2.f12536y;
        float f15 = f14 / 2.0f;
        float f16 = f15 - f14;
        float[] fArr = this.f100567b;
        fArr[0] = f12;
        fArr[1] = f15;
        fArr[2] = 0.0f;
        fArr[6] = f13;
        fArr[7] = f15;
        fArr[8] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f16;
        fArr[14] = 0.0f;
        fArr[18] = f13;
        fArr[19] = f16;
        fArr[20] = 0.0f;
        this.f100575j = false;
    }

    public void v(float f11) {
        N.set(Vector3.X, f11);
        this.f100569d.mul(N);
        this.f100575j = false;
    }

    public void w(float f11) {
        N.set(Vector3.Y, f11);
        this.f100569d.mul(N);
        this.f100575j = false;
    }

    public void x(float f11) {
        N.set(Vector3.Z, f11);
        this.f100569d.mul(N);
        this.f100575j = false;
    }

    public void y(int i11, int i12) {
        d dVar = this.f100574i;
        dVar.f100586b = i11;
        dVar.f100587c = i12;
    }

    public void z(float f11, float f12, float f13, float f14) {
        this.f100571f.F(f11, f12, f13, f14);
        int i11 = ((int) (f12 * 255.0f)) << 8;
        int i12 = (int) (f11 * 255.0f);
        float f15 = e0.f(i12 | i11 | (((int) (f13 * 255.0f)) << 16) | (((int) (f14 * 255.0f)) << 24));
        float[] fArr = this.f100567b;
        fArr[3] = f15;
        fArr[9] = f15;
        fArr[15] = f15;
        fArr[21] = f15;
    }

    public b(d dVar) {
        this.f100567b = new float[24];
        this.f100568c = new Vector3();
        this.f100569d = new Quaternion();
        this.f100570e = new Vector2(1.0f, 1.0f);
        this.f100571f = new com.badlogic.gdx.graphics.b();
        this.f100572g = null;
        this.f100573h = new Vector2();
        this.f100575j = false;
        this.f100574i = dVar;
    }
}
