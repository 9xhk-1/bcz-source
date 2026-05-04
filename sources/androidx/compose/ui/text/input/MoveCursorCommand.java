package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i11) {
        this.amount = i11;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@k EditingBuffer editingBuffer) {
        if (editingBuffer.getCursor$ui_text_release() == -1) {
            editingBuffer.setCursor$ui_text_release(editingBuffer.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        String editingBuffer2 = editingBuffer.toString();
        int i11 = this.amount;
        int i12 = 0;
        if (i11 <= 0) {
            int i13 = -i11;
            while (i12 < i13) {
                int findPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer2, selectionStart$ui_text_release);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i12++;
                selectionStart$ui_text_release = findPrecedingBreak;
            }
        } else {
            while (i12 < i11) {
                int findFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(editingBuffer2, selectionStart$ui_text_release);
                if (findFollowingBreak == -1) {
                    break;
                }
                i12++;
                selectionStart$ui_text_release = findFollowingBreak;
            }
        }
        editingBuffer.setCursor$ui_text_release(selectionStart$ui_text_release);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    @k
    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
