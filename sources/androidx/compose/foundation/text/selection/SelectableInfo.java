package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectableInfo {
    public static final int $stable = TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;

    @k
    private final TextLayoutResult textLayoutResult;

    public SelectableInfo(long j11, int i11, int i12, int i13, int i14, @k TextLayoutResult textLayoutResult) {
        this.selectableId = j11;
        this.slot = i11;
        this.rawStartHandleOffset = i12;
        this.rawEndHandleOffset = i13;
        this.rawPreviousHandleOffset = i14;
        this.textLayoutResult = textLayoutResult;
    }

    private final ResolvedTextDirection getEndRunDirection() {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset);
        return textDirectionForOffset;
    }

    private final ResolvedTextDirection getStartRunDirection() {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset);
        return textDirectionForOffset;
    }

    @k
    public final Selection.AnchorInfo anchorForOffset(int i11) {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, i11);
        return new Selection.AnchorInfo(textDirectionForOffset, i11, this.selectableId);
    }

    @k
    public final String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    @k
    public final CrossStatus getRawCrossStatus() {
        int i11 = this.rawStartHandleOffset;
        int i12 = this.rawEndHandleOffset;
        return i11 < i12 ? CrossStatus.NOT_CROSSED : i11 > i12 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    @k
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    @k
    public final Selection makeSingleLayoutSelection(int i11, int i12) {
        return new Selection(anchorForOffset(i11), anchorForOffset(i12), i11 > i12);
    }

    public final boolean shouldRecomputeSelection(@k SelectableInfo selectableInfo) {
        return (this.selectableId == selectableInfo.selectableId && this.rawStartHandleOffset == selectableInfo.rawStartHandleOffset && this.rawEndHandleOffset == selectableInfo.rawEndHandleOffset) ? false : true;
    }

    @k
    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + getStartRunDirection() + ',' + this.rawEndHandleOffset + '-' + getEndRunDirection() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}
