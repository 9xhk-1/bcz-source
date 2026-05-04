package androidx.compose.foundation.text;

import a00.h0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1129:1\n113#2:1130\n85#3:1131\n113#3,2:1132\n85#3:1134\n113#3,2:1135\n85#3:1138\n113#3,2:1139\n85#3:1141\n113#3,2:1142\n85#3:1144\n113#3,2:1145\n85#3:1147\n113#3,2:1148\n85#3:1150\n113#3,2:1151\n85#3:1153\n113#3,2:1154\n85#3:1156\n113#3,2:1157\n85#3:1159\n113#3,2:1160\n85#3:1162\n113#3,2:1163\n85#3:1165\n113#3,2:1166\n1#4:1137\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n*L\n747#1:1130\n744#1:1131\n744#1:1132,2\n747#1:1134\n747#1:1135,2\n806#1:1138\n806#1:1139,2\n816#1:1141\n816#1:1142,2\n822#1:1144\n822#1:1145,2\n828#1:1147\n828#1:1148,2\n834#1:1150\n834#1:1151,2\n846#1:1153\n846#1:1154,2\n852#1:1156\n852#1:1157,2\n853#1:1159\n853#1:1160,2\n889#1:1162\n889#1:1163,2\n890#1:1165\n890#1:1166,2\n*E\n"})
/* loaded from: classes.dex */
public final class LegacyTextFieldState {
    public static final int $stable = 8;

    @l
    private LayoutCoordinates _layoutCoordinates;

    @k
    private final MutableState autofillHighlightOn$delegate;

    @k
    private final MutableState deletionPreviewHighlightRange$delegate;

    @k
    private final MutableState handleState$delegate;

    @k
    private final MutableState hasFocus$delegate;

    @k
    private final Paint highlightPaint;

    @l
    private TextInputSession inputSession;

    @k
    private final MutableState isInTouchMode$delegate;
    private boolean isLayoutResultStale;

    @k
    private final MutableState justAutofilled$delegate;

    @k
    private final KeyboardActionRunner keyboardActionRunner;

    @l
    private final SoftwareKeyboardController keyboardController;

    @k
    private final MutableState<TextLayoutResultProxy> layoutResultState;

    @k
    private final MutableState minHeightForSingleLineField$delegate;

    @k
    private final x00.l<ImeAction, g2> onImeActionPerformed;

    @k
    private final x00.l<TextFieldValue, g2> onValueChange;

    @k
    private x00.l<? super TextFieldValue, g2> onValueChangeOriginal;

    @k
    private final EditProcessor processor = new EditProcessor();

    @k
    private final RecomposeScope recomposeScope;
    private long selectionBackgroundColor;

    @k
    private final MutableState selectionPreviewHighlightRange$delegate;

    @k
    private final MutableState showCursorHandle$delegate;

    @k
    private final MutableState showFloatingToolbar$delegate;

    @k
    private final MutableState showSelectionHandleEnd$delegate;

    @k
    private final MutableState showSelectionHandleStart$delegate;

    @k
    private TextDelegate textDelegate;

    @l
    private AnnotatedString untransformedText;

