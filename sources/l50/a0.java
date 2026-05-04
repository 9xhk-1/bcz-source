package l50;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n382#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<h50.f, Map<a<Object>, Object>> f69917a = z.a(16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> {
    }

    @m80.l
    public final <T> T a(@m80.k h50.f descriptor, @m80.k a<T> key) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(key, "key");
        Map<a<Object>, Object> map = this.f69917a.get(descriptor);
        T t11 = map != null ? (T) map.get(key) : null;
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    @m80.k
    public final <T> T b(@m80.k h50.f descriptor, @m80.k a<T> key, @m80.k x00.a<? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        T t11 = (T) a(descriptor, key);
        if (t11 != null) {
            return t11;
        }
        T invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final <T> void c(@m80.k h50.f descriptor, @m80.k a<T> key, @m80.k T value) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        Map<h50.f, Map<a<Object>, Object>> map = this.f69917a;
        Map<a<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = z.a(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}
