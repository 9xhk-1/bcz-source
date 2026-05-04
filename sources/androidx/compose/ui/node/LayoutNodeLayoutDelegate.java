package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n1#2:498\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private boolean detachedFromParentLookaheadPlacement;

    @k
    private final LayoutNode layoutNode;
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;
    private boolean lookaheadCoordinatesAccessedDuringPlacement;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;

    @l
    private LookaheadPassDelegate lookaheadPassDelegate;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;

    @k
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;

    @k
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate(this);

    public LayoutNodeLayoutDelegate(@k LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final void clearLookaheadDelegate() {
        this.lookaheadPassDelegate = null;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate(this);
        }
    }

    @k
    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.detachedFromParentLookaheadPass;
    }

    public final boolean getDetachedFromParentLookaheadPlacement$ui_release() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    @l
    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m4049getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m4072getLastConstraintsDWUhwKw();
    }

    @l
    /* renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m4050getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m4062getLastConstraintsDWUhwKw();
        }
        return null;
    }

    @k
    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.measurePassDelegate.getLayoutPending$ui_release();
    }

    @k
    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    @l
    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final boolean getLookaheadLayoutPendingForAlignment$ui_release() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    @l
    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    @k
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePassDelegate.getMeasurePending$ui_release();
    }

    public final int getNextChildLookaheadPlaceOrder$ui_release() {
        return this.nextChildLookaheadPlaceOrder;
    }

    public final int getNextChildPlaceOrder$ui_release() {
        return this.nextChildPlaceOrder;
    }

    @k
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.measurePassDelegate.markLayoutPending();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePassDelegate.markMeasurePending$ui_release();
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getLayingOutChildren()) {
                setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
            } else {
                setLookaheadCoordinatesAccessedDuringPlacement(true);
            }
        }
    }

    /* renamed from: performLookaheadMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m4051performLookaheadMeasureBRTryo0$ui_release(long j11) {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.m4063performMeasureBRTryo0$ui_release(j11);
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i11) {
        int i12 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i11;
        if ((i12 == 0) != (i11 == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i11 == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int i11) {
        int i12 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i11;
        if ((i12 == 0) != (i11 == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i11 == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z11) {
        if (this.coordinatesAccessedDuringModifierPlacement != z11) {
            this.coordinatesAccessedDuringModifierPlacement = z11;
            if (z11 && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z11) {
        if (this.coordinatesAccessedDuringPlacement != z11) {
            this.coordinatesAccessedDuringPlacement = z11;
            if (z11 && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setDetachedFromParentLookaheadPass$ui_release(boolean z11) {
        this.detachedFromParentLookaheadPass = z11;
    }

    public final void setDetachedFromParentLookaheadPlacement$ui_release(boolean z11) {
        this.detachedFromParentLookaheadPlacement = z11;
    }

    public final void setLayoutState$ui_release(@k LayoutNode.LayoutState layoutState) {
        this.layoutState = layoutState;
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z11) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z11) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z11;
            if (z11 && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z11) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z11) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z11;
            if (z11 && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setLookaheadLayoutPending$ui_release(boolean z11) {
        this.lookaheadLayoutPending = z11;
    }

    public final void setLookaheadLayoutPendingForAlignment$ui_release(boolean z11) {
        this.lookaheadLayoutPendingForAlignment = z11;
    }

    public final void setLookaheadMeasurePending$ui_release(boolean z11) {
        this.lookaheadMeasurePending = z11;
    }

    public final void setNextChildLookaheadPlaceOrder$ui_release(int i11) {
        this.nextChildLookaheadPlaceOrder = i11;
    }

    public final void setNextChildPlaceOrder$ui_release(int i11) {
        this.nextChildPlaceOrder = i11;
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 7, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, false, 7, null);
                return;
            }
            return;
        }
        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, false, 7, null);
        }
    }
}
