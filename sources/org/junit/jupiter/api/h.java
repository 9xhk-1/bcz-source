package org.junit.jupiter.api;

import ba0.e4;
import ba0.h4;
import java.util.function.Supplier;
import org.opentest4j.AssertionFailedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h {
    public static <T> T a(r80.c<T> cVar) {
        return (T) b(cVar, null);
    }

    public static <T> T b(r80.c<T> supplier, Object messageOrSupplier) {
        try {
            return supplier.get();
        } catch (Throwable th2) {
            h4.a(th2);
            throw j(messageOrSupplier, th2);
        }
    }

    public static <T> T c(r80.c<T> cVar, String str) {
        return (T) b(cVar, str);
    }

    public static <T> T d(r80.c<T> cVar, Supplier<String> supplier) {
        return (T) b(cVar, supplier);
    }

    public static void e(r80.a executable) {
        f(executable, null);
    }

    public static void f(r80.a executable, Object messageOrSupplier) {
        try {
            executable.execute();
        } catch (Throwable th2) {
            h4.a(th2);
            throw j(messageOrSupplier, th2);
        }
    }

    public static void g(r80.a executable, String message) {
        f(executable, message);
    }

    public static void h(r80.a executable, Supplier<String> messageSupplier) {
        f(executable, messageSupplier);
    }

    public static String i(String message) {
        if (!e4.h(message)) {
            return "";
        }
        return ": " + message;
    }

    public static AssertionFailedError j(Object messageOrSupplier, Throwable t11) {
        return j0.b().l(messageOrSupplier).n("Unexpected exception thrown: " + t11.getClass().getName() + i(t11.getMessage())).f(t11).c();
    }
}
