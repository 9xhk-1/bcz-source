package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.text.input.EditCommand;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface InputEventCallback2 {
    void onConnectionClosed(@m80.k RecordingInputConnection recordingInputConnection);

    void onEditCommands(@m80.k List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo1256onImeActionKlQnJC8(int i11);

    void onKeyEvent(@m80.k KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16);
}
