package androidx.compose.material;

import a90.c3;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,985:1\n135#2:986\n75#3:987\n75#3:988\n149#4:989\n149#4:990\n149#4:991\n149#4:992\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n279#1:986\n386#1:987\n440#1:988\n202#1:989\n208#1:990\n234#1:991\n240#1:992\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @k
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5115constructorimpl(56);
    private static final float MinWidth = Dp.m5115constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m5115constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m5115constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1818indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z11, boolean z12, InteractionSource interactionSource, TextFieldColors textFieldColors, float f11, float f12, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            f11 = FocusedBorderThickness;
        }
        return textFieldDefaults.m1827indicatorLinegv0btCI(modifier, z11, z12, interactionSource, textFieldColors, f11, (i11 & 32) != 0 ? UnfocusedBorderThickness : f12);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1819outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 2) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 4) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 8) != 0) {
            f14 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1829outlinedTextFieldPaddinga9UjIt4(f11, f12, f13, f14);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1820textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 2) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 4) != 0) {
            f13 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i11 & 8) != 0) {
            f14 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1831textFieldWithLabelPaddinga9UjIt4(f11, f12, f13, f14);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1821textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 2) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 4) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i11 & 8) != 0) {
            f14 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1832textFieldWithoutLabelPaddinga9UjIt4(f11, f12, f13, f14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        if ((r29 & 64) != 0) goto L105;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1822BorderBoxnbWgWpA(final boolean r20, final boolean r21, @m80.k final androidx.compose.foundation.interaction.InteractionSource r22, @m80.k final androidx.compose.material.TextFieldColors r23, @m80.l androidx.compose.ui.graphics.Shape r24, float r25, float r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m1822BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0218  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(@m80.k final java.lang.String r62, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r63, final boolean r64, final boolean r65, @m80.k final androidx.compose.ui.text.input.VisualTransformation r66, @m80.k final androidx.compose.foundation.interaction.InteractionSource r67, boolean r68, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r69, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r70, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r71, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r72, @m80.l androidx.compose.ui.graphics.Shape r73, @m80.l androidx.compose.material.TextFieldColors r74, @m80.l androidx.compose.foundation.layout.PaddingValues r75, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r76, @m80.l androidx.compose.runtime.Composer r77, final int r78, final int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, x00.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, x00.p, x00.p, x00.p, x00.p, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, x00.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(@m80.k final java.lang.String r62, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r63, final boolean r64, final boolean r65, @m80.k final androidx.compose.ui.text.input.VisualTransformation r66, @m80.k final androidx.compose.foundation.interaction.InteractionSource r67, boolean r68, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r69, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r70, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r71, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r72, @m80.l androidx.compose.ui.graphics.Shape r73, @m80.l androidx.compose.material.TextFieldColors r74, @m80.l androidx.compose.foundation.layout.PaddingValues r75, @m80.l androidx.compose.runtime.Composer r76, final int r77, final int r78, int r79) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, x00.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, x00.p, x00.p, x00.p, x00.p, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1823getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1824getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1825getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @j(name = "getOutlinedTextFieldShape")
    @k
    @Composable
    @ReadOnlyComposable
    public final Shape getOutlinedTextFieldShape(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i11, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:227)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    @j(name = "getTextFieldShape")
    @k
    @Composable
    @ReadOnlyComposable
    public final Shape getTextFieldShape(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i11, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:220)");
        }
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return copy$default;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1826getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterialApi
    @k
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1827indicatorLinegv0btCI(@k Modifier modifier, final boolean z11, final boolean z12, @k final InteractionSource interactionSource, @k final TextFieldColors textFieldColors, final float f11, final float f12) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@k InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z12));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m5113boximpl(f11));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m5113boximpl(f12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                State m1834animateBorderStrokeAsStateNuRrP5Q;
                composer.startReplaceGroup(1398930845);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, i11, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
                }
                m1834animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1834animateBorderStrokeAsStateNuRrP5Q(z11, z12, interactionSource, textFieldColors, f11, f12, composer, 0);
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, (BorderStroke) m1834animateBorderStrokeAsStateNuRrP5Q.getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return drawIndicatorLine;
            }
        });
    }

    @Composable
    @k
    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1828outlinedTextFieldColorsdx8h9Zs(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, @l Composer composer, int i11, int i12, int i13, int i14) {
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j41;
        long j42;
        long j43;
        long m2508copywmQWz5c$default = (i14 & 1) != 0 ? Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2508copywmQWz5c$default2 = (i14 & 2) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2544getTransparent0d7_KjU = (i14 & 4) != 0 ? Color.Companion.m2544getTransparent0d7_KjU() : j13;
        long m1600getPrimary0d7_KjU = (i14 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j14;
        long m1594getError0d7_KjU = (i14 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j15;
        long m2508copywmQWz5c$default3 = (i14 & 32) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m2508copywmQWz5c$default4 = (i14 & 64) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((i14 & 128) != 0) {
            long j44 = m2508copywmQWz5c$default4;
            j35 = Color.m2508copywmQWz5c$default(j44, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j44;
        } else {
            j34 = m2508copywmQWz5c$default4;
            j35 = j18;
        }
        long m1594getError0d7_KjU2 = (i14 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j19;
        long m2508copywmQWz5c$default5 = (i14 & 512) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if ((i14 & 1024) != 0) {
            long j45 = m2508copywmQWz5c$default5;
            j37 = Color.m2508copywmQWz5c$default(j45, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j36 = j45;
        } else {
            j36 = m2508copywmQWz5c$default5;
            j37 = j22;
        }
        long j46 = (i14 & 2048) != 0 ? j36 : j23;
        long m2508copywmQWz5c$default6 = (i14 & 4096) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        if ((i14 & 8192) != 0) {
            long j47 = m2508copywmQWz5c$default6;
            j39 = Color.m2508copywmQWz5c$default(j47, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j38 = j47;
        } else {
            j38 = m2508copywmQWz5c$default6;
            j39 = j25;
        }
        long m1594getError0d7_KjU3 = (i14 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j26;
        long m2508copywmQWz5c$default7 = (32768 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long m2508copywmQWz5c$default8 = (65536 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        if ((131072 & i14) != 0) {
            long j48 = m2508copywmQWz5c$default8;
            j42 = Color.m2508copywmQWz5c$default(j48, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j41 = j48;
        } else {
            j41 = m2508copywmQWz5c$default8;
            j42 = j29;
        }
        long m1594getError0d7_KjU4 = (262144 & i14) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j31;
        long m2508copywmQWz5c$default9 = (524288 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long m2508copywmQWz5c$default10 = (i14 & 1048576) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j33;
        if (ComposerKt.isTraceInProgress()) {
            j43 = m2508copywmQWz5c$default10;
            ComposerKt.traceEventStart(1762667317, i11, i12, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:462)");
        } else {
            j43 = m2508copywmQWz5c$default10;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m2508copywmQWz5c$default, m2508copywmQWz5c$default2, m1600getPrimary0d7_KjU, m1594getError0d7_KjU, m2508copywmQWz5c$default3, j34, m1594getError0d7_KjU2, j35, j36, j37, j46, j38, j39, m1594getError0d7_KjU3, m2544getTransparent0d7_KjU, m2508copywmQWz5c$default7, j41, j42, m1594getError0d7_KjU4, m2508copywmQWz5c$default9, j43, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    @k
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1829outlinedTextFieldPaddinga9UjIt4(float f11, float f12, float f13, float f14) {
        return PaddingKt.m722PaddingValuesa9UjIt4(f11, f12, f13, f14);
    }

    @Composable
    @k
    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1830textFieldColorsdx8h9Zs(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, @l Composer composer, int i11, int i12, int i13, int i14) {
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j41;
        long j42;
        long j43;
        long m2508copywmQWz5c$default = (i14 & 1) != 0 ? Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2508copywmQWz5c$default2 = (i14 & 2) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default3 = (i14 & 4) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m1600getPrimary0d7_KjU = (i14 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j14;
        long m1594getError0d7_KjU = (i14 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j15;
        long m2508copywmQWz5c$default4 = (i14 & 32) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m2508copywmQWz5c$default5 = (i14 & 64) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((i14 & 128) != 0) {
            long j44 = m2508copywmQWz5c$default5;
            j35 = Color.m2508copywmQWz5c$default(j44, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j44;
        } else {
            j34 = m2508copywmQWz5c$default5;
            j35 = j18;
        }
        long m1594getError0d7_KjU2 = (i14 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j19;
        long m2508copywmQWz5c$default6 = (i14 & 512) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if ((i14 & 1024) != 0) {
            long j45 = m2508copywmQWz5c$default6;
            j37 = Color.m2508copywmQWz5c$default(j45, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j36 = j45;
        } else {
            j36 = m2508copywmQWz5c$default6;
            j37 = j22;
        }
        long j46 = (i14 & 2048) != 0 ? j36 : j23;
        long m2508copywmQWz5c$default7 = (i14 & 4096) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        if ((i14 & 8192) != 0) {
            long j47 = m2508copywmQWz5c$default7;
            j39 = Color.m2508copywmQWz5c$default(j47, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j38 = j47;
        } else {
            j38 = m2508copywmQWz5c$default7;
            j39 = j25;
        }
        long m1594getError0d7_KjU3 = (i14 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j26;
        long m2508copywmQWz5c$default8 = (32768 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long m2508copywmQWz5c$default9 = (65536 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        if ((131072 & i14) != 0) {
            long j48 = m2508copywmQWz5c$default9;
            j42 = Color.m2508copywmQWz5c$default(j48, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j41 = j48;
        } else {
            j41 = m2508copywmQWz5c$default9;
            j42 = j29;
        }
        long m1594getError0d7_KjU4 = (262144 & i14) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j31;
        long m2508copywmQWz5c$default10 = (524288 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long m2508copywmQWz5c$default11 = (i14 & 1048576) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j33;
        if (ComposerKt.isTraceInProgress()) {
            j43 = m2508copywmQWz5c$default11;
            ComposerKt.traceEventStart(231892599, i11, i12, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:408)");
        } else {
            j43 = m2508copywmQWz5c$default11;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m2508copywmQWz5c$default, m2508copywmQWz5c$default2, m1600getPrimary0d7_KjU, m1594getError0d7_KjU, m2508copywmQWz5c$default4, j34, m1594getError0d7_KjU2, j35, j36, j37, j46, j38, j39, m1594getError0d7_KjU3, m2508copywmQWz5c$default3, m2508copywmQWz5c$default8, j41, j42, m1594getError0d7_KjU4, m2508copywmQWz5c$default10, j43, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    @k
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1831textFieldWithLabelPaddinga9UjIt4(float f11, float f12, float f13, float f14) {
        return PaddingKt.m722PaddingValuesa9UjIt4(f11, f13, f12, f14);
    }

    @ExperimentalMaterialApi
    @k
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1832textFieldWithoutLabelPaddinga9UjIt4(float f11, float f12, float f13, float f14) {
        return PaddingKt.m722PaddingValuesa9UjIt4(f11, f12, f13, f14);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final java.lang.String r62, final x00.p r63, final boolean r64, final boolean r65, final androidx.compose.ui.text.input.VisualTransformation r66, final androidx.compose.foundation.interaction.InteractionSource r67, boolean r68, x00.p r69, x00.p r70, x00.p r71, x00.p r72, androidx.compose.material.TextFieldColors r73, androidx.compose.foundation.layout.PaddingValues r74, x00.p r75, androidx.compose.runtime.Composer r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, x00.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, x00.p, x00.p, x00.p, x00.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, x00.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void TextFieldDecorationBox(final java.lang.String r58, final x00.p r59, final boolean r60, final boolean r61, final androidx.compose.ui.text.input.VisualTransformation r62, final androidx.compose.foundation.interaction.InteractionSource r63, boolean r64, x00.p r65, x00.p r66, x00.p r67, x00.p r68, androidx.compose.material.TextFieldColors r69, androidx.compose.foundation.layout.PaddingValues r70, androidx.compose.runtime.Composer r71, final int r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, x00.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, x00.p, x00.p, x00.p, x00.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
