package androidx.compose.ui.tooling.animation;

import a00.v1;
import androidx.compose.animation.core.InfiniteTransition;
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
@u0({"SMAP\nInfiniteTransitionComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,65:1\n12474#2,2:66\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n*L\n49#1:66,2\n*E\n"})
/* loaded from: classes2.dex */
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    private static boolean apiAvailable;

    @k
    private final InfiniteTransition animationObject;

    @k
    private final String label;

    @k
    private final Set<Object> states;

    @k
    private final ToolingState<Long> toolingState;

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
            return InfiniteTransitionComposeAnimation.apiAvailable;
        }

        @l
        public final InfiniteTransitionComposeAnimation parse$ui_tooling_release(@k AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
            v vVar = null;
            if (getApiAvailable()) {
                return new InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo.getToolingState(), infiniteTransitionSearchInfo.getInfiniteTransition(), vVar);
            }
            return null;
        }

        @o
        public final void testOverrideAvailability(boolean z11) {
            InfiniteTransitionComposeAnimation.apiAvailable = z11;
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
            if (g0.g(values[i11].name(), "INFINITE_TRANSITION")) {
                z11 = true;
                break;
            }
            i11++;
        }
        apiAvailable = z11;
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(ToolingState toolingState, InfiniteTransition infiniteTransition, v vVar) {
        this(toolingState, infiniteTransition);
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
    public ComposeAnimationType getType() {
        return this.type;
    }

    public final void setTimeNanos(long j11) {
        this.toolingState.setValue(Long.valueOf(j11));
    }

    private InfiniteTransitionComposeAnimation(ToolingState<Long> toolingState, InfiniteTransition infiniteTransition) {
        this.toolingState = toolingState;
        this.animationObject = infiniteTransition;
        this.type = ComposeAnimationType.INFINITE_TRANSITION;
        this.states = v1.f(0);
        this.label = m5040getAnimationObject().getLabel();
    }

    @k
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public InfiniteTransition m5040getAnimationObject() {
        return this.animationObject;
    }
}
