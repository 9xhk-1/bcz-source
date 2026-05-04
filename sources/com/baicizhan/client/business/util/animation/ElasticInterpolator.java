package com.baicizhan.client.business.util.animation;

import android.view.animation.Interpolator;
import com.baicizhan.client.business.util.animation.EasingType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ElasticInterpolator implements Interpolator {
    private float amplitude;
    private float period;
    private EasingType.Type type;

    public ElasticInterpolator(EasingType.Type type, float amplitude, float period) {
        this.type = type;
        this.amplitude = amplitude;
        this.period = period;
    }

    private float in(float t11, float a11, float p11) {
        float f11;
        if (t11 == 0.0f) {
            return 0.0f;
        }
        if (t11 >= 1.0f) {
            return 1.0f;
        }
        if (p11 == 0.0f) {
            p11 = 0.3f;
        }
        if (a11 == 0.0f || a11 < 1.0f) {
            f11 = p11 / 4.0f;
            a11 = 1.0f;
        } else {
            f11 = (float) ((p11 / 6.283185307179586d) * Math.asin(1.0f / a11));
        }
        float f12 = t11 - 1.0f;
        return (float) (-(a11 * Math.pow(2.0d, 10.0f * f12) * Math.sin(((f12 - f11) * 6.283185307179586d) / p11)));
    }

    private float inout(float t11, float a11, float p11) {
        float f11;
        double pow;
        if (t11 == 0.0f) {
            return 0.0f;
        }
        if (t11 >= 1.0f) {
            return 1.0f;
        }
        if (p11 == 0.0f) {
            p11 = 0.45000002f;
        }
        if (a11 == 0.0f || a11 < 1.0f) {
            f11 = p11 / 4.0f;
            a11 = 1.0f;
        } else {
            f11 = (float) ((p11 / 6.283185307179586d) * Math.asin(1.0f / a11));
        }
        float f12 = t11 * 2.0f;
        if (f12 < 1.0f) {
            float f13 = f12 - 1.0f;
            pow = a11 * Math.pow(2.0d, 10.0f * f13) * Math.sin(((f13 - f11) * 6.283185307179586d) / p11) * (-0.5d);
        } else {
            float f14 = f12 - 1.0f;
            pow = (a11 * Math.pow(2.0d, (-10.0f) * f14) * Math.sin(((f14 - f11) * 6.283185307179586d) / p11) * 0.5d) + 1.0d;
        }
        return (float) pow;
    }

    private float out(float t11, float a11, float p11) {
        float f11;
        if (t11 == 0.0f) {
            return 0.0f;
        }
        if (t11 >= 1.0f) {
            return 1.0f;
        }
        if (p11 == 0.0f) {
            p11 = 0.3f;
        }
        if (a11 == 0.0f || a11 < 1.0f) {
            f11 = p11 / 4.0f;
            a11 = 1.0f;
        } else {
            f11 = (float) ((p11 / 6.283185307179586d) * Math.asin(1.0f / a11));
        }
        return (float) ((a11 * Math.pow(2.0d, (-10.0f) * t11) * Math.sin(((t11 - f11) * 6.283185307179586d) / p11)) + 1.0d);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float t11) {
        EasingType.Type type = this.type;
        if (type == EasingType.Type.IN) {
            return in(t11, this.amplitude, this.period);
        }
        if (type == EasingType.Type.OUT) {
            return out(t11, this.amplitude, this.period);
        }
        if (type == EasingType.Type.INOUT) {
            return inout(t11, this.amplitude, this.period);
        }
        return 0.0f;
    }
}
