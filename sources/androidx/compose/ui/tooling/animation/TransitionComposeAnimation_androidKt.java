package androidx.compose.ui.tooling.animation;

import a00.a0;
import a00.v1;
import androidx.compose.animation.core.Transition;
import java.util.Set;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TransitionComposeAnimation_androidKt {
    @l
    public static final TransitionComposeAnimation<?> parse(@k Transition<?> transition) {
        Set f11;
        Object currentState = transition.getCurrentState();
        if (currentState == null) {
            return null;
        }
        Object[] enumConstants = currentState.getClass().getEnumConstants();
        if (enumConstants == null || (f11 = a0.Fz(enumConstants)) == null) {
            f11 = v1.f(currentState);
        }
        String label = transition.getLabel();
        if (label == null) {
            label = o0.d(currentState.getClass()).C();
        }
        return new TransitionComposeAnimation<>(transition, f11, label);
    }
}
