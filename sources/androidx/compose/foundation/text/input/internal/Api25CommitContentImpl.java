package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(25)
/* loaded from: classes.dex */
final class Api25CommitContentImpl {

    @m80.k
    public static final Api25CommitContentImpl INSTANCE = new Api25CommitContentImpl();

    private Api25CommitContentImpl() {
    }

    public final boolean commitContent(@m80.k InputConnection inputConnection, @m80.k InputContentInfo inputContentInfo, int i11, @m80.l Bundle bundle) {
        boolean commitContent;
        commitContent = inputConnection.commitContent(inputContentInfo, i11, bundle);
        return commitContent;
    }
}
