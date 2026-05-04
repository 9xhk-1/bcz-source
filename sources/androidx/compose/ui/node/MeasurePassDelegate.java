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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMeasurePassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePassDelegate.kt\nandroidx/compose/ui/node/MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,901:1\n405#1:940\n406#1:951\n405#1:981\n406#1:992\n1083#2,2:902\n390#3:904\n391#3,6:912\n397#3,2:921\n210#4:905\n207#4:923\n1296#4,7:933\n207#4:941\n1296#4,7:952\n207#4:959\n1286#4,7:969\n207#4:982\n207#4:993\n207#4:1036\n207#4:1046\n207#4:1056\n435#5,6:906\n441#5,3:918\n423#5,9:924\n423#5,9:942\n423#5,9:960\n423#5,9:983\n423#5,9:994\n423#5,9:1037\n423#5,9:1047\n423#5,9:1057\n56#6,5:976\n56#6,5:1003\n102#6,5:1008\n56#6,5:1015\n56#6,5:1021\n102#6,5:1026\n56#6,5:1031\n30#7:1013\n80#8:1014\n1#9:1020\n*S KotlinDebug\n*F\n+ 1 MeasurePassDelegate.kt\nandroidx/compose/ui/node/MeasurePassDelegate\n*L\n267#1:940\n267#1:951\n391#1:981\n391#1:992\n141#1:902,2\n151#1:904\n151#1:912,6\n151#1:921,2\n151#1:905\n232#1:923\n259#1:933,7\n267#1:941\n287#1:952,7\n292#1:959\n345#1:969,7\n391#1:982\n405#1:993\n796#1:1036\n820#1:1046\n851#1:1056\n151#1:906,6\n151#1:918,3\n232#1:924,9\n267#1:942,9\n292#1:960,9\n391#1:983,9\n405#1:994,9\n796#1:1037,9\n820#1:1047,9\n851#1:1057,9\n371#1:976,5\n413#1:1003,5\n456#1:1008,5\n496#1:1015,5\n613#1:1021,5\n627#1:1026,5\n668#1:1031,5\n477#1:1013\n477#1:1014\n*E\n"})
/* loaded from: classes2.dex */
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 8;

    @k
    private final MutableVector<MeasurePassDelegate> _childDelegates;

    @k
    private final AlignmentLines alignmentLines;
    private boolean childDelegatesDirty;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlaced;
    private boolean isPlacedByParent;
    private boolean isPlacedUnderMotionFrameOfReference;

    @l
    private GraphicsLayer lastExplicitLayer;

    @l
    private x00.l<? super GraphicsLayerScope, g2> lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    private boolean layingOutChildren;

    @k
    private final x00.a<g2> layoutChildrenBlock;

    @k
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean measurePending;
    private boolean measuredOnce;
    private boolean needsCoordinatesUpdate;
    private boolean onNodePlacedCalled;

    @l
    private Object parentData;
    private boolean parentDataDirty;

    @k
    private final x00.a<g2> performMeasureBlock;
    private long performMeasureConstraints;

    @k
    private final x00.a<g2> placeOuterCoordinatorBlock;

    @l
    private GraphicsLayer placeOuterCoordinatorLayer;

    @l
    private x00.l<? super GraphicsLayerScope, g2> placeOuterCoordinatorLayerBlock;
    private long placeOuterCoordinatorPosition;
    private float placeOuterCoordinatorZIndex;
    private boolean placedOnce;
    private boolean relayoutWithoutParentInProgress;
    private float zIndex;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;

    @k
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MeasurePassDelegate(@k LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        IntOffset.Companion companion = IntOffset.Companion;
        this.lastPosition = companion.m5254getZeronOccac();
        this.parentDataDirty = true;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this._childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new x00.a<g2>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
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
                long j11;
                NodeCoordinator outerCoordinator = MeasurePassDelegate.this.getOuterCoordinator();
                j11 = MeasurePassDelegate.this.performMeasureConstraints;
                outerCoordinator.mo3857measureBRTryo0(j11);
            }
        };
        this.layoutChildrenBlock = new x00.a<g2>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
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
                MeasurePassDelegate.this.clearPlaceOrder();
                MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new x00.l<AlignmentLinesOwner, g2>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
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
                MeasurePassDelegate.this.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                MeasurePassDelegate.this.checkChildrenPlaceOrderForUpdates();
                MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new x00.l<AlignmentLinesOwner, g2>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.2
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
        };
        this.placeOuterCoordinatorPosition = companion.m5254getZeronOccac();
        this.placeOuterCoordinatorBlock = new x00.a<g2>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
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
                Placeable.PlacementScope placementScope;
                x00.l<? super GraphicsLayerScope, g2> lVar;
                GraphicsLayer graphicsLayer;
                long j11;
                float f11;
                long j12;
                float f12;
                long j13;
                float f13;
                NodeCoordinator wrappedBy$ui_release = MeasurePassDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(MeasurePassDelegate.this.getLayoutNode()).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                MeasurePassDelegate measurePassDelegate = MeasurePassDelegate.this;
                lVar = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                if (graphicsLayer != null) {
                    NodeCoordinator outerCoordinator = measurePassDelegate.getOuterCoordinator();
                    j13 = measurePassDelegate.placeOuterCoordinatorPosition;
                    f13 = measurePassDelegate.placeOuterCoordinatorZIndex;
                    placementScope2.m3936placeWithLayeraW9wM(outerCoordinator, j13, graphicsLayer, f13);
                    return;
                }
                if (lVar == null) {
                    NodeCoordinator outerCoordinator2 = measurePassDelegate.getOuterCoordinator();
                    j12 = measurePassDelegate.placeOuterCoordinatorPosition;
                    f12 = measurePassDelegate.placeOuterCoordinatorZIndex;
                    placementScope2.m3927place70tqf50(outerCoordinator2, j12, f12);
                    return;
                }
                NodeCoordinator outerCoordinator3 = measurePassDelegate.getOuterCoordinator();
                j11 = measurePassDelegate.placeOuterCoordinatorPosition;
                f11 = measurePassDelegate.placeOuterCoordinatorZIndex;
                placementScope2.m3935placeWithLayeraW9wM(outerCoordinator3, j11, f11, lVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkChildrenPlaceOrderForUpdates() {
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                layoutNode.onZSortedChildrenInvalidated$ui_release();
                layoutNode.invalidateLayer$ui_release();
                if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                    if (layoutNode2.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPlacement$ui_release()) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLookaheadPassDelegate$ui_release();
                        g0.m(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsNotPlaced$ui_release(false);
                    }
                    layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildPlaceOrder$ui_release(0);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNodeArr[i11].getMeasurePassDelegate$ui_release();
            measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
            measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
            measurePassDelegate$ui_release.isPlacedByParent = false;
            if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void forEachChildDelegate(x00.l<? super MeasurePassDelegate, g2> lVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(layoutNodeArr[i11].getMeasurePassDelegate$ui_release());
        }
    }

    private final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean isPlaced = isPlaced();
        setPlaced$ui_release(true);
        LayoutNode layoutNode = getLayoutNode();
        if (!isPlaced) {
            layoutNode.getInnerCoordinator$ui_release().onPlaced();
            if (layoutNode.getMeasurePending$ui_release()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
            } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !g0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                outerCoordinator$ui_release.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
            }
        }
    }

    private final void markSubtreeAsNotPlaced() {
        if (isPlaced()) {
            setPlaced$ui_release(false);
            LayoutNode layoutNode = getLayoutNode();
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !g0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                outerCoordinator$ui_release.onUnplaced();
                outerCoordinator$ui_release.releaseLayer();
            }
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                layoutNodeArr[i11].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.getMeasurePending$ui_release() && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m4030remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
            }
        }
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if (parent$ui_release == null || getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        int i11 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
        layoutNode.setIntrinsicsUsageByParent$ui_release(i11 != 1 ? i11 != 2 ? parent$ui_release.getIntrinsicsUsageByParent$ui_release() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
    }

    /* renamed from: placeOuterCoordinator-MLgxB_4, reason: not valid java name */
    private final void m4070placeOuterCoordinatorMLgxB_4(long j11, float f11, x00.l<? super GraphicsLayerScope, g2> lVar, GraphicsLayer graphicsLayer) {
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
        }
        setLayoutState(LayoutNode.LayoutState.LayingOut);
        boolean z11 = !this.placedOnce;
        this.lastPosition = j11;
        this.lastZIndex = f11;
        this.lastLayerBlock = lVar;
        this.lastExplicitLayer = graphicsLayer;
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        requireOwner.getRectManager().m4347onLayoutPositionChanged70tqf50(getLayoutNode(), j11, z11);
        if (this.layoutPending || !isPlaced()) {
            getAlignmentLines().setUsedByModifierLayout$ui_release(false);
            this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
            this.placeOuterCoordinatorLayerBlock = lVar;
            this.placeOuterCoordinatorPosition = j11;
            this.placeOuterCoordinatorZIndex = f11;
            this.placeOuterCoordinatorLayer = graphicsLayer;
            requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(getLayoutNode(), false, this.placeOuterCoordinatorBlock);
        } else {
            getOuterCoordinator().m4108placeSelfApparentToRealOffsetMLgxB_4(j11, f11, lVar, graphicsLayer);
            onNodePlaced$ui_release();
        }
        setLayoutState(LayoutNode.LayoutState.Idle);
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m4071placeSelfMLgxB_4(long j11, float f11, x00.l<? super GraphicsLayerScope, g2> lVar, GraphicsLayer graphicsLayer) {
        Placeable.PlacementScope placementScope;
        this.isPlacedByParent = true;
        if (!IntOffset.m5242equalsimpl0(j11, this.lastPosition) || this.needsCoordinatesUpdate) {
            if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                this.layoutPending = true;
                this.needsCoordinatesUpdate = false;
            }
            notifyChildrenUsingCoordinatesWhilePlacing();
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.getNeedsToBePlacedInApproach()) {
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                placementScope = LayoutNodeKt.requireOwner(getLayoutNode()).getPlacementScope();
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            LookaheadPassDelegate lookaheadPassDelegate2 = getLookaheadPassDelegate();
            g0.m(lookaheadPassDelegate2);
            LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.getLayoutDelegate$ui_release().setNextChildLookaheadPlaceOrder$ui_release(0);
            }
            lookaheadPassDelegate2.setPlaceOrder$ui_release(Integer.MAX_VALUE);
            Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate2, IntOffset.m5243getXimpl(j11), IntOffset.m5244getYimpl(j11), 0.0f, 4, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate3 = getLookaheadPassDelegate();
        if ((lookaheadPassDelegate3 == null || lookaheadPassDelegate3.getPlacedOnce$ui_release()) ? false : true) {
            InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
        }
        m4070placeOuterCoordinatorMLgxB_4(j11, f11, lVar, graphicsLayer);
    }

    private final void trackMeasurementByParent(LayoutNode layoutNode) {
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
        if (i11 == 1) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i11 != 2) {
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
            if (getLayoutState() == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                if (getAlignmentLines().getDirty$ui_release()) {
                    markLayoutPending();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(true);
            }
        }
        getInnerCoordinator().setPlacingForAlignment$ui_release(true);
        layoutChildren();
        getInnerCoordinator().setPlacingForAlignment$ui_release(false);
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(@k x00.l<? super AlignmentLinesOwner, g2> lVar) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(layoutNodeArr[i11].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(@k AlignmentLine alignmentLine) {
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.Measuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = getLayoutNode().getParent$ui_release();
            if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i11 = getOuterCoordinator().get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i11;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @k
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    @k
    public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
        getLayoutNode().updateChildrenIfDirty$ui_release();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.asMutableList();
        }
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (mutableVector.getSize() <= i11) {
                mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
            } else {
                mutableVector.set(i11, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    }

    public final boolean getChildDelegatesDirty$ui_release() {
        return this.childDelegatesDirty;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @k
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui_release();
    }

    @l
    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m4072getLastConstraintsDWUhwKw() {
        if (this.measuredOnce) {
            return Constraints.m5055boximpl(m3917getMeasurementConstraintsmsEJaDk());
        }
        return null;
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    @k
    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    @k
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    @k
    public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return getOuterCoordinator().getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return getOuterCoordinator().getMeasuredWidth();
    }

    @k
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    @l
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutDelegate$ui_release;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
            return null;
        }
        return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @l
    public Object getParentData() {
        return this.parentData;
    }

    @k
    public final x00.a<g2> getPerformMeasureBlock$ui_release() {
        return this.performMeasureBlock;
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final int getPreviousPlaceOrder$ui_release() {
        return this.previousPlaceOrder;
    }

    public final float getZIndex$ui_release() {
        return this.zIndex;
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
            LayoutNode.requestRemeasure$ui_release$default(layoutNode, z11, false, false, 6, null);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            layoutNode.requestRelayout$ui_release(z11);
        }
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public boolean isPlaced() {
        return this.isPlaced;
    }

    public final boolean isPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (this.layoutPending) {
            onBeforeLayoutChildren();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(LayoutNode.LayoutState.LayingOut);
            this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
            LayoutNode layoutNode = getLayoutNode();
            LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
            setLayoutState(layoutState);
            if (getInnerCoordinator().isPlacingForAlignment$ui_release() && this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                requestLayout();
            }
            this.layoutPendingForAlignment = false;
        }
        if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markDetachedFromParentLookaheadPass$ui_release() {
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui_release(true);
    }

    public final void markLayoutPending() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i11) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().maxIntrinsicHeight(i11);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        g0.m(lookaheadPassDelegate);
        return lookaheadPassDelegate.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i11) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().maxIntrinsicWidth(i11);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        g0.m(lookaheadPassDelegate);
        return lookaheadPassDelegate.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @k
    /* renamed from: measure-BRTryo0 */
    public Placeable mo3857measureBRTryo0(long j11) {
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = getLayoutNode().getIntrinsicsUsageByParent$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        if (intrinsicsUsageByParent$ui_release == usageByParent) {
            getLayoutNode().clearSubtreeIntrinsicsUsage$ui_release();
        }
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
            g0.m(lookaheadPassDelegate);
            lookaheadPassDelegate.setMeasuredByParent$ui_release(usageByParent);
            lookaheadPassDelegate.mo3857measureBRTryo0(j11);
        }
        trackMeasurementByParent(getLayoutNode());
        m4074remeasureBRTryo0(j11);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i11) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().minIntrinsicHeight(i11);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        g0.m(lookaheadPassDelegate);
        return lookaheadPassDelegate.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i11) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().minIntrinsicWidth(i11);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        g0.m(lookaheadPassDelegate);
        return lookaheadPassDelegate.minIntrinsicWidth(i11);
    }

    public final void notifyChildrenUsingCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutNode layoutNode = layoutNodeArr[i11];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            }
        }
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        setPlaced$ui_release(false);
    }

    public final void onNodePlaced$ui_release() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        float zIndex = getInnerCoordinator().getZIndex();
        LayoutNode layoutNode = getLayoutNode();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            g0.n(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            zIndex += ((LayoutModifierNodeCoordinator) outerCoordinator$ui_release).getZIndex();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (isPlaced()) {
            getLayoutNode().getInnerCoordinator$ui_release().onPlaced();
        } else {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
            if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
            }
            this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().getNextChildPlaceOrder$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release();
            layoutDelegate$ui_release.setNextChildPlaceOrder$ui_release(layoutDelegate$ui_release.getNextChildPlaceOrder$ui_release() + 1);
        }
        layoutChildren();
    }

    /* renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m4073performMeasureBRTryo0$ui_release(long j11) {
        LayoutNode.LayoutState layoutState = getLayoutState();
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (!(layoutState == layoutState2)) {
            InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
        }
        this.performMeasureConstraints = j11;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        setLayoutState(layoutState3);
        this.measurePending = false;
        LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(getLayoutNode(), false, this.performMeasureBlock);
        if (getLayoutState() == layoutState3) {
            markLayoutPending();
            setLayoutState(layoutState2);
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        m4071placeSelfMLgxB_4(j11, f11, lVar, null);
    }

    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m4074remeasureBRTryo0(long j11) {
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
        }
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        boolean z11 = true;
        getLayoutNode().setCanMultiMeasure$ui_release(getLayoutNode().getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
        if (!getLayoutNode().getMeasurePending$ui_release() && Constraints.m5061equalsimpl0(m3917getMeasurementConstraintsmsEJaDk(), j11)) {
            Owner.forceMeasureTheSubtree$default(requireOwner, getLayoutNode(), false, 2, null);
            getLayoutNode().resetSubtreeIntrinsicsUsage$ui_release();
            return false;
        }
        getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
        forEachChildAlignmentLinesOwner(new x00.l<AlignmentLinesOwner, g2>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$2
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
        this.measuredOnce = true;
        long mo3865getSizeYbymL2g = getOuterCoordinator().mo3865getSizeYbymL2g();
        m3920setMeasurementConstraintsBRTryo0(j11);
        m4073performMeasureBRTryo0$ui_release(j11);
        if (IntSize.m5284equalsimpl0(getOuterCoordinator().mo3865getSizeYbymL2g(), mo3865getSizeYbymL2g) && getOuterCoordinator().getWidth() == getWidth() && getOuterCoordinator().getHeight() == getHeight()) {
            z11 = false;
        }
        m3919setMeasuredSizeozmzZPI(IntSize.m5281constructorimpl((getOuterCoordinator().getHeight() & 4294967295L) | (getOuterCoordinator().getWidth() << 32)));
        return z11;
    }

    public final void replace() {
        MeasurePassDelegate measurePassDelegate;
        LayoutNode parent$ui_release;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
            }
            boolean isPlaced = isPlaced();
            measurePassDelegate = this;
            try {
                measurePassDelegate.m4070placeOuterCoordinatorMLgxB_4(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !measurePassDelegate.onNodePlacedCalled && (parent$ui_release = getLayoutNode().getParent$ui_release()) != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
                measurePassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th2) {
                th = th2;
                measurePassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            measurePassDelegate = this;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void setChildDelegatesDirty$ui_release(boolean z11) {
        this.childDelegatesDirty = z11;
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z11) {
        this.duringAlignmentLinesQuery = z11;
    }

    public final void setLayoutState(@k LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui_release(layoutState);
    }

    public final void setMeasuredByParent$ui_release(@k LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public void setPlaced$ui_release(boolean z11) {
        this.isPlaced = z11;
    }

    public final void setPlacedByParent$ui_release(boolean z11) {
        this.isPlacedByParent = z11;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z11) {
        this.isPlacedUnderMotionFrameOfReference = z11;
    }

    public final boolean updateParentData() {
        if ((getParentData() == null && getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = getOuterCoordinator().getParentData();
        return true;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z11) {
        if (z11 != getOuterCoordinator().isPlacedUnderMotionFrameOfReference()) {
            getOuterCoordinator().setPlacedUnderMotionFrameOfReference(z11);
            this.needsCoordinatesUpdate = true;
        }
        setPlacedUnderMotionFrameOfReference(z11);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3918placeAtf8xVGno(long j11, float f11, @k GraphicsLayer graphicsLayer) {
        m4071placeSelfMLgxB_4(j11, f11, null, graphicsLayer);
    }
}
