package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i11) {
        return isOffsetAnEmptyLine(textLayoutResult, i11) ? textLayoutResult.getParagraphDirection(i11) : textLayoutResult.getBidiRunDirection(i11);
    }

    @k
    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m1452getTextFieldSelectionLayoutRcvTLA(@k TextLayoutResult textLayoutResult, int i11, int i12, int i13, long j11, boolean z11, boolean z12) {
        return new SingleSelectionLayout(z12, 1, 1, z11 ? null : new Selection(new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m4559getStartimpl(j11)), TextRange.m4559getStartimpl(j11), 1L), new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m4554getEndimpl(j11)), TextRange.m4554getEndimpl(j11), 1L), TextRange.m4558getReversedimpl(j11)), new SelectableInfo(1L, 1, i11, i12, i13, textLayoutResult));
    }

    public static final boolean isCollapsed(@l Selection selection, @l SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        selectionLayout.forEachMiddleInfo(new x00.l<SelectableInfo, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$isCollapsed$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SelectableInfo selectableInfo) {
                invoke2(selectableInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SelectableInfo selectableInfo) {
                if (selectableInfo.getInputText().length() > 0) {
                    Ref.BooleanRef.this.element = false;
                }
            }
        });
        return booleanRef.element;
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i11) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int lineForOffset = textLayoutResult.getLineForOffset(i11);
            if (i11 != 0 && lineForOffset == textLayoutResult.getLineForOffset(i11 - 1)) {
                return false;
            }
            if (i11 != textLayoutResult.getLayoutInput().getText().length() && lineForOffset == textLayoutResult.getLineForOffset(i11 + 1)) {
                return false;
            }
        }
        return true;
    }

    @k
    public static final Direction resolve2dDirection(@k Direction direction, @k Direction direction2) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[direction2.ordinal()];
        if (i11 == 1) {
            return Direction.BEFORE;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return Direction.AFTER;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i12 = iArr[direction.ordinal()];
        if (i12 == 1) {
            return Direction.BEFORE;
        }
        if (i12 == 2) {
            return Direction.ON;
        }
        if (i12 == 3) {
            return Direction.AFTER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
