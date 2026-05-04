package org.junit.jupiter.api;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i0 {
    public static void a(BooleanSupplier booleanSupplier) {
        e(booleanSupplier.getAsBoolean(), null);
    }

    public static void b(BooleanSupplier booleanSupplier, String message) {
        e(booleanSupplier.getAsBoolean(), message);
    }

    public static void c(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier) {
        f(booleanSupplier.getAsBoolean(), messageSupplier);
    }

    public static void d(boolean condition) {
        e(condition, null);
    }

    public static void e(boolean condition, String message) {
        if (condition) {
            return;
        }
        g(message);
    }

    public static void f(boolean condition, Supplier<String> messageSupplier) {
        if (condition) {
            return;
        }
        g(messageSupplier);
    }

    public static void g(Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).g(Boolean.TRUE).a(Boolean.FALSE).d();
    }
}
