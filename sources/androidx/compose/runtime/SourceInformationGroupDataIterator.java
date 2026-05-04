package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3777#2:3964\n3777#2:3965\n33#3,6:3966\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3408#1:3964\n3414#1:3965\n3421#1:3966,6\n*E\n"})
/* loaded from: classes.dex */
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, y00.a {
    private final int base;
    private final int end;

    @k
    private final BitVector filter;
    private int index;
    private final int start;

    @k
    private final SlotTable table;

    public SourceInformationGroupDataIterator(@k SlotTable slotTable, int i11, @k GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        int i12 = slotTable.getGroups()[(i11 * 5) + 4];
        this.base = i12;
        this.start = groupSourceInformation.getDataStartOffset();
        int dataEndOffset = groupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i13 = i11 + 1;
            dataEndOffset = (i13 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i13 * 5) + 4] : slotTable.getSlotsSize()) - i12;
        }
        this.end = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = groups.get(i14);
                if (obj instanceof GroupSourceInformation) {
                    GroupSourceInformation groupSourceInformation2 = (GroupSourceInformation) obj;
                    bitVector.setRange(groupSourceInformation2.getDataStartOffset(), groupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.filter = bitVector;
        this.index = bitVector.nextClear(this.start);
    }

    @k
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    @l
    public Object next() {
        int i11 = this.end;
        int i12 = this.index;
        Object obj = (i12 < 0 || i12 >= i11) ? null : this.table.getSlots()[this.base + this.index];
        this.index = this.filter.nextClear(this.index + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<Object> iterator() {
        return this;
    }
}
