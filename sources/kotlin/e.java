package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import o00.f;
import x00.l;
import yz.g2;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @y0(version = "1.3")
    @v0
    @k
    public static final Object a(@k Throwable exception) {
        g0.p(exception, "exception");
        return new Result.Failure(exception);
    }

    @y0(version = "1.3")
    @f
    public static final <R, T> R b(Object obj, l<? super T, ? extends R> onSuccess, l<? super Throwable, ? extends R> onFailure) {
        g0.p(onSuccess, "onSuccess");
        g0.p(onFailure, "onFailure");
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        return m6311exceptionOrNullimpl == null ? onSuccess.invoke(obj) : onFailure.invoke(m6311exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @f
    public static final <R, T extends R> R c(Object obj, R r11) {
        return Result.m6314isFailureimpl(obj) ? r11 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @f
    public static final <R, T extends R> R d(Object obj, l<? super Throwable, ? extends R> onFailure) {
        g0.p(onFailure, "onFailure");
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        return m6311exceptionOrNullimpl == null ? obj : onFailure.invoke(m6311exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @f
    public static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @y0(version = "1.3")
    @f
    public static final <R, T> Object f(Object obj, l<? super T, ? extends R> transform) {
        g0.p(transform, "transform");
        if (!Result.m6315isSuccessimpl(obj)) {
            return Result.m6308constructorimpl(obj);
        }
        Result.a aVar = Result.Companion;
        return Result.m6308constructorimpl(transform.invoke(obj));
    }

    @y0(version = "1.3")
    @f
    public static final <R, T> Object g(Object obj, l<? super T, ? extends R> transform) {
        g0.p(transform, "transform");
        if (!Result.m6315isSuccessimpl(obj)) {
            return Result.m6308constructorimpl(obj);
        }
        try {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(transform.invoke(obj));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m6308constructorimpl(a(th2));
        }
    }

    @y0(version = "1.3")
    @f
    public static final <T> Object h(Object obj, l<? super Throwable, g2> action) {
        g0.p(action, "action");
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        if (m6311exceptionOrNullimpl != null) {
            action.invoke(m6311exceptionOrNullimpl);
        }
        return obj;
    }

    @y0(version = "1.3")
    @f
    public static final <T> Object i(Object obj, l<? super T, g2> action) {
        g0.p(action, "action");
        if (Result.m6315isSuccessimpl(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    @y0(version = "1.3")
    @f
    public static final <R, T extends R> Object j(Object obj, l<? super Throwable, ? extends R> transform) {
        g0.p(transform, "transform");
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        if (m6311exceptionOrNullimpl == null) {
            return obj;
        }
        Result.a aVar = Result.Companion;
        return Result.m6308constructorimpl(transform.invoke(m6311exceptionOrNullimpl));
    }

    @y0(version = "1.3")
    @f
    public static final <R, T extends R> Object k(Object obj, l<? super Throwable, ? extends R> transform) {
        g0.p(transform, "transform");
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        if (m6311exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(transform.invoke(m6311exceptionOrNullimpl));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m6308constructorimpl(a(th2));
        }
    }

    @y0(version = "1.3")
    @f
    public static final <T, R> Object l(T t11, l<? super T, ? extends R> block) {
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(block.invoke(t11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m6308constructorimpl(a(th2));
        }
    }

    @y0(version = "1.3")
    @f
    public static final <R> Object m(x00.a<? extends R> block) {
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m6308constructorimpl(a(th2));
        }
    }

    @y0(version = "1.3")
    @v0
    public static final void n(@k Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
