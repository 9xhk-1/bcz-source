package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SingleSelectionLayout implements SelectionLayout {

    @k
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_SELECTABLE_ID = 1;
    public static final int DEFAULT_SLOT = 1;
    private final int endSlot;

    @k
    private final SelectableInfo info;
    private final boolean isStartHandle;

    @l
    private final Selection previousSelection;
    private final int startSlot;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public SingleSelectionLayout(boolean z11, int i11, int i12, @l Selection selection, @k SelectableInfo selectableInfo) {
        this.isStartHandle = z11;
        this.startSlot = i11;
        this.endSlot = i12;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public LongObjectMap<Selection> createSubSelections(@k Selection selection) {
        return LongObjectMapKt.longObjectMapOf(this.info.getSelectableId(), ((selection.getHandlesCrossed() || selection.getStart().getOffset() <= selection.getEnd().getOffset()) && (!selection.getHandlesCrossed() || selection.getStart().getOffset() > selection.getEnd().getOffset())) ? selection : Selection.copy$default(selection, null, null, !selection.getHandlesCrossed(), 3, null));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.info.getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getCurrentInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getEndInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getFirstInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getLastInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getStartInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(@l SelectionLayout selectionLayout) {
        return (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof SingleSelectionLayout) && getStartSlot() == selectionLayout.getStartSlot() && getEndSlot() == selectionLayout.getEndSlot() && isStartHandle() == selectionLayout.isStartHandle() && !this.info.shouldRecomputeSelection(((SingleSelectionLayout) selectionLayout).info)) ? false : true;
    }

    @k
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + isStartHandle() + ", crossed=" + getCrossStatus() + ", info=\n\t" + this.info + ')';
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(@k x00.l<? super SelectableInfo, g2> lVar) {
    }
}
