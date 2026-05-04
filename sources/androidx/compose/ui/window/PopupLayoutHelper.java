package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@VisibleForTesting
/* loaded from: classes2.dex */
public interface PopupLayoutHelper {
    void getWindowVisibleDisplayFrame(@k View view, @k Rect rect);

    void setGestureExclusionRects(@k View view, int i11, int i12);

    void updateViewLayout(@k WindowManager windowManager, @k View view, @k ViewGroup.LayoutParams layoutParams);
}
