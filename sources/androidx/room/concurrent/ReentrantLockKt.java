package androidx.room.concurrent;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(@k ReentrantLock reentrantLock, @k a<? extends T> block) {
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
}
