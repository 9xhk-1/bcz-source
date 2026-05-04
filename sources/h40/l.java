package h40;

import c40.l2;
import c40.o1;
import c40.o3;
import c40.x3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n224#1,8:377\n236#1:385\n237#1,2:396\n239#1:400\n1#2:314\n1#2:320\n1#2:361\n293#3,5:315\n298#3,12:321\n310#3:355\n293#3,5:356\n298#3,12:362\n310#3:415\n184#4,3:333\n187#4,14:341\n184#4,3:374\n187#4,14:401\n91#5,5:336\n103#5,10:386\n114#5,2:398\n103#5,13:416\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:377,8\n215#1:385\n215#1:396,2\n215#1:400\n195#1:320\n213#1:361\n195#1:315,5\n195#1:321,12\n195#1:355\n213#1:356,5\n213#1:362,12\n213#1:415\n195#1:333,3\n195#1:341,14\n213#1:374,3\n213#1:401,14\n196#1:336,5\n215#1:386,10\n215#1:398,2\n236#1:416,13\n*E\n"})
/* loaded from: classes8.dex */
public final class l<T> extends c40.e1<T> implements l00.c, j00.c<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58239h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final c40.m0 f58240d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final j00.c<T> f58241e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public Object f58242f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Object f58243g;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k c40.m0 m0Var, @m80.k j00.c<? super T> cVar) {
        super(-1);
        x0 x0Var;
        this.f58240d = m0Var;
        this.f58241e = cVar;
        x0Var = m.f58245a;
        this.f58242f = x0Var;
        this.f58243g = g1.g(getContext());
    }

    private final /* synthetic */ void z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final boolean C(@m80.k Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58239h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            x0 x0Var = m.f58246b;
            if (kotlin.jvm.internal.g0.g(obj, x0Var)) {
                if (androidx.concurrent.futures.a.a(f58239h, this, x0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f58239h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void D() {
        j();
        c40.p<?> o11 = o();
        if (o11 != null) {
            o11.w();
        }
    }

    public final void E(@m80.k Object obj) {
        Object b11 = c40.e0.b(obj);
        if (m.f(this.f58240d, getContext())) {
            this.f58242f = b11;
            this.f7841c = 1;
            m.e(this.f58240d, getContext(), this);
            return;
        }
        o1 b12 = o3.f7899a.b();
        if (b12.d0()) {
            this.f58242f = b11;
            this.f7841c = 1;
            b12.H(this);
            return;
        }
        b12.L(true);
        try {
            l2 l2Var = (l2) getContext().get(l2.f7886e0);
            if (l2Var == null || l2Var.isActive()) {
                j00.c<T> cVar = this.f58241e;
                Object obj2 = this.f58243g;
                kotlin.coroutines.d context = cVar.getContext();
                Object i11 = g1.i(context, obj2);
                x3<?> m11 = i11 != g1.f58220a ? c40.k0.m(cVar, context, i11) : null;
                try {
                    this.f58241e.resumeWith(obj);
                    g2 g2Var = g2.f100423a;
                } finally {
                    kotlin.jvm.internal.d0.d(1);
                    if (m11 == null || m11.f2()) {
                        g1.f(context, i11);
                    }
                    kotlin.jvm.internal.d0.c(1);
                }
            } else {
                CancellationException y02 = l2Var.y0();
                c(b11, y02);
                Result.a aVar = Result.Companion;
                resumeWith(Result.m6308constructorimpl(kotlin.e.a(y02)));
            }
            while (b12.i0()) {
            }
            kotlin.jvm.internal.d0.d(1);
        } catch (Throwable th2) {
            try {
                h(th2);
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.d0.d(1);
                b12.q(true);
                kotlin.jvm.internal.d0.c(1);
                throw th3;
            }
        }
        b12.q(true);
        kotlin.jvm.internal.d0.c(1);
    }

    public final boolean F(@m80.l Object obj) {
        l2 l2Var = (l2) getContext().get(l2.f7886e0);
        if (l2Var == null || l2Var.isActive()) {
            return false;
        }
        CancellationException y02 = l2Var.y0();
        c(obj, y02);
        Result.a aVar = Result.Companion;
        resumeWith(Result.m6308constructorimpl(kotlin.e.a(y02)));
        return true;
    }

    public final void G(@m80.k Object obj) {
        j00.c<T> cVar = this.f58241e;
        Object obj2 = this.f58243g;
        kotlin.coroutines.d context = cVar.getContext();
        Object i11 = g1.i(context, obj2);
        x3<?> m11 = i11 != g1.f58220a ? c40.k0.m(cVar, context, i11) : null;
        try {
            this.f58241e.resumeWith(obj);
            g2 g2Var = g2.f100423a;
        } finally {
            kotlin.jvm.internal.d0.d(1);
            if (m11 == null || m11.f2()) {
                g1.f(context, i11);
            }
            kotlin.jvm.internal.d0.c(1);
        }
    }

    public final /* synthetic */ void H(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    @m80.l
    public final Throwable I(@m80.k c40.n<?> nVar) {
        x0 x0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58239h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            x0Var = m.f58246b;
            if (obj != x0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f58239h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f58239h, this, x0Var, nVar));
        return null;
    }

    @Override // l00.c
    @m80.l
    public l00.c getCallerFrame() {
        j00.c<T> cVar = this.f58241e;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return this.f58241e.getContext();
    }

    @Override // l00.c
    @m80.l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // c40.e1
    @m80.l
    public Object i() {
        x0 x0Var;
        Object obj = this.f58242f;
        x0Var = m.f58245a;
        this.f58242f = x0Var;
        return obj;
    }

    public final void j() {
        while (f58239h.get(this) == m.f58246b) {
        }
    }

    @m80.l
    public final c40.p<T> k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58239h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f58239h.set(this, m.f58246b);
                return null;
            }
            if (obj instanceof c40.p) {
                if (androidx.concurrent.futures.a.a(f58239h, this, obj, m.f58246b)) {
                    return (c40.p) obj;
                }
            } else if (obj != m.f58246b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(@m80.k kotlin.coroutines.d dVar, T t11) {
        this.f58242f = t11;
        this.f7841c = 1;
        this.f58240d.dispatchYield(dVar, this);
    }

    public final c40.p<?> o() {
        Object obj = f58239h.get(this);
        if (obj instanceof c40.p) {
            return (c40.p) obj;
        }
        return null;
    }

    public final /* synthetic */ Object q() {
        return this._reusableCancellableContinuation$volatile;
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        Object b11 = c40.e0.b(obj);
        if (m.f(this.f58240d, getContext())) {
            this.f58242f = b11;
            this.f7841c = 0;
            m.e(this.f58240d, getContext(), this);
            return;
        }
        o1 b12 = o3.f7899a.b();
        if (b12.d0()) {
            this.f58242f = b11;
            this.f7841c = 0;
            b12.H(this);
            return;
        }
        b12.L(true);
        try {
            kotlin.coroutines.d context = getContext();
            Object i11 = g1.i(context, this.f58243g);
            try {
                this.f58241e.resumeWith(obj);
                g2 g2Var = g2.f100423a;
                while (b12.i0()) {
                }
            } finally {
                g1.f(context, i11);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @m80.k
    public String toString() {
        return "DispatchedContinuation[" + this.f58240d + j2.O + c40.u0.c(this.f58241e) + l50.b.f69930l;
    }

    public final boolean w() {
        return f58239h.get(this) != null;
    }

    public static /* synthetic */ void u() {
    }

    @Override // c40.e1
    @m80.k
    public j00.c<T> d() {
        return this;
    }
}
