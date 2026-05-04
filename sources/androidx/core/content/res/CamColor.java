package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    public CamColor(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.mHue = f11;
        this.mChroma = f12;
        this.mJ = f13;
        this.mQ = f14;
        this.mM = f15;
        this.mS = f16;
        this.mJstar = f17;
        this.mAstar = f18;
        this.mBstar = f19;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f11, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, to = 100.0d) float f13) {
        float f14 = 100.0f;
        float f15 = 1000.0f;
        float f16 = 0.0f;
        CamColor camColor = null;
        float f17 = 1000.0f;
        while (Math.abs(f16 - f14) > 0.01f) {
            float f18 = ((f14 - f16) / 2.0f) + f16;
            int viewedInSrgb = fromJch(f18, f12, f11).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f13 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f11));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f15 = abs;
                    f17 = distance;
                }
            }
            if (f15 == 0.0f && f17 == 0.0f) {
                return camColor;
            }
            if (lStarFromInt < f13) {
                f16 = f18;
            } else {
                f14 = f18;
            }
        }
        return camColor;
    }

    @NonNull
    public static CamColor fromColor(@ColorInt int i11) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i11, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void fromColorInViewingConditions(@ColorInt int i11, @NonNull ViewingConditions viewingConditions, @Nullable @Size(7) float[] fArr, @NonNull @Size(3) float[] fArr2) {
        CamUtils.xyzFromInt(i11, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f11 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f12 = fArr4[0] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr4[1] * f13);
        float f15 = fArr2[2];
        float f16 = f14 + (fArr4[2] * f15);
        float[] fArr5 = fArr3[1];
        float f17 = (fArr5[0] * f11) + (fArr5[1] * f13) + (fArr5[2] * f15);
        float[] fArr6 = fArr3[2];
        float f18 = (f11 * fArr6[0]) + (f13 * fArr6[1]) + (f15 * fArr6[2]);
        float f19 = viewingConditions.getRgbD()[0] * f16;
        float f21 = viewingConditions.getRgbD()[1] * f17;
        float f22 = viewingConditions.getRgbD()[2] * f18;
        float pow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f19)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f21)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f22)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f21) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f22) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d11 = signum3;
        float f23 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d11)) / 11.0f;
        float f24 = ((float) ((signum + signum2) - (d11 * 2.0d))) / 9.0f;
        float f25 = signum2 * 20.0f;
        float f26 = (((signum * 20.0f) + f25) + (21.0f * signum3)) / 20.0f;
        float f27 = (((signum * 40.0f) + f25) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f28 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f27 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c11 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f23 * f23) + (f24 * f24)))) / (f26 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r4 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d12 = f28;
        float cos = ((float) Math.cos(d12)) * log;
        float sin = log * ((float) Math.sin(d12));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = c11;
            fArr[2] = flRoot;
            fArr[3] = sqrt2;
            fArr[4] = f29;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f11, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, to = 360.0d) float f13) {
        return fromJchInFrame(f11, f12, f13, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f11, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, to = 360.0d) float f13, ViewingConditions viewingConditions) {
        float c11 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f11 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f12;
        float sqrt = ((float) Math.sqrt(((f12 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f14 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f13) / 180.0f;
        return new CamColor(f13, f12, f11, c11, flRoot, sqrt, f14, ((float) Math.cos(d11)) * log, log * ((float) Math.sin(d11)));
    }

    public static void getM3HCTfromColor(@ColorInt int i11, @NonNull @Size(3) float[] fArr) {
        fromColorInViewingConditions(i11, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i11);
    }

    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f11, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, to = 100.0d) float f13) {
        return toColor(f11, f12, f13, ViewingConditions.DEFAULT);
    }

    public float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = w.f67046e, fromInclusive = false, to = w.f67045d, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = w.f67046e, fromInclusive = false, to = w.f67045d, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, to = w.f67045d, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public float getJ() {
        return this.mJ;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, to = w.f67045d, toInclusive = false)
    public float getM() {
        return this.mM;
    }

    @FloatRange(from = 0.0d, to = w.f67045d, toInclusive = false)
    public float getQ() {
        return this.mQ;
    }

    @FloatRange(from = 0.0d, to = w.f67045d, toInclusive = false)
    public float getS() {
        return this.mS;
    }

    @ColorInt
    public int viewed(@NonNull ViewingConditions viewingConditions) {
        float pow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw2 = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc2 = cos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw2 / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f11 = (((0.305f + nbb) * 23.0f) * pow) / (((nc2 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f12 = cos2 * f11;
        float f13 = f11 * sin;
        float f14 = nbb * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float signum = Math.signum(f15) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float signum2 = Math.signum(f16) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float signum3 = Math.signum(((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f17 = signum / viewingConditions.getRgbD()[0];
        float f18 = signum2 / viewingConditions.getRgbD()[1];
        float f19 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f21 = (fArr2[0] * f17) + (fArr2[1] * f18) + (fArr2[2] * f19);
        float[] fArr3 = fArr[1];
        float f22 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * f19);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f21, f22, (f17 * fArr4[0]) + (f18 * fArr4[1]) + (f19 * fArr4[2]));
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f11, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, to = 100.0d) float f13, @NonNull ViewingConditions viewingConditions) {
        if (f12 < 1.0d || Math.round(f13) <= 0.0d || Math.round(f13) >= 100.0d) {
            return CamUtils.intFromLStar(f13);
        }
        float min = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
        CamColor camColor = null;
        boolean z11 = true;
        float f14 = 0.0f;
        float f15 = f12;
        while (Math.abs(f14 - f12) >= 0.4f) {
            CamColor findCamByJ = findCamByJ(min, f15, f13);
            if (!z11) {
                if (findCamByJ == null) {
                    f12 = f15;
                } else {
                    f14 = f15;
                    camColor = findCamByJ;
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
            } else {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
                z11 = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f13) : camColor.viewed(viewingConditions);
    }
}
