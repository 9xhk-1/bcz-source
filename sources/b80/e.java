package b80;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public abstract class e<T, C> {

    /* renamed from: a, reason: collision with root package name */
    public final String f6440a;

    /* renamed from: b, reason: collision with root package name */
    public final T f6441b;

    /* renamed from: c, reason: collision with root package name */
    public final C f6442c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6443d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6444e;

    /* renamed from: f, reason: collision with root package name */
    public long f6445f;

    /* renamed from: g, reason: collision with root package name */
    public long f6446g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Object f6447h;

    public e(String str, T t11, C c11, long j11, TimeUnit timeUnit) {
        e80.a.j(t11, "Route");
        e80.a.j(c11, "Connection");
        e80.a.j(timeUnit, "Time unit");
        this.f6440a = str;
        this.f6441b = t11;
        this.f6442c = c11;
        long currentTimeMillis = System.currentTimeMillis();
        this.f6443d = currentTimeMillis;
        this.f6445f = currentTimeMillis;
        if (j11 > 0) {
            long millis = currentTimeMillis + timeUnit.toMillis(j11);
            this.f6444e = millis > 0 ? millis : Long.MAX_VALUE;
        } else {
            this.f6444e = Long.MAX_VALUE;
        }
        this.f6446g = this.f6444e;
    }

    public abstract void a();

    public C b() {
        return this.f6442c;
    }

    public long c() {
        return this.f6443d;
    }

    public synchronized long d() {
        return this.f6446g;
    }

    public String e() {
        return this.f6440a;
    }

    public T f() {
        return this.f6441b;
    }

    public Object g() {
        return this.f6447h;
    }

    public synchronized long h() {
        return this.f6445f;
    }

    @Deprecated
    public long i() {
        return this.f6444e;
    }

    public long j() {
        return this.f6444e;
    }

    public abstract boolean k();

    public synchronized boolean l(long j11) {
        return j11 >= this.f6446g;
    }

    public void m(Object obj) {
        this.f6447h = obj;
    }

    public synchronized void n(long j11, TimeUnit timeUnit) {
        try {
            e80.a.j(timeUnit, "Time unit");
            long currentTimeMillis = System.currentTimeMillis();
            this.f6445f = currentTimeMillis;
            this.f6446g = Math.min(j11 > 0 ? currentTimeMillis + timeUnit.toMillis(j11) : Long.MAX_VALUE, this.f6444e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        return "[id:" + this.f6440a + "][route:" + this.f6441b + "][state:" + this.f6447h + "]";
    }

    public e(String str, T t11, C c11) {
        this(str, t11, c11, 0L, TimeUnit.MILLISECONDS);
    }
}
