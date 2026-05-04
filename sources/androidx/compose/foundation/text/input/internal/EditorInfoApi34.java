package androidx.compose.foundation.text.input.internal;

import a00.w1;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes.dex */
final class EditorInfoApi34 {

    @m80.k
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(@m80.k EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(a00.h0.Q(p.a(), t.a(), q.a(), r.a(), u.a(), v.a(), w.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(w1.u(p.a(), t.a(), q.a(), r.a()));
    }
}
