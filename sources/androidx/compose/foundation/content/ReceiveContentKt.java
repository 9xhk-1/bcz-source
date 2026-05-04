package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ReceiveContentKt {
    @ExperimentalFoundationApi
    @k
    public static final Modifier contentReceiver(@k Modifier modifier, @k ReceiveContentListener receiveContentListener) {
        return modifier.then(new ReceiveContentElement(receiveContentListener));
    }
}
