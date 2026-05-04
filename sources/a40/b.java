package a40;

import a40.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicBoolean\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f1885c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater<b> f1886d = AtomicIntegerFieldUpdater.newUpdater(b.class, yr.e.f100279a);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1887a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f1888b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public b(boolean z11, @m80.k m trace) {
        g0.p(trace, "trace");
        this.f1887a = trace;
        this.f1888b = z11 ? 1 : 0;
    }

    public final boolean a(boolean z11, boolean z12) {
        m mVar;
        boolean compareAndSet = f1886d.compareAndSet(this, z11 ? 1 : 0, z12 ? 1 : 0);
        if (compareAndSet && (mVar = this.f1887a) != m.a.f1932a) {
            mVar.a("CAS(" + z11 + j2.O + z12 + ')');
        }
        return compareAndSet;
    }

    public final boolean b(boolean z11) {
        int andSet = f1886d.getAndSet(this, z11 ? 1 : 0);
        m mVar = this.f1887a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndSet(" + z11 + "):" + andSet);
        }
        return andSet == 1;
    }

    @m80.k
    public final m c() {
        return this.f1887a;
    }

    public final boolean d() {
        return this.f1888b != 0;
    }

    @o00.f
    public final boolean e(Object obj, h10.n<?> property) {
        g0.p(property, "property");
        return d();
    }

    public final void f(boolean z11) {
        f1886d.lazySet(this, z11 ? 1 : 0);
        m mVar = this.f1887a;
        if (mVar != m.a.f1932a) {
            mVar.a("lazySet(" + z11 + ')');
        }
    }

    @o00.f
    public final void g(Object obj, h10.n<?> property, boolean z11) {
        g0.p(property, "property");
        h(z11);
    }

    public final void h(boolean z11) {
        this.f1888b = z11 ? 1 : 0;
        m mVar = this.f1887a;
        if (mVar != m.a.f1932a) {
            mVar.a("set(" + z11 + ')');
        }
    }

    @m80.k
    public String toString() {
        return String.valueOf(d());
    }
}
