package androidx.core.util;

import android.util.LruCache;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
/* loaded from: classes2.dex */
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

    @Override // android.util.LruCache
    @m80.l
    public V create(@k K k11) {
        return this.$create.invoke(k11);
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z11, @k K k11, @k V v11, @m80.l V v12) {
        this.$onEntryRemoved.invoke(Boolean.valueOf(z11), k11, v11, v12);
    }

    @Override // android.util.LruCache
    public int sizeOf(@k K k11, @k V v11) {
        return this.$sizeOf.invoke(k11, v11).intValue();
    }
}
