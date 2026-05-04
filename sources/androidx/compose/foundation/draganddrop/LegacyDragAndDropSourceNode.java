package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;

    @k
    private p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> dragAndDropSourceHandler;

    @k
    private l<? super DrawScope, g2> drawDragDecoration;
    private long size = IntSize.Companion.m5291getZeroYbymL2g();

    public LegacyDragAndDropSourceNode(@k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
        final DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode());
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00471 implements DragAndDropSourceScope, PointerInputScope {
                private final /* synthetic */ PointerInputScope $$delegate_0;
                final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
                final /* synthetic */ LegacyDragAndDropSourceNode this$0;

                public C00471(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
                    this.$dragAndDropModifierNode = dragAndDropModifierNode;
                    this.this$0 = legacyDragAndDropSourceNode;
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
                /* renamed from: getExtendedTouchPadding-NH-jbRc */
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
                /* renamed from: getSize-YbymL2g */
                public long mo368getSizeYbymL2g() {
                    return this.$$delegate_0.mo368getSizeYbymL2g();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public ViewConfiguration getViewConfiguration() {
                    return this.$$delegate_0.getViewConfiguration();
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: roundToPx--R2X_6o */
                public int mo370roundToPxR2X_6o(long j11) {
                    return this.$$delegate_0.mo370roundToPxR2X_6o(j11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: roundToPx-0680j_4 */
                public int mo371roundToPx0680j_4(float f11) {
                    return this.$$delegate_0.mo371roundToPx0680j_4(f11);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public void setInterceptOutOfBoundsChildEvents(boolean z11) {
                    this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z11);
                }

                @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
                public void startTransfer(DragAndDropTransferData dragAndDropTransferData) {
                    this.$dragAndDropModifierNode.mo2106drag12SF9DM(dragAndDropTransferData, IntSizeKt.m5298toSizeozmzZPI(mo368getSizeYbymL2g()), this.this$0.getDrawDragDecoration());
                }

                @Override // androidx.compose.ui.unit.FontScaling
                @Stable
                /* renamed from: toDp-GaN1DYA */
                public float mo372toDpGaN1DYA(long j11) {
                    return this.$$delegate_0.mo372toDpGaN1DYA(j11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toDp-u2uoSUM */
                public float mo373toDpu2uoSUM(float f11) {
                    return this.$$delegate_0.mo373toDpu2uoSUM(f11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toDpSize-k-rfVVM */
                public long mo375toDpSizekrfVVM(long j11) {
                    return this.$$delegate_0.mo375toDpSizekrfVVM(j11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toPx--R2X_6o */
                public float mo376toPxR2X_6o(long j11) {
                    return this.$$delegate_0.mo376toPxR2X_6o(j11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toPx-0680j_4 */
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
                /* renamed from: toSize-XkaWNTQ */
                public long mo378toSizeXkaWNTQ(long j11) {
                    return this.$$delegate_0.mo378toSizeXkaWNTQ(j11);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                @Stable
                /* renamed from: toSp-0xMU5do */
                public long mo379toSp0xMU5do(float f11) {
                    return this.$$delegate_0.mo379toSp0xMU5do(f11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toSp-kPz2Gy4 */
                public long mo380toSpkPz2Gy4(float f11) {
                    return this.$$delegate_0.mo380toSpkPz2Gy4(f11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toDp-u2uoSUM */
                public float mo374toDpu2uoSUM(int i11) {
                    return this.$$delegate_0.mo374toDpu2uoSUM(i11);
                }

                @Override // androidx.compose.ui.unit.Density
                @Stable
                /* renamed from: toSp-kPz2Gy4 */
                public long mo381toSpkPz2Gy4(int i11) {
                    return this.$$delegate_0.mo381toSpkPz2Gy4(i11);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
                Object invoke = LegacyDragAndDropSourceNode.this.getDragAndDropSourceHandler().invoke(new C00471(pointerInputScope, dragAndDropModifierNode, LegacyDragAndDropSourceNode.this), cVar);
                return invoke == b.l() ? invoke : g2.f100423a;
            }
        }));
    }

    @k
    public final p<DragAndDropSourceScope, c<? super g2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @k
    public final l<DrawScope, g2> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        this.size = j11;
    }

    public final void setDragAndDropSourceHandler(@k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    public final void setDrawDragDecoration(@k l<? super DrawScope, g2> lVar) {
        this.drawDragDecoration = lVar;
    }
}
