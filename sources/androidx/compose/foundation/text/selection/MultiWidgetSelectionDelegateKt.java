package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Comparator;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n54#2:367\n59#2:369\n85#3:368\n90#3:370\n60#3:373\n60#3:376\n70#3:379\n70#3:382\n70#3:385\n70#3:388\n278#4:371\n65#5:372\n65#5:375\n69#5:378\n69#5:381\n69#5:384\n69#5:387\n22#6:374\n22#6:377\n22#6:380\n22#6:383\n22#6:386\n22#6:389\n1#7:390\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n*L\n230#1:367\n231#1:369\n230#1:368\n231#1:370\n325#1:373\n326#1:376\n332#1:379\n333#1:382\n361#1:385\n362#1:388\n290#1:371\n325#1:372\n326#1:375\n332#1:378\n333#1:381\n361#1:384\n362#1:387\n325#1:374\n326#1:377\n332#1:380\n333#1:383\n361#1:386\n362#1:389\n*E\n"})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m1437appendSelectableInfoParwq6A(@k SelectionLayoutBuilder selectionLayoutBuilder, @k TextLayoutResult textLayoutResult, long j11, long j12, long j13) {
        Direction direction;
        Direction direction2;
        long j14;
        Direction appendSelectableInfo_Parwq6A$otherDirection;
        Direction direction3;
        Direction direction4;
        Direction direction5;
        Direction direction6;
        int m1438getOffsetForPosition3MmeM6k;
        int previousAdjustedOffset;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32), (int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L));
        Direction m1439getXDirection3MmeM6k = m1439getXDirection3MmeM6k(j11, rect);
        Direction m1440getYDirection3MmeM6k = m1440getYDirection3MmeM6k(j11, rect);
        if (selectionLayoutBuilder.isStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            direction = m1440getYDirection3MmeM6k;
            direction2 = m1439getXDirection3MmeM6k;
            j14 = j13;
            direction5 = direction2;
            direction4 = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j13, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = direction4;
            direction6 = direction3;
            appendSelectableInfo_Parwq6A$otherDirection = direction;
        } else {
            direction = m1440getYDirection3MmeM6k;
            direction2 = m1439getXDirection3MmeM6k;
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            j14 = j13;
            appendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j14, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction3 = direction2;
            direction4 = direction;
            direction5 = appendSelectableInfo_Parwq6A$otherDirection;
            direction6 = direction5;
        }
        if (isSelected(SelectionLayoutKt.resolve2dDirection(direction2, direction), direction6)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.isStartHandle()) {
                previousAdjustedOffset = m1438getOffsetForPosition3MmeM6k(j11, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                m1438getOffsetForPosition3MmeM6k = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? previousAdjustedOffset : getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j14, length);
            } else {
                m1438getOffsetForPosition3MmeM6k = m1438getOffsetForPosition3MmeM6k(j11, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                previousAdjustedOffset = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? m1438getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j14, length);
            }
            selectionLayoutBuilder.appendInfo(j14, previousAdjustedOffset, direction5, appendSelectableInfo_Parwq6A$otherDirection, m1438getOffsetForPosition3MmeM6k, direction3, direction4, (9223372034707292159L & j12) == InlineClassHelperKt.UnspecifiedPackedFloats ? -1 : m1438getOffsetForPosition3MmeM6k(j12, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j11, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j11)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j11, long j12) {
        int compare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j11), Long.valueOf(j12));
        return compare < 0 ? Direction.BEFORE : compare > 0 ? Direction.AFTER : Direction.ON;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m1438getOffsetForPosition3MmeM6k(long j11, TextLayoutResult textLayoutResult) {
        int i11 = (int) (4294967295L & j11);
        if (Float.intBitsToFloat(i11) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i11) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m4529getOffsetForPositionk4lQ0M(j11);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j11, int i11) {
        int compare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j11));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i11 : anchorInfo.getOffset();
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1439getXDirection3MmeM6k(long j11, Rect rect) {
        int i11 = (int) (j11 >> 32);
        return Float.intBitsToFloat(i11) < rect.getLeft() ? Direction.BEFORE : Float.intBitsToFloat(i11) > rect.getRight() ? Direction.AFTER : Direction.ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1440getYDirection3MmeM6k(long j11, Rect rect) {
        int i11 = (int) (j11 & 4294967295L);
        return Float.intBitsToFloat(i11) < rect.getTop() ? Direction.BEFORE : Float.intBitsToFloat(i11) > rect.getBottom() ? Direction.AFTER : Direction.ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }
}
