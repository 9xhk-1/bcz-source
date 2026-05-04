package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LayerSnapshot_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap toBitmap(Image image) {
        Image.Plane[] planes = image.getPlanes();
        kotlin.jvm.internal.g0.m(planes);
        Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i11 = 0; i11 < width; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = ColorKt.m2563toArgb8_81llA(ColorKt.Color(i12 & 255, (i12 >> 8) & 255, (i12 >> 16) & 255, (i12 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
