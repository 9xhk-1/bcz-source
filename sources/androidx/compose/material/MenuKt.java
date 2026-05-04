package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n1969#2:389\n1966#2:390\n1884#2,7:391\n1969#2:398\n1966#2:399\n1884#2,7:400\n1247#3,6:407\n99#4:413\n96#4,6:414\n102#4:448\n106#4:452\n79#5,6:420\n86#5,4:435\n90#5,2:445\n94#5:451\n368#6,9:426\n377#6:447\n378#6,2:449\n4034#7,6:439\n85#8:453\n85#8:454\n149#9:455\n149#9:456\n149#9:457\n149#9:458\n149#9:459\n149#9:460\n149#9:461\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n162#1:389\n162#1:390\n162#1:391,7\n183#1:398\n183#1:399\n183#1:400,7\n204#1:407,6\n233#1:413\n233#1:414,6\n233#1:448\n233#1:452\n233#1:420,6\n233#1:435,4\n233#1:445,2\n233#1:451\n233#1:426,9\n233#1:447\n233#1:449,2\n233#1:439,6\n162#1:453\n183#1:454\n271#1:455\n272#1:456\n273#1:457\n274#1:458\n275#1:459\n276#1:460\n277#1:461\n*E\n"})
/* loaded from: classes.dex */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m5115constructorimpl(16);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m5115constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m5115constructorimpl(280);

    static {
        float f11 = 8;
        MenuElevation = Dp.m5115constructorimpl(f11);
        float f12 = 48;
        MenuVerticalMargin = Dp.m5115constructorimpl(f12);
        DropdownMenuVerticalPadding = Dp.m5115constructorimpl(f11);
        DropdownMenuItemDefaultMinHeight = Dp.m5115constructorimpl(f12);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0088  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuContent(@m80.k final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @m80.k final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r25, @m80.k final androidx.compose.foundation.ScrollState r26, @m80.l androidx.compose.ui.Modifier r27, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.foundation.ScrollState, androidx.compose.ui.Modifier, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuItemContent(@m80.k final x00.a<yz.g2> r21, @m80.l androidx.compose.ui.Modifier r22, boolean r23, @m80.l androidx.compose.foundation.layout.PaddingValues r24, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r25, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuItemContent(x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long calculateTransformOrigin(@m80.k androidx.compose.ui.unit.IntRect r5, @m80.k androidx.compose.ui.unit.IntRect r6) {
        /*
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
