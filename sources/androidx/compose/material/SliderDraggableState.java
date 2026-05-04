package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1290:1\n85#2:1291\n113#2,2:1292\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n*L\n1267#1:1291\n1267#1:1292,2\n*E\n"})
/* loaded from: classes.dex */
final class SliderDraggableState implements DraggableState {

    @k
    private final l<Float, g2> onDelta;

    @k
    private final MutableState isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @k
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f11) {
            SliderDraggableState.this.getOnDelta().invoke(Float.valueOf(f11));
        }
    };

    @k
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState(@k l<? super Float, g2> lVar) {
        this.onDelta = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z11) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z11));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f11) {
        this.onDelta.invoke(Float.valueOf(f11));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @m80.l
    public Object drag(@k MutatePriority mutatePriority, @k p<? super DragScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new SliderDraggableState$drag$2(this, mutatePriority, pVar, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    @k
    public final l<Float, g2> getOnDelta() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }
}
