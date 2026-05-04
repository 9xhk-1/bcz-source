package com.igexin.base.scheduler;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
final class b extends ScheduledThreadPoolExecutor {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicLong f37066b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    InterfaceC0459b f37067a;

    public class a<V> extends FutureTask<V> implements RunnableScheduledFuture<V> {

        /* renamed from: b, reason: collision with root package name */
        private BaseTask f37069b;

        /* renamed from: c, reason: collision with root package name */
        private long f37070c;

        /* renamed from: d, reason: collision with root package name */
        private volatile long f37071d;

        /* renamed from: e, reason: collision with root package name */
        private final long f37072e;

        /* renamed from: f, reason: collision with root package name */
        private final int f37073f;

        public a(BaseTask baseTask, long j11) {
            super(baseTask, null);
            this.f37069b = baseTask;
            this.f37071d = b.a(b.this, baseTask.getInitDelay(), TimeUnit.MILLISECONDS);
            this.f37072e = baseTask.getPeriod();
            this.f37073f = baseTask.getTaskLevel();
            this.f37070c = j11;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Delayed delayed) {
            Delayed delayed2 = delayed;
            if (delayed2 == this) {
                return 0;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long delay = getDelay(timeUnit);
            long delay2 = delayed2.getDelay(timeUnit);
            if (delayed2 instanceof a) {
                a aVar = (a) delayed2;
                int i11 = this.f37073f - aVar.f37073f;
                if (delay <= 0 && delay2 <= 0) {
                    if (i11 > 0) {
                        return -1;
                    }
                    if (i11 < 0) {
                        return 1;
                    }
                }
                long j11 = delay - delay2;
                if (j11 > 0) {
                    return 1;
                }
                if (j11 < 0 || i11 > 0) {
                    return -1;
                }
                if (i11 < 0) {
                    return 1;
                }
                long j12 = this.f37070c - aVar.f37070c;
                if (j12 < 0) {
                    return -1;
                }
                if (j12 > 0) {
                    return 1;
                }
            }
            long j13 = delay - delay2;
            if (j13 < 0) {
                return -1;
            }
            return j13 > 0 ? 1 : 0;
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            this.f37069b.setIsRunning(false);
            b.a(b.this, this.f37069b);
            try {
                get();
                this.f37069b.done();
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    this.f37069b.onCancel();
                } else {
                    this.f37069b.onException(th2);
                }
            }
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f37071d - System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return this.f37072e != 0;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            boolean isPeriodic = isPeriodic();
            if (b.super.isShutdown()) {
                cancel(false);
                return;
            }
            if (!isPeriodic) {
                super.run();
                return;
            }
            if (super.runAndReset()) {
                long convert = TimeUnit.NANOSECONDS.convert(this.f37072e, TimeUnit.MILLISECONDS);
                if (convert > 0) {
                    this.f37071d += convert;
                } else {
                    this.f37071d = b.this.a(-convert);
                }
                b.super.getQueue().add(this);
            }
        }
    }

    /* renamed from: com.igexin.base.scheduler.b$b, reason: collision with other inner class name */
    public interface InterfaceC0459b {
        void a(BaseTask baseTask);
    }

    public b() {
        super(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(long j11) {
        Delayed delayed;
        long nanoTime = System.nanoTime();
        if (j11 >= 4611686018427387903L && (delayed = (Delayed) super.getQueue().peek()) != null) {
            long delay = delayed.getDelay(TimeUnit.NANOSECONDS);
            if (delay < 0 && j11 - delay < 0) {
                j11 = Long.MAX_VALUE + delay;
            }
        }
        return nanoTime + j11;
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public final <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        BaseTask baseTask = (BaseTask) runnable;
        a aVar = new a(baseTask, f37066b.getAndIncrement());
        baseTask.bind(aVar);
        return aVar;
    }

    public static /* synthetic */ long a(b bVar, long j11, TimeUnit timeUnit) {
        if (j11 < 0) {
            j11 = 0;
        }
        return bVar.a(timeUnit.toNanos(j11));
    }

    public static /* synthetic */ void a(b bVar, BaseTask baseTask) {
        InterfaceC0459b interfaceC0459b = bVar.f37067a;
        if (interfaceC0459b != null) {
            interfaceC0459b.a(baseTask);
        }
    }
}
