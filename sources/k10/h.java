package k10;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ncaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n72#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n*L\n68#1:75,2\n68#1:77\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a<kotlin.reflect.jvm.internal.f<? extends Object>> f64938a = b.a(c.f64916a);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a<kotlin.reflect.jvm.internal.k> f64939b = b.a(d.f64921a);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a<h10.r> f64940c = b.a(e.f64925a);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a<h10.r> f64941d = b.a(f.f64931a);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a<ConcurrentHashMap<Pair<List<h10.t>, Boolean>, h10.r>> f64942e = b.a(g.f64935a);

    public static final h10.r a(Class it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return i10.i.b(n(it), a00.h0.J(), false, a00.h0.J());
    }

    public static final ConcurrentHashMap b(Class it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new ConcurrentHashMap();
    }

    public static final h10.r c(Class it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return i10.i.b(n(it), a00.h0.J(), true, a00.h0.J());
    }

    public static final kotlin.reflect.jvm.internal.f d(Class it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new kotlin.reflect.jvm.internal.f(it);
    }

    public static final kotlin.reflect.jvm.internal.k e(Class it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new kotlin.reflect.jvm.internal.k(it);
    }

    public static final void k() {
        f64938a.a();
        f64939b.a();
        f64940c.a();
        f64941d.a();
        f64942e.a();
    }

    @m80.k
    public static final <T> h10.r l(@m80.k Class<T> jClass, @m80.k List<h10.t> arguments, boolean z11) {
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        return arguments.isEmpty() ? z11 ? f64941d.b(jClass) : f64940c.b(jClass) : m(jClass, arguments, z11);
    }

    public static final <T> h10.r m(Class<T> cls, List<h10.t> list, boolean z11) {
        ConcurrentHashMap<Pair<List<h10.t>, Boolean>, h10.r> b11 = f64942e.b(cls);
        Pair<List<h10.t>, Boolean> a11 = yz.h1.a(list, Boolean.valueOf(z11));
        h10.r rVar = b11.get(a11);
        if (rVar == null) {
            h10.r b12 = i10.i.b(n(cls), list, z11, a00.h0.J());
            h10.r putIfAbsent = b11.putIfAbsent(a11, b12);
            rVar = putIfAbsent == null ? b12 : putIfAbsent;
        }
        kotlin.jvm.internal.g0.o(rVar, "getOrPut(...)");
        return rVar;
    }

    @m80.k
    public static final <T> kotlin.reflect.jvm.internal.f<T> n(@m80.k Class<T> jClass) {
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        h10.g b11 = f64938a.b(jClass);
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (kotlin.reflect.jvm.internal.f) b11;
    }

    @m80.k
    public static final <T> h10.h o(@m80.k Class<T> jClass) {
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        return f64939b.b(jClass);
    }
}
