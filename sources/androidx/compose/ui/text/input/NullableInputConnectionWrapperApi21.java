package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {

    @l
    private InputConnection delegate;

    @k
    private final x00.l<NullableInputConnectionWrapper, g2> onConnectionClosed;

    /* JADX WARN: Multi-variable type inference failed */
    public NullableInputConnectionWrapperApi21(@k InputConnection inputConnection, @k x00.l<? super NullableInputConnectionWrapper, g2> lVar) {
        this.onConnectionClosed = lVar;
        this.delegate = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.delegate != null) {
            disposeDelegate();
            this.onConnectionClosed.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@l CompletionInfo completionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@k InputContentInfo inputContentInfo, int i11, @l Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@l CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@l CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        return false;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            closeDelegate(inputConnection);
            this.delegate = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i11);
        }
        return 0;
    }

    @l
    public final InputConnection getDelegate() {
        return this.delegate;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public ExtractedText getExtractedText(@l ExtractedTextRequest extractedTextRequest, int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getSelectedText(int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextAfterCursor(int i11, int i12) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextBeforeCursor(int i11, int i12) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@l String str, @l Bundle bundle) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@l KeyEvent keyEvent) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i11, int i12) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@l CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i11, int i12) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setSelection(i11, i12);
        }
        return false;
    }

    public void closeDelegate(@k InputConnection inputConnection) {
    }
}
