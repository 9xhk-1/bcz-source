package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n99#2:446\n96#2,6:447\n102#2:481\n106#2:604\n79#3,6:453\n86#3,4:468\n90#3,2:478\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:520\n79#3,6:528\n86#3,4:543\n90#3,2:553\n94#3:559\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n94#3:603\n368#4,9:459\n377#4:480\n368#4,9:495\n377#4:516\n378#4,2:518\n368#4,9:534\n377#4:555\n378#4,2:557\n368#4,9:574\n377#4:595\n378#4,2:597\n378#4,2:601\n4034#5,6:472\n4034#5,6:508\n4034#5,6:547\n4034#5,6:587\n51#6:482\n71#7:483\n69#7,5:484\n74#7:517\n78#7:521\n71#7:522\n69#7,5:523\n74#7:556\n78#7:560\n71#7:561\n68#7,6:562\n74#7:596\n78#7:600\n149#8:605\n149#8:606\n149#8:607\n149#8:608\n149#8:609\n149#8:610\n149#8:611\n149#8:612\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n*L\n151#1:446\n151#1:447,6\n151#1:481\n151#1:604\n151#1:453,6\n151#1:468,4\n151#1:478,2\n153#1:489,6\n153#1:504,4\n153#1:514,2\n153#1:520\n166#1:528,6\n166#1:543,4\n166#1:553,2\n166#1:559\n175#1:568,6\n175#1:583,4\n175#1:593,2\n175#1:599\n151#1:603\n151#1:459,9\n151#1:480\n153#1:495,9\n153#1:516\n153#1:518,2\n166#1:534,9\n166#1:555\n166#1:557,2\n175#1:574,9\n175#1:595\n175#1:597,2\n151#1:601,2\n151#1:472,6\n153#1:508,6\n166#1:547,6\n175#1:587,6\n155#1:482\n153#1:483\n153#1:484,5\n153#1:517\n153#1:521\n166#1:522\n166#1:523,5\n166#1:556\n166#1:560\n175#1:561\n175#1:562,6\n175#1:596\n175#1:600\n128#1:605\n129#1:606\n132#1:607\n133#1:608\n134#1:609\n137#1:610\n138#1:611\n141#1:612\n*E\n"})
/* loaded from: classes.dex */
final class OneLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float TrailingRightPadding;

    @k
    public static final OneLine INSTANCE = new OneLine();
    private static final float MinHeight = Dp.m5115constructorimpl(48);
    private static final float MinHeightWithIcon = Dp.m5115constructorimpl(56);
    private static final float IconMinPaddedWidth = Dp.m5115constructorimpl(40);
    private static final float IconVerticalPadding = Dp.m5115constructorimpl(8);

    static {
        float f11 = 16;
        IconLeftPadding = Dp.m5115constructorimpl(f11);
        ContentLeftPadding = Dp.m5115constructorimpl(f11);
        ContentRightPadding = Dp.m5115constructorimpl(f11);
        TrailingRightPadding = Dp.m5115constructorimpl(f11);
    }

    private OneLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0099  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ListItem(@m80.l androidx.compose.ui.Modifier r26, @m80.l final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OneLine.ListItem(androidx.compose.ui.Modifier, x00.p, x00.p, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
