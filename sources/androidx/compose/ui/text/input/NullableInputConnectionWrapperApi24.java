package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RequiresApi;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi24 extends NullableInputConnectionWrapperApi21 {
    public NullableInputConnectionWrapperApi24(@k InputConnection inputConnection, @k l<? super NullableInputConnectionWrapper, g2> lVar) {
        super(inputConnection, lVar);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21
    public final void closeDelegate(@k InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.deleteSurroundingTextInCodePoints(i11, i12);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    @m80.l
    public final Handler getHandler() {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.getHandler();
        }
        return null;
    }
}
