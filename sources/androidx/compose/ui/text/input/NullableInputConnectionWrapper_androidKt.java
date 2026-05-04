package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class NullableInputConnectionWrapper_androidKt {
    @k
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(@k InputConnection inputConnection, @k l<? super NullableInputConnectionWrapper, g2> lVar) {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, lVar) : i11 >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, lVar) : new NullableInputConnectionWrapperApi24(inputConnection, lVar);
    }
}
