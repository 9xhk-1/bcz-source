package androidx.compose.foundation.lazy.staggeredgrid;

import a00.h0;
import a00.m;
import a00.q;
import a00.r0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import e00.g;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,206:1\n96#2,5:207\n96#2,5:226\n399#3,7:212\n399#3,7:219\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n36#1:207,5\n190#1:226,5\n165#1:212,7\n185#1:219,7\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;

    @k
    private int[] lanes = new int[16];

    @k
    private final m<SpannedItem> spannedItems = new m<>();

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SpannedItem {

        @k
        private int[] gaps;
        private final int index;

        public SpannedItem(int i11, @k int[] iArr) {
            this.index = i11;
            this.gaps = iArr;
        }

        @k
        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(@k int[] iArr) {
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i11, int i12) {
        if (!(i11 <= 131072)) {
            InlineClassHelperKt.throwIllegalArgumentException("Requested item capacity " + i11 + " is larger than max supported: 131072!");
        }
        int[] iArr = this.lanes;
        if (iArr.length < i11) {
            int length = iArr.length;
            while (length < i11) {
                length *= 2;
            }
            this.lanes = q.I0(this.lanes, new int[length], i12, 0, 0, 12, null);
        }
    }

    public static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i11, i12);
    }

    public final boolean assignedToLane(int i11, int i12) {
        int lane = getLane(i11);
        return lane == i12 || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i11) {
        int i12 = this.anchor;
        int i13 = i11 - i12;
        if (i13 < 0 || i13 >= 131072) {
            int max = Math.max(i11 - (this.lanes.length / 2), 0);
            this.anchor = max;
            int i14 = max - i12;
            if (i14 >= 0) {
                int[] iArr = this.lanes;
                if (i14 < iArr.length) {
                    q.z0(iArr, iArr, 0, i14, iArr.length);
                }
                int[] iArr2 = this.lanes;
                q.K1(iArr2, 0, Math.max(0, iArr2.length - i14), this.lanes.length);
            } else {
                int i15 = -i14;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i15 < 131072) {
                    ensureCapacity(iArr3.length + i15 + 1, i15);
                } else {
                    if (i15 < iArr3.length) {
                        q.z0(iArr3, iArr3, i15, 0, iArr3.length - i15);
                    }
                    int[] iArr4 = this.lanes;
                    q.K1(iArr4, 0, 0, Math.min(iArr4.length, i15));
                }
            }
        } else {
            ensureCapacity$default(this, i13 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.first().getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.last().getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final int findNextItemIndex(int i11, int i12) {
        int upperBound = upperBound();
        for (int i13 = i11 + 1; i13 < upperBound; i13++) {
            if (assignedToLane(i13, i12)) {
                return i13;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i11, int i12) {
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (!assignedToLane(i11, i12));
        return i11;
    }

    @l
    public final int[] getGaps(int i11) {
        m<SpannedItem> mVar = this.spannedItems;
        final Integer valueOf = Integer.valueOf(i11);
        SpannedItem spannedItem = (SpannedItem) r0.b3(this.spannedItems, h0.w(mVar, 0, mVar.size(), new x00.l<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            @k
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem2) {
                return Integer.valueOf(g.l(Integer.valueOf(spannedItem2.getIndex()), valueOf));
            }
        }));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i11) {
        if (i11 < lowerBound() || i11 >= upperBound()) {
            return -1;
        }
        return this.lanes[i11 - this.anchor] - 1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        q.T1(this.lanes, 0, 0, 0, 6, null);
        this.spannedItems.clear();
    }

    public final void setGaps(int i11, @l int[] iArr) {
        m<SpannedItem> mVar = this.spannedItems;
        final Integer valueOf = Integer.valueOf(i11);
        int w11 = h0.w(mVar, 0, mVar.size(), new x00.l<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            @k
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
                return Integer.valueOf(g.l(Integer.valueOf(spannedItem.getIndex()), valueOf));
            }
        });
        if (w11 < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(w11 + 1), new SpannedItem(i11, iArr));
            return;
        }
        if (iArr == null) {
            this.spannedItems.remove(w11);
        } else {
            this.spannedItems.get(w11).setGaps(iArr);
        }
    }

    public final void setLane(int i11, int i12) {
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Negative lanes are not supported");
        }
        ensureValidIndex(i11);
        this.lanes[i11 - this.anchor] = i12 + 1;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }
}
