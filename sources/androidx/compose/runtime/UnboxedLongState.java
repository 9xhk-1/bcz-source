package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedLongState implements LongState {
    public static final int $stable = 0;

    @k
    private final State<Long> baseState;

    public UnboxedLongState(@k State<Long> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.LongState
    public long getLongValue() {
        return this.baseState.getValue().longValue();
    }

    @k
    public String toString() {
        return "UnboxedLongState(baseState=" + this.baseState + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    @k
    public Long getValue() {
        return this.baseState.getValue();
    }
}
