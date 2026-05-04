package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(@k FloatState floatState, @l Object obj, @k n<?> nVar) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, nVar);
    }

    @StateFactoryMarker
    @k
    public static final MutableFloatState mutableFloatStateOf(float f11) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f11);
    }

    public static final void setValue(@k MutableFloatState mutableFloatState, @l Object obj, @k n<?> nVar, float f11) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, nVar, f11);
    }
}
