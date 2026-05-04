package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;

    @k
    private q<? super r0, ? super Offset, ? super c<? super g2>, ? extends Object> onDragStarted;

    @k
    private q<? super r0, ? super Float, ? super c<? super g2>, ? extends Object> onDragStopped;

    @k
    private Orientation orientation;
    private boolean reverseDirection;
    private boolean startDragImmediately;

    @k
    private DraggableState state;

    public DraggableNode(@k DraggableState draggableState, @k l<? super PointerInputChange, Boolean> lVar, @k Orientation orientation, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, boolean z12, @k q<? super r0, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, @k q<? super r0, ? super Float, ? super c<? super g2>, ? extends Object> qVar2, boolean z13) {
        super(lVar, z11, mutableInteractionSource, orientation);
        this.state = draggableState;
        this.orientation = orientation;
        this.startDragImmediately = z12;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m458reverseIfNeededAH228Gc(long j11) {
        return Velocity.m5359timesadjELrA(j11, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m459reverseIfNeededMKHz9U(long j11) {
        return Offset.m2275timestuRUvjQ(j11, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @m80.l
    public Object drag(@k p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object drag = this.state.drag(MutatePriority.UserInput, new DraggableNode$drag$2(pVar, this, null), cVar);
        return drag == b.l() ? drag : g2.f100423a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo395onDragStartedk4lQ0M(long j11) {
        q qVar;
        if (isAttached()) {
            q<? super r0, ? super Offset, ? super c<? super g2>, ? extends Object> qVar2 = this.onDragStarted;
            qVar = DraggableKt.NoOpOnDragStarted;
            if (g0.g(qVar2, qVar)) {
                return;
            }
            c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStarted$1(this, j11, null), 1, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo396onDragStoppedTH1AsA0(long j11) {
        q qVar;
        if (isAttached()) {
            q<? super r0, ? super Float, ? super c<? super g2>, ? extends Object> qVar2 = this.onDragStopped;
            qVar = DraggableKt.NoOpOnDragStopped;
            if (g0.g(qVar2, qVar)) {
                return;
            }
            c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStopped$1(this, j11, null), 1, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(@k DraggableState draggableState, @k l<? super PointerInputChange, Boolean> lVar, @k Orientation orientation, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, boolean z12, @k q<? super r0, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, @k q<? super r0, ? super Float, ? super c<? super g2>, ? extends Object> qVar2, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (g0.g(this.state, draggableState)) {
            z14 = false;
        } else {
            this.state = draggableState;
            z14 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z14 = true;
        }
        if (this.reverseDirection != z13) {
            this.reverseDirection = z13;
        } else {
            z15 = z14;
        }
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.startDragImmediately = z12;
        update(lVar, z11, mutableInteractionSource, orientation, z15);
    }
}
