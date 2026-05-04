package org.junit.jupiter.api;

import ba0.e4;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.opentest4j.TestAbortedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class z0 {
    @API(since = "5.9", status = API.Status.STABLE)
    public static <V> V a() {
        throw new TestAbortedException();
    }

    @API(since = "5.9", status = API.Status.STABLE)
    public static <V> V b(String message) {
        throw new TestAbortedException(message);
    }

    @API(since = "5.9", status = API.Status.STABLE)
    public static <V> V c(Supplier<String> messageSupplier) {
        throw new TestAbortedException(messageSupplier.get());
    }

    public static void d(BooleanSupplier assumptionSupplier) throws TestAbortedException {
        h(assumptionSupplier.getAsBoolean(), "assumption is not false");
    }

    public static void e(BooleanSupplier assumptionSupplier, String message) throws TestAbortedException {
        h(assumptionSupplier.getAsBoolean(), message);
    }

    public static void f(BooleanSupplier assumptionSupplier, Supplier<String> messageSupplier) throws TestAbortedException {
        i(assumptionSupplier.getAsBoolean(), messageSupplier);
    }

    public static void g(boolean assumption) throws TestAbortedException {
        h(assumption, "assumption is not false");
    }

    public static void h(boolean assumption, String message) throws TestAbortedException {
        if (assumption) {
            r(message);
        }
    }

    public static void i(boolean assumption, Supplier<String> messageSupplier) throws TestAbortedException {
        if (assumption) {
            r(messageSupplier.get());
        }
    }

    public static void j(BooleanSupplier assumptionSupplier) throws TestAbortedException {
        n(assumptionSupplier.getAsBoolean(), "assumption is not true");
    }

    public static void k(BooleanSupplier assumptionSupplier, String message) throws TestAbortedException {
        n(assumptionSupplier.getAsBoolean(), message);
    }

    public static void l(BooleanSupplier assumptionSupplier, Supplier<String> messageSupplier) throws TestAbortedException {
        o(assumptionSupplier.getAsBoolean(), messageSupplier);
    }

    public static void m(boolean assumption) throws TestAbortedException {
        n(assumption, "assumption is not true");
    }

    public static void n(boolean assumption, String message) throws TestAbortedException {
        if (assumption) {
            return;
        }
        r(message);
    }

    public static void o(boolean assumption, Supplier<String> messageSupplier) throws TestAbortedException {
        if (assumption) {
            return;
        }
        r(messageSupplier.get());
    }

    public static void p(BooleanSupplier assumptionSupplier, r80.a executable) {
        q(assumptionSupplier.getAsBoolean(), executable);
    }

    public static void q(boolean assumption, r80.a executable) {
        if (assumption) {
            try {
                executable.execute();
            } catch (Throwable th2) {
                throw ba0.o1.e(th2);
            }
        }
    }

    public static void r(String message) {
        String str;
        if (e4.h(message)) {
            str = "Assumption failed: " + message;
        } else {
            str = "Assumption failed";
        }
        throw new TestAbortedException(str);
    }
}
