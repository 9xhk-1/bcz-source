package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,730:1\n85#2:731\n149#3:732\n149#3:733\n149#3:734\n149#3:735\n149#3:736\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n102#1:731\n709#1:732\n712#1:733\n715#1:734\n718#1:735\n729#1:736\n*E\n"})
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m5115constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m5115constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m5115constructorimpl(24);

    static {
        float f11 = 8;
        LeadingIconEndSpacing = Dp.m5115constructorimpl(f11);
        TrailingIconSpacing = Dp.m5115constructorimpl(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fe  */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Chip(@m80.k final x00.a<yz.g2> r31, @m80.l androidx.compose.ui.Modifier r32, boolean r33, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r34, @m80.l androidx.compose.ui.graphics.Shape r35, @m80.l androidx.compose.foundation.BorderStroke r36, @m80.l androidx.compose.material.ChipColors r37, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r38, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r39, @m80.l androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.Chip(x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ChipColors, x00.p, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$0(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(final boolean r39, @m80.k final x00.a<yz.g2> r40, @m80.l androidx.compose.ui.Modifier r41, boolean r42, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r43, @m80.l androidx.compose.ui.graphics.Shape r44, @m80.l androidx.compose.foundation.BorderStroke r45, @m80.l androidx.compose.material.SelectableChipColors r46, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r47, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r48, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r49, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r50, @m80.l androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.FilterChip(boolean, x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.SelectableChipColors, x00.p, x00.p, x00.p, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
