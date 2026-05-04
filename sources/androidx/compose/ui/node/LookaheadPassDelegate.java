package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLookaheadPassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,850:1\n211#1:882\n211#1:893\n211#1:957\n1083#2,2:851\n390#3:853\n391#3,6:861\n397#3,2:870\n210#4:854\n207#4:872\n207#4:883\n207#4:894\n207#4:904\n207#4:914\n207#4:958\n207#4:968\n207#4:978\n435#5,6:855\n441#5,3:867\n423#5,9:873\n423#5,9:884\n423#5,9:895\n423#5,9:905\n423#5,9:915\n423#5,9:959\n423#5,9:969\n423#5,9:979\n56#6,5:924\n102#6,5:929\n56#6,5:936\n102#6,5:947\n56#6,5:952\n56#6,5:988\n30#7:934\n30#7:941\n80#8:935\n80#8:942\n85#8:944\n90#8:946\n54#9:943\n59#9:945\n*S KotlinDebug\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate\n*L\n277#1:882\n316#1:893\n736#1:957\n160#1:851,2\n200#1:853\n200#1:861,6\n200#1:870,2\n200#1:854\n211#1:872\n277#1:883\n316#1:894\n343#1:904\n367#1:914\n736#1:958\n769#1:968\n804#1:978\n200#1:855,6\n200#1:867,3\n211#1:873,9\n277#1:884,9\n316#1:895,9\n343#1:905,9\n367#1:915,9\n736#1:959,9\n769#1:969,9\n804#1:979,9\n407#1:924,5\n455#1:929,5\n474#1:936,5\n530#1:947,5\n717#1:952,5\n823#1:988,5\n471#1:934\n479#1:941\n471#1:935\n479#1:942\n481#1:944\n482#1:946\n481#1:943\n482#1:945\n*E\n"})
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 8;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlacedUnderMotionFrameOfReference;

    @l
    private GraphicsLayer lastExplicitLayer;

    @l
    private x00.l<? super GraphicsLayerScope, g2> lastLayerBlock;
    private float lastZIndex;
    private boolean layingOutChildren;

    @k
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;

    @l
    private Constraints lookaheadConstraints;
    private boolean measuredOnce;
    private boolean onNodePlacedCalled;
    private boolean placedOnce;
    private boolean relayoutWithoutParentInProgress;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;

    @k
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
    private long lastPosition = IntOffset.Companion.m5254getZeronOccac();

    @k
    private PlacedState _placedState = PlacedState.IsNotPlaced;

    @k
    private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);

    @k
    private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
    private boolean childDelegatesDirty = true;
    private boolean parentDataDirty = true;

    @l
    private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PlacedState {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ PlacedState[] $VALUES;
        public static final PlacedState IsPlacedInLookahead = new PlacedState("IsPlacedInLookahead", 0);
        public static final PlacedState IsPlacedInApproach = new PlacedState("IsPlacedInApproach", 1);
        public static final PlacedState IsNotPlaced = new PlacedState("IsNotPlaced", 2);

        private static final /* synthetic */ PlacedState[] $values() {
            return new PlacedState[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
        }

        static {
            PlacedState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private PlacedState(String str, int i11) {
        }

        @k
        public static m00.a<PlacedState> getEntries() {
            return $ENTRIES;
        }

        public static PlacedState valueOf(String str) {
            return (PlacedState) Enum.valueOf(PlacedState.class, str);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LookaheadPassDelegate(@k LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkChildrenPlaceOrderForUpdates() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i11].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            g0.m(lookaheadPassDelegate$ui_release);
            int i12 = lookaheadPassDelegate$ui_release.previousPlaceOrder;
            int i13 = lookaheadPassDelegate$ui_release.placeOrder;
            if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsNotPlaced$ui_release(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildLookaheadPlaceOrder$ui_release(0);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i11].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            g0.m(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.previousPlaceOrder = lookaheadPassDelegate$ui_release.placeOrder;
            lookaheadPassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
            if (lookaheadPassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                lookaheadPassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void forEachChildDelegate(x00.l<? super LookaheadPassDelegate, g2> lVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i11].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            g0.m(lookaheadPassDelegate$ui_release);
            lVar.invoke(lookaheadPassDelegate$ui_release);
        }
    }

    private final boolean getDetachedFromParentLookaheadPlacement() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui_release();
    }

    private final boolean getLayoutPending() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    private final boolean getLayoutPendingForAlignment() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment$ui_release();
    }

    private final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui_release();
    }

    private final boolean getMeasurePending() {
        return this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        PlacedState placedState = this._placedState;
        if (getDetachedFromParentLookaheadPlacement()) {
            this._placedState = PlacedState.IsPlacedInApproach;
        } else {
            this._placedState = PlacedState.IsPlacedInLookahead;
        }
        if (placedState != PlacedState.IsPlacedInLookahead && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui_release()) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), true, false, false, 6, null);
        }
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (lookaheadPassDelegate$ui_release.placeOrder != Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.getLookaheadMeasurePending$ui_release() && layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                g0.m(lookaheadPassDelegate$ui_release);
                Constraints m4050getLastLookaheadConstraintsDWUhwKw = layoutNode.getLayoutDelegate$ui_release().m4050getLastLookaheadConstraintsDWUhwKw();
                g0.m(m4050getLastLookaheadConstraintsDWUhwKw);
                if (lookaheadPassDelegate$ui_release.m4064remeasureBRTryo0(m4050getLastLookaheadConstraintsDWUhwKw.m5074unboximpl())) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
                }
            }
        }
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if (parent$ui_release == null || getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        int i11 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
        layoutNode.setIntrinsicsUsageByParent$ui_release(i11 != 2 ? i11 != 3 ? parent$ui_release.getIntrinsicsUsageByParent$ui_release() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m4061placeSelfMLgxB_4(final long j11, float f11, x00.l<? super GraphicsLayerScope, g2> lVar, GraphicsLayer graphicsLayer) {
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
        if (layoutState$ui_release == layoutState) {
            this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui_release(false);
        }
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
        }
        setLayoutState(layoutState);
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        if (!IntOffset.m5242equalsimpl0(j11, this.lastPosition)) {
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                setLayoutPending(true);
            }
            notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
        }
        final Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        if (getLayoutPending() || !isPlaced()) {
            this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
            getAlignmentLines().setUsedByModifierLayout$ui_release(false);
            OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), getLayoutNode(), false, new x00.a<g2>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$placeSelf$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke2() {
                    /*
                        r9 = this;
                        androidx.compose.ui.node.LookaheadPassDelegate r0 = androidx.compose.ui.node.LookaheadPassDelegate.this
                        androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LookaheadPassDelegate.access$getLayoutNode(r0)
                        boolean r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(r0)
                        r1 = 0
                        if (r0 != 0) goto L30
                        androidx.compose.ui.node.LookaheadPassDelegate r0 = androidx.compose.ui.node.LookaheadPassDelegate.this
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LookaheadPassDelegate.access$getLayoutNodeLayoutDelegate$p(r0)
                        boolean r0 = r0.getDetachedFromParentLookaheadPlacement$ui_release()
                        if (r0 != 0) goto L30
                        androidx.compose.ui.node.LookaheadPassDelegate r0 = androidx.compose.ui.node.LookaheadPassDelegate.this
                        androidx.compose.ui.node.NodeCoordinator r0 = androidx.compose.ui.node.LookaheadPassDelegate.access$getOuterCoordinator(r0)
                        androidx.compose.ui.node.NodeCoordinator r0 = r0.getWrappedBy$ui_release()
                        if (r0 == 0) goto L40
                        androidx.compose.ui.node.LookaheadDelegate r0 = r0.getLookaheadDelegate()
                        if (r0 == 0) goto L40
                        androidx.compose.ui.layout.Placeable$PlacementScope r1 = r0.getPlacementScope()
                        goto L40
                    L30:
                        androidx.compose.ui.node.LookaheadPassDelegate r0 = androidx.compose.ui.node.LookaheadPassDelegate.this
                        androidx.compose.ui.node.NodeCoordinator r0 = androidx.compose.ui.node.LookaheadPassDelegate.access$getOuterCoordinator(r0)
                        androidx.compose.ui.node.NodeCoordinator r0 = r0.getWrappedBy$ui_release()
                        if (r0 == 0) goto L40
                        androidx.compose.ui.layout.Placeable$PlacementScope r1 = r0.getPlacementScope()
                    L40:
                        if (r1 != 0) goto L48
                        androidx.compose.ui.node.Owner r0 = r2
                        androidx.compose.ui.layout.Placeable$PlacementScope r1 = r0.getPlacementScope()
                    L48:
                        r2 = r1
                        androidx.compose.ui.node.LookaheadPassDelegate r0 = androidx.compose.ui.node.LookaheadPassDelegate.this
                        long r4 = r3
                        androidx.compose.ui.node.NodeCoordinator r0 = androidx.compose.ui.node.LookaheadPassDelegate.access$getOuterCoordinator(r0)
                        androidx.compose.ui.node.LookaheadDelegate r3 = r0.getLookaheadDelegate()
                        kotlin.jvm.internal.g0.m(r3)
                        r7 = 2
                        r8 = 0
                        r6 = 0
                        androidx.compose.ui.layout.Placeable.PlacementScope.m3921place70tqf50$default(r2, r3, r4, r6, r7, r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate$placeSelf$2.invoke2():void");
                }
            }, 2, null);
        } else {
            LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            lookaheadDelegate.m4058placeSelfApparentToRealOffsetgyyYBs$ui_release(j11);
            onNodePlaced$ui_release();
        }
        this.lastPosition = j11;
        this.lastZIndex = f11;
        this.lastLayerBlock = lVar;
        this.lastExplicitLayer = graphicsLayer;
        setLayoutState(LayoutNode.LayoutState.Idle);
    }

    private final void setLayoutPending(boolean z11) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPending$ui_release(z11);
    }

    private final void setLayoutPendingForAlignment(boolean z11) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPendingForAlignment$ui_release(z11);
    }

    private final void setLayoutState(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui_release(layoutState);
    }

    private final void setMeasurePending(boolean z11) {
        this.layoutNodeLayoutDelegate.setLookaheadMeasurePending$ui_release(z11);
    }

    private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release == null) {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            return;
        }
        if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release())) {
            InlineClassHelperKt.throwIllegalStateException(LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
        if (i11 == 1 || i11 == 2) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i11 != 3 && i11 != 4) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @k
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (!this.duringAlignmentLinesQuery) {
            if (getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                if (getAlignmentLines().getDirty$ui_release()) {
                    this.layoutNodeLayoutDelegate.markLookaheadLayoutPending$ui_release();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(true);
            }
        }
        LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.setPlacingForAlignment$ui_release(true);
        }
        layoutChildren();
        LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
        }
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(@k x00.l<? super AlignmentLinesOwner, g2> lVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeArr[i11].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
            g0.m(lookaheadAlignmentLinesOwner$ui_release);
            lVar.invoke(lookaheadAlignmentLinesOwner$ui_release);
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(@k AlignmentLine alignmentLine) {
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = getLayoutNode().getParent$ui_release();
            if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        int i11 = lookaheadDelegate.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i11;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @k
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    @k
    public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
        getLayoutNode().getChildren$ui_release();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.asMutableList();
        }
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (mutableVector.getSize() <= i11) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                g0.m(lookaheadPassDelegate$ui_release);
                mutableVector.add(lookaheadPassDelegate$ui_release);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                g0.m(lookaheadPassDelegate$ui_release2);
                mutableVector.set(i11, lookaheadPassDelegate$ui_release2);
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    }

    public final boolean getChildDelegatesDirty$ui_release() {
        return this.childDelegatesDirty;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @k
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui_release();
    }

    @l
    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m4062getLastConstraintsDWUhwKw() {
        return this.lookaheadConstraints;
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    @k
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate$ui_release();
    }

    @k
    public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getMeasuredWidth();
    }

    public final boolean getNeedsToBePlacedInApproach() {
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            return true;
        }
        if (this._placedState == PlacedState.IsNotPlaced && !this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPass$ui_release()) {
            this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui_release(true);
        }
        return getDetachedFromParentLookaheadPlacement();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @l
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutDelegate$ui_release;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
            return null;
        }
        return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @l
    public Object getParentData() {
        return this.parentData;
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final boolean getPlacedOnce$ui_release() {
        return this.placedOnce;
    }

    public final void invalidateIntrinsicsParent(boolean z11) {
        LayoutNode layoutNode;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = getLayoutNode().getIntrinsicsUsageByParent$ui_release();
        if (parent$ui_release == null || intrinsicsUsageByParent$ui_release == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = parent$ui_release;
            if (layoutNode.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent$ui_release) {
                break;
            } else {
                parent$ui_release = layoutNode.getParent$ui_release();
            }
        } while (parent$ui_release != null);
        int i11 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
        if (i11 == 1) {
            if (layoutNode.getLookaheadRoot$ui_release() != null) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, z11, false, false, 6, null);
                return;
            } else {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, z11, false, false, 6, null);
                return;
            }
        }
        if (i11 != 2) {
            throw new IllegalStateException("Intrinsics isn't used by the parent");
        }
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            layoutNode.requestLookaheadRelayout$ui_release(z11);
        } else {
            layoutNode.requestRelayout$ui_release(z11);
        }
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public boolean isPlaced() {
        return this._placedState != PlacedState.IsNotPlaced;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (getLayoutPending()) {
            onBeforeLayoutChildren();
        }
        final LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        if (getLayoutPendingForAlignment() || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui_release() && getLayoutPending())) {
            setLayoutPending(false);
            LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(LayoutNode.LayoutState.LookaheadLayingOut);
            Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
            this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringPlacement(false);
            OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), getLayoutNode(), false, new x00.a<g2>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    LayoutNode layoutNode;
                    LayoutNode layoutNode2;
                    LookaheadPassDelegate.this.clearPlaceOrder();
                    LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new x00.l<AlignmentLinesOwner, g2>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1.1
                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            invoke2(alignmentLinesOwner);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                        }
                    });
                    LookaheadDelegate lookaheadDelegate2 = LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
                    if (lookaheadDelegate2 != null) {
                        boolean isPlacingForAlignment$ui_release = lookaheadDelegate2.isPlacingForAlignment$ui_release();
                        layoutNode2 = LookaheadPassDelegate.this.getLayoutNode();
                        List<LayoutNode> children$ui_release = layoutNode2.getChildren$ui_release();
                        int size = children$ui_release.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            LookaheadDelegate lookaheadDelegate3 = children$ui_release.get(i11).getOuterCoordinator$ui_release().getLookaheadDelegate();
                            if (lookaheadDelegate3 != null) {
                                lookaheadDelegate3.setPlacingForAlignment$ui_release(isPlacingForAlignment$ui_release);
                            }
                        }
                    }
                    lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
                    LookaheadDelegate lookaheadDelegate4 = LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
                    if (lookaheadDelegate4 != null) {
                        lookaheadDelegate4.isPlacingForAlignment$ui_release();
                        layoutNode = LookaheadPassDelegate.this.getLayoutNode();
                        List<LayoutNode> children$ui_release2 = layoutNode.getChildren$ui_release();
                        int size2 = children$ui_release2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            LookaheadDelegate lookaheadDelegate5 = children$ui_release2.get(i12).getOuterCoordinator$ui_release().getLookaheadDelegate();
                            if (lookaheadDelegate5 != null) {
                                lookaheadDelegate5.setPlacingForAlignment$ui_release(false);
                            }
                        }
                    }
                    LookaheadPassDelegate.this.checkChildrenPlaceOrderForUpdates();
                    LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new x00.l<AlignmentLinesOwner, g2>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1.4
                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            invoke2(alignmentLinesOwner);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                        }
                    });
                }
            }, 2, null);
            setLayoutState(layoutState);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                requestLayout();
            }
            setLayoutPendingForAlignment(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markLayoutPending$ui_release() {
        setLayoutPending(true);
        setLayoutPendingForAlignment(true);
    }

    public final void markMeasurePending$ui_release() {
        setMeasurePending(true);
    }

    public final void markNodeAndSubtreeAsNotPlaced$ui_release(boolean z11) {
        if (z11 && getDetachedFromParentLookaheadPlacement()) {
            return;
        }
        if (z11 || getDetachedFromParentLookaheadPlacement()) {
            this._placedState = PlacedState.IsNotPlaced;
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i11].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                g0.m(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsNotPlaced$ui_release(true);
            }
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i11) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i11) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r0 != null ? r0.getLayoutState$ui_release() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
     */
    @Override // androidx.compose.ui.layout.Measurable
    @m80.k
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.Placeable mo3857measureBRTryo0(long r4) {
        /*
            r3 = this;
            androidx.compose.ui.node.LayoutNode r0 = r3.getLayoutNode()
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            r1 = 0
            if (r0 == 0) goto L10
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
            goto L11
        L10:
            r0 = r1
        L11:
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r0 == r2) goto L27
            androidx.compose.ui.node.LayoutNode r0 = r3.getLayoutNode()
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            if (r0 == 0) goto L23
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.getLayoutState$ui_release()
        L23:
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r1 != r0) goto L2d
        L27:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = r3.layoutNodeLayoutDelegate
            r1 = 0
            r0.setDetachedFromParentLookaheadPass$ui_release(r1)
        L2d:
            androidx.compose.ui.node.LayoutNode r0 = r3.getLayoutNode()
            r3.trackLookaheadMeasurementByParent(r0)
            androidx.compose.ui.node.LayoutNode r0 = r3.getLayoutNode()
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.getIntrinsicsUsageByParent$ui_release()
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
            if (r0 != r1) goto L47
            androidx.compose.ui.node.LayoutNode r0 = r3.getLayoutNode()
            r0.clearSubtreeIntrinsicsUsage$ui_release()
        L47:
            r3.m4064remeasureBRTryo0(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate.mo3857measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i11) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i11) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i11);
    }

    public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutNode layoutNode = layoutNodeArr[i11];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLookaheadLayoutPending$ui_release()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release != null) {
                    lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
            }
        }
    }

    public final void onAttachedToNullParent() {
        this._placedState = PlacedState.IsPlacedInLookahead;
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = PlacedState.IsNotPlaced;
    }

    public final void onNodePlaced$ui_release() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if ((this._placedState != PlacedState.IsPlacedInLookahead && !getDetachedFromParentLookaheadPlacement()) || (this._placedState != PlacedState.IsPlacedInApproach && getDetachedFromParentLookaheadPlacement())) {
            markNodeAndSubtreeAsPlaced();
            if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
            }
            this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().getNextChildLookaheadPlaceOrder$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release();
            layoutDelegate$ui_release.setNextChildLookaheadPlaceOrder$ui_release(layoutDelegate$ui_release.getNextChildLookaheadPlaceOrder$ui_release() + 1);
        }
        layoutChildren();
    }

    /* renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m4063performMeasureBRTryo0$ui_release(final long j11) {
        setLayoutState(LayoutNode.LayoutState.LookaheadMeasuring);
        setMeasurePending(false);
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver(), getLayoutNode(), false, new x00.a<g2>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeCoordinator outerCoordinator;
                outerCoordinator = LookaheadPassDelegate.this.getOuterCoordinator();
                LookaheadDelegate lookaheadDelegate = outerCoordinator.getLookaheadDelegate();
                g0.m(lookaheadDelegate);
                lookaheadDelegate.mo3857measureBRTryo0(j11);
            }
        }, 2, null);
        markLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            getMeasurePassDelegate$ui_release().markLayoutPending();
        } else {
            getMeasurePassDelegate$ui_release().markMeasurePending$ui_release();
        }
        setLayoutState(LayoutNode.LayoutState.Idle);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        m4061placeSelfMLgxB_4(j11, f11, lVar, null);
    }

    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m4064remeasureBRTryo0(long j11) {
        long m5281constructorimpl;
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
        }
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        getLayoutNode().setCanMultiMeasure$ui_release(getLayoutNode().getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
        if (!getLayoutNode().getLookaheadMeasurePending$ui_release()) {
            Constraints constraints = this.lookaheadConstraints;
            if (constraints == null ? false : Constraints.m5061equalsimpl0(constraints.m5074unboximpl(), j11)) {
                Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.forceMeasureTheSubtree(getLayoutNode(), true);
                }
                getLayoutNode().resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
        }
        this.lookaheadConstraints = Constraints.m5055boximpl(j11);
        m3920setMeasurementConstraintsBRTryo0(j11);
        getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
        forEachChildAlignmentLinesOwner(new x00.l<AlignmentLinesOwner, g2>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$2
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
                invoke2(alignmentLinesOwner);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
            }
        });
        if (this.measuredOnce) {
            m5281constructorimpl = m3916getMeasuredSizeYbymL2g();
        } else {
            long j12 = Integer.MIN_VALUE;
            m5281constructorimpl = IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
        }
        this.measuredOnce = true;
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        if (!(lookaheadDelegate != null)) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
        }
        this.layoutNodeLayoutDelegate.m4051performLookaheadMeasureBRTryo0$ui_release(j11);
        m3919setMeasuredSizeozmzZPI(IntSize.m5281constructorimpl((lookaheadDelegate.getHeight() & 4294967295L) | (lookaheadDelegate.getWidth() << 32)));
        return (((int) (m5281constructorimpl >> 32)) == lookaheadDelegate.getWidth() && ((int) (m5281constructorimpl & 4294967295L)) == lookaheadDelegate.getHeight()) ? false : true;
    }

    public final void replace() {
        LookaheadPassDelegate lookaheadPassDelegate;
        LayoutNode parent$ui_release;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean isPlaced = isPlaced();
            lookaheadPassDelegate = this;
            try {
                lookaheadPassDelegate.m4061placeSelfMLgxB_4(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !lookaheadPassDelegate.onNodePlacedCalled && (parent$ui_release = getLayoutNode().getParent$ui_release()) != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th2) {
                th = th2;
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            lookaheadPassDelegate = this;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestLookaheadRelayout$ui_release$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void setChildDelegatesDirty$ui_release(boolean z11) {
        this.childDelegatesDirty = z11;
    }

    public final void setMeasuredByParent$ui_release(@k LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public final void setPlaceOrder$ui_release(int i11) {
        this.placeOrder = i11;
    }

    public final void setPlacedOnce$ui_release(boolean z11) {
        this.placedOnce = z11;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z11) {
        this.isPlacedUnderMotionFrameOfReference = z11;
    }

    public final boolean updateParentData() {
        if (getParentData() == null) {
            LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            if (lookaheadDelegate.getParentData() == null) {
                return false;
            }
        }
        if (!this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        LookaheadDelegate lookaheadDelegate2 = getOuterCoordinator().getLookaheadDelegate();
        g0.m(lookaheadDelegate2);
        this.parentData = lookaheadDelegate2.getParentData();
        return true;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z11) {
        LookaheadDelegate lookaheadDelegate;
        LookaheadDelegate lookaheadDelegate2 = getOuterCoordinator().getLookaheadDelegate();
        if (!g0.g(Boolean.valueOf(z11), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.isPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate()) != null) {
            lookaheadDelegate.setPlacedUnderMotionFrameOfReference(z11);
        }
        setPlacedUnderMotionFrameOfReference(z11);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3918placeAtf8xVGno(long j11, float f11, @k GraphicsLayer graphicsLayer) {
        m4061placeSelfMLgxB_4(j11, f11, null, graphicsLayer);
    }
}
