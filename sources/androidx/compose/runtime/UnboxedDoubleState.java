package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedDoubleState implements DoubleState {
    public static final int $stable = 0;

    @k
    private final State<Double> baseState;

    public UnboxedDoubleState(@k State<Double> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return this.baseState.getValue().doubleValue();
    }

    @k
    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.baseState + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    @k
    public Double getValue() {
        return this.baseState.getValue();
    }
}
