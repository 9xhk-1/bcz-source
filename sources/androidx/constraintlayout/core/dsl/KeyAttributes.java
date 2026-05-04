package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyAttributes extends Keys {
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing;
    protected String TYPE = TypedValues.AttributesType.NAME;
    private Fit mCurveFit = null;
    private Visibility[] mVisibility = null;
    private float[] mAlpha = null;
    private float[] mRotation = null;
    private float[] mRotationX = null;
    private float[] mRotationY = null;
    private float[] mPivotX = null;
    private float[] mPivotY = null;
    private float[] mTransitionPathRotate = null;
    private float[] mScaleX = null;
    private float[] mScaleY = null;
    private float[] mTranslationX = null;
    private float[] mTranslationY = null;
    private float[] mTranslationZ = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Fit {
        SPLINE,
        LINEAR
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public KeyAttributes(int i11, String... strArr) {
        this.mFrames = null;
        this.mTarget = strArr;
        this.mFrames = new int[i11];
        float length = 100.0f / (r3.length + 1);
        int i12 = 0;
        while (true) {
            int[] iArr = this.mFrames;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = (int) ((i12 * length) + length);
            i12++;
        }
    }

    public void attributesToString(StringBuilder sb2) {
        append(sb2, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sb2.append("frame:");
        sb2.append(Arrays.toString(this.mFrames));
        sb2.append(",\n");
        append(sb2, "easing", this.mTransitionEasing);
        if (this.mCurveFit != null) {
            sb2.append("fit:'");
            sb2.append(this.mCurveFit);
            sb2.append("',\n");
        }
        if (this.mVisibility != null) {
            sb2.append("visibility:'");
            sb2.append(Arrays.toString(this.mVisibility));
            sb2.append("',\n");
        }
        append(sb2, "alpha", this.mAlpha);
        append(sb2, "rotationX", this.mRotationX);
        append(sb2, "rotationY", this.mRotationY);
        append(sb2, "rotationZ", this.mRotation);
        append(sb2, "pivotX", this.mPivotX);
        append(sb2, "pivotY", this.mPivotY);
        append(sb2, "pathRotate", this.mTransitionPathRotate);
        append(sb2, "scaleX", this.mScaleX);
        append(sb2, "scaleY", this.mScaleY);
        append(sb2, "translationX", this.mTranslationX);
        append(sb2, "translationY", this.mTranslationY);
        append(sb2, "translationZ", this.mTranslationZ);
    }

    public float[] getAlpha() {
        return this.mAlpha;
    }

    public Fit getCurveFit() {
        return this.mCurveFit;
    }

    public float[] getPivotX() {
        return this.mPivotX;
    }

    public float[] getPivotY() {
        return this.mPivotY;
    }

    public float[] getRotation() {
        return this.mRotation;
    }

    public float[] getRotationX() {
        return this.mRotationX;
    }

    public float[] getRotationY() {
        return this.mRotationY;
    }

    public float[] getScaleX() {
        return this.mScaleX;
    }

    public float[] getScaleY() {
        return this.mScaleY;
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public float[] getTransitionPathRotate() {
        return this.mTransitionPathRotate;
    }

    public float[] getTranslationX() {
        return this.mTranslationX;
    }

    public float[] getTranslationY() {
        return this.mTranslationY;
    }

    public float[] getTranslationZ() {
        return this.mTranslationZ;
    }

    public Visibility[] getVisibility() {
        return this.mVisibility;
    }

    public void setAlpha(float... fArr) {
        this.mAlpha = fArr;
    }

    public void setCurveFit(Fit fit) {
        this.mCurveFit = fit;
    }

    public void setPivotX(float... fArr) {
        this.mPivotX = fArr;
    }

    public void setPivotY(float... fArr) {
        this.mPivotY = fArr;
    }

    public void setRotation(float... fArr) {
        this.mRotation = fArr;
    }

    public void setRotationX(float... fArr) {
        this.mRotationX = fArr;
    }

    public void setRotationY(float... fArr) {
        this.mRotationY = fArr;
    }

    public void setScaleX(float[] fArr) {
        this.mScaleX = fArr;
    }

    public void setScaleY(float[] fArr) {
        this.mScaleY = fArr;
    }

    public void setTarget(String[] strArr) {
        this.mTarget = strArr;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public void setTransitionPathRotate(float... fArr) {
        this.mTransitionPathRotate = fArr;
    }

    public void setTranslationX(float[] fArr) {
        this.mTranslationX = fArr;
    }

    public void setTranslationY(float[] fArr) {
        this.mTranslationY = fArr;
    }

    public void setTranslationZ(float[] fArr) {
        this.mTranslationZ = fArr;
    }

    public void setVisibility(Visibility... visibilityArr) {
        this.mVisibility = visibilityArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.TYPE);
        sb2.append(":{\n");
        attributesToString(sb2);
        sb2.append("},\n");
        return sb2.toString();
    }
}
