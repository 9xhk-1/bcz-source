package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface SnapPosition {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Center implements SnapPosition {
        public static final int $stable = 0;

        @k
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i11, int i12, int i13, int i14, int i15, int i16) {
            return (((i11 - i13) - i14) / 2) - (i12 / 2);
        }

        @k
        public String toString() {
            return "Center";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class End implements SnapPosition {
        public static final int $stable = 0;

        @k
        public static final End INSTANCE = new End();

        private End() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i11, int i12, int i13, int i14, int i15, int i16) {
            return ((i11 - i13) - i14) - i12;
        }

        @k
        public String toString() {
            return "End";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Start implements SnapPosition {
        public static final int $stable = 0;

        @k
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i11, int i12, int i13, int i14, int i15, int i16) {
            return 0;
        }

        @k
        public String toString() {
            return "Start";
        }
    }

    int position(int i11, int i12, int i13, int i14, int i15, int i16);
}
