package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AnchoredGroupPath extends SourceInformationGroupPath {
    private final int group;

    public AnchoredGroupPath(int i11) {
        super(null);
        this.group = i11;
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    @k
    public Object getIdentity(@k SlotTable slotTable) {
        return slotTable.anchor(this.group);
    }
}
