package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i11) {
        this.maxSlotsToRetainForReuse = i11;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@l Object obj, @l Object obj2) {
        return true;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@k SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int size = slotIdsSet.size();
        int i11 = this.maxSlotsToRetainForReuse;
        if (size > i11) {
            slotIdsSet.trimToSize(i11);
        }
    }
}
