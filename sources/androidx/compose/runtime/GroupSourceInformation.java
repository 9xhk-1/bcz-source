package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n1#2:3964\n799#3,8:3965\n789#3,7:3973\n90#4,2:3980\n33#4,6:3982\n92#4:3988\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n733#1:3965,8\n749#1:3973,7\n760#1:3980,2\n760#1:3982,6\n760#1:3988\n*E\n"})
/* loaded from: classes.dex */
public final class GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;

    @l
    private ArrayList<Object> groups;
    private final int key;

    @l
    private String sourceInformation;

    public GroupSourceInformation(int i11, @l String str, int i12) {
        this.key = i11;
        this.sourceInformation = str;
        this.dataStartOffset = i12;
    }

    private final void add(Object obj) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(obj);
    }

    private final boolean hasAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                if (g0.g(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final GroupSourceInformation openInformation() {
        Object obj;
        GroupSourceInformation openInformation;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
        }
        obj = null;
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (openInformation = groupSourceInformation.openInformation()) == null) ? this : openInformation;
    }

    public final void addGroupAfter(@k SlotWriter slotWriter, int i11, int i12) {
        Anchor tryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i13 = 0;
        if (i11 >= 0 && (tryAnchor$runtime_release = slotWriter.tryAnchor$runtime_release(i11)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i13 >= size) {
                    i13 = -1;
                    break;
                }
                Object obj = arrayList.get(i13);
                if (g0.g(obj, tryAnchor$runtime_release) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(tryAnchor$runtime_release))) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        arrayList.add(i13, slotWriter.anchor(i12));
    }

    public final void close(int i11) {
        this.closed = true;
        this.dataEndOffset = i11;
    }

    public final void endGrouplessCall(int i11) {
        openInformation().close(i11);
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    @l
    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final int getKey() {
        return this.key;
    }

    @l
    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean removeAnchor(@k Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (g0.g(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(@k SlotWriter slotWriter, int i11) {
        openInformation().add(slotWriter.anchor(i11));
    }

    public final void setClosed(boolean z11) {
        this.closed = z11;
    }

    public final void setDataEndOffset(int i11) {
        this.dataEndOffset = i11;
    }

    public final void setGroups(@l ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public final void setSourceInformation(@l String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int i11, @k String str, int i12) {
        openInformation().add(new GroupSourceInformation(i11, str, i12));
    }

    public final void reportGroup(@k SlotTable slotTable, int i11) {
        openInformation().add(slotTable.anchor(i11));
    }
}
