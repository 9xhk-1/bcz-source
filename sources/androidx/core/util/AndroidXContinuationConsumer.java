package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {

    @k
    private final j00.c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(@k j00.c<? super T> cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // androidx.core.util.Consumer
    public void accept(T t11) {
        if (compareAndSet(false, true)) {
            j00.c<T> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(t11));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @k
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
