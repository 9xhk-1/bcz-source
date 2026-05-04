package androidx.compose.runtime;

import a00.r0;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3963:1\n3672#2:3964\n3726#2:3965\n3681#2:3966\n3666#2,4:3967\n3777#2:3978\n3777#2:3979\n158#3,7:3971\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3238#1:3964\n3239#1:3965\n3243#1:3966\n3247#1:3967,4\n3278#1:3978\n3280#1:3979\n3258#1:3971,7\n*E\n"})
/* loaded from: classes.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, y00.a {
    private final int group;

    @k
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(@k SlotTable slotTable, int i11, int i12) {
        this.table = slotTable;
        this.group = i11;
        this.version = i12;
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, Anchor anchor) {
        int anchorIndex;
        int i11;
        int groupSize;
        if (!slotTableGroup.table.ownsAnchor(anchor) || (anchorIndex = slotTableGroup.table.anchorIndex(anchor)) < (i11 = slotTableGroup.group)) {
            return null;
        }
        int i12 = anchorIndex - i11;
        groupSize = SlotTableKt.groupSize(slotTableGroup.table.getGroups(), slotTableGroup.group);
        if (i12 < groupSize) {
            return new SlotTableGroup(slotTableGroup.table, anchorIndex, slotTableGroup.version);
        }
        return null;
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i11) {
        return (CompositionGroup) r0.L2(r0.g2(compositionGroup.getCompositionGroups(), i11));
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @l
    public CompositionGroup find(@k Object obj) {
        if (obj instanceof Anchor) {
            return find$findAnchoredGroup(this, (Anchor) obj);
        }
        if (obj instanceof SourceInformationSlotTableGroupIdentity) {
            SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
            CompositionGroup find = find(sourceInformationSlotTableGroupIdentity.getParentIdentity());
            if (find != null) {
                return find$findRelativeGroup(find, sourceInformationSlotTableGroupIdentity.getIndex());
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @k
    public Iterable<Object> getData() {
        GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        return sourceInformationOf != null ? new SourceInformationGroupDataIterator(this.table, this.group, sourceInformationOf) : new DataIterator(this.table, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @k
    public Object getIdentity() {
        validateRead();
        SlotReader openReader = this.table.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @k
    public Object getKey() {
        int objectKeyIndex;
        if ((this.table.getGroups()[(this.group * 5) + 1] & 536870912) == 0) {
            return Integer.valueOf(this.table.getGroups()[this.group * 5]);
        }
        Object[] slots = this.table.getSlots();
        objectKeyIndex = SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group);
        Object obj = slots[objectKeyIndex];
        g0.m(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Object getNode() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & 1073741824) != 0) {
            return this.table.getSlots()[this.table.getGroups()[(this.group * 5) + 4]];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int groupSize = this.group + getGroupSize();
        return (groupSize < this.table.getGroupsSize() ? this.table.getGroups()[(groupSize * 5) + 4] : this.table.getSlotsSize()) - this.table.getGroups()[(this.group * 5) + 4];
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public String getSourceInfo() {
        int auxIndex;
        int[] groups = this.table.getGroups();
        int i11 = this.group;
        if ((groups[(i11 * 5) + 1] & 268435456) == 0) {
            GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(i11);
            if (sourceInformationOf != null) {
                return sourceInformationOf.getSourceInformation();
            }
            return null;
        }
        Object[] slots = this.table.getSlots();
        auxIndex = SlotTableKt.auxIndex(this.table.getGroups(), this.group);
        Object obj = slots[auxIndex];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @k
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize == 0;
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<CompositionGroup> iterator() {
        int groupSize;
        validateRead();
        GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        if (sourceInformationOf != null) {
            SlotTable slotTable = this.table;
            int i11 = this.group;
            return new SourceInformationGroupIterator(slotTable, i11, sourceInformationOf, new AnchoredGroupPath(i11));
        }
        SlotTable slotTable2 = this.table;
        int i12 = this.group;
        groupSize = SlotTableKt.groupSize(slotTable2.getGroups(), this.group);
        return new GroupIterator(slotTable2, i12 + 1, i12 + groupSize);
    }

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i11, int i12, int i13, v vVar) {
        this(slotTable, i11, (i13 & 4) != 0 ? slotTable.getVersion$runtime_release() : i12);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @k
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
