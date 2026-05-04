package j50;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n72#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n142#1:220,2\n142#1:222\n*E\n"})
/* loaded from: classes8.dex */
public final class z<T> implements y2<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<h10.d<?>, f50.i<T>> f63515a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<Class<?>, m<T>> f63516b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@m80.k x00.l<? super h10.d<?>, ? extends f50.i<T>> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f63515a = compute;
        this.f63516b = new ConcurrentHashMap<>();
    }

    @Override // j50.y2
    public boolean b(@m80.k h10.d<?> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f63516b.containsKey(w00.b.d(key));
    }

    @Override // j50.y2
    @m80.l
    public f50.i<T> c(@m80.k h10.d<Object> key) {
        m<T> putIfAbsent;
        kotlin.jvm.internal.g0.p(key, "key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f63516b;
        Class<?> d11 = w00.b.d(key);
        m<T> mVar = concurrentHashMap.get(d11);
        if (mVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(d11, (mVar = new m<>(this.f63515a.invoke(key))))) != null) {
            mVar = putIfAbsent;
        }
        return mVar.f63422a;
    }
}
