package a00;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "MapAccessorsKt")
/* loaded from: classes8.dex */
public final class f1 {
    @o00.f
    public static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, h10.n<?> property) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(property, "property");
        return (V1) j1.a(map, property.getName());
    }

    @w00.j(name = "getVar")
    @o00.f
    public static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, h10.n<?> property) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(property, "property");
        return (V1) j1.a(map, property.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <V> void c(Map<? super String, ? super V> map, Object obj, h10.n<?> property, V v11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(property, "property");
        map.put(property.getName(), v11);
    }
}
