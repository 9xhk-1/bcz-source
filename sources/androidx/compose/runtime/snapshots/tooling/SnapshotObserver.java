package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public interface SnapshotObserver {
    @l
    @n(message = "Deprecated and renamed to onPreCreate. This method will be removed before 1.8.0 stable", replaceWith = @w0(expression = "onPreCreate", imports = {}))
    default SnapshotInstanceObservers onCreating(@l Snapshot snapshot, boolean z11) {
        return null;
    }

    @l
    default SnapshotInstanceObservers onPreCreate(@l Snapshot snapshot, boolean z11) {
        return onCreating(snapshot, z11);
    }

    default void onPreDispose(@k Snapshot snapshot) {
        onDisposing(snapshot);
    }

    @n(message = "Deprecated and renamed to onPreDispose. This method will be removed before 1.8.0 stable", replaceWith = @w0(expression = "onPreDispose", imports = {}))
    default void onDisposing(@k Snapshot snapshot) {
    }

    default void onApplied(@k Snapshot snapshot, @k Set<? extends Object> set) {
    }

    default void onCreated(@k Snapshot snapshot, @l Snapshot snapshot2, @l SnapshotInstanceObservers snapshotInstanceObservers) {
    }
}
