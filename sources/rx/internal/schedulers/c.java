package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c extends rx.d {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f86561a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d.a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f86562a;

        /* renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<ScheduledAction> f86564c = new ConcurrentLinkedQueue<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f86565d = new AtomicInteger();

        /* renamed from: b, reason: collision with root package name */
        public final ec0.b f86563b = new ec0.b();

        /* renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f86566e = d.a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.c$a$a, reason: collision with other inner class name */
        public class C1117a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ec0.c f86567a;

            public C1117a(ec0.c cVar) {
                this.f86567a = cVar;
            }

            @Override // wb0.a
            public void call() {
                a.this.f86563b.e(this.f86567a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ec0.c f86569a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wb0.a f86570b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ qb0.h f86571c;

            public b(ec0.c cVar, wb0.a aVar, qb0.h hVar) {
                this.f86569a = cVar;
                this.f86570b = aVar;
                this.f86571c = hVar;
            }

            @Override // wb0.a
            public void call() {
                if (this.f86569a.isUnsubscribed()) {
                    return;
                }
                qb0.h h11 = a.this.h(this.f86570b);
                this.f86569a.b(h11);
                if (h11.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) h11).add(this.f86571c);
                }
            }
        }

        public a(Executor executor) {
            this.f86562a = executor;
        }

        @Override // rx.d.a
        public qb0.h h(wb0.a aVar) {
            if (isUnsubscribed()) {
                return ec0.f.e();
            }
            ScheduledAction scheduledAction = new ScheduledAction(ac0.c.P(aVar), this.f86563b);
            this.f86563b.a(scheduledAction);
            this.f86564c.offer(scheduledAction);
            if (this.f86565d.getAndIncrement() != 0) {
                return scheduledAction;
            }
            try {
                this.f86562a.execute(this);
                return scheduledAction;
            } catch (RejectedExecutionException e11) {
                this.f86563b.e(scheduledAction);
                this.f86565d.decrementAndGet();
                ac0.c.I(e11);
                throw e11;
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86563b.isUnsubscribed();
        }

        @Override // rx.d.a
        public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            if (j11 <= 0) {
                return h(aVar);
            }
            if (isUnsubscribed()) {
                return ec0.f.e();
            }
            wb0.a P = ac0.c.P(aVar);
            ec0.c cVar = new ec0.c();
            ec0.c cVar2 = new ec0.c();
            cVar2.b(cVar);
            this.f86563b.a(cVar2);
            qb0.h a11 = ec0.f.a(new C1117a(cVar2));
            ScheduledAction scheduledAction = new ScheduledAction(new b(cVar2, P, a11));
            cVar.b(scheduledAction);
            try {
                scheduledAction.add(this.f86566e.schedule(scheduledAction, j11, timeUnit));
                return a11;
            } catch (RejectedExecutionException e11) {
                ac0.c.I(e11);
                throw e11;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f86563b.isUnsubscribed()) {
                ScheduledAction poll = this.f86564c.poll();
                if (poll == null) {
                    return;
                }
                if (!poll.isUnsubscribed()) {
                    if (this.f86563b.isUnsubscribed()) {
                        this.f86564c.clear();
                        return;
                    }
                    poll.run();
                }
                if (this.f86565d.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f86564c.clear();
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f86563b.unsubscribe();
            this.f86564c.clear();
        }
    }

    public c(Executor executor) {
        this.f86561a = executor;
    }

    @Override // rx.d
    public d.a a() {
        return new a(this.f86561a);
    }
}
