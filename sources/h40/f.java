package h40;

import h40.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class f<N extends f<N>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58194a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58195b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public f(@m80.l N n11) {
        this._prev$volatile = n11;
    }

    private final /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    public final void c() {
        f58195b.set(this, null);
    }

    public final N d() {
        N h11 = h();
        while (h11 != null && h11.m()) {
            h11 = (N) f58195b.get(h11);
        }
        return h11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [h40.f] */
    public final N e() {
        ?? f11;
        N f12 = f();
        kotlin.jvm.internal.g0.m(f12);
        while (f12.m() && (f11 = f12.f()) != 0) {
            f12 = f11;
        }
        return f12;
    }

    @m80.l
    public final N f() {
        Object g11 = g();
        if (g11 == e.f58192b) {
            return null;
        }
        return (N) g11;
    }

    public final Object g() {
        return f58194a.get(this);
    }

    @m80.l
    public final N h() {
        return (N) f58195b.get(this);
    }

    public final /* synthetic */ Object i() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object k() {
        return this._prev$volatile;
    }

    public abstract boolean m();

    public final boolean n() {
        return f() == null;
    }

    public final boolean o() {
        return androidx.concurrent.futures.a.a(f58194a, this, null, e.f58192b);
    }

    @m80.l
    public final N p(@m80.k x00.a aVar) {
        Object g11 = g();
        if (g11 != e.f58192b) {
            return (N) g11;
        }
        aVar.invoke();
        throw new KotlinNothingValueException();
    }

    public final void q() {
        Object obj;
        if (n()) {
            return;
        }
        while (true) {
            N d11 = d();
            N e11 = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58195b;
            do {
                obj = atomicReferenceFieldUpdater.get(e11);
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, e11, obj, ((f) obj) == null ? null : d11));
            if (d11 != null) {
                f58194a.set(d11, e11);
            }
            if (!e11.m() || e11.n()) {
                if (d11 == null || !d11.m()) {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void r(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void s(Object obj) {
        this._prev$volatile = obj;
    }

    public final boolean t(@m80.k N n11) {
        return androidx.concurrent.futures.a.a(f58194a, this, null, n11);
    }
}
