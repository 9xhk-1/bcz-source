package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.u0;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,51:1\n45#2,5:52\n*S KotlinDebug\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n*L\n44#1:52,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, d {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i11) {
        this.size = i11;
    }

    public abstract T elementAt(int i11);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T elementAt = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return elementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            RuntimeHelpersKt.throwIllegalStateException("Call next() before removing an element.");
        }
        int i11 = this.index - 1;
        this.index = i11;
        removeAt(i11);
        this.size--;
        this.canRemove = false;
    }

    public abstract void removeAt(int i11);
}
