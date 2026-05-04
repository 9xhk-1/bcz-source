package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyPositions extends Keys {
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing = null;
    private Type mPositionType = null;
    private float[] mPercentWidth = null;
    private float[] mPercentHeight = null;
    private float[] mPercentX = null;
    private float[] mPercentY = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPositions(int i11, String... strArr) {
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

    public int[] getFrames() {
        return this.mFrames;
    }

    public float[] getPercentHeight() {
        return this.mPercentHeight;
    }

    public float[] getPercentWidth() {
        return this.mPercentWidth;
    }

    public float[] getPercentX() {
        return this.mPercentX;
    }

    public float[] getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int... iArr) {
        this.mFrames = iArr;
    }

    public void setPercentHeight(float... fArr) {
        this.mPercentHeight = fArr;
    }

    public void setPercentWidth(float... fArr) {
        this.mPercentWidth = fArr;
    }

    public void setPercentX(float... fArr) {
        this.mPercentX = fArr;
    }

    public void setPercentY(float... fArr) {
        this.mPercentY = fArr;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPositions:{\n");
        append(sb2, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sb2.append("frame:");
        sb2.append(Arrays.toString(this.mFrames));
        sb2.append(",\n");
        if (this.mPositionType != null) {
            sb2.append("type:'");
            sb2.append(this.mPositionType);
            sb2.append("',\n");
        }
        append(sb2, "easing", this.mTransitionEasing);
        append(sb2, "percentX", this.mPercentX);
        append(sb2, "percentX", this.mPercentY);
        append(sb2, "percentWidth", this.mPercentWidth);
        append(sb2, "percentHeight", this.mPercentHeight);
        sb2.append("},\n");
        return sb2.toString();
    }
}
