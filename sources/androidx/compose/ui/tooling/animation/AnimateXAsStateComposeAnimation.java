package androidx.compose.ui.tooling.animation;

import a00.a0;
import a00.v1;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimateXAsStateComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n1#2:73\n12474#3,2:74\n*S KotlinDebug\n*F\n+ 1 AnimateXAsStateComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n*L\n54#1:74,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimateXAsStateComposeAnimation<T, V extends AnimationVector> implements ComposeAnimation {
    private static boolean apiAvailable;

    @k
    private final Animatable<T, V> animationObject;

    @k
    private final AnimationSpec<T> animationSpec;

    @k
    private final String label;

    @k
    private final Set<Object> states;

    @k
    private final ToolingState<T> toolingState;

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
            return AnimateXAsStateComposeAnimation.apiAvailable;
        }

        @l
        public final <T, V extends AnimationVector> AnimateXAsStateComposeAnimation<?, ?> parse$ui_tooling_release(@k AnimationSearch.AnimateXAsStateSearchInfo<T, V> animateXAsStateSearchInfo) {
            v vVar = null;
            if (getApiAvailable() && animateXAsStateSearchInfo.getAnimatable().getValue() != null) {
                return new AnimateXAsStateComposeAnimation<>(animateXAsStateSearchInfo.getToolingState(), animateXAsStateSearchInfo.getAnimationSpec(), animateXAsStateSearchInfo.getAnimatable(), vVar);
            }
            return null;
        }

        @o
        public final void testOverrideAvailability(boolean z11) {
            AnimateXAsStateComposeAnimation.apiAvailable = z11;
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
            if (g0.g(values[i11].name(), "ANIMATE_X_AS_STATE")) {
                z11 = true;
                break;
            }
            i11++;
        }
        apiAvailable = z11;
    }

    public /* synthetic */ AnimateXAsStateComposeAnimation(ToolingState toolingState, AnimationSpec animationSpec, Animatable animatable, v vVar) {
        this(toolingState, animationSpec, animatable);
    }

    @k
    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
    }

    @k
    public String getLabel() {
        return this.label;
    }

    @k
    public Set<Object> getStates() {
        return this.states;
    }

    @k
    public final ToolingState<T> getToolingState() {
        return this.toolingState;
    }

    @k
    public ComposeAnimationType getType() {
        return this.type;
    }

    public final void setState(@k Object obj) {
        this.toolingState.setValue(obj);
    }

    private AnimateXAsStateComposeAnimation(ToolingState<T> toolingState, AnimationSpec<T> animationSpec, Animatable<T, V> animatable) {
        Set<Object> Fz;
        this.toolingState = toolingState;
        this.animationSpec = animationSpec;
        this.animationObject = animatable;
        this.type = ComposeAnimationType.ANIMATE_X_AS_STATE;
        T value = m5037getAnimationObject().getValue();
        g0.n(value, "null cannot be cast to non-null type kotlin.Any");
        Object[] enumConstants = value.getClass().getEnumConstants();
        this.states = (enumConstants == null || (Fz = a0.Fz(enumConstants)) == null) ? v1.f(value) : Fz;
        this.label = m5037getAnimationObject().getLabel();
    }

    @k
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Animatable<T, V> m5037getAnimationObject() {
        return this.animationObject;
    }
}
