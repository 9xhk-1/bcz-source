package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.spatial.RectListKt;
import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n3746#2:3964\n3666#2:3965\n3666#2:3966\n3732#2:3967\n3732#2:3968\n3666#2:3969\n3726#2:3970\n3726#2:3971\n3672#2:3972\n3672#2:3973\n3726#2:3974\n3689#2:3975\n3698#2:3976\n3732#2:3977\n3746#2:3983\n3777#2:3984\n3777#2:3985\n3746#2:3991\n3777#2:3997\n3666#2:3998\n3666#2:4009\n3732#2:4010\n3746#2:4021\n3746#2:4032\n3777#2:4033\n3726#2:4034\n3666#2:4035\n3732#2:4036\n3825#2,6:4037\n3666#2:4043\n3669#2:4044\n3681#2:4045\n3672#2:4046\n33#3,5:3978\n33#3,5:3986\n33#3,5:3992\n33#3,5:3999\n4643#4,5:4004\n4643#4,5:4011\n4643#4,5:4016\n4643#4,5:4022\n4643#4,5:4027\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n873#1:3964\n877#1:3965\n880#1:3966\n887#1:3967\n890#1:3968\n893#1:3969\n924#1:3970\n928#1:3971\n938#1:3972\n941#1:3973\n962#1:3974\n965#1:3975\n971#1:3976\n975#1:3977\n985#1:3983\n994#1:3984\n1011#1:3985\n1062#1:3991\n1080#1:3997\n1087#1:3998\n1095#1:4009\n1095#1:4010\n1112#1:4021\n1140#1:4032\n1151#1:4033\n1168#1:4034\n1171#1:4035\n1171#1:4036\n1185#1:4037,6\n1188#1:4043\n1189#1:4044\n1193#1:4045\n1198#1:4046\n984#1:3978,5\n1044#1:3986,5\n1062#1:3992,5\n1087#1:3999,5\n1094#1:4004,5\n1102#1:4011,5\n1110#1:4016,5\n1125#1:4022,5\n1137#1:4027,5\n*E\n"})
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;

    @k
    private final IntStack currentSlotStack;
    private int emptyCount;

    @k
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;

    @k
    private final Object[] slots;
    private final int slotsSize;

    @l
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @k
    private final SlotTable table;

    public SlotReader(@k SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = slotReader.currentGroup;
        }
        return slotReader.anchor(i11);
    }

    private final Object aux(int[] iArr, int i11) {
        int auxIndex;
        if ((iArr[(i11 * 5) + 1] & 268435456) == 0) {
            return Composer.Companion.getEmpty();
        }
        Object[] objArr = this.slots;
        auxIndex = SlotTableKt.auxIndex(iArr, i11);
        return objArr[auxIndex];
    }

    private final Object objectKey(int[] iArr, int i11) {
        int objectKeyIndex;
        if ((iArr[(i11 * 5) + 1] & 536870912) == 0) {
            return null;
        }
        Object[] objArr = this.slots;
        objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i11);
        return objArr[objectKeyIndex];
    }

    @k
    public final Anchor anchor(int i11) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int search = SlotTableKt.search(anchors$runtime_release, i11, this.groupsSize);
        if (search >= 0) {
            return anchors$runtime_release.get(search);
        }
        Anchor anchor = new Anchor(i11);
        anchors$runtime_release.add(-(search + 1), anchor);
        return anchor;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final boolean containsMark(int i11) {
        return (this.groups[(i11 * 5) + 1] & 67108864) != 0;
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void endGroup() {
        int groupSize;
        int i11;
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i12 = iArr[(this.parent * 5) + 2];
            this.parent = i12;
            if (i12 < 0) {
                i11 = this.groupsSize;
            } else {
                groupSize = SlotTableKt.groupSize(iArr, i12);
                i11 = groupSize + i12;
            }
            this.currentEnd = i11;
            int pop = this.currentSlotStack.pop();
            if (pop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = pop;
                this.currentSlotEnd = i12 >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i12 + 1) * 5) + 4];
            }
        }
    }

    @k
    public final List<KeyInfo> extractKeys() {
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i11 = 0;
            int i12 = this.currentGroup;
            while (true) {
                int i13 = i11;
                if (i12 >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i14 = i12 * 5;
                int i15 = iArr[i14];
                Object objectKey = objectKey(iArr, i12);
                int i16 = 1;
                int i17 = this.groups[i14 + 1];
                if ((1073741824 & i17) == 0) {
                    i16 = i17 & RectListKt.Lower26Bits;
                }
                i11 = i13 + 1;
                arrayList.add(new KeyInfo(i15, objectKey, i12, i16, i13));
                groupSize = SlotTableKt.groupSize(this.groups, i12);
                i12 += groupSize;
            }
        }
        return arrayList;
    }

    @l
    public final Object get(int i11) {
        int i12 = this.currentSlot + i11;
        return i12 < this.currentSlotEnd ? this.slots[i12] : Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    @l
    public final Object getGroupAux() {
        int i11 = this.currentGroup;
        if (i11 < this.currentEnd) {
            return aux(this.groups, i11);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i11 = this.currentGroup;
        if (i11 < this.currentEnd) {
            return this.groups[i11 * 5];
        }
        return 0;
    }

    @l
    public final Object getGroupNode() {
        int i11 = this.currentGroup;
        if (i11 < this.currentEnd) {
            return node(this.groups, i11);
        }
        return null;
    }

    @l
    public final Object getGroupObjectKey() {
        int i11 = this.currentGroup;
        if (i11 < this.currentEnd) {
            return objectKey(this.groups, i11);
        }
        return null;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i11 = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i11);
        int i12 = i11 + 1;
        return (i12 < this.groupsSize ? this.groups[(i12 * 5) + 4] : this.slotsSize) - slotAnchor;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i11 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i11 - slotAnchor;
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i11 = this.currentGroup;
        return i11 < this.currentEnd && (this.groups[(i11 * 5) + 1] & 536870912) != 0;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return this.groups[(this.currentGroup * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i11 = this.parent;
        if (i11 >= 0) {
            return this.groups[(i11 * 5) + 1] & RectListKt.Lower26Bits;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i11 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i11 - slotAnchor;
    }

    @k
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @l
    public final Object groupAux(int i11) {
        return aux(this.groups, i11);
    }

    public final int groupEnd(int i11) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i11);
        return i11 + groupSize;
    }

    @l
    public final Object groupGet(int i11) {
        return groupGet(this.currentGroup, i11);
    }

    public final int groupKey(int i11) {
        return this.groups[i11 * 5];
    }

    @l
    public final Object groupObjectKey(int i11) {
        return objectKey(this.groups, i11);
    }

    public final int groupSize(int i11) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i11);
        return groupSize;
    }

    public final boolean hasMark(int i11) {
        return (this.groups[(i11 * 5) + 1] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean hasObjectKey(int i11) {
        return (this.groups[(i11 * 5) + 1] & 536870912) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & 1073741824) != 0;
    }

    @l
    public final Object next() {
        int i11;
        if (this.emptyCount > 0 || (i11 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i11 + 1;
        return objArr[i11];
    }

    @l
    public final Object node(int i11) {
        int[] iArr = this.groups;
        if ((iArr[(i11 * 5) + 1] & 1073741824) != 0) {
            return node(iArr, i11);
        }
        return null;
    }

    public final int nodeCount(int i11) {
        return this.groups[(i11 * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int i11) {
        return this.groups[(i11 * 5) + 2];
    }

    public final int parentOf(int i11) {
        if (!(i11 >= 0 && i11 < this.groupsSize)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + i11);
        }
        return this.groups[(i11 * 5) + 2];
    }

    public final void reposition(int i11) {
        int groupSize;
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = i11;
        int i12 = this.groupsSize;
        int i13 = i11 < i12 ? this.groups[(i11 * 5) + 2] : -1;
        this.parent = i13;
        if (i13 < 0) {
            this.currentEnd = i12;
        } else {
            groupSize = SlotTableKt.groupSize(this.groups, i13);
            this.currentEnd = i13 + groupSize;
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int i11) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i11);
        int i12 = groupSize + i11;
        int i13 = this.currentGroup;
        if (!(i13 >= i11 && i13 <= i12)) {
            ComposerKt.composeImmediateRuntimeError("Index " + i11 + " is not a parent of " + i13);
        }
        this.parent = i11;
        this.currentEnd = i12;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int skipGroup() {
        int groupSize;
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i11 = this.currentGroup;
        int i12 = (iArr[(i11 * 5) + 1] & 1073741824) == 0 ? iArr[(i11 * 5) + 1] & RectListKt.Lower26Bits : 1;
        groupSize = SlotTableKt.groupSize(iArr, i11);
        this.currentGroup = i11 + groupSize;
        return i12;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void startGroup() {
        int groupSize;
        int slotAnchor;
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i11 = this.parent;
            int i12 = this.currentGroup;
            if (!(this.groups[(i12 * 5) + 2] == i11)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
            if (hashMap != null && (groupSourceInformation = hashMap.get(anchor(i11))) != null) {
                groupSourceInformation.reportGroup(this.table, i12);
            }
            IntStack intStack = this.currentSlotStack;
            int i13 = this.currentSlot;
            int i14 = this.currentSlotEnd;
            if (i13 == 0 && i14 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i13);
            }
            this.parent = i12;
            groupSize = SlotTableKt.groupSize(this.groups, i12);
            this.currentEnd = groupSize + i12;
            int i15 = i12 + 1;
            this.currentGroup = i15;
            slotAnchor = SlotTableKt.slotAnchor(this.groups, i12);
            this.currentSlot = slotAnchor;
            this.currentSlotEnd = i12 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i15 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.currentGroup * 5) + 1] & 1073741824) != 0)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    @k
    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    @l
    public final Object groupGet(int i11, int i12) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i11);
        int i13 = i11 + 1;
        int i14 = slotAnchor + i12;
        return i14 < (i13 < this.groupsSize ? this.groups[(i13 * 5) + 4] : this.slotsSize) ? this.slots[i14] : Composer.Companion.getEmpty();
    }

    public final int groupKey(@k Anchor anchor) {
        if (anchor.getValid()) {
            return this.groups[this.table.anchorIndex(anchor) * 5];
        }
        return 0;
    }

    public final boolean isNode(int i11) {
        return (this.groups[(i11 * 5) + 1] & 1073741824) != 0;
    }

    private final Object node(int[] iArr, int i11) {
        int i12 = i11 * 5;
        if ((iArr[i12 + 1] & 1073741824) != 0) {
            return this.slots[iArr[i12 + 4]];
        }
        return Composer.Companion.getEmpty();
    }
}
