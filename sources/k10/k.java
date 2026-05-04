package k10;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ClassValueCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes8.dex */
public final class k<V> extends a<V> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public volatile l<V> f64951a;

    public k(@m80.k x00.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f64951a = new l<>(compute);
    }

    @Override // k10.a
    public void a() {
        this.f64951a = this.f64951a.b();
    }

    @Override // k10.a
    public V b(@m80.k Class<?> key) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.g0.p(key, "key");
        l<V> lVar = this.f64951a;
        obj = lVar.get(key);
        V v11 = (V) ((SoftReference) obj).get();
        if (v11 != null) {
            return v11;
        }
        lVar.remove(key);
        obj2 = lVar.get(key);
        V v12 = (V) ((SoftReference) obj2).get();
        return v12 != null ? v12 : lVar.f64958a.invoke(key);
    }
}
