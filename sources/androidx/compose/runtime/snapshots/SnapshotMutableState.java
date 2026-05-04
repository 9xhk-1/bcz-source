package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SnapshotMutableState<T> extends MutableState<T> {
    @k
    SnapshotMutationPolicy<T> getPolicy();
}
