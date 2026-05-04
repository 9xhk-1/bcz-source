package androidx.compose.ui.window;

import a00.h0;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes2.dex */
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(@k View view, int i11, int i12) {
        view.setSystemGestureExclusionRects(h0.U(new Rect(0, 0, i11, i12)));
    }
}
