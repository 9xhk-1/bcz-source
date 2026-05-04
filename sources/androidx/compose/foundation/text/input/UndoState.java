package androidx.compose.foundation.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UndoState {
    public static final int $stable = 0;

    @k
    private final TextFieldState state;

    public UndoState(@k TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void clearHistory() {
        this.state.getTextUndoManager$foundation_release().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.state.getTextUndoManager$foundation_release().getCanRedo();
    }

    public final boolean getCanUndo() {
        return this.state.getTextUndoManager$foundation_release().getCanUndo();
    }

    public final void redo() {
        this.state.getTextUndoManager$foundation_release().redo(this.state);
    }

    public final void undo() {
        this.state.getTextUndoManager$foundation_release().undo(this.state);
    }

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }
}
