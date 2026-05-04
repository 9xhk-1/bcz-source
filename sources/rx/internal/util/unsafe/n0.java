package rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f86883a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f86884b;

    static {
        f86884b = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        f86883a = unsafe;
    }

    public n0() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(Class<?> cls, String str) {
        try {
            return f86883a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e11) {
            InternalError internalError = new InternalError();
            internalError.initCause(e11);
            throw internalError;
        }
    }

    public static boolean b(Object obj, long j11, int i11, int i12) {
        return f86883a.compareAndSwapInt(obj, j11, i11, i12);
    }

    public static int c(Object obj, long j11, int i11) {
        while (true) {
            Unsafe unsafe = f86883a;
            int intVolatile = unsafe.getIntVolatile(obj, j11);
            Object obj2 = obj;
            long j12 = j11;
            if (unsafe.compareAndSwapInt(obj2, j12, intVolatile, intVolatile + i11)) {
                return intVolatile;
            }
            obj = obj2;
            j11 = j12;
        }
    }

    public static int d(Object obj, long j11) {
        while (true) {
            Unsafe unsafe = f86883a;
            int intVolatile = unsafe.getIntVolatile(obj, j11);
            Object obj2 = obj;
            long j12 = j11;
            if (unsafe.compareAndSwapInt(obj2, j12, intVolatile, intVolatile + 1)) {
                return intVolatile;
            }
            obj = obj2;
            j11 = j12;
        }
    }

    public static int e(Object obj, long j11, int i11) {
        while (true) {
            Unsafe unsafe = f86883a;
            int intVolatile = unsafe.getIntVolatile(obj, j11);
            Object obj2 = obj;
            long j12 = j11;
            int i12 = i11;
            if (unsafe.compareAndSwapInt(obj2, j12, intVolatile, i12)) {
                return intVolatile;
            }
            obj = obj2;
            j11 = j12;
            i11 = i12;
        }
    }

    public static boolean f() {
        return (f86883a == null || f86884b) ? false : true;
    }
}
