package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1101#2:587\n1083#2,2:588\n641#3,2:590\n423#3,9:593\n1#4:592\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n116#1:587\n116#1:588,2\n261#1:590,2\n338#1:593,9\n*E\n"})
@n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;

    @k
    private final c0 baseInputConnection$delegate;

    @k
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;

    @l
    private Rect focusedRect;

    @l
    private Runnable frameCallback;

    @k
    private List<WeakReference<RecordingInputConnection>> ics;

    @k
    private ImeOptions imeOptions;

    @k
    private final Executor inputCommandProcessorExecutor;

    @k
    private final InputMethodManager inputMethodManager;

    @k
    private x00.l<? super List<? extends EditCommand>, g2> onEditCommand;

    @k
    private x00.l<? super ImeAction, g2> onImeActionPerformed;

    @k
    private TextFieldValue state;

    @k
    private final MutableVector<TextInputCommand> textInputCommandQueue;

    @k
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TextInputCommand {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ TextInputCommand[] $VALUES;
        public static final TextInputCommand StartInput = new TextInputCommand("StartInput", 0);
        public static final TextInputCommand StopInput = new TextInputCommand("StopInput", 1);
        public static final TextInputCommand ShowKeyboard = new TextInputCommand("ShowKeyboard", 2);
        public static final TextInputCommand HideKeyboard = new TextInputCommand("HideKeyboard", 3);

        private static final /* synthetic */ TextInputCommand[] $values() {
            return new TextInputCommand[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
        }

        static {
            TextInputCommand[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private TextInputCommand(String str, int i11) {
        }

        @k
        public static m00.a<TextInputCommand> getEntries() {
            return $ENTRIES;
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(@k View view, @k MatrixPositionCalculator matrixPositionCalculator, @k InputMethodManager inputMethodManager, @k Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new x00.l<List<? extends EditCommand>, g2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends EditCommand> list) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return g2.f100423a;
            }
        };
        this.onImeActionPerformed = new x00.l<ImeAction, g2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ImeAction imeAction) {
                m4808invokeKlQnJC8(imeAction.m4728unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m4808invokeKlQnJC8(int i11) {
            }
        };
        this.state = new TextFieldValue("", TextRange.Companion.m4564getZerod9O1mEE(), (TextRange) null, 4, (v) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = e0.b(LazyThreadSafetyMode.NONE, new x00.a<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(TextInputServiceAndroid.this.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processInputCommands() {
        View findFocus;
        if (!this.view.isFocused() && (findFocus = this.view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.clear();
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        TextInputCommand[] textInputCommandArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            processInputCommands$applyToState(textInputCommandArr[i11], objectRef, objectRef2);
        }
        this.textInputCommandQueue.clear();
        if (g0.g(objectRef.element, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) objectRef2.element;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (g0.g(objectRef.element, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i11 == 1) {
            ?? r32 = Boolean.TRUE;
            objectRef.element = r32;
            objectRef2.element = r32;
        } else if (i11 == 2) {
            ?? r33 = Boolean.FALSE;
            objectRef.element = r33;
            objectRef2.element = r33;
        } else if ((i11 == 3 || i11 == 4) && !g0.g(objectRef.element, Boolean.FALSE)) {
            objectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.c
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(TextInputServiceAndroid.this);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z11) {
        if (z11) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    @l
    public final InputConnection createInputConnection(@k EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                List list;
                List list2;
                List list3;
                list = TextInputServiceAndroid.this.ics;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list2 = TextInputServiceAndroid.this.ics;
                    if (g0.g(((WeakReference) list2.get(i11)).get(), recordingInputConnection2)) {
                        list3 = TextInputServiceAndroid.this.ics;
                        list3.remove(i11);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                x00.l lVar;
                lVar = TextInputServiceAndroid.this.onEditCommand;
                lVar.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo4757onImeActionKlQnJC8(int i11) {
                x00.l lVar;
                lVar = TextInputServiceAndroid.this.onImeActionPerformed;
                lVar.invoke(ImeAction.m4722boximpl(i11));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                BaseInputConnection baseInputConnection;
                baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
                CursorAnchorInfoController cursorAnchorInfoController;
                cursorAnchorInfoController = TextInputServiceAndroid.this.cursorAnchorInfoController;
                cursorAnchorInfoController.requestUpdate(z11, z12, z13, z14, z15, z16);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    @k
    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    @k
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @n(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@k androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(c10.d.L0(rect.getLeft()), c10.d.L0(rect.getTop()), c10.d.L0(rect.getRight()), c10.d.L0(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@k TextFieldValue textFieldValue, @k ImeOptions imeOptions, @k x00.l<? super List<? extends EditCommand>, g2> lVar, @k x00.l<? super ImeAction, g2> lVar2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = lVar;
        this.onImeActionPerformed = lVar2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new x00.l<List<? extends EditCommand>, g2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends EditCommand> list) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return g2.f100423a;
            }
        };
        this.onImeActionPerformed = new x00.l<ImeAction, g2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ImeAction imeAction) {
                m4809invokeKlQnJC8(imeAction.m4728unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m4809invokeKlQnJC8(int i11) {
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@l TextFieldValue textFieldValue, @k TextFieldValue textFieldValue2) {
        boolean z11 = (TextRange.m4552equalsimpl0(this.state.m4807getSelectiond9O1mEE(), textFieldValue2.m4807getSelectiond9O1mEE()) && g0.g(this.state.m4806getCompositionMzsxiRA(), textFieldValue2.m4806getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i11 = 0; i11 < size; i11++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i11).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (g0.g(textFieldValue, textFieldValue2)) {
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
        if (textFieldValue != null && (!g0.g(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m4552equalsimpl0(textFieldValue.m4807getSelectiond9O1mEE(), textFieldValue2.m4807getSelectiond9O1mEE()) && !g0.g(textFieldValue.m4806getCompositionMzsxiRA(), textFieldValue2.m4806getCompositionMzsxiRA())))) {
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

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(@k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @k TextLayoutResult textLayoutResult, @k x00.l<? super Matrix, g2> lVar, @k androidx.compose.ui.geometry.Rect rect, @k androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, lVar, rect, rect2);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i11, v vVar) {
        this(view, matrixPositionCalculator, inputMethodManager, (i11 & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(@k View view, @k MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
