package c40;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,51:1\n1#2:52\n57#3,2:53\n57#3,2:55\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n11#1:53,2\n16#1:55,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e0 {
    @m80.k
    public static final <T> Object a(@m80.l Object obj, @m80.k j00.c<? super T> cVar) {
        if (obj instanceof c0) {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(kotlin.e.a(((c0) obj).f7827a));
        }
        Result.a aVar2 = Result.Companion;
        return Result.m6308constructorimpl(obj);
    }

    @m80.l
    public static final <T> Object b(@m80.k Object obj) {
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        return m6311exceptionOrNullimpl == null ? obj : new c0(m6311exceptionOrNullimpl, false, 2, null);
    }

    @m80.l
    public static final <T> Object c(@m80.k Object obj, @m80.k n<?> nVar) {
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        return m6311exceptionOrNullimpl == null ? obj : new c0(m6311exceptionOrNullimpl, false, 2, null);
    }
}
