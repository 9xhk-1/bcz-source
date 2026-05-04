package y7;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f99486a;

    /* renamed from: b, reason: collision with root package name */
    public final long f99487b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f99488c;

    public g(long j11, long j12, @k String url) {
        g0.p(url, "url");
        this.f99486a = j11;
        this.f99487b = j12;
        this.f99488c = url;
    }

    public static /* synthetic */ g e(g gVar, long j11, long j12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = gVar.f99486a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = gVar.f99487b;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = gVar.f99488c;
        }
        return gVar.d(j13, j14, str);
    }

    public final long a() {
        return this.f99486a;
    }

    public final long b() {
        return this.f99487b;
    }

    @k
    public final String c() {
        return this.f99488c;
    }

    @k
    public final g d(long j11, long j12, @k String url) {
        g0.p(url, "url");
        return new g(j11, j12, url);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f99486a == gVar.f99486a && this.f99487b == gVar.f99487b && g0.g(this.f99488c, gVar.f99488c);
    }

    public final long f() {
        return this.f99486a;
    }

    public final long g() {
        return this.f99487b;
    }

    @k
    public final String h() {
        return this.f99488c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f99486a) * 31) + Long.hashCode(this.f99487b)) * 31) + this.f99488c.hashCode();
    }

    @k
    public String toString() {
        return "RetryParam(connectTimeOut=" + this.f99486a + ", readTimeOut=" + this.f99487b + ", url=" + this.f99488c + ')';
    }
}
