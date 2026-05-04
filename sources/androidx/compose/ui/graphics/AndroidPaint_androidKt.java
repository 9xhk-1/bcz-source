package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @m80.k
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    @m80.k
    public static final Paint asComposePaint(@m80.k android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(@m80.k android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@m80.k android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@m80.k android.graphics.Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@m80.k android.graphics.Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.Companion.m2610getNonefv9h1I() : FilterQuality.Companion.m2608getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@m80.k android.graphics.Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i11 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? StrokeCap.Companion.m2862getButtKaPHkGw() : StrokeCap.Companion.m2864getSquareKaPHkGw() : StrokeCap.Companion.m2863getRoundKaPHkGw() : StrokeCap.Companion.m2862getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@m80.k android.graphics.Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? StrokeJoin.Companion.m2873getMiterLxFBmk8() : StrokeJoin.Companion.m2874getRoundLxFBmk8() : StrokeJoin.Companion.m2872getBevelLxFBmk8() : StrokeJoin.Companion.m2873getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@m80.k android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@m80.k android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@m80.k android.graphics.Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.Companion.m2777getStrokeTiuSbCo() : PaintingStyle.Companion.m2776getFillTiuSbCo();
    }

    @m80.k
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(@m80.k android.graphics.Paint paint, float f11) {
        paint.setAlpha((int) Math.rint(f11 * 255.0f));
    }

    public static final void setNativeAntiAlias(@m80.k android.graphics.Paint paint, boolean z11) {
        paint.setAntiAlias(z11);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m2393setNativeBlendModeGB0RdKg(@m80.k android.graphics.Paint paint, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m2912setBlendModeGB0RdKg(paint, i11);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m2361toPorterDuffModes9anfk8(i11)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m2394setNativeColor4WTKRHQ(@m80.k android.graphics.Paint paint, long j11) {
        paint.setColor(ColorKt.m2563toArgb8_81llA(j11));
    }

    public static final void setNativeColorFilter(@m80.k android.graphics.Paint paint, @m80.l ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m2395setNativeFilterQuality50PEsBU(@m80.k android.graphics.Paint paint, int i11) {
        paint.setFilterBitmap(!FilterQuality.m2603equalsimpl0(i11, FilterQuality.Companion.m2610getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@m80.k android.graphics.Paint paint, @m80.l PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@m80.k android.graphics.Paint paint, @m80.l Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m2396setNativeStrokeCapCSYIeUk(@m80.k android.graphics.Paint paint, int i11) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        paint.setStrokeCap(StrokeCap.m2858equalsimpl0(i11, companion.m2864getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m2858equalsimpl0(i11, companion.m2863getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m2858equalsimpl0(i11, companion.m2862getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m2397setNativeStrokeJoinkLtJ_vA(@m80.k android.graphics.Paint paint, int i11) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        paint.setStrokeJoin(StrokeJoin.m2868equalsimpl0(i11, companion.m2873getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m2868equalsimpl0(i11, companion.m2872getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m2868equalsimpl0(i11, companion.m2874getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(@m80.k android.graphics.Paint paint, float f11) {
        paint.setStrokeMiter(f11);
    }

    public static final void setNativeStrokeWidth(@m80.k android.graphics.Paint paint, float f11) {
        paint.setStrokeWidth(f11);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m2398setNativeStyle5YerkU(@m80.k android.graphics.Paint paint, int i11) {
        paint.setStyle(PaintingStyle.m2772equalsimpl0(i11, PaintingStyle.Companion.m2777getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
