package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class BarrierReference extends HelperReference {
    private Barrier mBarrierWidget;
    private State.Direction mDirection;
    private int mMargin;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Direction;

        static {
            int[] iArr = new int[State.Direction.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Direction = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        int i11 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Direction[this.mDirection.ordinal()];
        int i12 = 3;
        if (i11 == 3 || i11 == 4) {
            i12 = 1;
        } else if (i11 == 5) {
            i12 = 2;
        } else if (i11 != 6) {
            i12 = 0;
        }
        this.mBarrierWidget.setBarrierType(i12);
        this.mBarrierWidget.setMargin(this.mMargin);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.mBarrierWidget == null) {
            this.mBarrierWidget = new Barrier();
        }
        return this.mBarrierWidget;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(Object obj) {
        margin(this.mHelperState.convertDimension(obj));
        return this;
    }

    public void setBarrierDirection(State.Direction direction) {
        this.mDirection = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(int i11) {
        this.mMargin = i11;
        return this;
    }
}
