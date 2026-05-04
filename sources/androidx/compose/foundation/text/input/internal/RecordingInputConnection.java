package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n1#1,628:1\n110#1,5:629\n110#1,5:634\n110#1,5:639\n110#1,5:644\n110#1,5:649\n110#1,5:654\n110#1,5:659\n110#1,5:664\n110#1,5:669\n110#1,5:674\n110#1,5:679\n110#1,5:684\n110#1,5:689\n110#1,5:694\n110#1,5:699\n110#1,5:704\n110#1,5:709\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n172#1:629,5\n213#1:634,5\n220#1:639,5\n228#1:644,5\n236#1:649,5\n247#1:654,5\n255#1:659,5\n263#1:664,5\n271#1:669,5\n315#1:674,5\n399#1:679,5\n427#1:684,5\n492#1:689,5\n505#1:694,5\n521#1:699,5\n548#1:704,5\n559#1:709,5\n*E\n"})
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;

    @m80.k
    private final List<EditCommand> editCommands;

    @m80.k
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;

    @m80.l
    private final LegacyTextFieldState legacyTextFieldState;

    @m80.l
    private final TextFieldSelectionManager textFieldSelectionManager;

    @m80.k
    private TextFieldValue textFieldValue;

    @m80.l
    private final ViewConfiguration viewConfiguration;

    public RecordingInputConnection(@m80.k TextFieldValue textFieldValue, @m80.k InputEventCallback2 inputEventCallback2, boolean z11, @m80.l LegacyTextFieldState legacyTextFieldState, @m80.l TextFieldSelectionManager textFieldSelectionManager, @m80.l ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z11;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEditCommandWithBatch(EditCommand editCommand) {
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
            this.eventCallback.onEditCommands(a00.r0.d6(this.editCommands));
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
    public boolean commitCompletion(@m80.l CompletionInfo completionInfo) {
        boolean z11 = this.isActive;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@m80.k InputContentInfo inputContentInfo, int i11, @m80.l Bundle bundle) {
        boolean z11 = this.isActive;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@m80.l CorrectionInfo correctionInfo) {
        boolean z11 = this.isActive;
        return z11 ? this.autoCorrect : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@m80.l CharSequence charSequence, int i11) {
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
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m4557getMinimpl(this.textFieldValue.m4807getSelectiond9O1mEE()), i11);
    }

    @m80.k
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.k
    public ExtractedText getExtractedText(@m80.l ExtractedTextRequest extractedTextRequest, int i11) {
        ExtractedText extractedText;
        boolean z11 = (i11 & 1) != 0;
        this.extractedTextMonitorMode = z11;
        if (z11) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        extractedText = RecordingInputConnection_androidKt.toExtractedText(this.textFieldValue);
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.l
    public Handler getHandler() {
        return null;
    }

    @m80.l
    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.l
    public CharSequence getSelectedText(int i11) {
        if (TextRange.m4553getCollapsedimpl(this.textFieldValue.m4807getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.k
    public CharSequence getTextAfterCursor(int i11, int i12) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.k
    public CharSequence getTextBeforeCursor(int i11, int i12) {
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, i11).toString();
    }

    @m80.l
    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @m80.k
    public final TextFieldValue getTextFieldValue$foundation_release() {
        return this.textFieldValue;
    }

    @m80.l
    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i11) {
        boolean z11 = this.isActive;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.getText().length()));
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
        this.eventCallback.mo1256onImeActionKlQnJC8(m4738getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@m80.k HandwritingGesture handwritingGesture, @m80.l Executor executor, @m80.l IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, handwritingGesture, this.viewConfiguration, executor, intConsumer, new x00.l<EditCommand, g2>() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection$performHandwritingGesture$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(EditCommand editCommand) {
                    invoke2(editCommand);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EditCommand editCommand) {
                    RecordingInputConnection.this.addEditCommandWithBatch(editCommand);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@m80.l String str, @m80.l Bundle bundle) {
        boolean z11 = this.isActive;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
    public boolean sendKeyEvent(@m80.k KeyEvent keyEvent) {
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
    public boolean setComposingText(@m80.l CharSequence charSequence, int i11) {
        boolean z11 = this.isActive;
        if (z11) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i11));
        }
        return z11;
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

    public final void setTextFieldValue$foundation_release(@m80.k TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    public final void updateInputState(@m80.k TextFieldValue textFieldValue, @m80.k InputMethodManager inputMethodManager) {
        ExtractedText extractedText;
        if (this.isActive) {
            setTextFieldValue$foundation_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                int i11 = this.currentExtractedTextRequestToken;
                extractedText = RecordingInputConnection_androidKt.toExtractedText(textFieldValue);
                inputMethodManager.updateExtractedText(i11, extractedText);
            }
            TextRange m4806getCompositionMzsxiRA = textFieldValue.m4806getCompositionMzsxiRA();
            int m4557getMinimpl = m4806getCompositionMzsxiRA != null ? TextRange.m4557getMinimpl(m4806getCompositionMzsxiRA.m4563unboximpl()) : -1;
            TextRange m4806getCompositionMzsxiRA2 = textFieldValue.m4806getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE()), TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()), m4557getMinimpl, m4806getCompositionMzsxiRA2 != null ? TextRange.m4556getMaximpl(m4806getCompositionMzsxiRA2.m4563unboximpl()) : -1);
        }
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z11, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, int i11, kotlin.jvm.internal.v vVar) {
        this(textFieldValue, inputEventCallback2, z11, (i11 & 8) != 0 ? null : legacyTextFieldState, (i11 & 16) != 0 ? null : textFieldSelectionManager, (i11 & 32) != 0 ? null : viewConfiguration);
    }

    private final void logDebug(String str) {
    }
}
