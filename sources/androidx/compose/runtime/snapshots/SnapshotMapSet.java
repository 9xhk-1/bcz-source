package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.internal.u;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class SnapshotMapSet<K, V, E> implements Set<E>, h {

    @k
    private final SnapshotStateMap<K, V> map;

    public SnapshotMapSet(@k SnapshotStateMap<K, V> snapshotStateMap) {
        this.map = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    @k
    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }
}
