package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DeleteAllCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@k EditingBuffer editingBuffer) {
        editingBuffer.replace$ui_text_release(0, editingBuffer.getLength$ui_text_release(), "");
    }

    public boolean equals(@l Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        return o0.d(DeleteAllCommand.class).hashCode();
    }

    @k
    public String toString() {
        return "DeleteAllCommand()";
    }
}
