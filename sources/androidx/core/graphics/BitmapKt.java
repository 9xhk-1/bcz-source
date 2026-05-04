package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BitmapKt {
    @m80.k
    public static final Bitmap applyCanvas(@m80.k Bitmap bitmap, @m80.k x00.l<? super Canvas, g2> lVar) {
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(@m80.k Bitmap bitmap, @m80.k Point point) {
        int i11;
        int width = bitmap.getWidth();
        int i12 = point.x;
        return i12 >= 0 && i12 < width && (i11 = point.y) >= 0 && i11 < bitmap.getHeight();
    }

    @m80.k
    public static final Bitmap createBitmap(int i11, int i12, @m80.k Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    public static final int get(@m80.k Bitmap bitmap, int i11, int i12) {
        return bitmap.getPixel(i11, i12);
    }

    @m80.k
    public static final Bitmap scale(@m80.k Bitmap bitmap, int i11, int i12, boolean z11) {
        return Bitmap.createScaledBitmap(bitmap, i11, i12, z11);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z11 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i11, i12, z11);
    }

    public static final void set(@m80.k Bitmap bitmap, int i11, int i12, @ColorInt int i13) {
        bitmap.setPixel(i11, i12, i13);
    }

    public static final boolean contains(@m80.k Bitmap bitmap, @m80.k PointF pointF) {
        float f11 = pointF.x;
        if (f11 < 0.0f || f11 >= bitmap.getWidth()) {
            return false;
        }
        float f12 = pointF.y;
        return f12 >= 0.0f && f12 < ((float) bitmap.getHeight());
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final Bitmap createBitmap(int i11, int i12, @m80.k Bitmap.Config config, boolean z11, @m80.k ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap(i11, i12, config, z11, colorSpace);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i11, int i12, Bitmap.Config config, boolean z11, ColorSpace colorSpace, int i13, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        if ((i13 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i13 & 8) != 0) {
            z11 = true;
        }
        if ((i13 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
        }
        createBitmap = Bitmap.createBitmap(i11, i12, config, z11, colorSpace);
        return createBitmap;
    }
}
