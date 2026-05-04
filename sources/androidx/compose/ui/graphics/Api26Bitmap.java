package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Bitmap {

    @m80.k
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @w00.o
    @m80.k
    public static final ColorSpace composeColorSpace$ui_graphics_release(@m80.k Bitmap bitmap) {
        android.graphics.ColorSpace colorSpace;
        ColorSpace composeColorSpace;
        colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (composeColorSpace = AndroidColorSpace_androidKt.toComposeColorSpace(colorSpace)) == null) ? ColorSpaces.INSTANCE.getSrgb() : composeColorSpace;
    }

    @w00.o
    @m80.k
    /* renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
    public static final Bitmap m2416createBitmapx__hDU$ui_graphics_release(int i11, int i12, int i13, boolean z11, @m80.k ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, AndroidImageBitmap_androidKt.m2378toBitmapConfig1JJdX4A(i13), z11, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        return createBitmap;
    }
}
