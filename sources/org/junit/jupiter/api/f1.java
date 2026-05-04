package org.junit.jupiter.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.apiguardian.api.API;
import org.junit.jupiter.api.f1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface f1 {

    /* renamed from: a, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77948a = "junit.jupiter.testclass.order.default";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements f1 {

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator<d1> f77949b = Comparator.comparing(new Function() { // from class: org.junit.jupiter.api.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String name;
                name = ((d1) obj).c().getName();
                return name;
            }
        });

        @Override // org.junit.jupiter.api.f1
        public void a(l1 context) {
            context.j().sort(f77949b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements f1 {

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator<d1> f77950b = Comparator.comparing(new Function() { // from class: org.junit.jupiter.api.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((d1) obj).a();
            }
        });

        @Override // org.junit.jupiter.api.f1
        public void a(l1 context) {
            context.j().sort(f77950b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements f1 {
        public static int c(d1 descriptor) {
            return ((Integer) descriptor.f(w2.class).map(new i1()).orElse(1073741823)).intValue();
        }

        @Override // org.junit.jupiter.api.f1
        public void a(l1 context) {
            context.j().sort(Comparator.comparingInt(new ToIntFunction() { // from class: org.junit.jupiter.api.h1
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    int c11;
                    c11 = f1.c.c((d1) obj);
                    return c11;
                }
            }));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements f1 {

        /* renamed from: b, reason: collision with root package name */
        public static final y90.e f77951b;

        /* renamed from: c, reason: collision with root package name */
        public static final String f77952c = "junit.jupiter.execution.order.random.seed";

        static {
            y90.e c11 = y90.g.c(d.class);
            f77951b = c11;
            c11.j(new Supplier() { // from class: org.junit.jupiter.api.k1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return f1.d.b();
                }
            });
        }

        public static /* synthetic */ String b() {
            return "ClassOrderer.Random default seed: " + a3.f77935b;
        }

        @Override // org.junit.jupiter.api.f1
        public void a(final l1 context) {
            Collections.shuffle(context.j(), new Random(a3.e(new Function() { // from class: org.junit.jupiter.api.j1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return l1.this.i((String) obj);
                }
            }, f77951b).longValue()));
        }
    }

    void a(l1 context);
}
