package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SetSelectionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetSelectionCommand(int i11, int i12) {
        this.start = i11;
        this.end = i12;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@k EditingBuffer editingBuffer) {
        int I = u.I(this.start, 0, editingBuffer.getLength$ui_text_release());
        int I2 = u.I(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (I < I2) {
            editingBuffer.setSelection$ui_text_release(I, I2);
        } else {
            editingBuffer.setSelection$ui_text_release(I2, I);
        }
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.start == setSelectionCommand.start && this.end == setSelectionCommand.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    @k
    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
