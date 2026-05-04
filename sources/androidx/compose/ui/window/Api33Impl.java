package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import m80.k;
import m80.l;
import w00.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes2.dex */
final class Api33Impl {

    @k
    public static final Api33Impl INSTANCE = new Api33Impl();

    private Api33Impl() {
    }

    @o
    @k
    public static final OnBackInvokedCallback createBackCallback(@l final x00.a<g2> aVar) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.a
            public final void onBackInvoked() {
                Api33Impl.createBackCallback$lambda$0(x00.a.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBackCallback$lambda$0(x00.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @o
    public static final void maybeRegisterBackCallback(@k View view, @l Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    @o
    public static final void maybeUnregisterBackCallback(@k View view, @l Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
