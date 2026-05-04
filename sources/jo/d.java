package jo;

import com.google.common.base.Preconditions;
import ho.b0;
import ho.d0;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f64453a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64454b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64455c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64456d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64457e;

    /* renamed from: f, reason: collision with root package name */
    public final long f64458f;

    public d(long hitCount, long missCount, long loadSuccessCount, long loadExceptionCount, long totalLoadTime, long evictionCount) {
        Preconditions.checkArgument(hitCount >= 0);
        Preconditions.checkArgument(missCount >= 0);
        Preconditions.checkArgument(loadSuccessCount >= 0);
        Preconditions.checkArgument(loadExceptionCount >= 0);
        Preconditions.checkArgument(totalLoadTime >= 0);
        Preconditions.checkArgument(evictionCount >= 0);
        this.f64453a = hitCount;
        this.f64454b = missCount;
        this.f64455c = loadSuccessCount;
        this.f64456d = loadExceptionCount;
        this.f64457e = totalLoadTime;
        this.f64458f = evictionCount;
    }

    public double a() {
        long x11 = com.google.common.math.h.x(this.f64455c, this.f64456d);
        if (x11 == 0) {
            return 0.0d;
        }
        return this.f64457e / x11;
    }

    public long b() {
        return this.f64458f;
    }

    public long c() {
        return this.f64453a;
    }

    public double d() {
        long m11 = m();
        if (m11 == 0) {
            return 1.0d;
        }
        return this.f64453a / m11;
    }

    public long e() {
        return com.google.common.math.h.x(this.f64455c, this.f64456d);
    }

    public boolean equals(@CheckForNull Object object) {
        if (object instanceof d) {
            d dVar = (d) object;
            if (this.f64453a == dVar.f64453a && this.f64454b == dVar.f64454b && this.f64455c == dVar.f64455c && this.f64456d == dVar.f64456d && this.f64457e == dVar.f64457e && this.f64458f == dVar.f64458f) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f64456d;
    }

    public double g() {
        long x11 = com.google.common.math.h.x(this.f64455c, this.f64456d);
        if (x11 == 0) {
            return 0.0d;
        }
        return this.f64456d / x11;
    }

    public long h() {
        return this.f64455c;
    }

    public int hashCode() {
        return d0.b(Long.valueOf(this.f64453a), Long.valueOf(this.f64454b), Long.valueOf(this.f64455c), Long.valueOf(this.f64456d), Long.valueOf(this.f64457e), Long.valueOf(this.f64458f));
    }

    public d i(d other) {
        return new d(Math.max(0L, com.google.common.math.h.A(this.f64453a, other.f64453a)), Math.max(0L, com.google.common.math.h.A(this.f64454b, other.f64454b)), Math.max(0L, com.google.common.math.h.A(this.f64455c, other.f64455c)), Math.max(0L, com.google.common.math.h.A(this.f64456d, other.f64456d)), Math.max(0L, com.google.common.math.h.A(this.f64457e, other.f64457e)), Math.max(0L, com.google.common.math.h.A(this.f64458f, other.f64458f)));
    }

    public long j() {
        return this.f64454b;
    }

    public double k() {
        long m11 = m();
        if (m11 == 0) {
            return 0.0d;
        }
        return this.f64454b / m11;
    }

    public d l(d other) {
        return new d(com.google.common.math.h.x(this.f64453a, other.f64453a), com.google.common.math.h.x(this.f64454b, other.f64454b), com.google.common.math.h.x(this.f64455c, other.f64455c), com.google.common.math.h.x(this.f64456d, other.f64456d), com.google.common.math.h.x(this.f64457e, other.f64457e), com.google.common.math.h.x(this.f64458f, other.f64458f));
    }

    public long m() {
        return com.google.common.math.h.x(this.f64453a, this.f64454b);
    }

    public long n() {
        return this.f64457e;
    }

    public String toString() {
        return b0.c(this).e("hitCount", this.f64453a).e("missCount", this.f64454b).e("loadSuccessCount", this.f64455c).e("loadExceptionCount", this.f64456d).e("totalLoadTime", this.f64457e).e("evictionCount", this.f64458f).toString();
    }
}
