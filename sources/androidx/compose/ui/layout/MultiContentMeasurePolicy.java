package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,240:1\n150#2,3:241\n34#2,4:244\n150#2,3:248\n34#2,6:251\n153#2:257\n39#2:258\n153#2:259\n150#2,3:260\n34#2,4:263\n150#2,3:267\n34#2,6:270\n153#2:276\n39#2:277\n153#2:278\n150#2,3:279\n34#2,4:282\n150#2,3:286\n34#2,6:289\n153#2:295\n39#2:296\n153#2:297\n150#2,3:298\n34#2,4:301\n150#2,3:305\n34#2,6:308\n153#2:314\n39#2:315\n153#2:316\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n111#1:241,3\n111#1:244,4\n112#1:248,3\n112#1:251,6\n112#1:257\n111#1:258\n111#1:259\n137#1:260,3\n137#1:263,4\n138#1:267,3\n138#1:270,6\n138#1:276\n137#1:277\n137#1:278\n162#1:279,3\n162#1:282,4\n163#1:286,3\n163#1:289,6\n163#1:295\n162#1:296\n162#1:297\n187#1:298,3\n187#1:301,4\n188#1:305,3\n188#1:308,6\n188#1:314\n187#1:315\n187#1:316\n*E\n"})
/* loaded from: classes.dex */
public interface MultiContentMeasurePolicy {
    default int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i12);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i13), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo673measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i12);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i13), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo673measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    @k
    /* renamed from: measure-3p2s80s */
    MeasureResult mo673measure3p2s80s(@k MeasureScope measureScope, @k List<? extends List<? extends Measurable>> list, long j11);

    default int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i12);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i13), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo673measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends List<? extends IntrinsicMeasurable>> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i12);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i13), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo673measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }
}
