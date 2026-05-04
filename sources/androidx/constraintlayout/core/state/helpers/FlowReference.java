package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class FlowReference extends HelperReference {
    protected float mFirstHorizontalBias;
    protected int mFirstHorizontalStyle;
    protected float mFirstVerticalBias;
    protected int mFirstVerticalStyle;
    protected Flow mFlow;
    protected int mHorizontalAlign;
    protected int mHorizontalGap;
    protected int mHorizontalStyle;
    protected float mLastHorizontalBias;
    protected int mLastHorizontalStyle;
    protected float mLastVerticalBias;
    protected int mLastVerticalStyle;
    protected HashMap<String, Float> mMapPostMargin;
    protected HashMap<String, Float> mMapPreMargin;
    protected HashMap<String, Float> mMapWeights;
    protected int mMaxElementsWrap;
    protected int mOrientation;
    protected int mPaddingBottom;
    protected int mPaddingLeft;
    protected int mPaddingRight;
    protected int mPaddingTop;
    protected int mVerticalAlign;
    protected int mVerticalGap;
    protected int mVerticalStyle;
    protected int mWrapMode;

    public FlowReference(State state, State.Helper helper) {
        super(state, helper);
        this.mWrapMode = 0;
        this.mVerticalStyle = -1;
        this.mFirstVerticalStyle = -1;
        this.mLastVerticalStyle = -1;
        this.mHorizontalStyle = -1;
        this.mFirstHorizontalStyle = -1;
        this.mLastHorizontalStyle = -1;
        this.mVerticalAlign = 2;
        this.mHorizontalAlign = 2;
        this.mVerticalGap = 0;
        this.mHorizontalGap = 0;
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mMaxElementsWrap = -1;
        this.mOrientation = 0;
        this.mFirstVerticalBias = 0.5f;
        this.mLastVerticalBias = 0.5f;
        this.mFirstHorizontalBias = 0.5f;
        this.mLastHorizontalBias = 0.5f;
        if (helper == State.Helper.VERTICAL_FLOW) {
            this.mOrientation = 1;
        }
    }

    public void addFlowElement(String str, float f11, float f12, float f13) {
        super.add(str);
        if (!Float.isNaN(f11)) {
            if (this.mMapWeights == null) {
                this.mMapWeights = new HashMap<>();
            }
            this.mMapWeights.put(str, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            if (this.mMapPreMargin == null) {
                this.mMapPreMargin = new HashMap<>();
            }
            this.mMapPreMargin.put(str, Float.valueOf(f12));
        }
        if (Float.isNaN(f13)) {
            return;
        }
        if (this.mMapPostMargin == null) {
            this.mMapPostMargin = new HashMap<>();
        }
        this.mMapPostMargin.put(str, Float.valueOf(f13));
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        setConstraintWidget(this.mFlow);
        this.mFlow.setOrientation(this.mOrientation);
        this.mFlow.setWrapMode(this.mWrapMode);
        int i11 = this.mMaxElementsWrap;
        if (i11 != -1) {
            this.mFlow.setMaxElementsWrap(i11);
        }
        int i12 = this.mPaddingLeft;
        if (i12 != 0) {
            this.mFlow.setPaddingLeft(i12);
        }
        int i13 = this.mPaddingTop;
        if (i13 != 0) {
            this.mFlow.setPaddingTop(i13);
        }
        int i14 = this.mPaddingRight;
        if (i14 != 0) {
            this.mFlow.setPaddingRight(i14);
        }
        int i15 = this.mPaddingBottom;
        if (i15 != 0) {
            this.mFlow.setPaddingBottom(i15);
        }
        int i16 = this.mHorizontalGap;
        if (i16 != 0) {
            this.mFlow.setHorizontalGap(i16);
        }
        int i17 = this.mVerticalGap;
        if (i17 != 0) {
            this.mFlow.setVerticalGap(i17);
        }
        float f11 = this.mHorizontalBias;
        if (f11 != 0.5f) {
            this.mFlow.setHorizontalBias(f11);
        }
        float f12 = this.mFirstHorizontalBias;
        if (f12 != 0.5f) {
            this.mFlow.setFirstHorizontalBias(f12);
        }
        float f13 = this.mLastHorizontalBias;
        if (f13 != 0.5f) {
            this.mFlow.setLastHorizontalBias(f13);
        }
        float f14 = this.mVerticalBias;
        if (f14 != 0.5f) {
            this.mFlow.setVerticalBias(f14);
        }
        float f15 = this.mFirstVerticalBias;
        if (f15 != 0.5f) {
            this.mFlow.setFirstVerticalBias(f15);
        }
        float f16 = this.mLastVerticalBias;
        if (f16 != 0.5f) {
            this.mFlow.setLastVerticalBias(f16);
        }
        int i18 = this.mHorizontalAlign;
        if (i18 != 2) {
            this.mFlow.setHorizontalAlign(i18);
        }
        int i19 = this.mVerticalAlign;
        if (i19 != 2) {
            this.mFlow.setVerticalAlign(i19);
        }
        int i21 = this.mVerticalStyle;
        if (i21 != -1) {
            this.mFlow.setVerticalStyle(i21);
        }
        int i22 = this.mFirstVerticalStyle;
        if (i22 != -1) {
            this.mFlow.setFirstVerticalStyle(i22);
        }
        int i23 = this.mLastVerticalStyle;
        if (i23 != -1) {
            this.mFlow.setLastVerticalStyle(i23);
        }
        int i24 = this.mHorizontalStyle;
        if (i24 != -1) {
            this.mFlow.setHorizontalStyle(i24);
        }
        int i25 = this.mFirstHorizontalStyle;
        if (i25 != -1) {
            this.mFlow.setFirstHorizontalStyle(i25);
        }
        int i26 = this.mLastHorizontalStyle;
        if (i26 != -1) {
            this.mFlow.setLastHorizontalStyle(i26);
        }
        applyBase();
    }

    public float getFirstHorizontalBias() {
        return this.mFirstHorizontalBias;
    }

    public int getFirstHorizontalStyle() {
        return this.mFirstHorizontalStyle;
    }

    public float getFirstVerticalBias() {
        return this.mFirstVerticalBias;
    }

    public int getFirstVerticalStyle() {
        return this.mFirstVerticalStyle;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.mFlow == null) {
            this.mFlow = new Flow();
        }
        return this.mFlow;
    }

    public int getHorizontalAlign() {
        return this.mHorizontalAlign;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public int getHorizontalGap() {
        return this.mHorizontalGap;
    }

    public int getHorizontalStyle() {
        return this.mHorizontalStyle;
    }

    public float getLastHorizontalBias() {
        return this.mLastHorizontalBias;
    }

    public int getLastHorizontalStyle() {
        return this.mLastHorizontalStyle;
    }

    public float getLastVerticalBias() {
        return this.mLastVerticalBias;
    }

    public int getLastVerticalStyle() {
        return this.mLastVerticalStyle;
    }

    public int getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public float getPostMargin(String str) {
        HashMap<String, Float> hashMap = this.mMapPreMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreMargin.get(str).floatValue();
    }

    public float getPreMargin(String str) {
        HashMap<String, Float> hashMap = this.mMapPostMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostMargin.get(str).floatValue();
    }

    public int getVerticalAlign() {
        return this.mVerticalAlign;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public int getVerticalGap() {
        return this.mVerticalGap;
    }

    public int getVerticalStyle() {
        return this.mVerticalStyle;
    }

    public float getWeight(String str) {
        HashMap<String, Float> hashMap = this.mMapWeights;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    public int getWrapMode() {
        return this.mWrapMode;
    }

    public void setFirstHorizontalBias(float f11) {
        this.mFirstHorizontalBias = f11;
    }

    public void setFirstHorizontalStyle(int i11) {
        this.mFirstHorizontalStyle = i11;
    }

    public void setFirstVerticalBias(float f11) {
        this.mFirstVerticalBias = f11;
    }

    public void setFirstVerticalStyle(int i11) {
        this.mFirstVerticalStyle = i11;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(HelperWidget helperWidget) {
        if (helperWidget instanceof Flow) {
            this.mFlow = (Flow) helperWidget;
        } else {
            this.mFlow = null;
        }
    }

    public void setHorizontalAlign(int i11) {
        this.mHorizontalAlign = i11;
    }

    public void setHorizontalGap(int i11) {
        this.mHorizontalGap = i11;
    }

    public void setHorizontalStyle(int i11) {
        this.mHorizontalStyle = i11;
    }

    public void setLastHorizontalBias(float f11) {
        this.mLastHorizontalBias = f11;
    }

    public void setLastHorizontalStyle(int i11) {
        this.mLastHorizontalStyle = i11;
    }

    public void setLastVerticalBias(float f11) {
        this.mLastVerticalBias = f11;
    }

    public void setLastVerticalStyle(int i11) {
        this.mLastVerticalStyle = i11;
    }

    public void setMaxElementsWrap(int i11) {
        this.mMaxElementsWrap = i11;
    }

    public void setOrientation(int i11) {
        this.mOrientation = i11;
    }

    public void setPaddingBottom(int i11) {
        this.mPaddingBottom = i11;
    }

    public void setPaddingLeft(int i11) {
        this.mPaddingLeft = i11;
    }

    public void setPaddingRight(int i11) {
        this.mPaddingRight = i11;
    }

    public void setPaddingTop(int i11) {
        this.mPaddingTop = i11;
    }

    public void setVerticalAlign(int i11) {
        this.mVerticalAlign = i11;
    }

    public void setVerticalGap(int i11) {
        this.mVerticalGap = i11;
    }

    public void setVerticalStyle(int i11) {
        this.mVerticalStyle = i11;
    }

    public void setWrapMode(int i11) {
        this.mWrapMode = i11;
    }
}
