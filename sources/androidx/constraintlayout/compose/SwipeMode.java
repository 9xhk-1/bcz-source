package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class SwipeMode {
    public static final int $stable = 0;

    @k
    public static final Companion Companion;

    @k
    private static final SwipeMode Spring;

    @k
    private static final SwipeMode Velocity;
    private final float maxAcceleration;
    private final float maxVelocity;

    @k
    private final String name;

    @k
    private final SpringBoundary springBoundary;
    private final float springDamping;
    private final float springMass;
    private final float springStiffness;
    private final float springThreshold;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public static /* synthetic */ SwipeMode spring$default(Companion companion, float f11, float f12, float f13, float f14, SpringBoundary springBoundary, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = 1.0f;
            }
            if ((i11 & 2) != 0) {
                f12 = 400.0f;
            }
            if ((i11 & 4) != 0) {
                f13 = 10.0f;
            }
            if ((i11 & 8) != 0) {
                f14 = 0.01f;
            }
            if ((i11 & 16) != 0) {
                springBoundary = SpringBoundary.Companion.getOvershoot();
            }
            SpringBoundary springBoundary2 = springBoundary;
            float f15 = f13;
            return companion.spring(f11, f12, f15, f14, springBoundary2);
        }

        public static /* synthetic */ SwipeMode velocity$default(Companion companion, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = 4.0f;
            }
            if ((i11 & 2) != 0) {
                f12 = 1.2f;
            }
            return companion.velocity(f11, f12);
        }

        @k
        public final SwipeMode getSpring() {
            return SwipeMode.Spring;
        }

        @k
        public final SwipeMode getVelocity() {
            return SwipeMode.Velocity;
        }

        @k
        public final SwipeMode spring(float f11, float f12, float f13, float f14, @k SpringBoundary springBoundary) {
            return new SwipeMode("spring", f11, f12, f13, f14, springBoundary, 0.0f, 0.0f, 192, null);
        }

        @k
        public final SwipeMode velocity(float f11, float f12) {
            return new SwipeMode("velocity", 0.0f, 0.0f, 0.0f, 0.0f, null, f11, f12, 62, null);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        Velocity = Companion.velocity$default(companion, 0.0f, 0.0f, 3, null);
        Spring = Companion.spring$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, null, 31, null);
    }

    public SwipeMode(@k String str, float f11, float f12, float f13, float f14, @k SpringBoundary springBoundary, float f15, float f16) {
        this.name = str;
        this.springMass = f11;
        this.springStiffness = f12;
        this.springDamping = f13;
        this.springThreshold = f14;
        this.springBoundary = springBoundary;
        this.maxVelocity = f15;
        this.maxAcceleration = f16;
    }

    public final float getMaxAcceleration$constraintlayout_compose_release() {
        return this.maxAcceleration;
    }

    public final float getMaxVelocity$constraintlayout_compose_release() {
        return this.maxVelocity;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final SpringBoundary getSpringBoundary$constraintlayout_compose_release() {
        return this.springBoundary;
    }

    public final float getSpringDamping$constraintlayout_compose_release() {
        return this.springDamping;
    }

    public final float getSpringMass$constraintlayout_compose_release() {
        return this.springMass;
    }

    public final float getSpringStiffness$constraintlayout_compose_release() {
        return this.springStiffness;
    }

    public final float getSpringThreshold$constraintlayout_compose_release() {
        return this.springThreshold;
    }

    public /* synthetic */ SwipeMode(String str, float f11, float f12, float f13, float f14, SpringBoundary springBoundary, float f15, float f16, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) != 0 ? 400.0f : f12, (i11 & 8) != 0 ? 10.0f : f13, (i11 & 16) != 0 ? 0.01f : f14, (i11 & 32) != 0 ? SpringBoundary.Companion.getOvershoot() : springBoundary, (i11 & 64) != 0 ? 4.0f : f15, (i11 & 128) != 0 ? 1.2f : f16);
    }
}
