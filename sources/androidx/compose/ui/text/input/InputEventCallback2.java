package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* loaded from: classes2.dex */
public interface InputEventCallback2 {
    void onConnectionClosed(@k RecordingInputConnection recordingInputConnection);

    void onEditCommands(@k List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo4757onImeActionKlQnJC8(int i11);

    void onKeyEvent(@k KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16);
}
