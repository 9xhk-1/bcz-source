package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,707:1\n421#2,5:708\n426#2,7:717\n434#2:725\n435#2,3:727\n447#2,5:730\n452#2,15:739\n470#2,6:755\n469#2,27:762\n447#2,5:789\n452#2,15:798\n470#2,6:814\n469#2,27:821\n421#2,5:848\n426#2,7:857\n434#2:865\n435#2,3:867\n421#2,5:870\n426#2,7:879\n434#2:887\n435#2,3:889\n447#2,5:892\n452#2,15:901\n470#2,6:917\n469#2,27:924\n447#2,5:951\n452#2,15:960\n470#2,6:976\n469#2,27:983\n421#2,5:1010\n426#2,7:1019\n434#2:1027\n435#2,3:1029\n34#3,4:713\n39#3:726\n34#3,4:735\n39#3:754\n34#3,4:794\n39#3:813\n34#3,4:853\n39#3:866\n34#3,4:875\n39#3:888\n34#3,4:897\n39#3:916\n34#3,4:956\n39#3:975\n34#3,4:1015\n39#3:1028\n26#4:724\n26#4:761\n26#4:820\n26#4:864\n26#4:886\n26#4:923\n26#4:982\n26#4:1026\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n311#1:708,5\n311#1:717,7\n311#1:725\n311#1:727,3\n324#1:730,5\n324#1:739,15\n324#1:755,6\n324#1:762,27\n338#1:789,5\n338#1:798,15\n338#1:814,6\n338#1:821,27\n352#1:848,5\n352#1:857,7\n352#1:865\n352#1:867,3\n365#1:870,5\n365#1:879,7\n365#1:887\n365#1:889,3\n378#1:892,5\n378#1:901,15\n378#1:917,6\n378#1:924,27\n392#1:951,5\n392#1:960,15\n392#1:976,6\n392#1:983,27\n406#1:1010,5\n406#1:1019,7\n406#1:1027\n406#1:1029,3\n311#1:713,4\n311#1:726\n324#1:735,4\n324#1:754\n338#1:794,4\n338#1:813\n352#1:853,4\n352#1:866\n365#1:875,4\n365#1:888\n378#1:897,4\n378#1:916\n392#1:956,4\n392#1:975\n406#1:1015,4\n406#1:1028\n311#1:724\n324#1:761\n338#1:820\n352#1:864\n365#1:886\n378#1:923\n392#1:982\n406#1:1026\n*E\n"})
/* loaded from: classes.dex */
public final class IntrinsicMeasureBlocks {
    public static final int $stable = 0;

    @m80.k
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();

    private IntrinsicMeasureBlocks() {
    }

    public final int HorizontalMaxHeight(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
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
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i13 = Math.max(i13, intrinsicMeasurable.maxIntrinsicHeight(min2));
            } else if (weight > 0.0f) {
                f11 += weight;
            }
        }
        int round = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f11);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i15);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i13 = Math.max(i13, intrinsicMeasurable2.maxIntrinsicHeight(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i13;
    }

    public final int HorizontalMaxWidth(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i15);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i11);
            if (weight == 0.0f) {
                i14 += maxIntrinsicWidth;
            } else if (weight > 0.0f) {
                f11 += weight;
                i13 = Math.max(i13, Math.round(maxIntrinsicWidth / weight));
            }
        }
        return Math.round(i13 * f11) + i14 + ((list.size() - 1) * i12);
    }

    public final int HorizontalMinHeight(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
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
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i13 = Math.max(i13, intrinsicMeasurable.minIntrinsicHeight(min2));
            } else if (weight > 0.0f) {
                f11 += weight;
            }
        }
        int round = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f11);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i15);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i13 = Math.max(i13, intrinsicMeasurable2.minIntrinsicHeight(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i13;
    }

    public final int HorizontalMinWidth(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i15);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i11);
            if (weight == 0.0f) {
                i14 += minIntrinsicWidth;
            } else if (weight > 0.0f) {
                f11 += weight;
                i13 = Math.max(i13, Math.round(minIntrinsicWidth / weight));
            }
        }
        return Math.round(i13 * f11) + i14 + ((list.size() - 1) * i12);
    }

    public final int VerticalMaxHeight(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i15);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i11);
            if (weight == 0.0f) {
                i14 += maxIntrinsicHeight;
            } else if (weight > 0.0f) {
                f11 += weight;
                i13 = Math.max(i13, Math.round(maxIntrinsicHeight / weight));
            }
        }
        return Math.round(i13 * f11) + i14 + ((list.size() - 1) * i12);
    }

    public final int VerticalMaxWidth(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
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
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i13 = Math.max(i13, intrinsicMeasurable.maxIntrinsicWidth(min2));
            } else if (weight > 0.0f) {
                f11 += weight;
            }
        }
        int round = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f11);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i15);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i13 = Math.max(i13, intrinsicMeasurable2.maxIntrinsicWidth(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i13;
    }

    public final int VerticalMinHeight(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i15);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i11);
            if (weight == 0.0f) {
                i14 += minIntrinsicHeight;
            } else if (weight > 0.0f) {
                f11 += weight;
                i13 = Math.max(i13, Math.round(minIntrinsicHeight / weight));
            }
        }
        return Math.round(i13 * f11) + i14 + ((list.size() - 1) * i12);
    }

    public final int VerticalMinWidth(@m80.k List<? extends IntrinsicMeasurable> list, int i11, int i12) {
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
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - min);
                min += min2;
                i13 = Math.max(i13, intrinsicMeasurable.minIntrinsicWidth(min2));
            } else if (weight > 0.0f) {
                f11 += weight;
            }
        }
        int round = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - min, 0) / f11);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i15);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i13 = Math.max(i13, intrinsicMeasurable2.minIntrinsicWidth(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i13;
    }
}
