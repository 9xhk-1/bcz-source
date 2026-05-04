package k10;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/CacheByClassKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f64911a = false;

    static {
        Object m6308constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
            Result.a aVar3 = Result.Companion;
            m6308constructorimpl = Boolean.TRUE;
        }
        Object m6308constructorimpl2 = Result.m6308constructorimpl(m6308constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m6314isFailureimpl(m6308constructorimpl2)) {
            m6308constructorimpl2 = bool;
        }
        ((Boolean) m6308constructorimpl2).getClass();
    }

    @m80.k
    public static final <V> a<V> a(@m80.k x00.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        return new m(compute);
    }
}
