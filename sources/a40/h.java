package a40;

import a40.m;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicLong\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f1895c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater<h> f1896d = AtomicLongFieldUpdater.newUpdater(h.class, yr.e.f100279a);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1897a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f1898b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public h(long j11, @m80.k m trace) {
        g0.p(trace, "trace");
        this.f1897a = trace;
        this.f1898b = j11;
    }

    public final long a(long j11) {
        long addAndGet = f1896d.addAndGet(this, j11);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("addAndGet(" + j11 + "):" + addAndGet);
        }
        return addAndGet;
    }

    public final boolean b(long j11, long j12) {
        m mVar;
        boolean compareAndSet = f1896d.compareAndSet(this, j11, j12);
        if (compareAndSet && (mVar = this.f1897a) != m.a.f1932a) {
            mVar.a("CAS(" + j11 + j2.O + j12 + ')');
        }
        return compareAndSet;
    }

    public final long c() {
        long decrementAndGet = f1896d.decrementAndGet(this);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("decAndGet():" + decrementAndGet);
        }
        return decrementAndGet;
    }

    public final long d(long j11) {
        long andAdd = f1896d.getAndAdd(this, j11);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndAdd(" + j11 + "):" + andAdd);
        }
        return andAdd;
    }

    public final long e() {
        long andDecrement = f1896d.getAndDecrement(this);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndDec():" + andDecrement);
        }
        return andDecrement;
    }

    public final long f() {
        long andIncrement = f1896d.getAndIncrement(this);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndInc():" + andIncrement);
        }
        return andIncrement;
    }

    public final long g(long j11) {
        long andSet = f1896d.getAndSet(this, j11);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndSet(" + j11 + "):" + andSet);
        }
        return andSet;
    }

    @m80.k
    public final m h() {
        return this.f1897a;
    }

    public final long i() {
        return this.f1898b;
    }

    @o00.f
    public final long j(Object obj, h10.n<?> property) {
        g0.p(property, "property");
        return i();
    }

    public final long k() {
        long incrementAndGet = f1896d.incrementAndGet(this);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("incAndGet():" + incrementAndGet);
        }
        return incrementAndGet;
    }

    public final void l(long j11) {
        f1896d.lazySet(this, j11);
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("lazySet(" + j11 + ')');
        }
    }

    public final void m(long j11) {
        d(-j11);
    }

    public final void n(long j11) {
        d(j11);
    }

    public final void o(long j11) {
        this.f1898b = j11;
        m mVar = this.f1897a;
        if (mVar != m.a.f1932a) {
            mVar.a("set(" + j11 + ')');
        }
    }

    @o00.f
    public final void p(Object obj, h10.n<?> property, long j11) {
        g0.p(property, "property");
        o(j11);
    }

    @m80.k
    public String toString() {
        return String.valueOf(this.f1898b);
    }
}
