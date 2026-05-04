package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.core.view.SoftwareKeyboardControllerCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    @m80.l
    private android.view.inputmethod.InputMethodManager imm;

    @m80.k
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;

    @m80.k
    private final View view;

    public ComposeInputMethodManagerImpl(@m80.k View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager createImm() {
        Object systemService = this.view.getContext().getSystemService("input_method");
        kotlin.jvm.internal.g0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }

    @m80.k
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @m80.k
    public final android.view.inputmethod.InputMethodManager requireImm() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        android.view.inputmethod.InputMethodManager createImm = createImm();
        this.imm = createImm;
        return createImm;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void restartInput() {
        requireImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateCursorAnchorInfo(@m80.k CursorAnchorInfo cursorAnchorInfo) {
        requireImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateExtractedText(int i11, @m80.k ExtractedText extractedText) {
        requireImm().updateExtractedText(this.view, i11, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateSelection(int i11, int i12, int i13, int i14) {
        requireImm().updateSelection(this.view, i11, i12, i13, i14);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
    }
}
