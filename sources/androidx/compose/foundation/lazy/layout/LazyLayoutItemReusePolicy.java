package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1855#2,2:113\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy\n*L\n92#1:113,2\n*E\n"})
/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {

    @k
    private final MutableObjectIntMap<Object> countPerType = ObjectIntMapKt.mutableObjectIntMapOf();

    @k
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(@k LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.factory = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@l Object obj, @l Object obj2) {
        return g0.g(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@k SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        this.countPerType.clear();
        for (Object obj : slotIdsSet) {
            Object contentType = this.factory.getContentType(obj);
            int orDefault = this.countPerType.getOrDefault(contentType, 0);
            if (orDefault == 7) {
                slotIdsSet.remove(obj);
            } else {
                this.countPerType.set(contentType, orDefault + 1);
            }
        }
    }
}
