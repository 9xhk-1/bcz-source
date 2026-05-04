package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(@k IntState intState, @l Object obj, @k n<?> nVar) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, nVar);
    }

    @StateFactoryMarker
    @k
    public static final MutableIntState mutableIntStateOf(int i11) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i11);
    }

    public static final void setValue(@k MutableIntState mutableIntState, @l Object obj, @k n<?> nVar, int i11) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, nVar, i11);
    }
}
