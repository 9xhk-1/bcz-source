package c40;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class s3 {
    @c1
    @m80.k
    public static final v1 b(final int i11, @m80.k final String str) {
        if (i11 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return x1.d(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(i11, new ThreadFactory() { // from class: c40.r3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread c11;
                    c11 = s3.c(i11, str, atomicInteger, runnable);
                    return c11;
                }
            })));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i11 + " specified").toString());
    }

    public static final Thread c(int i11, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i11 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
