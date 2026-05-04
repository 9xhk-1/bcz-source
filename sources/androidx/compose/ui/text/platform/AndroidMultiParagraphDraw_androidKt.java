package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidMultiParagraphDraw.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,95:1\n34#2,6:96\n34#2,6:106\n34#2,6:112\n33#3:102\n53#4,3:103\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n*L\n53#1:96,6\n60#1:106,6\n90#1:112,6\n57#1:102\n57#1:103,3\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m4812drawMultiParagraph7AXcY_I(@k MultiParagraph multiParagraph, @k Canvas canvas, @k Brush brush, float f11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1) {
            m4814drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f11, shadow, textDecoration, drawStyle, i11);
        } else if (brush instanceof SolidColor) {
            m4814drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f11, shadow, textDecoration, drawStyle, i11);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (int i12 = 0; i12 < size; i12++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i12);
                f13 += paragraphInfo.getParagraph().getHeight();
                f12 = Math.max(f12, paragraphInfo.getParagraph().getWidth());
            }
            Shader mo2478createShaderuvyYCjk = ((ShaderBrush) brush).mo2478createShaderuvyYCjk(Size.m2328constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)));
            Matrix matrix = new Matrix();
            mo2478createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i13);
                paragraphInfo2.getParagraph().mo4375painthn5TExg(canvas, BrushKt.ShaderBrush(mo2478createShaderuvyYCjk), f11, shadow, textDecoration, drawStyle, i11);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo2478createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m4813drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f11, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = Float.NaN;
        }
        m4812drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f11, (i12 & 8) != 0 ? null : shadow, (i12 & 16) != 0 ? null : textDecoration, (i12 & 32) != 0 ? null : drawStyle, (i12 & 64) != 0 ? BlendMode.Companion.m2451getSrcOver0nO6VwU() : i11);
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m4814drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f11, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i11) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i12);
            paragraphInfo.getParagraph().mo4375painthn5TExg(canvas, brush, f11, shadow, textDecoration, drawStyle, i11);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
