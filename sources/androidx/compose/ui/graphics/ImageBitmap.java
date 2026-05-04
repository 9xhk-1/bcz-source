package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageBitmap {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void readPixels$default(ImageBitmap imageBitmap, int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        if ((i17 & 2) != 0) {
            i11 = 0;
        }
        if ((i17 & 4) != 0) {
            i12 = 0;
        }
        if ((i17 & 8) != 0) {
            i13 = imageBitmap.getWidth();
        }
        if ((i17 & 16) != 0) {
            i14 = imageBitmap.getHeight();
        }
        if ((i17 & 32) != 0) {
            i15 = 0;
        }
        if ((i17 & 64) != 0) {
            i16 = i13;
        }
        imageBitmap.readPixels(iArr, i11, i12, i13, i14, i15, i16);
    }

    @m80.k
    ColorSpace getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo2376getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(@m80.k int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16);
}
