package androidx.constraintlayout.core.motion;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    private static int clamp(int i11) {
        int i12 = (i11 & (~(i11 >> 31))) - 255;
        return (i12 & (i12 >> 31)) + 255;
    }

    public static int hsvToRgb(float f11, float f12, float f13) {
        float f14 = f11 * 6.0f;
        int i11 = (int) f14;
        float f15 = f14 - i11;
        float f16 = f13 * 255.0f;
        int i12 = (int) (((1.0f - f12) * f16) + 0.5f);
        int i13 = (int) (((1.0f - (f15 * f12)) * f16) + 0.5f);
        int i14 = (int) (((1.0f - ((1.0f - f15) * f12)) * f16) + 0.5f);
        int i15 = (int) (f16 + 0.5f);
        if (i11 == 0) {
            return ((i15 << 16) + (i14 << 8) + i12) | (-16777216);
        }
        if (i11 == 1) {
            return ((i13 << 16) + (i15 << 8) + i12) | (-16777216);
        }
        if (i11 == 2) {
            return ((i12 << 16) + (i15 << 8) + i14) | (-16777216);
        }
        if (i11 == 3) {
            return ((i12 << 16) + (i13 << 8) + i15) | (-16777216);
        }
        if (i11 == 4) {
            return ((i14 << 16) + (i12 << 8) + i15) | (-16777216);
        }
        if (i11 != 5) {
            return 0;
        }
        return ((i15 << 16) + (i12 << 8) + i13) | (-16777216);
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute != null && (attributeType = this.mType) == customAttribute.mType) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.mIntegerValue == customAttribute.mIntegerValue) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.mFloatValue == customAttribute.mFloatValue;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.mColorValue == customAttribute.mColorValue;
                case STRING_TYPE:
                    return this.mIntegerValue == customAttribute.mIntegerValue;
                case BOOLEAN_TYPE:
                    return this.mBooleanValue == customAttribute.mBooleanValue;
                case DIMENSION_TYPE:
                    return this.mFloatValue == customAttribute.mFloatValue;
                default:
                    return false;
            }
        }
        return false;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i11 = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i11 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i11) {
        this.mColorValue = i11;
    }

    public void setFloatValue(float f11) {
        this.mFloatValue = f11;
    }

    public void setIntValue(int i11) {
        this.mIntegerValue = i11;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.mFloatValue = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & 16777215);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z11) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z11;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.mStringValue = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }
}
