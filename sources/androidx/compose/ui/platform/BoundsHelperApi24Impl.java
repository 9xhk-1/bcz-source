package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes2.dex */
final class BoundsHelperApi24Impl implements BoundsHelper {

    @m80.k
    public static final BoundsHelperApi24Impl INSTANCE = new BoundsHelperApi24Impl();

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    @m80.k
    public Rect currentWindowBounds(@m80.k Activity activity) {
        int navigationBarHeight;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            navigationBarHeight = AndroidWindowInfo_androidKt.getNavigationBarHeight(activity);
            int i11 = rect.bottom;
            if (i11 + navigationBarHeight == point.y) {
                rect.bottom = i11 + navigationBarHeight;
                return rect;
            }
            int i12 = rect.right;
            if (i12 + navigationBarHeight == point.x) {
                rect.right = i12 + navigationBarHeight;
            }
        }
        return rect;
    }
}
