package androidx.compose.runtime;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class GroupInfo {
    private int nodeCount;
    private int nodeIndex;
    private int slotIndex;

    public GroupInfo(int i11, int i12, int i13) {
        this.slotIndex = i11;
        this.nodeIndex = i12;
        this.nodeCount = i13;
    }

    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void setNodeCount(int i11) {
        this.nodeCount = i11;
    }

    public final void setNodeIndex(int i11) {
        this.nodeIndex = i11;
    }

    public final void setSlotIndex(int i11) {
        this.slotIndex = i11;
    }
}
