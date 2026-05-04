package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStaticLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,358:1\n114#2,8:359\n114#2,8:367\n114#2,8:375\n114#2,8:383\n114#2,8:391\n114#2,8:399\n*S KotlinDebug\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n*L\n143#1:359,8\n144#1:367,8\n145#1:375,8\n146#1:383,8\n147#1:391,8\n148#1:399,8\n*E\n"})
/* loaded from: classes2.dex */
final class StaticLayoutParams {

    @m80.k
    private final Layout.Alignment alignment;
    private final int breakStrategy;

    @m80.l
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;

    @m80.l
    private final int[] leftIndents;
    private final int lineBreakStyle;
    private final int lineBreakWordStyle;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;

    @m80.k
    private final TextPaint paint;

    @m80.l
    private final int[] rightIndents;
    private final int start;

    @m80.k
    private final CharSequence text;

    @m80.k
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(@m80.k CharSequence charSequence, int i11, int i12, @m80.k TextPaint textPaint, int i13, @m80.k TextDirectionHeuristic textDirectionHeuristic, @m80.k Layout.Alignment alignment, int i14, @m80.l TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int i19, int i21, @m80.l int[] iArr, @m80.l int[] iArr2) {
        this.text = charSequence;
        this.start = i11;
        this.end = i12;
        this.paint = textPaint;
        this.width = i13;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i14;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i15;
        this.lineSpacingMultiplier = f11;
        this.lineSpacingExtra = f12;
        this.justificationMode = i16;
        this.includePadding = z11;
        this.useFallbackLineSpacing = z12;
        this.breakStrategy = i17;
        this.lineBreakStyle = i18;
        this.lineBreakWordStyle = i19;
        this.hyphenationFrequency = i21;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i11 >= 0 && i11 <= i12)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid start value");
        }
        if (!(i12 >= 0 && i12 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid end value");
        }
        if (!(i14 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid maxLines value");
        }
        if (!(i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid width value");
        }
        if (!(i15 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f11 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("invalid lineSpacingMultiplier value");
    }

    @m80.k
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    @m80.l
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    @m80.l
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @m80.k
    public final TextPaint getPaint() {
        return this.paint;
    }

    @m80.l
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    public final int getStart() {
        return this.start;
    }

    @m80.k
    public final CharSequence getText() {
        return this.text;
    }

    @m80.k
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ StaticLayoutParams(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int i19, int i21, int[] iArr, int[] iArr2, int i22, kotlin.jvm.internal.v vVar) {
        this(charSequence, (i22 & 2) != 0 ? 0 : i11, i12, textPaint, i13, textDirectionHeuristic, alignment, i14, truncateAt, i15, f11, f12, i16, z11, z12, i17, i18, i19, i21, iArr, iArr2);
    }
}
