package a90;

import a90.d3;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Timeout;
import org.junit.platform.commons.JUnitException;
import p80.n;
import p80.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final n.b f2371a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a implements n.b.a {

        /* renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f2372a;

        public a(ScheduledExecutorService executor) {
            this.f2372a = executor;
        }

        public ScheduledExecutorService a() {
            return this.f2372a;
        }

        @Override // p80.n.b.a
        public void close() throws Throwable {
            this.f2372a.shutdown();
            if (this.f2372a.awaitTermination(5L, TimeUnit.SECONDS)) {
                return;
            }
            this.f2372a.shutdownNow();
            throw new JUnitException("Scheduled executor could not be stopped in an orderly manner");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends a {
        public b() {
            super(Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: a90.e3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return d3.b.b(runnable);
                }
            }));
        }

        public static /* synthetic */ Thread b(Runnable runnable) {
            Thread thread = new Thread(runnable, "junit-jupiter-timeout-watcher");
            thread.setPriority(10);
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final q.a<T> f2373a;

        /* renamed from: b, reason: collision with root package name */
        public final k2 f2374b;

        /* renamed from: c, reason: collision with root package name */
        public final Supplier<String> f2375c;

        public c(q.a<T> invocation, k2 timeout, Supplier<String> descriptionSupplier) {
            this.f2373a = (q.a) ba0.c2.r(invocation, "invocation must not be null");
            this.f2374b = (k2) ba0.c2.r(timeout, "timeout must not be null");
            this.f2375c = (Supplier) ba0.c2.r(descriptionSupplier, "description supplier must not be null");
        }

        public Supplier<String> a() {
            return this.f2375c;
        }

        public q.a<T> b() {
            return this.f2373a;
        }

        public k2 c() {
            return this.f2374b;
        }
    }

    public d3(n.b store) {
        this.f2371a = (n.b) ba0.c2.r(store, "store must not be null");
    }

    public <T> q.a<T> a(Timeout.ThreadMode threadMode, c<T> timeoutInvocationParameters) {
        ba0.c2.r(threadMode, "thread mode must not be null");
        ba0.c2.e(threadMode != Timeout.ThreadMode.INFERRED, "thread mode must not be INFERRED");
        ba0.c2.r(timeoutInvocationParameters, "timeout invocation parameters must not be null");
        return threadMode == Timeout.ThreadMode.SEPARATE_THREAD ? new q0(timeoutInvocationParameters.b(), timeoutInvocationParameters.c(), timeoutInvocationParameters.a()) : new n0(timeoutInvocationParameters.b(), timeoutInvocationParameters.c(), b(), timeoutInvocationParameters.a());
    }

    public final ScheduledExecutorService b() {
        return ((b) this.f2371a.g(b.class)).a();
    }
}
