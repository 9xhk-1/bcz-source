package j50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n72#2,2:220\n72#2,2:229\n1#3:222\n1#3:232\n212#4:223\n213#4:228\n214#4:231\n1563#5:224\n1634#5,3:225\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n158#1:220,2\n159#1:229,2\n158#1:222\n159#1:232\n159#1:223\n159#1:228\n159#1:231\n159#1:224\n159#1:225,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a0<T> implements e2<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.p<h10.d<Object>, List<? extends h10.r>, f50.i<T>> f63326a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<Class<?>, d2<T>> f63327b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@m80.k x00.p<? super h10.d<Object>, ? super List<? extends h10.r>, ? extends f50.i<T>> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f63326a = compute;
        this.f63327b = new ConcurrentHashMap<>();
    }

    @Override // j50.e2
    @m80.k
    public Object a(@m80.k h10.d<Object> key, @m80.k List<? extends h10.r> types) {
        Object m6308constructorimpl;
        d2<T> putIfAbsent;
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(types, "types");
        ConcurrentHashMap<Class<?>, d2<T>> concurrentHashMap = this.f63327b;
        Class<?> d11 = w00.b.d(key);
        d2<T> d2Var = concurrentHashMap.get(d11);
        if (d2Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(d11, (d2Var = new d2<>()))) != null) {
            d2Var = putIfAbsent;
        }
        d2<T> d2Var2 = d2Var;
        List<? extends h10.r> list = types;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c1((h10.r) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = d2Var2.f63347a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(this.f63326a.invoke(key, types));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            Result m6307boximpl = Result.m6307boximpl(m6308constructorimpl);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, m6307boximpl);
            obj = putIfAbsent2 == null ? m6307boximpl : putIfAbsent2;
        }
        kotlin.jvm.internal.g0.o(obj, "getOrPut(...)");
        return ((Result) obj).m6317unboximpl();
    }
}
