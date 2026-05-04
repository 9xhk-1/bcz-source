package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PlatformTextInputMethodRequest {
    @m80.k
    InputConnection createInputConnection(@m80.k EditorInfo editorInfo);
}
