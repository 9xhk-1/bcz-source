package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n165#1,4:213\n165#1,4:217\n165#1,4:228\n1101#2:205\n1083#2,2:206\n96#3,5:208\n96#3,5:221\n472#4:226\n472#4:227\n472#4:232\n1#5:233\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n133#1:213,4\n134#1:217,4\n150#1:228,4\n94#1:205\n94#1:206,2\n112#1:208,5\n135#1:221,5\n140#1:226\n142#1:227\n159#1:232\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;

    @k
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);

    @l
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i11) {
        if (i11 < 0 || i11 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i11 + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i11) {
        return i11 < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i11;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i11) {
        int binarySearch;
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, i11)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        binarySearch = IntervalListKt.binarySearch(mutableVector, i11);
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.content[binarySearch];
        this.lastInterval = interval2;
        return interval2;
    }

    public final void addInterval(int i11, T t11) {
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
        }
        if (i11 == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i11, t11);
        this.size = getSize() + i11;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i11, int i12, @k x00.l<? super IntervalList.Interval<? extends T>, g2> lVar) {
        int binarySearch;
        if (i11 < 0 || i11 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i11 + ", size " + getSize());
        }
        if (i12 < 0 || i12 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i12 + ", size " + getSize());
        }
        if (!(i12 >= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("toIndex (" + i12 + ") should be not smaller than fromIndex (" + i11 + ')');
        }
        binarySearch = IntervalListKt.binarySearch(this.intervals, i11);
        int startIndex = this.intervals.content[binarySearch].getStartIndex();
        while (startIndex <= i12) {
            IntervalList.Interval<T> interval = this.intervals.content[binarySearch];
            lVar.invoke(interval);
            startIndex += interval.getSize();
            binarySearch++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    @k
    public IntervalList.Interval<T> get(int i11) {
        if (i11 < 0 || i11 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i11 + ", size " + getSize());
        }
        return getIntervalForIndex(i11);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
