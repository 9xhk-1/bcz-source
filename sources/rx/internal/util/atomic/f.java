package rx.internal.util.atomic;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f<E> extends b<E> {
    public f() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        h(linkedQueueNode);
        g(linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e11);
        b().soNext(linkedQueueNode);
        h(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> lvNext = a().lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext = a().lvNext();
        if (lvNext == null) {
            return null;
        }
        E andNullValue = lvNext.getAndNullValue();
        g(lvNext);
        return andNullValue;
    }
}
