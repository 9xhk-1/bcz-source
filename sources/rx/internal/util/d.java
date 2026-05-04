package rx.internal.util;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {
    public static void a(CountDownLatch countDownLatch, qb0.h hVar) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e11) {
            hVar.unsubscribe();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e11);
        }
    }
}
