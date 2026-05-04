package a40;

import a40.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicRef\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
/* loaded from: classes8.dex */
public final class j<T> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f1900c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<j<?>, Object> f1901d = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, yr.e.f100279a);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1902a;

    /* renamed from: b, reason: collision with root package name */
    public volatile T f1903b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public j(T t11, @m80.k m trace) {
        g0.p(trace, "trace");
        this.f1902a = trace;
        this.f1903b = t11;
    }

    public final boolean a(T t11, T t12) {
        m mVar;
        boolean a11 = androidx.concurrent.futures.a.a(f1901d, this, t11, t12);
        if (a11 && (mVar = this.f1902a) != m.a.f1932a) {
            mVar.a("CAS(" + t11 + j2.O + t12 + ')');
        }
        return a11;
    }

    public final T b(T t11) {
        T t12 = (T) f1901d.getAndSet(this, t11);
        m mVar = this.f1902a;
        if (mVar != m.a.f1932a) {
            mVar.a("getAndSet(" + t11 + "):" + t12);
        }
        return t12;
    }

    @m80.k
    public final m c() {
        return this.f1902a;
    }

    public final T d() {
        return this.f1903b;
    }

    @o00.f
    public final T e(Object obj, h10.n<?> property) {
        g0.p(property, "property");
        return d();
    }

    public final void f(T t11) {
        f1901d.lazySet(this, t11);
        m mVar = this.f1902a;
        if (mVar != m.a.f1932a) {
            mVar.a("lazySet(" + t11 + ')');
        }
    }

    public final void g(T t11) {
        this.f1903b = t11;
        m mVar = this.f1902a;
        if (mVar != m.a.f1932a) {
            mVar.a("set(" + t11 + ')');
        }
    }

    @o00.f
    public final void h(Object obj, h10.n<?> property, T t11) {
        g0.p(property, "property");
        g(t11);
    }

    @m80.k
    public String toString() {
        return String.valueOf(this.f1903b);
    }
}
