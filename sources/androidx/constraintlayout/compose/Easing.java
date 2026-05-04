package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class Easing implements NamedPropertyOrValue {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Easing Standard = new Easing("standard");

    @k
    private static final Easing Accelerate = new Easing("accelerate");

    @k
    private static final Easing Decelerate = new Easing("decelerate");

    @k
    private static final Easing Linear = new Easing("linear");

    @k
    private static final Easing Anticipate = new Easing("anticipate");

    @k
    private static final Easing Overshoot = new Easing("overshoot");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Easing cubic(float f11, float f12, float f13, float f14) {
            return new Easing("cubic(" + f11 + j2.O + f12 + j2.O + f13 + j2.O + f14 + ')');
        }

        @k
        public final Easing getAccelerate() {
            return Easing.Accelerate;
        }

        @k
        public final Easing getAnticipate() {
            return Easing.Anticipate;
        }

        @k
        public final Easing getDecelerate() {
            return Easing.Decelerate;
        }

        @k
        public final Easing getLinear() {
            return Easing.Linear;
        }

        @k
        public final Easing getOvershoot() {
            return Easing.Overshoot;
        }

        @k
        public final Easing getStandard() {
            return Easing.Standard;
        }

        private Companion() {
        }
    }

    public Easing(@k String str) {
        this.name = str;
    }

    @Override // androidx.constraintlayout.compose.NamedPropertyOrValue
    @k
    public String getName() {
        return this.name;
    }
}
