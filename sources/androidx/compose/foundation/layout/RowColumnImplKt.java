package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,707:1\n34#2,4:708\n39#2:713\n34#2,6:715\n34#2,4:722\n39#2:727\n26#3:712\n26#3:714\n26#3:721\n26#3:726\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n425#1:708,4\n425#1:713\n451#1:715,6\n478#1:722,4\n478#1:727\n432#1:712\n435#1:714\n475#1:721\n487#1:726\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    @l
    public static final CrossAxisAlignment getCrossAxisAlignment(@l RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(@l RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    @l
    public static final RowColumnParentData getRowColumnParentData(@m80.k IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(@l RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i12, i11);
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i13 = 0;
        float f11 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i14);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(pVar.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i13 = Math.max(i13, pVar2.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f11 += weight;
            }
        }
        int round = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f11);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i15);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i13 = Math.max(i13, pVar2.invoke(intrinsicMeasurable2, Integer.valueOf(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return i13;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i15);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int intValue = pVar.invoke(intrinsicMeasurable, Integer.valueOf(i11)).intValue();
            if (weight == 0.0f) {
                i14 += intValue;
            } else if (weight > 0.0f) {
                f11 += weight;
                i13 = Math.max(i13, Math.round(intValue / weight));
            }
        }
        return Math.round(i13 * f11) + i14 + ((list.size() - 1) * i12);
    }

    public static final boolean isRelative(@l RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @l
    public static final RowColumnParentData getRowColumnParentData(@m80.k Placeable placeable) {
        Object parentData = placeable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }
}
