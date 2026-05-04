package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DefaultDraggableState implements DraggableState {

    @k
    private final l<Float, g2> onDelta;

    @k
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f11) {
            DefaultDraggableState.this.getOnDelta().invoke(Float.valueOf(f11));
        }
    };

    @k
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(@k l<? super Float, g2> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f11) {
        this.onDelta.invoke(Float.valueOf(f11));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @m80.l
    public Object drag(@k MutatePriority mutatePriority, @k p<? super DragScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    @k
    public final l<Float, g2> getOnDelta() {
        return this.onDelta;
    }
}
