package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RectHelper_androidKt {
    @yz.n(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @yz.w0(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    @m80.k
    public static final Rect toAndroidRect(@m80.k androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    @m80.k
    public static final RectF toAndroidRectF(@m80.k androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    @m80.k
    public static final IntRect toComposeIntRect(@m80.k Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @m80.k
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@m80.k Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @m80.k
    public static final Rect toAndroidRect(@m80.k IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    @m80.k
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@m80.k RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
