package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3963:1\n1#2:3964\n*E\n"})
/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, y00.a {

    @k
    private final GroupSourceInformation group;
    private int index;
    private final int parent;

    @k
    private final SourceInformationGroupPath path;

    @k
    private final SlotTable table;
    private final int version;

    public SourceInformationGroupIterator(@k SlotTable slotTable, int i11, @k GroupSourceInformation groupSourceInformation, @k SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i11;
        this.group = groupSourceInformation;
        this.path = sourceInformationGroupPath;
        this.version = slotTable.getVersion$runtime_release();
    }

    @k
    public final GroupSourceInformation getGroup() {
        return this.group;
    }

    public final int getParent() {
        return this.parent;
    }

    @k
    public final SourceInformationGroupPath getPath() {
        return this.path;
    }

    @k
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @k
    public CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.group.getGroups();
        if (groups != null) {
            int i11 = this.index;
            this.index = i11 + 1;
            obj = groups.get(i11);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new SlotTableGroup(this.table, ((Anchor) obj).getLocation$runtime_release(), this.version);
        }
        if (obj instanceof GroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, this.parent, (GroupSourceInformation) obj, new RelativeGroupPath(this.path, this.index - 1));
        }
        ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }
}
