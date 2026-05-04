package j50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1563#2:220\n1634#2,3:221\n72#3,2:224\n1#4:226\n1#4:227\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n*L\n212#1:220\n212#1:221,3\n213#1:224,2\n213#1:227\n*E\n"})
/* loaded from: classes8.dex */
public final class d2<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<List<c1>, Result<f50.i<T>>> f63347a = new ConcurrentHashMap<>();

    @m80.k
    public final Object b(@m80.k List<? extends h10.r> types, @m80.k x00.a<? extends f50.i<T>> producer) {
        Object m6308constructorimpl;
        kotlin.jvm.internal.g0.p(types, "types");
        kotlin.jvm.internal.g0.p(producer, "producer");
        List<? extends h10.r> list = types;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c1((h10.r) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.f63347a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(producer.invoke());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            Result m6307boximpl = Result.m6307boximpl(m6308constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m6307boximpl);
            obj = putIfAbsent == null ? m6307boximpl : putIfAbsent;
        }
        kotlin.jvm.internal.g0.o(obj, "getOrPut(...)");
        return ((Result) obj).m6317unboximpl();
    }
}
