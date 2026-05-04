package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface Alignment {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Stable
    public interface Horizontal {
        int align(int i11, int i12, @k LayoutDirection layoutDirection);

        @k
        default Alignment plus(@k Vertical vertical) {
            return new CombinedAlignment(this, vertical);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Stable
    public interface Vertical {
        int align(int i11, int i12);

        @k
        default Alignment plus(@k Horizontal horizontal) {
            return new CombinedAlignment(horizontal, this);
        }
    }

    /* renamed from: align-KFBX0sM, reason: not valid java name */
    long mo2085alignKFBX0sM(long j11, long j12, @k LayoutDirection layoutDirection);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);

        @k
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);

        @k
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);

        @k
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);

        @k
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);

        @k
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);

        @k
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);

        @k
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);

        @k
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);

        @k
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);

        @k
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);

        @k
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);

        @k
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);

        @k
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);

        @k
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        private Companion() {
        }

        @k
        public final Vertical getBottom() {
            return Bottom;
        }

        @k
        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        @k
        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        @k
        public final Alignment getBottomStart() {
            return BottomStart;
        }

        @k
        public final Alignment getCenter() {
            return Center;
        }

        @k
        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        @k
        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        @k
        public final Alignment getCenterStart() {
            return CenterStart;
        }

        @k
        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        @k
        public final Horizontal getEnd() {
            return End;
        }

        @k
        public final Horizontal getStart() {
            return Start;
        }

        @k
        public final Vertical getTop() {
            return Top;
        }

        @k
        public final Alignment getTopCenter() {
            return TopCenter;
        }

        @k
        public final Alignment getTopEnd() {
            return TopEnd;
        }

        @k
        public final Alignment getTopStart() {
            return TopStart;
        }

        @Stable
        public static /* synthetic */ void getBottom$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopStart$annotations() {
        }
    }
}
