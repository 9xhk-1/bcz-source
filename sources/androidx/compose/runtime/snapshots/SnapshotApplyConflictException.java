package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;

    @k
    private final Snapshot snapshot;

    public SnapshotApplyConflictException(@k Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @k
    public final Snapshot getSnapshot() {
        return this.snapshot;
    }
}
