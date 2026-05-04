package org.junit.jupiter.api;

import ba0.h4;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x {
    public static <T extends Throwable> T a(Class<T> cls, r80.a aVar) {
        return (T) b(cls, aVar, null);
    }

    public static <T extends Throwable> T b(Class<T> expectedType, r80.a executable, Object messageOrSupplier) {
        try {
            executable.execute();
            throw j0.b().l(messageOrSupplier).n(String.format("Expected %s to be thrown, but nothing was thrown.", l0.n(expectedType))).c();
        } catch (Throwable th2) {
            if (expectedType.equals(th2.getClass())) {
                return th2;
            }
            h4.a(th2);
            throw j0.b().l(messageOrSupplier).g(expectedType).a(th2.getClass()).n("Unexpected exception type thrown").f(th2).c();
        }
    }

    public static <T extends Throwable> T c(Class<T> cls, r80.a aVar, String str) {
        return (T) b(cls, aVar, str);
    }

    public static <T extends Throwable> T d(Class<T> cls, r80.a aVar, Supplier<String> supplier) {
        return (T) b(cls, aVar, supplier);
    }
}
