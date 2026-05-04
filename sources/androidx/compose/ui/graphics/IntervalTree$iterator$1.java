package androidx.compose.ui.graphics;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class IntervalTree$iterator$1<T> implements Iterator<Interval<T>>, y00.a {
    private IntervalTree<T>.Node next;
    final /* synthetic */ IntervalTree<T> this$0;

    public IntervalTree$iterator$1(IntervalTree<T> intervalTree) {
        this.this$0 = intervalTree;
        this.next = intervalTree.root.lowestNode();
    }

    public final IntervalTree<T>.Node getNext() {
        return this.next;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != this.this$0.terminator;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(IntervalTree<T>.Node node) {
        this.next = node;
    }

    @Override // java.util.Iterator
    public Interval<T> next() {
        IntervalTree<T>.Node node = this.next;
        this.next = node.next();
        return node;
    }
}
