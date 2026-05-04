package a90;

import ba0.h4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import p80.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n0<T> implements q.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final q.a<T> f2415a;

    /* renamed from: b, reason: collision with root package name */
    public final k2 f2416b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f2417c;

    /* renamed from: d, reason: collision with root package name */
    public final Supplier<String> f2418d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Thread f2419a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f2420b;

        public a(Thread thread) {
            this.f2419a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2420b = true;
            this.f2419a.interrupt();
        }
    }

    public n0(q.a<T> delegate, k2 timeout, ScheduledExecutorService executor, Supplier<String> descriptionSupplier) {
        this.f2415a = delegate;
        this.f2416b = timeout;
        this.f2417c = executor;
        this.f2418d = descriptionSupplier;
    }

    @Override // p80.q.a
    public T b() throws Throwable {
        TimeoutException timeoutException;
        T t11;
        a aVar = new a(Thread.currentThread());
        ScheduledFuture<?> schedule = this.f2417c.schedule(aVar, this.f2416b.d(), this.f2416b.c());
        TimeoutException timeoutException2 = null;
        try {
            t11 = this.f2415a.b();
        } catch (Throwable th2) {
            try {
                h4.a(th2);
                if (!schedule.cancel(false)) {
                    schedule.get();
                }
                if (aVar.f2420b) {
                    Thread.interrupted();
                    timeoutException = n2.b(this.f2418d.get(), this.f2416b, th2);
                } else {
                    timeoutException = th2;
                }
                t11 = null;
                timeoutException2 = timeoutException;
            } finally {
                if (!schedule.cancel(false)) {
                    schedule.get();
                }
                if (aVar.f2420b) {
                    Thread.interrupted();
                    n2.b(this.f2418d.get(), this.f2416b, null);
                }
            }
        }
        if (timeoutException2 == null) {
            return t11;
        }
        throw timeoutException2;
    }
}
