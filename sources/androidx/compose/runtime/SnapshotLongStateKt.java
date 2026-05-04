package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(@k LongState longState, @l Object obj, @k n<?> nVar) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, nVar);
    }

    @StateFactoryMarker
    @k
    public static final MutableLongState mutableLongStateOf(long j11) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j11);
    }

    public static final void setValue(@k MutableLongState mutableLongState, @l Object obj, @k n<?> nVar, long j11) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, nVar, j11);
    }
}
