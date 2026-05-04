package androidx.compose.runtime;

import a00.a0;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.spatial.RectListKt;
import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import pn.j;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n158#1,7:4029\n174#1,4:4036\n179#1,3:4047\n27#2:3964\n33#2,2:4022\n1#3:3965\n1#3:4046\n4643#4,5:3966\n4643#4,5:3971\n4643#4,5:3976\n4643#4,5:3992\n4643#4,5:3997\n4643#4,5:4007\n4643#4,5:4012\n4643#4,5:4017\n33#5,5:3981\n33#5,5:4002\n33#5,5:4024\n48#5,5:4052\n48#5,5:4057\n33#5,5:4066\n33#5,5:4071\n33#5,5:4077\n33#5,5:4082\n48#5,5:4099\n48#5,5:4104\n48#5,5:4109\n48#5,5:4116\n48#5,5:4121\n48#5,5:4126\n48#5,5:4134\n48#5,5:4141\n48#5,5:4147\n48#5,5:4152\n48#5,5:4159\n33#5,5:4168\n33#5,5:4173\n3825#6,6:3986\n3698#6:4050\n3746#6:4051\n3726#6:4087\n3732#6:4088\n3689#6:4089\n3698#6:4090\n3672#6:4091\n3666#6:4092\n3669#6:4093\n3681#6:4094\n3777#6:4095\n3777#6:4096\n3777#6:4097\n3746#6:4098\n3777#6:4114\n3777#6:4115\n3666#6:4131\n3672#6:4132\n3681#6:4133\n3666#6:4139\n3669#6:4140\n3732#6:4146\n3708#6:4157\n3698#6:4158\n3777#6:4179\n33#7,6:4040\n33#7,4:4062\n38#7:4076\n33#7,4:4164\n38#7:4178\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n346#1:4029,7\n382#1:4036,4\n382#1:4047,3\n123#1:3964\n268#1:4022,2\n382#1:4046\n202#1:3966,5\n203#1:3971,5\n219#1:3976,5\n226#1:3992,5\n237#1:3997,5\n254#1:4007,5\n255#1:4012,5\n265#1:4017,5\n220#1:3981,5\n238#1:4002,5\n294#1:4024,5\n493#1:4052,5\n500#1:4057,5\n509#1:4066,5\n512#1:4071,5\n533#1:4077,5\n534#1:4082,5\n434#1:4099,5\n439#1:4104,5\n442#1:4109,5\n448#1:4116,5\n451#1:4121,5\n453#1:4126,5\n458#1:4134,5\n462#1:4141,5\n471#1:4147,5\n476#1:4152,5\n481#1:4159,5\n521#1:4168,5\n522#1:4173,5\n221#1:3986,6\n399#1:4050\n418#1:4051\n588#1:4087\n593#1:4088\n596#1:4089\n599#1:4090\n605#1:4091\n612#1:4092\n613#1:4093\n615#1:4094\n660#1:4095\n661#1:4096\n667#1:4097\n433#1:4098\n446#1:4114\n447#1:4115\n455#1:4131\n456#1:4132\n457#1:4133\n461#1:4139\n462#1:4140\n469#1:4146\n480#1:4157\n481#1:4158\n589#1:4179\n384#1:4040,6\n507#1:4062,4\n507#1:4076\n518#1:4164,4\n518#1:4178\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, y00.a {
    public static final int $stable = 8;

    @l
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;

    @l
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;

    @k
    private int[] groups = new int[0];

    @k
    private Object[] slots = new Object[0];

    @k
    private final Object lock = new Object();

    @k
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        List<Integer> dataAnchors;
        dataAnchors = SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
        return dataAnchors;
    }

    private final int emitGroup(StringBuilder sb2, int i11, int i12) {
        int groupSize;
        int slotAnchor;
        String summarize;
        int auxIndex;
        String summarize2;
        String summarize3;
        int objectKeyIndex;
        String summarize4;
        String sourceInformation;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i11);
        sb2.append(j.f81007d);
        GroupSourceInformation sourceInformationOf = sourceInformationOf(i11);
        if (sourceInformationOf != null && (sourceInformation = sourceInformationOf.getSourceInformation()) != null && (f0.J2(sourceInformation, "C(", false, 2, null) || f0.J2(sourceInformation, "CC(", false, 2, null))) {
            int J3 = k0.J3(sourceInformation, j.f81006c, 0, false, 6, null) + 1;
            int I3 = k0.I3(sourceInformation, ')', 0, false, 6, null);
            sb2.append(" ");
            String substring = sourceInformation.substring(J3, I3);
            g0.o(substring, "substring(...)");
            sb2.append(substring);
            sb2.append("()");
        }
        sb2.append(" key=");
        int i14 = i11 * 5;
        sb2.append(this.groups[i14]);
        groupSize = SlotTableKt.groupSize(this.groups, i11);
        sb2.append(", nodes=");
        int i15 = i14 + 1;
        sb2.append(this.groups[i15] & RectListKt.Lower26Bits);
        sb2.append(", size=");
        sb2.append(groupSize);
        if ((this.groups[i15] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            sb2.append(", mark");
        }
        if ((this.groups[i15] & 67108864) != 0) {
            sb2.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i11);
        int i16 = i11 + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i16);
        if (emitGroup$dataIndex < 0 || emitGroup$dataIndex > emitGroup$dataIndex2 || emitGroup$dataIndex2 > this.slotsSize) {
            sb2.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + '*');
        } else {
            if ((this.groups[i15] & 536870912) != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" objectKey=");
                Object[] objArr = this.slots;
                objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, i11);
                summarize4 = SlotTableKt.summarize(String.valueOf(objArr[objectKeyIndex]), 10);
                sb3.append(summarize4);
                sb2.append(sb3.toString());
            }
            if ((this.groups[i15] & 1073741824) != 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" node=");
                summarize3 = SlotTableKt.summarize(String.valueOf(this.slots[this.groups[i14 + 4]]), 10);
                sb4.append(summarize3);
                sb2.append(sb4.toString());
            }
            if ((this.groups[i15] & 268435456) != 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" aux=");
                Object[] objArr2 = this.slots;
                auxIndex = SlotTableKt.auxIndex(this.groups, i11);
                summarize2 = SlotTableKt.summarize(String.valueOf(objArr2[auxIndex]), 10);
                sb5.append(summarize2);
                sb2.append(sb5.toString());
            }
            slotAnchor = SlotTableKt.slotAnchor(this.groups, i11);
            if (slotAnchor < emitGroup$dataIndex2) {
                sb2.append(", slots=[");
                sb2.append(slotAnchor);
                sb2.append(": ");
                for (int i17 = slotAnchor; i17 < emitGroup$dataIndex2; i17++) {
                    if (i17 != slotAnchor) {
                        sb2.append(j2.O);
                    }
                    summarize = SlotTableKt.summarize(String.valueOf(this.slots[i17]), 10);
                    sb2.append(summarize);
                }
                sb2.append("]");
            }
        }
        sb2.append('\n');
        int i18 = i11 + groupSize;
        while (i16 < i18) {
            i16 += emitGroup(sb2, i16, i12 + 1);
        }
        return groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i11) {
        return i11 >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i11 * 5) + 4];
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i11) {
        int i12 = i11;
        while (i12 > 0) {
            Iterator<Object> it = new DataIterator(this, i12).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i12 != i11) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i12 = this.groups[(i12 * 5) + 2];
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        List<Integer> groupSizes;
        groupSizes = SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
        return groupSizes;
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl findEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!mutableIntSet.contains(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, booleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (booleanRef.element) {
            RecomposeScopeImpl findEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (findEffectiveRecomposeScope2 != null) {
                list2.add(findEffectiveRecomposeScope2);
                Anchor anchor = findEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && anchor.getLocation$runtime_release() == slotReader.getCurrentGroup() && (findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(findEffectiveRecomposeScope);
                }
            } else {
                booleanRef.element = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        List<Integer> keys;
        keys = SlotTableKt.keys(this.groups, this.groupsSize * 5);
        return keys;
    }

    private final List<Integer> nodes() {
        List<Integer> nodeCounts;
        nodeCounts = SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
        return nodeCounts;
    }

    private final List<Integer> parentIndexes() {
        List<Integer> parentAnchors;
        parentAnchors = SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
        return parentAnchors;
    }

    private final Anchor tryAnchor(int i11) {
        int i12;
        Anchor find;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (i11 < 0 || i11 >= (i12 = this.groupsSize)) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, i11, i12);
        return find;
    }

    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i11, int i12) {
        int groupSize;
        int slotAnchor;
        int groupSize2;
        int i13 = intRef.element;
        int i14 = i13 + 1;
        intRef.element = i14;
        int i15 = i13 * 5;
        int i16 = slotTable.groups[i15 + 2];
        if (!(i16 == i11)) {
            PreconditionsKt.throwIllegalStateException("Invalid parent index detected at " + i13 + ", expected parent index to be " + i11 + " found " + i16);
        }
        groupSize = SlotTableKt.groupSize(slotTable.groups, i13);
        int i17 = groupSize + i13;
        if (!(i17 <= slotTable.groupsSize)) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i13);
        }
        if (!(i17 <= i12)) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i13);
        }
        int[] iArr = slotTable.groups;
        int i18 = i15 + 4;
        int i19 = iArr[i18];
        int i21 = i13 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i14 * 5) + 4];
        if (!(i21 <= slotTable.slots.length)) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i13 + " extend past the end of the slot table");
        }
        if (!(i19 <= i21)) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i13);
        }
        slotAnchor = SlotTableKt.slotAnchor(slotTable.groups, i13);
        if (!(slotAnchor <= i21)) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i13);
        }
        int i22 = i15 + 1;
        int i23 = slotTable.groups[i22];
        if (!(i21 - i19 >= (((i23 & 1073741824) != 0 ? 1 : 0) + ((536870912 & i23) != 0 ? 1 : 0)) + ((i23 & 268435456) != 0 ? 1 : 0))) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i13);
        }
        int[] iArr2 = slotTable.groups;
        boolean z11 = (iArr2[i22] & 1073741824) != 0;
        if (!((z11 && slotTable.slots[iArr2[i18]] == null) ? false : true)) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i13);
        }
        int i24 = 0;
        while (intRef.element < i17) {
            i24 += verifyWellFormed$validateGroup(intRef, slotTable, i13, i17);
        }
        int[] iArr3 = slotTable.groups;
        int i25 = iArr3[i22] & RectListKt.Lower26Bits;
        groupSize2 = SlotTableKt.groupSize(iArr3, i13);
        if (!(i25 == i24)) {
            PreconditionsKt.throwIllegalStateException("Incorrect node count detected at " + i13 + ", expected " + i25 + ", received " + i24);
        }
        int i26 = intRef.element - i13;
        if (!(groupSize2 == i26)) {
            PreconditionsKt.throwIllegalStateException("Incorrect slot count detected at " + i13 + ", expected " + groupSize2 + ", received " + i26);
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i22] & 201326592) != 0) {
            if (!(i13 <= 0 || (iArr4[(i11 * 5) + 1] & 67108864) != 0)) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i11 + " to record it contains a mark because " + i13 + " does");
            }
        }
        if (z11) {
            return 1;
        }
        return i24;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = groups.get(i11);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    @k
    public final Anchor anchor(int i11) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.groupsSize) {
            z11 = true;
        }
        if (!z11) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i11, this.groupsSize);
        if (search >= 0) {
            return arrayList.get(search);
        }
        Anchor anchor = new Anchor(i11);
        arrayList.add(-(search + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@k Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation$runtime_release();
    }

    public final void close$runtime_release(@k SlotReader slotReader, @l HashMap<Anchor, GroupSourceInformation> hashMap) {
        if (!(slotReader.getTable$runtime_release() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (hashMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<Anchor, GroupSourceInformation> hashMap2 = this.sourceInformationMap;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.sourceInformationMap = hashMap;
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & 67108864) != 0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @l
    public CompositionGroup find(@k Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }

    @k
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @l
    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    @k
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @k
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    @l
    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int i11, @k Anchor anchor) {
        int groupSize;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(i11 >= 0 && i11 < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            groupSize = SlotTableKt.groupSize(this.groups, i11);
            int i12 = groupSize + i11;
            int location$runtime_release = anchor.getLocation$runtime_release();
            if (i11 <= location$runtime_release && location$runtime_release < i12) {
                return true;
            }
        }
        return false;
    }

    @l
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i11) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(i11);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(i11)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(openReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            g2 g2Var = g2.f100423a;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Anchor anchor = (Anchor) arrayList.get(i12);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashCurrentGroup();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close(true);
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                openWriter.close(false);
                throw th2;
            }
        } catch (Throwable th3) {
            openReader.close();
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @k
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    @k
    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@k Anchor anchor) {
        int search;
        return anchor.getValid() && (search = SlotTableKt.search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize)) >= 0 && g0.g(this.anchors.get(search), anchor);
    }

    public final <T> T read(@k x00.l<? super SlotReader, ? extends T> lVar) {
        SlotReader openReader = openReader();
        try {
            return lVar.invoke(openReader);
        } finally {
            d0.d(1);
            openReader.close();
            d0.c(1);
        }
    }

    public final void setAnchors$runtime_release(@k ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime_release(@l MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setSourceInformationMap$runtime_release(@l HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final void setTo$runtime_release(@k int[] iArr, int i11, @k Object[] objArr, int i12, @k ArrayList<Anchor> arrayList, @l HashMap<Anchor, GroupSourceInformation> hashMap, @l MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.groups = iArr;
        this.groupsSize = i11;
        this.slots = objArr;
        this.slotsSize = i12;
        this.anchors = arrayList;
        this.sourceInformationMap = hashMap;
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setVersion$runtime_release(int i11) {
        this.version = i11;
    }

    @l
    public final Object slot$runtime_release(int i11, int i12) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i11);
        int i13 = i11 + 1;
        return (i12 < 0 || i12 >= (i13 < this.groupsSize ? this.groups[(i13 * 5) + 4] : this.slots.length) - slotAnchor) ? Composer.Companion.getEmpty() : this.slots[slotAnchor + i12];
    }

    @k
    public final List<Object> slotsOf$runtime_release(int i11) {
        int[] iArr = this.groups;
        int i12 = iArr[(i11 * 5) + 4];
        int i13 = i11 + 1;
        return a0.dz(this.slots).subList(i12, i13 < this.groupsSize ? iArr[(i13 * 5) + 4] : this.slots.length);
    }

    @l
    public final GroupSourceInformation sourceInformationOf(int i11) {
        Anchor tryAnchor;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(i11)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    @k
    public final String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i11 = this.groupsSize;
        if (i11 > 0) {
            int i12 = 0;
            while (i12 < i11) {
                i12 += emitGroup(sb2, i12, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final void verifyWellFormed() {
        int i11;
        int i12;
        int groupSize;
        Ref.IntRef intRef = new Ref.IntRef();
        int i13 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i11 = intRef.element;
                i12 = this.groupsSize;
                if (i11 >= i12) {
                    break;
                }
                groupSize = SlotTableKt.groupSize(this.groups, i11);
                verifyWellFormed$validateGroup(intRef, this, -1, i11 + groupSize);
            }
            if (!(i11 == i12)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i14 = this.slotsSize; i14 < length; i14++) {
            if (!(this.slots[i14] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i14);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            int indexFor = arrayList.get(i15).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i13 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i15++;
            i13 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : hashMap.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    public final <T> T write(@k x00.l<? super SlotWriter, ? extends T> lVar) {
        SlotWriter openWriter = openWriter();
        try {
            T invoke = lVar.invoke(openWriter);
            d0.d(1);
            openWriter.close(true);
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            d0.d(1);
            openWriter.close(false);
            d0.c(1);
            throw th2;
        }
    }

    public final void close$runtime_release(@k SlotWriter slotWriter, @k int[] iArr, int i11, @k Object[] objArr, int i12, @k ArrayList<Anchor> arrayList, @l HashMap<Anchor, GroupSourceInformation> hashMap, @l MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        if (!(slotWriter.getTable$runtime_release() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(iArr, i11, objArr, i12, arrayList, hashMap, mutableIntObjectMap);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @k
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
