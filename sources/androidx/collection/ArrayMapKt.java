package androidx.collection;

import kotlin.Pair;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ArrayMapKt")
/* loaded from: classes.dex */
public final class ArrayMapKt {
    @k
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    @k
    public static final <K, V> ArrayMap<K, V> arrayMapOf(@k Pair<? extends K, ? extends V>... pairs) {
        g0.p(pairs, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(pairs.length);
        for (Pair<? extends K, ? extends V> pair : pairs) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }
}
