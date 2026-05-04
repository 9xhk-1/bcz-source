package p2;

import a3.b1;
import a3.c1;
import com.badlogic.gdx.math.Vector2;
import q1.g;
import q1.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final c f78625a;

    /* renamed from: b, reason: collision with root package name */
    public float f78626b;

    /* renamed from: c, reason: collision with root package name */
    public float f78627c;

    /* renamed from: d, reason: collision with root package name */
    public long f78628d;

    /* renamed from: e, reason: collision with root package name */
    public float f78629e;

    /* renamed from: f, reason: collision with root package name */
    public long f78630f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f78631g;

    /* renamed from: h, reason: collision with root package name */
    public int f78632h;

    /* renamed from: i, reason: collision with root package name */
    public long f78633i;

    /* renamed from: j, reason: collision with root package name */
    public float f78634j;

    /* renamed from: k, reason: collision with root package name */
    public float f78635k;

    /* renamed from: l, reason: collision with root package name */
    public int f78636l;

    /* renamed from: m, reason: collision with root package name */
    public int f78637m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78638n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78639o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78640p;

    /* renamed from: q, reason: collision with root package name */
    public final d f78641q;

    /* renamed from: r, reason: collision with root package name */
    public float f78642r;

    /* renamed from: s, reason: collision with root package name */
    public float f78643s;

    /* renamed from: t, reason: collision with root package name */
    public long f78644t;

    /* renamed from: u, reason: collision with root package name */
    public Vector2 f78645u;

    /* renamed from: v, reason: collision with root package name */
    public final Vector2 f78646v;

    /* renamed from: w, reason: collision with root package name */
    public final Vector2 f78647w;

    /* renamed from: x, reason: collision with root package name */
    public final Vector2 f78648x;

    /* renamed from: y, reason: collision with root package name */
    public final c1.a f78649y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public class C0967a extends c1.a {
        public C0967a() {
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f78638n) {
                return;
            }
            c cVar = aVar.f78625a;
            Vector2 vector2 = aVar.f78645u;
            aVar.f78638n = cVar.e(vector2.f12535x, vector2.f12536y);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        boolean a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24);

        boolean b(float f11, float f12, int i11, int i12);

        boolean c(float f11, float f12, int i11, int i12);

        void d();

        boolean e(float f11, float f12);

        boolean f(float f11, float f12);

        boolean g(float f11, float f12, int i11);

        boolean h(float f11, float f12, int i11, int i12);

        boolean i(float f11, float f12, float f13, float f14);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: b, reason: collision with root package name */
        public float f78652b;

        /* renamed from: c, reason: collision with root package name */
        public float f78653c;

        /* renamed from: d, reason: collision with root package name */
        public float f78654d;

        /* renamed from: e, reason: collision with root package name */
        public float f78655e;

        /* renamed from: f, reason: collision with root package name */
        public long f78656f;

        /* renamed from: g, reason: collision with root package name */
        public int f78657g;

        /* renamed from: a, reason: collision with root package name */
        public int f78651a = 10;

        /* renamed from: h, reason: collision with root package name */
        public float[] f78658h = new float[10];

        /* renamed from: i, reason: collision with root package name */
        public float[] f78659i = new float[10];

        /* renamed from: j, reason: collision with root package name */
        public long[] f78660j = new long[10];

        public final float a(float[] fArr, int i11) {
            int min = Math.min(this.f78651a, i11);
            float f11 = 0.0f;
            for (int i12 = 0; i12 < min; i12++) {
                f11 += fArr[i12];
            }
            return f11 / min;
        }

        public final long b(long[] jArr, int i11) {
            int min = Math.min(this.f78651a, i11);
            long j11 = 0;
            for (int i12 = 0; i12 < min; i12++) {
                j11 += jArr[i12];
            }
            if (min == 0) {
                return 0L;
            }
            return j11 / min;
        }

        public final float c(float[] fArr, int i11) {
            int min = Math.min(this.f78651a, i11);
            float f11 = 0.0f;
            for (int i12 = 0; i12 < min; i12++) {
                f11 += fArr[i12];
            }
            if (min == 0) {
                return 0.0f;
            }
            return f11;
        }

        public float d() {
            float a11 = a(this.f78658h, this.f78657g);
            float b11 = b(this.f78660j, this.f78657g) / 1.0E9f;
            if (b11 == 0.0f) {
                return 0.0f;
            }
            return a11 / b11;
        }

        public float e() {
            float a11 = a(this.f78659i, this.f78657g);
            float b11 = b(this.f78660j, this.f78657g) / 1.0E9f;
            if (b11 == 0.0f) {
                return 0.0f;
            }
            return a11 / b11;
        }

        public void f(float f11, float f12, long j11) {
            this.f78652b = f11;
            this.f78653c = f12;
            this.f78654d = 0.0f;
            this.f78655e = 0.0f;
            this.f78657g = 0;
            for (int i11 = 0; i11 < this.f78651a; i11++) {
                this.f78658h[i11] = 0.0f;
                this.f78659i[i11] = 0.0f;
                this.f78660j[i11] = 0;
            }
            this.f78656f = j11;
        }

        public void g(float f11, float f12, long j11) {
            float f13 = f11 - this.f78652b;
            this.f78654d = f13;
            float f14 = f12 - this.f78653c;
            this.f78655e = f14;
            this.f78652b = f11;
            this.f78653c = f12;
            long j12 = j11 - this.f78656f;
            this.f78656f = j11;
            int i11 = this.f78657g;
            int i12 = i11 % this.f78651a;
            this.f78658h[i12] = f13;
            this.f78659i[i12] = f14;
            this.f78660j[i12] = j12;
            this.f78657g = i11 + 1;
        }
    }

    public a(c cVar) {
        this(20.0f, 0.4f, 1.1f, 2.14748365E9f, cVar);
    }

    public boolean C0() {
        return J0(this.f78629e);
    }

    @Override // q1.h, q1.k
    public boolean I(int i11, int i12, int i13) {
        return h1(i11, i12, i13);
    }

    public boolean J0(float f11) {
        return this.f78644t != 0 && b1.c() - this.f78644t > ((long) (f11 * 1.0E9f));
    }

    public boolean Q0() {
        return this.f78640p;
    }

    public final boolean V0(float f11, float f12, float f13, float f14) {
        return Math.abs(f11 - f13) < this.f78626b && Math.abs(f12 - f14) < this.f78627c;
    }

    public void a1() {
        this.f78649y.a();
        this.f78644t = 0L;
        this.f78640p = false;
        this.f78631g = false;
        this.f78641q.f78656f = 0L;
    }

    @Override // q1.h, q1.k
    public boolean b(int i11, int i12, int i13, int i14) {
        return i1(i11, i12, i13, i14);
    }

    public void b1(float f11) {
        this.f78629e = f11;
    }

    public void c1(long j11) {
        this.f78630f = j11;
    }

    public void d1(float f11) {
        this.f78628d = (long) (f11 * 1.0E9f);
    }

    public void e1(float f11, float f12) {
        this.f78626b = f11;
        this.f78627c = f12;
    }

    public void f1(float f11) {
        e1(f11, f11);
    }

    public boolean g1(float f11, float f12, int i11, int i12) {
        if (i11 > 1) {
            return false;
        }
        if (i11 == 0) {
            this.f78645u.set(f11, f12);
            long f13 = g.f81381d.f();
            this.f78644t = f13;
            this.f78641q.f(f11, f12, f13);
            if (g.f81381d.H(1)) {
                this.f78631g = false;
                this.f78639o = true;
                this.f78647w.set(this.f78645u);
                this.f78648x.set(this.f78646v);
                this.f78649y.a();
            } else {
                this.f78631g = true;
                this.f78639o = false;
                this.f78638n = false;
                this.f78642r = f11;
                this.f78643s = f12;
                if (!this.f78649y.c()) {
                    c1.h(this.f78649y, this.f78629e);
                }
            }
        } else {
            this.f78646v.set(f11, f12);
            this.f78631g = false;
            this.f78639o = true;
            this.f78647w.set(this.f78645u);
            this.f78648x.set(this.f78646v);
            this.f78649y.a();
        }
        return this.f78625a.c(f11, f12, i11, i12);
    }

    public boolean h1(float f11, float f12, int i11) {
        if (i11 > 1 || this.f78638n) {
            return false;
        }
        if (i11 == 0) {
            this.f78645u.set(f11, f12);
        } else {
            this.f78646v.set(f11, f12);
        }
        if (this.f78639o) {
            return this.f78625a.f(this.f78647w.dst(this.f78648x), this.f78645u.dst(this.f78646v)) || this.f78625a.a(this.f78647w, this.f78648x, this.f78645u, this.f78646v);
        }
        this.f78641q.g(f11, f12, g.f81381d.f());
        if (this.f78631g && !V0(f11, f12, this.f78642r, this.f78643s)) {
            this.f78649y.a();
            this.f78631g = false;
        }
        if (this.f78631g) {
            return false;
        }
        this.f78640p = true;
        c cVar = this.f78625a;
        d dVar = this.f78641q;
        return cVar.i(f11, f12, dVar.f78654d, dVar.f78655e);
    }

    public boolean i1(float f11, float f12, int i11, int i12) {
        if (i11 > 1) {
            return false;
        }
        if (this.f78631g && !V0(f11, f12, this.f78642r, this.f78643s)) {
            this.f78631g = false;
        }
        boolean z11 = this.f78640p;
        this.f78640p = false;
        this.f78649y.a();
        if (this.f78638n) {
            return false;
        }
        if (this.f78631g) {
            if (this.f78636l != i12 || this.f78637m != i11 || b1.c() - this.f78633i > this.f78628d || !V0(f11, f12, this.f78634j, this.f78635k)) {
                this.f78632h = 0;
            }
            this.f78632h++;
            this.f78633i = b1.c();
            this.f78634j = f11;
            this.f78635k = f12;
            this.f78636l = i12;
            this.f78637m = i11;
            this.f78644t = 0L;
            return this.f78625a.h(f11, f12, this.f78632h, i12);
        }
        if (!this.f78639o) {
            boolean b11 = (!z11 || this.f78640p) ? false : this.f78625a.b(f11, f12, i11, i12);
            long f13 = g.f81381d.f();
            if (f13 - this.f78644t <= this.f78630f) {
                this.f78641q.g(f11, f12, f13);
                b11 = this.f78625a.g(this.f78641q.d(), this.f78641q.e(), i12) || b11;
            }
            this.f78644t = 0L;
            return b11;
        }
        this.f78639o = false;
        this.f78625a.d();
        this.f78640p = true;
        if (i11 == 0) {
            d dVar = this.f78641q;
            Vector2 vector2 = this.f78646v;
            dVar.f(vector2.f12535x, vector2.f12536y, g.f81381d.f());
        } else {
            d dVar2 = this.f78641q;
            Vector2 vector22 = this.f78645u;
            dVar2.f(vector22.f12535x, vector22.f12536y, g.f81381d.f());
        }
        return false;
    }

    public void n0() {
        this.f78649y.a();
        this.f78638n = true;
    }

    @Override // q1.h, q1.k
    public boolean o(int i11, int i12, int i13, int i14) {
        return g1(i11, i12, i13, i14);
    }

    public void w0() {
        this.f78631g = false;
    }

    @Override // q1.h, q1.k
    public boolean z(int i11, int i12, int i13, int i14) {
        n0();
        return super.z(i11, i12, i13, i14);
    }

    public a(float f11, float f12, float f13, float f14, c cVar) {
        this(f11, f11, f12, f13, f14, cVar);
    }

    public a(float f11, float f12, float f13, float f14, float f15, c cVar) {
        this.f78641q = new d();
        this.f78645u = new Vector2();
        this.f78646v = new Vector2();
        this.f78647w = new Vector2();
        this.f78648x = new Vector2();
        this.f78649y = new C0967a();
        if (cVar != null) {
            this.f78626b = f11;
            this.f78627c = f12;
            this.f78628d = (long) (f13 * 1.0E9f);
            this.f78629e = f14;
            this.f78630f = (long) (f15 * 1.0E9f);
            this.f78625a = cVar;
            return;
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements c {
        @Override // p2.a.c
        public boolean a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
            return false;
        }

        @Override // p2.a.c
        public boolean b(float f11, float f12, int i11, int i12) {
            return false;
        }

        @Override // p2.a.c
        public boolean c(float f11, float f12, int i11, int i12) {
            return false;
        }

        @Override // p2.a.c
        public boolean e(float f11, float f12) {
            return false;
        }

        @Override // p2.a.c
        public boolean f(float f11, float f12) {
            return false;
        }

        @Override // p2.a.c
        public boolean g(float f11, float f12, int i11) {
            return false;
        }

        @Override // p2.a.c
        public boolean h(float f11, float f12, int i11, int i12) {
            return false;
        }

        @Override // p2.a.c
        public boolean i(float f11, float f12, float f13, float f14) {
            return false;
        }

        @Override // p2.a.c
        public void d() {
        }
    }
}
