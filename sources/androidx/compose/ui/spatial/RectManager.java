package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import x00.a;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 12 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,547:1\n1516#2:548\n544#3:549\n540#3:607\n544#3:608\n287#4,6:550\n725#5,7:556\n732#5,4:564\n736#5,7:569\n835#6:563\n810#6:568\n207#7:576\n207#7:592\n423#8,9:577\n423#8,9:593\n54#9:586\n59#9:588\n85#10:587\n90#10:589\n80#10:591\n53#10,3:604\n30#11:590\n159#12:602\n30#13:603\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n*L\n50#1:548\n75#1:549\n425#1:607\n426#1:608\n90#1:550,6\n91#1:556,7\n91#1:564,4\n91#1:569,7\n91#1:563\n91#1:568\n213#1:576\n303#1:592\n213#1:577,9\n303#1:593,9\n249#1:586\n250#1:588\n249#1:587\n250#1:589\n288#1:591\n402#1:604,3\n288#1:590\n402#1:602\n402#1:603\n*E\n"})
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;

    @k
    private final MutableRect cachedRect;

    @k
    private final MutableObjectList<a<g2>> callbacks;

    @k
    private final a<g2> dispatchLambda;

    @l
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;

    @k
    private final IntObjectMap<LayoutNode> layoutNodes;

    @k
    private final RectList rects;
    private long scheduledDispatchDeadline;

    @k
    private final ThrottledCallbacks throttledCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            long mo4052getPositionnOccac = nodeCoordinator.mo4052getPositionnOccac();
            float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac);
            float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac);
            mutableRect.m2253translatek4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(m5243getXimpl) << 32) | (Float.floatToRawIntBits(m5244getYimpl) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            if (layer != null) {
                float[] mo4169getUnderlyingMatrixsQKQjiQ = layer.mo4169getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m2764isIdentity58bKbWc(mo4169getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m2747mapimpl(mo4169getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean z11, int i11, int i12, int i13, int i14) {
        int semanticsId = layoutNode.getSemanticsId();
        if (z11 || !this.rects.move(semanticsId, i11, i12, i13, i14)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, i11, i12, i13, i14, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    /* renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m4344insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long j11, boolean z11) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(IntOffset.m5243getXimpl(j11), IntOffset.m5244getYimpl(j11), IntOffset.m5243getXimpl(j11) + measuredWidth, IntOffset.m5244getYimpl(j11) + measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (z11 || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            m4344insertOrUpdateTransformedNode70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().mo4052getPositionnOccac(), false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m4345outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        int m4351analyzeComponents58bKbWc;
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long m2284getZeroF1C5BW0 = Offset.Companion.m2284getZeroF1C5BW0();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        while (innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release) {
            OwnedLayer layer = innerCoordinator$ui_release.getLayer();
            m2284getZeroF1C5BW0 = IntOffsetKt.m5258plusNvtHpc(m2284getZeroF1C5BW0, innerCoordinator$ui_release.mo4052getPositionnOccac());
            innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
            if (layer != null) {
                float[] mo4169getUnderlyingMatrixsQKQjiQ = layer.mo4169getUnderlyingMatrixsQKQjiQ();
                m4351analyzeComponents58bKbWc = RectManagerKt.m4351analyzeComponents58bKbWc(mo4169getUnderlyingMatrixsQKQjiQ);
                if (m4351analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((m4351analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.Companion.m5253getMaxnOccac();
                    }
                    m2284getZeroF1C5BW0 = Matrix.m2745mapMKHz9U(mo4169getUnderlyingMatrixsQKQjiQ, m2284getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m5260roundk4lQ0M(m2284getZeroF1C5BW0);
    }

    /* renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m4346positionInRootBjo55l4(NodeCoordinator nodeCoordinator) {
        int m4351analyzeComponents58bKbWc;
        long m2284getZeroF1C5BW0 = Offset.Companion.m2284getZeroF1C5BW0();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            m2284getZeroF1C5BW0 = IntOffsetKt.m5258plusNvtHpc(m2284getZeroF1C5BW0, nodeCoordinator.mo4052getPositionnOccac());
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            if (layer != null) {
                float[] mo4169getUnderlyingMatrixsQKQjiQ = layer.mo4169getUnderlyingMatrixsQKQjiQ();
                m4351analyzeComponents58bKbWc = RectManagerKt.m4351analyzeComponents58bKbWc(mo4169getUnderlyingMatrixsQKQjiQ);
                if (m4351analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((m4351analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.Companion.m5253getMaxnOccac();
                    }
                    m2284getZeroF1C5BW0 = Matrix.m2745mapMKHz9U(mo4169getUnderlyingMatrixsQKQjiQ, m2284getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m5260roundk4lQ0M(m2284getZeroF1C5BW0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final RelativeLayoutBounds currentRectInfo(int i11, @k final DelegatableNode delegatableNode) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.rects.withRect(i11, new r<Integer, Integer, Integer, Integer, g2>() { // from class: androidx.compose.ui.spatial.RectManager$currentRectInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return g2.f100423a;
            }

            /* JADX WARN: Type inference failed for: r12v9, types: [T, androidx.compose.ui.spatial.RelativeLayoutBounds] */
            public final void invoke(int i12, int i13, int i14, int i15) {
                ThrottledCallbacks throttledCallbacks;
                ThrottledCallbacks throttledCallbacks2;
                ThrottledCallbacks throttledCallbacks3;
                throttledCallbacks = this.throttledCallbacks;
                long m4360getWindowOffsetnOccac = throttledCallbacks.m4360getWindowOffsetnOccac();
                throttledCallbacks2 = this.throttledCallbacks;
                long m4358getScreenOffsetnOccac = throttledCallbacks2.m4358getScreenOffsetnOccac();
                throttledCallbacks3 = this.throttledCallbacks;
                objectRef.element = ThrottledCallbacksKt.m4366rectInfoForQMZNJw(delegatableNode, (i12 << 32) | (i13 & 4294967295L), (i14 << 32) | (i15 & 4294967295L), m4360getWindowOffsetnOccac, m4358getScreenOffsetnOccac, throttledCallbacks3.m4359getViewToWindowMatrix3i98HWw());
            }
        });
        return (RelativeLayoutBounds) objectRef.element;
    }

    public final void dispatchCallbacks() {
        long currentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z11 = this.isDirty;
        boolean z12 = z11 || this.isScreenOrWindowDirty;
        if (z11) {
            this.isDirty = false;
            MutableObjectList<a<g2>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i11 = mutableObjectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                ((a) objArr[i12]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i13 = rectList.itemsSize;
            for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
                long j11 = jArr[i14 + 2];
                if ((((int) (j11 >> 61)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(67108863 & ((int) j11), jArr[i14], jArr[i14 + 1], currentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(currentTimeMillis);
        }
        if (z12) {
            this.throttledCallbacks.fireGlobalChangeEntries(currentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(currentTimeMillis);
    }

    @k
    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void invalidateCallbacksFor(@k LayoutNode layoutNode) {
        this.isDirty = true;
        this.rects.markUpdated(layoutNode.getSemanticsId());
        scheduleDebounceCallback(true);
    }

    public final boolean isTargetDrawnFirst$ui_release(int i11, int i12) {
        LayoutNode layoutNode;
        LayoutNode parent$ui_release;
        LayoutNode layoutNode2 = this.layoutNodes.get(i11);
        if (layoutNode2 != null && (layoutNode = this.layoutNodes.get(i12)) != null && layoutNode2.getDepth$ui_release() != 0 && layoutNode.getDepth$ui_release() != 0) {
            while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
                layoutNode2 = layoutNode2.getParent$ui_release();
                if (layoutNode2 == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
                layoutNode = layoutNode.getParent$ui_release();
                if (layoutNode == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            LayoutNode layoutNode3 = layoutNode;
            LayoutNode layoutNode4 = layoutNode3;
            LayoutNode layoutNode5 = layoutNode2;
            while (layoutNode2 != layoutNode3) {
                LayoutNode parent$ui_release2 = layoutNode2.getParent$ui_release();
                if (parent$ui_release2 == null || (parent$ui_release = layoutNode3.getParent$ui_release()) == null) {
                    return false;
                }
                layoutNode5 = layoutNode2;
                layoutNode2 = parent$ui_release2;
                layoutNode4 = layoutNode3;
                layoutNode3 = parent$ui_release;
            }
            if (layoutNode5.getMeasurePassDelegate$ui_release().getZIndex$ui_release() == layoutNode4.getMeasurePassDelegate$ui_release().getZIndex$ui_release()) {
                return layoutNode5.getPlaceOrder$ui_release() < layoutNode4.getPlaceOrder$ui_release();
            }
            if (layoutNode5.getMeasurePassDelegate$ui_release().getZIndex$ui_release() < layoutNode4.getMeasurePassDelegate$ui_release().getZIndex$ui_release()) {
                return true;
            }
        }
        return false;
    }

    public final void onLayoutLayerPositionalPropertiesChanged(@k LayoutNode layoutNode) {
        boolean m4352isSetgyyYBs;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long m4345outerToInnerOffsetBjo55l4 = m4345outerToInnerOffsetBjo55l4(layoutNode);
            m4352isSetgyyYBs = RectManagerKt.m4352isSetgyyYBs(m4345outerToInnerOffsetBjo55l4);
            if (!m4352isSetgyyYBs) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            layoutNode.m4040setOuterToInnerOffsetgyyYBs$ui_release(m4345outerToInnerOffsetBjo55l4);
            layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                m4347onLayoutPositionChanged70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().mo4052getPositionnOccac(), false);
            }
            invalidateCallbacksFor(layoutNode);
        }
    }

    /* renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m4347onLayoutPositionChanged70tqf50(@k LayoutNode layoutNode, long j11, boolean z11) {
        long j12;
        long j13;
        boolean m4352isSetgyyYBs;
        boolean m4352isSetgyyYBs2;
        long j14;
        boolean m4352isSetgyyYBs3;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long m4032getOffsetFromRootnOccac$ui_release = layoutNode.m4032getOffsetFromRootnOccac$ui_release();
            long m4031getLastSizeYbymL2g$ui_release = layoutNode.m4031getLastSizeYbymL2g$ui_release();
            int i11 = (int) (m4031getLastSizeYbymL2g$ui_release >> 32);
            int i12 = (int) (m4031getLastSizeYbymL2g$ui_release & 4294967295L);
            boolean z12 = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty$ui_release = parent$ui_release.getOuterToInnerOffsetDirty$ui_release();
                long m4032getOffsetFromRootnOccac$ui_release2 = parent$ui_release.m4032getOffsetFromRootnOccac$ui_release();
                long m4033getOuterToInnerOffsetnOccac$ui_release = parent$ui_release.m4033getOuterToInnerOffsetnOccac$ui_release();
                m4352isSetgyyYBs2 = RectManagerKt.m4352isSetgyyYBs(m4032getOffsetFromRootnOccac$ui_release2);
                if (m4352isSetgyyYBs2) {
                    if (outerToInnerOffsetDirty$ui_release) {
                        j12 = 4294967295L;
                        j14 = m4345outerToInnerOffsetBjo55l4(parent$ui_release);
                        parent$ui_release.m4040setOuterToInnerOffsetgyyYBs$ui_release(j14);
                        parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                    } else {
                        j12 = 4294967295L;
                        j14 = m4033getOuterToInnerOffsetnOccac$ui_release;
                    }
                    m4352isSetgyyYBs3 = RectManagerKt.m4352isSetgyyYBs(j14);
                    z12 = !m4352isSetgyyYBs3;
                    j13 = IntOffset.m5247plusqkQi6aY(IntOffset.m5247plusqkQi6aY(m4032getOffsetFromRootnOccac$ui_release2, j14), j11);
                } else {
                    j12 = 4294967295L;
                    j13 = m4346positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j12 = 4294967295L;
                j13 = j11;
            }
            if (!z12) {
                m4352isSetgyyYBs = RectManagerKt.m4352isSetgyyYBs(j13);
                if (m4352isSetgyyYBs) {
                    layoutNode.m4039setOffsetFromRootgyyYBs$ui_release(j13);
                    layoutNode.m4038setLastSizeozmzZPI$ui_release(IntSize.m5281constructorimpl((measuredWidth << 32) | (measuredHeight & j12)));
                    int m5243getXimpl = IntOffset.m5243getXimpl(j13);
                    int m5244getYimpl = IntOffset.m5244getYimpl(j13);
                    int i13 = m5243getXimpl + measuredWidth;
                    int i14 = m5244getYimpl + measuredHeight;
                    if (!z11 && IntOffset.m5242equalsimpl0(j13, m4032getOffsetFromRootnOccac$ui_release) && i11 == measuredWidth && i12 == measuredHeight) {
                        return;
                    }
                    insertOrUpdate(layoutNode, z11, m5243getXimpl, m5244getYimpl, i13, i14);
                    return;
                }
            }
            m4344insertOrUpdateTransformedNode70tqf50(layoutNode, j11, z11);
        }
    }

    @l
    public final Object registerOnChangedCallback(@k a<g2> aVar) {
        this.callbacks.add(aVar);
        return aVar;
    }

    @k
    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int i11, long j11, long j12, @k DelegatableNode delegatableNode, @k x00.l<? super RelativeLayoutBounds, g2> lVar) {
        return this.throttledCallbacks.registerOnGlobalChange(i11, j11, j12, delegatableNode, lVar);
    }

    @k
    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int i11, long j11, long j12, @k DelegatableNode delegatableNode, @k x00.l<? super RelativeLayoutBounds, g2> lVar) {
        return this.throttledCallbacks.registerOnRectChanged(i11, j11, j12, delegatableNode, lVar);
    }

    public final void remove(@k LayoutNode layoutNode) {
        this.rects.remove(layoutNode.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }

    public final void scheduleDebounceCallback(boolean z11) {
        boolean z12 = (z11 && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z12) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z12) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                Actual_androidKt.removePost(obj);
            }
            long currentTimeMillis = Actual_androidKt.currentTimeMillis();
            long max = Math.max(minDebounceDeadline, 16 + currentTimeMillis);
            this.scheduledDispatchDeadline = max;
            this.dispatchToken = Actual_androidKt.postDelayed(max - currentTimeMillis, this.dispatchLambda);
        }
    }

    public final void unregisterOnChangedCallback(@l Object obj) {
        if ((x0.B(obj, 0) ? (a) obj : null) == null) {
            return;
        }
        this.callbacks.remove(obj);
    }

    /* renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m4348updateOffsetsucfNpQE(long j11, long j12, @k float[] fArr) {
        int m4351analyzeComponents58bKbWc;
        m4351analyzeComponents58bKbWc = RectManagerKt.m4351analyzeComponents58bKbWc(fArr);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((m4351analyzeComponents58bKbWc & 2) != 0) {
            fArr = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m4364updateOffsetsbT0EZQs(j11, j12, fArr) || this.isScreenOrWindowDirty;
    }

    public RectManager(@k IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new a<g2>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
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
                RectManager.this.dispatchToken = null;
                RectManager rectManager = RectManager.this;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    g2 g2Var = g2.f100423a;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i11, v vVar) {
        this((i11 & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }
}
