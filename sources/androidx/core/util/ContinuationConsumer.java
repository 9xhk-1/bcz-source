package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes2.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {

    @k
    private final j00.c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(@k j00.c<? super T> cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // java.util.function.Consumer
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
