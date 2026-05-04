package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.SwipeMode;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class OnSwipe {
    public static final int $stable = 0;

    @k
    private final ConstrainedLayoutReference anchor;

    @k
    private final SwipeDirection direction;

    @l
    private final ConstrainedLayoutReference dragAround;
    private final float dragScale;
    private final float dragThreshold;

    @l
    private final ConstrainedLayoutReference limitBoundsTo;

    @k
    private final SwipeMode mode;

    @k
    private final SwipeTouchUp onTouchUp;

    @k
    private final SwipeSide side;

    public OnSwipe(@k ConstrainedLayoutReference constrainedLayoutReference, @k SwipeSide swipeSide, @k SwipeDirection swipeDirection, float f11, float f12, @l ConstrainedLayoutReference constrainedLayoutReference2, @l ConstrainedLayoutReference constrainedLayoutReference3, @k SwipeTouchUp swipeTouchUp, @k SwipeMode swipeMode) {
        this.anchor = constrainedLayoutReference;
        this.side = swipeSide;
        this.direction = swipeDirection;
        this.dragScale = f11;
        this.dragThreshold = f12;
        this.dragAround = constrainedLayoutReference2;
        this.limitBoundsTo = constrainedLayoutReference3;
        this.onTouchUp = swipeTouchUp;
        this.mode = swipeMode;
    }

    @k
    public final ConstrainedLayoutReference getAnchor() {
        return this.anchor;
    }

    @k
    public final SwipeDirection getDirection() {
        return this.direction;
    }

    @l
    public final ConstrainedLayoutReference getDragAround() {
        return this.dragAround;
    }

    public final float getDragScale() {
        return this.dragScale;
    }

    public final float getDragThreshold() {
        return this.dragThreshold;
    }

    @l
    public final ConstrainedLayoutReference getLimitBoundsTo() {
        return this.limitBoundsTo;
    }

    @k
    public final SwipeMode getMode() {
        return this.mode;
    }

    @k
    public final SwipeTouchUp getOnTouchUp() {
        return this.onTouchUp;
    }

    @k
    public final SwipeSide getSide() {
        return this.side;
    }

    public /* synthetic */ OnSwipe(ConstrainedLayoutReference constrainedLayoutReference, SwipeSide swipeSide, SwipeDirection swipeDirection, float f11, float f12, ConstrainedLayoutReference constrainedLayoutReference2, ConstrainedLayoutReference constrainedLayoutReference3, SwipeTouchUp swipeTouchUp, SwipeMode swipeMode, int i11, v vVar) {
        this(constrainedLayoutReference, swipeSide, swipeDirection, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? 10.0f : f12, (i11 & 32) != 0 ? null : constrainedLayoutReference2, (i11 & 64) != 0 ? null : constrainedLayoutReference3, (i11 & 128) != 0 ? SwipeTouchUp.Companion.getAutoComplete() : swipeTouchUp, (i11 & 256) != 0 ? SwipeMode.Companion.velocity$default(SwipeMode.Companion, 0.0f, 0.0f, 3, null) : swipeMode);
    }
}
