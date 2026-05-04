package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    @m80.k
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m2377ActualImageBitmapx__hDU(int i11, int i12, int i13, boolean z11, @m80.k ColorSpace colorSpace) {
        Bitmap createBitmap;
        Bitmap.Config m2378toBitmapConfig1JJdX4A = m2378toBitmapConfig1JJdX4A(i13);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Api26Bitmap.m2416createBitmapx__hDU$ui_graphics_release(i11, i12, i13, z11, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, m2378toBitmapConfig1JJdX4A);
            createBitmap.setHasAlpha(z11);
        }
        return new AndroidImageBitmap(createBitmap);
    }

    @m80.k
    public static final Bitmap asAndroidBitmap(@m80.k ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @m80.k
    public static final ImageBitmap asImageBitmap(@m80.k Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    @m80.k
    public static final ImageBitmap createImageBitmap(@m80.k byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    @m80.k
    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m2378toBitmapConfig1JJdX4A(int i11) {
        Bitmap.Config config;
        Bitmap.Config config2;
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m2724equalsimpl0(i11, companion.m2729getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m2724equalsimpl0(i11, companion.m2728getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m2724equalsimpl0(i11, companion.m2732getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && ImageBitmapConfig.m2724equalsimpl0(i11, companion.m2730getF16_sVssgQ())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i12 < 26 || !ImageBitmapConfig.m2724equalsimpl0(i11, companion.m2731getGpu_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final int toImageConfig(@m80.k Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m2728getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m2732getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m2729getArgb8888_sVssgQ();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return ImageBitmapConfig.Companion.m2730getF16_sVssgQ();
            }
        }
        if (i11 >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return ImageBitmapConfig.Companion.m2731getGpu_sVssgQ();
            }
        }
        return ImageBitmapConfig.Companion.m2729getArgb8888_sVssgQ();
    }
}
