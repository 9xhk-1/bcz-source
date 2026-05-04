package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, y00.a {
    private final int end;
    private int index;

    @k
    private final SlotTable table;
    private final int version;

    public GroupIterator(@k SlotTable slotTable, int i11, int i12) {
        this.table = slotTable;
        this.end = i12;
        this.index = i11;
        this.version = slotTable.getVersion$runtime_release();
        if (slotTable.getWriter$runtime_release()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
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
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @k
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i11 = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i11);
        this.index = groupSize + i11;
        return new SlotTableGroup(this.table, i11, this.version);
    }
}
