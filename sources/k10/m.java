package k10;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n72#2,2:99\n1#3:101\n*S KotlinDebug\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n*L\n92#1:99,2\n92#1:101\n*E\n"})
/* loaded from: classes8.dex */
public final class m<V> extends a<V> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<Class<?>, V> f64964a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<Class<?>, V> f64965b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@m80.k x00.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f64964a = compute;
        this.f64965b = new ConcurrentHashMap<>();
    }

    @Override // k10.a
    public void a() {
        this.f64965b.clear();
    }

    @Override // k10.a
    public V b(@m80.k Class<?> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f64965b;
        V v11 = (V) concurrentHashMap.get(key);
        if (v11 != null) {
            return v11;
        }
        V invoke = this.f64964a.invoke(key);
        V v12 = (V) concurrentHashMap.putIfAbsent(key, invoke);
        return v12 == null ? invoke : v12;
    }
}
