package a40;

import a40.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicInt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f1890c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater<f> f1891d = AtomicIntegerFieldUpdater.newUpdater(f.class, yr.e.f100279a);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1892a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f1893b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public f(int i11, @m80.k m trace) {
        g0.p(trace, "trace");
        this.f1892a = trace;
        this.f1893b = i11;
    }

    public final int a(int i11) {
        int addAndGet = f1891d.addAndGet(this, i11);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("addAndGet(" + i11 + "):" + addAndGet);
        }
        return addAndGet;
    }

    public final boolean b(int i11, int i12) {
        m mVar;
        boolean compareAndSet = f1891d.compareAndSet(this, i11, i12);
        if (compareAndSet && (mVar = this.f1892a) != m.a.f1932a) {
            mVar.a("CAS(" + i11 + j2.O + i12 + ')');
        }
        return compareAndSet;
    }

    public final int c() {
        int decrementAndGet = f1891d.decrementAndGet(this);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("decAndGet():" + decrementAndGet);
        }
        return decrementAndGet;
    }

    public final int d(int i11) {
        int andAdd = f1891d.getAndAdd(this, i11);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndAdd(" + i11 + "):" + andAdd);
        }
        return andAdd;
    }

    public final int e() {
        int andDecrement = f1891d.getAndDecrement(this);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndDec():" + andDecrement);
        }
        return andDecrement;
    }

    public final int f() {
        int andIncrement = f1891d.getAndIncrement(this);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndInc():" + andIncrement);
        }
        return andIncrement;
    }

    public final int g(int i11) {
        int andSet = f1891d.getAndSet(this, i11);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndSet(" + i11 + "):" + andSet);
        }
        return andSet;
    }

    @m80.k
    public final m h() {
        return this.f1892a;
    }

    public final int i() {
        return this.f1893b;
    }

    @o00.f
    public final int j(Object obj, h10.n<?> property) {
        g0.p(property, "property");
        return i();
    }

    public final int k() {
        int incrementAndGet = f1891d.incrementAndGet(this);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("incAndGet():" + incrementAndGet);
        }
        return incrementAndGet;
    }

    public final void l(int i11) {
        f1891d.lazySet(this, i11);
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("lazySet(" + i11 + ')');
        }
    }

    public final void m(int i11) {
        d(-i11);
    }

    public final void n(int i11) {
        d(i11);
    }

    public final void o(int i11) {
        this.f1893b = i11;
        m mVar = this.f1892a;
        if (mVar != m.a.f1932a) {
            mVar.a("set(" + i11 + ')');
        }
    }

    @o00.f
    public final void p(Object obj, h10.n<?> property, int i11) {
        g0.p(property, "property");
        o(i11);
    }

    @m80.k
    public String toString() {
        return String.valueOf(this.f1893b);
    }
}
