package org.junit.jupiter.api;

import java.time.Duration;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a0 {
    public static /* synthetic */ Object a(r80.a aVar) {
        aVar.execute();
        return null;
    }

    public static /* synthetic */ Object b(r80.a aVar) {
        aVar.execute();
        return null;
    }

    public static <T> T c(Duration duration, r80.c<T> cVar) {
        return (T) d(duration, cVar, null);
    }

    public static <T> T d(Duration timeout, r80.c<T> supplier, Object messageOrSupplier) {
        long millis;
        millis = timeout.toMillis();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            T t11 = supplier.get();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 > millis) {
                j0.b().l(messageOrSupplier).n("execution exceeded timeout of " + millis + " ms by " + (currentTimeMillis2 - millis) + " ms").d();
            }
            return t11;
        } catch (Throwable th2) {
            throw ba0.o1.e(th2);
        }
    }

    public static <T> T e(Duration duration, r80.c<T> cVar, String str) {
        return (T) d(duration, cVar, str);
    }

    public static <T> T f(Duration duration, r80.c<T> cVar, Supplier<String> supplier) {
        return (T) d(duration, cVar, supplier);
    }

    public static void g(Duration timeout, r80.a executable) {
        h(timeout, executable, null);
    }

    public static void h(Duration timeout, final r80.a executable, String message) {
        e(timeout, new r80.c() { // from class: org.junit.jupiter.api.z
            @Override // r80.c
            public final Object get() {
                return a0.a(r80.a.this);
            }
        }, message);
    }

    public static void i(Duration timeout, final r80.a executable, Supplier<String> messageSupplier) {
        f(timeout, new r80.c() { // from class: org.junit.jupiter.api.y
            @Override // r80.c
            public final Object get() {
                return a0.b(r80.a.this);
            }
        }, messageSupplier);
    }
}
