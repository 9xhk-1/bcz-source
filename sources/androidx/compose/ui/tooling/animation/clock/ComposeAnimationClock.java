package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ComposeAnimationClock<T extends ComposeAnimation, TState extends ComposeAnimationState> {
    static /* synthetic */ void setStateParameters$default(ComposeAnimationClock composeAnimationClock, Object obj, Object obj2, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStateParameters");
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        composeAnimationClock.setStateParameters(obj, obj2);
    }

    @k
    List<ComposeAnimatedProperty> getAnimatedProperties();

    @k
    T getAnimation();

    long getMaxDuration();

    long getMaxDurationPerIteration();

    @k
    TState getState();

    @k
    List<TransitionInfo> getTransitions(long j11);

    void setClockTime(long j11);

    void setState(@k TState tstate);

    void setStateParameters(@k Object obj, @l Object obj2);
}
