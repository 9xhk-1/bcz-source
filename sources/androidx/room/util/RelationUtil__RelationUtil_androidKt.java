package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(@k ArrayMap<K, V> map, boolean z11, @k l<? super ArrayMap<K, V>, g2> fetchBlock) {
        g0.p(map, "map");
        g0.p(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (z11) {
                arrayMap.put(map.keyAt(i11), map.valueAt(i11));
            } else {
                arrayMap.put(map.keyAt(i11), null);
            }
            i11++;
            i12++;
            if (i12 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z11) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            fetchBlock.invoke(arrayMap);
            if (z11) {
                return;
            }
            map.putAll((Map) arrayMap);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(@k HashMap<K, V> map, boolean z11, @k l<? super HashMap<K, V>, g2> fetchBlock) {
        int i11;
        g0.p(map, "map");
        g0.p(fetchBlock, "fetchBlock");
        HashMap hashMap = new HashMap(999);
        loop0: while (true) {
            i11 = 0;
            for (K k11 : map.keySet()) {
                g0.o(k11, "next(...)");
                if (z11) {
                    hashMap.put(k11, map.get(k11));
                } else {
                    hashMap.put(k11, null);
                }
                i11++;
                if (i11 == 999) {
                    fetchBlock.invoke(hashMap);
                    if (!z11) {
                        map.putAll(hashMap);
                    }
                    hashMap.clear();
                }
            }
            break loop0;
        }
        if (i11 > 0) {
            fetchBlock.invoke(hashMap);
            if (z11) {
                return;
            }
            map.putAll(hashMap);
        }
    }
}
