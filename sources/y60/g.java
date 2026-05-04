package y60;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Map<f, Boolean> f99462a;

    public g(int i11, int i12, long j11, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i11, i12, j11, timeUnit, blockingQueue, threadFactory);
        this.f99462a = new ConcurrentHashMap();
    }

    public Set<f> a() {
        return new HashSet(this.f99462a.keySet());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        if (runnable instanceof f) {
            this.f99462a.remove(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof f) {
            this.f99462a.put((f) runnable, Boolean.TRUE);
        }
    }
}
