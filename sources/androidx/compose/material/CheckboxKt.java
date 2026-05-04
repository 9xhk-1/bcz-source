package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1247#2,6:485\n1247#2,6:509\n1247#2,6:515\n1969#3:491\n1966#3:492\n1884#3,7:493\n1969#3:500\n1966#3:501\n1884#3,7:502\n85#4:521\n85#4:522\n85#4:523\n85#4:524\n85#4:525\n149#5:526\n149#5:527\n149#5:528\n149#5:529\n149#5:530\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n97#1:485,6\n294#1:509,6\n298#1:515,6\n262#1:491\n262#1:492\n262#1:493,7\n279#1:500\n279#1:501\n279#1:502,7\n262#1:521\n279#1:522\n295#1:523\n296#1:524\n297#1:525\n479#1:526\n480#1:527\n481#1:528\n482#1:529\n483#1:530\n*E\n"})
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m5115constructorimpl(24);
    private static final float CheckboxSize = Dp.m5115constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f11 = 2;
        CheckboxDefaultPadding = Dp.m5115constructorimpl(f11);
        StrokeWidth = Dp.m5115constructorimpl(f11);
        RadiusSize = Dp.m5115constructorimpl(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0062  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Checkbox(final boolean r27, @m80.l final x00.l<? super java.lang.Boolean, yz.g2> r28, @m80.l androidx.compose.ui.Modifier r29, boolean r30, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r31, @m80.l androidx.compose.material.CheckboxColors r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.Checkbox(boolean, x00.l, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckboxImpl(final boolean r35, final androidx.compose.ui.state.ToggleableState r36, final androidx.compose.ui.Modifier r37, final androidx.compose.material.CheckboxColors r38, androidx.compose.runtime.Composer r39, final int r40) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$6(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$7(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$8(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0066  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TriStateCheckbox(@m80.k final androidx.compose.ui.state.ToggleableState r24, @m80.l final x00.a<yz.g2> r25, @m80.l androidx.compose.ui.Modifier r26, boolean r27, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r28, @m80.l androidx.compose.material.CheckboxColors r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1581drawBox1wkBAMs(DrawScope drawScope, long j11, long j12, float f11, float f12) {
        float f13 = f12 / 2.0f;
        Stroke stroke = new Stroke(f12, 0.0f, 0, 0, null, 30, null);
        float m2337getWidthimpl = Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc());
        if (Color.m2510equalsimpl0(j11, j12)) {
            DrawScope.m3056drawRoundRectuAw5IA$default(drawScope, j11, 0L, SizeKt.Size(m2337getWidthimpl, m2337getWidthimpl), CornerRadiusKt.CornerRadius$default(f11, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f14 = m2337getWidthimpl - (2 * f12);
        DrawScope.m3056drawRoundRectuAw5IA$default(drawScope, j11, OffsetKt.Offset(f12, f12), SizeKt.Size(f14, f14), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f11 - f12), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f15 = m2337getWidthimpl - f12;
        DrawScope.m3056drawRoundRectuAw5IA$default(drawScope, j12, OffsetKt.Offset(f13, f13), SizeKt.Size(f15, f15), CornerRadiusKt.CornerRadius$default(f11 - f13, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m1582drawCheck3IgeMak(DrawScope drawScope, long j11, float f11, float f12, float f13, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f13, 0.0f, StrokeCap.Companion.m2864getSquareKaPHkGw(), 0, null, 26, null);
        float m2337getWidthimpl = Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f12);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f12);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f12);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f12);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m2337getWidthimpl, lerp3 * m2337getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m2337getWidthimpl, lerp2 * m2337getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m2337getWidthimpl, m2337getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f11, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m3050drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j11, 0.0f, stroke, null, 0, 52, null);
    }
}