    public LegacyTextFieldState(@k TextDelegate textDelegate, @k RecomposeScope recomposeScope, @l SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5113boximpl(Dp.m5115constructorimpl(0)), null, 2, null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showFloatingToolbar$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.justAutofilled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.onValueChangeOriginal = new x00.l<TextFieldValue, g2>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChangeOriginal$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return g2.f100423a;
            }
        };
        this.onValueChange = new x00.l<TextFieldValue, g2>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChange$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
                x00.l lVar;
                String text = textFieldValue.getText();
                AnnotatedString untransformedText = LegacyTextFieldState.this.getUntransformedText();
                if (!g0.g(text, untransformedText != null ? untransformedText.getText() : null)) {
                    LegacyTextFieldState.this.setHandleState(HandleState.None);
                    if (LegacyTextFieldState.this.getJustAutofilled()) {
                        LegacyTextFieldState.this.setJustAutofilled(false);
                    } else {
                        LegacyTextFieldState.this.setAutofillHighlightOn(false);
                    }
                }
                LegacyTextFieldState legacyTextFieldState = LegacyTextFieldState.this;
                TextRange.Companion companion = TextRange.Companion;
                legacyTextFieldState.m1076setSelectionPreviewHighlightRange5zctL8(companion.m4564getZerod9O1mEE());
                LegacyTextFieldState.this.m1073setDeletionPreviewHighlightRange5zctL8(companion.m4564getZerod9O1mEE());
                lVar = LegacyTextFieldState.this.onValueChangeOriginal;
                lVar.invoke(textFieldValue);
                LegacyTextFieldState.this.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new x00.l<ImeAction, g2>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ImeAction imeAction) {
                m1078invokeKlQnJC8(imeAction.m4728unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m1078invokeKlQnJC8(int i11) {
                KeyboardActionRunner keyboardActionRunner;
                keyboardActionRunner = LegacyTextFieldState.this.keyboardActionRunner;
                keyboardActionRunner.m1054runActionKlQnJC8(i11);
            }
        };
        this.highlightPaint = AndroidPaint_androidKt.Paint();
        this.selectionBackgroundColor = Color.Companion.m2545getUnspecified0d7_KjU();
        TextRange.Companion companion = TextRange.Companion;
        this.selectionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m4547boximpl(companion.m4564getZerod9O1mEE()), null, 2, null);
        this.deletionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m4547boximpl(companion.m4564getZerod9O1mEE()), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m1069getDeletionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.deletionPreviewHighlightRange$delegate.getValue()).m4563unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    @k
    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    @l
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getJustAutofilled() {
        return ((Boolean) this.justAutofilled$delegate.getValue()).booleanValue();
    }

    @l
    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    @l
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    @l
    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m1070getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m5129unboximpl();
    }

    @k
    public final x00.l<ImeAction, g2> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    @k
    public final x00.l<TextFieldValue, g2> getOnValueChange() {
        return this.onValueChange;
    }

    @k
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    @k
    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1071getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m1072getSelectionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.selectionPreviewHighlightRange$delegate.getValue()).m4563unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    @k
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    @l
    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean hasHighlight() {
        return (TextRange.m4553getCollapsedimpl(m1072getSelectionPreviewHighlightRanged9O1mEE()) && TextRange.m4553getCollapsedimpl(m1069getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setAutofillHighlightOn(boolean z11) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m1073setDeletionPreviewHighlightRange5zctL8(long j11) {
        this.deletionPreviewHighlightRange$delegate.setValue(TextRange.m4547boximpl(j11));
    }

    public final void setHandleState(@k HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z11) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setInTouchMode(boolean z11) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setInputSession(@l TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setJustAutofilled(boolean z11) {
        this.justAutofilled$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setLayoutCoordinates(@l LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(@l TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m1074setMinHeightForSingleLineField0680j_4(float f11) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m5113boximpl(f11));
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m1075setSelectionBackgroundColor8_81llA(long j11) {
        this.selectionBackgroundColor = j11;
    }

    /* renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m1076setSelectionPreviewHighlightRange5zctL8(long j11) {
        this.selectionPreviewHighlightRange$delegate.setValue(TextRange.m4547boximpl(j11));
    }

    public final void setShowCursorHandle(boolean z11) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setShowFloatingToolbar(boolean z11) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setShowSelectionHandleEnd(boolean z11) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setShowSelectionHandleStart(boolean z11) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setTextDelegate(@k TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(@l AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m1077updatefnh65Uc(@k AnnotatedString annotatedString, @k AnnotatedString annotatedString2, @k TextStyle textStyle, boolean z11, @k Density density, @k FontFamily.Resolver resolver, @k x00.l<? super TextFieldValue, g2> lVar, @k KeyboardActions keyboardActions, @k FocusManager focusManager, long j11) {
        this.onValueChangeOriginal = lVar;
        this.selectionBackgroundColor = j11;
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate m1131updateTextDelegaterm0N8CA$default = TextDelegateKt.m1131updateTextDelegaterm0N8CA$default(this.textDelegate, annotatedString2, textStyle, density, resolver, z11, 0, 0, 0, h0.J(), 448, null);
        if (this.textDelegate != m1131updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m1131updateTextDelegaterm0N8CA$default;
    }
}
