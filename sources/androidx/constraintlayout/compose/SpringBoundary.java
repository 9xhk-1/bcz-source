package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class SpringBoundary {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final SpringBoundary Overshoot = new SpringBoundary("overshoot");

    @k
    private static final SpringBoundary BounceStart = new SpringBoundary("bounceStart");

    @k
    private static final SpringBoundary BounceEnd = new SpringBoundary("bounceEnd");

    @k
    private static final SpringBoundary BounceBoth = new SpringBoundary("bounceBoth");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final SpringBoundary getBounceBoth() {
            return SpringBoundary.BounceBoth;
        }

        @k
        public final SpringBoundary getBounceEnd() {
            return SpringBoundary.BounceEnd;
        }

        @k
        public final SpringBoundary getBounceStart() {
            return SpringBoundary.BounceStart;
        }

        @k
        public final SpringBoundary getOvershoot() {
            return SpringBoundary.Overshoot;
        }

        private Companion() {
        }
    }

    public SpringBoundary(@k String str) {
        this.name = str;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
