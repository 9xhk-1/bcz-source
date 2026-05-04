package androidx.compose.ui.text;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,389:1\n249#2,8:390\n257#2,6:403\n249#2,8:409\n257#2,6:422\n249#2,8:428\n257#2:441\n259#2,4:445\n249#2,8:449\n257#2,6:462\n65#3:398\n69#3:401\n65#3:417\n69#3:420\n65#3:436\n69#3:439\n65#3:457\n69#3:460\n65#3:479\n69#3:495\n60#4:399\n70#4:402\n60#4:418\n70#4:421\n60#4:437\n70#4:440\n60#4:458\n70#4:461\n85#4:469\n90#4:471\n60#4:474\n60#4:477\n60#4:482\n70#4:490\n70#4:493\n70#4:498\n22#5:400\n22#5:419\n22#5:438\n22#5:459\n22#5:475\n22#5:478\n26#5:480\n22#5,5:483\n22#5:491\n22#5:494\n26#5:496\n22#5,5:499\n640#6:442\n646#6:443\n635#6:444\n54#7:468\n59#7:470\n153#8:472\n153#8:488\n57#9:473\n57#9:476\n57#9:481\n61#9:489\n61#9:492\n61#9:497\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n168#1:390,8\n168#1:403,6\n231#1:409,8\n231#1:422,6\n271#1:428,8\n271#1:441\n271#1:445,4\n331#1:449,8\n331#1:462,6\n169#1:398\n169#1:401\n232#1:417\n232#1:420\n272#1:436\n272#1:439\n332#1:457\n332#1:460\n368#1:479\n380#1:495\n169#1:399\n169#1:402\n232#1:418\n232#1:421\n272#1:437\n272#1:440\n332#1:458\n332#1:461\n355#1:469\n356#1:471\n365#1:474\n368#1:477\n370#1:482\n377#1:490\n380#1:493\n382#1:498\n169#1:400\n232#1:419\n272#1:438\n332#1:459\n365#1:475\n368#1:478\n368#1:480\n370#1:483,5\n377#1:491\n380#1:494\n380#1:496\n382#1:499,5\n278#1:442\n291#1:443\n291#1:444\n355#1:468\n356#1:470\n365#1:472\n377#1:488\n365#1:473\n368#1:476\n370#1:481\n377#1:489\n380#1:492\n382#1:497\n*E\n"})
/* loaded from: classes2.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m5019equalsimpl0(textLayoutResult.getLayoutInput().m4526getOverflowgIe3tQ8(), TextOverflow.Companion.m5032getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m3117clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32), (int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L), 0, 16, null);
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m4538drawTextJFhB2K4(@k DrawScope drawScope, @k TextMeasurer textMeasurer, @k AnnotatedString annotatedString, long j11, @k TextStyle textStyle, int i11, boolean z11, int i12, @k List<AnnotatedString.Range<Placeholder>> list, long j12, int i13) {
        TextLayoutResult m4533measurexDpz5zY$default = TextMeasurer.m4533measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i11, z11, i12, list, m4546textLayoutConstraintsv_w8tDc(drawScope, j12, j11), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            clip(transform, m4533measurexDpz5zY$default);
            m4533measurexDpz5zY$default.getMultiParagraph().m4413paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : i13);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m4540drawTextLVfH_YU(@k DrawScope drawScope, @k TextLayoutResult textLayoutResult, @k Brush brush, long j11, float f11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11)));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m4415painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f11) ? f11 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i11);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m4542drawTextTPWCCtM(@k DrawScope drawScope, @k TextMeasurer textMeasurer, @k String str, long j11, @k TextStyle textStyle, int i11, boolean z11, int i12, long j12, int i13) {
        TextLayoutResult m4533measurexDpz5zY$default = TextMeasurer.m4533measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, 2, null), textStyle, i11, z11, i12, null, m4546textLayoutConstraintsv_w8tDc(drawScope, j12, j11), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            clip(transform, m4533measurexDpz5zY$default);
            m4533measurexDpz5zY$default.getMultiParagraph().m4413paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : i13);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m4544drawTextd8rzKo(@k DrawScope drawScope, @k TextLayoutResult textLayoutResult, long j11, long j12, float f11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11) {
        float alpha;
        int i12;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        Canvas canvas;
        MultiParagraph multiParagraph;
        Shadow shadow3 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle3 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (4294967295L & j12)));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush == null || j11 != 16) {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawScope.getDrawContext().getCanvas();
                if (j11 == 16) {
                    j11 = textLayoutResult.getLayoutInput().getStyle().m4589getColor0d7_KjU();
                }
                multiParagraph2.m4413paintLG529CI(canvas2, TextDrawStyleKt.m4997modulateDxMtmZc(j11, f11), shadow3, textDecoration3, drawStyle3, i11);
            } else {
                MultiParagraph multiParagraph3 = textLayoutResult.getMultiParagraph();
                Canvas canvas3 = drawScope.getDrawContext().getCanvas();
                if (Float.isNaN(f11)) {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                    i12 = i11;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                } else {
                    alpha = f11;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                    i12 = i11;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                }
                multiParagraph.m4415painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i12);
            }
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        } catch (Throwable th2) {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            throw th2;
        }
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m4546textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j11, long j12) {
        int round;
        int i11;
        int round2;
        int i12 = 0;
        if (j11 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Float.intBitsToFloat((int) (j11 >> 32)))) {
            round = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32)) - Float.intBitsToFloat((int) (j12 >> 32))));
            i11 = 0;
        } else {
            i11 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j11 >> 32))));
            round = i11;
        }
        if (j11 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Float.intBitsToFloat((int) (j11 & 4294967295L)))) {
            round2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L))));
        } else {
            i12 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j11 & 4294967295L))));
            round2 = i12;
        }
        return ConstraintsKt.Constraints(i11, round, i12, round2);
    }
}
