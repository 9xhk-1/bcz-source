package f50;

import j50.e2;
import j50.f2;
import j50.y2;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,79:1\n78#1:81\n78#1:82\n78#2:80\n78#2:83\n78#2:84\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n22#1:81\n28#1:82\n54#1:80\n28#1:83\n45#1:84\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final y2<? extends Object> f51041a = j50.o.a(new x00.l() { // from class: f50.d0
        @Override // x00.l
        public final Object invoke(Object obj) {
            i k11;
            k11 = j0.k((h10.d) obj);
            return k11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final y2<Object> f51042b = j50.o.a(new x00.l() { // from class: f50.e0
        @Override // x00.l
        public final Object invoke(Object obj) {
            i l11;
            l11 = j0.l((h10.d) obj);
            return l11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final e2<? extends Object> f51043c = j50.o.b(new x00.p() { // from class: f50.f0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            i g11;
            g11 = j0.g((h10.d) obj, (List) obj2);
            return g11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final e2<Object> f51044d = j50.o.b(new x00.p() { // from class: f50.g0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            i i11;
            i11 = j0.i((h10.d) obj, (List) obj2);
            return i11;
        }
    });

    public static final i g(h10.d clazz, final List types) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        kotlin.jvm.internal.g0.p(types, "types");
        List<i<Object>> u11 = k0.u(o50.h.a(), types, true);
        kotlin.jvm.internal.g0.m(u11);
        return k0.f(clazz, u11, new x00.a() { // from class: f50.h0
            @Override // x00.a
            public final Object invoke() {
                h10.g h11;
                h11 = j0.h(types);
                return h11;
            }
        });
    }

    public static final h10.g h(List list) {
        return ((h10.r) list.get(0)).m();
    }

    public static final i i(h10.d clazz, final List types) {
        i v11;
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        kotlin.jvm.internal.g0.p(types, "types");
        List<i<Object>> u11 = k0.u(o50.h.a(), types, true);
        kotlin.jvm.internal.g0.m(u11);
        i<? extends Object> f11 = k0.f(clazz, u11, new x00.a() { // from class: f50.i0
            @Override // x00.a
            public final Object invoke() {
                h10.g j11;
                j11 = j0.j(types);
                return j11;
            }
        });
        if (f11 == null || (v11 = g50.a.v(f11)) == null) {
            return null;
        }
        return v11;
    }

    public static final h10.g j(List list) {
        return ((h10.r) list.get(0)).m();
    }

    public static final i k(h10.d it) {
        kotlin.jvm.internal.g0.p(it, "it");
        i p11 = k0.p(it);
        if (p11 != null) {
            return p11;
        }
        if (f2.n(it)) {
            return new o(it);
        }
        return null;
    }

    public static final i l(h10.d it) {
        i v11;
        kotlin.jvm.internal.g0.p(it, "it");
        i p11 = k0.p(it);
        if (p11 == null) {
            p11 = f2.n(it) ? new o(it) : null;
        }
        if (p11 == null || (v11 = g50.a.v(p11)) == null) {
            return null;
        }
        return v11;
    }

    @m80.l
    public static final i<Object> m(@m80.k h10.d<Object> clazz, boolean z11) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        if (z11) {
            return f51042b.c(clazz);
        }
        i<? extends Object> c11 = f51041a.c(clazz);
        if (c11 != null) {
            return c11;
        }
        return null;
    }

    @m80.k
    public static final Object n(@m80.k h10.d<Object> clazz, @m80.k List<? extends h10.r> types, boolean z11) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        kotlin.jvm.internal.g0.p(types, "types");
        return !z11 ? f51043c.a(clazz, types) : f51044d.a(clazz, types);
    }

    @m80.k
    public static final y2<? extends Object> q() {
        return f51041a;
    }

    @m80.l
    public static final o<? extends Object> t(@m80.k h10.d<?> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        if (f2.n(dVar)) {
            return new o<>(dVar);
        }
        return null;
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void s() {
    }
}
