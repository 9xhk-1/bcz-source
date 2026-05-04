package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class SwipeDirection {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final SwipeDirection Up = new SwipeDirection("up");

    @k
    private static final SwipeDirection Down = new SwipeDirection("down");

    @k
    private static final SwipeDirection Left = new SwipeDirection(TtmlNode.LEFT);

    @k
    private static final SwipeDirection Right = new SwipeDirection(TtmlNode.RIGHT);

    @k
    private static final SwipeDirection Start = new SwipeDirection(TtmlNode.START);

    @k
    private static final SwipeDirection End = new SwipeDirection(TtmlNode.END);

    @k
    private static final SwipeDirection Clockwise = new SwipeDirection("clockwise");

    @k
    private static final SwipeDirection Counterclockwise = new SwipeDirection("anticlockwise");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final SwipeDirection getClockwise() {
            return SwipeDirection.Clockwise;
        }

        @k
        public final SwipeDirection getCounterclockwise() {
            return SwipeDirection.Counterclockwise;
        }

        @k
        public final SwipeDirection getDown() {
            return SwipeDirection.Down;
        }

        @k
        public final SwipeDirection getEnd() {
            return SwipeDirection.End;
        }

        @k
        public final SwipeDirection getLeft() {
            return SwipeDirection.Left;
        }

        @k
        public final SwipeDirection getRight() {
            return SwipeDirection.Right;
        }

        @k
        public final SwipeDirection getStart() {
            return SwipeDirection.Start;
        }

        @k
        public final SwipeDirection getUp() {
            return SwipeDirection.Up;
        }

        private Companion() {
        }
    }

    public SwipeDirection(@k String str) {
        this.name = str;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
