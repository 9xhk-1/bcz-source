package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3963:1\n3777#2:3964\n3777#2:3965\n1#3:3966\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n*L\n3390#1:3964\n3392#1:3965\n*E\n"})
/* loaded from: classes.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, y00.a {
    private final int end;
    private int index;
    private final int start;

    @k
    private final SlotTable table;

    public DataIterator(@k SlotTable slotTable, int i11) {
        this.table = slotTable;
        int i12 = slotTable.getGroups()[(i11 * 5) + 4];
        this.start = i12;
        int i13 = i11 + 1;
        this.end = i13 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i13 * 5) + 4] : slotTable.getSlotsSize();
        this.index = i12;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
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
        int i11 = this.index;
        Object obj = (i11 < 0 || i11 >= this.table.getSlots().length) ? null : this.table.getSlots()[this.index];
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<Object> iterator() {
        return this;
    }
}
