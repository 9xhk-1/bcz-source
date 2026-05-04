package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, y00.a {

    @k
    private final Iterable<CompositionGroup> compositionGroups = this;

    @k
    private final SourceInformationGroupPath identityPath;

    @k
    private final Object key;
    private final int parent;

    @k
    private final GroupSourceInformation sourceInformation;

    @k
    private final SlotTable table;

    public SourceInformationSlotTableGroup(@k SlotTable slotTable, int i11, @k GroupSourceInformation groupSourceInformation, @k SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i11;
        this.sourceInformation = groupSourceInformation;
        this.identityPath = sourceInformationGroupPath;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @k
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @k
    public Iterable<Object> getData() {
        return new SourceInformationGroupDataIterator(this.table, this.parent, this.sourceInformation);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @k
    public Object getIdentity() {
        return this.identityPath.getIdentity(this.table);
    }

    @k
    public final SourceInformationGroupPath getIdentityPath() {
        return this.identityPath;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @k
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Object getNode() {
        return null;
    }

    public final int getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public String getSourceInfo() {
        return this.sourceInformation.getSourceInformation();
    }

    @k
    public final GroupSourceInformation getSourceInformation() {
        return this.sourceInformation;
    }

    @k
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        ArrayList<Object> groups = this.sourceInformation.getGroups();
        boolean z11 = false;
        if (groups != null && !groups.isEmpty()) {
            z11 = true;
        }
        return !z11;
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
