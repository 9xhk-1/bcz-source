package c00;

import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import o00.f;
import w00.j;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "CollectionsJDK8Kt")
/* loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.2")
    @f
    public static final <K, V> V a(Map<? extends K, ? extends V> map, K k11, V v11) {
        g0.p(map, "<this>");
        return map.getOrDefault(k11, v11);
    }

    @y0(version = "1.2")
    @f
    public static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k11, V v11) {
        g0.p(map, "<this>");
        return x0.k(map).remove(k11, v11);
    }
}
