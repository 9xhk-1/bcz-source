package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public final class o<E> extends a<E> {
    public o() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        this.consumerNode = linkedQueueNode;
        j(linkedQueueNode);
    }

    public LinkedQueueNode<E> j(LinkedQueueNode<E> linkedQueueNode) {
        while (true) {
            LinkedQueueNode<E> linkedQueueNode2 = this.producerNode;
            LinkedQueueNode<E> linkedQueueNode3 = linkedQueueNode;
            if (com.google.common.util.concurrent.g.a(n0.f86883a, this, e.f86796q, linkedQueueNode2, linkedQueueNode3)) {
                return linkedQueueNode2;
            }
            linkedQueueNode = linkedQueueNode3;
        }
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
        LinkedQueueNode<E> linkedQueueNode = this.consumerNode;
        LinkedQueueNode<E> lvNext2 = linkedQueueNode.lvNext();
        if (lvNext2 != null) {
            return lvNext2.lpValue();
        }
        if (linkedQueueNode == b()) {
            return null;
        }
        do {
            lvNext = linkedQueueNode.lvNext();
        } while (lvNext == null);
        return lvNext.lpValue();
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> f11 = f();
        LinkedQueueNode<E> lvNext2 = f11.lvNext();
        if (lvNext2 != null) {
            E andNullValue = lvNext2.getAndNullValue();
            h(lvNext2);
            return andNullValue;
        }
        if (f11 == b()) {
            return null;
        }
        do {
            lvNext = f11.lvNext();
        } while (lvNext == null);
        E andNullValue2 = lvNext.getAndNullValue();
        this.consumerNode = lvNext;
        return andNullValue2;
    }
}
