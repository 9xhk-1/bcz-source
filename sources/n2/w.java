package n2;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Vector4;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.l;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w implements a3.q {
    public static final String A = "a_boneWeight";
    public static boolean B = true;
    public static String C = "";
    public static String D = "";
    public static final com.badlogic.gdx.utils.l<Application, com.badlogic.gdx.utils.a<w>> E = new com.badlogic.gdx.utils.l<>();
    public static final IntBuffer F = BufferUtils.G(1);

    /* renamed from: u, reason: collision with root package name */
    public static final String f74225u = "a_position";

    /* renamed from: v, reason: collision with root package name */
    public static final String f74226v = "a_normal";

    /* renamed from: w, reason: collision with root package name */
    public static final String f74227w = "a_color";

    /* renamed from: x, reason: collision with root package name */
    public static final String f74228x = "a_texCoord";

    /* renamed from: y, reason: collision with root package name */
    public static final String f74229y = "a_tangent";

    /* renamed from: z, reason: collision with root package name */
    public static final String f74230z = "a_binormal";

    /* renamed from: a, reason: collision with root package name */
    public String f74231a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f74232b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.k<String> f74233c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.k<String> f74234d;

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.k<String> f74235e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f74236f;

    /* renamed from: g, reason: collision with root package name */
    public final com.badlogic.gdx.utils.k<String> f74237g;

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.utils.k<String> f74238h;

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.utils.k<String> f74239i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f74240j;

    /* renamed from: k, reason: collision with root package name */
    public int f74241k;

    /* renamed from: l, reason: collision with root package name */
    public int f74242l;

    /* renamed from: m, reason: collision with root package name */
    public int f74243m;

    /* renamed from: n, reason: collision with root package name */
    public final FloatBuffer f74244n;

    /* renamed from: o, reason: collision with root package name */
    public final String f74245o;

    /* renamed from: p, reason: collision with root package name */
    public final String f74246p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f74247q;

    /* renamed from: r, reason: collision with root package name */
    public int f74248r;

    /* renamed from: s, reason: collision with root package name */
    public IntBuffer f74249s;

    /* renamed from: t, reason: collision with root package name */
    public IntBuffer f74250t;

    public w(String str, String str2) {
        this.f74231a = "";
        this.f74233c = new com.badlogic.gdx.utils.k<>();
        this.f74234d = new com.badlogic.gdx.utils.k<>();
        this.f74235e = new com.badlogic.gdx.utils.k<>();
        this.f74237g = new com.badlogic.gdx.utils.k<>();
        this.f74238h = new com.badlogic.gdx.utils.k<>();
        this.f74239i = new com.badlogic.gdx.utils.k<>();
        this.f74248r = 0;
        this.f74249s = BufferUtils.G(1);
        this.f74250t = BufferUtils.G(1);
        if (str == null) {
            throw new IllegalArgumentException("vertex shader must not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("fragment shader must not be null");
        }
        String str3 = C;
        if (str3 != null && str3.length() > 0) {
            str = C + str;
        }
        String str4 = D;
        if (str4 != null && str4.length() > 0) {
            str2 = D + str2;
        }
        this.f74245o = str;
        this.f74246p = str2;
        this.f74244n = BufferUtils.F(16);
        D(str, str2);
        if (q1()) {
            w0();
            Q0();
            b(q1.g.f81378a, this);
        }
    }

    public static String g1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Managed shaders/app: { ");
        l.c<Application> it = E.n().iterator();
        while (it.hasNext()) {
            sb2.append(E.k(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }

    public static int h1() {
        return E.k(q1.g.f81378a).f13179b;
    }

    public static void p1(Application application) {
        com.badlogic.gdx.utils.a<w> k11;
        if (q1.g.f81385h == null || (k11 = E.k(application)) == null) {
            return;
        }
        for (int i11 = 0; i11 < k11.f13179b; i11++) {
            k11.get(i11).f74247q = true;
            k11.get(i11).o();
        }
    }

    public static void z(Application application) {
        E.u(application);
    }

    public void A1(int i11, float[] fArr, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.G3(i11, i13 / 4, fArr, i12);
    }

    public void B1(String str, float[] fArr, int i11, int i12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.G3(C0(str), i12 / 4, fArr, i11);
    }

    public final int C0(String str) {
        return J0(str, B);
    }

    public void C1(int i11, Matrix3 matrix3) {
        D1(i11, matrix3, false);
    }

    public final void D(String str, String str2) {
        this.f74242l = s1(com.badlogic.gdx.graphics.f.L1, str);
        int s12 = s1(com.badlogic.gdx.graphics.f.K1, str2);
        this.f74243m = s12;
        if (this.f74242l == -1 || s12 == -1) {
            this.f74232b = false;
            return;
        }
        int r12 = r1(I());
        this.f74241k = r12;
        if (r12 == -1) {
            this.f74232b = false;
        } else {
            this.f74232b = true;
        }
    }

    public void D1(int i11, Matrix3 matrix3, boolean z11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.Q2(i11, 1, z11, matrix3.val, 0);
    }

    public void E1(int i11, Matrix4 matrix4) {
        F1(i11, matrix4, false);
    }

    public void F1(int i11, Matrix4 matrix4, boolean z11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.r2(i11, 1, z11, matrix4.val, 0);
    }

    public void G1(String str, Matrix3 matrix3) {
        H1(str, matrix3, false);
    }

    public void H1(String str, Matrix3 matrix3, boolean z11) {
        D1(C0(str), matrix3, z11);
    }

    public int I() {
        int x42 = q1.g.f81385h.x4();
        if (x42 != 0) {
            return x42;
        }
        return -1;
    }

    public void I1(String str, Matrix4 matrix4) {
        J1(str, matrix4, false);
    }

    public int J0(String str, boolean z11) {
        int j11 = this.f74233c.j(str, -2);
        if (j11 == -2) {
            j11 = q1.g.f81385h.n2(this.f74241k, str);
            if (j11 == -1 && z11) {
                if (!this.f74232b) {
                    throw new IllegalStateException("An attempted fetch uniform from uncompiled shader \n" + f1());
                }
                throw new IllegalArgumentException("No uniform with name '" + str + "' in shader");
            }
            this.f74233c.r(str, j11);
        }
        return j11;
    }

    public void J1(String str, Matrix4 matrix4, boolean z11) {
        F1(C0(str), matrix4, z11);
    }

    public void K1(String str, FloatBuffer floatBuffer, int i11, boolean z11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        floatBuffer.position(0);
        fVar.X0(C0(str), i11, z11, floatBuffer);
    }

    public void L1(int i11, float[] fArr, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.r2(i11, i13 / 16, false, fArr, i12);
    }

    public void M1(String str, FloatBuffer floatBuffer, int i11, boolean z11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        floatBuffer.position(0);
        fVar.t1(C0(str), i11, z11, floatBuffer);
    }

    public void N1(String str, float[] fArr, int i11, int i12) {
        L1(C0(str), fArr, i11, i12);
    }

    public void O1(int i11, float f11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.K4(i11, f11);
    }

    public void P1(int i11, float f11, float f12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.X1(i11, f11, f12);
    }

    public final void Q0() {
        this.f74249s.clear();
        q1.g.f81385h.J0(this.f74241k, com.badlogic.gdx.graphics.f.Y1, this.f74249s);
        int i11 = this.f74249s.get(0);
        this.f74236f = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f74249s.clear();
            this.f74249s.put(0, 1);
            this.f74250t.clear();
            String M2 = q1.g.f81385h.M2(this.f74241k, i12, this.f74249s, this.f74250t);
            this.f74233c.r(M2, q1.g.f81385h.n2(this.f74241k, M2));
            this.f74234d.r(M2, this.f74250t.get(0));
            this.f74235e.r(M2, this.f74249s.get(0));
            this.f74236f[i12] = M2;
        }
    }

    public void Q1(int i11, float f11, float f12, float f13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.e2(i11, f11, f12, f13);
    }

    public void R(int i11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.u3(i11);
    }

    public void R1(int i11, float f11, float f12, float f13, float f14) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.U4(i11, f11, f12, f13, f14);
    }

    public void S() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.A(this.f74241k);
    }

    public void S1(int i11, com.badlogic.gdx.graphics.b bVar) {
        R1(i11, bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
    }

    public void T1(int i11, Vector2 vector2) {
        P1(i11, vector2.f12535x, vector2.f12536y);
    }

    public void U1(int i11, Vector3 vector3) {
        Q1(i11, vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public int V0(String str) {
        return this.f74237g.j(str, -1);
    }

    public void V1(int i11, Vector4 vector4) {
        R1(i11, vector4.f12541x, vector4.f12542y, vector4.f12543z, vector4.f12540w);
    }

    public void W1(String str, float f11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.K4(C0(str), f11);
    }

    public void X(String str) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        int n02 = n0(str);
        if (n02 == -1) {
            return;
        }
        fVar.u3(n02);
    }

    public void X1(String str, float f11, float f12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.X1(C0(str), f11, f12);
    }

    public void Y1(String str, float f11, float f12, float f13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.e2(C0(str), f11, f12, f13);
    }

    public void Z(int i11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.n0(i11);
    }

    public void Z1(String str, float f11, float f12, float f13, float f14) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.U4(C0(str), f11, f12, f13, f14);
    }

    public int a1(String str) {
        return this.f74239i.j(str, 0);
    }

    public void a2(String str, com.badlogic.gdx.graphics.b bVar) {
        Z1(str, bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
    }

    public final void b(Application application, w wVar) {
        com.badlogic.gdx.utils.l<Application, com.badlogic.gdx.utils.a<w>> lVar = E;
        com.badlogic.gdx.utils.a<w> k11 = lVar.k(application);
        if (k11 == null) {
            k11 = new com.badlogic.gdx.utils.a<>();
        }
        k11.a(wVar);
        lVar.r(application, k11);
    }

    public int b1(String str) {
        return this.f74238h.j(str, 0);
    }

    public void b2(String str, Vector2 vector2) {
        X1(str, vector2.f12535x, vector2.f12536y);
    }

    @Deprecated
    public void c() {
        S();
    }

    public String[] c1() {
        return this.f74240j;
    }

    public void c2(String str, Vector3 vector3) {
        Y1(str, vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public String d1() {
        return this.f74246p;
    }

    public void d2(String str, Vector4 vector4) {
        Z1(str, vector4.f12541x, vector4.f12542y, vector4.f12543z, vector4.f12540w);
    }

    @Override // a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.A(0);
        fVar.r4(this.f74242l);
        fVar.r4(this.f74243m);
        fVar.Z3(this.f74241k);
        com.badlogic.gdx.utils.l<Application, com.badlogic.gdx.utils.a<w>> lVar = E;
        if (lVar.k(q1.g.f81378a) != null) {
            lVar.k(q1.g.f81378a).C(this, true);
        }
    }

    public int e1() {
        return this.f74241k;
    }

    public void e2(int i11, int i12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.i3(i11, i12);
    }

    public String f1() {
        if (!this.f74232b) {
            return this.f74231a;
        }
        String o42 = q1.g.f81385h.o4(this.f74241k);
        this.f74231a = o42;
        return o42;
    }

    public void f2(int i11, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.e(i11, i12, i13);
    }

    public void g2(int i11, int i12, int i13, int i14) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.g3(i11, i12, i13, i14);
    }

    public void h2(int i11, int i12, int i13, int i14, int i15) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.G1(i11, i12, i13, i14, i15);
    }

    public void i0(String str) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        int n02 = n0(str);
        if (n02 == -1) {
            return;
        }
        fVar.n0(n02);
    }

    public int i1(String str) {
        return this.f74233c.j(str, -1);
    }

    public void i2(String str, int i11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.i3(C0(str), i11);
    }

    public int j1(String str) {
        return this.f74235e.j(str, 0);
    }

    public void j2(String str, int i11, int i12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.e(C0(str), i11, i12);
    }

    public int k1(String str) {
        return this.f74234d.j(str, 0);
    }

    public void k2(String str, int i11, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.g3(C0(str), i11, i12, i13);
    }

    public String[] l1() {
        return this.f74236f;
    }

    public void l2(String str, int i11, int i12, int i13, int i14) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.G1(C0(str), i11, i12, i13, i14);
    }

    public String m1() {
        return this.f74245o;
    }

    public void m2(int i11, int i12, int i13, boolean z11, int i14, int i15) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.X2(i11, i12, i13, z11, i14, i15);
    }

    public final int n0(String str) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        int j11 = this.f74237g.j(str, -2);
        if (j11 != -2) {
            return j11;
        }
        int j52 = fVar.j5(this.f74241k, str);
        this.f74237g.r(str, j52);
        return j52;
    }

    public boolean n1(String str) {
        return this.f74237g.b(str);
    }

    public void n2(int i11, int i12, int i13, boolean z11, int i14, Buffer buffer) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.a(i11, i12, i13, z11, i14, buffer);
    }

    public final void o() {
        if (this.f74247q) {
            D(this.f74245o, this.f74246p);
            this.f74247q = false;
        }
    }

    public boolean o1(String str) {
        return this.f74233c.b(str);
    }

    public void o2(String str, int i11, int i12, boolean z11, int i13, int i14) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        int n02 = n0(str);
        if (n02 == -1) {
            return;
        }
        fVar.X2(n02, i11, i12, z11, i13, i14);
    }

    public void p2(String str, int i11, int i12, boolean z11, int i13, Buffer buffer) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        int n02 = n0(str);
        if (n02 == -1) {
            return;
        }
        fVar.a(n02, i11, i12, z11, i13, buffer);
    }

    public boolean q1() {
        return this.f74232b;
    }

    public final int r1(int i11) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        if (i11 == -1) {
            return -1;
        }
        fVar.s4(i11, this.f74242l);
        fVar.s4(i11, this.f74243m);
        fVar.m3(i11);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        fVar.J0(i11, com.badlogic.gdx.graphics.f.V1, asIntBuffer);
        if (asIntBuffer.get(0) != 0) {
            return i11;
        }
        this.f74231a = q1.g.f81385h.o4(i11);
        return -1;
    }

    public final int s1(int i11, String str) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        IntBuffer G = BufferUtils.G(1);
        int m52 = fVar.m5(i11);
        if (m52 == 0) {
            return -1;
        }
        fVar.L2(m52, str);
        fVar.P1(m52);
        fVar.a4(m52, com.badlogic.gdx.graphics.f.Z3, G);
        if (G.get(0) != 0) {
            return m52;
        }
        String q22 = fVar.q2(m52);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f74231a);
        sb2.append(i11 == 35633 ? "Vertex shader\n" : "Fragment shader:\n");
        this.f74231a = sb2.toString();
        this.f74231a += q22;
        return -1;
    }

    public void t1(String str, float f11, float f12, float f13, float f14) {
        q1.g.f81385h.l4(n0(str), f11, f12, f13, f14);
    }

    public void u1(int i11, float[] fArr, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.S(i11, i13, fArr, i12);
    }

    public void v1(String str, float[] fArr, int i11, int i12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.S(C0(str), i12, fArr, i11);
    }

    public final void w0() {
        this.f74249s.clear();
        q1.g.f81385h.J0(this.f74241k, com.badlogic.gdx.graphics.f.f11554a2, this.f74249s);
        int i11 = this.f74249s.get(0);
        this.f74240j = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f74249s.clear();
            this.f74249s.put(0, 1);
            this.f74250t.clear();
            String f32 = q1.g.f81385h.f3(this.f74241k, i12, this.f74249s, this.f74250t);
            this.f74237g.r(f32, q1.g.f81385h.j5(this.f74241k, f32));
            this.f74238h.r(f32, this.f74250t.get(0));
            this.f74239i.r(f32, this.f74249s.get(0));
            this.f74240j[i12] = f32;
        }
    }

    public void w1(int i11, float[] fArr, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.c1(i11, i13 / 2, fArr, i12);
    }

    public void x1(String str, float[] fArr, int i11, int i12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.c1(C0(str), i12 / 2, fArr, i11);
    }

    public void y1(int i11, float[] fArr, int i12, int i13) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.D2(i11, i13 / 3, fArr, i12);
    }

    public void z1(String str, float[] fArr, int i11, int i12) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        o();
        fVar.D2(C0(str), i12 / 3, fArr, i11);
    }

    @Deprecated
    public void end() {
    }

    public w(v1.a aVar, v1.a aVar2) {
        this(aVar.I(), aVar2.I());
    }
}
