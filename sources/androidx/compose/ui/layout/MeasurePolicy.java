package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,166:1\n150#2,3:167\n34#2,6:170\n153#2:176\n150#2,3:177\n34#2,6:180\n153#2:186\n150#2,3:187\n34#2,6:190\n153#2:196\n150#2,3:197\n34#2,6:200\n153#2:206\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:167,3\n102#1:170,6\n102#1:176\n121#1:177,3\n121#1:180,6\n121#1:186\n139#1:187,3\n139#1:190,6\n139#1:196\n157#1:197,3\n157#1:200,6\n157#1:206\n*E\n"})
/* loaded from: classes.dex */
public interface MeasurePolicy {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(@k MeasurePolicy measurePolicy, @k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.super.maxIntrinsicHeight(intrinsicMeasureScope, list, i11);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@k MeasurePolicy measurePolicy, @k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.super.maxIntrinsicWidth(intrinsicMeasureScope, list, i11);
        }

        @Deprecated
        public static int minIntrinsicHeight(@k MeasurePolicy measurePolicy, @k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.super.minIntrinsicHeight(intrinsicMeasureScope, list, i11);
        }

        @Deprecated
        public static int minIntrinsicWidth(@k MeasurePolicy measurePolicy, @k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            return MeasurePolicy.super.minIntrinsicWidth(intrinsicMeasureScope, list, i11);
        }
    }

    default int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo33measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo33measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    @k
    /* renamed from: measure-3p2s80s */
    MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11);

    default int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo33measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo33measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }
}
