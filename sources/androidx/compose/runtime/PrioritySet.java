package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,3963:1\n366#2:3964\n65#2:3965\n65#2:3966\n363#2:3967\n366#2:3968\n65#2:3969\n366#2:3974\n65#2:3975\n65#2:3976\n65#2:3977\n65#2:3978\n4658#3,4:3970\n57#4,5:3979\n57#4,5:3984\n905#5:3989\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3875#1:3964\n3875#1:3965\n3877#1:3966\n3892#1:3967\n3894#1:3968\n3900#1:3969\n3907#1:3974\n3910#1:3975\n3912#1:3976\n3913#1:3977\n3944#1:3978\n3900#1:3970,4\n3948#1:3979,5\n3949#1:3984,5\n3871#1:3989\n*E\n"})
/* loaded from: classes.dex */
public final class PrioritySet {

    @k
    private final MutableIntList list;

    private /* synthetic */ PrioritySet(MutableIntList mutableIntList) {
        this.list = mutableIntList;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m1910addimpl(MutableIntList mutableIntList, int i11) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i11 || mutableIntList.get(mutableIntList._size - 1) == i11)) {
            int i12 = mutableIntList._size;
            mutableIntList.add(i11);
            while (i12 > 0) {
                int i13 = ((i12 + 1) >>> 1) - 1;
                int i14 = mutableIntList.get(i13);
                if (i11 <= i14) {
                    break;
                }
                mutableIntList.set(i12, i14);
                i12 = i13;
            }
            mutableIntList.set(i12, i11);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m1911boximpl(MutableIntList mutableIntList) {
        return new PrioritySet(mutableIntList);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m1913constructorimpl$default(MutableIntList mutableIntList, int i11, v vVar) {
        int i12 = 1;
        if ((i11 & 1) != 0) {
            mutableIntList = new MutableIntList(0, i12, null);
        }
        return m1912constructorimpl(mutableIntList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1914equalsimpl(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && g0.g(mutableIntList, ((PrioritySet) obj).m1923unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1915equalsimpl0(MutableIntList mutableIntList, MutableIntList mutableIntList2) {
        return g0.g(mutableIntList, mutableIntList2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1916hashCodeimpl(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1917isEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1918isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m1919peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m1920takeMaximpl(MutableIntList mutableIntList) {
        int i11;
        int i12 = mutableIntList._size;
        int i13 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i13) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i14 = mutableIntList._size;
            int i15 = i14 >>> 1;
            int i16 = 0;
            while (i16 < i15) {
                int i17 = mutableIntList.get(i16);
                int i18 = (i16 + 1) * 2;
                int i19 = i18 - 1;
                int i21 = mutableIntList.get(i19);
                if (i18 >= i14 || (i11 = mutableIntList.get(i18)) <= i21) {
                    if (i21 > i17) {
                        mutableIntList.set(i16, i21);
                        mutableIntList.set(i19, i17);
                        i16 = i19;
                    }
                } else if (i11 > i17) {
                    mutableIntList.set(i16, i11);
                    mutableIntList.set(i18, i17);
                    i16 = i18;
                }
            }
        }
        return i13;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1921toStringimpl(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m1922validateHeapimpl(MutableIntList mutableIntList) {
        int i11 = mutableIntList._size;
        int i12 = i11 / 2;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13 + 1;
            int i15 = i14 * 2;
            boolean z11 = true;
            if (!(mutableIntList.get(i13) >= mutableIntList.get(i15 + (-1)))) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i15 < i11 && mutableIntList.get(i13) < mutableIntList.get(i15)) {
                z11 = false;
            }
            if (!z11) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i13 = i14;
        }
    }

    public boolean equals(Object obj) {
        return m1914equalsimpl(this.list, obj);
    }

    public int hashCode() {
        return m1916hashCodeimpl(this.list);
    }

    public String toString() {
        return m1921toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableIntList m1923unboximpl() {
        return this.list;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m1912constructorimpl(@k MutableIntList mutableIntList) {
        return mutableIntList;
    }
}
