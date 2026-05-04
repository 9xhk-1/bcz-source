package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(25)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(@k InputConnection inputConnection, @k l<? super NullableInputConnectionWrapper, g2> lVar) {
        super(inputConnection, lVar);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(@k InputContentInfo inputContentInfo, int i11, @m80.l Bundle bundle) {
        boolean commitContent;
        InputConnection delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        commitContent = delegate.commitContent(inputContentInfo, i11, bundle);
        return commitContent;
    }
}
