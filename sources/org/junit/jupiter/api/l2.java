package org.junit.jupiter.api;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.apiguardian.api.API;
import org.junit.jupiter.api.l2;
import org.junit.jupiter.api.parallel.ExecutionMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface l2 {

    /* renamed from: a, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77969a = "junit.jupiter.testmethod.order.default";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.7", status = API.Status.DEPRECATED)
    @Deprecated
    public static class a extends c {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.10", status = API.Status.STABLE)
    public static class b implements l2 {

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator<k2> f77970b = Comparator.comparing(new Function() { // from class: org.junit.jupiter.api.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k2) obj).a();
            }
        });

        @Override // org.junit.jupiter.api.l2
        public void b(s2 context) {
            context.a().sort(f77970b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.10", status = API.Status.STABLE)
    public static class c implements l2 {

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator<k2> f77971b = Comparator.comparing(new Function() { // from class: org.junit.jupiter.api.n2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String name;
                name = ((k2) obj).getMethod().getName();
                return name;
            }
        }).thenComparing(new Function() { // from class: org.junit.jupiter.api.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String e11;
                e11 = l2.c.e(((k2) obj).getMethod());
                return e11;
            }
        });

        public static String e(Method method) {
            return ba0.y.d(method.getParameterTypes());
        }

        @Override // org.junit.jupiter.api.l2
        public void b(s2 context) {
            context.a().sort(f77971b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements l2 {
        public static int d(k2 descriptor) {
            return ((Integer) descriptor.f(w2.class).map(new i1()).orElse(1073741823)).intValue();
        }

        @Override // org.junit.jupiter.api.l2
        public void b(s2 context) {
            context.a().sort(Comparator.comparingInt(new ToIntFunction() { // from class: org.junit.jupiter.api.p2
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    int d11;
                    d11 = l2.d.d((k2) obj);
                    return d11;
                }
            }));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements l2 {

        /* renamed from: b, reason: collision with root package name */
        public static final y90.e f77972b;

        /* renamed from: c, reason: collision with root package name */
        public static final String f77973c = "junit.jupiter.execution.order.random.seed";

        static {
            y90.e c11 = y90.g.c(e.class);
            f77972b = c11;
            c11.j(new Supplier() { // from class: org.junit.jupiter.api.r2
                @Override // java.util.function.Supplier
                public final Object get() {
                    return l2.e.c();
                }
            });
        }

        public static /* synthetic */ String c() {
            return "MethodOrderer.Random default seed: " + a3.f77935b;
        }

        @Override // org.junit.jupiter.api.l2
        public void b(final s2 context) {
            Collections.shuffle(context.a(), new Random(a3.e(new Function() { // from class: org.junit.jupiter.api.q2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return s2.this.i((String) obj);
                }
            }, f77972b).longValue()));
        }
    }

    default Optional<ExecutionMode> a() {
        return Optional.of(ExecutionMode.SAME_THREAD);
    }

    void b(s2 context);
}
