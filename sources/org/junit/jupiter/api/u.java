package org.junit.jupiter.api;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u {
    public static void a(Object actual) {
        b(actual, null);
    }

    public static void b(Object actual, String message) {
        if (actual != null) {
            d(actual, message);
        }
    }

    public static void c(Object actual, Supplier<String> messageSupplier) {
        if (actual != null) {
            d(actual, messageSupplier);
        }
    }

    public static void d(Object actual, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).g(null).a(actual).d();
    }
}
