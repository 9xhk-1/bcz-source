package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Cancel implements PressInteraction {
        public static final int $stable = 0;

        @k
        private final Press press;

        public Cancel(@k Press press) {
            this.press = press;
        }

        @k
        public final Press getPress() {
            return this.press;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Press implements PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        public /* synthetic */ Press(long j11, v vVar) {
            this(j11);
        }

        /* renamed from: getPressPosition-F1C5BW0, reason: not valid java name */
        public final long m548getPressPositionF1C5BW0() {
            return this.pressPosition;
        }

        private Press(long j11) {
            this.pressPosition = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Release implements PressInteraction {
        public static final int $stable = 0;

        @k
        private final Press press;

        public Release(@k Press press) {
            this.press = press;
        }

        @k
        public final Press getPress() {
            return this.press;
        }
    }
}
