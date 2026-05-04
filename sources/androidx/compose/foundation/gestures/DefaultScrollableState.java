package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DefaultScrollableState implements ScrollableState {

    @k
    private final MutableState<Boolean> isLastScrollBackwardState;

    @k
    private final MutableState<Boolean> isLastScrollForwardState;

    @k
    private final MutableState<Boolean> isScrollingState;

    @k
    private final l<Float, Float> onDelta;

    @k
    private final ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f11) {
            MutableState mutableState;
            MutableState mutableState2;
            if (Float.isNaN(f11)) {
                return 0.0f;
            }
            float floatValue = DefaultScrollableState.this.getOnDelta().invoke(Float.valueOf(f11)).floatValue();
            mutableState = DefaultScrollableState.this.isLastScrollForwardState;
            mutableState.setValue(Boolean.valueOf(floatValue > 0.0f));
            mutableState2 = DefaultScrollableState.this.isLastScrollBackwardState;
            mutableState2.setValue(Boolean.valueOf(floatValue < 0.0f));
            return floatValue;
        }
    };

    @k
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(@k l<? super Float, Float> lVar) {
        this.onDelta = lVar;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.onDelta.invoke(Float.valueOf(f11)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @k
    public final l<Float, Float> getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @m80.l
    public Object scroll(@k MutatePriority mutatePriority, @k p<? super ScrollScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }
}
