package org.junit.jupiter.api;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k {
    public static <T> T a(Class<T> cls, Object obj) {
        return (T) b(cls, obj, null);
    }

    public static <T> T b(Class<T> expectedType, Object actualValue, Object messageOrSupplier) {
        if (!expectedType.isInstance(actualValue)) {
            j0.b().l(messageOrSupplier).n(actualValue == null ? "Unexpected null value" : "Unexpected type").g(expectedType).a(actualValue == null ? null : actualValue.getClass()).d();
        }
        return expectedType.cast(actualValue);
    }

    public static <T> T c(Class<T> cls, Object obj, String str) {
        return (T) b(cls, obj, str);
    }

    public static <T> T d(Class<T> cls, Object obj, Supplier<String> supplier) {
        return (T) b(cls, obj, supplier);
    }
}
