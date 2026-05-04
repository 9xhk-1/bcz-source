package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class e<E> extends c<E> {

    /* renamed from: q, reason: collision with root package name */
    public static final long f86796q = n0.a(e.class, "producerNode");
    protected LinkedQueueNode<E> producerNode;

    public final LinkedQueueNode<E> a() {
        return this.producerNode;
    }

    public final LinkedQueueNode<E> b() {
        return (LinkedQueueNode) n0.f86883a.getObjectVolatile(this, f86796q);
    }

    public final void d(LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }
}
