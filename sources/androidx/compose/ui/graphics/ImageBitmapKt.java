package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    @m80.k
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m2733ImageBitmapx__hDU(int i11, int i12, int i13, boolean z11, @m80.k ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m2377ActualImageBitmapx__hDU(i11, i12, i13, z11, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m2734ImageBitmapx__hDU$default(int i11, int i12, int i13, boolean z11, ColorSpace colorSpace, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = ImageBitmapConfig.Companion.m2729getArgb8888_sVssgQ();
        }
        if ((i14 & 8) != 0) {
            z11 = true;
        }
        if ((i14 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m2733ImageBitmapx__hDU(i11, i12, i13, z11, colorSpace);
    }

    @m80.k
    public static final ImageBitmap decodeToImageBitmap(@m80.k byte[] bArr) {
        return AndroidImageBitmap_androidKt.createImageBitmap(bArr);
    }

    @m80.k
    public static final PixelMap toPixelMap(@m80.k ImageBitmap imageBitmap, int i11, int i12, int i13, int i14, @m80.k int[] iArr, int i15, int i16) {
        imageBitmap.readPixels(iArr, i11, i12, i13, i14, i15, i16);
        return new PixelMap(iArr, i13, i14, i15, i16);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i11, int i12, int i13, int i14, int[] iArr, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = 0;
        }
        if ((i17 & 2) != 0) {
            i12 = 0;
        }
        if ((i17 & 4) != 0) {
            i13 = imageBitmap.getWidth();
        }
        if ((i17 & 8) != 0) {
            i14 = imageBitmap.getHeight();
        }
        if ((i17 & 16) != 0) {
            iArr = new int[i13 * i14];
        }
        if ((i17 & 32) != 0) {
            i15 = 0;
        }
        if ((i17 & 64) != 0) {
            i16 = i13;
        }
        return toPixelMap(imageBitmap, i11, i12, i13, i14, iArr, i15, i16);
    }
}
