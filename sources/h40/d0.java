package h40;

import c40.g2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
@kotlin.jvm.internal.u0({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
/* loaded from: classes8.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58188a = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58189b = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58190c = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final /* synthetic */ Object m() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object o() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, yz.g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void x(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void y(Object obj) {
        this._prev$volatile = obj;
    }

    public final boolean b(@m80.k d0 d0Var, int i11) {
        d0 l11;
        do {
            l11 = l();
            if (l11 instanceof z) {
                return (((z) l11).f58294d & i11) == 0 && l11.b(d0Var, i11);
            }
        } while (!l11.c(d0Var, this));
        return true;
    }

    @yz.v0
    public final boolean c(@m80.k d0 d0Var, @m80.k d0 d0Var2) {
        f58189b.set(d0Var, this);
        f58188a.set(d0Var, d0Var2);
        if (!androidx.concurrent.futures.a.a(f58188a, this, d0Var2, d0Var)) {
            return false;
        }
        d0Var.i(d0Var2);
        return true;
    }

    public final boolean d(@m80.k d0 d0Var) {
        f58189b.set(d0Var, this);
        f58188a.set(d0Var, this);
        while (j() == this) {
            if (androidx.concurrent.futures.a.a(f58188a, this, this, d0Var)) {
                d0Var.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i11) {
        b(new z(i11), i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.a.a(h40.d0.f58188a, r3, r2, ((h40.r0) r4).f58267a) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0025, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h40.d0 g() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p()
            java.lang.Object r0 = r0.get(r7)
            h40.d0 r0 = (h40.d0) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p()
            boolean r0 = androidx.concurrent.futures.a.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.s()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof h40.r0
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n()
            h40.r0 r4 = (h40.r0) r4
            h40.d0 r4 = r4.f58267a
            boolean r2 = androidx.concurrent.futures.a.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p()
            java.lang.Object r2 = r4.get(r2)
            h40.d0 r2 = (h40.d0) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.g0.n(r4, r3)
            r3 = r4
            h40.d0 r3 = (h40.d0) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: h40.d0.g():h40.d0");
    }

    public final d0 h(d0 d0Var) {
        while (d0Var.s()) {
            d0Var = (d0) f58189b.get(d0Var);
        }
        return d0Var;
    }

    public final void i(d0 d0Var) {
        d0 d0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58189b;
        do {
            d0Var2 = (d0) atomicReferenceFieldUpdater.get(d0Var);
            if (j() != d0Var) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f58189b, d0Var, d0Var2, this));
        if (s()) {
            d0Var.g();
        }
    }

    @m80.k
    public final Object j() {
        return f58188a.get(this);
    }

    @m80.k
    public final d0 k() {
        d0 d0Var;
        Object j11 = j();
        r0 r0Var = j11 instanceof r0 ? (r0) j11 : null;
        if (r0Var != null && (d0Var = r0Var.f58267a) != null) {
            return d0Var;
        }
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (d0) j11;
    }

    @m80.k
    public final d0 l() {
        d0 g11 = g();
        return g11 == null ? h((d0) f58189b.get(this)) : g11;
    }

    public final /* synthetic */ Object q() {
        return this._removedRef$volatile;
    }

    public boolean s() {
        return j() instanceof r0;
    }

    @m80.k
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: h40.d0.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
            public Object get() {
                return c40.u0.a(this.receiver);
            }
        } + '@' + c40.u0.b(this);
    }

    public boolean u() {
        return v() == null;
    }

    @m80.l
    @yz.v0
    public final d0 v() {
        Object j11;
        d0 d0Var;
        do {
            j11 = j();
            if (j11 instanceof r0) {
                return ((r0) j11).f58267a;
            }
            if (j11 == this) {
                return (d0) j11;
            }
            kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            d0Var = (d0) j11;
        } while (!androidx.concurrent.futures.a.a(f58188a, this, j11, d0Var.w()));
        d0Var.g();
        return null;
    }

    public final r0 w() {
        r0 r0Var = (r0) f58190c.get(this);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this);
        f58190c.set(this, r0Var2);
        return r0Var2;
    }

    public final /* synthetic */ void z(Object obj) {
        this._removedRef$volatile = obj;
    }

    public final void A(@m80.k d0 d0Var, @m80.k d0 d0Var2) {
    }
}
