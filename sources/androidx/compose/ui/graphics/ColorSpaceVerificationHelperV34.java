package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelperV34 {

    @m80.k
    public static final ColorSpaceVerificationHelperV34 INSTANCE = new ColorSpaceVerificationHelperV34();

    private ColorSpaceVerificationHelperV34() {
    }

    @m80.l
    @w00.o
    public static final ColorSpace obtainAndroidColorSpace(@m80.k androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (kotlin.jvm.internal.g0.g(colorSpace, colorSpaces.getBt2020Hlg())) {
            named2 = ColorSpace.Named.BT2020_HLG;
            colorSpace3 = ColorSpace.get(named2);
            return colorSpace3;
        }
        if (!kotlin.jvm.internal.g0.g(colorSpace, colorSpaces.getBt2020Pq())) {
            return null;
        }
        named = ColorSpace.Named.BT2020_PQ;
        colorSpace2 = ColorSpace.get(named);
        return colorSpace2;
    }

    @w00.o
    @m80.k
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int i11) {
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        named = ColorSpace.Named.BT2020_HLG;
        ordinal = named.ordinal();
        if (i11 == ordinal) {
            return ColorSpaces.INSTANCE.getBt2020Hlg();
        }
        named2 = ColorSpace.Named.BT2020_PQ;
        ordinal2 = named2.ordinal();
        return i11 == ordinal2 ? ColorSpaces.INSTANCE.getBt2020Pq() : ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release();
    }
}
