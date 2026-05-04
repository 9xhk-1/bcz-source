package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnapshotStateExtensionsKt {
    @Stable
    @k
    public static final DoubleState asDoubleState(@k State<Double> state) {
        return state instanceof DoubleState ? (DoubleState) state : new UnboxedDoubleState(state);
    }

    @Stable
    @k
    public static final FloatState asFloatState(@k State<Float> state) {
        return state instanceof FloatState ? (FloatState) state : new UnboxedFloatState(state);
    }

    @Stable
    @k
    public static final IntState asIntState(@k State<Integer> state) {
        return state instanceof IntState ? (IntState) state : new UnboxedIntState(state);
    }

    @Stable
    @k
    public static final LongState asLongState(@k State<Long> state) {
        return state instanceof LongState ? (LongState) state : new UnboxedLongState(state);
    }
}
