package c40;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s0 {
    @m80.k
    public static final r0 a(@m80.k kotlin.coroutines.d dVar) {
        a0 c11;
        if (dVar.get(l2.f7886e0) == null) {
            c11 = p2.c(null, 1, null);
            dVar = dVar.plus(c11);
        }
        return new h40.h(dVar);
    }

    @m80.k
    public static final r0 b() {
        return new h40.h(l3.c(null, 1, null).plus(h1.e()));
    }

    public static final void c(@m80.k r0 r0Var, @m80.k String str, @m80.l Throwable th2) {
        d(r0Var, t1.a(str, th2));
    }

    public static final void d(@m80.k r0 r0Var, @m80.l CancellationException cancellationException) {
        l2 l2Var = (l2) r0Var.getCoroutineContext().get(l2.f7886e0);
        if (l2Var != null) {
            l2Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + r0Var).toString());
    }

    public static /* synthetic */ void e(r0 r0Var, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        c(r0Var, str, th2);
    }

    public static /* synthetic */ void f(r0 r0Var, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        d(r0Var, cancellationException);
    }

    @m80.l
    public static final <R> Object g(@m80.k x00.p<? super r0, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        h40.t0 t0Var = new h40.t0(cVar.getContext(), cVar);
        Object d11 = i40.b.d(t0Var, t0Var, pVar);
        if (d11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return d11;
    }

    @m80.l
    public static final Object h(@m80.k j00.c<? super kotlin.coroutines.d> cVar) {
        return cVar.getContext();
    }

    public static final Object i(j00.c<? super kotlin.coroutines.d> cVar) {
        kotlin.jvm.internal.d0.e(3);
        throw null;
    }

    public static final void j(@m80.k r0 r0Var) {
        n2.z(r0Var.getCoroutineContext());
    }

    public static final boolean k(@m80.k r0 r0Var) {
        l2 l2Var = (l2) r0Var.getCoroutineContext().get(l2.f7886e0);
        if (l2Var != null) {
            return l2Var.isActive();
        }
        return true;
    }

    @m80.k
    public static final r0 m(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar) {
        return new h40.h(r0Var.getCoroutineContext().plus(dVar));
    }

    public static /* synthetic */ void l(r0 r0Var) {
    }
}
