package kotlin.reflect.jvm.internal.impl.utils;

import m80.k;
import m80.l;
import o30.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f67671a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f67672b = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f67673a;

        public /* synthetic */ b(Throwable th2, a aVar) {
            this(th2);
        }

        public static /* synthetic */ void a(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i11 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @k
        public Throwable b() {
            Throwable th2 = this.f67673a;
            if (th2 == null) {
                a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f67673a.toString();
        }

        public b(@k Throwable th2) {
            if (th2 == null) {
                a(0);
            }
            this.f67673a = th2;
        }
    }

    public static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i11 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i11 == 1 || i11 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i11 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @k
    public static <V> Object b(@l V v11) {
        if (v11 == null && (v11 = (V) f67671a) == null) {
            a(1);
        }
        return v11;
    }

    @k
    public static Object c(@k Throwable th2) {
        if (th2 == null) {
            a(3);
        }
        return new b(th2, null);
    }

    @l
    public static <V> V d(@k Object obj) {
        if (obj == null) {
            a(4);
        }
        return (V) e(f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static <V> V e(@k Object obj) {
        if (obj == 0) {
            a(0);
        }
        if (obj == f67671a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static <V> V f(@l Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable b11 = ((b) obj).b();
        if (f67672b && d.a(b11)) {
            throw new WrappedProcessCanceledException(b11);
        }
        throw d.b(b11);
    }
}
