package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int min = Math.min((int) ((fArr.length - 1) * f11), fArr.length - 2);
        float f12 = this.mStepSize;
        float f13 = (f11 - (min * f12)) / f12;
        float[] fArr2 = this.mValues;
        float f14 = fArr2[min];
        return f14 + (f13 * (fArr2[min + 1] - f14));
    }
}
