package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,756:1\n487#1:778\n488#1:782\n490#1,10:784\n501#1,6:801\n487#1:807\n488#1:811\n490#1,17:813\n487#1:845\n488#1:849\n490#1:851\n491#1,16:857\n1101#2:757\n1083#2,2:758\n1101#2:760\n1083#2,2:761\n102#3,5:763\n102#3,5:768\n56#3,5:773\n102#3,3:779\n106#3:783\n102#3,3:808\n106#3:812\n102#3,5:840\n102#3,3:846\n106#3:850\n102#3,5:852\n102#3,5:883\n102#3,5:888\n102#3,5:893\n56#3,5:919\n102#3,5:924\n189#4,2:794\n191#4,4:797\n107#5:796\n207#6:830\n207#6:873\n207#6:929\n423#7,9:831\n423#7,9:874\n641#7,2:898\n423#7,9:900\n519#7:909\n423#7,9:910\n423#7,9:930\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n384#1:778\n384#1:782\n384#1:784,10\n384#1:801,6\n405#1:807\n405#1:811\n405#1:813,17\n446#1:845\n446#1:849\n446#1:851\n446#1:857,16\n65#1:757\n65#1:758,2\n86#1:760\n86#1:761,2\n73#1:763,5\n93#1:768,5\n127#1:773,5\n384#1:779,3\n384#1:783\n405#1:808,3\n405#1:812\n445#1:840,5\n446#1:846,3\n446#1:850\n446#1:852,5\n487#1:883,5\n490#1:888,5\n491#1:893,5\n647#1:919,5\n652#1:924,5\n386#1:794,2\n386#1:797,4\n386#1:796\n425#1:830\n475#1:873\n672#1:929\n425#1:831,9\n475#1:874,9\n509#1:898,2\n513#1:900,9\n597#1:909\n598#1:910,9\n672#1:930,9\n*E\n"})
/* loaded from: classes2.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;

    @l
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringFullMeasureLayoutPass;
    private boolean duringMeasureLayout;
    private long measureIteration;

    @k
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;

    @k
    private final OnPositionedDispatcher onPositionedDispatcher;

    @k
    private final MutableVector<PostponedRequest> postponedMeasureRequests;

    @k
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    @k
    private final LayoutNode root;

    @l
    private Constraints rootConstraints;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;

        @k
        private final LayoutNode node;

        public PostponedRequest(@k LayoutNode layoutNode, boolean z11, boolean z12) {
            this.node = layoutNode;
            this.isLookahead = z11;
            this.isForced = z12;
        }

        @k
        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@k LayoutNode layoutNode) {
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        Owner.OnLayoutCompletedListener[] onLayoutCompletedListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            onLayoutCompletedListenerArr[i11].onLayoutComplete();
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z11);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m4065doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        boolean m4036lookaheadRemeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m4036lookaheadRemeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m4029lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4036lookaheadRemeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
                return m4036lookaheadRemeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
                return m4036lookaheadRemeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return m4036lookaheadRemeasure_Sx5XlM$ui_release;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m4066doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m4037remeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m4037remeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m4030remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4037remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
                return m4037remeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return m4037remeasure_Sx5XlM$ui_release;
    }

    private final void drainPostponedMeasureRequests() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            PostponedRequest[] postponedRequestArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                PostponedRequest postponedRequest = postponedRequestArr[i11];
                if (postponedRequest.getNode().isAttached()) {
                    if (postponedRequest.isLookahead()) {
                        LayoutNode.requestLookaheadRemeasure$ui_release$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    } else {
                        LayoutNode.requestRemeasure$ui_release$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.clear();
        }
    }

    private final void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (g0.g(layoutNode2.isPlacedInLookahead(), Boolean.TRUE) && !layoutNode2.isDeactivated()) {
                if (this.relayoutNodes.contains(layoutNode2, true)) {
                    layoutNode2.lookaheadReplace$ui_release();
                }
                ensureSubtreeLookaheadReplaced(layoutNode2);
            }
        }
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z11) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if ((!z11 && getMeasureAffectsParent(layoutNode2)) || (z11 && getMeasureAffectsParentLookahead(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z11) {
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                        remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                    } else {
                        forceMeasureTheSubtree(layoutNode2, true);
                    }
                }
                onlyRemeasureIfScheduled(layoutNode2, z11);
                if (!measurePending(layoutNode2, z11)) {
                    forceMeasureTheSubtreeInternal(layoutNode2, z11);
                }
            }
        }
        onlyRemeasureIfScheduled(layoutNode, z11);
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        return layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode);
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode layoutNode) {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        return layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || !((lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(aVar);
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z11) {
        return z11 ? layoutNode.getLookaheadMeasurePending$ui_release() : layoutNode.getMeasurePending$ui_release();
    }

    private final void onlyRemeasureIfScheduled(LayoutNode layoutNode, boolean z11) {
        if (measurePending(layoutNode, z11) && this.relayoutNodes.contains(layoutNode, z11)) {
            remeasureAndRelayoutIfNeeded(layoutNode, z11, false);
        }
    }

    private final void performMeasureAndLayout(boolean z11, x00.a<g2> aVar) {
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = z11;
            try {
                aVar.invoke();
                d0.d(1);
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                d0.c(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th2) {
                d0.d(1);
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                d0.c(1);
                throw th2;
            }
        }
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z11, boolean z12) {
        Constraints constraints;
        boolean z13;
        LayoutNode parent$ui_release;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (!layoutNode.isPlaced() && !layoutNode.isPlacedByParent() && !getCanAffectParent(layoutNode) && !g0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            g0.m(constraints);
        } else {
            constraints = null;
        }
        if (z11) {
            z13 = layoutNode.getLookaheadMeasurePending$ui_release() ? m4065doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
            if (z12 && ((z13 || layoutNode.getLookaheadLayoutPending$ui_release()) && g0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE))) {
                layoutNode.lookaheadReplace$ui_release();
            }
        } else {
            boolean m4066doRemeasuresdFAvZA = layoutNode.getMeasurePending$ui_release() ? m4066doRemeasuresdFAvZA(layoutNode, constraints) : false;
            if (z12 && layoutNode.getLayoutPending$ui_release() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.isPlaced() && layoutNode.isPlacedByParent()))) {
                if (layoutNode == this.root) {
                    layoutNode.place$ui_release(0, 0);
                } else {
                    layoutNode.replace$ui_release();
                }
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
                LayoutNodeKt.requireOwner(layoutNode).getRectManager().invalidateCallbacksFor(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
            z13 = m4066doRemeasuresdFAvZA;
        }
        drainPostponedMeasureRequests();
        return z13;
    }

    public static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z11, z12);
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (getMeasureAffectsParent(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                    remeasureOnly(layoutNode2, true);
                } else {
                    remeasureLookaheadRootsInSubtree(layoutNode2);
                }
            }
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z11) {
        Constraints constraints;
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            g0.m(constraints);
        } else {
            constraints = null;
        }
        if (z11) {
            m4065doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m4066doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z11);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z11);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z11);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z11);
    }

    public final void dispatchOnPositionedCallbacks(boolean z11) {
        if (z11) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(@k LayoutNode layoutNode, boolean z11) {
        if (this.relayoutNodes.isEmpty(z11)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (measurePending(layoutNode, z11)) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(layoutNode, z11);
    }

    public final boolean getDuringMeasureLayout$ui_release() {
        return this.duringMeasureLayout;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean measureAndLayout(@l x00.a<g2> aVar) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate;
        Throwable th2;
        boolean z11;
        LayoutNode pop;
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z12 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z11 = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean isEmpty = depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                        boolean z13 = !isEmpty;
                        if (isEmpty) {
                            pop = depthSortedSetsForDifferentPasses.set.pop();
                        } else {
                            try {
                                pop = depthSortedSetsForDifferentPasses.lookaheadSet.pop();
                            } catch (Throwable th3) {
                                th2 = th3;
                                measureAndLayoutDelegate = this;
                                measureAndLayoutDelegate.duringMeasureLayout = false;
                                measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                                throw th2;
                            }
                        }
                        LayoutNode layoutNode = pop;
                        measureAndLayoutDelegate = this;
                        try {
                            boolean remeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(measureAndLayoutDelegate, layoutNode, z13, false, 4, null);
                            if (layoutNode == this.root && remeasureAndRelayoutIfNeeded$default) {
                                z11 = true;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            measureAndLayoutDelegate.duringMeasureLayout = false;
                            measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                            throw th2;
                        }
                    }
                    measureAndLayoutDelegate = this;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    measureAndLayoutDelegate = this;
                    z11 = false;
                }
                measureAndLayoutDelegate.duringMeasureLayout = false;
                measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = measureAndLayoutDelegate.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z12 = z11;
            } catch (Throwable th5) {
                th = th5;
                measureAndLayoutDelegate = this;
            }
        }
        callOnLayoutCompletedListeners();
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4067measureAndLayout0kLqBqw(@m80.k androidx.compose.ui.node.LayoutNode r4, long r5) {
        /*
            r3 = this;
            boolean r0 = r4.isDeactivated()
            if (r0 == 0) goto L7
            return
        L7:
            androidx.compose.ui.node.LayoutNode r0 = r3.root
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "measureAndLayout called on root"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r0)
        L14:
            androidx.compose.ui.node.LayoutNode r0 = r3.root
            boolean r0 = r0.isAttached()
            if (r0 != 0) goto L21
            java.lang.String r0 = "performMeasureAndLayout called with unattached root"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r0)
        L21:
            androidx.compose.ui.node.LayoutNode r0 = r3.root
            boolean r0 = r0.isPlaced()
            if (r0 != 0) goto L2e
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r0)
        L2e:
            boolean r0 = r3.duringMeasureLayout
            if (r0 == 0) goto L37
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r0)
        L37:
            androidx.compose.ui.unit.Constraints r0 = r3.rootConstraints
            if (r0 == 0) goto L9a
            r0 = 1
            r3.duringMeasureLayout = r0
            r0 = 0
            r3.duringFullMeasureLayoutPass = r0
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r1 = r3.relayoutNodes     // Catch: java.lang.Throwable -> L57
            r1.remove(r4)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.unit.Constraints r1 = androidx.compose.ui.unit.Constraints.m5055boximpl(r5)     // Catch: java.lang.Throwable -> L57
            boolean r1 = r3.m4065doLookaheadRemeasuresdFAvZA(r4, r1)     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L59
            boolean r1 = r4.getLookaheadLayoutPending$ui_release()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L68
            goto L59
        L57:
            r4 = move-exception
            goto L95
        L59:
            java.lang.Boolean r1 = r4.isPlacedInLookahead()     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L57
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L68
            r4.lookaheadReplace$ui_release()     // Catch: java.lang.Throwable -> L57
        L68:
            r3.ensureSubtreeLookaheadReplaced(r4)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.unit.Constraints r5 = androidx.compose.ui.unit.Constraints.m5055boximpl(r5)     // Catch: java.lang.Throwable -> L57
            r3.m4066doRemeasuresdFAvZA(r4, r5)     // Catch: java.lang.Throwable -> L57
            boolean r5 = r4.getLayoutPending$ui_release()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L86
            boolean r5 = r4.isPlaced()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L86
            r4.replace$ui_release()     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.node.OnPositionedDispatcher r5 = r3.onPositionedDispatcher     // Catch: java.lang.Throwable -> L57
            r5.onNodePositioned(r4)     // Catch: java.lang.Throwable -> L57
        L86:
            r3.drainPostponedMeasureRequests()     // Catch: java.lang.Throwable -> L57
            r3.duringMeasureLayout = r0
            r3.duringFullMeasureLayoutPass = r0
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r4 = r3.consistencyChecker
            if (r4 == 0) goto L9a
            r4.assertConsistent()
            goto L9a
        L95:
            r3.duringMeasureLayout = r0
            r3.duringFullMeasureLayoutPass = r0
            throw r4
        L9a:
            r3.callOnLayoutCompletedListeners()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.m4067measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode, long):void");
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.isEmpty(true)) {
                        if (this.root.getLookaheadRoot$ui_release() != null) {
                            remeasureOnly(this.root, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(this.root);
                        }
                    }
                    remeasureOnly(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (Throwable th2) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th2;
                }
            }
        }
    }

    public final void onNodeDetached(@k LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
        this.onPositionedDispatcher.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(@k Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    public final boolean requestLookaheadRelayout(@k LayoutNode layoutNode, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z11) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (g0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, true);
            } else if (layoutNode.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
        }
        return false;
    }

    public final boolean requestLookaheadRemeasure(@k LayoutNode layoutNode, boolean z11) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (!(layoutNode.getLookaheadRoot$ui_release() != null)) {
            InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.getLookaheadMeasurePending$ui_release() && !z11) {
                    return false;
                }
                layoutNode.markLookaheadMeasurePending$ui_release();
                layoutNode.markMeasurePending$ui_release();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if ((g0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode, true);
                } else if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z11));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(@k LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(@k LayoutNode layoutNode, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
            return false;
        }
        if (i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z11 && layoutNode.isPlaced() == layoutNode.isPlacedByParent() && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
            return false;
        }
        layoutNode.markLayoutPending$ui_release();
        if (!layoutNode.isDeactivated() && layoutNode.isPlacedByParent()) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release())) {
                this.relayoutNodes.add(layoutNode, false);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    public final boolean requestRemeasure(@k LayoutNode layoutNode, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.getMeasurePending$ui_release() && !z11) {
                    return false;
                }
                layoutNode.markMeasurePending$ui_release();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if (!layoutNode.isPlaced() && !getCanAffectParent(layoutNode)) {
                    return false;
                }
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) {
                    this.relayoutNodes.add(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z11));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void setDuringMeasureLayout$ui_release(boolean z11) {
        this.duringMeasureLayout = z11;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m4068updateRootConstraintsBRTryo0(long j11) {
        Constraints constraints = this.rootConstraints;
        if (constraints == null ? false : Constraints.m5061equalsimpl0(constraints.m5074unboximpl(), j11)) {
            return;
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.rootConstraints = Constraints.m5055boximpl(j11);
        if (this.root.getLookaheadRoot$ui_release() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui_release() != null);
    }
}
