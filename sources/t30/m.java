package t30;

import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class m {
    @m80.k
    public static final AssertionError a(@m80.l String str, @m80.l Throwable th2) {
        AssertionError assertionError = str == null ? new AssertionError() : new AssertionError(str);
        assertionError.initCause(th2);
        return assertionError;
    }

    @w00.j(name = "assertFails")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ Throwable b(String str, x00.a block) {
        Object m6308constructorimpl;
        kotlin.jvm.internal.g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        return l.o1(str, m6308constructorimpl);
    }

    @w00.j(name = "assertFails")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ Throwable c(x00.a block) {
        Object m6308constructorimpl;
        kotlin.jvm.internal.g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        return l.o1(null, m6308constructorimpl);
    }

    @w00.j(name = "assertFailsWith")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ Throwable d(h10.d exceptionClass, String str, x00.a block) {
        Object m6308constructorimpl;
        kotlin.jvm.internal.g0.p(exceptionClass, "exceptionClass");
        kotlin.jvm.internal.g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        return l.n1(exceptionClass, str, m6308constructorimpl);
    }

    @w00.j(name = "assertFailsWith")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ Throwable e(h10.d exceptionClass, x00.a block) {
        Object m6308constructorimpl;
        kotlin.jvm.internal.g0.p(exceptionClass, "exceptionClass");
        kotlin.jvm.internal.g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        return l.n1(exceptionClass, null, m6308constructorimpl);
    }

    @w00.j(name = "assertFalse")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ void f(String str, x00.a block) {
        kotlin.jvm.internal.g0.p(block, "block");
        l.O0(((Boolean) block.invoke()).booleanValue(), str);
    }

    public static /* synthetic */ void g(String str, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        f(str, aVar);
    }

    @w00.j(name = "assertNotNull")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ void h(Object obj, String str, x00.l block) {
        kotlin.jvm.internal.g0.p(block, "block");
        l.v1().c(str, obj);
        if (obj != null) {
            block.invoke(obj);
        }
    }

    public static /* synthetic */ void i(Object obj, String str, x00.l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        h(obj, str, lVar);
    }

    @w00.j(name = "assertTrue")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ void j(String str, x00.a block) {
        kotlin.jvm.internal.g0.p(block, "block");
        l.k1(((Boolean) block.invoke()).booleanValue(), str);
    }

    public static /* synthetic */ void k(String str, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        j(str, aVar);
    }

    @v0
    @m80.k
    public static final <T extends Throwable> T l(@m80.k h10.d<T> exceptionClass, @m80.l String str, @m80.k Object obj) {
        kotlin.jvm.internal.g0.p(exceptionClass, "exceptionClass");
        T t11 = (T) Result.m6311exceptionOrNullimpl(obj);
        if (t11 == null) {
            String j11 = i0.j(str);
            l.v1().f(j11 + "Expected an exception of " + w00.b.d(exceptionClass) + " to be thrown, but was completed successfully.");
            throw new KotlinNothingValueException();
        }
        if (w00.b.d(exceptionClass).isInstance(t11)) {
            kotlin.jvm.internal.g0.n(t11, "null cannot be cast to non-null type T of kotlin.test.AssertionsKt__AssertionsImplKt.checkResultIsFailure$lambda$1");
            return t11;
        }
        l.v1().d(i0.j(str) + "Expected an exception of " + w00.b.d(exceptionClass) + " to be thrown, but was " + t11, t11);
        throw new KotlinNothingValueException();
    }

    @o00.f
    public static final StackTraceElement[] m() {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        kotlin.jvm.internal.g0.o(stackTrace, "getStackTrace(...)");
        return stackTrace;
    }

    @w00.j(name = "expect")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ void n(Object obj, String str, x00.a block) {
        kotlin.jvm.internal.g0.p(block, "block");
        l.F0(obj, block.invoke(), str);
    }

    @w00.j(name = "expect")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    public static final /* synthetic */ void o(Object obj, x00.a block) {
        kotlin.jvm.internal.g0.p(block, "block");
        e0.p1(obj, block.invoke(), null, 4, null);
    }

    @o00.f
    public static final void p(x00.a<g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TODO at ");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        kotlin.jvm.internal.g0.o(stackTrace, "getStackTrace(...)");
        sb2.append(stackTrace[0]);
        System.out.println((Object) sb2.toString());
    }
}
