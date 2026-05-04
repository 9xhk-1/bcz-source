package l60;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.time.DurationUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
/* loaded from: classes8.dex */
public class i1 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f70437e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i1 f70438f = new a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f70439a;

    /* renamed from: b, reason: collision with root package name */
    public long f70440b;

    /* renamed from: c, reason: collision with root package name */
    public long f70441c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public volatile Object f70442d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final long a(long j11, long j12) {
            return (j11 != 0 && (j12 == 0 || j11 < j12)) ? j11 : j12;
        }

        @m80.k
        public final i1 b(@m80.k i1 i1Var, long j11, @m80.k DurationUnit unit) {
            kotlin.jvm.internal.g0.p(i1Var, "<this>");
            kotlin.jvm.internal.g0.p(unit, "unit");
            return i1Var.k(j11, w30.f.e(unit));
        }

        @m80.k
        public final i1 c(@m80.k i1 timeout, long j11) {
            kotlin.jvm.internal.g0.p(timeout, "$this$timeout");
            return timeout.k(kotlin.time.e.z(j11), TimeUnit.NANOSECONDS);
        }

        public b() {
        }
    }

    public void a(@m80.k Condition condition) throws InterruptedIOException {
        kotlin.jvm.internal.g0.p(condition, "condition");
        try {
            boolean h11 = h();
            long l11 = l();
            if (!h11 && l11 == 0) {
                condition.await();
                return;
            }
            if (h11 && l11 != 0) {
                l11 = Math.min(l11, f() - System.nanoTime());
            } else if (h11) {
                l11 = f() - System.nanoTime();
            }
            if (l11 <= 0) {
                throw new InterruptedIOException(com.alipay.sdk.m.m.a.f10784h0);
            }
            Object obj = this.f70442d;
            if (condition.awaitNanos(l11) <= 0 && this.f70442d == obj) {
                throw new InterruptedIOException(com.alipay.sdk.m.m.a.f10784h0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void b() {
        this.f70442d = new Object();
    }

    @m80.k
    public i1 c() {
        this.f70439a = false;
        return this;
    }

    @m80.k
    public i1 d() {
        this.f70441c = 0L;
        return this;
    }

    @m80.k
    public final i1 e(long j11, @m80.k TimeUnit unit) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        if (j11 > 0) {
            return g(System.nanoTime() + unit.toNanos(j11));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j11).toString());
    }

    public long f() {
        if (this.f70439a) {
            return this.f70440b;
        }
        throw new IllegalStateException("No deadline");
    }

    @m80.k
    public i1 g(long j11) {
        this.f70439a = true;
        this.f70440b = j11;
        return this;
    }

    public boolean h() {
        return this.f70439a;
    }

    public final <T> T i(@m80.k i1 other, @m80.k x00.a<? extends T> block) {
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(block, "block");
        long l11 = l();
        long a11 = f70437e.a(other.l(), l());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        k(a11, timeUnit);
        if (!h()) {
            if (other.h()) {
                g(other.f());
            }
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.d0.d(1);
                k(l11, timeUnit);
                if (other.h()) {
                    c();
                }
                kotlin.jvm.internal.d0.c(1);
                return invoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                k(l11, TimeUnit.NANOSECONDS);
                if (other.h()) {
                    c();
                }
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
        long f11 = f();
        if (other.h()) {
            g(Math.min(f(), other.f()));
        }
        try {
            T invoke2 = block.invoke();
            kotlin.jvm.internal.d0.d(1);
            k(l11, timeUnit);
            if (other.h()) {
                g(f11);
            }
            kotlin.jvm.internal.d0.c(1);
            return invoke2;
        } catch (Throwable th3) {
            kotlin.jvm.internal.d0.d(1);
            k(l11, TimeUnit.NANOSECONDS);
            if (other.h()) {
                g(f11);
            }
            kotlin.jvm.internal.d0.c(1);
            throw th3;
        }
    }

    public void j() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f70439a && this.f70440b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @m80.k
    public i1 k(long j11, @m80.k TimeUnit unit) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        if (j11 >= 0) {
            this.f70441c = unit.toNanos(j11);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j11).toString());
    }

    public long l() {
        return this.f70441c;
    }

    public void m(@m80.k Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        try {
            boolean h11 = h();
            long l11 = l();
            if (!h11 && l11 == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (h11 && l11 != 0) {
                l11 = Math.min(l11, f() - nanoTime);
            } else if (h11) {
                l11 = f() - nanoTime;
            }
            if (l11 <= 0) {
                throw new InterruptedIOException(com.alipay.sdk.m.m.a.f10784h0);
            }
            Object obj = this.f70442d;
            long j11 = l11 / 1000000;
            monitor.wait(j11, (int) (l11 - (1000000 * j11)));
            if (System.nanoTime() - nanoTime >= l11 && this.f70442d == obj) {
                throw new InterruptedIOException(com.alipay.sdk.m.m.a.f10784h0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends i1 {
        @Override // l60.i1
        public i1 k(long j11, TimeUnit unit) {
            kotlin.jvm.internal.g0.p(unit, "unit");
            return this;
        }

        @Override // l60.i1
        public void j() {
        }

        @Override // l60.i1
        public i1 g(long j11) {
            return this;
        }
    }
}
