package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,110:1\n1101#2:111\n1083#2,2:112\n1#3:114\n519#4:115\n423#4,9:116\n423#4,9:130\n96#5,5:125\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n48#1:111\n48#1:112,2\n69#1:115\n75#1:116,9\n88#1:130,9\n80#1:125,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = MutableVector.$stable;

    @k
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,110:1\n96#2,5:111\n96#2,5:116\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n*L\n105#1:111,5\n106#1:116,5\n*E\n"})
    public static final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Interval(int i11, int i12) {
            this.start = i11;
            this.end = i12;
            if (!(i11 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("negative start index");
            }
            if (i12 >= i11) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = interval.start;
            }
            if ((i13 & 2) != 0) {
                i12 = interval.end;
            }
            return interval.copy(i11, i12);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        @k
        public final Interval copy(int i11, int i12) {
            return new Interval(i11, i12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        @k
        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    @k
    public final Interval addInterval(int i11, int i12) {
        Interval interval = new Interval(i11, i12);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            Interval interval = intervalArr[i11];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            Interval interval = intervalArr[i11];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (!(start >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
        }
        return start;
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.getSize() != 0;
    }

    public final void removeInterval(@k Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }
}
