package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,329:1\n150#2:330\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n*L\n306#1:330\n*E\n"})
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;

    @k
    private l<? super Offset, g2> onDragStarted;

    @k
    private l<? super Velocity, g2> onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;

    @k
    private Draggable2DState state;

    public Draggable2DNode(@k Draggable2DState draggable2DState, @k l<? super PointerInputChange, Boolean> lVar, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, boolean z12, boolean z13, @k l<? super Offset, g2> lVar2, @k l<? super Velocity, g2> lVar3) {
        super(lVar, z11, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z12;
        this.reverseDirection = z13;
        this.onDragStarted = lVar2;
        this.onDragStopped = lVar3;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m448reverseIfNeededMKHz9U(long j11) {
        return this.reverseDirection ? Offset.m2260constructorimpl(j11 ^ (-9223372034707292160L)) : j11;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @m80.l
    public Object drag(@k p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object drag = this.state.drag(MutatePriority.UserInput, new Draggable2DNode$drag$2(pVar, this, null), cVar);
        return drag == b.l() ? drag : g2.f100423a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo395onDragStartedk4lQ0M(long j11) {
        this.onDragStarted.invoke(Offset.m2257boximpl(j11));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo396onDragStoppedTH1AsA0(long j11) {
        this.onDragStopped.invoke(Velocity.m5344boximpl(j11));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(@k Draggable2DState draggable2DState, @k l<? super PointerInputChange, Boolean> lVar, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, boolean z12, boolean z13, @k l<? super Offset, g2> lVar2, @k l<? super Velocity, g2> lVar3) {
        boolean z14;
        boolean z15 = true;
        if (g0.g(this.state, draggable2DState)) {
            z14 = false;
        } else {
            this.state = draggable2DState;
            z14 = true;
        }
        if (this.reverseDirection != z13) {
            this.reverseDirection = z13;
        } else {
            z15 = z14;
        }
        this.onDragStarted = lVar2;
        this.onDragStopped = lVar3;
        this.startDragImmediately = z12;
        update(lVar, z11, mutableInteractionSource, null, z15);
    }
}
