package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class MotionKey implements TypedValues {
    public static final String ALPHA = "alpha";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String ROTATION = "rotationZ";
    public static final String ROTATION_X = "rotationX";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public HashMap<String, CustomVariable> mCustom;
    public int mFramePosition;
    int mTargetId;
    String mTargetString;
    public int mType;

    public MotionKey() {
        int i11 = UNSET;
        this.mFramePosition = i11;
        this.mTargetId = i11;
        this.mTargetString = null;
    }

    public abstract void addValues(HashMap<String, SplineSet> hashMap);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract MotionKey mo5596clone();

    public MotionKey copy(MotionKey motionKey) {
        this.mFramePosition = motionKey.mFramePosition;
        this.mTargetId = motionKey.mTargetId;
        this.mTargetString = motionKey.mTargetString;
        this.mType = motionKey.mType;
        return this;
    }

    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        return this.mFramePosition;
    }

    public boolean matches(String str) {
        String str2 = this.mTargetString;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void setCustomAttribute(String str, int i11, float f11) {
        this.mCustom.put(str, new CustomVariable(str, i11, f11));
    }

    public void setFramePosition(int i11) {
        this.mFramePosition = i11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        return false;
    }

    public MotionKey setViewId(int i11) {
        this.mTargetId = i11;
        return this;
    }

    public boolean toBoolean(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float toFloat(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int toInt(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public void setCustomAttribute(String str, int i11, int i12) {
        this.mCustom.put(str, new CustomVariable(str, i11, i12));
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, boolean z11) {
        return false;
    }

    public void setCustomAttribute(String str, int i11, boolean z11) {
        this.mCustom.put(str, new CustomVariable(str, i11, z11));
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        if (i11 != 100) {
            return false;
        }
        this.mFramePosition = i12;
        return true;
    }

    public void setCustomAttribute(String str, int i11, String str2) {
        this.mCustom.put(str, new CustomVariable(str, i11, str2));
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (i11 != 101) {
            return false;
        }
        this.mTargetString = str;
        return true;
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
    }
}
