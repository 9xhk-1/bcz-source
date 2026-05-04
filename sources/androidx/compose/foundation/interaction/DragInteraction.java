package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DragInteraction extends Interaction {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Cancel implements DragInteraction {
        public static final int $stable = 0;

        @k
        private final Start start;

        public Cancel(@k Start start) {
            this.start = start;
        }

        @k
        public final Start getStart() {
            return this.start;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Start implements DragInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Stop implements DragInteraction {
        public static final int $stable = 0;

        @k
        private final Start start;

        public Stop(@k Start start) {
            this.start = start;
        }

        @k
        public final Start getStart() {
            return this.start;
        }
    }
}
