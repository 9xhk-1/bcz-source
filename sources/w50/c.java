package w50;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.n;
import u30.f0;
import u50.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f95327c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final okhttp3.l f95328a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final n f95329b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final boolean a(@k n response, @k okhttp3.l request) {
            g0.p(response, "response");
            g0.p(request, "request");
            int Z = response.Z();
            if (Z != 200 && Z != 410 && Z != 414 && Z != 501 && Z != 203 && Z != 204) {
                if (Z != 307) {
                    if (Z != 308 && Z != 404 && Z != 405) {
                        switch (Z) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (n.h0(response, "Expires", null, 2, null) == null && response.S().n() == -1 && !response.S().m() && !response.S().l()) {
                    return false;
                }
            }
            return (response.S().s() || request.g().s()) ? false : true;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f95330a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final okhttp3.l f95331b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final n f95332c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Date f95333d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f95334e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public Date f95335f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public String f95336g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public Date f95337h;

        /* renamed from: i, reason: collision with root package name */
        public long f95338i;

        /* renamed from: j, reason: collision with root package name */
        public long f95339j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public String f95340k;

        /* renamed from: l, reason: collision with root package name */
        public int f95341l;

        public b(long j11, @k okhttp3.l request, @l n nVar) {
            g0.p(request, "request");
            this.f95330a = j11;
            this.f95331b = request;
            this.f95332c = nVar;
            this.f95341l = -1;
            if (nVar != null) {
                this.f95338i = nVar.C0();
                this.f95339j = nVar.z0();
                h k02 = nVar.k0();
                int size = k02.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String h11 = k02.h(i11);
                    String o11 = k02.o(i11);
                    if (f0.c2(h11, "Date", true)) {
                        this.f95333d = a60.c.a(o11);
                        this.f95334e = o11;
                    } else if (f0.c2(h11, "Expires", true)) {
                        this.f95337h = a60.c.a(o11);
                    } else if (f0.c2(h11, "Last-Modified", true)) {
                        this.f95335f = a60.c.a(o11);
                        this.f95336g = o11;
                    } else if (f0.c2(h11, "ETag", true)) {
                        this.f95340k = o11;
                    } else if (f0.c2(h11, "Age", true)) {
                        this.f95341l = f.k0(o11, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f95333d;
            long max = date != null ? Math.max(0L, this.f95339j - date.getTime()) : 0L;
            int i11 = this.f95341l;
            if (i11 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i11));
            }
            long j11 = this.f95339j;
            return max + (j11 - this.f95338i) + (this.f95330a - j11);
        }

        @k
        public final c b() {
            c c11 = c();
            return (c11.b() == null || !this.f95331b.g().u()) ? c11 : new c(null, null);
        }

        public final c c() {
            String str;
            if (this.f95332c == null) {
                return new c(this.f95331b, null);
            }
            if (this.f95331b.l() && this.f95332c.c0() == null) {
                return new c(this.f95331b, null);
            }
            if (!c.f95327c.a(this.f95332c, this.f95331b)) {
                return new c(this.f95331b, null);
            }
            okhttp3.c g11 = this.f95331b.g();
            if (g11.r() || f(this.f95331b)) {
                return new c(this.f95331b, null);
            }
            okhttp3.c S = this.f95332c.S();
            long a11 = a();
            long d11 = d();
            if (g11.n() != -1) {
                d11 = Math.min(d11, TimeUnit.SECONDS.toMillis(g11.n()));
            }
            long j11 = 0;
            long millis = g11.p() != -1 ? TimeUnit.SECONDS.toMillis(g11.p()) : 0L;
            if (!S.q() && g11.o() != -1) {
                j11 = TimeUnit.SECONDS.toMillis(g11.o());
            }
            if (!S.r()) {
                long j12 = millis + a11;
                if (j12 < j11 + d11) {
                    n.a v02 = this.f95332c.v0();
                    if (j12 >= d11) {
                        v02.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a11 > 86400000 && g()) {
                        v02.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, v02.c());
                }
            }
            String str2 = this.f95340k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f95335f != null) {
                    str2 = this.f95336g;
                } else {
                    if (this.f95333d == null) {
                        return new c(this.f95331b, null);
                    }
                    str2 = this.f95334e;
                }
                str = "If-Modified-Since";
            }
            h.a k11 = this.f95331b.k().k();
            g0.m(str2);
            k11.g(str, str2);
            return new c(this.f95331b.n().o(k11.i()).b(), this.f95332c);
        }

        public final long d() {
            n nVar = this.f95332c;
            g0.m(nVar);
            if (nVar.S().n() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.n());
            }
            Date date = this.f95337h;
            if (date != null) {
                Date date2 = this.f95333d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f95339j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f95335f != null && this.f95332c.A0().q().O() == null) {
                Date date3 = this.f95333d;
                long time2 = date3 != null ? date3.getTime() : this.f95338i;
                Date date4 = this.f95335f;
                g0.m(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        @k
        public final okhttp3.l e() {
            return this.f95331b;
        }

        public final boolean f(okhttp3.l lVar) {
            return (lVar.i("If-Modified-Since") == null && lVar.i("If-None-Match") == null) ? false : true;
        }

        public final boolean g() {
            n nVar = this.f95332c;
            g0.m(nVar);
            return nVar.S().n() == -1 && this.f95337h == null;
        }
    }

    public c(@l okhttp3.l lVar, @l n nVar) {
        this.f95328a = lVar;
        this.f95329b = nVar;
    }

    @l
    public final n a() {
        return this.f95329b;
    }

    @l
    public final okhttp3.l b() {
        return this.f95328a;
    }
}
