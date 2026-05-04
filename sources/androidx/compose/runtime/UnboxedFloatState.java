package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedFloatState implements FloatState {
    public static final int $stable = 0;

    @k
    private final State<Float> baseState;

    public UnboxedFloatState(@k State<Float> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return this.baseState.getValue().floatValue();
    }

    @k
    public String toString() {
        return "UnboxedFloatState(baseState=" + this.baseState + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    @k
    public Float getValue() {
        return this.baseState.getValue();
    }
}
