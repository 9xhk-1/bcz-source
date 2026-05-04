package androidx.compose.runtime.snapshots;

import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import y00.f;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, f {
    final /* synthetic */ Ref.IntRef $current;
    final /* synthetic */ SubList<T> this$0;

    public SubList$listIterator$1(Ref.IntRef intRef, SubList<T> subList) {
        this.$current = intRef;
        this.this$0 = subList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        add((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$current.element < this.this$0.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$current.element >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i11 = this.$current.element + 1;
        SnapshotStateListKt.validateRange(i11, this.this$0.size());
        this.$current.element = i11;
        return this.this$0.get(i11);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.element + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i11 = this.$current.element;
        SnapshotStateListKt.validateRange(i11, this.this$0.size());
        this.$current.element = i11 - 1;
        return this.this$0.get(i11);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        set((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator
    public Void add(T t11) {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator
    public Void set(T t11) {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }
}
