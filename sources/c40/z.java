package c40;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
/* loaded from: classes8.dex */
public final class z {
    @m80.k
    public static final <T> x<T> a(@m80.l l2 l2Var) {
        return new y(l2Var);
    }

    @m80.k
    public static final <T> x<T> b(T t11) {
        y yVar = new y(null);
        yVar.c0(t11);
        return yVar;
    }

    public static /* synthetic */ x c(l2 l2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l2Var = null;
        }
        return a(l2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@m80.k x<T> xVar, @m80.k Object obj) {
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        return m6311exceptionOrNullimpl == null ? xVar.c0(obj) : xVar.r(m6311exceptionOrNullimpl);
    }
}
