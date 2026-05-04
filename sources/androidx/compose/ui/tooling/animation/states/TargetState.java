package androidx.compose.ui.tooling.animation.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TargetState<T> implements ComposeAnimationState {
    public static final int $stable = 0;
    private final T initial;
    private final T target;

    public TargetState(T t11, T t12) {
        this.initial = t11;
        this.target = t12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetState copy$default(TargetState targetState, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = targetState.initial;
        }
        if ((i11 & 2) != 0) {
            obj2 = targetState.target;
        }
        return targetState.copy(obj, obj2);
    }

    public final T component1() {
        return this.initial;
    }

    public final T component2() {
        return this.target;
    }

    @k
    public final TargetState<T> copy(T t11, T t12) {
        return new TargetState<>(t11, t12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetState)) {
            return false;
        }
        TargetState targetState = (TargetState) obj;
        return g0.g(this.initial, targetState.initial) && g0.g(this.target, targetState.target);
    }

    public final T getInitial() {
        return this.initial;
    }

    public final T getTarget() {
        return this.target;
    }

    public int hashCode() {
        T t11 = this.initial;
        int hashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.target;
        return hashCode + (t12 != null ? t12.hashCode() : 0);
    }

    @k
    public String toString() {
        return "TargetState(initial=" + this.initial + ", target=" + this.target + ')';
    }
}
