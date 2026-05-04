package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes2.dex */
final class BoundsHelperApi30Impl implements BoundsHelper {

    @m80.k
    public static final BoundsHelperApi30Impl INSTANCE = new BoundsHelperApi30Impl();

    private BoundsHelperApi30Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    @m80.k
    public Rect currentWindowBounds(@m80.k Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
