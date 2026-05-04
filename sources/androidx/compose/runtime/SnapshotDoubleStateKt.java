package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(@k DoubleState doubleState, @l Object obj, @k n<?> nVar) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, nVar);
    }

    @StateFactoryMarker
    @k
    public static final MutableDoubleState mutableDoubleStateOf(double d11) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d11);
    }

    public static final void setValue(@k MutableDoubleState mutableDoubleState, @l Object obj, @k n<?> nVar, double d11) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, nVar, d11);
    }
}
