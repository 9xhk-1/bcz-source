package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void startStylusHandwriting();

    void updateCursorAnchorInfo(@m80.k CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i11, @m80.k ExtractedText extractedText);

    void updateSelection(int i11, int i12, int i13, int i14);
}
