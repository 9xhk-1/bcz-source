package org.junit.jupiter.api;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v {
    public static void a(Object expected, Object actual) {
        b(expected, actual, null);
    }

    public static void b(Object expected, Object actual, String message) {
        if (expected != actual) {
            d(expected, actual, message);
        }
    }

    public static void c(Object expected, Object actual, Supplier<String> messageSupplier) {
        if (expected != actual) {
            d(expected, actual, messageSupplier);
        }
    }

    public static void d(Object expected, Object actual, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).g(expected).a(actual).d();
    }
}
