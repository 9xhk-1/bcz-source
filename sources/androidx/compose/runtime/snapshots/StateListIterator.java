package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;
import y00.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n1#2:540\n*E\n"})
/* loaded from: classes.dex */
final class StateListIterator<T> implements ListIterator<T>, f {
    private int index;
    private int lastRequested = -1;

    @k
    private final SnapshotStateList<T> list;
    private int structure;

    public StateListIterator(@k SnapshotStateList<T> snapshotStateList, int i11) {
        this.list = snapshotStateList;
        this.index = i11 - 1;
        this.structure = snapshotStateList.getStructure$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t11) {
        validateModification();
        this.list.add(this.index + 1, t11);
        this.lastRequested = -1;
        this.index++;
        this.structure = this.list.getStructure$runtime_release();
    }

    @k
    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i11 = this.index + 1;
        this.lastRequested = i11;
        SnapshotStateListKt.validateRange(i11, this.list.size());
        T t11 = this.list.get(i11);
        this.index = i11;
        return t11;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i11 = this.index;
        this.lastRequested = i11;
        this.index--;
        return this.list.get(i11);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.lastRequested = -1;
        this.structure = this.list.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t11) {
        validateModification();
        int i11 = this.lastRequested;
        if (i11 < 0) {
            SnapshotStateListKt.invalidIteratorSet();
            throw new KotlinNothingValueException();
        }
        this.list.set(i11, t11);
        this.structure = this.list.getStructure$runtime_release();
    }
}
