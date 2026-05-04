package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import g10.u;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SetComposingTextCommand implements EditCommand {
    public static final int $stable = 0;

    @k
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public SetComposingTextCommand(@k AnnotatedString annotatedString, int i11) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i11;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@k EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            int compositionStart$ui_text_release = editingBuffer.getCompositionStart$ui_text_release();
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                editingBuffer.setComposition$ui_text_release(compositionStart$ui_text_release, getText().length() + compositionStart$ui_text_release);
            }
        } else {
            int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                editingBuffer.setComposition$ui_text_release(selectionStart$ui_text_release, getText().length() + selectionStart$ui_text_release);
            }
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i11 = this.newCursorPosition;
        editingBuffer.setCursor$ui_text_release(u.I(i11 > 0 ? (cursor$ui_text_release + i11) - 1 : (cursor$ui_text_release + i11) - getText().length(), 0, editingBuffer.getLength$ui_text_release()));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        return g0.g(getText(), setComposingTextCommand.getText()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    @k
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @k
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    @k
    public String toString() {
        return "SetComposingTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetComposingTextCommand(@k String str, int i11) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i11);
    }
}
