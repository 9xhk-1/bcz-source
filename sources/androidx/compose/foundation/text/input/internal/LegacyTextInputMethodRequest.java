package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;

    @m80.k
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;

    @m80.l
    private Rect focusedRect;

    @m80.k
    private final InputMethodManager inputMethodManager;

    @m80.l
    private LegacyTextFieldState legacyTextFieldState;

    @m80.l
    private TextFieldSelectionManager textFieldSelectionManager;

    @m80.k
    private final View view;

    @m80.l
    private ViewConfiguration viewConfiguration;

    @m80.k
    private x00.l<? super List<? extends EditCommand>, g2> onEditCommand = new x00.l<List<? extends EditCommand>, g2>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onEditCommand$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends EditCommand> list) {
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(List<? extends EditCommand> list) {
            invoke2(list);
            return g2.f100423a;
        }
    };

    @m80.k
    private x00.l<? super ImeAction, g2> onImeActionPerformed = new x00.l<ImeAction, g2>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onImeActionPerformed$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ImeAction imeAction) {
            m1257invokeKlQnJC8(imeAction.m4728unboximpl());
            return g2.f100423a;
        }

        /* renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m1257invokeKlQnJC8(int i11) {
        }
    };

    @m80.k
    private TextFieldValue state = new TextFieldValue("", TextRange.Companion.m4564getZerod9O1mEE(), (TextRange) null, 4, (kotlin.jvm.internal.v) null);

    @m80.k
    private ImeOptions imeOptions = ImeOptions.Companion.getDefault();

    @m80.k
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();

    @m80.k
    private final yz.c0 baseInputConnection$delegate = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a<BaseInputConnection>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(LegacyTextInputMethodRequest.this.getView(), false);
        }
    });

    public LegacyTextInputMethodRequest(@m80.k View view, @m80.k x00.l<? super Matrix, g2> lVar, @m80.k InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(lVar, inputMethodManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    @m80.l
    public final Rect getFocusedRect$foundation_release() {
        return this.focusedRect;
    }

    @m80.k
    public final TextFieldValue getState() {
        return this.state;
    }

    @m80.k
    public final View getView() {
        return this.view;
    }

    public final void notifyFocusedRect(@m80.k androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(c10.d.L0(rect.getLeft()), c10.d.L0(rect.getTop()), c10.d.L0(rect.getRight()), c10.d.L0(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void setFocusedRect$foundation_release(@m80.l Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(@m80.k TextFieldValue textFieldValue, @m80.l LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, @m80.k ImeOptions imeOptions, @m80.k x00.l<? super List<? extends EditCommand>, g2> lVar, @m80.k x00.l<? super ImeAction, g2> lVar2) {
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = lVar;
        this.onImeActionPerformed = lVar2;
        this.legacyTextFieldState = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
    }

    public final void updateState(@m80.l TextFieldValue textFieldValue, @m80.k TextFieldValue textFieldValue2) {
        boolean z11 = (TextRange.m4552equalsimpl0(this.state.m4807getSelectiond9O1mEE(), textFieldValue2.m4807getSelectiond9O1mEE()) && kotlin.jvm.internal.g0.g(this.state.m4806getCompositionMzsxiRA(), textFieldValue2.m4806getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i11 = 0; i11 < size; i11++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i11).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (kotlin.jvm.internal.g0.g(textFieldValue, textFieldValue2)) {
            if (z11) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int m4557getMinimpl = TextRange.m4557getMinimpl(textFieldValue2.m4807getSelectiond9O1mEE());
                int m4556getMaximpl = TextRange.m4556getMaximpl(textFieldValue2.m4807getSelectiond9O1mEE());
                TextRange m4806getCompositionMzsxiRA = this.state.m4806getCompositionMzsxiRA();
                int m4557getMinimpl2 = m4806getCompositionMzsxiRA != null ? TextRange.m4557getMinimpl(m4806getCompositionMzsxiRA.m4563unboximpl()) : -1;
                TextRange m4806getCompositionMzsxiRA2 = this.state.m4806getCompositionMzsxiRA();
                inputMethodManager.updateSelection(m4557getMinimpl, m4556getMaximpl, m4557getMinimpl2, m4806getCompositionMzsxiRA2 != null ? TextRange.m4556getMaximpl(m4806getCompositionMzsxiRA2.m4563unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!kotlin.jvm.internal.g0.g(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m4552equalsimpl0(textFieldValue.m4807getSelectiond9O1mEE(), textFieldValue2.m4807getSelectiond9O1mEE()) && !kotlin.jvm.internal.g0.g(textFieldValue.m4806getCompositionMzsxiRA(), textFieldValue2.m4806getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i12 = 0; i12 < size2; i12++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i12).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    public final void updateTextLayoutResult(@m80.k TextFieldValue textFieldValue, @m80.k OffsetMapping offsetMapping, @m80.k TextLayoutResult textLayoutResult, @m80.k androidx.compose.ui.geometry.Rect rect, @m80.k androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    @m80.k
    public RecordingInputConnection createInputConnection(@m80.k EditorInfo editorInfo) {
        EditorInfo_androidKt.m1230updatepLxbY9I$default(editorInfo, this.state.getText(), this.state.m4807getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                List list;
                List list2;
                List list3;
                list = LegacyTextInputMethodRequest.this.ics;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list2 = LegacyTextInputMethodRequest.this.ics;
                    if (kotlin.jvm.internal.g0.g(((WeakReference) list2.get(i11)).get(), recordingInputConnection2)) {
                        list3 = LegacyTextInputMethodRequest.this.ics;
                        list3.remove(i11);
                        return;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                x00.l lVar;
                lVar = LegacyTextInputMethodRequest.this.onEditCommand;
                lVar.invoke(list);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo1256onImeActionKlQnJC8(int i11) {
                x00.l lVar;
                lVar = LegacyTextInputMethodRequest.this.onImeActionPerformed;
                lVar.invoke(ImeAction.m4722boximpl(i11));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                BaseInputConnection baseInputConnection;
                baseInputConnection = LegacyTextInputMethodRequest.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
                LegacyCursorAnchorInfoController legacyCursorAnchorInfoController;
                legacyCursorAnchorInfoController = LegacyTextInputMethodRequest.this.cursorAnchorInfoController;
                legacyCursorAnchorInfoController.requestUpdate(z11, z12, z13, z14, z15, z16);
            }
        }, this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }
}
