package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,616:1\n1247#2,6:617\n149#3:623\n85#4:624\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n109#1:617,6\n119#1:623\n110#1:624\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Button(@m80.k final x00.a<yz.g2> r30, @m80.l androidx.compose.ui.Modifier r31, boolean r32, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r33, @m80.l androidx.compose.material.ButtonElevation r34, @m80.l androidx.compose.ui.graphics.Shape r35, @m80.l androidx.compose.foundation.BorderStroke r36, @m80.l androidx.compose.material.ButtonColors r37, @m80.l androidx.compose.foundation.layout.PaddingValues r38, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r39, @m80.l androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedButton(@k a<g2> aVar, @l Modifier modifier, boolean z11, @l MutableInteractionSource mutableInteractionSource, @l ButtonElevation buttonElevation, @l Shape shape, @l BorderStroke borderStroke, @l ButtonColors buttonColors, @l PaddingValues paddingValues, @k q<? super RowScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i11, int i12) {
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z12 = (i12 & 4) != 0 ? true : z11;
        MutableInteractionSource mutableInteractionSource2 = (i12 & 8) != 0 ? null : mutableInteractionSource;
        ButtonElevation buttonElevation2 = (i12 & 16) != 0 ? null : buttonElevation;
        Shape small = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke outlinedBorder = (i12 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke;
        ButtonColors m1574outlinedButtonColorsRGew2ao = (i12 & 128) != 0 ? ButtonDefaults.INSTANCE.m1574outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues contentPadding = (i12 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i11, -1, "androidx.compose.material.OutlinedButton (Button.kt:183)");
        }
        Button(aVar, modifier2, z12, mutableInteractionSource2, buttonElevation2, small, outlinedBorder, m1574outlinedButtonColorsRGew2ao, contentPadding, qVar, composer, i11 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextButton(@k a<g2> aVar, @l Modifier modifier, boolean z11, @l MutableInteractionSource mutableInteractionSource, @l ButtonElevation buttonElevation, @l Shape shape, @l BorderStroke borderStroke, @l ButtonColors buttonColors, @l PaddingValues paddingValues, @k q<? super RowScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i11, int i12) {
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z12 = (i12 & 4) != 0 ? true : z11;
        MutableInteractionSource mutableInteractionSource2 = (i12 & 8) != 0 ? null : mutableInteractionSource;
        ButtonElevation buttonElevation2 = (i12 & 16) != 0 ? null : buttonElevation;
        Shape small = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i12 & 64) == 0 ? borderStroke : null;
        ButtonColors m1575textButtonColorsRGew2ao = (i12 & 128) != 0 ? ButtonDefaults.INSTANCE.m1575textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i12 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i11, -1, "androidx.compose.material.TextButton (Button.kt:241)");
        }
        Button(aVar, modifier2, z12, mutableInteractionSource2, buttonElevation2, small, borderStroke2, m1575textButtonColorsRGew2ao, textButtonContentPadding, qVar, composer, i11 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
