package androidx.compose.ui.tooling.animation;

import a00.w1;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUnsupportedComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n12474#2,2:50\n*S KotlinDebug\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n*L\n37#1:50,2\n*E\n"})
/* loaded from: classes2.dex */
public final class UnsupportedComposeAnimation implements ComposeAnimation {
    private static boolean apiAvailable;

    @k
    private final Object animationObject;

    @l
    private final String label;

    @k
    private final Set<Integer> states;

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

        @l
        public final UnsupportedComposeAnimation create(@l String str) {
            v vVar = null;
            if (getApiAvailable()) {
                return new UnsupportedComposeAnimation(str, vVar);
            }
            return null;
        }

        public final boolean getApiAvailable() {
            return UnsupportedComposeAnimation.apiAvailable;
        }

        @o
        public final void testOverrideAvailability(boolean z11) {
            UnsupportedComposeAnimation.apiAvailable = z11;
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
            if (g0.g(values[i11].name(), "UNSUPPORTED")) {
                z11 = true;
                break;
            }
            i11++;
        }
        apiAvailable = z11;
    }

    public /* synthetic */ UnsupportedComposeAnimation(String str, v vVar) {
        this(str);
    }

    @k
    public Object getAnimationObject() {
        return this.animationObject;
    }

    @l
    public String getLabel() {
        return this.label;
    }

    @k
    public Set<Integer> getStates() {
        return this.states;
    }

    @k
    public ComposeAnimationType getType() {
        return this.type;
    }

    private UnsupportedComposeAnimation(String str) {
        this.label = str;
        this.type = ComposeAnimationType.UNSUPPORTED;
        this.animationObject = 0;
        this.states = w1.k();
    }
}
