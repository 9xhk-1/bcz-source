package org.junit.jupiter.api;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t {
    public static void a(Object unexpected, Object actual) {
        b(unexpected, actual, null);
    }

    public static void b(Object unexpected, Object actual, String message) {
        if (unexpected == actual) {
            d(actual, message);
        }
    }

    public static void c(Object unexpected, Object actual, Supplier<String> messageSupplier) {
        if (unexpected == actual) {
            d(actual, messageSupplier);
        }
    }

    public static void d(Object actual, Object messageOrSupplier) {
        j0.b().l(messageOrSupplier).n("expected: not same but was: <" + actual + ">").d();
    }
}
