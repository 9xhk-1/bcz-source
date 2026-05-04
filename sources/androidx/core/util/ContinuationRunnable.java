package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {

    @k
    private final j00.c<g2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(@k j00.c<? super g2> cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            j00.c<g2> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @k
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
