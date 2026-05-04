package androidx.core.util;

import android.util.LruCache;
import m80.k;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LruCacheKt {
    @k
    public static final <K, V> LruCache<K, V> lruCache(int i11, @k p<? super K, ? super V, Integer> pVar, @k l<? super K, ? extends V> lVar, @k r<? super Boolean, ? super K, ? super V, ? super V, g2> rVar) {
        return new LruCacheKt$lruCache$4(i11, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i11, p pVar, l lVar, r rVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            pVar = new p<Object, Object, Integer>() { // from class: androidx.core.util.LruCacheKt$lruCache$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.p
                @k
                public final Integer invoke(@k Object obj2, @k Object obj3) {
                    return 1;
                }
            };
        }
        if ((i12 & 4) != 0) {
            lVar = new l<Object, Object>() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // x00.l
                @m80.l
                public final Object invoke(@k Object obj2) {
                    return null;
                }
            };
        }
        if ((i12 & 8) != 0) {
            rVar = new r<Boolean, Object, Object, Object, g2>() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                public final void invoke(boolean z11, @k Object obj2, @k Object obj3, @m80.l Object obj4) {
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    invoke(bool.booleanValue(), obj2, obj3, obj4);
                    return g2.f100423a;
                }
            };
        }
        return new LruCacheKt$lruCache$4(i11, pVar, lVar, rVar);
    }
}
