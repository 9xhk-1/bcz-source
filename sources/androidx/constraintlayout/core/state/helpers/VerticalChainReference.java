package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class VerticalChainReference extends ChainReference {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mHelperState.constraints(it.next()).clearVertical();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            ConstraintReference constraints = this.mHelperState.constraints(next);
            if (constraintReference2 == null) {
                Object obj = this.mTopToTop;
                if (obj != null) {
                    constraints.topToTop(obj).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    Object obj2 = this.mTopToBottom;
                    if (obj2 != null) {
                        constraints.topToBottom(obj2).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                    } else {
                        String obj3 = constraints.getKey().toString();
                        constraints.topToTop(State.PARENT).margin(Float.valueOf(getPreMargin(obj3))).marginGone(Float.valueOf(getPreGoneMargin(obj3)));
                    }
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                String obj4 = constraintReference.getKey().toString();
                String obj5 = constraints.getKey().toString();
                constraintReference.bottomToTop(constraints.getKey()).margin(Float.valueOf(getPostMargin(obj4))).marginGone(Float.valueOf(getPostGoneMargin(obj4)));
                constraints.topToBottom(constraintReference.getKey()).margin(Float.valueOf(getPreMargin(obj5))).marginGone(Float.valueOf(getPreGoneMargin(obj5)));
            }
            float weight = getWeight(next.toString());
            if (weight != -1.0f) {
                constraints.setVerticalChainWeight(weight);
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj6 = this.mBottomToTop;
            if (obj6 != null) {
                constraintReference.bottomToTop(obj6).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                Object obj7 = this.mBottomToBottom;
                if (obj7 != null) {
                    constraintReference.bottomToBottom(obj7).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
                } else {
                    String obj8 = constraintReference.getKey().toString();
                    constraintReference.bottomToBottom(State.PARENT).margin(Float.valueOf(getPostMargin(obj8))).marginGone(Float.valueOf(getPostGoneMargin(obj8)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f11 = this.mBias;
        if (f11 != 0.5f) {
            constraintReference2.verticalBias(f11);
        }
        int i11 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i11 == 1) {
            constraintReference2.setVerticalChainStyle(0);
        } else if (i11 == 2) {
            constraintReference2.setVerticalChainStyle(1);
        } else {
            if (i11 != 3) {
                return;
            }
            constraintReference2.setVerticalChainStyle(2);
        }
    }
}
