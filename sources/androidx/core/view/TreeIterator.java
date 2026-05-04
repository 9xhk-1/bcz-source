package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TreeIterator<T> implements Iterator<T>, y00.a {

    @m80.k
    private final x00.l<T, Iterator<T>> getChildIterator;

    @m80.k
    private Iterator<? extends T> iterator;

    @m80.k
    private final List<Iterator<T>> stack = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public TreeIterator(@m80.k Iterator<? extends T> it, @m80.k x00.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.getChildIterator = lVar;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t11) {
        Iterator<T> invoke = this.getChildIterator.invoke(t11);
        if (invoke != null && invoke.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = invoke;
        } else {
            while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
                this.iterator = (Iterator) a00.r0.u3(this.stack);
                a00.m0.Q0(this.stack);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
