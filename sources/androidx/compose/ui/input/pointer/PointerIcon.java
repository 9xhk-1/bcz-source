package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface PointerIcon {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final PointerIcon Default = PointerIcon_androidKt.getPointerIconDefault();

        @k
        private static final PointerIcon Crosshair = PointerIcon_androidKt.getPointerIconCrosshair();

        @k
        private static final PointerIcon Text = PointerIcon_androidKt.getPointerIconText();

        @k
        private static final PointerIcon Hand = PointerIcon_androidKt.getPointerIconHand();

        private Companion() {
        }

        @k
        public final PointerIcon getCrosshair() {
            return Crosshair;
        }

        @k
        public final PointerIcon getDefault() {
            return Default;
        }

        @k
        public final PointerIcon getHand() {
            return Hand;
        }

        @k
        public final PointerIcon getText() {
            return Text;
        }
    }
}
