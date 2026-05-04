package androidx.compose.runtime;

import a00.h0;
import a00.q;
import a00.r0;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.spatial.RectListKt;
import androidx.media3.common.C;
import g10.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import pn.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n+ 10 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 11 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3666#2:3964\n3666#2:3965\n3732#2:3966\n3726#2:3967\n3672#2:3968\n3681#2:3969\n3666#2:3970\n3681#2:3997\n3681#2:4008\n3732#2:4067\n3666#2:4068\n3732#2:4080\n3732#2:4081\n3666#2:4082\n3666#2:4093\n3732#2:4094\n3666#2:4146\n3732#2:4147\n3825#2,6:4182\n3689#2:4188\n3698#2:4189\n3698#2:4190\n3708#2:4191\n3698#2:4192\n3708#2:4193\n3749#2,2:4194\n3746#2:4202\n3749#2,2:4203\n3777#2:4209\n3780#2,2:4215\n3777#2:4217\n3780#2,2:4223\n3780#2,2:4225\n3666#2:4231\n3746#2:4243\n3726#2:4244\n3732#2:4245\n3777#2:4246\n3746#2:4247\n3666#2:4248\n3777#2:4249\n3746#2:4265\n3746#2:4271\n3746#2:4282\n3777#2:4283\n3780#2,2:4284\n3663#2:4286\n3723#2:4287\n82#3:3971\n53#3:4056\n4643#4,5:3972\n4643#4,5:3980\n4665#4:3985\n4643#4,5:3986\n4665#4:3991\n4643#4,5:3992\n4643#4,5:3998\n4643#4,5:4003\n4643#4,5:4009\n4643#4,5:4026\n4643#4,5:4031\n4643#4,5:4036\n4643#4,5:4046\n4643#4,5:4057\n4643#4,5:4062\n4643#4,5:4075\n4643#4,5:4083\n4643#4,5:4088\n4643#4,5:4095\n4643#4,5:4100\n4643#4,5:4105\n4643#4,5:4110\n4643#4,5:4117\n4665#4:4122\n4643#4,5:4123\n4665#4:4128\n4643#4,5:4129\n4665#4:4134\n4643#4,5:4135\n4665#4:4140\n4643#4,5:4141\n4665#4:4148\n4643#4,5:4149\n4665#4:4154\n4643#4,5:4155\n4665#4:4168\n4643#4,5:4169\n4665#4:4196\n4643#4,5:4197\n4643#4,5:4210\n4643#4,5:4218\n4643#4,5:4232\n1#5:3977\n1#5:3979\n1#5:4164\n1#5:4178\n679#6:3978\n48#7,5:4014\n48#7,5:4041\n48#7,5:4051\n48#7,5:4250\n48#7,5:4255\n48#7,5:4260\n48#7,5:4266\n48#7,5:4272\n48#7,5:4277\n372#8,7:4019\n287#9,6:4069\n27#10,2:4115\n27#10,2:4205\n27#10,2:4207\n27#10,2:4227\n27#10,2:4229\n174#11,4:4160\n179#11,3:4165\n174#11,4:4174\n179#11,3:4179\n33#12,6:4237\n81#12,3:4288\n33#12,6:4291\n84#12:4297\n222#12,3:4298\n63#12,6:4301\n225#12:4307\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1328#1:3964\n1339#1:3965\n1342#1:3966\n1345#1:3967\n1350#1:3968\n1359#1:3969\n1390#1:3970\n1511#1:3997\n1527#1:4008\n1869#1:4067\n1887#1:4068\n1909#1:4080\n1944#1:4081\n1947#1:4082\n1996#1:4093\n1996#1:4094\n2405#1:4146\n2407#1:4147\n2519#1:4182,6\n2525#1:4188\n2527#1:4189\n2535#1:4190\n2538#1:4191\n2561#1:4192\n2573#1:4193\n2611#1:4194,2\n2656#1:4202\n2660#1:4203,2\n2706#1:4209\n2710#1:4215,2\n2718#1:4217\n2722#1:4223,2\n2800#1:4225,2\n2916#1:4231\n3056#1:4243\n3058#1:4244\n3060#1:4245\n3062#1:4246\n3064#1:4247\n3065#1:4248\n3097#1:4249\n3122#1:4265\n3128#1:4271\n3157#1:4282\n3163#1:4283\n3170#1:4284,2\n3179#1:4286\n3179#1:4287\n1418#1:3971\n1751#1:4056\n1443#1:3972,5\n1477#1:3980,5\n1495#1:3985\n1495#1:3986,5\n1500#1:3991\n1500#1:3992,5\n1511#1:3998,5\n1524#1:4003,5\n1527#1:4009,5\n1606#1:4026,5\n1620#1:4031,5\n1710#1:4036,5\n1715#1:4046,5\n1751#1:4057,5\n1760#1:4062,5\n1906#1:4075,5\n1968#1:4083,5\n1973#1:4088,5\n2001#1:4095,5\n2057#1:4100,5\n2058#1:4105,5\n2069#1:4110,5\n2159#1:4117,5\n2378#1:4122\n2378#1:4123,5\n2379#1:4128\n2379#1:4129,5\n2380#1:4134\n2380#1:4135,5\n2383#1:4140\n2383#1:4141,5\n2412#1:4148\n2412#1:4149,5\n2428#1:4154\n2428#1:4155,5\n2498#1:4168\n2498#1:4169,5\n2654#1:4196\n2654#1:4197,5\n2707#1:4210,5\n2719#1:4218,5\n2916#1:4232,5\n1462#1:3979\n2464#1:4164\n2506#1:4178\n1462#1:3978\n1537#1:4014,5\n1711#1:4041,5\n1749#1:4051,5\n3099#1:4250,5\n3103#1:4255,5\n3107#1:4260,5\n3123#1:4266,5\n3131#1:4272,5\n3135#1:4277,5\n1577#1:4019,7\n1892#1:4069,6\n2126#1:4115,2\n2680#1:4205,2\n2688#1:4207,2\n2834#1:4227,2\n2840#1:4229,2\n2464#1:4160,4\n2464#1:4165,3\n2506#1:4174,4\n2506#1:4179,3\n3012#1:4237,6\n3189#1:4288,3\n3189#1:4291,6\n3189#1:4297\n3193#1:4298,3\n3193#1:4301,6\n3193#1:4307\n*E\n"})
/* loaded from: classes.dex */
public final class SlotWriter {

