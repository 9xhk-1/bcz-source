package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance = Float.NaN;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void dragTo(float f11, float f12) {
        float offset = this.this$0.getOffset();
        this.this$0.setOffset(f11);
        this.this$0.setLastVelocity(f12);
        if (Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(f11 >= offset);
    }

    public final float getDistance() {
        return this.distance;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setDistance(float f11) {
        this.distance = f11;
    }

    public final void setLeftBound(T t11) {
        this.leftBound = t11;
    }

    public final void setRightBound(T t11) {
        this.rightBound = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, java.lang.Object] */
    public final void updateBounds(boolean z11) {
        if (this.this$0.getOffset() == this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) {
            Object closestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset() + (z11 ? 1.0f : -1.0f), z11);
            T t11 = closestAnchor;
            if (closestAnchor == null) {
                t11 = this.this$0.getCurrentValue();
            }
            if (z11) {
                this.leftBound = this.this$0.getCurrentValue();
                this.rightBound = t11;
            } else {
                this.leftBound = t11;
                this.rightBound = this.this$0.getCurrentValue();
            }
        } else {
            Object closestAnchor2 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), false);
            T t12 = closestAnchor2;
            if (closestAnchor2 == null) {
                t12 = this.this$0.getCurrentValue();
            }
            Object closestAnchor3 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), true);
            T t13 = closestAnchor3;
            if (closestAnchor3 == null) {
                t13 = this.this$0.getCurrentValue();
            }
            this.leftBound = t12;
            this.rightBound = t13;
        }
        DraggableAnchors anchors = this.this$0.getAnchors();
        T t14 = this.leftBound;
        g0.m(t14);
        float positionOf = anchors.positionOf(t14);
        DraggableAnchors anchors2 = this.this$0.getAnchors();
        T t15 = this.rightBound;
        g0.m(t15);
        this.distance = Math.abs(positionOf - anchors2.positionOf(t15));
    }

    public final void updateIfNeeded(boolean z11) {
        updateBounds(z11);
        if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) >= this.distance / 2.0f) {
            Object obj = z11 ? this.rightBound : this.leftBound;
            if (obj == null) {
                obj = this.this$0.getCurrentValue();
            }
            if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(obj)).booleanValue()) {
                this.this$0.setCurrentValue(obj);
            }
        }
    }
}
