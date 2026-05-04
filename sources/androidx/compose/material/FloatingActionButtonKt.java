package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,398:1\n1247#2,6:399\n149#3:405\n149#3:406\n149#3:407\n149#3:408\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n93#1:399,6\n394#1:405\n395#1:406\n396#1:407\n397#1:408\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m5115constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m5115constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m5115constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m5115constructorimpl(20);

    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1688ExtendedFloatingActionButtonwqdebIU(@m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, @m80.k final x00.a<yz.g2> r28, @m80.l androidx.compose.ui.Modifier r29, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r31, @m80.l androidx.compose.ui.graphics.Shape r32, long r33, long r35, @m80.l androidx.compose.material.FloatingActionButtonElevation r37, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m1688ExtendedFloatingActionButtonwqdebIU(x00.p, x00.a, androidx.compose.ui.Modifier, x00.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1689FloatingActionButtonbogVsAg(@m80.k final x00.a<yz.g2> r28, @m80.l androidx.compose.ui.Modifier r29, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r30, @m80.l androidx.compose.ui.graphics.Shape r31, long r32, long r34, @m80.l androidx.compose.material.FloatingActionButtonElevation r36, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r37, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m1689FloatingActionButtonbogVsAg(x00.a, androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
