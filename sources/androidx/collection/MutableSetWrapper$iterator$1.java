package androidx.collection;

import java.util.Iterator;
import q30.q;
import y00.d;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MutableSetWrapper$iterator$1<E> implements Iterator<E>, d {
    private int current = -1;
    private final Iterator<E> iterator;
    final /* synthetic */ MutableSetWrapper<E> this$0;

    public MutableSetWrapper$iterator$1(MutableSetWrapper<E> mutableSetWrapper) {
        this.this$0 = mutableSetWrapper;
        this.iterator = q.a(new MutableSetWrapper$iterator$1$iterator$1(mutableSetWrapper, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<E> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        MutableScatterSet mutableScatterSet;
        if (this.current != -1) {
            mutableScatterSet = ((MutableSetWrapper) this.this$0).parent;
            mutableScatterSet.removeElementAt(this.current);
            this.current = -1;
        }
    }

    public final void setCurrent(int i11) {
        this.current = i11;
    }
}
