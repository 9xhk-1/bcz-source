package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import m80.k;
import x00.l;
import yz.g2;

/* loaded from: classes3.dex */
public final class RelationUtil {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(@k ArrayMap<K, V> arrayMap, boolean z11, @k l<? super ArrayMap<K, V>, g2> lVar) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z11, lVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(@k HashMap<K, V> hashMap, boolean z11, @k l<? super HashMap<K, V>, g2> lVar) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(hashMap, z11, lVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(@k LongSparseArray<V> longSparseArray, boolean z11, @k l<? super LongSparseArray<V>, g2> lVar) {
        RelationUtil__RelationUtilKt.recursiveFetchLongSparseArray(longSparseArray, z11, lVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(@k Map<K, V> map, boolean z11, @k l<? super Map<K, V>, g2> lVar) {
        RelationUtil__RelationUtilKt.recursiveFetchMap(map, z11, lVar);
    }
}
