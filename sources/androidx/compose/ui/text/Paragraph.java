package androidx.compose.ui.text;

import androidx.annotation.IntRange;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface Paragraph {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return paragraph.getLineEnd(i11, z11);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m4417paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j11, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo4373paintLG529CI(canvas, (i12 & 2) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j11, (i12 & 4) != 0 ? null : shadow, (i12 & 8) != 0 ? null : textDecoration, (i12 & 16) == 0 ? drawStyle : null, (i12 & 32) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m4418paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j11, Shadow shadow, TextDecoration textDecoration, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m2545getUnspecified0d7_KjU();
        }
        paragraph.mo4374paintRPmYEkk(canvas, j11, (i11 & 4) != 0 ? null : shadow, (i11 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m4419painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f11, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i12 & 4) != 0) {
            f11 = Float.NaN;
        }
        paragraph.mo4375painthn5TExg(canvas, brush, f11, (i12 & 8) != 0 ? null : shadow, (i12 & 16) != 0 ? null : textDecoration, (i12 & 32) != 0 ? null : drawStyle, (i12 & 64) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo4367fillBoundingBoxes8ffj60Q(long j11, @k float[] fArr, @IntRange(from = 0) int i11);

    @k
    ResolvedTextDirection getBidiRunDirection(int i11);

    @k
    Rect getBoundingBox(int i11);

    @k
    Rect getCursorRect(int i11);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i11, boolean z11);

    float getLastBaseline();

    float getLineBaseline(int i11);

    float getLineBottom(int i11);

    int getLineCount();

    int getLineEnd(int i11, boolean z11);

    int getLineForOffset(int i11);

    int getLineForVerticalPosition(float f11);

    float getLineHeight(int i11);

    float getLineLeft(int i11);

    float getLineRight(int i11);

    int getLineStart(int i11);

    float getLineTop(int i11);

    float getLineWidth(int i11);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo4369getOffsetForPositionk4lQ0M(long j11);

    @k
    ResolvedTextDirection getParagraphDirection(int i11);

    @k
    Path getPathForRange(int i11, int i12);

    @k
    List<Rect> getPlaceholderRects();

    /* renamed from: getRangeForRect-8-6BmAI */
    long mo4371getRangeForRect86BmAI(@k Rect rect, int i11, @k TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo4372getWordBoundaryjx7JFs(int i11);

    boolean isLineEllipsized(int i11);

    /* renamed from: paint-LG529CI */
    void mo4373paintLG529CI(@k Canvas canvas, long j11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11);

    /* renamed from: paint-RPmYEkk */
    void mo4374paintRPmYEkk(@k Canvas canvas, long j11, @l Shadow shadow, @l TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo4375painthn5TExg(@k Canvas canvas, @k Brush brush, float f11, @l Shadow shadow, @l TextDecoration textDecoration, @l DrawStyle drawStyle, int i11);
}
