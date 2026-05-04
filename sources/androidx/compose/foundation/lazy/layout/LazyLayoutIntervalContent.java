package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,72:1\n50#1,3:73\n50#1,3:76\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n34#1:73,3\n40#1:76,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Interval {
        @l
        default x00.l<Integer, Object> getKey() {
            return null;
        }

        @k
        default x00.l<Integer, Object> getType() {
            return new x00.l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                public final Void invoke(int i11) {
                    return null;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            };
        }
    }

    @l
    public final Object getContentType(int i11) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i11);
        return interval.getValue().getType().invoke(Integer.valueOf(i11 - interval.getStartIndex()));
    }

    @k
    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    @k
    public final Object getKey(int i11) {
        Object invoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i11);
        int startIndex = i11 - interval.getStartIndex();
        x00.l<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i11) : invoke;
    }

    public final <T> T withInterval(int i11, @k p<? super Integer, ? super Interval, ? extends T> pVar) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i11);
        return pVar.invoke(Integer.valueOf(i11 - interval.getStartIndex()), interval.getValue());
    }
}
