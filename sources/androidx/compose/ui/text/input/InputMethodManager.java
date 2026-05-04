package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* loaded from: classes2.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(@k CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i11, @k ExtractedText extractedText);

    void updateSelection(int i11, int i12, int i13, int i14);
}
