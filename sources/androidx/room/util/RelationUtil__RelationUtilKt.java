package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final /* synthetic */ class RelationUtil__RelationUtilKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(@k LongSparseArray<V> map, boolean z11, @k l<? super LongSparseArray<V>, g2> fetchBlock) {
        g0.p(map, "map");
        g0.p(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(999);
        int size = map.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (z11) {
                longSparseArray.put(map.keyAt(i11), map.valueAt(i11));
            } else {
                longSparseArray.put(map.keyAt(i11), null);
            }
            i11++;
            i12++;
            if (i12 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z11) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (z11) {
                return;
            }
            map.putAll(longSparseArray);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(@k Map<K, V> map, boolean z11, @k l<? super Map<K, V>, g2> fetchBlock) {
        int i11;
        g0.p(map, "map");
        g0.p(fetchBlock, "fetchBlock");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0: while (true) {
            i11 = 0;
            for (K k11 : map.keySet()) {
                if (z11) {
                    linkedHashMap.put(k11, map.get(k11));
                } else {
                    linkedHashMap.put(k11, null);
                }
                i11++;
                if (i11 == 999) {
                    fetchBlock.invoke(linkedHashMap);
                    if (!z11) {
                        map.putAll(linkedHashMap);
                    }
                    linkedHashMap.clear();
                }
            }
            break loop0;
        }
        if (i11 > 0) {
            fetchBlock.invoke(linkedHashMap);
            if (z11) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}
