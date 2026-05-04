package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextAutoSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,235:1\n182#2,2:236\n182#2,2:238\n*S KotlinDebug\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n*L\n134#1:236,2\n139#1:238,2\n*E\n"})
/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j11, long j12, long j13, v vVar) {
        this(j11, j12, j13);
    }

    private final boolean isLastLineEllipsized(TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getLineCount() > 0) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) obj;
        return TextUnit.m5306equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m5306equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m5306equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r5.getDidOverflowHeight() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r2 > 0) goto L14;
     */
    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo1023getFontSizeCi0_558(@m80.k androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope r17, long r18, @m80.k androidx.compose.ui.text.AnnotatedString r20) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AutoSizeStepBased.mo1023getFontSizeCi0_558(androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope, long, androidx.compose.ui.text.AnnotatedString):long");
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.m5310hashCodeimpl(this.minFontSize) * 31) + TextUnit.m5310hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m5310hashCodeimpl(this.stepSize);
    }

    private AutoSizeStepBased(long j11, long j12, long j13) {
        this.minFontSize = j11;
        this.maxFontSize = j12;
        this.stepSize = j13;
        TextUnit.Companion companion = TextUnit.Companion;
        if (TextUnit.m5306equalsimpl0(j11, companion.m5320getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m5306equalsimpl0(j12, companion.m5320getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m5306equalsimpl0(j13, companion.m5320getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(this.minFontSize), TextUnit.m5308getTypeUIouoOA(j12))) {
            long j14 = this.minFontSize;
            TextUnitKt.m5323checkArithmeticNB67dxo(j14, j12);
            if (Float.compare(TextUnit.m5309getValueimpl(j14), TextUnit.m5309getValueimpl(j12)) > 0) {
                this.minFontSize = j12;
            }
        }
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j13), TextUnitType.Companion.m5342getSpUIouoOA())) {
            long sp2 = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m5323checkArithmeticNB67dxo(j13, sp2);
            if (Float.compare(TextUnit.m5309getValueimpl(j13), TextUnit.m5309getValueimpl(sp2)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m5309getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m5309getValueimpl(j12) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
