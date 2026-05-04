package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface IntervalList<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,204:1\n96#2,5:205\n96#2,5:210\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n*L\n81#1:205,5\n82#1:210,5\n*E\n"})
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i11, int i12, T t11) {
            this.startIndex = i11;
            this.size = i12;
            this.value = t11;
            if (!(i11 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("startIndex should be >= 0");
            }
            if (i12 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("size should be > 0");
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    static /* synthetic */ void forEach$default(IntervalList intervalList, int i11, int i12, l lVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = intervalList.getSize() - 1;
        }
        intervalList.forEach(i11, i12, lVar);
    }

    void forEach(int i11, int i12, @k l<? super Interval<? extends T>, g2> lVar);

    @k
    Interval<T> get(int i11);

    int getSize();
}
