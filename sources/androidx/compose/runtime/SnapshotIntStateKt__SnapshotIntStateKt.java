package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(@k IntState intState, @l Object obj, @k n<?> nVar) {
        return intState.getIntValue();
    }

    @StateFactoryMarker
    @k
    public static final MutableIntState mutableIntStateOf(int i11) {
        return SnapshotIntState_androidKt.createSnapshotMutableIntState(i11);
    }

    public static final void setValue(@k MutableIntState mutableIntState, @l Object obj, @k n<?> nVar, int i11) {
        mutableIntState.setIntValue(i11);
    }
}
