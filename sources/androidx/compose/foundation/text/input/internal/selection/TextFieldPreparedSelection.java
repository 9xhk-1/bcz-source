package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import g10.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n126#1,11:569\n126#1,11:580\n126#1,11:591\n126#1,11:602\n130#1,7:613\n196#1,5:620\n130#1,5:625\n201#1,15:630\n136#1:645\n196#1,5:646\n130#1,5:651\n201#1,15:656\n136#1:671\n196#1,5:672\n130#1,5:677\n201#1,15:682\n136#1:697\n196#1,5:698\n130#1,5:703\n201#1,15:708\n136#1:723\n196#1,5:724\n130#1,5:729\n201#1,15:734\n136#1:749\n196#1,5:750\n130#1,5:755\n201#1,15:760\n136#1:775\n196#1,5:776\n130#1,5:781\n201#1,15:786\n136#1:801\n196#1,5:802\n130#1,5:807\n201#1,15:812\n136#1:827\n200#1:828\n130#1,5:829\n201#1,15:834\n136#1:849\n200#1:850\n130#1,5:851\n201#1,15:856\n136#1:871\n196#1,5:872\n130#1,5:877\n201#1,15:882\n136#1:897\n196#1,5:898\n130#1,5:903\n201#1,15:908\n136#1:923\n200#1:924\n130#1,5:925\n201#1,15:930\n136#1:945\n200#1:946\n130#1,5:947\n201#1,15:952\n136#1:967\n130#1,7:968\n130#1,7:975\n602#2,8:561\n30#3:982\n53#4,3:983\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n139#1:569,11\n141#1:580,11\n158#1:591,11\n171#1:602,11\n200#1:613,7\n217#1:620,5\n217#1:625,5\n217#1:630,15\n217#1:645\n219#1:646,5\n219#1:651,5\n219#1:656,15\n219#1:671\n221#1:672,5\n221#1:677,5\n221#1:682,15\n221#1:697\n223#1:698,5\n223#1:703,5\n223#1:708,15\n223#1:723\n239#1:724,5\n239#1:729,5\n239#1:734,15\n239#1:749\n243#1:750,5\n243#1:755,5\n243#1:760,15\n243#1:775\n247#1:776,5\n247#1:781,5\n247#1:786,15\n247#1:801\n255#1:802,5\n255#1:807,5\n255#1:812,15\n255#1:827\n264#1:828\n264#1:829,5\n264#1:834,15\n264#1:849\n267#1:850\n267#1:851,5\n267#1:856,15\n267#1:871\n283#1:872,5\n283#1:877,5\n283#1:882,15\n283#1:897\n287#1:898,5\n287#1:903,5\n287#1:908,15\n287#1:923\n292#1:924\n292#1:925,5\n292#1:930,15\n292#1:945\n295#1:946\n295#1:947,5\n295#1:952,15\n295#1:967\n299#1:968,7\n304#1:975,7\n106#1:561,8\n395#1:982\n395#1:983,3\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;

    @k
    private final TextFieldCharSequence initialValue;

    @k
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromSoftKeyboard;
    private long selection;

    @k
    private final TransformedTextFieldState state;

    @k
    private final String text;

    @l
    private final TextLayoutResult textLayoutResult;

    @k
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;

    @l
    private WedgeAffinity wedgeAffinity;

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

    public TextFieldPreparedSelection(@k TransformedTextFieldState transformedTextFieldState, @l TextLayoutResult textLayoutResult, boolean z11, float f11, @k TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z11;
        this.visibleTextLayoutHeight = f11;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            g2 g2Var = g2.f100423a;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.selection = visualText.m1189getSelectiond9O1mEE();
            this.text = visualText.getText().toString();
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean z11, x00.l<? super TextFieldPreparedSelection, g2> lVar) {
        if (z11) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            lVar.invoke(this);
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if (z11) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            lVar.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final int charOffset(int i11) {
        return u.B(i11, this.text.length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i11), true);
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = TextRange.m4556getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i11);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i11));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = TextRange.m4557getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i11);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        while (i11 < this.initialValue.length()) {
            long m4531getWordBoundaryjx7JFs = textLayoutResult.m4531getWordBoundaryjx7JFs(charOffset(i11));
            if (TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs) > i11) {
                return TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs);
            }
            i11++;
        }
        return this.initialValue.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = TextRange.m4554getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i11);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i11) {
        while (i11 > 0) {
            long m4531getWordBoundaryjx7JFs = textLayoutResult.m4531getWordBoundaryjx7JFs(charOffset(i11));
            if (TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs) < i11) {
                return TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs);
            }
            i11--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = TextRange.m4554getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i11);
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m4554getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i11) {
        int m4554getEndimpl = TextRange.m4554getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(m4554getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m4554getEndimpl) + i11;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m4529getOffsetForPositionk4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(cachedX) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L)));
    }

    private final int jumpByPagesOffset(int i11) {
        int m4554getEndimpl = TextRange.m4554getEndimpl(this.initialValue.m1189getSelectiond9O1mEE());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return m4554getEndimpl;
        }
        Rect translate = this.textLayoutResult.getCursorRect(m4554getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * i11);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(translate.getTop()));
        return Math.abs(translate.getTop() - lineBottom) > Math.abs(translate.getBottom() - lineBottom) ? this.textLayoutResult.m4529getOffsetForPositionk4lQ0M(translate.m2303getTopLeftF1C5BW0()) : this.textLayoutResult.m4529getOffsetForPositionk4lQ0M(translate.m2296getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection moveCursorTo(boolean z11, a<Integer> aVar) {
        if (z11) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(aVar.invoke().intValue(), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection moveCursorTo$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z11, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if (z11) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(textFieldPreparedSelection.m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) aVar.invoke()).intValue(), m4554getEndimpl, textFieldPreparedSelection.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(textFieldPreparedSelection.m1351getSelectiond9O1mEE())) {
                textFieldPreparedSelection.m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                textFieldPreparedSelection.setWedgeAffinity(m1326component2impl);
            }
        }
        return textFieldPreparedSelection;
    }

    @k
    public final TextFieldPreparedSelection collapseLeftOr(@k x00.l<? super TextFieldPreparedSelection, g2> lVar) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m4553getCollapsedimpl(this.selection)) {
                lVar.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m4557getMinimpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m4556getMaximpl(this.selection));
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection collapseRightOr(@k x00.l<? super TextFieldPreparedSelection, g2> lVar) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m4553getCollapsedimpl(this.selection)) {
                lVar.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m4556getMaximpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m4557getMinimpl(this.selection));
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection deleteMovement() {
        if (this.text.length() > 0) {
            if (TextRange.m4553getCollapsedimpl(this.initialValue.m1189getSelectiond9O1mEE())) {
                TransformedTextFieldState.m1310replaceTextM8tDOmk$default(this.state, "", TextRangeKt.TextRange(TextRange.m4559getStartimpl(this.initialValue.m1189getSelectiond9O1mEE()), TextRange.m4554getEndimpl(this.selection)), null, !this.isFromSoftKeyboard, 4, null);
            } else {
                this.state.deleteSelectedText();
            }
            this.selection = this.state.getVisualText().m1189getSelectiond9O1mEE();
            this.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m4554getEndimpl(this.selection));
        }
        return this;
    }

    @k
    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    @k
    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m4554getEndimpl(this.selection));
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m4554getEndimpl(this.selection));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1351getSelectiond9O1mEE() {
        return this.selection;
    }

    @l
    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    @k
    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : this.text.length(), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorLeftByChar() {
        return isLtr() ? moveCursorPrevByChar() : moveCursorNextByChar();
    }

    @k
    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        return isLtr() ? moveCursorPrevByWord() : moveCursorNextByWord();
    }

    @k
    public final TextFieldPreparedSelection moveCursorNextByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m4554getEndimpl(this.selection)), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            int findParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m4556getMaximpl(this.selection));
            if (findParagraphEnd == TextRange.m4556getMaximpl(this.selection) && findParagraphEnd != this.text.length()) {
                findParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, findParagraphEnd + 1);
            }
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(findParagraphEnd, m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m4554getEndimpl(this.selection)), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            int findParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m4557getMinimpl(this.selection));
            if (findParagraphStart == TextRange.m4557getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = StringHelpersKt.findParagraphStart(this.text, findParagraphStart - 1);
            }
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(findParagraphStart, m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorRightByChar() {
        return isLtr() ? moveCursorNextByChar() : moveCursorPrevByChar();
    }

    @k
    public final TextFieldPreparedSelection moveCursorRightByWord() {
        return isLtr() ? moveCursorNextByWord() : moveCursorPrevByWord();
    }

    @k
    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        return isLtr() ? moveCursorToLineStart() : moveCursorToLineEnd();
    }

    @k
    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        return isLtr() ? moveCursorToLineEnd() : moveCursorToLineStart();
    }

    @k
    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : 0, m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            int m4554getEndimpl = TextRange.m4554getEndimpl(m1351getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), m4554getEndimpl, this.state);
            int m1325component1impl = CursorAndWedgeAffinity.m1325component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1326component2impl = CursorAndWedgeAffinity.m1326component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1325component1impl != m4554getEndimpl || !TextRange.m4553getCollapsedimpl(m1351getSelectiond9O1mEE())) {
                m1352setSelection5zctL8(TextRangeKt.TextRange(m1325component1impl));
            }
            if (m1326component2impl != null) {
                setWedgeAffinity(m1326component2impl);
            }
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    @k
    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m4559getStartimpl(this.initialValue.m1189getSelectiond9O1mEE()), TextRange.m4554getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1352setSelection5zctL8(long j11) {
        this.selection = j11;
    }

    public final void setWedgeAffinity(@l WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }
}
