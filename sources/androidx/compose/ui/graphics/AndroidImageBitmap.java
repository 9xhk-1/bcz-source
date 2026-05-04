package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidImageBitmap.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidImageBitmap.android.kt\nandroidx/compose/ui/graphics/AndroidImageBitmap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidImageBitmap implements ImageBitmap {

    @m80.k
    private final Bitmap bitmap;

    public AndroidImageBitmap(@m80.k Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @m80.k
    public final Bitmap getBitmap$ui_graphics_release() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    @m80.k
    public ColorSpace getColorSpace() {
        if (Build.VERSION.SDK_INT < 26) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
        return Api26Bitmap.composeColorSpace$ui_graphics_release(this.bitmap);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo2376getConfig_sVssgQ() {
        Bitmap.Config config = this.bitmap.getConfig();
        kotlin.jvm.internal.g0.m(config);
        return AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void readPixels(@m80.k int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        Bitmap.Config config;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = asAndroidBitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                asAndroidBitmap = asAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
                z11 = true;
            }
        }
        Bitmap bitmap = asAndroidBitmap;
        bitmap.getPixels(iArr, i15, i16, i11, i12, i13, i14);
        if (z11) {
            bitmap.recycle();
        }
    }
}
