package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import o00.f;
import w00.g;
import w00.h;
import w00.j;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@h
/* loaded from: classes8.dex */
public final class Result<T> implements Serializable {

    @k
    public static final a Companion = new a(null);

    @l
    private final Object value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Failure implements Serializable {

        @g
        @k
        public final Throwable exception;

        public Failure(@k Throwable exception) {
            g0.p(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof Failure) && g0.g(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @k
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @j(name = "failure")
        @f
        public final <T> Object a(Throwable exception) {
            g0.p(exception, "exception");
            return Result.m6308constructorimpl(e.a(exception));
        }

        @j(name = "success")
        @f
        public final <T> Object b(T t11) {
            return Result.m6308constructorimpl(t11);
        }

        public a() {
        }
    }

    @v0
    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Result m6307boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6309equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && g0.g(obj, ((Result) obj2).m6317unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6310equalsimpl0(Object obj, Object obj2) {
        return g0.g(obj, obj2);
    }

    @l
    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m6311exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    /* renamed from: getOrNull-impl, reason: not valid java name */
    private static final T m6312getOrNullimpl(Object obj) {
        if (m6314isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6313hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m6314isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m6315isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6316toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m6309equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6313hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m6316toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m6317unboximpl() {
        return this.value;
    }

    @v0
    public static /* synthetic */ void getValue$annotations() {
    }

    @v0
    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m6308constructorimpl(@l Object obj) {
        return obj;
    }
}
