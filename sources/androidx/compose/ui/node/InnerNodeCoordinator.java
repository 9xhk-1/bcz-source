package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 7 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,250:1\n311#2,2:251\n207#3:253\n423#4,9:254\n423#4,9:264\n208#4,8:276\n1#5:263\n139#6:273\n241#7,2:274\n243#7,2:284\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n120#1:251,2\n123#1:253\n123#1:254,9\n175#1:264,9\n213#1:276,8\n201#1:273\n209#1:274,2\n209#1:284,2\n*E\n"})
/* loaded from: classes2.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Paint innerBoundsPaint;

    @l
    private LookaheadDelegate lookaheadDelegate;

    @k
    private final TailModifierNode tail;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n480#2,2:251\n482#2:263\n207#3:253\n423#4,9:254\n1#5:264\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:251,2\n74#1:263\n77#1:253\n77#1:254,9\n*E\n"})
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@k AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().set(alignmentLine, intValue);
            return intValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i11) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(i11);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i11) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(i11);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @k
        /* renamed from: measure-BRTryo0 */
        public Placeable mo3857measureBRTryo0(long j11) {
            m3920setMeasurementConstraintsBRTryo0(j11);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i11].getLookaheadPassDelegate$ui_release();
                g0.m(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo33measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j11));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i11) {
            return getLayoutNode().minLookaheadIntrinsicHeight(i11);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i11) {
            return getLayoutNode().minLookaheadIntrinsicWidth(i11);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public void placeChildren() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            g0.m(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2388setColor8_81llA(Color.Companion.m2543getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2392setStylek9PVt8s(PaintingStyle.Companion.m2777getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    public InnerNodeCoordinator(@k LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateImpl() : null;
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui_release()) {
            return;
        }
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@k AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @l
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        if ((java.lang.Float.floatToRawIntBits(m4100distanceInMinimumTouchTargettz77jQw(r12, m4103getMinimumTouchTargetSizeNHjbRc())) & Integer.MAX_VALUE) < 2139095040) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4023hitTestChildqzLsGqo(@m80.k androidx.compose.ui.node.NodeCoordinator.HitTestSource r11, long r12, @m80.k androidx.compose.ui.node.HitTestResult r14, int r15, boolean r16) {
        /*
            r10 = this;
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            boolean r0 = r11.shouldHitTestChildren(r0)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L39
            boolean r0 = r10.m4112withinLayerBoundsk4lQ0M(r12)
            if (r0 == 0) goto L17
            r6 = r15
            r5 = r16
        L15:
            r0 = r4
            goto L3d
        L17:
            androidx.compose.ui.input.pointer.PointerType$Companion r0 = androidx.compose.ui.input.pointer.PointerType.Companion
            int r0 = r0.m3810getTouchT8wyACA()
            r6 = r15
            boolean r0 = androidx.compose.ui.input.pointer.PointerType.m3803equalsimpl0(r15, r0)
            if (r0 == 0) goto L3a
            long r7 = r10.m4103getMinimumTouchTargetSizeNHjbRc()
            float r0 = r10.m4100distanceInMinimumTouchTargettz77jQw(r12, r7)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r7
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r7) goto L3a
            goto L15
        L39:
            r6 = r15
        L3a:
            r0 = r5
            r5 = r16
        L3d:
            if (r0 == 0) goto L87
            int r7 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r14)
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r0 = r0.getZSortedChildren()
            T[] r8 = r0.content
            int r0 = r0.getSize()
            int r0 = r0 - r4
            r9 = r0
        L53:
            if (r9 < 0) goto L84
            r0 = r8[r9]
            androidx.compose.ui.node.LayoutNode r0 = (androidx.compose.ui.node.LayoutNode) r0
            boolean r4 = r0.isPlaced()
            if (r4 == 0) goto L7e
            r1 = r6
            r6 = r5
            r5 = r1
            r2 = r12
            r4 = r14
            r1 = r0
            r0 = r11
            r0.mo4113childHitTestqzLsGqo(r1, r2, r4, r5, r6)
            boolean r0 = r14.hasHit()
            if (r0 != 0) goto L70
            goto L7f
        L70:
            androidx.compose.ui.node.NodeCoordinator r0 = r1.getOuterCoordinator$ui_release()
            boolean r0 = r0.shouldSharePointerInputWithSiblings()
            if (r0 == 0) goto L84
            r14.acceptHits()
            goto L7f
        L7e:
            r6 = r5
        L7f:
            int r9 = r9 + (-1)
            r5 = r6
            r6 = r15
            goto L53
        L84:
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r14, r7)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.mo4023hitTestChildqzLsGqo(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, int, boolean):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i11) {
        return getLayoutNode().maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i11) {
        return getLayoutNode().maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @k
    /* renamed from: measure-BRTryo0 */
    public Placeable mo3857measureBRTryo0(long j11) {
        if (getForceMeasureWithLookaheadConstraints$ui_release()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            j11 = lookaheadDelegate.m4055getConstraintsmsEJaDk$ui_release();
        }
        m3920setMeasurementConstraintsBRTryo0(j11);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            layoutNodeArr[i11].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo33measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j11));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i11) {
        return getLayoutNode().minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i11) {
        return getLayoutNode().minIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@k Canvas canvas, @l GraphicsLayer graphicsLayer) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.isPlaced()) {
                layoutNode.draw$ui_release(canvas, graphicsLayer);
            }
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3918placeAtf8xVGno(long j11, float f11, @k GraphicsLayer graphicsLayer) {
        super.mo3918placeAtf8xVGno(j11, f11, graphicsLayer);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(@l LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @k
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        super.mo3858placeAtf8xVGno(j11, f11, lVar);
        onAfterPlaceAt();
    }
}
