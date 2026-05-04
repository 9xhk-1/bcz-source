package z;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {
    public static final <T> T a(@m80.k ReentrantLock reentrantLock, @m80.k x00.a<? extends T> block) {
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
