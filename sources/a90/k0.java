package a90;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k0 implements p80.h0 {
    public static /* synthetic */ k N(int i11, AtomicInteger atomicInteger, int i12, int i13) {
        return new k(i13, i11, atomicInteger, i12);
    }

    public static /* synthetic */ p80.g0 P(e0 e0Var, k kVar) {
        return new l0(kVar, e0Var);
    }

    @Override // p80.h0
    public boolean D(p80.n context) {
        return org.junit.platform.commons.util.a.A(context.k(), org.junit.jupiter.api.b3.class);
    }

    public final e0 Q(org.junit.jupiter.api.b3 repeatedTest, final Method method, String displayName) {
        return new e0(ba0.c2.l(repeatedTest.name().trim(), new Supplier() { // from class: a90.i0
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Configuration error: @RepeatedTest on method [%s] must be declared with a non-empty name.", method);
                return format;
            }
        }), displayName);
    }

    public final int R(org.junit.jupiter.api.b3 repeatedTest, final Method method) {
        int failureThreshold = repeatedTest.failureThreshold();
        if (failureThreshold != Integer.MAX_VALUE) {
            final int value = repeatedTest.value();
            ba0.c2.f(failureThreshold > 0 && failureThreshold < value, new Supplier() { // from class: a90.f0
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Configuration error: @RepeatedTest on method [%s] must declare a 'failureThreshold' greater than zero and less than the total number of repetitions [%d].", method, Integer.valueOf(value));
                    return format;
                }
            });
        }
        return failureThreshold;
    }

    public final int S(org.junit.jupiter.api.b3 repeatedTest, final Method method) {
        int value = repeatedTest.value();
        ba0.c2.f(value > 0, new Supplier() { // from class: a90.j0
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Configuration error: @RepeatedTest on method [%s] must be declared with a positive 'value'.", method);
                return format;
            }
        });
        return value;
    }

    @Override // p80.h0
    public Stream<p80.g0> b(p80.n context) {
        Method a02 = context.a0();
        String a11 = context.a();
        org.junit.jupiter.api.b3 b3Var = (org.junit.jupiter.api.b3) org.junit.platform.commons.util.a.m(a02, org.junit.jupiter.api.b3.class).get();
        final int S = S(b3Var, a02);
        final AtomicInteger atomicInteger = new AtomicInteger();
        final int R = R(b3Var, a02);
        final e0 Q = Q(b3Var, a02, a11);
        return IntStream.rangeClosed(1, S).mapToObj(new IntFunction() { // from class: a90.g0
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return k0.N(S, atomicInteger, R, i11);
            }
        }).map(new Function() { // from class: a90.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k0.P(e0.this, (k) obj);
            }
        });
    }
}
