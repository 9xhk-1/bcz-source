package androidx.core.content.res;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.mN = f11;
        this.mAw = f12;
        this.mNbb = f13;
        this.mNcb = f14;
        this.mC = f15;
        this.mNc = f16;
        this.mRgbD = fArr;
        this.mFl = f17;
        this.mFlRoot = f18;
        this.mZ = f19;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f11, float f12, float f13, boolean z11) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f14 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f15 = fArr3[0] * f14;
        float f16 = fArr[1];
        float f17 = f15 + (fArr3[1] * f16);
        float f18 = fArr[2];
        float f19 = f17 + (fArr3[2] * f18);
        float[] fArr4 = fArr2[1];
        float f21 = (fArr4[0] * f14) + (fArr4[1] * f16) + (fArr4[2] * f18);
        float[] fArr5 = fArr2[2];
        float f22 = (f14 * fArr5[0]) + (f16 * fArr5[1]) + (f18 * fArr5[2]);
        float f23 = (f13 / 10.0f) + 0.8f;
        float lerp = ((double) f23) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f23 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f23 - 0.8f) * 10.0f);
        float exp = z11 ? 1.0f : (1.0f - (((float) Math.exp(((-f11) - 42.0f) / 92.0f)) * 0.2777778f)) * f23;
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f21) * exp) + 1.0f) - exp, (((100.0f / f22) * exp) + 1.0f) - exp};
        float f24 = 1.0f / ((5.0f * f11) + 1.0f);
        float f25 = f24 * f24 * f24 * f24;
        float f26 = 1.0f - f25;
        float cbrt = (f25 * f11) + (0.1f * f26 * f26 * ((float) Math.cbrt(f11 * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f12) / fArr[1];
        double d12 = yFromLStar;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f19) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f21) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f22) / 100.0d, 0.42d)};
        float f27 = fArr7[0];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[1];
        float f31 = (f29 * 400.0f) / (f29 + 27.13f);
        float f32 = fArr7[2];
        float[] fArr8 = {f28, f31, (400.0f * f32) / (f32 + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, lerp, f23, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.mZ;
    }
}
