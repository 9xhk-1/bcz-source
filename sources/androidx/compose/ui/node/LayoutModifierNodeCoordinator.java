package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,313:1\n115#2:314\n115#2:316\n246#3:315\n246#3:317\n1#4:318\n311#5,2:319\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n77#1:314\n47#1:316\n77#1:315\n47#1:317\n157#1:319,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Paint modifierBoundsPaint;

    @l
    private ApproachMeasureScopeImpl approachMeasureScope;

    @k
    private LayoutModifierNode layoutModifierNode;

    @l
    private Constraints lookaheadConstraints;

    @l
    private LookaheadDelegate lookaheadDelegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,313:1\n480#2,3:314\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n90#1:314,3\n*E\n"})
    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@k AlignmentLine alignmentLine) {
            int calculateAlignmentAndPlaceChildAsNeeded;
            calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().set(alignmentLine, calculateAlignmentAndPlaceChildAsNeeded);
            return calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i11) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i11);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i11) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i11);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @k
        /* renamed from: measure-BRTryo0 */
        public Placeable mo3857measureBRTryo0(long j11) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            m3920setMeasurementConstraintsBRTryo0(j11);
            layoutModifierNodeCoordinator.m4026setLookaheadConstraints_Sx5XlM$ui_release(Constraints.m5055boximpl(j11));
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            set_measureResult(layoutModifierNode.mo61measure3p2s80s(this, lookaheadDelegate, j11));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i11) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i11);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i11) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i11);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2388setColor8_81llA(Color.Companion.m2536getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2392setStylek9PVt8s(PaintingStyle.Companion.m2777getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(@k LayoutNode layoutNode, @k LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        if ((layoutModifierNode.getNode().getKindSet$ui_release() & NodeKind.m4118constructorimpl(512)) != 0) {
            g0.n(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.approachMeasureScope = approachMeasureScopeImpl;
    }

    private final void onAfterPlaceAt() {
        boolean z11;
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            Placeable.PlacementScope placementScope = getPlacementScope();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            if (!approachNode.isPlacementApproachInProgress(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) && !approachMeasureScopeImpl.getApproachMeasureRequired$ui_release()) {
                long mo3865getSizeYbymL2g = mo3865getSizeYbymL2g();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                if (IntSize.m5283equalsimpl(mo3865getSizeYbymL2g, lookaheadDelegate2 != null ? IntSize.m5278boximpl(lookaheadDelegate2.m4056getSizeYbymL2g$ui_release()) : null)) {
                    long mo3865getSizeYbymL2g2 = getWrappedNonNull().mo3865getSizeYbymL2g();
                    LookaheadDelegate lookaheadDelegate3 = getWrappedNonNull().getLookaheadDelegate();
                    if (IntSize.m5283equalsimpl(mo3865getSizeYbymL2g2, lookaheadDelegate3 != null ? IntSize.m5278boximpl(lookaheadDelegate3.m4056getSizeYbymL2g$ui_release()) : null)) {
                        z11 = true;
                        getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(z11);
                    }
                }
            }
            z11 = false;
            getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(z11);
        }
        getMeasureResult$ui_release().placeChildren();
        getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(false);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@k AlignmentLine alignmentLine) {
        int calculateAlignmentAndPlaceChildAsNeeded;
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine);
        }
        calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
        return calculateAlignmentAndPlaceChildAsNeeded;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    @k
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @l
    /* renamed from: getLookaheadConstraints-DWUhwKw$ui_release, reason: not valid java name */
    public final Constraints m4025getLookaheadConstraintsDWUhwKw$ui_release() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @l
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @k
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    @k
    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        g0.m(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i11) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i11) : this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i11) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i11) : this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r8 == r1.getHeight()) goto L27;
     */
    @Override // androidx.compose.ui.layout.Measurable
    @m80.k
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.Placeable mo3857measureBRTryo0(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.getForceMeasureWithLookaheadConstraints$ui_release()
            if (r0 == 0) goto L17
            androidx.compose.ui.unit.Constraints r7 = r6.lookaheadConstraints
            if (r7 == 0) goto Lf
            long r7 = r7.m5074unboximpl()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L17:
            androidx.compose.ui.node.NodeCoordinator.m4085access$setMeasurementConstraintsBRTryo0(r6, r7)
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = access$getApproachMeasureScope$p(r6)
            if (r0 == 0) goto Lb2
            androidx.compose.ui.layout.ApproachLayoutModifierNode r1 = r0.getApproachNode()
            long r2 = r0.mo3834getLookaheadSizeYbymL2g()
            boolean r2 = r1.mo67isMeasurementApproachInProgressozmzZPI(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            androidx.compose.ui.unit.Constraints r2 = r6.m4025getLookaheadConstraintsDWUhwKw$ui_release()
            boolean r2 = androidx.compose.ui.unit.Constraints.m5060equalsimpl(r7, r2)
            if (r2 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r4
            goto L3e
        L3d:
            r2 = r3
        L3e:
            r0.setApproachMeasureRequired$ui_release(r2)
            boolean r2 = r0.getApproachMeasureRequired$ui_release()
            if (r2 != 0) goto L4e
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getWrappedNonNull()
            r2.setForceMeasureWithLookaheadConstraints$ui_release(r3)
        L4e:
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getWrappedNonNull()
            androidx.compose.ui.layout.MeasureResult r7 = r1.mo66approachMeasure3p2s80s(r0, r2, r7)
            androidx.compose.ui.node.NodeCoordinator r8 = r6.getWrappedNonNull()
            r8.setForceMeasureWithLookaheadConstraints$ui_release(r4)
            int r8 = r7.getWidth()
            androidx.compose.ui.node.LookaheadDelegate r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.getWidth()
            if (r8 != r1) goto L80
            int r8 = r7.getHeight()
            androidx.compose.ui.node.LookaheadDelegate r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.getHeight()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r8 = r0.getApproachMeasureRequired$ui_release()
            if (r8 != 0) goto Lbe
            androidx.compose.ui.node.NodeCoordinator r8 = r6.getWrappedNonNull()
            long r0 = r8.mo3865getSizeYbymL2g()
            androidx.compose.ui.node.NodeCoordinator r8 = r6.getWrappedNonNull()
            androidx.compose.ui.node.LookaheadDelegate r8 = r8.getLookaheadDelegate()
            if (r8 == 0) goto La2
            long r4 = r8.m4056getSizeYbymL2g$ui_release()
            androidx.compose.ui.unit.IntSize r8 = androidx.compose.ui.unit.IntSize.m5278boximpl(r4)
            goto La3
        La2:
            r8 = 0
        La3:
            boolean r8 = androidx.compose.ui.unit.IntSize.m5283equalsimpl(r0, r8)
            if (r8 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1 r8 = new androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
            r8.<init>(r6)
            r7 = r8
            goto Lbe
        Lb2:
            androidx.compose.ui.node.LayoutModifierNode r0 = r6.getLayoutModifierNode()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.getWrappedNonNull()
            androidx.compose.ui.layout.MeasureResult r7 = r0.mo61measure3p2s80s(r6, r1, r7)
        Lbe:
            r6.setMeasureResult$ui_release(r7)
            r6.onMeasured()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.mo3857measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i11) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i11) : this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i11) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i11) : this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i11);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@k Canvas canvas, @l GraphicsLayer graphicsLayer) {
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3918placeAtf8xVGno(long j11, float f11, @k GraphicsLayer graphicsLayer) {
        super.mo3918placeAtf8xVGno(j11, f11, graphicsLayer);
        onAfterPlaceAt();
    }

    public final void setLayoutModifierNode$ui_release(@k LayoutModifierNode layoutModifierNode) {
        if (!g0.g(layoutModifierNode, this.layoutModifierNode)) {
            Modifier.Node node = layoutModifierNode.getNode();
            if ((node.getKindSet$ui_release() & NodeKind.m4118constructorimpl(512)) != 0) {
                g0.n(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    /* renamed from: setLookaheadConstraints-_Sx5XlM$ui_release, reason: not valid java name */
    public final void m4026setLookaheadConstraints_Sx5XlM$ui_release(@l Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(@l LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        super.mo3858placeAtf8xVGno(j11, f11, lVar);
        onAfterPlaceAt();
    }
}
