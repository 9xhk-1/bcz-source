package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(@k FloatState floatState, @l Object obj, @k n<?> nVar) {
        return floatState.getFloatValue();
    }

    @StateFactoryMarker
    @k
    public static final MutableFloatState mutableFloatStateOf(float f11) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f11);
    }

    public static final void setValue(@k MutableFloatState mutableFloatState, @l Object obj, @k n<?> nVar, float f11) {
        mutableFloatState.setFloatValue(f11);
    }
}
