package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion() {
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
    }

    private static float toTangent(float f11) {
        if (f11 < 0.0f || f11 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f11 / 2.0f));
    }

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        Path path = new Path();
        path.moveTo(f11, f12);
        float f18 = f13 - f11;
        float f19 = f14 - f12;
        float f21 = (f18 * f18) + (f19 * f19);
        float f22 = (f11 + f13) / 2.0f;
        float f23 = (f12 + f14) / 2.0f;
        float f24 = 0.25f * f21;
        boolean z11 = f12 > f14;
        if (Math.abs(f18) < Math.abs(f19)) {
            float abs = Math.abs(f21 / (f19 * 2.0f));
            if (z11) {
                f16 = abs + f14;
                f15 = f13;
            } else {
                f16 = abs + f12;
                f15 = f11;
            }
            f17 = this.mMinimumVerticalTangent;
        } else {
            float f25 = f21 / (f18 * 2.0f);
            if (z11) {
                f16 = f12;
                f15 = f25 + f11;
            } else {
                f15 = f13 - f25;
                f16 = f14;
            }
            f17 = this.mMinimumHorizontalTangent;
        }
        float f26 = f24 * f17 * f17;
        float f27 = f22 - f15;
        float f28 = f23 - f16;
        float f29 = (f27 * f27) + (f28 * f28);
        float f31 = this.mMaximumTangent;
        float f32 = f24 * f31 * f31;
        if (f29 >= f26) {
            f26 = f29 > f32 ? f32 : 0.0f;
        }
        if (f26 != 0.0f) {
            float sqrt = (float) Math.sqrt(f26 / f29);
            f15 = ((f15 - f22) * sqrt) + f22;
            f16 = f23 + (sqrt * (f16 - f23));
        }
        path.cubicTo((f11 + f15) / 2.0f, (f12 + f16) / 2.0f, (f15 + f13) / 2.0f, (f16 + f14) / 2.0f, f13, f14);
        return path;
    }

    public void setMaximumAngle(float f11) {
        this.mMaximumAngle = f11;
        this.mMaximumTangent = toTangent(f11);
    }

    public void setMinimumHorizontalAngle(float f11) {
        this.mMinimumHorizontalAngle = f11;
        this.mMinimumHorizontalTangent = toTangent(f11);
    }

    public void setMinimumVerticalAngle(float f11) {
        this.mMinimumVerticalAngle = f11;
        this.mMinimumVerticalTangent = toTangent(f11);
    }

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, DEFAULT_MAX_ANGLE_DEGREES));
        obtainStyledAttributes.recycle();
    }
}
