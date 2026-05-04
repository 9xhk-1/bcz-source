package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.c0;
import yz.e0;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* loaded from: classes2.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;

    @k
    private final c0 imm$delegate = e0.b(LazyThreadSafetyMode.NONE, new x00.a<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final android.view.inputmethod.InputMethodManager invoke() {
            View view;
            view = InputMethodManagerImpl.this.view;
            Object systemService = view.getContext().getSystemService("input_method");
            g0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    });

    @k
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;

    @k
    private final View view;

    public InputMethodManagerImpl(@k View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(@k CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int i11, @k ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i11, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int i11, int i12, int i13, int i14) {
        getImm().updateSelection(this.view, i11, i12, i13, i14);
    }
}
