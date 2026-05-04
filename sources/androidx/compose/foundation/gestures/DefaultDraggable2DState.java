package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.ui.geometry.Offset;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DefaultDraggable2DState implements Draggable2DState {

    @k
    private final l<Offset, g2> onDelta;

    @k
    private final Drag2DScope drag2DScope = new Drag2DScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1
        @Override // androidx.compose.foundation.gestures.Drag2DScope
        /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
        public void mo412dragByk4lQ0M(long j11) {
            DefaultDraggable2DState.this.getOnDelta().invoke(Offset.m2257boximpl(j11));
        }
    };

    @k
    private final MutatorMutex drag2DMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggable2DState(@k l<? super Offset, g2> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    /* renamed from: dispatchRawDelta-k-4lQ0M, reason: not valid java name */
    public void mo411dispatchRawDeltak4lQ0M(long j11) {
        this.onDelta.invoke(Offset.m2257boximpl(j11));
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    @m80.l
    public Object drag(@k MutatePriority mutatePriority, @k p<? super Drag2DScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new DefaultDraggable2DState$drag$2(this, mutatePriority, pVar, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    @k
    public final l<Offset, g2> getOnDelta() {
        return this.onDelta;
    }
}
