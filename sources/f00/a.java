package f00;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import o00.f;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "LocksKt")
@u0({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    @f
    public static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, x00.a<? extends T> action) {
        g0.p(reentrantReadWriteLock, "<this>");
        g0.p(action, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return action.invoke();
        } finally {
            d0.d(1);
            readLock.unlock();
            d0.c(1);
        }
    }

    @f
    public static final <T> T b(Lock lock, x00.a<? extends T> action) {
        g0.p(lock, "<this>");
        g0.p(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            d0.d(1);
            lock.unlock();
            d0.c(1);
        }
    }

    @f
    public static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, x00.a<? extends T> action) {
        g0.p(reentrantReadWriteLock, "<this>");
        g0.p(action, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            d0.d(1);
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            d0.c(1);
        }
    }
}
