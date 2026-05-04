package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class BoundsHelperApi16Impl implements BoundsHelper {

    @m80.k
    public static final BoundsHelperApi16Impl INSTANCE = new BoundsHelperApi16Impl();

    private BoundsHelperApi16Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    @m80.k
    public Rect currentWindowBounds(@m80.k Activity activity) {
        int i11;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i12 = point.x;
        if (i12 == 0 || (i11 = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i12;
        rect.bottom = i11;
        return rect;
    }
}
