package cn.com.chinatelecom.account.api.b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class d extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f8901a = new LinkedBlockingQueue(256);

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadFactory f8902b = new ThreadFactory() { // from class: cn.com.chinatelecom.account.api.b.d.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f8903a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable);
        }
    };

    public d() {
        this(5);
    }

    public void a(e eVar) {
        execute(eVar);
    }

    public d(int i11) {
        this(i11, i11 * 2, 1L, TimeUnit.SECONDS, f8901a, f8902b);
    }

    public d(int i11, int i12, long j11, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i11, i12, j11, timeUnit, blockingQueue, threadFactory);
    }
}
