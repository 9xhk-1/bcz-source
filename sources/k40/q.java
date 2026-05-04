package k40;

import c40.m0;
import kotlin.Result;
import kotlin.jvm.internal.d0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(c40.n<? super T> nVar, T t11) {
        m0 m0Var = (m0) nVar.getContext().get(m0.Key);
        if (m0Var != null) {
            nVar.l(m0Var, t11);
        } else {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(t11));
        }
    }

    public static final void d(c40.n<?> nVar, Throwable th2) {
        m0 m0Var = (m0) nVar.getContext().get(m0.Key);
        if (m0Var != null) {
            nVar.B(m0Var, th2);
        } else {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
        }
    }

    @m80.l
    @v0
    public static final <R> Object e(@m80.k x00.l<? super d<? super R>, g2> lVar, @m80.k j00.c<? super R> cVar) {
        e eVar = new e(cVar);
        try {
            lVar.invoke(eVar);
        } catch (Throwable th2) {
            eVar.R(th2);
        }
        Object Q = eVar.Q();
        if (Q == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return Q;
    }

    @v0
    public static final <R> Object f(x00.l<? super d<? super R>, g2> lVar, j00.c<? super R> cVar) {
        d0.e(0);
        e eVar = new e(cVar);
        try {
            lVar.invoke(eVar);
        } catch (Throwable th2) {
            eVar.R(th2);
        }
        Object Q = eVar.Q();
        if (Q == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        d0.e(1);
        return Q;
    }

    @m80.l
    @v0
    public static final <R> Object g(@m80.k x00.l<? super d<? super R>, g2> lVar, @m80.k j00.c<? super R> cVar) {
        s sVar = new s(cVar);
        try {
            lVar.invoke(sVar);
        } catch (Throwable th2) {
            sVar.S(th2);
        }
        Object T = sVar.T();
        if (T == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return T;
    }

    @v0
    public static final <R> Object h(x00.l<? super d<? super R>, g2> lVar, j00.c<? super R> cVar) {
        d0.e(0);
        s sVar = new s(cVar);
        try {
            lVar.invoke(sVar);
        } catch (Throwable th2) {
            sVar.S(th2);
        }
        Object T = sVar.T();
        if (T == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        d0.e(1);
        return T;
    }
}
