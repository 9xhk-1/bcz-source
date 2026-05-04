package org.junit.jupiter.api;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77934a = "junit.jupiter.execution.order.random.seed";

    /* renamed from: b, reason: collision with root package name */
    public static final long f77935b = System.nanoTime();

    public static /* synthetic */ Long a(y90.e eVar, final String str) {
        try {
            eVar.j(new Supplier() { // from class: org.junit.jupiter.api.x2
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Using custom seed for configuration parameter [%s] with value [%s].", "junit.jupiter.execution.order.random.seed", str);
                    return format;
                }
            });
            return Long.valueOf(str);
        } catch (NumberFormatException e11) {
            eVar.b(e11, new Supplier() { // from class: org.junit.jupiter.api.y2
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Failed to convert configuration parameter [%s] with value [%s] to a long. Using default seed [%s] as fallback.", "junit.jupiter.execution.order.random.seed", str, Long.valueOf(a3.f77935b));
                    return format;
                }
            });
            return null;
        }
    }

    public static Optional<Long> d(Function<String, Optional<String>> configurationParameterLookup, final y90.e logger) {
        return configurationParameterLookup.apply("junit.jupiter.execution.order.random.seed").map(new Function() { // from class: org.junit.jupiter.api.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a3.a(y90.e.this, (String) obj);
            }
        });
    }

    public static Long e(Function<String, Optional<String>> configurationParameterLookup, y90.e logger) {
        return d(configurationParameterLookup, logger).orElse(Long.valueOf(f77935b));
    }
}
