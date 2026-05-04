package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class b<E> extends d<E> {
    public static final long H = n0.a(b.class, "consumerNode");
    protected LinkedQueueNode<E> consumerNode;

    public final LinkedQueueNode<E> f() {
        return this.consumerNode;
    }

    public final LinkedQueueNode<E> g() {
        return (LinkedQueueNode) n0.f86883a.getObjectVolatile(this, H);
    }

    public final void h(LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }
}
