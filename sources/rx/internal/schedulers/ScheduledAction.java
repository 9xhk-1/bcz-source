package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, qb0.h {
    private static final long serialVersionUID = -3962399486978279857L;
    final wb0.a action;
    final rx.internal.util.m cancel;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements qb0.h {

        /* renamed from: a, reason: collision with root package name */
        public final Future<?> f86516a;

        public a(Future<?> future) {
            this.f86516a = future;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86516a.isCancelled();
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.f86516a.cancel(true);
            } else {
                this.f86516a.cancel(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends AtomicBoolean implements qb0.h {
        private static final long serialVersionUID = 247232374289553518L;

        /* renamed from: a, reason: collision with root package name */
        public final ScheduledAction f86518a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.internal.util.m f86519b;

        public b(ScheduledAction scheduledAction, rx.internal.util.m mVar) {
            this.f86518a = scheduledAction;
            this.f86519b = mVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86518a.isUnsubscribed();
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f86519b.d(this.f86518a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends AtomicBoolean implements qb0.h {
        private static final long serialVersionUID = 247232374289553518L;

        /* renamed from: a, reason: collision with root package name */
        public final ScheduledAction f86520a;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.b f86521b;

        public c(ScheduledAction scheduledAction, ec0.b bVar) {
            this.f86520a = scheduledAction;
            this.f86521b = bVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86520a.isUnsubscribed();
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f86521b.e(this.f86520a);
            }
        }
    }

    public ScheduledAction(wb0.a aVar) {
        this.action = aVar;
        this.cancel = new rx.internal.util.m();
    }

    public void add(qb0.h hVar) {
        this.cancel.a(hVar);
    }

    public void addParent(ec0.b bVar) {
        this.cancel.a(new c(this, bVar));
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.action.call();
            } finally {
                unsubscribe();
            }
        } catch (OnErrorNotImplementedException e11) {
            signalError(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e11));
        } catch (Throwable th2) {
            signalError(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th2));
        }
    }

    public void signalError(Throwable th2) {
        ac0.c.I(th2);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    @Override // qb0.h
    public void unsubscribe() {
        if (this.cancel.isUnsubscribed()) {
            return;
        }
        this.cancel.unsubscribe();
    }

    public void add(Future<?> future) {
        this.cancel.a(new a(future));
    }

    public void addParent(rx.internal.util.m mVar) {
        this.cancel.a(new b(this, mVar));
    }

    public ScheduledAction(wb0.a aVar, ec0.b bVar) {
        this.action = aVar;
        this.cancel = new rx.internal.util.m(new c(this, bVar));
    }

    public ScheduledAction(wb0.a aVar, rx.internal.util.m mVar) {
        this.action = aVar;
        this.cancel = new rx.internal.util.m(new b(this, mVar));
    }
}
