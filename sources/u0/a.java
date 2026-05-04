package u0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Bitmaps")
@u0({"SMAP\nBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,56:1\n28#2:57\n*S KotlinDebug\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n*L\n50#1:57\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static final int a(@m80.k Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return bitmap.getWidth() * bitmap.getHeight() * b(bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final int b(@m80.l Bitmap.Config config) {
        Bitmap.Config config2;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return 4;
        }
        config2 = Bitmap.Config.RGBA_F16;
        return config == config2 ? 8 : 4;
    }

    @m80.k
    public static final Bitmap.Config d(@m80.k Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final boolean f(@m80.k Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    @m80.k
    public static final BitmapDrawable g(@m80.k Bitmap bitmap, @m80.k Context context) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    @m80.k
    public static final Bitmap.Config h(@m80.l Bitmap.Config config) {
        return (config == null || f(config)) ? Bitmap.Config.ARGB_8888 : config;
    }

    public static /* synthetic */ void c(Bitmap.Config config) {
    }

    public static /* synthetic */ void e(Bitmap bitmap) {
    }
}
