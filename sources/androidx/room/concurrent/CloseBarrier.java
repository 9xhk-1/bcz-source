package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCloseBarrier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrier\n+ 2 Synchronized.jvmAndroid.kt\nandroidx/room/concurrent/Synchronized_jvmAndroidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Atomics.kt\nandroidx/room/concurrent/AtomicsKt\n*L\n1#1,106:1\n22#2:107\n22#2:108\n22#2:110\n1#3:109\n40#4,2:111\n*S KotlinDebug\n*F\n+ 1 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrier\n*L\n53#1:107\n69#1:108\n83#1:110\n89#1:111,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CloseBarrier {

    @k
    private final AtomicInteger blockers;

    @k
    private final a<g2> closeAction;

    @k
    private final AtomicBoolean closeInitiated;

    public CloseBarrier(@k a<g2> closeAction) {
        g0.p(closeAction, "closeAction");
        this.closeAction = closeAction;
        this.blockers = new AtomicInteger(0);
        this.closeInitiated = new AtomicBoolean(false);
    }

    private final boolean isClosed() {
        return this.closeInitiated.get();
    }

    public final boolean block$room_runtime_release() {
        synchronized (this) {
            if (isClosed()) {
                return false;
            }
            this.blockers.incrementAndGet();
            return true;
        }
    }

    public final void close$room_runtime_release() {
        synchronized (this) {
            if (this.closeInitiated.compareAndSet(false, true)) {
                g2 g2Var = g2.f100423a;
                while (this.blockers.get() != 0) {
                }
                this.closeAction.invoke();
            }
        }
    }

    public final void unblock$room_runtime_release() {
        synchronized (this) {
            this.blockers.decrementAndGet();
            if (this.blockers.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            g2 g2Var = g2.f100423a;
        }
    }
}
