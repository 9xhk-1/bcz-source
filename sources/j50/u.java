package j50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n1#3:234\n212#4:225\n213#4:230\n214#4:233\n1563#5:226\n1634#5,3:227\n72#6,2:231\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n128#1:220,3\n128#1:224\n128#1:223\n129#1:234\n129#1:225\n129#1:230\n129#1:233\n129#1:226\n129#1:227,3\n129#1:231,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u<T> implements e2<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.p<h10.d<Object>, List<? extends h10.r>, f50.i<T>> f63472a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v<d2<T>> f63473b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n1#1,219:1\n128#2:220\n*E\n"})
    public static final class a implements x00.a<T> {
        @Override // x00.a
        public final T invoke() {
            return (T) new d2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@m80.k x00.p<? super h10.d<Object>, ? super List<? extends h10.r>, ? extends f50.i<T>> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f63472a = compute;
        this.f63473b = new v<>();
    }

    @Override // j50.e2
    @m80.k
    public Object a(@m80.k h10.d<Object> key, @m80.k List<? extends h10.r> types) {
        Object obj;
        Object m6308constructorimpl;
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(types, "types");
        obj = this.f63473b.get(w00.b.d(key));
        kotlin.jvm.internal.g0.o(obj, "get(...)");
        q1 q1Var = (q1) obj;
        T t11 = q1Var.f63452a.get();
        if (t11 == null) {
            t11 = (T) q1Var.a(new a());
        }
        d2 d2Var = t11;
        List<? extends h10.r> list = types;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c1((h10.r) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = d2Var.f63347a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.a aVar = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(this.f63472a.invoke(key, types));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            Result m6307boximpl = Result.m6307boximpl(m6308constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m6307boximpl);
            obj2 = putIfAbsent == null ? m6307boximpl : putIfAbsent;
        }
        kotlin.jvm.internal.g0.o(obj2, "getOrPut(...)");
        return ((Result) obj2).m6317unboximpl();
    }
}
