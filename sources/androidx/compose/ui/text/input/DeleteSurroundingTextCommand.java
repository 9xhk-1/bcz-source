package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,558:1\n114#2,8:559\n27#3,4:567\n37#3,5:571\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n250#1:559,8\n259#1:567,4\n264#1:571,5\n*E\n"})
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int i11, int i12) {
        this.lengthBeforeCursor = i11;
        this.lengthAfterCursor = i12;
        if (i11 >= 0 && i12 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@k EditingBuffer editingBuffer) {
        int selectionEnd$ui_text_release = editingBuffer.getSelectionEnd$ui_text_release();
        int i11 = this.lengthAfterCursor;
        int i12 = selectionEnd$ui_text_release + i11;
        if (((selectionEnd$ui_text_release ^ i12) & (i11 ^ i12)) < 0) {
            i12 = editingBuffer.getLength$ui_text_release();
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), Math.min(i12, editingBuffer.getLength$ui_text_release()));
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        int i13 = this.lengthBeforeCursor;
        int i14 = selectionStart$ui_text_release - i13;
        if (((selectionStart$ui_text_release ^ i14) & (i13 ^ selectionStart$ui_text_release)) < 0) {
            i14 = 0;
        }
        editingBuffer.delete$ui_text_release(Math.max(0, i14), editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
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
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
