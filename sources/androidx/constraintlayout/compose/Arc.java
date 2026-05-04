package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class Arc {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Arc None = new Arc("none");

    @k
    private static final Arc StartVertical = new Arc("startVertical");

    @k
    private static final Arc StartHorizontal = new Arc("startHorizontal");

    @k
    private static final Arc Flip = new Arc("flip");

    @k
    private static final Arc Below = new Arc("below");

    @k
    private static final Arc Above = new Arc("above");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Arc getAbove() {
            return Arc.Above;
        }

        @k
        public final Arc getBelow() {
            return Arc.Below;
        }

        @k
        public final Arc getFlip() {
            return Arc.Flip;
        }

        @k
        public final Arc getNone() {
            return Arc.None;
        }

        @k
        public final Arc getStartHorizontal() {
            return Arc.StartHorizontal;
        }

        @k
        public final Arc getStartVertical() {
            return Arc.StartVertical;
        }

        private Companion() {
        }
    }

    public Arc(@k String str) {
        this.name = str;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
