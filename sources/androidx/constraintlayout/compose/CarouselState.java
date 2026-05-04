package androidx.constraintlayout.compose;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class CarouselState {
    private boolean animating;

    @k
    private MotionCarouselDirection direction;
    private int index;
    private boolean snapping;
    private int targetIndex;

    public CarouselState(@k MotionCarouselDirection motionCarouselDirection, int i11, int i12, boolean z11, boolean z12) {
        this.direction = motionCarouselDirection;
        this.index = i11;
        this.targetIndex = i12;
        this.snapping = z11;
        this.animating = z12;
    }

    public static /* synthetic */ CarouselState copy$default(CarouselState carouselState, MotionCarouselDirection motionCarouselDirection, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            motionCarouselDirection = carouselState.direction;
        }
        if ((i13 & 2) != 0) {
            i11 = carouselState.index;
        }
        if ((i13 & 4) != 0) {
            i12 = carouselState.targetIndex;
        }
        if ((i13 & 8) != 0) {
            z11 = carouselState.snapping;
        }
        if ((i13 & 16) != 0) {
            z12 = carouselState.animating;
        }
        boolean z13 = z12;
        int i14 = i12;
        return carouselState.copy(motionCarouselDirection, i11, i14, z11, z13);
    }

    @k
    public final MotionCarouselDirection component1() {
        return this.direction;
    }

    public final int component2() {
        return this.index;
    }

    public final int component3() {
        return this.targetIndex;
    }

    public final boolean component4() {
        return this.snapping;
    }

    public final boolean component5() {
        return this.animating;
    }

    @k
    public final CarouselState copy(@k MotionCarouselDirection motionCarouselDirection, int i11, int i12, boolean z11, boolean z12) {
        return new CarouselState(motionCarouselDirection, i11, i12, z11, z12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselState)) {
            return false;
        }
        CarouselState carouselState = (CarouselState) obj;
        return this.direction == carouselState.direction && this.index == carouselState.index && this.targetIndex == carouselState.targetIndex && this.snapping == carouselState.snapping && this.animating == carouselState.animating;
    }

    public final boolean getAnimating() {
        return this.animating;
    }

    @k
    public final MotionCarouselDirection getDirection() {
        return this.direction;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getSnapping() {
        return this.snapping;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public int hashCode() {
        return (((((((this.direction.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.targetIndex)) * 31) + Boolean.hashCode(this.snapping)) * 31) + Boolean.hashCode(this.animating);
    }

    public final void setAnimating(boolean z11) {
        this.animating = z11;
    }

    public final void setDirection(@k MotionCarouselDirection motionCarouselDirection) {
        this.direction = motionCarouselDirection;
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    public final void setSnapping(boolean z11) {
        this.snapping = z11;
    }

    public final void setTargetIndex(int i11) {
        this.targetIndex = i11;
    }

    @k
    public String toString() {
        return "CarouselState(direction=" + this.direction + ", index=" + this.index + ", targetIndex=" + this.targetIndex + ", snapping=" + this.snapping + ", animating=" + this.animating + ')';
    }
}
