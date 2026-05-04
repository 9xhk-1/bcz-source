package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionAdjustment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionAdjustment.kt\nandroidx/compose/foundation/text/selection/SelectionAdjustmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z11 = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z11, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z11, false, selectionLayout.getEndSlot(), boundaryFunction), z11);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z11, boolean z12, int i11, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z12 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i11 != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long mo1434getBoundaryfzxv0v0 = boundaryFunction.mo1434getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z11 ^ z12 ? TextRange.m4559getStartimpl(mo1434getBoundaryfzxv0v0) : TextRange.m4554getEndimpl(mo1434getBoundaryfzxv0v0));
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i11) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i11), i11, 0L, 4, null);
    }

    @k
    public static final Selection ensureAtLeastOneChar(@k Selection selection, @k SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null) ? selection : selectionLayout.getCurrentInfo().getInputText().length() == 0 ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int findFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findFollowingBreak), null, true, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findFollowingBreak), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int findPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findPrecedingBreak), null, false, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findPrecedingBreak), true, 1, null);
        }
        Selection previousSelection = selectionLayout.getPreviousSelection();
        boolean z11 = previousSelection != null && previousSelection.getHandlesCrossed();
        int findPrecedingBreak2 = selectionLayout.isStartHandle() ^ z11 ? StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset) : StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findPrecedingBreak2), null, z11, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findPrecedingBreak2), z11, 1, null);
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i11, boolean z11) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i11 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        return z11 ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED) ? i11 < selectableInfo.getRawPreviousHandleOffset() : i11 > selectableInfo.getRawPreviousHandleOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i11, int i12, int i13, boolean z11, boolean z12) {
        long m4531getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m4531getWordBoundaryjx7JFs(i12);
        int m4559getStartimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs)) == i11 ? TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs) : i11 >= selectableInfo.getTextLayoutResult().getLineCount() ? selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1) : selectableInfo.getTextLayoutResult().getLineStart(i11);
        int m4554getEndimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs)) == i11 ? TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs) : i11 >= selectableInfo.getTextLayoutResult().getLineCount() ? TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null) : TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i11, false, 2, null);
        if (m4559getStartimpl == i13) {
            return selectableInfo.anchorForOffset(m4554getEndimpl);
        }
        if (m4554getEndimpl == i13) {
            return selectableInfo.anchorForOffset(m4559getStartimpl);
        }
        if (!(z11 ^ z12) ? i12 >= m4559getStartimpl : i12 > m4554getEndimpl) {
            m4559getStartimpl = m4554getEndimpl;
        }
        return selectableInfo.anchorForOffset(m4559getStartimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.isStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final c0 b11 = e0.b(lazyThreadSafetyMode, new x00.a<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Integer invoke() {
                return Integer.valueOf(SelectableInfo.this.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        c0 b12 = e0.b(lazyThreadSafetyMode, new x00.a<Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Selection.AnchorInfo invoke() {
                int updateSelectionBoundary$lambda$0;
                Selection.AnchorInfo snapToWordBoundary;
                SelectableInfo selectableInfo2 = SelectableInfo.this;
                updateSelectionBoundary$lambda$0 = SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(b11);
                snapToWordBoundary = SelectionAdjustmentKt.snapToWordBoundary(selectableInfo2, updateSelectionBoundary$lambda$0, rawStartHandleOffset, rawEndHandleOffset, selectionLayout.isStartHandle(), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
                return snapToWordBoundary;
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(b12);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(b11) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(b12);
        }
        int offset = anchorInfo.getOffset();
        long m4531getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m4531getWordBoundaryjx7JFs(offset);
        return !isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.isStartHandle()) ? selectableInfo.anchorForOffset(rawStartHandleOffset) : (offset == TextRange.m4559getStartimpl(m4531getWordBoundaryjx7JFs) || offset == TextRange.m4554getEndimpl(m4531getWordBoundaryjx7JFs)) ? updateSelectionBoundary$lambda$1(b12) : selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(c0<Integer> c0Var) {
        return c0Var.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(c0<Selection.AnchorInfo> c0Var) {
        return c0Var.getValue();
    }
}
