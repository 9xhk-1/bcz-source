package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.LazyThreadSafetyMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;

    @m80.k
    private final yz.c0 imm$delegate = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final android.view.inputmethod.InputMethodManager invoke() {
            View view;
            view = InputMethodManagerImpl.this.view;
            Object systemService = view.getContext().getSystemService("input_method");
            kotlin.jvm.internal.g0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    });

    @m80.k
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;

    @m80.k
    private final View view;

    public InputMethodManagerImpl(@m80.k View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void startStylusHandwriting() {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34StartStylusHandwriting.INSTANCE.startStylusHandwriting(getImm(), this.view);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateCursorAnchorInfo(@m80.k CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateExtractedText(int i11, @m80.k ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i11, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateSelection(int i11, int i12, int i13, int i14) {
        getImm().updateSelection(this.view, i11, i12, i13, i14);
    }
}
