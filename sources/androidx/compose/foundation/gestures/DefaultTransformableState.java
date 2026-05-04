package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {

    @k
    private final q<Float, Offset, Float, g2> onTransformation;

    @k
    private final TransformScope transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public void mo413transformByd4ec7I(float f11, long j11, float f12) {
            DefaultTransformableState.this.getOnTransformation().invoke(Float.valueOf(f11), Offset.m2257boximpl(j11), Float.valueOf(f12));
        }
    };

    @k
    private final MutatorMutex transformMutex = new MutatorMutex();

    @k
    private final MutableState<Boolean> isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(@k q<? super Float, ? super Offset, ? super Float, g2> qVar) {
        this.onTransformation = qVar;
    }

    @k
    public final q<Float, Offset, Float, g2> getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    @l
    public Object transform(@k MutatePriority mutatePriority, @k p<? super TransformScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new DefaultTransformableState$transform$2(this, mutatePriority, pVar, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }
}
