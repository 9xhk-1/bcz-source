package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/SnapshotThreadLocal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,154:1\n27#2:155\n33#2,2:156\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/SnapshotThreadLocal\n*L\n33#1:155\n52#1:156,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;

    @l
    private T mainThreadValue;

    @k
    private final AtomicReference<ThreadMap> map;

    @k
    private final Object writeMutex;

    public SnapshotThreadLocal() {
        ThreadMap threadMap;
        threadMap = SnapshotThreadLocalKt.emptyThreadMap;
        this.map = new AtomicReference<>(threadMap);
        this.writeMutex = new Object();
    }

    @l
    public final T get() {
        long currentThreadId = Thread_jvmKt.currentThreadId();
        return currentThreadId == Thread_androidKt.getMainThreadId() ? this.mainThreadValue : (T) this.map.get().get(currentThreadId);
    }

    public final void set(@l T t11) {
        long currentThreadId = Thread_jvmKt.currentThreadId();
        if (currentThreadId == Thread_androidKt.getMainThreadId()) {
            this.mainThreadValue = t11;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(currentThreadId, t11)) {
                return;
            }
            this.map.set(threadMap.newWith(currentThreadId, t11));
            g2 g2Var = g2.f100423a;
        }
    }
}
