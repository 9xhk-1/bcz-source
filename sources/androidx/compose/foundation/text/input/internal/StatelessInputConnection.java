package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,660:1\n1101#2:661\n1083#2,2:662\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n*L\n112#1:661\n112#1:662,2\n*E\n"})
/* loaded from: classes.dex */
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;

    @m80.k
    private final InputConnection commitContentDelegateInputConnection;

    @m80.k
    private final MutableVector<x00.l<ImeEditCommandScope, g2>> editCommands = new MutableVector<>(new x00.l[16], 0);

    @m80.k
    private final TextInputSession session;

    @m80.k
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.inputmethod.InputConnection, androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(@m80.k TextInputSession textInputSession, @m80.k EditorInfo editorInfo) {
        this.session = textInputSession;
        ?? r32 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            {
                super(this, false);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                return true;
            }
        };
        this.terminalInputConnection = r32;
        this.commitContentDelegateInputConnection = InputConnectionCompat.createWrapper((InputConnection) r32, editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i11, Bundle bundle) {
                TextInputSession textInputSession2;
                if (Build.VERSION.SDK_INT >= 25 && (i11 & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                        Object unwrap = inputContentInfoCompat.unwrap();
                        kotlin.jvm.internal.g0.n(unwrap, "null cannot be cast to non-null type android.os.Parcelable");
                        Parcelable parcelable = (Parcelable) unwrap;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (Exception e11) {
                        StatelessInputConnection.this.logDebug("Can't insert content from IME; requestPermission() failed, " + e11);
                        return false;
                    }
                }
                textInputSession2 = StatelessInputConnection.this.session;
                return textInputSession2.onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(inputContentInfoCompat, bundle));
            }
        });
    }

    private final boolean beginBatchEditInternal() {
        return this.session.beginBatchEdit();
    }

    private final boolean endBatchEditInternal() {
        return this.session.endBatchEdit();
    }

    private final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    private final void sendSynthesizedKeyEvent(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i11) {
        logDebug("clearMetaKeyStates(" + i11 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@m80.l CompletionInfo completionInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("commitCompletion(");
        sb2.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb2.append(')');
        logDebug(sb2.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@m80.k InputContentInfo inputContentInfo, int i11, @m80.l Bundle bundle) {
        logDebug("commitContent(" + inputContentInfo + j2.O + i11 + j2.O + bundle + ')');
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25CommitContentImpl.INSTANCE.commitContent(this.commitContentDelegateInputConnection, inputContentInfo, i11, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@m80.l CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@m80.l CharSequence charSequence, int i11) {
        logDebug("commitText(\"" + ((Object) charSequence) + "\", " + i11 + ')');
        if (charSequence == null) {
            return true;
        }
        ImeEditCommand_androidKt.commitText(this.session, charSequence.toString(), i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        logDebug("deleteSurroundingText(" + i11 + j2.O + i12 + ')');
        ImeEditCommand_androidKt.deleteSurroundingText(this.session, i11, i12);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        logDebug("deleteSurroundingTextInCodePoints(" + i11 + j2.O + i12 + ')');
        ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints(this.session, i11, i12);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        ImeEditCommand_androidKt.finishComposingText(this.session);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i11) {
        logDebug("getCursorCapsMode(" + i11 + ')');
        return TextUtils.getCapsMode(getText(), TextRange.m4557getMinimpl(getText().m1189getSelectiond9O1mEE()), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.k
    public ExtractedText getExtractedText(@m80.l ExtractedTextRequest extractedTextRequest, int i11) {
        ExtractedText extractedText;
        logDebug("getExtractedText(" + extractedTextRequest + j2.O + i11 + ')');
        extractedText = StatelessInputConnection_androidKt.toExtractedText(getText());
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.l
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.l
    public CharSequence getSelectedText(int i11) {
        String obj = TextRange.m4553getCollapsedimpl(getText().m1189getSelectiond9O1mEE()) ? null : TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        logDebug("getSelectedText(" + i11 + "): " + ((Object) obj));
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.k
    public CharSequence getTextAfterCursor(int i11, int i12) {
        String obj = TextFieldCharSequenceKt.getTextAfterSelection(getText(), i11).toString();
        logDebug("getTextAfterCursor(" + i11 + j2.O + i12 + "): " + obj);
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    @m80.k
    public CharSequence getTextBeforeCursor(int i11, int i12) {
        String obj = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), i11).toString();
        logDebug("getTextBeforeCursor(" + i11 + j2.O + i12 + "): " + obj);
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        return false;
     */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performContextMenuAction(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "performContextMenuAction("
            r0.append(r1)
            r0.append(r3)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.logDebug(r0)
            r0 = 0
            switch(r3) {
                case 16908319: goto L30;
                case 16908320: goto L2a;
                case 16908321: goto L24;
                case 16908322: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L3d
        L1e:
            r3 = 279(0x117, float:3.91E-43)
            r2.sendSynthesizedKeyEvent(r3)
            goto L3d
        L24:
            r3 = 278(0x116, float:3.9E-43)
            r2.sendSynthesizedKeyEvent(r3)
            goto L3d
        L2a:
            r3 = 277(0x115, float:3.88E-43)
            r2.sendSynthesizedKeyEvent(r3)
            goto L3d
        L30:
            androidx.compose.foundation.text.input.internal.TextInputSession r3 = r2.session
            androidx.compose.foundation.text.input.TextFieldCharSequence r1 = r2.getText()
            int r1 = r1.length()
            androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection(r3, r0, r1)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.StatelessInputConnection.performContextMenuAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i11) {
        int m4738getDefaulteUduSuo;
        logDebug("performEditorAction(" + i11 + ')');
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
                    logDebug("IME sent an unrecognized editor action: " + i11);
                    m4738getDefaulteUduSuo = ImeAction.Companion.m4738getDefaulteUduSuo();
                    break;
            }
        } else {
            m4738getDefaulteUduSuo = ImeAction.Companion.m4738getDefaulteUduSuo();
        }
        this.session.mo1219onImeActionKlQnJC8(m4738getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@m80.k HandwritingGesture handwritingGesture, @m80.l Executor executor, @m80.l IntConsumer intConsumer) {
        logDebug("performHandwritingGesture(" + handwritingGesture + j2.O + executor + j2.O + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.session, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@m80.l String str, @m80.l Bundle bundle) {
        logDebug("performPrivateCommand(" + str + j2.O + bundle + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + previewableHandwritingGesture + j2.O + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.session, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z11) {
        logDebug("reportFullscreenMode(" + z11 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i11) {
        logDebug("requestCursorUpdates(" + i11 + ')');
        this.session.requestCursorUpdates(i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@m80.k KeyEvent keyEvent) {
        logDebug("sendKeyEvent(" + keyEvent + ')');
        this.session.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i11, int i12) {
        logDebug("setComposingRegion(" + i11 + j2.O + i12 + ')');
        ImeEditCommand_androidKt.setComposingRegion(this.session, i11, i12);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@m80.l CharSequence charSequence, int i11) {
        logDebug("setComposingText(\"" + ((Object) charSequence) + "\", " + i11 + ')');
        if (charSequence == null) {
            return true;
        }
        TextInputSession textInputSession = this.session;
        String obj = charSequence.toString();
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ImeEditCommand_androidKt.setComposingText(textInputSession, obj, i11, spanned != null ? StatelessInputConnection_androidKt.toAnnotationList(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i11, int i12) {
        logDebug("setSelection(" + i11 + j2.O + i12 + ')');
        ImeEditCommand_androidKt.setSelection(this.session, i11, i12);
        return true;
    }

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String str) {
    }
}
