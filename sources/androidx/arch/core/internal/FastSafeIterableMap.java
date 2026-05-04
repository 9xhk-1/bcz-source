package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    @Nullable
    public Map.Entry<K, V> ceil(K k11) {
        if (contains(k11)) {
            return this.mHashMap.get(k11).mPrevious;
        }
        return null;
    }

    public boolean contains(K k11) {
        return this.mHashMap.containsKey(k11);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    public SafeIterableMap.Entry<K, V> get(K k11) {
        return this.mHashMap.get(k11);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k11, @NonNull V v11) {
        SafeIterableMap.Entry<K, V> entry = get(k11);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k11, put(k11, v11));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k11) {
        V v11 = (V) super.remove(k11);
        this.mHashMap.remove(k11);
        return v11;
    }
}
