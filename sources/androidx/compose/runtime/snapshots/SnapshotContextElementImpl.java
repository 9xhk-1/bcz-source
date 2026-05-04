package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import c40.m3;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, m3<Snapshot> {
    public static final int $stable = 8;

    @k
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(@k Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @k
    public d.c<?> getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d dVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, dVar);
    }

    @Override // c40.m3
    public void restoreThreadContext(@k d dVar, @l Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.m3
    @l
    public Snapshot updateThreadContext(@k d dVar) {
        return this.snapshot.unsafeEnter();
    }
}
