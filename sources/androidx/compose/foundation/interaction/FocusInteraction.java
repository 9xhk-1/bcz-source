package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FocusInteraction extends Interaction {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;

        @k
        private final Focus focus;

        public Unfocus(@k Focus focus) {
            this.focus = focus;
        }

        @k
        public final Focus getFocus() {
            return this.focus;
        }
    }
}
