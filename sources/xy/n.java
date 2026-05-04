package xy;

import io.ktor.util.LRUCache;
import java.util.Collections;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f98604a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final float f98605b = 0.75f;

    @io.ktor.utils.io.b0
    @m80.k
    public static final <K, V> Map<K, V> a(@m80.k x00.l<? super K, ? extends V> supplier, @m80.k x00.l<? super V, g2> close, int i11) {
        kotlin.jvm.internal.g0.p(supplier, "supplier");
        kotlin.jvm.internal.g0.p(close, "close");
        Map<K, V> synchronizedMap = Collections.synchronizedMap(new LRUCache(supplier, close, i11));
        kotlin.jvm.internal.g0.o(synchronizedMap, "synchronizedMap(...)");
        return synchronizedMap;
    }
}
