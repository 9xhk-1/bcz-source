package androidx.compose.ui.tooling.animation;

import a00.a0;
import a00.v1;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimatedContentComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContentComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n12474#2,2:64\n*S KotlinDebug\n*F\n+ 1 AnimatedContentComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n*L\n40#1:64,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimatedContentComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    private static boolean apiAvailable;

    @k
    private final Transition<T> animationObject;

    @l
    private final String label;

    @k
    private final Set<Object> states;

    @k
    private final ComposeAnimationType type;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public final boolean getApiAvailable() {
            return AnimatedContentComposeAnimation.apiAvailable;
        }

        @l
        public final AnimatedContentComposeAnimation<?> parseAnimatedContent(@k Transition<?> transition) {
            Object currentState;
            Set f11;
            v vVar = null;
            if (!getApiAvailable() || (currentState = transition.getCurrentState()) == null) {
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
            return new AnimatedContentComposeAnimation<>(transition, f11, label, vVar);
        }

        @o
        public final void testOverrideAvailability(boolean z11) {
            AnimatedContentComposeAnimation.apiAvailable = z11;
        }

        private Companion() {
        }
    }

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (g0.g(values[i11].name(), "ANIMATED_CONTENT")) {
                z11 = true;
                break;
            }
            i11++;
        }
        apiAvailable = z11;
    }

    public /* synthetic */ AnimatedContentComposeAnimation(Transition transition, Set set, String str, v vVar) {
        this(transition, set, str);
    }

    @l
    public String getLabel() {
        return this.label;
    }

    @k
    public Set<Object> getStates() {
        return this.states;
    }

    @k
    public ComposeAnimationType getType() {
        return this.type;
    }

    private AnimatedContentComposeAnimation(Transition<T> transition, Set<? extends Object> set, String str) {
        this.animationObject = transition;
        this.states = set;
        this.label = str;
        this.type = ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    @k
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Transition<T> m5038getAnimationObject() {
        return this.animationObject;
    }
}
