package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class MotionKeyTimeCycle extends MotionKey {
    public static final int KEY_TYPE = 3;
    static final String NAME = "KeyTimeCycle";
    private static final String TAG = "KeyTimeCycle";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;
    private int mWaveShape = 0;
    private String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;

    public MotionKeyTimeCycle() {
        this.mType = 3;
        this.mCustom = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0089, code lost:
    
        if (r1.equals("scaleX") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle.addTimeValues(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return TypedValues.CycleType.getId(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        if (i11 == 100) {
            this.mFramePosition = i12;
            return true;
        }
        if (i11 != 421) {
            return super.setValue(i11, i12);
        }
        this.mWaveShape = i12;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo5596clone() {
        return new MotionKeyTimeCycle().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTimeCycle copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTimeCycle motionKeyTimeCycle = (MotionKeyTimeCycle) motionKey;
        this.mTransitionEasing = motionKeyTimeCycle.mTransitionEasing;
        this.mCurveFit = motionKeyTimeCycle.mCurveFit;
        this.mWaveShape = motionKeyTimeCycle.mWaveShape;
        this.mWavePeriod = motionKeyTimeCycle.mWavePeriod;
        this.mWaveOffset = motionKeyTimeCycle.mWaveOffset;
        this.mProgress = motionKeyTimeCycle.mProgress;
        this.mAlpha = motionKeyTimeCycle.mAlpha;
        this.mElevation = motionKeyTimeCycle.mElevation;
        this.mRotation = motionKeyTimeCycle.mRotation;
        this.mTransitionPathRotate = motionKeyTimeCycle.mTransitionPathRotate;
        this.mRotationX = motionKeyTimeCycle.mRotationX;
        this.mRotationY = motionKeyTimeCycle.mRotationY;
        this.mScaleX = motionKeyTimeCycle.mScaleX;
        this.mScaleY = motionKeyTimeCycle.mScaleY;
        this.mTranslationX = motionKeyTimeCycle.mTranslationX;
        this.mTranslationY = motionKeyTimeCycle.mTranslationY;
        this.mTranslationZ = motionKeyTimeCycle.mTranslationZ;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        if (i11 == 315) {
            this.mProgress = toFloat(Float.valueOf(f11));
            return true;
        }
        if (i11 == 401) {
            this.mCurveFit = toInt(Float.valueOf(f11));
            return true;
        }
        if (i11 == 403) {
            this.mAlpha = f11;
            return true;
        }
        if (i11 == 416) {
            this.mTransitionPathRotate = toFloat(Float.valueOf(f11));
            return true;
        }
        if (i11 == 423) {
            this.mWavePeriod = toFloat(Float.valueOf(f11));
            return true;
        }
        if (i11 != 424) {
            switch (i11) {
                case 304:
                    this.mTranslationX = toFloat(Float.valueOf(f11));
                    return true;
                case 305:
                    this.mTranslationY = toFloat(Float.valueOf(f11));
                    return true;
                case 306:
                    this.mTranslationZ = toFloat(Float.valueOf(f11));
                    return true;
                case 307:
                    this.mElevation = toFloat(Float.valueOf(f11));
                    return true;
                case 308:
                    this.mRotationX = toFloat(Float.valueOf(f11));
                    return true;
                case 309:
                    this.mRotationY = toFloat(Float.valueOf(f11));
                    return true;
                case 310:
                    this.mRotation = toFloat(Float.valueOf(f11));
                    return true;
                case 311:
                    this.mScaleX = toFloat(Float.valueOf(f11));
                    return true;
                case 312:
                    this.mScaleY = toFloat(Float.valueOf(f11));
                    return true;
                default:
                    return super.setValue(i11, f11);
            }
        }
        this.mWaveOffset = toFloat(Float.valueOf(f11));
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (i11 == 420) {
            this.mTransitionEasing = str;
            return true;
        }
        if (i11 != 421) {
            return super.setValue(i11, str);
        }
        this.mWaveShape = 7;
        this.mCustomWaveShape = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, boolean z11) {
        return super.setValue(i11, z11);
    }
}
