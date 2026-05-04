package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory NONE = new a();
    private static final long serialVersionUID = -8841098858898482335L;
    final String prefix;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public RxThreadFactory(String str) {
        this.prefix = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.prefix + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
