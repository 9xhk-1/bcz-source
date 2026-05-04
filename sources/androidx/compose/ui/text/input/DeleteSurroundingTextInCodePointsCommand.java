package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,558:1\n114#2,8:559\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand\n*L\n309#1:559,8\n*E\n"})
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i11, int i12) {
        this.lengthBeforeCursor = i11;
        this.lengthAfterCursor = i12;
        if (i11 >= 0 && i12 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@k EditingBuffer editingBuffer) {
        boolean isSurrogatePair;
        boolean isSurrogatePair2;
        int i11 = this.lengthBeforeCursor;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 < i11) {
                int i15 = i14 + 1;
                if (editingBuffer.getSelectionStart$ui_text_release() <= i15) {
                    i14 = editingBuffer.getSelectionStart$ui_text_release();
                    break;
                } else {
                    isSurrogatePair2 = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionStart$ui_text_release() - i15) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i15));
                    i14 = isSurrogatePair2 ? i14 + 2 : i15;
                    i13++;
                }
            } else {
                break;
            }
        }
        int i16 = this.lengthAfterCursor;
        int i17 = 0;
        while (true) {
            if (i12 >= i16) {
                break;
            }
            int i18 = i17 + 1;
            if (editingBuffer.getSelectionEnd$ui_text_release() + i18 >= editingBuffer.getLength$ui_text_release()) {
                i17 = editingBuffer.getLength$ui_text_release() - editingBuffer.getSelectionEnd$ui_text_release();
                break;
            } else {
                isSurrogatePair = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionEnd$ui_text_release() + i18) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release() + i18));
                i17 = isSurrogatePair ? i17 + 2 : i18;
                i12++;
            }
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release() + i17);
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i14, editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @k
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
