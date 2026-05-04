package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class SnapshotApplyResult {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Failure extends SnapshotApplyResult {
        public static final int $stable = 8;

        @k
        private final Snapshot snapshot;

        public Failure(@k Snapshot snapshot) {
            super(null);
            this.snapshot = snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
            this.snapshot.dispose();
            throw new SnapshotApplyConflictException(this.snapshot);
        }

        @k
        public final Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return false;
        }
    }

    public /* synthetic */ SnapshotApplyResult(v vVar) {
        this();
    }

    public abstract void check();

    public abstract boolean getSucceeded();

    private SnapshotApplyResult() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Success extends SnapshotApplyResult {
        public static final int $stable = 0;

        @k
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return true;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
        }
    }
}
