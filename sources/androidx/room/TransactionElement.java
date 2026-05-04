package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class TransactionElement implements d.b {

    @m80.k
    public static final Key Key = new Key(null);

    @m80.k
    private final AtomicInteger referenceCount;

    @m80.k
    private final kotlin.coroutines.c transactionDispatcher;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements d.c<TransactionElement> {
        public /* synthetic */ Key(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Key() {
        }
    }

    public TransactionElement(@m80.k kotlin.coroutines.c transactionDispatcher) {
        g0.p(transactionDispatcher, "transactionDispatcher");
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    public d.c<TransactionElement> getKey() {
        return Key;
    }

    @m80.k
    public final kotlin.coroutines.c getTransactionDispatcher$room_runtime_release() {
        return this.transactionDispatcher;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return d.b.a.d(this, dVar);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
