package androidx.collection;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    @k
    public static final <K, V> LruCache<K, V> lruCache(int i11, @k p<? super K, ? super V, Integer> sizeOf, @k l<? super K, ? extends V> create, @k r<? super Boolean, ? super K, ? super V, ? super V, g2> onEntryRemoved) {
        g0.p(sizeOf, "sizeOf");
        g0.p(create, "create");
        g0.p(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i11, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i11, p sizeOf, l create, r onEntryRemoved, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            sizeOf = new p<Object, Object, Integer>() { // from class: androidx.collection.LruCacheKt$lruCache$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.p
                public final Integer invoke(Object obj2, Object obj3) {
                    g0.p(obj2, "<anonymous parameter 0>");
                    g0.p(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i12 & 4) != 0) {
            create = new l<Object, Object>() { // from class: androidx.collection.LruCacheKt$lruCache$2
                @Override // x00.l
                public final Object invoke(Object it) {
                    g0.p(it, "it");
                    return null;
                }
            };
        }
        if ((i12 & 8) != 0) {
            onEntryRemoved = new r<Boolean, Object, Object, Object, g2>() { // from class: androidx.collection.LruCacheKt$lruCache$3
                public final void invoke(boolean z11, Object obj2, Object obj3, Object obj4) {
                    g0.p(obj2, "<anonymous parameter 1>");
                    g0.p(obj3, "<anonymous parameter 2>");
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    invoke(bool.booleanValue(), obj2, obj3, obj4);
                    return g2.f100423a;
                }
            };
        }
        g0.p(sizeOf, "sizeOf");
        g0.p(create, "create");
        g0.p(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i11, sizeOf, create, onEntryRemoved);
    }
}
