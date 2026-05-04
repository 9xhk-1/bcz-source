package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SelectionAdjustment {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection None$lambda$0;
                None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                return None$lambda$0;
            }
        };

        @k
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.b
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection Character$lambda$1;
                Character$lambda$1 = SelectionAdjustment.Companion.Character$lambda$1(selectionLayout);
                return Character$lambda$1;
            }
        };

        @k
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.c
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection Word$lambda$2;
                Word$lambda$2 = SelectionAdjustment.Companion.Word$lambda$2(selectionLayout);
                return Word$lambda$2;
            }
        };

        @k
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.d
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection Paragraph$lambda$3;
                Paragraph$lambda$3 = SelectionAdjustment.Companion.Paragraph$lambda$3(selectionLayout);
                return Paragraph$lambda$3;
            }
        };

        @k
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.e
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection CharacterWithWordAccelerate$lambda$4;
                CharacterWithWordAccelerate$lambda$4 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$4(selectionLayout);
                return CharacterWithWordAccelerate$lambda$4;
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Character$lambda$1(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.ensureAtLeastOneChar(None.adjust(selectionLayout), selectionLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection CharacterWithWordAccelerate$lambda$4(SelectionLayout selectionLayout) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo updateSelectionBoundary;
            Selection.AnchorInfo start;
            Selection.AnchorInfo anchorInfo;
            Selection previousSelection = selectionLayout.getPreviousSelection();
            if (previousSelection == null) {
                return Word.adjust(selectionLayout);
            }
            if (selectionLayout.isStartHandle()) {
                end = previousSelection.getStart();
                updateSelectionBoundary = SelectionAdjustmentKt.updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), end);
                anchorInfo = previousSelection.getEnd();
                start = updateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                updateSelectionBoundary = SelectionAdjustmentKt.updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), end);
                start = previousSelection.getStart();
                anchorInfo = updateSelectionBoundary;
            }
            if (g0.g(updateSelectionBoundary, end)) {
                return previousSelection;
            }
            return SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(start, anchorInfo, selectionLayout.getCrossStatus() == CrossStatus.CROSSED || (selectionLayout.getCrossStatus() == CrossStatus.COLLAPSED && start.getOffset() > anchorInfo.getOffset())), selectionLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection None$lambda$0(SelectionLayout selectionLayout) {
            return new Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().getRawStartHandleOffset()), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().getRawEndHandleOffset()), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Paragraph$lambda$3(SelectionLayout selectionLayout) {
            Selection adjustToBoundaries;
            adjustToBoundaries = SelectionAdjustmentKt.adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo1434getBoundaryfzxv0v0(SelectableInfo selectableInfo, int i11) {
                    return StringHelpersKt.getParagraphBoundary(selectableInfo.getInputText(), i11);
                }
            });
            return adjustToBoundaries;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Word$lambda$2(SelectionLayout selectionLayout) {
            Selection adjustToBoundaries;
            adjustToBoundaries = SelectionAdjustmentKt.adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo1434getBoundaryfzxv0v0(SelectableInfo selectableInfo, int i11) {
                    return selectableInfo.getTextLayoutResult().m4531getWordBoundaryjx7JFs(i11);
                }
            });
            return adjustToBoundaries;
        }

        @k
        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        @k
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        @k
        public final SelectionAdjustment getNone() {
            return None;
        }

        @k
        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        @k
        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    @k
    Selection adjust(@k SelectionLayout selectionLayout);
}
