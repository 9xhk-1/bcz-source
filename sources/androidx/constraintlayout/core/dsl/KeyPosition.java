package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyPosition extends Keys {
    private int mFrame;
    private String mTarget;
    private String mTransitionEasing = null;
    private float mPercentWidth = Float.NaN;
    private float mPercentHeight = Float.NaN;
    private float mPercentX = Float.NaN;
    private float mPercentY = Float.NaN;
    private Type mPositionType = Type.CARTESIAN;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPosition(String str, int i11) {
        this.mTarget = null;
        this.mFrame = 0;
        this.mTarget = str;
        this.mFrame = i11;
    }

    public int getFrames() {
        return this.mFrame;
    }

    public float getPercentHeight() {
        return this.mPercentHeight;
    }

    public float getPercentWidth() {
        return this.mPercentWidth;
    }

    public float getPercentX() {
        return this.mPercentX;
    }

    public float getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int i11) {
        this.mFrame = i11;
    }

    public void setPercentHeight(float f11) {
        this.mPercentHeight = f11;
    }

    public void setPercentWidth(float f11) {
        this.mPercentWidth = f11;
    }

    public void setPercentX(float f11) {
        this.mPercentX = f11;
    }

    public void setPercentY(float f11) {
        this.mPercentY = f11;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTarget(String str) {
        this.mTarget = str;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPositions:{\n");
        append(sb2, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sb2.append("frame:");
        sb2.append(this.mFrame);
        sb2.append(",\n");
        if (this.mPositionType != null) {
            sb2.append("type:'");
            sb2.append(this.mPositionType);
            sb2.append("',\n");
        }
        append(sb2, "easing", this.mTransitionEasing);
        append(sb2, "percentX", this.mPercentX);
        append(sb2, "percentY", this.mPercentY);
        append(sb2, "percentWidth", this.mPercentWidth);
        append(sb2, "percentHeight", this.mPercentHeight);
        sb2.append("},\n");
        return sb2.toString();
    }
}
