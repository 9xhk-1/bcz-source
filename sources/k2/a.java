package k2;

import a3.v;
import a3.x;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.j;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.graphics.s;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import l2.m;
import n2.w;
import x1.i;
import x1.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements k {

    /* renamed from: d, reason: collision with root package name */
    public int[] f65021d;

    /* renamed from: i, reason: collision with root package name */
    public w f65026i;

    /* renamed from: j, reason: collision with root package name */
    public m f65027j;

    /* renamed from: k, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f65028k;

    /* renamed from: l, reason: collision with root package name */
    public Mesh f65029l;

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<String> f65018a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<e> f65019b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c> f65020c = new com.badlogic.gdx.utils.a<>();

    /* renamed from: e, reason: collision with root package name */
    public final v f65022e = new v();

    /* renamed from: f, reason: collision with root package name */
    public final v f65023f = new v();

    /* renamed from: g, reason: collision with root package name */
    public final x f65024g = new x();

    /* renamed from: h, reason: collision with root package name */
    public final x f65025h = new x();

    /* renamed from: m, reason: collision with root package name */
    public final v f65030m = new v();

    /* renamed from: n, reason: collision with root package name */
    public final v f65031n = new v();

    /* renamed from: o, reason: collision with root package name */
    public x1.b f65032o = new x1.b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0747a implements c {
        @Override // k2.a.c
        public boolean a(a aVar, int i11) {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b implements c {
        @Override // k2.a.c
        public boolean a(a aVar, int i11) {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        boolean a(a aVar, int i11);

        void b(a aVar, int i11, i iVar, x1.b bVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        boolean a(a aVar, int i11, i iVar);
    }

    public int C0(d dVar) {
        return J0(dVar, null);
    }

    public int D(String str) {
        int i11 = this.f65018a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f65018a.get(i12).equals(str)) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean I(int i11) {
        if (i11 < 0) {
            return false;
        }
        int[] iArr = this.f65021d;
        return i11 < iArr.length && iArr[i11] >= 0;
    }

    public int J0(d dVar, c cVar) {
        return w0(dVar.f65033a, dVar, cVar);
    }

    @Override // x1.k
    public void M(i iVar) {
        if (iVar.f97047a.det3x3() == 0.0f) {
            return;
        }
        this.f65032o.clear();
        x1.c cVar = iVar.f97050d;
        if (cVar != null) {
            this.f65032o.u(cVar);
        }
        x1.d dVar = iVar.f97049c;
        if (dVar != null) {
            this.f65032o.u(dVar);
        }
        Q0(iVar, this.f65032o);
    }

    public void Q0(i iVar, x1.b bVar) {
        int i11 = 0;
        while (true) {
            v vVar = this.f65023f;
            if (i11 >= vVar.f1640b) {
                break;
            }
            com.badlogic.gdx.utils.a<c> aVar = this.f65020c;
            int m11 = vVar.m(i11);
            if (aVar.get(m11) != null) {
                this.f65020c.get(m11).b(this, m11, iVar, bVar);
            }
            i11++;
        }
        Mesh mesh = this.f65029l;
        if (mesh != iVar.f97048b.f7490e) {
            if (mesh != null) {
                mesh.V1(this.f65026i, this.f65030m.f1639a, this.f65031n.f1639a);
            }
            Mesh mesh2 = iVar.f97048b.f7490e;
            this.f65029l = mesh2;
            mesh2.o(this.f65026i, b(mesh2.r1()), o(iVar.f97048b.f7490e.m1()));
        }
        iVar.f97048b.c(this.f65026i, false);
    }

    public void R(w wVar, i iVar) {
        if (this.f65021d != null) {
            throw new GdxRuntimeException("Already initialized");
        }
        if (!wVar.q1()) {
            throw new GdxRuntimeException(wVar.f1());
        }
        this.f65026i = wVar;
        int i11 = this.f65018a.f13179b;
        this.f65021d = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            String str = this.f65018a.get(i12);
            e eVar = this.f65019b.get(i12);
            c cVar = this.f65020c.get(i12);
            if (eVar == null || eVar.a(this, i12, iVar)) {
                this.f65021d[i12] = wVar.J0(str, false);
                if (this.f65021d[i12] >= 0 && cVar != null) {
                    if (cVar.a(this, i12)) {
                        this.f65022e.a(i12);
                    } else {
                        this.f65023f.a(i12);
                    }
                }
            } else {
                this.f65021d[i12] = -1;
            }
            if (this.f65021d[i12] < 0) {
                this.f65019b.K(i12, null);
                this.f65020c.K(i12, null);
            }
        }
        if (iVar != null) {
            s r12 = iVar.f97048b.f7490e.r1();
            int size = r12.size();
            for (int i13 = 0; i13 < size; i13++) {
                r f11 = r12.f(i13);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    this.f65024g.q(f11.k(), V0);
                }
            }
            s m12 = iVar.f97048b.f7490e.m1();
            if (m12 != null) {
                int size2 = m12.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    r f12 = m12.f(i14);
                    int V02 = wVar.V0(f12.f12493f);
                    if (V02 >= 0) {
                        this.f65025h.q(f12.k(), V02);
                    }
                }
            }
        }
    }

    public final boolean V0(int i11, float f11) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.O1(i12, f11);
        return true;
    }

    public final int X(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int[] iArr = this.f65021d;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public int Z(String str) {
        return w0(str, null, null);
    }

    public final boolean a1(int i11, float f11, float f12) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.P1(i12, f11, f12);
        return true;
    }

    public final int[] b(s sVar) {
        this.f65030m.i();
        int size = sVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f65030m.a(this.f65024g.j(sVar.f(i11).k(), -1));
        }
        this.f65030m.I();
        return this.f65030m.f1639a;
    }

    public final boolean b1(int i11, float f11, float f12, float f13) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.Q1(i12, f11, f12, f13);
        return true;
    }

    public final boolean c1(int i11, float f11, float f12, float f13, float f14) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.R1(i12, f11, f12, f13, f14);
        return true;
    }

    public final boolean d1(int i11, int i12) {
        int i13 = this.f65021d[i11];
        if (i13 < 0) {
            return false;
        }
        this.f65026i.e2(i13, i12);
        return true;
    }

    @Override // a3.q
    public void dispose() {
        this.f65026i = null;
        this.f65018a.clear();
        this.f65019b.clear();
        this.f65020c.clear();
        this.f65023f.i();
        this.f65022e.i();
        this.f65021d = null;
    }

    public final boolean e1(int i11, int i12, int i13) {
        int i14 = this.f65021d[i11];
        if (i14 < 0) {
            return false;
        }
        this.f65026i.f2(i14, i12, i13);
        return true;
    }

    @Override // x1.k
    public void end() {
        Mesh mesh = this.f65029l;
        if (mesh != null) {
            mesh.V1(this.f65026i, this.f65030m.f1639a, this.f65031n.f1639a);
            this.f65029l = null;
        }
    }

    public final boolean f1(int i11, int i12, int i13, int i14) {
        int i15 = this.f65021d[i11];
        if (i15 < 0) {
            return false;
        }
        this.f65026i.g2(i15, i12, i13, i14);
        return true;
    }

    public final boolean g1(int i11, int i12, int i13, int i14, int i15) {
        int i16 = this.f65021d[i11];
        if (i16 < 0) {
            return false;
        }
        this.f65026i.h2(i16, i12, i13, i14, i15);
        return true;
    }

    public final boolean h1(int i11, com.badlogic.gdx.graphics.b bVar) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.S1(i12, bVar);
        return true;
    }

    public int i0(String str, c cVar) {
        return w0(str, null, cVar);
    }

    public final boolean i1(int i11, j jVar) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.e2(i12, this.f65027j.f69236a.a(jVar));
        return true;
    }

    public final boolean j1(int i11, Matrix3 matrix3) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.C1(i12, matrix3);
        return true;
    }

    public final boolean k1(int i11, Matrix4 matrix4) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.E1(i12, matrix4);
        return true;
    }

    public final boolean l1(int i11, Vector2 vector2) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.T1(i12, vector2);
        return true;
    }

    public final boolean m1(int i11, Vector3 vector3) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.U1(i12, vector3);
        return true;
    }

    public int n0(String str, e eVar) {
        return w0(str, eVar, null);
    }

    public final boolean n1(int i11, l2.r rVar) {
        int i12 = this.f65021d[i11];
        if (i12 < 0) {
            return false;
        }
        this.f65026i.e2(i12, this.f65027j.f69236a.e(rVar));
        return true;
    }

    public final int[] o(s sVar) {
        if (sVar == null) {
            return null;
        }
        this.f65031n.i();
        int size = sVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f65031n.a(this.f65025h.j(sVar.f(i11).k(), -1));
        }
        this.f65031n.I();
        return this.f65031n.f1639a;
    }

    public int w0(String str, e eVar, c cVar) {
        if (this.f65021d != null) {
            throw new GdxRuntimeException("Cannot register an uniform after initialization");
        }
        int D = D(str);
        if (D >= 0) {
            this.f65019b.K(D, eVar);
            this.f65020c.K(D, cVar);
            return D;
        }
        this.f65018a.a(str);
        this.f65019b.a(eVar);
        this.f65020c.a(cVar);
        return this.f65018a.f13179b - 1;
    }

    @Override // x1.k
    public void y0(com.badlogic.gdx.graphics.a aVar, m mVar) {
        this.f65028k = aVar;
        this.f65027j = mVar;
        this.f65026i.S();
        this.f65029l = null;
        int i11 = 0;
        while (true) {
            v vVar = this.f65022e;
            if (i11 >= vVar.f1640b) {
                return;
            }
            com.badlogic.gdx.utils.a<c> aVar2 = this.f65020c;
            int m11 = vVar.m(i11);
            if (aVar2.get(m11) != null) {
                this.f65020c.get(m11).b(this, m11, null, null);
            }
            i11++;
        }
    }

    public String z(int i11) {
        return this.f65018a.get(i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f65033a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65034b;

        /* renamed from: c, reason: collision with root package name */
        public final long f65035c;

        /* renamed from: d, reason: collision with root package name */
        public final long f65036d;

        public d(String str, long j11, long j12, long j13) {
            this.f65033a = str;
            this.f65034b = j11;
            this.f65035c = j12;
            this.f65036d = j13;
        }

        @Override // k2.a.e
        public boolean a(a aVar, int i11, i iVar) {
            x1.c cVar;
            x1.d dVar;
            long j11 = 0;
            long o11 = (iVar == null || (dVar = iVar.f97049c) == null) ? 0L : dVar.o();
            if (iVar != null && (cVar = iVar.f97050d) != null) {
                j11 = cVar.o();
            }
            long j12 = this.f65034b;
            if ((o11 & j12) != j12) {
                return false;
            }
            long j13 = this.f65035c;
            if ((j11 & j13) != j13) {
                return false;
            }
            long j14 = j11 | o11;
            long j15 = this.f65036d;
            return (j14 & j15) == j15;
        }

        public d(String str, long j11, long j12) {
            this(str, j11, j12, 0L);
        }

        public d(String str, long j11) {
            this(str, 0L, 0L, j11);
        }

        public d(String str) {
            this(str, 0L, 0L);
        }
    }
}
