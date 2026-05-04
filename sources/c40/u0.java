package c40;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 {
    @m80.k
    public static final String a(@m80.k Object obj) {
        return obj.getClass().getSimpleName();
    }

    @m80.k
    public static final String b(@m80.k Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @m80.k
    public static final String c(@m80.k j00.c<?> cVar) {
        Object m6308constructorimpl;
        if (cVar instanceof h40.l) {
            return ((h40.l) cVar).toString();
        }
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(cVar + '@' + b(cVar));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            m6308constructorimpl = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) m6308constructorimpl;
    }
}
