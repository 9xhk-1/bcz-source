package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ColorKt {
    public static final int component1(@ColorInt int i11) {
        return (i11 >> 24) & 255;
    }

    public static final int component2(@ColorInt int i11) {
        return (i11 >> 16) & 255;
    }

    public static final int component3(@ColorInt int i11) {
        return (i11 >> 8) & 255;
    }

    public static final int component4(@ColorInt int i11) {
        return i11 & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i11, @m80.k ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(i11, colorSpace);
        return convert;
    }

    public static final int getAlpha(@ColorInt int i11) {
        return (i11 >> 24) & 255;
    }

    public static final int getBlue(@ColorInt int i11) {
        return i11 & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final ColorSpace getColorSpace(long j11) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j11);
        return colorSpace;
    }

    public static final int getGreen(@ColorInt int i11) {
        return (i11 >> 8) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(@ColorInt int i11) {
        return Color.luminance(i11);
    }

    public static final int getRed(@ColorInt int i11) {
        return (i11 >> 16) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isSrgb(long j11) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j11);
        return isSrgb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long j11) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j11);
        return isWideGamut;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final Color plus(@m80.k Color color, @m80.k Color color2) {
        return ColorUtils.compositeColors(color2, color);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final Color toColor(@ColorInt int i11) {
        Color valueOf;
        valueOf = Color.valueOf(i11);
        return valueOf;
    }

    @ColorInt
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int toColorInt(long j11) {
        int argb;
        argb = Color.toArgb(j11);
        return argb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long toColorLong(@ColorInt int i11) {
        long pack;
        pack = Color.pack(i11);
        return pack;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(@m80.k Color color) {
        float component;
        component = color.getComponent(0);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(@m80.k Color color) {
        float component;
        component = color.getComponent(1);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(@m80.k Color color) {
        float component;
        component = color.getComponent(2);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(@m80.k Color color) {
        float component;
        component = color.getComponent(3);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i11, @m80.k ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(i11, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getAlpha(long j11) {
        float alpha;
        alpha = Color.alpha(j11);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getBlue(long j11) {
        float blue;
        blue = Color.blue(j11);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getGreen(long j11) {
        float green;
        green = Color.green(j11);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(long j11) {
        float luminance;
        luminance = Color.luminance(j11);
        return luminance;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getRed(long j11) {
        float red;
        red = Color.red(j11);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final Color toColor(long j11) {
        Color valueOf;
        valueOf = Color.valueOf(j11);
        return valueOf;
    }

    @ColorInt
    public static final int toColorInt(@m80.k String str) {
        return Color.parseColor(str);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(long j11) {
        float red;
        red = Color.red(j11);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(long j11) {
        float green;
        green = Color.green(j11);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(long j11) {
        float blue;
        blue = Color.blue(j11);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(long j11) {
        float alpha;
        alpha = Color.alpha(j11);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j11, @m80.k ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(j11, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j11, @m80.k ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(j11, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final Color convertTo(@m80.k Color color, @m80.k ColorSpace.Named named) {
        ColorSpace colorSpace;
        Color convert;
        colorSpace = ColorSpace.get(named);
        convert = color.convert(colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @m80.k
    public static final Color convertTo(@m80.k Color color, @m80.k ColorSpace colorSpace) {
        Color convert;
        convert = color.convert(colorSpace);
        return convert;
    }
}
