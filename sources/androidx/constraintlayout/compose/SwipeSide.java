package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class SwipeSide {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final SwipeSide Top = new SwipeSide("top");

    @k
    private static final SwipeSide Left = new SwipeSide(TtmlNode.LEFT);

    @k
    private static final SwipeSide Right = new SwipeSide(TtmlNode.RIGHT);

    @k
    private static final SwipeSide Bottom = new SwipeSide("bottom");

    @k
    private static final SwipeSide Middle = new SwipeSide("middle");

    @k
    private static final SwipeSide Start = new SwipeSide(TtmlNode.START);

    @k
    private static final SwipeSide End = new SwipeSide(TtmlNode.END);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final SwipeSide getBottom() {
            return SwipeSide.Bottom;
        }

        @k
        public final SwipeSide getEnd() {
            return SwipeSide.End;
        }

        @k
        public final SwipeSide getLeft() {
            return SwipeSide.Left;
        }

        @k
        public final SwipeSide getMiddle() {
            return SwipeSide.Middle;
        }

        @k
        public final SwipeSide getRight() {
            return SwipeSide.Right;
        }

        @k
        public final SwipeSide getStart() {
            return SwipeSide.Start;
        }

        @k
        public final SwipeSide getTop() {
            return SwipeSide.Top;
        }

        private Companion() {
        }
    }

    public SwipeSide(@k String str) {
        this.name = str;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
