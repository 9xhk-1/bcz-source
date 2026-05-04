package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ChainReference extends HelperReference {
    protected float mBias;
    private HashMap<String, Float> mMapPostGoneMargin;

    @NonNull
    @Deprecated
    protected HashMap<String, Float> mMapPostMargin;
    private HashMap<String, Float> mMapPreGoneMargin;

    @NonNull
    @Deprecated
    protected HashMap<String, Float> mMapPreMargin;

    @NonNull
    @Deprecated
    protected HashMap<String, Float> mMapWeights;

    @NonNull
    protected State.Chain mStyle;

    public ChainReference(@NonNull State state, @NonNull State.Helper helper) {
        super(state, helper);
        this.mBias = 0.5f;
        this.mMapWeights = new HashMap<>();
        this.mMapPreMargin = new HashMap<>();
        this.mMapPostMargin = new HashMap<>();
        this.mStyle = State.Chain.SPREAD;
    }

    public void addChainElement(@NonNull String str, float f11, float f12, float f13) {
        addChainElement(str, f11, f12, f13, 0.0f, 0.0f);
    }

    public float getBias() {
        return this.mBias;
    }

    public float getPostGoneMargin(@NonNull String str) {
        HashMap<String, Float> hashMap = this.mMapPostGoneMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostGoneMargin.get(str).floatValue();
    }

    public float getPostMargin(@NonNull String str) {
        if (this.mMapPostMargin.containsKey(str)) {
            return this.mMapPostMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    public float getPreGoneMargin(@NonNull String str) {
        HashMap<String, Float> hashMap = this.mMapPreGoneMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreGoneMargin.get(str).floatValue();
    }

    public float getPreMargin(@NonNull String str) {
        if (this.mMapPreMargin.containsKey(str)) {
            return this.mMapPreMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    @NonNull
    public State.Chain getStyle() {
        return State.Chain.SPREAD;
    }

    public float getWeight(@NonNull String str) {
        if (this.mMapWeights.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    @NonNull
    public ChainReference style(@NonNull State.Chain chain) {
        this.mStyle = chain;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void addChainElement(@NonNull Object obj, float f11, float f12, float f13, float f14, float f15) {
        super.add(obj);
        String obj2 = obj.toString();
        if (!Float.isNaN(f11)) {
            this.mMapWeights.put(obj2, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            this.mMapPreMargin.put(obj2, Float.valueOf(f12));
        }
        if (!Float.isNaN(f13)) {
            this.mMapPostMargin.put(obj2, Float.valueOf(f13));
        }
        if (!Float.isNaN(f14)) {
            if (this.mMapPreGoneMargin == null) {
                this.mMapPreGoneMargin = new HashMap<>();
            }
            this.mMapPreGoneMargin.put(obj2, Float.valueOf(f14));
        }
        if (Float.isNaN(f15)) {
            return;
        }
        if (this.mMapPostGoneMargin == null) {
            this.mMapPostGoneMargin = new HashMap<>();
        }
        this.mMapPostGoneMargin.put(obj2, Float.valueOf(f15));
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    @NonNull
    public ChainReference bias(float f11) {
        this.mBias = f11;
        return this;
    }
}
