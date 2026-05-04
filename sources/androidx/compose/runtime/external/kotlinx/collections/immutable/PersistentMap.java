package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import m80.k;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<K, V> extends Map<K, V>, g {
        @k
        PersistentMap<K, V> build();
    }

    @k
    Builder<K, V> builder();

    @Override // java.util.Map
    @k
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    @k
    PersistentMap<K, V> put(K k11, V v11);

    @Override // java.util.Map
    @k
    PersistentMap<K, V> putAll(@k Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    @k
    PersistentMap<K, V> remove(K k11);

    @Override // java.util.Map
    @k
    PersistentMap<K, V> remove(K k11, V v11);
}
