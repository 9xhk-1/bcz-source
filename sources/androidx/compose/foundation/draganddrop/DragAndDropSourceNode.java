package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDragAndDropSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropSource.kt\nandroidx/compose/foundation/draganddrop/DragAndDropSourceNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;

    @k
    private p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> detectDragStart;

    @k
    private l<? super DrawScope, g2> drawDragDecoration;

    @m80.l
    private PointerInputModifierNode inputModifierNode;

    @k
    private l<? super Offset, DragAndDropTransferData> transferData;
    private long size = IntSize.Companion.m5291getZeroYbymL2g();

    @k
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) delegate(DragAndDropNodeKt.DragAndDropSourceModifierNode(new p<DragAndDropStartTransferScope, Offset, g2>() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$dragAndDropModifierNode$1
        {
            super(2);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
            m366invokeUv8p0NA(dragAndDropStartTransferScope, offset.m2278unboximpl());
            return g2.f100423a;
        }

        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m366invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j11) {
            long j12;
            DragAndDropTransferData invoke = DragAndDropSourceNode.this.getTransferData().invoke(Offset.m2257boximpl(j11));
            if (invoke != null) {
                j12 = DragAndDropSourceNode.this.size;
                dragAndDropStartTransferScope.mo2105startDragAndDropTransfer12SF9DM(invoke, IntSizeKt.m5298toSizeozmzZPI(j12), DragAndDropSourceNode.this.getDrawDragDecoration());
            }
        }
    }));

    public DragAndDropSourceNode(@k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar, @k l<? super Offset, DragAndDropTransferData> lVar2) {
        this.drawDragDecoration = lVar;
        this.detectDragStart = pVar;
        this.transferData = lVar2;
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    @k
    public final l<DrawScope, g2> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @k
    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.dragAndDropModifierNode.isRequestDragAndDropTransferRequired()) {
            this.inputModifierNode = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements DragAndDropStartDetectorScope, PointerInputScope {
                    private final /* synthetic */ PointerInputScope $$delegate_0;
                    final /* synthetic */ DragAndDropSourceNode this$0;

                    public AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.this$0 = dragAndDropSourceNode;
                        this.$$delegate_0 = pointerInputScope;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public <R> Object awaitPointerEventScope(p<? super AwaitPointerEventScope, ? super c<? super R>, ? extends Object> pVar, c<? super R> cVar) {
                        return this.$$delegate_0.awaitPointerEventScope(pVar, cVar);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float getDensity() {
                        return this.$$delegate_0.getDensity();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
                    public long mo367getExtendedTouchPaddingNHjbRc() {
                        return this.$$delegate_0.mo367getExtendedTouchPaddingNHjbRc();
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    public float getFontScale() {
                        return this.$$delegate_0.getFontScale();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public boolean getInterceptOutOfBoundsChildEvents() {
                        return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long mo368getSizeYbymL2g() {
                        return this.$$delegate_0.mo368getSizeYbymL2g();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo369requestDragAndDropTransferk4lQ0M(long j11) {
                        DragAndDropSourceModifierNode dragAndDropSourceModifierNode;
                        dragAndDropSourceModifierNode = this.this$0.dragAndDropModifierNode;
                        dragAndDropSourceModifierNode.mo2108requestDragAndDropTransferk4lQ0M(j11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo370roundToPxR2X_6o(long j11) {
                        return this.$$delegate_0.mo370roundToPxR2X_6o(j11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo371roundToPx0680j_4(float f11) {
                        return this.$$delegate_0.mo371roundToPx0680j_4(f11);
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z11) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z11);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    @Stable
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo372toDpGaN1DYA(long j11) {
                        return this.$$delegate_0.mo372toDpGaN1DYA(j11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo373toDpu2uoSUM(float f11) {
                        return this.$$delegate_0.mo373toDpu2uoSUM(f11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo375toDpSizekrfVVM(long j11) {
                        return this.$$delegate_0.mo375toDpSizekrfVVM(j11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo376toPxR2X_6o(long j11) {
                        return this.$$delegate_0.mo376toPxR2X_6o(j11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
                    public float mo377toPx0680j_4(float f11) {
                        return this.$$delegate_0.mo377toPx0680j_4(f11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    public Rect toRect(DpRect dpRect) {
                        return this.$$delegate_0.toRect(dpRect);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo378toSizeXkaWNTQ(long j11) {
                        return this.$$delegate_0.mo378toSizeXkaWNTQ(j11);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    @Stable
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo379toSp0xMU5do(float f11) {
                        return this.$$delegate_0.mo379toSp0xMU5do(f11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo380toSpkPz2Gy4(float f11) {
                        return this.$$delegate_0.mo380toSpkPz2Gy4(f11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo374toDpu2uoSUM(int i11) {
                        return this.$$delegate_0.mo374toDpu2uoSUM(i11);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    @Stable
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo381toSpkPz2Gy4(int i11) {
                        return this.$$delegate_0.mo381toSpkPz2Gy4(i11);
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
                    Object invoke = DragAndDropSourceNode.this.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, DragAndDropSourceNode.this), cVar);
                    return invoke == b.l() ? invoke : g2.f100423a;
                }
            }));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PointerInputModifierNode pointerInputModifierNode = this.inputModifierNode;
        if (pointerInputModifierNode != null) {
            undelegate(pointerInputModifierNode);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@k LayoutCoordinates layoutCoordinates) {
        this.dragAndDropModifierNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo365onRemeasuredozmzZPI(long j11) {
        this.size = j11;
        this.dragAndDropModifierNode.mo365onRemeasuredozmzZPI(j11);
    }

    public final void setDetectDragStart(@k p<? super DragAndDropStartDetectorScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.detectDragStart = pVar;
    }

    public final void setDrawDragDecoration(@k l<? super DrawScope, g2> lVar) {
        this.drawDragDecoration = lVar;
    }

    public final void setTransferData(@k l<? super Offset, DragAndDropTransferData> lVar) {
        this.transferData = lVar;
    }
}
