package androidx.collection;

import kotlin.jvm.internal.g0;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ l<K, V> $create;
    final /* synthetic */ r<Boolean, K, V, V, g2> $onEntryRemoved;
    final /* synthetic */ p<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i11, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, g2> rVar) {
        super(i11);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
    }

    @Override // androidx.collection.LruCache
    public V create(K key) {
        g0.p(key, "key");
        return this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    public void entryRemoved(boolean z11, K key, V oldValue, V v11) {
        g0.p(key, "key");
        g0.p(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z11), key, oldValue, v11);
    }

    @Override // androidx.collection.LruCache
    public int sizeOf(K key, V value) {
        g0.p(key, "key");
        g0.p(value, "value");
        return this.$sizeOf.invoke(key, value).intValue();
    }
}
