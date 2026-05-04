package n0;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.n;
import u0.z;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f73937c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final okhttp3.l f73938a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final n0.a f73939b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final h a(@k h hVar, @k h hVar2) {
            h.a aVar = new h.a();
            int size = hVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String h11 = hVar.h(i11);
                String o11 = hVar.o(i11);
                if ((!f0.c2("Warning", h11, true) || !f0.J2(o11, "1", false, 2, null)) && (d(h11) || !e(h11) || hVar2.d(h11) == null)) {
                    aVar.h(h11, o11);
                }
            }
            int size2 = hVar2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String h12 = hVar2.h(i12);
                if (!d(h12) && e(h12)) {
                    aVar.h(h12, hVar2.o(i12));
                }
            }
            return aVar.i();
        }

        public final boolean b(@k okhttp3.l lVar, @k n0.a aVar) {
            return (lVar.g().s() || aVar.a().s() || g0.g(aVar.d().d("Vary"), "*")) ? false : true;
        }

        public final boolean c(@k okhttp3.l lVar, @k n nVar) {
            return (lVar.g().s() || nVar.S().s() || g0.g(nVar.k0().d("Vary"), "*")) ? false : true;
        }

        public final boolean d(String str) {
            return f0.c2("Content-Length", str, true) || f0.c2("Content-Encoding", str, true) || f0.c2("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return (f0.c2("Connection", str, true) || f0.c2("Keep-Alive", str, true) || f0.c2("Proxy-Authenticate", str, true) || f0.c2("Proxy-Authorization", str, true) || f0.c2("TE", str, true) || f0.c2("Trailers", str, true) || f0.c2("Transfer-Encoding", str, true) || f0.c2("Upgrade", str, true)) ? false : true;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: n0.b$b, reason: collision with other inner class name */
    public static final class C0897b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final okhttp3.l f73940a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final n0.a f73941b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Date f73942c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f73943d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public Date f73944e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public String f73945f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Date f73946g;

        /* renamed from: h, reason: collision with root package name */
        public long f73947h;

        /* renamed from: i, reason: collision with root package name */
        public long f73948i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public String f73949j;

        /* renamed from: k, reason: collision with root package name */
        public int f73950k;

        public C0897b(@k okhttp3.l lVar, @l n0.a aVar) {
            this.f73940a = lVar;
            this.f73941b = aVar;
            this.f73950k = -1;
            if (aVar != null) {
                this.f73947h = aVar.e();
                this.f73948i = aVar.c();
                h d11 = aVar.d();
                int size = d11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String h11 = d11.h(i11);
                    if (f0.c2(h11, "Date", true)) {
                        this.f73942c = d11.f("Date");
                        this.f73943d = d11.o(i11);
                    } else if (f0.c2(h11, "Expires", true)) {
                        this.f73946g = d11.f("Expires");
                    } else if (f0.c2(h11, "Last-Modified", true)) {
                        this.f73944e = d11.f("Last-Modified");
                        this.f73945f = d11.o(i11);
                    } else if (f0.c2(h11, "ETag", true)) {
                        this.f73949j = d11.o(i11);
                    } else if (f0.c2(h11, "Age", true)) {
                        this.f73950k = u0.l.I(d11.o(i11), -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f73942c;
            long max = date != null ? Math.max(0L, this.f73948i - date.getTime()) : 0L;
            int i11 = this.f73950k;
            if (i11 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i11));
            }
            return max + (this.f73948i - this.f73947h) + (z.f91501a.a() - this.f73948i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public final b b() {
            String str;
            n0.a aVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.f73941b == null) {
                return new b(this.f73940a, aVar, objArr12 == true ? 1 : 0);
            }
            if (this.f73940a.l() && !this.f73941b.f()) {
                return new b(this.f73940a, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            okhttp3.c a11 = this.f73941b.a();
            if (!b.f73937c.b(this.f73940a, this.f73941b)) {
                return new b(this.f73940a, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            okhttp3.c g11 = this.f73940a.g();
            if (g11.r() || d(this.f73940a)) {
                return new b(this.f73940a, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long a12 = a();
            long c11 = c();
            if (g11.n() != -1) {
                c11 = Math.min(c11, TimeUnit.SECONDS.toMillis(g11.n()));
            }
            long j11 = 0;
            long millis = g11.p() != -1 ? TimeUnit.SECONDS.toMillis(g11.p()) : 0L;
            if (!a11.q() && g11.o() != -1) {
                j11 = TimeUnit.SECONDS.toMillis(g11.o());
            }
            if (!a11.r() && a12 + millis < c11 + j11) {
                return new b(objArr7 == true ? 1 : 0, this.f73941b, objArr6 == true ? 1 : 0);
            }
            String str2 = this.f73949j;
            if (str2 != null) {
                g0.m(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f73944e != null) {
                    str2 = this.f73945f;
                    g0.m(str2);
                } else {
                    if (this.f73942c == null) {
                        return new b(this.f73940a, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    str2 = this.f73943d;
                    g0.m(str2);
                }
            }
            return new b(this.f73940a.n().a(str, str2).b(), this.f73941b, objArr5 == true ? 1 : 0);
        }

        public final long c() {
            n0.a aVar = this.f73941b;
            g0.m(aVar);
            if (aVar.a().n() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.n());
            }
            Date date = this.f73946g;
            if (date != null) {
                Date date2 = this.f73942c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f73948i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f73944e != null && this.f73940a.q().O() == null) {
                Date date3 = this.f73942c;
                long time2 = date3 != null ? date3.getTime() : this.f73947h;
                Date date4 = this.f73944e;
                g0.m(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        public final boolean d(okhttp3.l lVar) {
            return (lVar.i("If-Modified-Since") == null && lVar.i("If-None-Match") == null) ? false : true;
        }
    }

    public /* synthetic */ b(okhttp3.l lVar, n0.a aVar, v vVar) {
        this(lVar, aVar);
    }

    @l
    public final n0.a a() {
        return this.f73939b;
    }

    @l
    public final okhttp3.l b() {
        return this.f73938a;
    }

    public b(okhttp3.l lVar, n0.a aVar) {
        this.f73938a = lVar;
        this.f73939b = aVar;
    }
}
