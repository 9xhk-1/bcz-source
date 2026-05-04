package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1102:1\n30#2:1103\n53#3,3:1104\n60#3:1108\n60#3:1111\n70#3:1114\n70#3:1117\n70#3:1120\n60#3:1123\n65#4:1107\n65#4:1110\n69#4:1113\n69#4:1116\n69#4:1119\n65#4:1122\n22#5:1109\n22#5:1112\n22#5:1115\n22#5:1118\n22#5:1121\n22#5:1124\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n*L\n868#1:1103\n868#1:1104,3\n1054#1:1108\n1056#1:1111\n1072#1:1114\n1075#1:1117\n1076#1:1120\n1081#1:1123\n1054#1:1107\n1056#1:1110\n1072#1:1113\n1075#1:1116\n1076#1:1119\n1081#1:1122\n1054#1:1109\n1056#1:1112\n1072#1:1115\n1075#1:1118\n1076#1:1121\n1081#1:1124\n*E\n"})
/* loaded from: classes.dex */
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m1244adjustHandwritingDeleteGestureRange72CqOWE(long j11, CharSequence charSequence) {
        int m4559getStartimpl = TextRange.m4559getStartimpl(j11);
        int m4554getEndimpl = TextRange.m4554getEndimpl(j11);
        int codePointBefore = m4559getStartimpl > 0 ? Character.codePointBefore(charSequence, m4559getStartimpl) : 10;
        int codePointAt = m4554getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, m4554getEndimpl) : 10;
        if (isWhitespaceExceptNewline(codePointBefore) && (isWhitespace(codePointAt) || isPunctuation(codePointAt))) {
            do {
                m4559getStartimpl -= Character.charCount(codePointBefore);
                if (m4559getStartimpl == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, m4559getStartimpl);
            } while (isWhitespaceExceptNewline(codePointBefore));
            return TextRangeKt.TextRange(m4559getStartimpl, m4554getEndimpl);
        }
        if (!isWhitespaceExceptNewline(codePointAt)) {
            return j11;
        }
        if (!isWhitespace(codePointBefore) && !isPunctuation(codePointBefore)) {
            return j11;
        }
        do {
            m4554getEndimpl += Character.charCount(codePointAt);
            if (m4554getEndimpl == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, m4554getEndimpl);
        } while (isWhitespaceExceptNewline(codePointAt));
        return TextRangeKt.TextRange(m4559getStartimpl, m4554getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt$compoundEditCommand$1
            @Override // androidx.compose.ui.text.input.EditCommand
            public void applyTo(EditingBuffer editingBuffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(editingBuffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m1245enclosurepWDy79M(long j11, long j12) {
        return TextRangeKt.TextRange(Math.min(TextRange.m4559getStartimpl(j11), TextRange.m4559getStartimpl(j11)), Math.max(TextRange.m4554getEndimpl(j12), TextRange.m4554getEndimpl(j12)));
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1246getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j11, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i11 = (int) (4294967295L & j11);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i11));
        if (Float.intBitsToFloat(i11) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i11) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i12 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i12) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i12) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1248getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j11, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m1249getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j11, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m1249getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j11, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long mo3871screenToLocalMKHz9U;
        int m1246getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (m1246getLineForHandwritingGestured4ec7I = m1246getLineForHandwritingGestured4ec7I(multiParagraph, (mo3871screenToLocalMKHz9U = layoutCoordinates.mo3871screenToLocalMKHz9U(j11)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m4410getOffsetForPositionk4lQ0M(Offset.m2262copydBAh8RU$default(mo3871screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(m1246getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(m1246getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m1250getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j11, long j12, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        long mo3871screenToLocalMKHz9U = layoutCoordinates.mo3871screenToLocalMKHz9U(j11);
        long mo3871screenToLocalMKHz9U2 = layoutCoordinates.mo3871screenToLocalMKHz9U(j12);
        int m1246getLineForHandwritingGestured4ec7I = m1246getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), mo3871screenToLocalMKHz9U, viewConfiguration);
        int m1246getLineForHandwritingGestured4ec7I2 = m1246getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), mo3871screenToLocalMKHz9U2, viewConfiguration);
        if (m1246getLineForHandwritingGestured4ec7I != -1) {
            if (m1246getLineForHandwritingGestured4ec7I2 != -1) {
                m1246getLineForHandwritingGestured4ec7I = Math.min(m1246getLineForHandwritingGestured4ec7I, m1246getLineForHandwritingGestured4ec7I2);
            }
            m1246getLineForHandwritingGestured4ec7I2 = m1246getLineForHandwritingGestured4ec7I;
        } else if (m1246getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        float lineTop = (textLayoutResult.getLineTop(m1246getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineBottom(m1246getLineForHandwritingGestured4ec7I2)) / 2;
        int i11 = (int) (mo3871screenToLocalMKHz9U >> 32);
        int i12 = (int) (mo3871screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m4411getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), lineTop - 0.1f, Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), lineTop + 0.1f), TextGranularity.Companion.m4521getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m1251getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i11, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Companion.m4564getZerod9O1mEE() : multiParagraph.m4411getRangeForRect86BmAI(rect.m2305translatek4lQ0M(layoutCoordinates.mo3871screenToLocalMKHz9U(Offset.Companion.m2284getZeroF1C5BW0())), i11, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1253getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i11, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m1251getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i11, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1255getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i11, TextInclusionStrategy textInclusionStrategy) {
        long m1253getRangeForScreenRectOH9lIzo = m1253getRangeForScreenRectOH9lIzo(textLayoutState, rect, i11, textInclusionStrategy);
        if (TextRange.m4553getCollapsedimpl(m1253getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        long m1253getRangeForScreenRectOH9lIzo2 = m1253getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i11, textInclusionStrategy);
        return TextRange.m4553getCollapsedimpl(m1253getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m4564getZerod9O1mEE() : m1245enclosurepWDy79M(m1253getRangeForScreenRectOH9lIzo, m1253getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i11) {
        int lineForOffset = textLayoutResult.getLineForOffset(i11);
        return (i11 == textLayoutResult.getLineStart(lineForOffset) || i11 == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i11) != textLayoutResult.getBidiRunDirection(i11) : textLayoutResult.getBidiRunDirection(i11) != textLayoutResult.getBidiRunDirection(i11 - 1);
    }

    private static final boolean isNewline(int i11) {
        int type = Character.getType(i11);
        return type == 14 || type == 13 || i11 == 10;
    }

    private static final boolean isPunctuation(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i11) {
        return Character.isWhitespace(i11) || i11 == 160;
    }

    private static final boolean isWhitespaceExceptNewline(int i11) {
        return isWhitespace(i11) && !isNewline(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            int codePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, i12);
            if (!isWhitespace(codePointBefore)) {
                break;
            }
            i12 -= Character.charCount(codePointBefore);
        }
        while (i11 < charSequence.length()) {
            int codePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i11);
            if (!isWhitespace(codePointAt)) {
                break;
            }
            i11 += CodepointHelpers_jvmKt.charCount(codePointAt);
        }
        return TextRangeKt.TextRange(i12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f11 = pointF.x;
        float f12 = pointF.y;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1247getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j11, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m1249getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j11, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1252getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i11, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m1251getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i11, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1254getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i11, TextInclusionStrategy textInclusionStrategy) {
        long m1252getRangeForScreenRectOH9lIzo = m1252getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i11, textInclusionStrategy);
        if (TextRange.m4553getCollapsedimpl(m1252getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        long m1252getRangeForScreenRectOH9lIzo2 = m1252getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i11, textInclusionStrategy);
        return TextRange.m4553getCollapsedimpl(m1252getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m4564getZerod9O1mEE() : m1245enclosurepWDy79M(m1252getRangeForScreenRectOH9lIzo, m1252getRangeForScreenRectOH9lIzo2);
    }
}
