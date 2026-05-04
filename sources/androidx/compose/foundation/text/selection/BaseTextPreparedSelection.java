package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,401:1\n73#1,8:402\n73#1,8:410\n73#1,8:418\n73#1,8:426\n73#1,8:434\n73#1,8:442\n73#1,8:450\n73#1,8:458\n73#1,8:466\n73#1,8:474\n73#1,8:482\n73#1,8:490\n73#1,6:498\n80#1:505\n73#1,8:506\n73#1,8:514\n73#1,8:522\n74#1,7:530\n74#1,7:537\n73#1,8:544\n73#1,8:552\n73#1,8:560\n73#1,8:568\n74#1,7:576\n1#2:504\n30#3:583\n53#4,3:584\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:402,8\n93#1:410,8\n95#1:418,8\n103#1:426,8\n112#1:434,8\n125#1:442,8\n146#1:450,8\n151#1:458,8\n156#1:466,8\n158#1:474,8\n160#1:482,8\n168#1:490,8\n178#1:498,6\n178#1:505\n182#1:506,8\n184#1:514,8\n192#1:522,8\n201#1:530,7\n204#1:537,7\n208#1:544,8\n212#1:552,8\n214#1:560,8\n222#1:568,8\n232#1:576,7\n310#1:583\n310#1:584,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;

    @k
    private AnnotatedString annotatedString;

    @l
    private final TextLayoutResult layoutResult;

    @k
    private final OffsetMapping offsetMapping;
    private final long originalSelection;

    @k
    private final AnnotatedString originalText;
    private long selection;

    @k
    private final TextPreparedSelectionState state;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j11, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, v vVar) {
        this(annotatedString, j11, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z11, x00.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if (z11) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
            lVar.invoke(obj);
        }
        g0.n(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) obj;
    }

    private final int charOffset(int i11) {
        return u.B(i11, getText$foundation_release().length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i11), true));
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i12 & 1) != 0) {
            i11 = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i11);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i11)));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i12 & 1) != 0) {
            i11 = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i11);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        while (i11 < this.originalText.length()) {
            long m4531getWordBoundaryjx7JFs = textLayoutResult.m4531getWordBoundaryjx7JFs(charOffset(i11));
            if (TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs) > i11) {
                return this.offsetMapping.transformedToOriginal(TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs));
            }
            i11++;
        }
        return this.originalText.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i12 & 1) != 0) {
            i11 = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i11);
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i11) {
        while (i11 > 0) {
            long m4531getWordBoundaryjx7JFs = textLayoutResult.m4531getWordBoundaryjx7JFs(charOffset(i11));
            if (TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs) < i11) {
                return this.offsetMapping.transformedToOriginal(TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs));
            }
            i11--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i12 & 1) != 0) {
            i11 = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i11);
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(transformedEndOffset()) : null) != ResolvedTextDirection.Rtl;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i11) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i11;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        g0.m(cachedX);
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m4529getOffsetForPositionk4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(cachedX.floatValue()) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L))));
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4554getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4556getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4557getMinimpl(this.selection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final <U> T apply(U u11, boolean z11, @k x00.l<? super U, g2> lVar) {
        if (z11) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            lVar.invoke(u11);
        }
        g0.n(u11, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u11;
    }

    @k
    public final T collapseLeftOr(@k x00.l<? super T, g2> lVar) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4553getCollapsedimpl(this.selection)) {
                g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                lVar.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m4557getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m4556getMaximpl(this.selection));
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T collapseRightOr(@k x00.l<? super T, g2> lVar) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4553getCollapsedimpl(this.selection)) {
                g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                lVar.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m4556getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m4557getMinimpl(this.selection));
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m4554getEndimpl(this.selection));
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @l
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @l
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @l
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m4554getEndimpl(this.selection));
    }

    @l
    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @k
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1431getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    @k
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m4554getEndimpl(this.selection));
    }

    @l
    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1432getSelectiond9O1mEE() {
        return this.selection;
    }

    @k
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @k
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @k
    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int findParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m4556getMaximpl(this.selection));
            if (findParagraphEnd == TextRange.m4556getMaximpl(this.selection) && findParagraphEnd != getText$foundation_release().length()) {
                findParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), findParagraphEnd + 1);
            }
            setCursor(findParagraphEnd);
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int findParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m4557getMinimpl(this.selection));
            if (findParagraphStart == TextRange.m4557getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), findParagraphStart - 1);
            }
            setCursor(findParagraphStart);
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m4559getStartimpl(this.originalSelection), TextRange.m4554getEndimpl(this.selection));
        }
        g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(@k AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int i11) {
        setSelection(i11, i11);
    }

    public final void setSelection(int i11, int i12) {
        this.selection = TextRangeKt.TextRange(i11, i12);
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1433setSelection5zctL8(long j11) {
        this.selection = j11;
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j11, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j11;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j11;
        this.annotatedString = annotatedString;
    }
}
