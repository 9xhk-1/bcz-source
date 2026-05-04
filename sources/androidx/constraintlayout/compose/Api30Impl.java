package androidx.constraintlayout.compose;

import android.view.View;
import androidx.annotation.RequiresApi;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes2.dex */
final class Api30Impl {

    @k
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    @o
    public static final boolean isShowingLayoutBounds(@k View view) {
        return view.isShowingLayoutBounds();
    }
}
