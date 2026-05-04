package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransactionExecutor.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.android.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes3.dex */
public final class TransactionExecutor implements Executor {

    @m80.l
    private Runnable active;

    @m80.k
    private final Executor executor;

    @m80.k
    private final Object syncLock;

    @m80.k
    private final ArrayDeque<Runnable> tasks;

    public TransactionExecutor(@m80.k Executor executor) {
        g0.p(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable runnable, TransactionExecutor transactionExecutor) {
        try {
            runnable.run();
        } finally {
            transactionExecutor.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@m80.k final Runnable command) {
        g0.p(command, "command");
        synchronized (this.syncLock) {
            try {
                this.tasks.offer(new Runnable() { // from class: androidx.room.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransactionExecutor.execute$lambda$1$lambda$0(command, this);
                    }
                });
                if (this.active == null) {
                    scheduleNext();
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.syncLock) {
            try {
                Runnable poll = this.tasks.poll();
                Runnable runnable = poll;
                this.active = runnable;
                if (poll != null) {
                    this.executor.execute(runnable);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
