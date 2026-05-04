package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n+ 2 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n28#2,5:605\n28#2,3:610\n32#2:615\n28#2,3:616\n32#2:621\n28#2,5:622\n28#2,5:627\n13423#3,2:613\n13423#3,2:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n*L\n508#1:605,5\n530#1:610,3\n530#1:615\n545#1:616,3\n545#1:621\n559#1:622,5\n565#1:627,5\n532#1:613,2\n547#1:619,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ObservedTableStates {

    @m80.k
    private final ReentrantLock lock = new ReentrantLock();
    private boolean needsSync;

    @m80.k
    private final boolean[] tableObservedState;

    @m80.k
    private final long[] tableObserversCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ObserveOp {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ ObserveOp[] $VALUES;
        public static final ObserveOp NO_OP = new ObserveOp("NO_OP", 0);
        public static final ObserveOp ADD = new ObserveOp("ADD", 1);
        public static final ObserveOp REMOVE = new ObserveOp("REMOVE", 2);

        private static final /* synthetic */ ObserveOp[] $values() {
            return new ObserveOp[]{NO_OP, ADD, REMOVE};
        }

        static {
            ObserveOp[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private ObserveOp(String str, int i11) {
        }

        @m80.k
        public static m00.a<ObserveOp> getEntries() {
            return $ENTRIES;
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) $VALUES.clone();
        }
    }

    public ObservedTableStates(int i11) {
        this.tableObserversCount = new long[i11];
        this.tableObservedState = new boolean[i11];
    }

    public final void forceNeedSync$room_runtime_release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            g2 g2Var = g2.f100423a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @m80.l
    public final ObserveOp[] getTablesToSync$room_runtime_release() {
        ObserveOp observeOp;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.needsSync) {
                reentrantLock.unlock();
                return null;
            }
            this.needsSync = false;
            int length = this.tableObserversCount.length;
            ObserveOp[] observeOpArr = new ObserveOp[length];
            int i11 = 0;
            boolean z11 = false;
            while (i11 < length) {
                boolean z12 = true;
                boolean z13 = this.tableObserversCount[i11] > 0;
                boolean[] zArr = this.tableObservedState;
                if (z13 != zArr[i11]) {
                    zArr[i11] = z13;
                    observeOp = z13 ? ObserveOp.ADD : ObserveOp.REMOVE;
                } else {
                    z12 = z11;
                    observeOp = ObserveOp.NO_OP;
                }
                observeOpArr[i11] = observeOp;
                i11++;
                z11 = z12;
            }
            ObserveOp[] observeOpArr2 = z11 ? observeOpArr : null;
            reentrantLock.unlock();
            return observeOpArr2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean onObserverAdded$room_runtime_release(@m80.k int[] tableIds) {
        g0.p(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z11 = false;
            for (int i11 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j11 = jArr[i11];
                jArr[i11] = 1 + j11;
                if (j11 == 0) {
                    z11 = true;
                    this.needsSync = true;
                }
            }
            return z11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean onObserverRemoved$room_runtime_release(@m80.k int[] tableIds) {
        g0.p(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z11 = false;
            for (int i11 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j11 = jArr[i11];
                jArr[i11] = j11 - 1;
                if (j11 == 1) {
                    z11 = true;
                    this.needsSync = true;
                }
            }
            return z11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void resetTriggerState$room_runtime_release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            a00.q.X1(this.tableObservedState, false, 0, 0, 6, null);
            this.needsSync = true;
            g2 g2Var = g2.f100423a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
