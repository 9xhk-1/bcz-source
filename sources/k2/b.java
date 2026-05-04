package k2;

import a2.e;
import a2.h;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import k2.a;
import l2.m;
import n2.w;
import x1.i;
import x1.k;
import y1.d;
import y1.f;
import y1.g;
import y1.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends k2.a {

    /* renamed from: c2, reason: collision with root package name */
    public static String f65037c2;

    /* renamed from: d2, reason: collision with root package name */
    public static String f65038d2;

    /* renamed from: e2, reason: collision with root package name */
    public static long f65039e2 = (((y1.a.f98941j | j.f98991l) | y1.b.f98947g) | y1.b.f98949i) | f.f98977g;

    /* renamed from: f2, reason: collision with root package name */
    @Deprecated
    public static int f65040f2 = 1029;

    /* renamed from: g2, reason: collision with root package name */
    @Deprecated
    public static int f65041g2 = com.badlogic.gdx.graphics.f.f11596h2;

    /* renamed from: h2, reason: collision with root package name */
    public static final long f65042h2 = g.f98982g | d.f98967j;

    /* renamed from: i2, reason: collision with root package name */
    public static final x1.b f65043i2 = new x1.b();
    public final int A;
    public int A1;
    public final int B;
    public int B1;
    public final int C;
    public int C1;
    public final int D;
    public int D1;
    public final int E;
    public int E1;
    public final int F;
    public int F1;
    public final int G;
    public int G1;
    public final int H;
    public int H1;
    public final int I;
    public int I1;
    public final int J;
    public int J1;
    public final int K;
    public int K1;
    public final int L;
    public final boolean L1;
    public final int M;
    public final boolean M1;
    public final int N;
    public final boolean N1;
    public final int O;
    public final a2.a O1;
    public final int P;
    public final a2.c[] P1;
    public final int Q;
    public final e[] Q1;
    public final int R;
    public final h[] R1;
    public final int S;
    public i S1;
    public final int T;
    public final long T1;
    public final int U;
    public final long U1;
    public final int V;
    public final int V1;
    public final int W;
    public int[] W1;
    public final int X;
    public final a X1;
    public final int Y;
    public final Matrix3 Y1;
    public final int Z;
    public float Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f65044a2;

    /* renamed from: b2, reason: collision with root package name */
    public final Vector3 f65045b2;

    /* renamed from: f0, reason: collision with root package name */
    public final int f65046f0;

    /* renamed from: f1, reason: collision with root package name */
    public final int f65047f1;

    /* renamed from: h1, reason: collision with root package name */
    public final int f65048h1;

    /* renamed from: i1, reason: collision with root package name */
    public final int f65049i1;

    /* renamed from: j1, reason: collision with root package name */
    public final int f65050j1;

    /* renamed from: k1, reason: collision with root package name */
    public final int f65051k1;

    /* renamed from: l1, reason: collision with root package name */
    public final int f65052l1;

    /* renamed from: m1, reason: collision with root package name */
    public final int f65053m1;

    /* renamed from: n1, reason: collision with root package name */
    public final int f65054n1;

    /* renamed from: o1, reason: collision with root package name */
    public final int f65055o1;

    /* renamed from: p, reason: collision with root package name */
    public final int f65056p;

    /* renamed from: p1, reason: collision with root package name */
    public final int f65057p1;

    /* renamed from: q, reason: collision with root package name */
    public final int f65058q;

    /* renamed from: q1, reason: collision with root package name */
    public final int f65059q1;

    /* renamed from: r, reason: collision with root package name */
    public final int f65060r;

    /* renamed from: r1, reason: collision with root package name */
    public final int f65061r1;

    /* renamed from: s, reason: collision with root package name */
    public final int f65062s;

    /* renamed from: s1, reason: collision with root package name */
    public final int f65063s1;

    /* renamed from: t, reason: collision with root package name */
    public final int f65064t;

    /* renamed from: t1, reason: collision with root package name */
    public final int f65065t1;

    /* renamed from: u, reason: collision with root package name */
    public final int f65066u;

    /* renamed from: u1, reason: collision with root package name */
    public int f65067u1;

    /* renamed from: v, reason: collision with root package name */
    public final int f65068v;

    /* renamed from: v1, reason: collision with root package name */
    public int f65069v1;

    /* renamed from: w, reason: collision with root package name */
    public final int f65070w;

    /* renamed from: w1, reason: collision with root package name */
    public int f65071w1;

    /* renamed from: x, reason: collision with root package name */
    public final int f65072x;

    /* renamed from: x1, reason: collision with root package name */
    public int f65073x1;

    /* renamed from: y, reason: collision with root package name */
    public final int f65074y;

    /* renamed from: y1, reason: collision with root package name */
    public int f65075y1;

    /* renamed from: z, reason: collision with root package name */
    public final int f65076z;

    /* renamed from: z1, reason: collision with root package name */
    public int f65077z1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k2.b$b, reason: collision with other inner class name */
    public static class C0748b {
        public static final a.d A;
        public static final a.d B;
        public static final a.d C;
        public static final a.d D;
        public static final a.d E;
        public static final a.d F;
        public static final a.d G;
        public static final a.d H;
        public static final a.d I;
        public static final a.d J;

        /* renamed from: a, reason: collision with root package name */
        public static final a.d f65088a = new a.d("u_projTrans");

        /* renamed from: b, reason: collision with root package name */
        public static final a.d f65089b = new a.d("u_viewTrans");

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f65090c = new a.d("u_projViewTrans");

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f65091d = new a.d("u_cameraPosition");

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f65092e = new a.d("u_cameraDirection");

        /* renamed from: f, reason: collision with root package name */
        public static final a.d f65093f = new a.d("u_cameraUp");

        /* renamed from: g, reason: collision with root package name */
        public static final a.d f65094g = new a.d("u_cameraNearFar");

        /* renamed from: h, reason: collision with root package name */
        public static final a.d f65095h = new a.d("u_worldTrans");

        /* renamed from: i, reason: collision with root package name */
        public static final a.d f65096i = new a.d("u_viewWorldTrans");

        /* renamed from: j, reason: collision with root package name */
        public static final a.d f65097j = new a.d("u_projViewWorldTrans");

        /* renamed from: k, reason: collision with root package name */
        public static final a.d f65098k = new a.d("u_normalMatrix");

        /* renamed from: l, reason: collision with root package name */
        public static final a.d f65099l = new a.d("u_bones");

        /* renamed from: m, reason: collision with root package name */
        public static final a.d f65100m = new a.d("u_shininess", f.f98977g);

        /* renamed from: n, reason: collision with root package name */
        public static final a.d f65101n = new a.d("u_opacity", y1.a.f98941j);

        /* renamed from: o, reason: collision with root package name */
        public static final a.d f65102o = new a.d("u_diffuseColor", y1.b.f98947g);

        /* renamed from: p, reason: collision with root package name */
        public static final a.d f65103p;

        /* renamed from: q, reason: collision with root package name */
        public static final a.d f65104q;

        /* renamed from: r, reason: collision with root package name */
        public static final a.d f65105r;

        /* renamed from: s, reason: collision with root package name */
        public static final a.d f65106s;

        /* renamed from: t, reason: collision with root package name */
        public static final a.d f65107t;

        /* renamed from: u, reason: collision with root package name */
        public static final a.d f65108u;

        /* renamed from: v, reason: collision with root package name */
        public static final a.d f65109v;

        /* renamed from: w, reason: collision with root package name */
        public static final a.d f65110w;

        /* renamed from: x, reason: collision with root package name */
        public static final a.d f65111x;

        /* renamed from: y, reason: collision with root package name */
        public static final a.d f65112y;

        /* renamed from: z, reason: collision with root package name */
        public static final a.d f65113z;

        static {
            long j11 = j.f98991l;
            f65103p = new a.d("u_diffuseTexture", j11);
            f65104q = new a.d("u_diffuseUVTransform", j11);
            f65105r = new a.d("u_specularColor", y1.b.f98949i);
            long j12 = j.f98993n;
            f65106s = new a.d("u_specularTexture", j12);
            f65107t = new a.d("u_specularUVTransform", j12);
            f65108u = new a.d("u_emissiveColor", y1.b.f98953m);
            long j13 = j.f99001v;
            f65109v = new a.d("u_emissiveTexture", j13);
            f65110w = new a.d("u_emissiveUVTransform", j13);
            f65111x = new a.d("u_reflectionColor", y1.b.f98955o);
            long j14 = j.f99003x;
            f65112y = new a.d("u_reflectionTexture", j14);
            f65113z = new a.d("u_reflectionUVTransform", j14);
            long j15 = j.f98997r;
            A = new a.d("u_normalTexture", j15);
            B = new a.d("u_normalUVTransform", j15);
            long j16 = j.f98999t;
            C = new a.d("u_ambientTexture", j16);
            D = new a.d("u_ambientUVTransform", j16);
            E = new a.d("u_alphaTest");
            F = new a.d("u_ambientCubemap");
            G = new a.d("u_dirLights");
            H = new a.d("u_pointLights");
            I = new a.d("u_spotLights");
            J = new a.d("u_environmentCubemap");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a.c f65114a = new k();

        /* renamed from: b, reason: collision with root package name */
        public static final a.c f65115b = new v();

        /* renamed from: c, reason: collision with root package name */
        public static final a.c f65116c = new w();

        /* renamed from: d, reason: collision with root package name */
        public static final a.c f65117d = new x();

        /* renamed from: e, reason: collision with root package name */
        public static final a.c f65118e = new y();

        /* renamed from: f, reason: collision with root package name */
        public static final a.c f65119f = new z();

        /* renamed from: g, reason: collision with root package name */
        public static final a.c f65120g = new a0();

        /* renamed from: h, reason: collision with root package name */
        public static final a.c f65121h = new b0();

        /* renamed from: i, reason: collision with root package name */
        public static final a.c f65122i = new c0();

        /* renamed from: j, reason: collision with root package name */
        public static final a.c f65123j = new a();

        /* renamed from: k, reason: collision with root package name */
        public static final a.c f65124k = new C0749b();

        /* renamed from: l, reason: collision with root package name */
        public static final a.c f65125l = new C0750c();

        /* renamed from: m, reason: collision with root package name */
        public static final a.c f65126m = new d();

        /* renamed from: n, reason: collision with root package name */
        public static final a.c f65127n = new e();

        /* renamed from: o, reason: collision with root package name */
        public static final a.c f65128o = new f();

        /* renamed from: p, reason: collision with root package name */
        public static final a.c f65129p = new g();

        /* renamed from: q, reason: collision with root package name */
        public static final a.c f65130q = new h();

        /* renamed from: r, reason: collision with root package name */
        public static final a.c f65131r = new i();

        /* renamed from: s, reason: collision with root package name */
        public static final a.c f65132s = new j();

        /* renamed from: t, reason: collision with root package name */
        public static final a.c f65133t = new l();

        /* renamed from: u, reason: collision with root package name */
        public static final a.c f65134u = new m();

        /* renamed from: v, reason: collision with root package name */
        public static final a.c f65135v = new n();

        /* renamed from: w, reason: collision with root package name */
        public static final a.c f65136w = new o();

        /* renamed from: x, reason: collision with root package name */
        public static final a.c f65137x = new p();

        /* renamed from: y, reason: collision with root package name */
        public static final a.c f65138y = new q();

        /* renamed from: z, reason: collision with root package name */
        public static final a.c f65139z = new r();
        public static final a.c A = new s();
        public static final a.c B = new t();
        public static final a.c C = new u();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends a.b {

            /* renamed from: a, reason: collision with root package name */
            public final Matrix4 f65140a = new Matrix4();

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.k1(i11, this.f65140a.set(aVar.f65028k.f11513f).mul(iVar.f97047a));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a0 extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                com.badlogic.gdx.graphics.a aVar2 = aVar.f65028k;
                aVar.a1(i11, aVar2.f11515h, aVar2.f11516i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: k2.b$c$b, reason: collision with other inner class name */
        public class C0749b extends a.b {

            /* renamed from: a, reason: collision with root package name */
            public final Matrix3 f65141a = new Matrix3();

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.j1(i11, this.f65141a.set(iVar.f97047a).inv().transpose());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b0 extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.k1(i11, iVar.f97047a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: k2.b$c$c, reason: collision with other inner class name */
        public class C0750c extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.V0(i11, ((y1.f) bVar.l(y1.f.f98977g)).f98980e);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c0 extends a.b {

            /* renamed from: a, reason: collision with root package name */
            public final Matrix4 f65142a = new Matrix4();

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.k1(i11, this.f65142a.set(aVar.f65028k.f11512e).mul(iVar.f97047a));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.h1(i11, ((y1.b) bVar.l(y1.b.f98947g)).f98961e);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class d0 extends a.b {

            /* renamed from: d, reason: collision with root package name */
            public static final float[] f65143d = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

            /* renamed from: e, reason: collision with root package name */
            public static final Vector3 f65144e = new Vector3();

            /* renamed from: a, reason: collision with root package name */
            public final a2.a f65145a = new a2.a();

            /* renamed from: b, reason: collision with root package name */
            public final int f65146b;

            /* renamed from: c, reason: collision with root package name */
            public final int f65147c;

            public d0(int i11, int i12) {
                this.f65146b = i11;
                this.f65147c = i12;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                if (iVar.f97050d == null) {
                    n2.w wVar = aVar.f65026i;
                    int X = aVar.X(i11);
                    float[] fArr = f65143d;
                    wVar.y1(X, fArr, 0, fArr.length);
                    return;
                }
                iVar.f97047a.getTranslation(f65144e);
                long j11 = y1.b.f98957q;
                if (bVar.p(j11)) {
                    this.f65145a.o(((y1.b) bVar.l(j11)).f98961e);
                }
                long j12 = y1.e.f98974g;
                if (bVar.p(j12)) {
                    com.badlogic.gdx.utils.a<a2.c> aVar2 = ((y1.e) bVar.l(j12)).f98975e;
                    for (int i12 = this.f65146b; i12 < aVar2.f13179b; i12++) {
                        this.f65145a.f(aVar2.get(i12).f1404a, aVar2.get(i12).f1405b);
                    }
                }
                long j13 = y1.h.f98985g;
                if (bVar.p(j13)) {
                    com.badlogic.gdx.utils.a<a2.e> aVar3 = ((y1.h) bVar.l(j13)).f98986e;
                    for (int i13 = this.f65147c; i13 < aVar3.f13179b; i13++) {
                        this.f65145a.h(aVar3.get(i13).f1404a, aVar3.get(i13).f1412b, f65144e, aVar3.get(i13).f1413c);
                    }
                }
                this.f65145a.j();
                n2.w wVar2 = aVar.f65026i;
                int X2 = aVar.X(i11);
                float[] fArr2 = this.f65145a.f1403a;
                wVar2.y1(X2, fArr2, 0, fArr2.length);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class e extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.j) bVar.l(y1.j.f98991l)).f99005e));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class e0 extends a.b {

            /* renamed from: b, reason: collision with root package name */
            public static final Matrix4 f65148b = new Matrix4();

            /* renamed from: a, reason: collision with root package name */
            public final float[] f65149a;

            public e0(int i11) {
                this.f65149a = new float[i11 * 16];
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                Matrix4 matrix4;
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f65149a;
                    if (i12 >= fArr.length) {
                        n2.w wVar = aVar.f65026i;
                        int X = aVar.X(i11);
                        float[] fArr2 = this.f65149a;
                        wVar.L1(X, fArr2, 0, fArr2.length);
                        return;
                    }
                    int i13 = i12 / 16;
                    Matrix4[] matrix4Arr = iVar.f97051e;
                    if (matrix4Arr == null || i13 >= matrix4Arr.length || (matrix4 = matrix4Arr[i13]) == null) {
                        System.arraycopy(f65148b.val, 0, fArr, i12, 16);
                    } else {
                        System.arraycopy(matrix4.val, 0, fArr, i12, 16);
                    }
                    i12 += 16;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class f extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                y1.j jVar = (y1.j) bVar.l(y1.j.f98991l);
                aVar.c1(i11, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class g extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.h1(i11, ((y1.b) bVar.l(y1.b.f98949i)).f98961e);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class h extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.j) bVar.l(y1.j.f98993n)).f99005e));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class i extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                y1.j jVar = (y1.j) bVar.l(y1.j.f98993n);
                aVar.c1(i11, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class j extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.h1(i11, ((y1.b) bVar.l(y1.b.f98953m)).f98961e);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class k extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.k1(i11, aVar.f65028k.f11511d);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class l extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.j) bVar.l(y1.j.f99001v)).f99005e));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class m extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                y1.j jVar = (y1.j) bVar.l(y1.j.f99001v);
                aVar.c1(i11, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class n extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.h1(i11, ((y1.b) bVar.l(y1.b.f98955o)).f98961e);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class o extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.j) bVar.l(y1.j.f99003x)).f99005e));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class p extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                y1.j jVar = (y1.j) bVar.l(y1.j.f99003x);
                aVar.c1(i11, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class q extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.j) bVar.l(y1.j.f98997r)).f99005e));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class r extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                y1.j jVar = (y1.j) bVar.l(y1.j.f98997r);
                aVar.c1(i11, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class s extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.j) bVar.l(y1.j.f98999t)).f99005e));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class t extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                y1.j jVar = (y1.j) bVar.l(y1.j.f98999t);
                aVar.c1(i11, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class u extends a.b {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                long j11 = y1.c.f98963g;
                if (bVar.p(j11)) {
                    aVar.d1(i11, aVar.f65027j.f69236a.e(((y1.c) bVar.l(j11)).f98965e));
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class v extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.k1(i11, aVar.f65028k.f11512e);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class w extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.k1(i11, aVar.f65028k.f11513f);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class x extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                com.badlogic.gdx.graphics.a aVar2 = aVar.f65028k;
                Vector3 vector3 = aVar2.f11508a;
                float f11 = vector3.f12537x;
                float f12 = vector3.f12538y;
                float f13 = vector3.f12539z;
                float f14 = aVar2.f11516i;
                aVar.c1(i11, f11, f12, f13, 1.1881f / (f14 * f14));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class y extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.m1(i11, aVar.f65028k.f11509b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class z extends a.AbstractC0747a {
            @Override // k2.a.c
            public void b(k2.a aVar, int i11, x1.i iVar, x1.b bVar) {
                aVar.m1(i11, aVar.f65028k.f11510c);
            }
        }
    }

    public b(i iVar) {
        this(iVar, new a());
    }

    public static final boolean o1(long j11, long j12) {
        return (j11 & j12) == j12;
    }

    public static final long r1(i iVar) {
        x1.c cVar = iVar.f97050d;
        long o11 = cVar != null ? cVar.o() : 0L;
        x1.d dVar = iVar.f97049c;
        return dVar != null ? o11 | dVar.o() : o11;
    }

    private static final x1.b s1(i iVar) {
        x1.b bVar = f65043i2;
        bVar.clear();
        x1.c cVar = iVar.f97050d;
        if (cVar != null) {
            bVar.u(cVar);
        }
        x1.d dVar = iVar.f97049c;
        if (dVar != null) {
            bVar.u(dVar);
        }
        return bVar;
    }

    public static String t1(i iVar, a aVar) {
        x1.b s12 = s1(iVar);
        long o11 = s12.o();
        long k11 = iVar.f97048b.f7490e.r1().k();
        String str = o1(k11, 1L) ? "#define positionFlag\n" : "";
        if (z1(k11, 6L)) {
            str = str + "#define colorFlag\n";
        }
        if (o1(k11, 256L)) {
            str = str + "#define binormalFlag\n";
        }
        if (o1(k11, 128L)) {
            str = str + "#define tangentFlag\n";
        }
        if (o1(k11, 8L)) {
            str = str + "#define normalFlag\n";
        }
        if ((o1(k11, 8L) || o1(k11, 384L)) && iVar.f97050d != null) {
            String str2 = ((((str + "#define lightingFlag\n") + "#define ambientCubemapFlag\n") + "#define numDirectionalLights " + aVar.f65080c + "\n") + "#define numPointLights " + aVar.f65081d + "\n") + "#define numSpotLights " + aVar.f65082e + "\n";
            if (s12.p(y1.b.f98959s)) {
                str2 = str2 + "#define fogFlag\n";
            }
            if (iVar.f97050d.f97007d != null) {
                str2 = str2 + "#define shadowMapFlag\n";
            }
            str = str2;
            if (s12.p(y1.c.f98963g)) {
                str = str + "#define environmentCubemapFlag\n";
            }
        }
        int size = iVar.f97048b.f7490e.r1().size();
        for (int i11 = 0; i11 < size; i11++) {
            r f11 = iVar.f97048b.f7490e.r1().f(i11);
            if (f11.f12488a == 16) {
                str = str + "#define texCoord" + f11.f12494g + "Flag\n";
            }
        }
        if (iVar.f97051e != null) {
            for (int i12 = 0; i12 < aVar.f65084g; i12++) {
                str = str + "#define boneWeight" + i12 + "Flag\n";
            }
        }
        long j11 = y1.a.f98941j;
        if ((o11 & j11) == j11) {
            str = str + "#define blendedFlag\n";
        }
        long j12 = j.f98991l;
        if ((o11 & j12) == j12) {
            str = (str + "#define diffuseTextureFlag\n") + "#define diffuseTextureCoord texCoord0\n";
        }
        long j13 = j.f98993n;
        if ((o11 & j13) == j13) {
            str = (str + "#define specularTextureFlag\n") + "#define specularTextureCoord texCoord0\n";
        }
        long j14 = j.f98997r;
        if ((o11 & j14) == j14) {
            str = (str + "#define normalTextureFlag\n") + "#define normalTextureCoord texCoord0\n";
        }
        long j15 = j.f99001v;
        if ((o11 & j15) == j15) {
            str = (str + "#define emissiveTextureFlag\n") + "#define emissiveTextureCoord texCoord0\n";
        }
        long j16 = j.f99003x;
        if ((o11 & j16) == j16) {
            str = (str + "#define reflectionTextureFlag\n") + "#define reflectionTextureCoord texCoord0\n";
        }
        long j17 = j.f98999t;
        if ((o11 & j17) == j17) {
            str = (str + "#define ambientTextureFlag\n") + "#define ambientTextureCoord texCoord0\n";
        }
        long j18 = y1.b.f98947g;
        if ((o11 & j18) == j18) {
            str = str + "#define diffuseColorFlag\n";
        }
        long j19 = y1.b.f98949i;
        if ((o11 & j19) == j19) {
            str = str + "#define specularColorFlag\n";
        }
        long j21 = y1.b.f98953m;
        if ((o11 & j21) == j21) {
            str = str + "#define emissiveColorFlag\n";
        }
        long j22 = y1.b.f98955o;
        if ((o11 & j22) == j22) {
            str = str + "#define reflectionColorFlag\n";
        }
        long j23 = f.f98977g;
        if ((o11 & j23) == j23) {
            str = str + "#define shininessFlag\n";
        }
        long j24 = f.f98979i;
        if ((o11 & j24) == j24) {
            str = str + "#define alphaTestFlag\n";
        }
        if (iVar.f97051e == null || aVar.f65083f <= 0) {
            return str;
        }
        return str + "#define numBones " + aVar.f65083f + "\n";
    }

    public static String x1() {
        if (f65038d2 == null) {
            f65038d2 = q1.g.f81382e.i("com/badlogic/gdx/graphics/g3d/shaders/default.fragment.glsl").I();
        }
        return f65038d2;
    }

    public static String y1() {
        if (f65037c2 == null) {
            f65037c2 = q1.g.f81382e.i("com/badlogic/gdx/graphics/g3d/shaders/default.vertex.glsl").I();
        }
        return f65037c2;
    }

    public static final boolean z1(long j11, long j12) {
        return (j11 & j12) != 0;
    }

    public void A1(int i11) {
        this.X1.f65086i = i11;
    }

    public void B1(int i11) {
        this.X1.f65087j = i11;
    }

    @Override // x1.k
    public int F0(k kVar) {
        return kVar == null ? -1 : 0;
    }

    @Override // k2.a
    public void Q0(i iVar, x1.b bVar) {
        if (!bVar.p(y1.a.f98941j)) {
            this.f65027j.c(false, com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        }
        q1(bVar);
        if (this.L1) {
            p1(iVar, bVar);
        }
        super.Q0(iVar, bVar);
    }

    @Override // k2.a, a3.q
    public void dispose() {
        this.f65026i.dispose();
        super.dispose();
    }

    @Override // k2.a, x1.k
    public void end() {
        super.end();
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && u1((b) obj);
    }

    @Override // x1.k
    public void init() {
        w wVar = this.f65026i;
        this.f65026i = null;
        R(wVar, this.S1);
        this.S1 = null;
        this.f65067u1 = X(this.X);
        this.f65069v1 = X(this.X) - this.f65067u1;
        this.f65071w1 = X(this.Y) - this.f65067u1;
        int X = X(this.Z) - this.f65067u1;
        this.f65073x1 = X;
        int i11 = 0;
        if (X < 0) {
            this.f65073x1 = 0;
        }
        this.f65075y1 = X(this.f65046f0);
        this.f65077z1 = X(this.f65046f0) - this.f65075y1;
        this.A1 = X(this.f65047f1) - this.f65075y1;
        this.B1 = I(this.f65048h1) ? X(this.f65048h1) - this.f65075y1 : -1;
        int X2 = X(this.f65049i1) - this.f65075y1;
        this.C1 = X2;
        if (X2 < 0) {
            this.C1 = 0;
        }
        this.D1 = X(this.f65050j1);
        this.E1 = X(this.f65050j1) - this.D1;
        this.F1 = X(this.f65051k1) - this.D1;
        this.G1 = X(this.f65053m1) - this.D1;
        this.H1 = I(this.f65052l1) ? X(this.f65052l1) - this.D1 : -1;
        this.I1 = X(this.f65054n1) - this.D1;
        this.J1 = X(this.f65055o1) - this.D1;
        int X3 = X(this.f65057p1) - this.D1;
        this.K1 = X3;
        if (X3 < 0) {
            this.K1 = 0;
        }
        if (this.W1 == null) {
            return;
        }
        while (true) {
            int[] iArr = this.W1;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = wVar.V0(w.A + i11);
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[EDGE_INSN: B:27:0x00c1->B:40:0x00c1 BREAK  A[LOOP:0: B:13:0x003b->B:23:0x00bd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150 A[EDGE_INSN: B:60:0x0150->B:69:0x0150 BREAK  A[LOOP:1: B:43:0x00c6->B:53:0x014c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[EDGE_INSN: B:88:0x0203->B:97:0x0203 BREAK  A[LOOP:2: B:71:0x0154->B:81:0x01ff], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p1(x1.i r14, x1.b r15) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.b.p1(x1.i, x1.b):void");
    }

    public void q1(x1.b bVar) {
        a aVar = this.X1;
        int i11 = aVar.f65086i;
        if (i11 == -1) {
            i11 = f65040f2;
        }
        int i12 = aVar.f65087j;
        if (i12 == -1) {
            i12 = f65041g2;
        }
        Iterator<x1.a> it = bVar.iterator();
        float f11 = 0.0f;
        float f12 = 1.0f;
        boolean z11 = true;
        while (it.hasNext()) {
            x1.a next = it.next();
            long j11 = next.f97002a;
            if (y1.a.i(j11)) {
                y1.a aVar2 = (y1.a) next;
                this.f65027j.c(true, aVar2.f98943f, aVar2.f98944g);
                V0(this.D, aVar2.f98945h);
            } else {
                long j12 = g.f98982g;
                if ((j11 & j12) == j12) {
                    i11 = ((g) next).f98983e;
                } else {
                    long j13 = f.f98979i;
                    if ((j11 & j13) == j13) {
                        V0(this.U, ((f) next).f98980e);
                    } else {
                        long j14 = d.f98967j;
                        if ((j11 & j14) == j14) {
                            d dVar = (d) next;
                            i12 = dVar.f98969e;
                            f11 = dVar.f98970f;
                            f12 = dVar.f98971g;
                            z11 = dVar.f98972h;
                        } else if (!this.X1.f65085h) {
                            throw new GdxRuntimeException("Unknown material attribute: " + next.toString());
                        }
                    }
                }
            }
        }
        this.f65027j.d(i11);
        this.f65027j.g(i12, f11, f12);
        this.f65027j.e(z11);
    }

    @Override // x1.k
    public boolean u(i iVar) {
        Matrix4[] matrix4Arr = iVar.f97051e;
        if ((matrix4Arr != null && (matrix4Arr.length > this.X1.f65083f || iVar.f97048b.f7490e.r1().g() > this.X1.f65084g)) || iVar.f97048b.f7490e.r1().p() != this.V1) {
            return false;
        }
        if (this.T1 == (r1(iVar) | f65042h2) && this.U1 == iVar.f97048b.f7490e.r1().l()) {
            if ((iVar.f97050d != null) == this.L1) {
                return true;
            }
        }
        return false;
    }

    public boolean u1(b bVar) {
        return bVar == this;
    }

    public int v1() {
        int i11 = this.X1.f65086i;
        return i11 == -1 ? f65040f2 : i11;
    }

    public int w1() {
        int i11 = this.X1.f65087j;
        return i11 == -1 ? f65041g2 : i11;
    }

    @Override // k2.a, x1.k
    public void y0(com.badlogic.gdx.graphics.a aVar, m mVar) {
        super.y0(aVar, mVar);
        for (a2.c cVar : this.P1) {
            cVar.R(0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        }
        for (e eVar : this.Q1) {
            eVar.R(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        }
        for (h hVar : this.R1) {
            hVar.R(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        }
        this.f65044a2 = false;
        if (I(this.f65070w)) {
            int i11 = this.f65070w;
            float S = this.Z1 + q1.g.f81379b.S();
            this.Z1 = S;
            V0(i11, S);
        }
        int[] iArr = this.W1;
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 >= 0) {
                    q1.g.f81384g.O2(i12, 0.0f, 0.0f);
                }
            }
        }
    }

    public b(i iVar, a aVar) {
        this(iVar, aVar, t1(iVar, aVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(x1.i r8, k2.b.a r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = r9.f65078a
            if (r0 == 0) goto L6
        L4:
            r5 = r0
            goto Lb
        L6:
            java.lang.String r0 = y1()
            goto L4
        Lb:
            java.lang.String r0 = r9.f65079b
            if (r0 == 0) goto L15
        Lf:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            goto L1a
        L15:
            java.lang.String r0 = x1()
            goto Lf
        L1a:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.b.<init>(x1.i, k2.b$a, java.lang.String):void");
    }

    public b(i iVar, a aVar, String str, String str2, String str3) {
        this(iVar, aVar, new w(str + str2, str + str3));
    }

    public b(i iVar, a aVar, w wVar) {
        int i11;
        int i12;
        int i13;
        this.X = C0(new a.d("u_dirLights[0].color"));
        this.Y = C0(new a.d("u_dirLights[0].direction"));
        this.Z = C0(new a.d("u_dirLights[1].color"));
        this.f65046f0 = C0(new a.d("u_pointLights[0].color"));
        this.f65047f1 = C0(new a.d("u_pointLights[0].position"));
        this.f65048h1 = C0(new a.d("u_pointLights[0].intensity"));
        this.f65049i1 = C0(new a.d("u_pointLights[1].color"));
        this.f65050j1 = C0(new a.d("u_spotLights[0].color"));
        this.f65051k1 = C0(new a.d("u_spotLights[0].position"));
        this.f65052l1 = C0(new a.d("u_spotLights[0].intensity"));
        this.f65053m1 = C0(new a.d("u_spotLights[0].direction"));
        this.f65054n1 = C0(new a.d("u_spotLights[0].cutoffAngle"));
        this.f65055o1 = C0(new a.d("u_spotLights[0].exponent"));
        this.f65057p1 = C0(new a.d("u_spotLights[1].color"));
        this.f65059q1 = C0(new a.d("u_fogColor"));
        this.f65061r1 = C0(new a.d("u_shadowMapProjViewTrans"));
        this.f65063s1 = C0(new a.d("u_shadowTexture"));
        this.f65065t1 = C0(new a.d("u_shadowPCFOffset"));
        this.O1 = new a2.a();
        this.Y1 = new Matrix3();
        this.f65045b2 = new Vector3();
        x1.b s12 = s1(iVar);
        this.X1 = aVar;
        this.f65026i = wVar;
        int i14 = 0;
        boolean z11 = iVar.f97050d != null;
        this.L1 = z11;
        long j11 = y1.c.f98963g;
        this.M1 = s12.p(j11) || (z11 && s12.p(j11));
        this.N1 = z11 && iVar.f97050d.f97007d != null;
        this.S1 = iVar;
        this.T1 = s12.o() | f65042h2;
        this.U1 = iVar.f97048b.f7490e.r1().l();
        this.V1 = iVar.f97048b.f7490e.r1().p();
        this.P1 = new a2.c[(!z11 || (i13 = aVar.f65080c) <= 0) ? 0 : i13];
        int i15 = 0;
        while (true) {
            a2.c[] cVarArr = this.P1;
            if (i15 >= cVarArr.length) {
                break;
            }
            cVarArr[i15] = new a2.c();
            i15++;
        }
        this.Q1 = new e[(!this.L1 || (i12 = aVar.f65081d) <= 0) ? 0 : i12];
        int i16 = 0;
        while (true) {
            e[] eVarArr = this.Q1;
            if (i16 >= eVarArr.length) {
                break;
            }
            eVarArr[i16] = new e();
            i16++;
        }
        this.R1 = new h[(!this.L1 || (i11 = aVar.f65082e) <= 0) ? 0 : i11];
        while (true) {
            h[] hVarArr = this.R1;
            if (i14 >= hVarArr.length) {
                break;
            }
            hVarArr[i14] = new h();
            i14++;
        }
        if (!aVar.f65085h) {
            long j12 = f65039e2;
            long j13 = this.T1;
            if ((j12 & j13) != j13) {
                throw new GdxRuntimeException("Some attributes not implemented yet (" + this.T1 + pn.j.f81007d);
            }
        }
        Matrix4[] matrix4Arr = iVar.f97051e;
        if (matrix4Arr != null && matrix4Arr.length > aVar.f65083f) {
            throw new GdxRuntimeException("too many bones: " + iVar.f97051e.length + ", max configured: " + aVar.f65083f);
        }
        int g11 = iVar.f97048b.f7490e.r1().g();
        int i17 = aVar.f65084g;
        if (g11 <= i17) {
            if (iVar.f97051e != null) {
                this.W1 = new int[i17];
            }
            this.f65056p = J0(C0748b.f65088a, c.f65114a);
            this.f65058q = J0(C0748b.f65089b, c.f65115b);
            this.f65060r = J0(C0748b.f65090c, c.f65116c);
            this.f65062s = J0(C0748b.f65091d, c.f65117d);
            this.f65064t = J0(C0748b.f65092e, c.f65118e);
            this.f65066u = J0(C0748b.f65093f, c.f65119f);
            this.f65068v = J0(C0748b.f65094g, c.f65120g);
            this.f65070w = C0(new a.d("u_time"));
            this.f65072x = J0(C0748b.f65095h, c.f65121h);
            this.f65074y = J0(C0748b.f65096i, c.f65122i);
            this.f65076z = J0(C0748b.f65097j, c.f65123j);
            this.A = J0(C0748b.f65098k, c.f65124k);
            this.B = (iVar.f97051e == null || aVar.f65083f <= 0) ? -1 : J0(C0748b.f65099l, new c.e0(aVar.f65083f));
            this.C = J0(C0748b.f65100m, c.f65125l);
            this.D = C0(C0748b.f65101n);
            this.E = J0(C0748b.f65102o, c.f65126m);
            this.F = J0(C0748b.f65103p, c.f65127n);
            this.G = J0(C0748b.f65104q, c.f65128o);
            this.H = J0(C0748b.f65105r, c.f65129p);
            this.I = J0(C0748b.f65106s, c.f65130q);
            this.J = J0(C0748b.f65107t, c.f65131r);
            this.K = J0(C0748b.f65108u, c.f65132s);
            this.L = J0(C0748b.f65109v, c.f65133t);
            this.M = J0(C0748b.f65110w, c.f65134u);
            this.N = J0(C0748b.f65111x, c.f65135v);
            this.O = J0(C0748b.f65112y, c.f65136w);
            this.P = J0(C0748b.f65113z, c.f65137x);
            this.Q = J0(C0748b.A, c.f65138y);
            this.R = J0(C0748b.B, c.f65139z);
            this.S = J0(C0748b.C, c.A);
            this.T = J0(C0748b.D, c.B);
            this.U = C0(C0748b.E);
            this.V = this.L1 ? J0(C0748b.F, new c.d0(aVar.f65080c, aVar.f65081d)) : -1;
            this.W = this.M1 ? J0(C0748b.J, c.C) : -1;
            return;
        }
        throw new GdxRuntimeException("too many bone weights: " + g11 + ", max configured: " + aVar.f65084g);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f65078a;

        /* renamed from: b, reason: collision with root package name */
        public String f65079b;

        /* renamed from: c, reason: collision with root package name */
        public int f65080c;

        /* renamed from: d, reason: collision with root package name */
        public int f65081d;

        /* renamed from: e, reason: collision with root package name */
        public int f65082e;

        /* renamed from: f, reason: collision with root package name */
        public int f65083f;

        /* renamed from: g, reason: collision with root package name */
        public int f65084g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f65085h;

        /* renamed from: i, reason: collision with root package name */
        public int f65086i;

        /* renamed from: j, reason: collision with root package name */
        public int f65087j;

        public a() {
            this.f65078a = null;
            this.f65079b = null;
            this.f65080c = 2;
            this.f65081d = 5;
            this.f65082e = 0;
            this.f65083f = 12;
            this.f65084g = 4;
            this.f65085h = true;
            this.f65086i = -1;
            this.f65087j = -1;
        }

        public a(String str, String str2) {
            this.f65080c = 2;
            this.f65081d = 5;
            this.f65082e = 0;
            this.f65083f = 12;
            this.f65084g = 4;
            this.f65085h = true;
            this.f65086i = -1;
            this.f65087j = -1;
            this.f65078a = str;
            this.f65079b = str2;
        }
    }
}
