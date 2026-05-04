package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLineHeightStyleSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,157:1\n77#2,8:158\n*S KotlinDebug\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n*L\n68#1:158,8\n*E\n"})
/* loaded from: classes2.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final boolean preserveMinimumHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f11, int i11, int i12, boolean z11, boolean z12, @FloatRange(from = -1.0d, to = 1.0d) float f12, boolean z13) {
        this.lineHeight = f11;
        this.startIndex = i11;
        this.endIndex = i12;
        this.trimFirstLineTop = z11;
        this.trimLastLineBottom = z12;
        this.topRatio = f12;
        this.preserveMinimumHeight = z13;
        if ((0.0f <= f12 && f12 <= 1.0f) || f12 == -1.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int ceil = (int) Math.ceil(this.lineHeight);
        int lineHeight = ceil - LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        if (this.preserveMinimumHeight && lineHeight <= 0) {
            int i11 = fontMetricsInt.ascent;
            this.ascent = i11;
            int i12 = fontMetricsInt.descent;
            this.descent = i12;
            this.firstAscent = i11;
            this.lastDescent = i12;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float f11 = this.topRatio;
        if (f11 == -1.0f) {
            f11 = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        int ceil2 = (int) (lineHeight <= 0 ? Math.ceil(lineHeight * f11) : Math.ceil(lineHeight * (1.0f - f11)));
        int i13 = fontMetricsInt.descent;
        int i14 = ceil2 + i13;
        this.descent = i14;
        int i15 = i14 - ceil;
        this.ascent = i15;
        if (this.trimFirstLineTop) {
            i15 = fontMetricsInt.ascent;
        }
        this.firstAscent = i15;
        if (this.trimLastLineBottom) {
            i14 = i13;
        }
        this.lastDescent = i14;
        this.firstAscentDiff = fontMetricsInt.ascent - i15;
        this.lastDescentDiff = i14 - i13;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z11 = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i11, i12, z11);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@k CharSequence charSequence, int i11, int i12, int i13, int i14, @k Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z11 = i11 == this.startIndex;
        boolean z12 = i12 == this.endIndex;
        if (z11 && z12 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z11 ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z12 ? this.lastDescent : this.descent;
    }

    @k
    public final LineHeightStyleSpan copy$ui_text_release(int i11, int i12, boolean z11) {
        return new LineHeightStyleSpan(this.lineHeight, i11, i12, z11, this.trimLastLineBottom, this.topRatio, this.preserveMinimumHeight);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
