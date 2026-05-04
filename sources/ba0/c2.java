package ba0;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class c2 {
    public static void e(boolean predicate, String message) throws PreconditionViolationException {
        if (!predicate) {
            throw new PreconditionViolationException(message);
        }
    }

    public static void f(boolean predicate, Supplier<String> messageSupplier) throws PreconditionViolationException {
        if (!predicate) {
            throw new PreconditionViolationException(messageSupplier.get());
        }
    }

    public static <T extends Collection<?>> T g(T collection, final String message) throws PreconditionViolationException {
        if (collection != null) {
            collection.forEach(new Consumer() { // from class: ba0.b2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c2.r(obj, message);
                }
            });
        }
        return collection;
    }

    public static <T extends Collection<?>> T h(T collection, final Supplier<String> messageSupplier) throws PreconditionViolationException {
        if (collection != null) {
            collection.forEach(new Consumer() { // from class: ba0.z1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c2.s(obj, messageSupplier);
                }
            });
        }
        return collection;
    }

    public static <T> T[] i(T[] array, final String message) throws PreconditionViolationException {
        if (array != null) {
            Arrays.stream(array).forEach(new Consumer() { // from class: ba0.a2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c2.r(obj, message);
                }
            });
        }
        return array;
    }

    public static <T> T[] j(T[] array, final Supplier<String> messageSupplier) throws PreconditionViolationException {
        if (array != null) {
            Arrays.stream(array).forEach(new Consumer() { // from class: ba0.y1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c2.s(obj, messageSupplier);
                }
            });
        }
        return array;
    }

    public static String k(String str, String message) throws PreconditionViolationException {
        e(e4.h(str), message);
        return str;
    }

    public static String l(String str, Supplier<String> messageSupplier) throws PreconditionViolationException {
        f(e4.h(str), messageSupplier);
        return str;
    }

    public static <T extends Collection<?>> T m(T collection, String message) throws PreconditionViolationException {
        e((collection == null || collection.isEmpty()) ? false : true, message);
        return collection;
    }

    public static <T extends Collection<?>> T n(T collection, Supplier<String> messageSupplier) throws PreconditionViolationException {
        f((collection == null || collection.isEmpty()) ? false : true, messageSupplier);
        return collection;
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static int[] o(int[] array, String message) throws PreconditionViolationException {
        e(array != null && array.length > 0, message);
        return array;
    }

    public static <T> T[] p(T[] array, String message) throws PreconditionViolationException {
        e(array != null && array.length > 0, message);
        return array;
    }

    public static <T> T[] q(T[] array, Supplier<String> messageSupplier) throws PreconditionViolationException {
        f(array != null && array.length > 0, messageSupplier);
        return array;
    }

    public static <T> T r(T object, String message) throws PreconditionViolationException {
        e(object != null, message);
        return object;
    }

    public static <T> T s(T object, Supplier<String> messageSupplier) throws PreconditionViolationException {
        f(object != null, messageSupplier);
        return object;
    }
}
