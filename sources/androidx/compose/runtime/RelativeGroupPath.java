package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class RelativeGroupPath extends SourceInformationGroupPath {
    private final int index;

    @k
    private final SourceInformationGroupPath parent;

    public RelativeGroupPath(@k SourceInformationGroupPath sourceInformationGroupPath, int i11) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i11;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    @k
    public Object getIdentity(@k SlotTable slotTable) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.getIdentity(slotTable), this.index);
    }

    public final int getIndex() {
        return this.index;
    }

    @k
    public final SourceInformationGroupPath getParent() {
        return this.parent;
    }
}
