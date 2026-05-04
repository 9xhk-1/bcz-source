package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionGroup;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import g10.u;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.f0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3723#1:3965\n3810#1:3966\n3810#1:3967\n3723#1:3968\n3723#1:3969\n3810#1:3990\n3810#1:3991\n3810#1:3992\n1#2:3964\n4663#3:3970\n4658#3,4:3971\n4663#3:3985\n4658#3,4:3986\n81#4,3:3975\n33#4,6:3978\n84#4:3984\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3677#1:3965\n3694#1:3966\n3704#1:3967\n3715#1:3968\n3720#1:3969\n3802#1:3990\n3803#1:3991\n3804#1:3992\n3736#1:3970\n3736#1:3971,4\n3759#1:3985\n3759#1:3986,4\n3742#1:3975,3\n3742#1:3978,6\n3742#1:3984\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int ContainsMark_Shift = 26;
    private static final int DataAnchor_Offset = 4;

    @k
    private static final long[] EmptyLongArray = new long[0];
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int Mark_Shift = 27;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeBit_Shift = 30;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap, int i11, int i12) {
        MutableIntSet mutableIntSet = mutableIntObjectMap.get(i11);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i11, mutableIntSet);
        }
        mutableIntSet.add(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i11) {
        int i12 = (i11 * 5) + 1;
        iArr[i12] = iArr[i12] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return i12 >= iArr.length ? iArr.length : iArr[i12 + 4] + Integer.bitCount(iArr[i12 + 1] >> 29);
    }

    @k
    public static final CompositionGroup compositionGroupOf(@k SlotTable slotTable, int i11) {
        return new SlotTableGroup(slotTable, i11, slotTable.getVersion$runtime_release());
    }

    private static final boolean containsAnyMark(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 201326592) != 0;
    }

    private static final boolean containsMark(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 67108864) != 0;
    }

    private static final int countOneBits(int i11) {
        return Integer.bitCount(i11);
    }

    private static final int dataAnchor(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i11) {
        return slice(iArr, u.B1(u.W1(4, i11), 5));
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iArr.length;
        }
        return dataAnchors(iArr, i11);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, l<? super T, Boolean> lVar) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (lVar.invoke(arrayList.get(i11)).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, l<? super T, Boolean> lVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t11 = arrayList.get(size);
            if (lVar.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Anchor find(ArrayList<Anchor> arrayList, int i11, int i12) {
        int search = search(arrayList, i11, i12);
        if (search >= 0) {
            return arrayList.get(search);
        }
        return null;
    }

    private static final int getFirstBitSet(long j11) {
        return Long.numberOfTrailingZeros(j11);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i11, int i12, x00.a<Anchor> aVar) {
        int search = search(arrayList, i11, i12);
        if (search >= 0) {
            return arrayList.get(search);
        }
        Anchor invoke = aVar.invoke();
        arrayList.add(-(search + 1), invoke);
        return invoke;
    }

    private static final int groupInfo(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i11) {
        return slice(iArr, u.B1(u.W1(3, i11), 5));
    }

    public static /* synthetic */ List groupSizes$default(int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iArr.length;
        }
        return groupSizes(iArr, i11);
    }

    private static final boolean hasAux(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 268435456) != 0;
    }

    private static final boolean hasMark(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 134217728) != 0;
    }

    private static final boolean hasObjectKey(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
        int i15 = i11 * 5;
        iArr[i15] = i12;
        iArr[i15 + 1] = ((z11 ? 1 : 0) << 30) | ((z12 ? 1 : 0) << 29) | ((z13 ? 1 : 0) << 28);
        iArr[i15 + 2] = i13;
        iArr[i15 + 3] = 0;
        iArr[i15 + 4] = i14;
    }

    private static final boolean isNode(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 1073741824) != 0;
    }

    private static final int key(int[] iArr, int i11) {
        return iArr[i11 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i11) {
        return slice(iArr, u.B1(u.W1(0, i11), 5));
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iArr.length;
        }
        return keys(iArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i11, int i12) {
        int search = search(arrayList, i11, i12);
        return search >= 0 ? search : -(search + 1);
    }

    private static final int nodeCount(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i11) {
        List<Integer> slice = slice(iArr, u.B1(u.W1(1, i11), 5));
        ArrayList arrayList = new ArrayList(slice.size());
        int size = slice.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(Integer.valueOf(slice.get(i12).intValue() & 67108863));
        }
        return arrayList;
    }

    public static /* synthetic */ List nodeCounts$default(int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iArr.length;
        }
        return nodeCounts(iArr, i11);
    }

    private static final int nodeIndex(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + Integer.bitCount(iArr[i12 + 1] >> 30);
    }

    private static final int parentAnchor(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i11) {
        return slice(iArr, u.B1(u.W1(2, i11), 5));
    }

    public static /* synthetic */ List parentAnchors$default(int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iArr.length;
        }
        return parentAnchors(iArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int location$runtime_release = arrayList.get(i14).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i12;
            }
            int t11 = g0.t(location$runtime_release, i11);
            if (t11 < 0) {
                i13 = i14 + 1;
            } else {
                if (t11 <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + Integer.bitCount(iArr[i12 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i11) {
        String z22 = f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(str, "androidx.", "a.", false, 4, null), "compose.", "c.", false, 4, null), "runtime.", "r.", false, 4, null), "internal.", "ι.", false, 4, null), "ui.", "u.", false, 4, null), "Modifier", "μ", false, 4, null), "material.", "m.", false, 4, null), "Function", "λ", false, 4, null), "OpaqueKey", "κ", false, 4, null), "MutableState", "σ", false, 4, null);
        String substring = z22.substring(0, Math.min(i11, z22.length()));
        g0.o(substring, "substring(...)");
        return substring;
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        iArr[i12] = ((z11 ? 1 : 0) << 26) | (iArr[i12] & (-67108865));
    }

    private static final void updateDataAnchor(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 4] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i11, int i12) {
        iArr[i11 * 5] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 3] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        iArr[i12] = ((z11 ? 1 : 0) << 27) | (iArr[i12] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i11, int i12) {
        if (i12 >= 0) {
        }
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & SmartTabLayout.f41494v);
    }

    private static final void updateParentAnchor(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 2] = i12;
    }

    private static final int toBit(boolean z11) {
        return z11 ? 1 : 0;
    }
}
