package c40;

import c40.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
/* loaded from: classes8.dex */
public class p<T> extends e1<T> implements n<T>, l00.c, z3 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7901f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7902g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7903h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final j00.c<T> f7904d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f7905e;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@m80.k j00.c<? super T> cVar, int i11) {
        super(i11);
        this.f7904d = cVar;
        this.f7905e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f7829a;
    }

    private final /* synthetic */ void T(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, x00.l<? super Integer, yz.g2> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public static final yz.g2 Z(x00.l lVar, Throwable th2, Object obj, kotlin.coroutines.d dVar) {
        lVar.invoke(th2);
        return yz.g2.f100423a;
    }

    public static /* synthetic */ void b0(p pVar, Object obj, int i11, x00.q qVar, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i12 & 4) != 0) {
            qVar = null;
        }
        pVar.a0(obj, i11, qVar);
    }

    private final boolean g0() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7901f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7901f.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
        return true;
    }

    private final boolean i0() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7901f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7901f.compareAndSet(this, i11, 536870912 + (536870911 & i11)));
        return true;
    }

    @Override // c40.n
    public <R extends T> void A(R r11, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar) {
        a0(r11, this.f7841c, qVar);
    }

    @Override // c40.n
    public void B(@m80.k m0 m0Var, @m80.k Throwable th2) {
        j00.c<T> cVar = this.f7904d;
        h40.l lVar = cVar instanceof h40.l ? (h40.l) cVar : null;
        b0(this, new c0(th2, false, 2, null), (lVar != null ? lVar.f58240d : null) == m0Var ? 4 : this.f7841c, null, 4, null);
    }

    public final void C(int i11) {
        if (g0()) {
            return;
        }
        f1.a(this, i11);
    }

    @m80.k
    public Throwable D(@m80.k l2 l2Var) {
        return l2Var.y0();
    }

    public final k1 E() {
        return (k1) f7903h.get(this);
    }

    @m80.l
    @yz.v0
    public final Object F() {
        l2 l2Var;
        boolean R = R();
        if (i0()) {
            if (E() == null) {
                O();
            }
            if (R) {
                X();
            }
            return kotlin.coroutines.intrinsics.b.l();
        }
        if (R) {
            X();
        }
        Object G = G();
        if (G instanceof c0) {
            throw ((c0) G).f7827a;
        }
        if (!f1.c(this.f7841c) || (l2Var = (l2) getContext().get(l2.f7886e0)) == null || l2Var.isActive()) {
            return g(G);
        }
        CancellationException y02 = l2Var.y0();
        c(G, y02);
        throw y02;
    }

    @m80.l
    public final Object G() {
        return f7902g.get(this);
    }

    public final String H() {
        Object G = G();
        return G instanceof z2 ? "Active" : G instanceof s ? "Cancelled" : "Completed";
    }

    public final /* synthetic */ int I() {
        return this._decisionAndIndex$volatile;
    }

    public final /* synthetic */ Object K() {
        return this._parentHandle$volatile;
    }

    public final /* synthetic */ Object M() {
        return this._state$volatile;
    }

    public final k1 O() {
        l2 l2Var = (l2) getContext().get(l2.f7886e0);
        if (l2Var == null) {
            return null;
        }
        k1 B = p2.B(l2Var, false, new t(this), 1, null);
        androidx.concurrent.futures.a.a(f7903h, this, null, B);
        return B;
    }

    public final void P(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.a.a(f7902g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof m) || (obj2 instanceof h40.u0)) {
                U(obj, obj2);
            } else {
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (!c0Var.d()) {
                        U(obj, obj2);
                    }
                    if (obj2 instanceof s) {
                        Throwable th2 = c0Var.f7827a;
                        if (obj instanceof m) {
                            m((m) obj, th2);
                            return;
                        } else {
                            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            r((h40.u0) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof b0) {
                    b0 b0Var = (b0) obj2;
                    if (b0Var.f7820b != null) {
                        U(obj, obj2);
                    }
                    if (obj instanceof h40.u0) {
                        return;
                    }
                    kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    m mVar = (m) obj;
                    if (b0Var.h()) {
                        m(mVar, b0Var.f7823e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.a.a(f7902g, this, obj2, b0.g(b0Var, null, mVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof h40.u0) {
                        return;
                    }
                    kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.a.a(f7902g, this, obj2, new b0(obj2, (m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void Q(@m80.k m mVar) {
        P(mVar);
    }

    public final boolean R() {
        if (!f1.d(this.f7841c)) {
            return false;
        }
        j00.c<T> cVar = this.f7904d;
        kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((h40.l) cVar).w();
    }

    public final /* synthetic */ void S(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, yz.g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final void U(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @m80.k
    public String V() {
        return "CancellableContinuation";
    }

    public final void W(@m80.k Throwable th2) {
        if (u(th2)) {
            return;
        }
        a(th2);
        z();
    }

    public final void X() {
        Throwable I;
        j00.c<T> cVar = this.f7904d;
        h40.l lVar = cVar instanceof h40.l ? (h40.l) cVar : null;
        if (lVar == null || (I = lVar.I(this)) == null) {
            return;
        }
        w();
        a(I);
    }

    @w00.j(name = "resetStateReusable")
    public final boolean Y() {
        Object obj = f7902g.get(this);
        if ((obj instanceof b0) && ((b0) obj).f7822d != null) {
            w();
            return false;
        }
        f7901f.set(this, 536870911);
        f7902g.set(this, d.f7829a);
        return true;
    }

    @Override // c40.n
    public boolean a(@m80.l Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.a.a(f7902g, this, obj, new s(this, th2, (obj instanceof m) || (obj instanceof h40.u0))));
        z2 z2Var = (z2) obj;
        if (z2Var instanceof m) {
            m((m) obj, th2);
        } else if (z2Var instanceof h40.u0) {
            r((h40.u0) obj, th2);
        }
        z();
        C(this.f7841c);
        return true;
    }

    public final <R> void a0(R r11, int i11, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z2)) {
                R r12 = r11;
                x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar2 = qVar;
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.h()) {
                        if (qVar2 != null) {
                            q(qVar2, sVar.f7827a, r12);
                            return;
                        }
                        return;
                    }
                }
                k(r12);
                throw new KotlinNothingValueException();
            }
            R r13 = r11;
            int i12 = i11;
            x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar3 = qVar;
            if (androidx.concurrent.futures.a.a(f7902g, this, obj, c0((z2) obj, r13, i12, qVar3, null))) {
                z();
                C(i12);
                return;
            } else {
                r11 = r13;
                i11 = i12;
                qVar = qVar3;
            }
        }
    }

    @Override // c40.z3
    public void b(@m80.k h40.u0<?> u0Var, int i11) {
        int i12;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7901f;
        do {
            i12 = atomicIntegerFieldUpdater.get(this);
            if ((i12 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, ((i12 >> 29) << 29) + i11));
        P(u0Var);
    }

    @Override // c40.e1
    public void c(@m80.l Object obj, @m80.k Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof c0) {
                return;
            }
            if (obj2 instanceof b0) {
                b0 b0Var = (b0) obj2;
                if (b0Var.h()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (androidx.concurrent.futures.a.a(f7902g, this, obj2, b0.g(b0Var, null, null, null, null, th4, 15, null))) {
                    b0Var.i(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (androidx.concurrent.futures.a.a(f7902g, this, obj2, new b0(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    public final <R> Object c0(z2 z2Var, R r11, int i11, x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar, Object obj) {
        if (r11 instanceof c0) {
            return r11;
        }
        if ((f1.c(i11) || obj != null) && !(qVar == null && !(z2Var instanceof m) && obj == null)) {
            return new b0(r11, z2Var instanceof m ? (m) z2Var : null, qVar, obj, null, 16, null);
        }
        return r11;
    }

    @Override // c40.e1
    @m80.k
    public final j00.c<T> d() {
        return this.f7904d;
    }

    public final /* synthetic */ void d0(int i11) {
        this._decisionAndIndex$volatile = i11;
    }

    @Override // c40.n
    public boolean e() {
        return !(G() instanceof z2);
    }

    public final /* synthetic */ void e0(Object obj) {
        this._parentHandle$volatile = obj;
    }

    @Override // c40.e1
    @m80.l
    public Throwable f(@m80.l Object obj) {
        Throwable f11 = super.f(obj);
        if (f11 != null) {
            return f11;
        }
        return null;
    }

    public final /* synthetic */ void f0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c40.e1
    public <T> T g(@m80.l Object obj) {
        return obj instanceof b0 ? (T) ((b0) obj).f7819a : obj;
    }

    @Override // l00.c
    @m80.l
    public l00.c getCallerFrame() {
        j00.c<T> cVar = this.f7904d;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return this.f7905e;
    }

    @Override // l00.c
    @m80.l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final <R> h40.x0 h0(R r11, Object obj, x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof z2)) {
                Object obj3 = obj;
                if ((obj2 instanceof b0) && obj3 != null && ((b0) obj2).f7822d == obj3) {
                    return q.f7923g;
                }
                return null;
            }
            R r12 = r11;
            Object obj4 = obj;
            x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar2 = qVar;
            if (androidx.concurrent.futures.a.a(f7902g, this, obj2, c0((z2) obj2, r12, this.f7841c, qVar2, obj4))) {
                z();
                return q.f7923g;
            }
            r11 = r12;
            qVar = qVar2;
            obj = obj4;
        }
    }

    @Override // c40.e1
    @m80.l
    public Object i() {
        return G();
    }

    @Override // c40.n
    public boolean isActive() {
        return G() instanceof z2;
    }

    @Override // c40.n
    public boolean isCancelled() {
        return G() instanceof s;
    }

    public final /* synthetic */ void j0(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, x00.l<? super Integer, Integer> lVar) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, lVar.invoke(Integer.valueOf(i11)).intValue()));
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // c40.n
    public void l(@m80.k m0 m0Var, T t11) {
        j00.c<T> cVar = this.f7904d;
        h40.l lVar = cVar instanceof h40.l ? (h40.l) cVar : null;
        b0(this, t11, (lVar != null ? lVar.f58240d : null) == m0Var ? 4 : this.f7841c, null, 4, null);
    }

    public final void m(@m80.k m mVar, @m80.l Throwable th2) {
        try {
            mVar.a(th2);
        } catch (Throwable th3) {
            o0.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // c40.n
    @m80.l
    public <R extends T> Object n(R r11, @m80.l Object obj, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar) {
        return h0(r11, obj, qVar);
    }

    public final void o(x00.a<yz.g2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            o0.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // c40.n
    public void p(@m80.k x00.l<? super Throwable, yz.g2> lVar) {
        r.c(this, new m.a(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void q(@m80.k x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar, @m80.k Throwable th2, R r11) {
        try {
            qVar.invoke(th2, r11, getContext());
        } catch (Throwable th3) {
            o0.b(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void r(h40.u0<?> u0Var, Throwable th2) {
        int i11 = f7901f.get(this) & 536870911;
        if (i11 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            u0Var.z(i11, th2, getContext());
        } catch (Throwable th3) {
            o0.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        b0(this, e0.c(obj, this), this.f7841c, null, 4, null);
    }

    @Override // c40.n
    public void s(@m80.k Object obj) {
        C(this.f7841c);
    }

    @Override // c40.n
    @m80.l
    public Object t(T t11, @m80.l Object obj) {
        return h0(t11, obj, null);
    }

    @m80.k
    public String toString() {
        return V() + '(' + u0.c(this.f7904d) + "){" + H() + "}@" + u0.b(this);
    }

    public final boolean u(Throwable th2) {
        if (!R()) {
            return false;
        }
        j00.c<T> cVar = this.f7904d;
        kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((h40.l) cVar).C(th2);
    }

    @Override // c40.n
    @m80.l
    public Object v(@m80.k Throwable th2) {
        return h0(new c0(th2, false, 2, null), null, null);
    }

    public final void w() {
        k1 E = E();
        if (E == null) {
            return;
        }
        E.dispose();
        f7903h.set(this, y2.f8014a);
    }

    @Override // c40.n
    public void x(T t11, @m80.l final x00.l<? super Throwable, yz.g2> lVar) {
        a0(t11, this.f7841c, lVar != null ? new x00.q() { // from class: c40.o
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                yz.g2 Z;
                Z = p.Z(x00.l.this, (Throwable) obj, obj2, (kotlin.coroutines.d) obj3);
                return Z;
            }
        } : null);
    }

    @Override // c40.n
    public void y() {
        k1 O = O();
        if (O != null && e()) {
            O.dispose();
            f7903h.set(this, y2.f8014a);
        }
    }

    public final void z() {
        if (R()) {
            return;
        }
        w();
    }
}