    @k
    private ArrayList<Anchor> anchors;

    @l
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;

    @l
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;

    @k
    private int[] groups;
    private int insertCount;
    private int nodeCount;

    @l
    private MutableIntList pendingRecalculateMarks;

    @k
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;

    @l
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @k
    private final SlotTable table;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private final IntStack startStack = new IntStack();

    @k
    private final IntStack endStack = new IntStack();

    @k
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n27#2,2:3964\n3749#3,2:3966\n3746#3:3969\n3749#3,2:3970\n3780#3,2:3972\n3666#3:3985\n3732#3:3986\n1#4:3968\n33#5,6:3974\n4643#6,5:3980\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2210#1:3964,2\n2220#1:3966,2\n2230#1:3969\n2231#1:3970,2\n2250#1:3972,2\n2353#1:3985\n2353#1:3986\n2289#1:3974,6\n2349#1:3980,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i11, SlotWriter slotWriter2, boolean z11, boolean z12, boolean z13) {
            boolean z14;
            int locationOf;
            int locationOf2;
            List<Anchor> list;
            int groupSize;
            int locationOf3;
            int groupSize2 = slotWriter.groupSize(i11);
            int i12 = i11 + groupSize2;
            int dataIndex = slotWriter.dataIndex(i11);
            int dataIndex2 = slotWriter.dataIndex(i12);
            int i13 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i11);
            slotWriter2.insertGroups(groupSize2);
            slotWriter2.insertSlots(i13, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i12) {
                slotWriter.moveGroupGapTo(i12);
            }
            if (slotWriter.slotsGapStart < dataIndex2) {
                slotWriter.moveSlotGapTo(dataIndex2, i12);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            int i14 = currentGroup * 5;
            q.z0(slotWriter.groups, iArr, i14, i11 * 5, i12 * 5);
            Object[] objArr = slotWriter2.slots;
            int i15 = slotWriter2.currentSlot;
            System.arraycopy(slotWriter.slots, dataIndex, objArr, i15, i13);
            int parent = slotWriter2.getParent();
            iArr[i14 + 2] = parent;
            int i16 = currentGroup - i11;
            int i17 = currentGroup + groupSize2;
            int dataIndex3 = i15 - slotWriter2.dataIndex(iArr, currentGroup);
            int i18 = slotWriter2.slotsGapOwner;
            int i19 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i21 = i18;
            int i22 = currentGroup;
            while (true) {
                z14 = false;
                if (i22 >= i17) {
                    break;
                }
                if (i22 != currentGroup) {
                    int i23 = (i22 * 5) + 2;
                    iArr[i23] = iArr[i23] + i16;
                }
                int[] iArr2 = iArr;
                int i24 = currentGroup;
                iArr2[(i22 * 5) + 4] = slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i22) + dataIndex3, i21 >= i22 ? slotWriter2.slotsGapStart : 0, i19, length);
                if (i22 == i21) {
                    i21++;
                }
                i22++;
                currentGroup = i24;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            slotWriter2.slotsGapOwner = i21;
            locationOf = SlotTableKt.locationOf(slotWriter.anchors, i11, slotWriter.getSize$runtime_release());
            locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i12, slotWriter.getSize$runtime_release());
            if (locationOf < locationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(locationOf2 - locationOf);
                for (int i25 = locationOf; i25 < locationOf2; i25++) {
                    Anchor anchor = (Anchor) arrayList.get(i25);
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i16);
                    arrayList2.add(anchor);
                }
                locationOf3 = SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release());
                slotWriter2.anchors.addAll(locationOf3, arrayList2);
                arrayList.subList(locationOf, locationOf2).clear();
                list = arrayList2;
            } else {
                list = h0.J();
            }
            List<Anchor> list2 = list;
            if (!list2.isEmpty()) {
                HashMap hashMap = slotWriter.sourceInformationMap;
                HashMap hashMap2 = slotWriter2.sourceInformationMap;
                if (hashMap != null && hashMap2 != null) {
                    int size = list2.size();
                    for (int i26 = 0; i26 < size; i26++) {
                        Anchor anchor2 = list.get(i26);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) hashMap.get(anchor2);
                        if (groupSourceInformation != null) {
                            hashMap.remove(anchor2);
                            hashMap2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            GroupSourceInformation sourceInformationOf = slotWriter2.sourceInformationOf(parent);
            if (sourceInformationOf != null) {
                int i27 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i28 = -1;
                while (i27 < currentGroup2) {
                    groupSize = SlotTableKt.groupSize(slotWriter2.groups, i27);
                    int i29 = groupSize + i27;
                    i28 = i27;
                    i27 = i29;
                }
                sourceInformationOf.addGroupAfter(slotWriter2, i28, currentGroup2);
            }
            int parent3 = slotWriter.parent(i11);
            if (z13) {
                if (z11) {
                    boolean z15 = parent3 >= 0;
                    if (z15) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent3 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i11 - slotWriter.getCurrentGroup());
                    boolean removeGroup = slotWriter.removeGroup();
                    if (z15) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z14 = removeGroup;
                } else {
                    z14 = slotWriter.removeGroups(i11, groupSize2);
                    slotWriter.removeSlots(dataIndex, i13, i11 - 1);
                }
            }
            if (z14) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i31 = slotWriter2.nodeCount;
            int i32 = iArr3[i14 + 1];
            slotWriter2.nodeCount = i31 + ((1073741824 & i32) == 0 ? i32 & RectListKt.Lower26Bits : 1);
            if (z12) {
                slotWriter2.currentGroup = i17;
                slotWriter2.currentSlot = i15 + i13;
            }
            if (containsAnyGroupMarks) {
                slotWriter2.updateContainsMark(parent);
            }
            return list;
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i11, SlotWriter slotWriter2, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
            if ((i12 & 32) != 0) {
                z13 = true;
            }
            return companion.moveGroup(slotWriter, i11, slotWriter2, z11, z12, z13);
        }

        private Companion() {
        }
    }

    public SlotWriter(@k SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.calledByMap = slotTable.getCalledByMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i11);
    }

    private final int auxIndex(int[] iArr, int i11) {
        return dataIndex(iArr, i11) + Integer.bitCount(iArr[(i11 * 5) + 1] >> 29);
    }

    private final boolean childContainsAnyMarks(int i11) {
        int i12 = i11 + 1;
        int groupSize = i11 + groupSize(i11);
        while (i12 < groupSize) {
            if ((this.groups[(groupIndexToAddress(i12) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            i12 += groupSize(i12);
        }
        return false;
    }

    private final void clearSlotGap() {
        int i11 = this.slotsGapStart;
        q.M1(this.slots, null, i11, this.slotsGapLen + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i11) {
        return i11 >= 0 && (this.groups[(groupIndexToAddress(i11) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int i11) {
        return i11 >= 0 && (this.groups[(groupIndexToAddress(i11) * 5) + 1] & 67108864) != 0;
    }

    private final int dataAnchorToDataIndex(int i11, int i12, int i13) {
        return i11 < 0 ? (i13 - i12) + i11 + 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int i11) {
        return dataIndex(this.groups, groupIndexToAddress(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i11) {
        return i11 + (this.slotsGapLen * (i11 < this.slotsGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i11, int i12, int i13, int i14) {
        return i11 > i12 ? -(((i14 - i13) - i11) + 1) : i11;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List I4 = r0.I4(r0.q5(dataAnchors$default, u.W1(0, this.groupGapStart)), r0.q5(dataAnchors$default, u.W1(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(I4.size());
        int size = I4.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) I4.get(i11)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i11, int i12, int i13) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i11, this.groupGapStart);
        while (i13 < i12) {
            this.groups[(groupIndexToAddress(i13) * 5) + 2] = parentIndexToAnchor;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i13));
            int i14 = groupSize + i13;
            fixParentAnchorsFor(i13, i14, i13 + 1);
            i13 = i14;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int getCurrentGroupSlotIndex() {
        MutableObjectList<Object> mutableObjectList;
        int slotsStartIndex$runtime_release = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return slotsStartIndex$runtime_release + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(this.parent)) == null) ? 0 : mutableObjectList.getSize());
    }

    private final void groupAsString(StringBuilder sb2, int i11) {
        int groupSize;
        String summarize;
        String summarize2;
        int groupIndexToAddress = groupIndexToAddress(i11);
        sb2.append("Group(");
        if (i11 < 10) {
            sb2.append(' ');
        }
        if (i11 < 100) {
            sb2.append(' ');
        }
        if (i11 < 1000) {
            sb2.append(' ');
        }
        sb2.append(i11);
        if (groupIndexToAddress != i11) {
            sb2.append(j.f81006c);
            sb2.append(groupIndexToAddress);
            sb2.append(j.f81007d);
        }
        sb2.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb2.append(groupSize);
        sb2.append('^');
        int i12 = groupIndexToAddress * 5;
        int i13 = i12 + 2;
        sb2.append(parentAnchorToIndex(this.groups[i13]));
        sb2.append(": key=");
        sb2.append(this.groups[i12]);
        sb2.append(", nodes=");
        int i14 = i12 + 1;
        sb2.append(this.groups[i14] & RectListKt.Lower26Bits);
        sb2.append(", dataAnchor=");
        sb2.append(this.groups[i12 + 4]);
        sb2.append(", parentAnchor=");
        sb2.append(this.groups[i13]);
        if ((this.groups[i14] & 1073741824) != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", node=");
            summarize2 = SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]), 10);
            sb3.append(summarize2);
            sb2.append(sb3.toString());
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i11 + 1));
        if (dataIndex > slotIndex) {
            sb2.append(", [");
            for (int i15 = slotIndex; i15 < dataIndex; i15++) {
                if (i15 != slotIndex) {
                    sb2.append(j2.O);
                }
                summarize = SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i15)]), 10);
                sb2.append(summarize);
            }
            sb2.append(b.f69930l);
        }
        sb2.append(j.f81007d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int i11) {
        return i11 + (this.groupGapLen * (i11 < this.groupGapStart ? 0 : 1));
    }

    private final GroupSourceInformation groupSourceInformationFor(int i11, String str) {
        int groupSize;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            return null;
        }
        Anchor anchor = anchor(i11);
        GroupSourceInformation groupSourceInformation = hashMap.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, str, 0);
            if (str == null) {
                int i12 = i11 + 1;
                int i13 = this.currentGroup;
                while (i12 < i13) {
                    groupSourceInformation.reportGroup(this, i12);
                    groupSize = SlotTableKt.groupSize(this.groups, i12);
                    i12 += groupSize;
                }
            }
            hashMap.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i11) {
        if (i11 > 0) {
            int i12 = this.currentGroup;
            moveGroupGapTo(i12);
            int i13 = this.groupGapStart;
            int i14 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i15 = length - i14;
            if (i14 < i11) {
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                int[] iArr2 = new int[max * 5];
                int i16 = max - i15;
                q.z0(iArr, iArr2, 0, 0, i13 * 5);
                q.z0(iArr, iArr2, (i13 + i16) * 5, (i14 + i13) * 5, length * 5);
                this.groups = iArr2;
                i14 = i16;
            }
            int i17 = this.currentGroupEnd;
            if (i17 >= i13) {
                this.currentGroupEnd = i17 + i11;
            }
            int i18 = i13 + i11;
            this.groupGapStart = i18;
            this.groupGapLen = i14 - i11;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i15 > 0 ? dataIndex(i12 + i11) : 0, this.slotsGapOwner >= i13 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i19 = i13; i19 < i18; i19++) {
                this.groups[(i19 * 5) + 4] = dataIndexToDataAnchor;
            }
            int i21 = this.slotsGapOwner;
            if (i21 >= i13) {
                this.slotsGapOwner = i21 + i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i11, int i12) {
        if (i11 > 0) {
            moveSlotGapTo(this.currentSlot, i12);
            int i13 = this.slotsGapStart;
            int i14 = this.slotsGapLen;
            if (i14 < i11) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i15 = length - i14;
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                Object[] objArr2 = new Object[max];
                for (int i16 = 0; i16 < max; i16++) {
                    objArr2[i16] = null;
                }
                int i17 = max - i15;
                int i18 = i14 + i13;
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(objArr, i18, objArr2, i13 + i17, length - i18);
                this.slots = objArr2;
                i14 = i17;
            }
            int i19 = this.currentSlotEnd;
            if (i19 >= i13) {
                this.currentSlotEnd = i19 + i11;
            }
            this.slotsGapStart = i13 + i11;
            this.slotsGapLen = i14 - i11;
        }
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = keys$default.get(i11);
            ((Number) obj).intValue();
            int i12 = this.groupGapStart;
            if (i11 < i12 || i11 >= i12 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = slotWriter.parent;
        }
        slotWriter.markGroup(i11);
    }

    private final void moveAnchors(int i11, int i12, int i13) {
        int locationOf;
        int locationOf2;
        Anchor anchor;
        int anchorIndex;
        int i14 = i13 + i11;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i11, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = this.anchors.get(locationOf)))) >= i11 && anchorIndex < i14) {
                arrayList.add(anchor);
                this.anchors.remove(locationOf);
            }
        }
        int i15 = i12 - i11;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            Anchor anchor2 = (Anchor) arrayList.get(i16);
            int anchorIndex2 = anchorIndex(anchor2) + i15;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return slotWriter.moveFrom(slotTable, i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i11) {
        int i12 = this.groupGapLen;
        int i13 = this.groupGapStart;
        if (i13 != i11) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i13, i11);
            }
            if (i12 > 0) {
                int[] iArr = this.groups;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i11 < i13) {
                    q.z0(iArr, iArr, i15 + i14, i14, i16);
                } else {
                    q.z0(iArr, iArr, i16, i16 + i15, i14 + i15);
                }
            }
            if (i11 < i13) {
                i13 = i11 + i12;
            }
            int capacity = getCapacity();
            if (!(i13 < capacity)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i13 < capacity) {
                int i17 = (i13 * 5) + 2;
                int i18 = this.groups[i17];
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i18), i11);
                if (parentIndexToAnchor != i18) {
                    this.groups[i17] = parentIndexToAnchor;
                }
                i13++;
                if (i13 == i11) {
                    i13 += i12;
                }
            }
        }
        this.groupGapStart = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i11, int i12) {
        int i13 = this.slotsGapLen;
        int i14 = this.slotsGapStart;
        int i15 = this.slotsGapOwner;
        if (i14 != i11) {
            Object[] objArr = this.slots;
            if (i11 < i14) {
                System.arraycopy(objArr, i11, objArr, i11 + i13, i14 - i11);
            } else {
                int i16 = i14 + i13;
                System.arraycopy(objArr, i16, objArr, i14, (i11 + i13) - i16);
            }
        }
        int min = Math.min(i12 + 1, getSize$runtime_release());
        if (i15 != min) {
            int length = this.slots.length - i13;
            if (min < i15) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i15);
                int i17 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    int i18 = (groupIndexToAddress * 5) + 4;
                    int i19 = this.groups[i18];
                    if (!(i19 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i18] = -((length - i19) + 1);
                    groupIndexToAddress++;
                    if (groupIndexToAddress == i17) {
                        groupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i15);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    int i21 = (groupIndexToAddress3 * 5) + 4;
                    int i22 = this.groups[i21];
                    if (!(i22 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i21] = i22 + length + 1;
                    groupIndexToAddress3++;
                    if (groupIndexToAddress3 == this.groupGapStart) {
                        groupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i11;
    }

    private final int nodeIndex(int[] iArr, int i11) {
        return dataIndex(iArr, i11);
    }

    private final int parentAnchorToIndex(int i11) {
        return i11 > -2 ? i11 : (getSize$runtime_release() + i11) - (-2);
    }

    private final int parentIndexToAnchor(int i11, int i12) {
        return i11 < i12 ? i11 : -((getSize$runtime_release() - i11) + 2);
    }

    private final Object rawUpdate(Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m1918isNotEmptyimpl(mutableIntList)) {
                m1932updateContainsMarkNowXpTMRCE(PrioritySet.m1920takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    private final boolean removeAnchors(int i11, int i12, HashMap<Anchor, GroupSourceInformation> hashMap) {
        int locationOf;
        int i13 = i12 + i11;
        locationOf = SlotTableKt.locationOf(this.anchors, i13, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i14 = locationOf + 1;
        int i15 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < i11) {
                break;
            }
            if (anchorIndex < i13) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (hashMap != null) {
                    hashMap.remove(anchor);
                }
                if (i15 == 0) {
                    i15 = locationOf + 1;
                }
                i14 = locationOf;
            }
            locationOf--;
        }
        boolean z11 = i14 < i15;
        if (z11) {
            this.anchors.subList(i14, i15).clear();
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int i11, int i12) {
        if (i12 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i11);
            r0 = arrayList.isEmpty() ? false : removeAnchors(i11, i12, this.sourceInformationMap);
            this.groupGapStart = i11;
            this.groupGapLen += i12;
            int i13 = this.slotsGapOwner;
            if (i13 > i11) {
                this.slotsGapOwner = Math.max(i11, i13 - i12);
            }
            int i14 = this.currentGroupEnd;
            if (i14 >= this.groupGapStart) {
                this.currentGroupEnd = i14 - i12;
            }
            int i15 = this.parent;
            if (containsGroupMark(i15)) {
                updateContainsMark(i15);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i11, int i12, int i13) {
        if (i12 > 0) {
            int i14 = this.slotsGapLen;
            int i15 = i11 + i12;
            moveSlotGapTo(i15, i13);
            this.slotsGapStart = i11;
            this.slotsGapLen = i14 + i12;
            q.M1(this.slots, null, i11, i15);
            int i16 = this.currentSlotEnd;
            if (i16 >= i11) {
                this.currentSlotEnd = i16 - i12;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i11) {
        int slotAnchor;
        if (i11 >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i11);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation sourceInformationOf(int i11) {
        Anchor tryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime_release = tryAnchor$runtime_release(i11)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime_release);
    }

    private final void updateAnchors(int i11, int i12) {
        int locationOf;
        Anchor anchor;
        int location$runtime_release;
        int locationOf2;
        Anchor anchor2;
        int location$runtime_release2;
        int i13;
        int capacity = getCapacity() - this.groupGapLen;
        if (i11 >= i12) {
            for (locationOf = SlotTableKt.locationOf(this.anchors, i12, capacity); locationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(locationOf)).getLocation$runtime_release()) >= 0; locationOf++) {
                anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        for (locationOf2 = SlotTableKt.locationOf(this.anchors, i11, capacity); locationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(locationOf2)).getLocation$runtime_release()) < 0 && (i13 = location$runtime_release2 + capacity) < i12; locationOf2++) {
            anchor2.setLocation$runtime_release(i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i11) {
        if (i11 >= 0) {
            MutableIntList mutableIntList = this.pendingRecalculateMarks;
            if (mutableIntList == null) {
                mutableIntList = PrioritySet.m1913constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntList;
            }
            PrioritySet.m1910addimpl(mutableIntList, i11);
        }
    }

    /* renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m1932updateContainsMarkNowXpTMRCE(int i11, MutableIntList mutableIntList) {
        int groupIndexToAddress = groupIndexToAddress(i11);
        boolean childContainsAnyMarks = childContainsAnyMarks(i11);
        int[] iArr = this.groups;
        if (((iArr[(groupIndexToAddress * 5) + 1] & 67108864) != 0) != childContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i11);
            if (parent >= 0) {
                PrioritySet.m1910addimpl(mutableIntList, parent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 4] = dataIndexToDataAnchor(i12, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.groupIndexToAddress(r5)
            int[] r1 = r4.groups
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating the node of a group at "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r5)
        L31:
            java.lang.Object[] r5 = r4.slots
            int[] r1 = r4.groups
            int r0 = r4.nodeIndex(r1, r0)
            int r0 = r4.dataIndexToDataAddress(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int i11) {
        boolean z11 = false;
        if (!(i11 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.currentGroup + i11;
        if (i12 >= this.parent && i12 <= this.currentGroupEnd) {
            z11 = true;
        }
        if (!z11) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i12;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i12));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
    }

    @k
    public final Anchor anchor(int i11) {
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i11, getSize$runtime_release());
        if (search >= 0) {
            return arrayList.get(search);
        }
        if (i11 > this.groupGapStart) {
            i11 = -(getSize$runtime_release() - i11);
        }
        Anchor anchor = new Anchor(i11);
        arrayList.add(-(search + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@k Anchor anchor) {
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? getSize$runtime_release() + location$runtime_release : location$runtime_release;
    }

    public final void appendSlot(@k Anchor anchor, @l Object obj) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        int anchorIndex = anchorIndex(anchor);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(anchorIndex + 1));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
        insertSlots(1, anchorIndex);
        if (i11 >= dataIndex) {
            i11++;
            i12++;
        }
        this.slots[dataIndex] = obj;
        this.currentSlot = i11;
        this.currentSlotEnd = i12;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i11 = this.insertCount;
        this.insertCount = i11 + 1;
        if (i11 == 0) {
            saveCurrentGroupEnd();
        }
    }

    @l
    public final Object clear(int i11) {
        int dataIndexToDataAddress = dataIndexToDataAddress(i11);
        Object[] objArr = this.slots;
        Object obj = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = Composer.Companion.getEmpty();
        return obj;
    }

    public final void close(boolean z11) {
        this.closed = true;
        if (z11 && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        int groupSize;
        int groupSize2;
        MutableObjectList<Object> mutableObjectList;
        boolean z11 = this.insertCount > 0;
        int i11 = this.currentGroup;
        int i12 = this.currentGroupEnd;
        int i13 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i13);
        int i14 = this.nodeCount;
        int i15 = i11 - i13;
        int i16 = (groupIndexToAddress * 5) + 1;
        boolean z12 = (this.groups[i16] & 1073741824) != 0;
        if (z11) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i13)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i17 = mutableObjectList._size;
                for (int i18 = 0; i18 < i17; i18++) {
                    rawUpdate(objArr[i18]);
                }
                mutableIntObjectMap.remove(i13);
            }
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i15);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i14);
            this.nodeCount = this.nodeCountStack.pop() + (z12 ? 1 : i14);
            int parent = parent(this.groups, i13);
            this.parent = parent;
            int size$runtime_release = parent < 0 ? getSize$runtime_release() : groupIndexToAddress(parent + 1);
            int dataIndex = size$runtime_release >= 0 ? dataIndex(this.groups, size$runtime_release) : 0;
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return i14;
        }
        if (!(i11 == i12)) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int[] iArr = this.groups;
        int i19 = iArr[i16] & RectListKt.Lower26Bits;
        SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, i15);
        SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i14);
        int pop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = pop;
        int parent2 = parent(this.groups, i13);
        int pop2 = this.nodeCountStack.pop();
        this.nodeCount = pop2;
        if (parent2 == pop) {
            this.nodeCount = pop2 + (z12 ? 0 : i14 - i19);
            return i14;
        }
        int i21 = i15 - groupSize;
        int i22 = z12 ? 0 : i14 - i19;
        if (i21 != 0 || i22 != 0) {
            while (parent2 != 0 && parent2 != pop && (i22 != 0 || i21 != 0)) {
                int groupIndexToAddress2 = groupIndexToAddress(parent2);
                if (i21 != 0) {
                    groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                    SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i21);
                }
                if (i22 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress2, (iArr2[(groupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits) + i22);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(groupIndexToAddress2 * 5) + 1] & 1073741824) != 0) {
                    i22 = 0;
                }
                parent2 = parent(iArr3, parent2);
            }
        }
        this.nodeCount += i22;
        return i14;
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i11 = this.insertCount - 1;
        this.insertCount = i11;
        if (i11 == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int i11) {
        boolean z11 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i12 = this.parent;
        if (i12 != i11) {
            if (i11 >= i12 && i11 < this.currentGroupEnd) {
                z11 = true;
            }
            if (!z11) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + i11 + " must be a subgroup of the group at " + i12);
            }
            int i13 = this.currentGroup;
            int i14 = this.currentSlot;
            int i15 = this.currentSlotEnd;
            this.currentGroup = i11;
            startGroup();
            this.currentGroup = i13;
            this.currentSlot = i14;
            this.currentSlotEnd = i15;
        }
    }

    public final void forAllData(int i11, @k p<? super Integer, Object, g2> pVar) {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i11)); dataIndex2 < dataIndex; dataIndex2++) {
            pVar.invoke(Integer.valueOf(dataIndex2), this.slots[dataIndexToDataAddress(dataIndex2)]);
        }
    }

    public final void forEachTailSlot(int i11, int i12, @k p<? super Integer, Object, g2> pVar) {
        int slotsStartIndex$runtime_release = slotsStartIndex$runtime_release(i11);
        int slotsEndIndex$runtime_release = slotsEndIndex$runtime_release(i11);
        for (int max = Math.max(slotsStartIndex$runtime_release, slotsEndIndex$runtime_release - i12); max < slotsEndIndex$runtime_release; max++) {
            pVar.invoke(Integer.valueOf(max), this.slots[dataIndexToDataAddress(max)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    @k
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @l
    public final Object groupAux(int i11) {
        int groupIndexToAddress = groupIndexToAddress(i11);
        int[] iArr = this.groups;
        return (iArr[(groupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, groupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i11) {
        return this.groups[groupIndexToAddress(i11) * 5];
    }

    @l
    public final Object groupObjectKey(int i11) {
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i11);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & 536870912) == 0) {
            return null;
        }
        Object[] objArr = this.slots;
        objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, groupIndexToAddress);
        return objArr[objectKeyIndex];
    }

    public final int groupSize(int i11) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i11));
        return groupSize;
    }

    @k
    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i11 = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i11 + groupSize(i11))), this);
    }

    public final boolean indexInCurrentGroup(int i11) {
        return indexInGroup(i11, this.currentGroup);
    }

    public final boolean indexInGroup(int i11, int i12) {
        int capacity;
        int groupSize;
        if (i12 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i12 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i12);
            } else {
                int indexOf = this.startStack.indexOf(i12);
                if (indexOf < 0) {
                    groupSize = groupSize(i12);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i12;
        }
        return i11 > i12 && i11 < capacity;
    }

    public final boolean indexInParent(int i11) {
        int i12 = this.parent;
        if (i11 <= i12 || i11 >= this.currentGroupEnd) {
            return i12 == 0 && i11 == 0;
        }
        return true;
    }

    public final void insertAux(@l Object obj) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i11 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i11);
        if ((this.groups[(groupIndexToAddress * 5) + 1] & 268435456) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i11);
        int auxIndex = auxIndex(this.groups, groupIndexToAddress);
        int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
        int i12 = this.currentSlot;
        if (i12 > auxIndex) {
            int i13 = i12 - auxIndex;
            if (!(i13 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i13 > 1) {
                Object[] objArr = this.slots;
                objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, groupIndexToAddress);
        this.slots[dataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i11 = this.currentGroup;
        return i11 < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i11) * 5) + 1] & 1073741824) != 0;
    }

    public final void markGroup(int i11) {
        int groupIndexToAddress = groupIndexToAddress(i11);
        int[] iArr = this.groups;
        int i12 = (groupIndexToAddress * 5) + 1;
        if ((iArr[i12] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, groupIndexToAddress, true);
        if ((this.groups[i12] & 67108864) != 0) {
            return;
        }
        updateContainsMark(parent(i11));
    }

    @k
    public final List<Anchor> moveFrom(@k SlotTable slotTable, int i11, boolean z11) {
        int groupSize;
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (i11 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(slotTable.getGroups(), i11);
            if (groupSize == slotTable.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList = this.anchors;
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
                int[] groups = slotTable.getGroups();
                int groupsSize = slotTable.getGroupsSize();
                Object[] slots = slotTable.getSlots();
                int slotsSize = slotTable.getSlotsSize();
                HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = slotTable.getSourceInformationMap$runtime_release();
                MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = slotTable.getCalledByMap$runtime_release();
                this.groups = groups;
                this.slots = slots;
                this.anchors = slotTable.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime_release;
                this.calledByMap = calledByMap$runtime_release;
                slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, hashMap, mutableIntObjectMap);
                return this.anchors;
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            List<Anchor> moveGroup = Companion.moveGroup(openWriter, i11, this, true, true, z11);
            openWriter.close(true);
            return moveGroup;
        } catch (Throwable th2) {
            openWriter.close(false);
            throw th2;
        }
    }

    public final void moveGroup(int i11) {
        int groupSize;
        int groupSize2;
        boolean z11 = true;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(i11 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.currentGroup;
        int i13 = this.parent;
        int i14 = this.currentGroupEnd;
        int i15 = i12;
        for (int i16 = i11; i16 > 0; i16--) {
            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i15));
            i15 += groupSize2;
            if (!(i15 <= i14)) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i15));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i15));
        int i17 = i15 + groupSize;
        int dataIndex3 = dataIndex(this.groups, groupIndexToAddress(i17));
        int i18 = dataIndex3 - dataIndex2;
        insertSlots(i18, Math.max(this.currentGroup - 1, 0));
        insertGroups(groupSize);
        int[] iArr = this.groups;
        int groupIndexToAddress = groupIndexToAddress(i17) * 5;
        q.z0(iArr, iArr, groupIndexToAddress(i12) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
        if (i18 > 0) {
            Object[] objArr = this.slots;
            int dataIndexToDataAddress = dataIndexToDataAddress(dataIndex2 + i18);
            System.arraycopy(objArr, dataIndexToDataAddress, objArr, dataIndex, dataIndexToDataAddress(dataIndex3 + i18) - dataIndexToDataAddress);
        }
        int i19 = dataIndex2 + i18;
        int i21 = i19 - dataIndex;
        int i22 = this.slotsGapStart;
        int i23 = this.slotsGapLen;
        int length = this.slots.length;
        int i24 = this.slotsGapOwner;
        int i25 = i12 + groupSize;
        int i26 = i12;
        while (i26 < i25) {
            boolean z12 = z11;
            int groupIndexToAddress2 = groupIndexToAddress(i26);
            int i27 = i26;
            int i28 = i21;
            updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i21, i24 < groupIndexToAddress2 ? 0 : i22, i23, length));
            i26 = i27 + 1;
            z11 = z12;
            i21 = i28;
        }
        moveAnchors(i17, i12, groupSize);
        if (removeGroups(i17, groupSize)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i13, this.currentGroupEnd, i12);
        if (i18 > 0) {
            removeSlots(i19, i18, i17 - 1);
        }
    }

    @k
    public final List<Anchor> moveIntoGroupFrom(int i11, @k SlotTable slotTable, int i12) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + i11) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i13 = this.currentGroup;
        int i14 = this.currentSlot;
        int i15 = this.currentSlotEnd;
        advanceBy(i11);
        startGroup();
        beginInsert();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, openWriter, i12, this, false, true, false, 32, null);
            openWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i13;
            this.currentSlot = i14;
            this.currentSlotEnd = i15;
            return moveGroup$default;
        } catch (Throwable th2) {
            openWriter.close(false);
            throw th2;
        }
    }

    @k
    public final List<Anchor> moveTo(@k Anchor anchor, int i11, @k SlotWriter slotWriter) {
        int groupSize;
        if (!(slotWriter.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!anchor.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int anchorIndex = anchorIndex(anchor) + i11;
        int i12 = this.currentGroup;
        if (!(i12 <= anchorIndex && anchorIndex < this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        int nodeCount = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, this, anchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z11 = nodeCount > 0;
        while (parent >= i12) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z11) {
                int[] iArr2 = this.groups;
                int i13 = iArr2[(groupIndexToAddress * 5) + 1];
                if ((1073741824 & i13) != 0) {
                    z11 = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, (i13 & RectListKt.Lower26Bits) - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z11) {
            if (!(this.nodeCount >= nodeCount)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= nodeCount;
        }
        return moveGroup$default;
    }

    @l
    public final Object node(int i11) {
        int groupIndexToAddress = groupIndexToAddress(i11);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & 1073741824) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, groupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i11) {
        return this.groups[(groupIndexToAddress(i11) * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int i11) {
        return parent(this.groups, i11);
    }

    public final void recordGroupSourceInformation(@k String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    public final void recordGrouplessCallSourceInformationStart(int i11, @k String str) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, i11, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationFor != null) {
                groupSourceInformationFor.startGrouplessCall(i11, str, getCurrentGroupSlotIndex());
            }
        }
    }

    public final boolean removeGroup() {
        Anchor tryAnchor$runtime_release;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i11 = this.currentGroup;
        int i12 = this.currentSlot;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i11));
        int skipGroup = skipGroup();
        GroupSourceInformation sourceInformationOf = sourceInformationOf(this.parent);
        if (sourceInformationOf != null && (tryAnchor$runtime_release = tryAnchor$runtime_release(i11)) != null) {
            sourceInformationOf.removeAnchor(tryAnchor$runtime_release);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m1918isNotEmptyimpl(mutableIntList) && PrioritySet.m1919peekimpl(mutableIntList) >= i11) {
                PrioritySet.m1920takeMaximpl(mutableIntList);
            }
        }
        boolean removeGroups = removeGroups(i11, this.currentGroup - i11);
        removeSlots(dataIndex, this.currentSlot - dataIndex, i11 - 1);
        this.currentGroup = i11;
        this.currentSlot = i12;
        this.nodeCount -= skipGroup;
        return removeGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(@k Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(@l Object obj) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = obj;
    }

    @l
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i11 = this.currentSlot;
        this.currentSlot = i11 + 1;
        return objArr[dataIndexToDataAddress(i11)];
    }

    public final int skipGroup() {
        int groupSize;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i11 = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i12 = i11 + groupSize;
        this.currentGroup = i12;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i12));
        int i13 = this.groups[(groupIndexToAddress * 5) + 1];
        if ((1073741824 & i13) != 0) {
            return 1;
        }
        return i13 & RectListKt.Lower26Bits;
    }

    public final void skipToGroupEnd() {
        int i11 = this.currentGroupEnd;
        this.currentGroup = i11;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i11));
    }

    @l
    public final Object slot(@k Anchor anchor, int i11) {
        return slot(anchorIndex(anchor), i11);
    }

    public final int slotIndexOfGroupSlotIndex(int i11, int i12) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i11));
        int i13 = slotIndex + i12;
        if (!(i13 >= slotIndex && i13 < dataIndex(this.groups, groupIndexToAddress(i11 + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + i12 + " for group " + i11);
        }
        return i13;
    }

    public final int slotsEndAllIndex$runtime_release(int i11) {
        return dataIndex(this.groups, groupIndexToAddress(i11 + groupSize(i11)));
    }

    public final int slotsEndIndex$runtime_release(int i11) {
        return dataIndex(this.groups, groupIndexToAddress(i11 + 1));
    }

    public final int slotsStartIndex$runtime_release(int i11) {
        return slotIndex(this.groups, groupIndexToAddress(i11));
    }

    public final void startData(int i11, @l Object obj, @l Object obj2) {
        startGroup(i11, obj, false, obj2);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.Companion;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int i11, @l Object obj) {
        startGroup(i11, obj, true, Composer.Companion.getEmpty());
    }

    @k
    public final String toDebugString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        sb2.append("  parent:    " + this.parent);
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        sb2.append("  current:   " + this.currentGroup);
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        sb2.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        sb2.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("  gap owner: ");
        sb3.append(this.slotsGapOwner);
        sb2.append(sb3.toString());
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        int size$runtime_release = getSize$runtime_release();
        for (int i11 = 0; i11 < size$runtime_release; i11++) {
            groupAsString(sb2, i11);
            sb2.append('\n');
        }
        String sb4 = sb2.toString();
        g0.o(sb4, "toString(...)");
        return sb4;
    }

    @k
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void trimTailSlots(int i11) {
        if (!(i11 > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i12 = this.parent;
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i12));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i12 + 1)) - i11;
        if (!(dataIndex >= slotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(dataIndex, i11, i12);
        int i13 = this.currentSlot;
        if (i13 >= slotIndex) {
            this.currentSlot = i13 - i11;
        }
    }

    @l
    public final Anchor tryAnchor$runtime_release(int i11) {
        Anchor find;
        if (i11 < 0 || i11 >= getSize$runtime_release()) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, i11, getSize$runtime_release());
        return find;
    }

    @l
    public final Object update(@l Object obj) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(obj);
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        v vVar = null;
        int i11 = 1;
        int i12 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(i12, i11, vVar);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i13 = this.parent;
        MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i13);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(i12, i11, vVar);
            mutableIntObjectMap.set(i13, mutableObjectList);
        }
        mutableObjectList.add(obj);
        return Composer.Companion.getEmpty();
    }

    public final void updateAux(@l Object obj) {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(groupIndexToAddress * 5) + 1] & 268435456) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
    }

    public final void updateNode(@l Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(@l Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void verifyDataAnchors$runtime_release() {
        int i11 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        while (i12 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i12);
            int[] iArr = this.groups;
            int i14 = iArr[(groupIndexToAddress * 5) + 4];
            int dataIndex = dataIndex(iArr, groupIndexToAddress);
            if (!(dataIndex >= i13)) {
                PreconditionsKt.throwIllegalStateException("Data index out of order at " + i12 + ", previous = " + i13 + ", current = " + dataIndex);
            }
            if (!(dataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + dataIndex + ", out of bound at " + i12);
            }
            if (i14 < 0 && !z11) {
                if (!(i11 == i12)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i11 + " found gap at " + i12);
                }
                z11 = true;
            }
            i12++;
            i13 = dataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i11 = this.groupGapStart;
        int i12 = this.groupGapLen;
        int capacity = getCapacity();
        int i13 = 0;
        while (true) {
            if (i13 >= i11) {
                break;
            }
            if (!(this.groups[(i13 * 5) + 2] > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i13);
            }
            i13++;
        }
        for (int i14 = i12 + i11; i14 < capacity; i14++) {
            int i15 = this.groups[(i14 * 5) + 2];
            if (parentAnchorToIndex(i15) < i11) {
                if (!(i15 > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i14);
                }
            } else if (!(i15 <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i11) {
        return i11 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i11 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    public final int parent(@k Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    @l
    public final Object slot(int i11, int i12) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i11));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i11 + 1));
        int i13 = i12 + slotIndex;
        if (slotIndex > i13 || i13 >= dataIndex) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i13)];
    }

    public final void startData(int i11, @l Object obj) {
        startGroup(i11, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i11, @l Object obj, @l Object obj2) {
        startGroup(i11, obj, true, obj2);
    }

    public final void updateNode(@k Anchor anchor, @l Object obj) {
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i11) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i11) * 5) + 2]);
    }

    public final boolean isNode(int i11) {
        return (this.groups[(groupIndexToAddress(i11) * 5) + 1] & 1073741824) != 0;
    }

    @l
    public final Object set(int i11, @l Object obj) {
        return set(getCurrentGroup(), i11, obj);
    }

    public final void startGroup(int i11) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i11, companion.getEmpty(), false, companion.getEmpty());
    }

    @l
    public final Object node(@k Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    @l
    public final Object set(int i11, int i12, @l Object obj) {
        int dataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(i11, i12));
        Object[] objArr = this.slots;
        Object obj2 = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = obj;
        return obj2;
    }

    public final void startGroup(int i11, @l Object obj) {
        startGroup(i11, obj, false, Composer.Companion.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void startGroup(int i11, Object obj, boolean z11, Object obj2) {
        int groupSize;
        int i12;
        GroupSourceInformation sourceInformationOf;
        int i13 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i14 = this.currentGroup;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i14));
            insertGroups(1);
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            int groupIndexToAddress = groupIndexToAddress(i14);
            Composer.Companion companion = Composer.Companion;
            ?? r12 = obj != companion.getEmpty() ? 1 : 0;
            ?? r13 = (z11 || obj2 == companion.getEmpty()) ? 0 : 1;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (dataIndexToDataAnchor >= 0 && this.slotsGapOwner < i14) {
                dataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - dataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i11, z11, r12, r13, this.parent, dataIndexToDataAnchor);
            int i15 = (z11 ? 1 : 0) + r12 + r13;
            if (i15 > 0) {
                insertSlots(i15, i14);
                Object[] objArr2 = this.slots;
                int i16 = this.currentSlot;
                if (z11) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                if (r12 != 0) {
                    objArr2[i16] = obj;
                    i16++;
                }
                if (r13 != 0) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                this.currentSlot = i16;
            }
            this.nodeCount = 0;
            i12 = i14 + 1;
            this.parent = i14;
            this.currentGroup = i12;
            if (i13 >= 0 && (sourceInformationOf = sourceInformationOf(i13)) != null) {
                sourceInformationOf.reportGroup(this, i14);
            }
        } else {
            this.startStack.push(i13);
            saveCurrentGroupEnd();
            int i17 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i17);
            if (!g0.g(obj2, Composer.Companion.getEmpty())) {
                if (z11) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(groupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits;
            this.parent = i17;
            this.currentGroup = i17 + 1;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress2);
            i12 = i17 + groupSize;
        }
        this.currentGroupEnd = i12;
    }

    public final void ensureStarted(@k Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
