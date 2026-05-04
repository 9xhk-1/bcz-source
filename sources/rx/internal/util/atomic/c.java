package rx.internal.util.atomic;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c<E> extends b<E> {
    public c() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        g(linkedQueueNode);
        j(linkedQueueNode);
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e11);
        j(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> a11 = a();
        LinkedQueueNode<E> lvNext2 = a11.lvNext();
        if (lvNext2 != null) {
            return lvNext2.lpValue();
        }
        if (a11 == f()) {
            return null;
        }
        do {
            lvNext = a11.lvNext();
        } while (lvNext == null);
        return lvNext.lpValue();
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> a11 = a();
        LinkedQueueNode<E> lvNext2 = a11.lvNext();
        if (lvNext2 != null) {
            E andNullValue = lvNext2.getAndNullValue();
            g(lvNext2);
            return andNullValue;
        }
        if (a11 == f()) {
            return null;
        }
        do {
            lvNext = a11.lvNext();
        } while (lvNext == null);
        E andNullValue2 = lvNext.getAndNullValue();
        g(lvNext);
        return andNullValue2;
    }
}
