package oz;

import io.ktor.utils.io.b0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @b0
    @k
    public static final ReentrantLock c() {
        return new ReentrantLock();
    }

    @b0
    public static final <T> T d(@k Object lock, @k x00.a<? extends T> block) {
        T invoke;
        g0.p(lock, "lock");
        g0.p(block, "block");
        synchronized (lock) {
            try {
                invoke = block.invoke();
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        return invoke;
    }

    @b0
    public static final <T> T e(@k ReentrantLock reentrantLock, @k x00.a<? extends T> block) {
        g0.p(reentrantLock, "<this>");
        g0.p(block, "block");
        reentrantLock.lock();
        try {
            return block.invoke();
        } finally {
            d0.d(1);
            reentrantLock.unlock();
            d0.c(1);
        }
    }

    @b0
    public static /* synthetic */ void a() {
    }

    @b0
    public static /* synthetic */ void b() {
    }
}
