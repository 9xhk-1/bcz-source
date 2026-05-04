package androidx.compose.ui.text.input;

import a00.r0;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@u0({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,515:1\n87#1,5:516\n87#1,5:521\n87#1,5:526\n87#1,5:531\n87#1,5:536\n87#1,5:541\n87#1,5:546\n87#1,5:551\n87#1,5:556\n87#1,5:561\n87#1,5:566\n87#1,5:571\n87#1,5:576\n87#1,5:581\n87#1,5:586\n87#1,5:591\n87#1,5:596\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n151#1:516,5\n193#1:521,5\n200#1:526,5\n208#1:531,5\n216#1:536,5\n227#1:541,5\n235#1:546,5\n243#1:551,5\n251#1:556,5\n296#1:561,5\n381#1:566,5\n409#1:571,5\n435#1:576,5\n448#1:581,5\n464#1:586,5\n491#1:591,5\n502#1:596,5\n*E\n"})
/* loaded from: classes2.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;

    @k
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;

    @k
    private TextFieldValue mTextFieldValue;

    @k
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    public RecordingInputConnection(@k TextFieldValue textFieldValue, @k InputEventCallback2 inputEventCallback2, boolean z11) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z11;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i11 = this.batchDepth - 1;
        this.batchDepth = i11;
        if (i11 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(r0.d6(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(x00.a<g2> aVar) {
        boolean z11 = this.isActive;
        if (z11) {
            aVar.invoke();
        }
        return z11;
    }

    private final void sendSynthesizedKeyEvent(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z11 = this.isActive;
        return z11 ? beginBatchEditInternal() : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.isActive;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@l CompletionInfo completionInfo) {
        boolean z11 = this.isActive;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@k InputContentInfo inputContentInfo, int i11, @l Bundle bundle) {
        boolean z11 = this.isActive;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@l CorrectionInfo correctionInfo) {
        boolean z11 = this.isActive;
        return z11 ? this.autoCorrect : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@l CharSequence charSequence, int i11) {
        boolean z11 = this.isActive;
        if (z11) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.isActive;
        if (!z11) {
            return z11;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.isActive;
        if (!z11) {
            return z11;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z11 = this.isActive;
        if (!z11) {
            return z11;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i11) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m4557getMinimpl(this.mTextFieldValue.m4807getSelectiond9O1mEE()), i11);
    }

    @k
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @k
    public ExtractedText getExtractedText(@l ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.extractedTextMonitorMode = z11;
        if (z11) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public Handler getHandler() {
        return null;
    }

    @k
    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getSelectedText(int i11) {
        if (TextRange.m4553getCollapsedimpl(this.mTextFieldValue.m4807getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @k
    public CharSequence getTextAfterCursor(int i11, int i12) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @k
    public CharSequence getTextBeforeCursor(int i11, int i12) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i11).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i11) {
        boolean z11 = this.isActive;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i11) {
        int m4738getDefaulteUduSuo;
        boolean z11 = this.isActive;
        if (!z11) {
            return z11;
        }
        if (i11 != 0) {
            switch (i11) {
                case 2:
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4740getGoeUduSuo();
                    break;
                case 3:
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4744getSearcheUduSuo();
                    break;
                case 4:
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4745getSendeUduSuo();
                    break;
                case 5:
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4741getNexteUduSuo();
                    break;
                case 6:
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4739getDoneeUduSuo();
                    break;
                case 7:
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4743getPreviouseUduSuo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i11);
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4738getDefaulteUduSuo();
                    break;
            }
        } else {
            m4738getDefaulteUduSuo = ImeAction.Companion.m4738getDefaulteUduSuo();
        }
        this.eventCallback.mo4757onImeActionKlQnJC8(m4738getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@l String str, @l Bundle bundle) {
        boolean z11 = this.isActive;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        boolean z16 = false;
        boolean z17 = (i11 & 1) != 0;
        boolean z18 = (i11 & 2) != 0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            boolean z19 = (i11 & 16) != 0;
            boolean z21 = (i11 & 8) != 0;
            boolean z22 = (i11 & 4) != 0;
            if (i12 >= 34 && (i11 & 32) != 0) {
                z16 = true;
            }
            if (z19 || z21 || z22 || z16) {
                z12 = z16;
                z11 = z22;
                z14 = z21;
                z13 = z19;
            } else if (i12 >= 34) {
                z13 = true;
                z14 = true;
                z11 = true;
                z12 = true;
            } else {
                z12 = z16;
                z13 = true;
                z14 = true;
                z11 = true;
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z17, z18, z13, z14, z11, z12);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@k KeyEvent keyEvent) {
        boolean z11 = this.isActive;
        if (!z11) {
            return z11;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.isActive;
        if (z11) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@l CharSequence charSequence, int i11) {
        boolean z11 = this.isActive;
        if (z11) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    public final void setMTextFieldValue$ui_release(@k TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i11, int i12) {
        boolean z11 = this.isActive;
        if (!z11) {
            return z11;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i11, i12));
        return true;
    }

    public final void updateInputState(@k TextFieldValue textFieldValue, @k InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setMTextFieldValue$ui_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
            }
            TextRange m4806getCompositionMzsxiRA = textFieldValue.m4806getCompositionMzsxiRA();
            int m4557getMinimpl = m4806getCompositionMzsxiRA != null ? TextRange.m4557getMinimpl(m4806getCompositionMzsxiRA.m4563unboximpl()) : -1;
            TextRange m4806getCompositionMzsxiRA2 = textFieldValue.m4806getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE()), TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()), m4557getMinimpl, m4806getCompositionMzsxiRA2 != null ? TextRange.m4556getMaximpl(m4806getCompositionMzsxiRA2.m4563unboximpl()) : -1);
        }
    }

    private final void logDebug(String str) {
    }
}
