package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class SwipeTouchUp {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final SwipeTouchUp AutoComplete = new SwipeTouchUp("autocomplete");

    @k
    private static final SwipeTouchUp ToStart = new SwipeTouchUp("toStart");

    @k
    private static final SwipeTouchUp ToEnd = new SwipeTouchUp("toEnd");

    @k
    private static final SwipeTouchUp Stop = new SwipeTouchUp("stop");

    @k
    private static final SwipeTouchUp Decelerate = new SwipeTouchUp("decelerate");

    @k
    private static final SwipeTouchUp NeverCompleteStart = new SwipeTouchUp("neverCompleteStart");

    @k
    private static final SwipeTouchUp NeverCompleteEnd = new SwipeTouchUp("neverCompleteEnd");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final SwipeTouchUp getAutoComplete() {
            return SwipeTouchUp.AutoComplete;
        }

        @k
        public final SwipeTouchUp getDecelerate() {
            return SwipeTouchUp.Decelerate;
        }

        @k
        public final SwipeTouchUp getNeverCompleteEnd() {
            return SwipeTouchUp.NeverCompleteEnd;
        }

        @k
        public final SwipeTouchUp getNeverCompleteStart() {
            return SwipeTouchUp.NeverCompleteStart;
        }

        @k
        public final SwipeTouchUp getStop() {
            return SwipeTouchUp.Stop;
        }

        @k
        public final SwipeTouchUp getToEnd() {
            return SwipeTouchUp.ToEnd;
        }

        @k
        public final SwipeTouchUp getToStart() {
            return SwipeTouchUp.ToStart;
        }

        private Companion() {
        }
    }

    public SwipeTouchUp(@k String str) {
        this.name = str;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
