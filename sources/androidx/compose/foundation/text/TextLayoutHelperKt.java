package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m1162canReuse7_7YC6M(@k TextLayoutResult textLayoutResult, @k AnnotatedString annotatedString, @k TextStyle textStyle, @k List<AnnotatedString.Range<Placeholder>> list, int i11, boolean z11, int i12, @k Density density, @k LayoutDirection layoutDirection, @k FontFamily.Resolver resolver, long j11) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !g0.g(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !g0.g(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i11 || layoutInput.getSoftWrap() != z11 || !TextOverflow.m5019equalsimpl0(layoutInput.m4526getOverflowgIe3tQ8(), i12) || !g0.g(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !g0.g(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m5070getMinWidthimpl(j11) != Constraints.m5070getMinWidthimpl(layoutInput.m4525getConstraintsmsEJaDk())) {
            return false;
        }
        if (z11 || TextOverflow.m5019equalsimpl0(i12, TextOverflow.Companion.m5029getEllipsisgIe3tQ8())) {
            return Constraints.m5068getMaxWidthimpl(j11) == Constraints.m5068getMaxWidthimpl(layoutInput.m4525getConstraintsmsEJaDk()) && Constraints.m5067getMaxHeightimpl(j11) == Constraints.m5067getMaxHeightimpl(layoutInput.m4525getConstraintsmsEJaDk());
        }
        return true;
    }

    public static final float getLineHeight(@k TextLayoutResult textLayoutResult, int i11) {
        if (i11 < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int min = Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(i11), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i11 > MultiParagraph.getLineEnd$default(textLayoutResult.getMultiParagraph(), min, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().getLineHeight(min);
    }

    /* renamed from: isPositionInsideSelection-uaM50fQ, reason: not valid java name */
    public static final boolean m1163isPositionInsideSelectionuaM50fQ(@k TextLayoutResult textLayoutResult, long j11, @l TextRange textRange) {
        if (textRange == null || TextRange.m4553getCollapsedimpl(textRange.m4563unboximpl())) {
            return false;
        }
        int m4529getOffsetForPositionk4lQ0M = textLayoutResult.m4529getOffsetForPositionk4lQ0M(j11);
        return isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(textRange, textLayoutResult, j11, m4529getOffsetForPositionk4lQ0M) || isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(textRange, textLayoutResult, j11, m4529getOffsetForPositionk4lQ0M - 1);
    }

    private static final boolean isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(TextRange textRange, TextLayoutResult textLayoutResult, long j11, int i11) {
        return TextRange.m4550containsimpl(textRange.m4563unboximpl(), i11) && textLayoutResult.getBoundingBox(i11).m2294containsk4lQ0M(j11);
    }
}
