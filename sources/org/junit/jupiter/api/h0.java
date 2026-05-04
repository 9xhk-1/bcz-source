package org.junit.jupiter.api;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import org.junit.jupiter.api.m0;
import org.junit.platform.commons.JUnitException;
import org.opentest4j.AssertionFailedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends JUnitException {
        private static final long serialVersionUID = 1;

        public b(String message) {
            super(message);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicInteger f77958a = new AtomicInteger(1);

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r11) {
            return new Thread(r11, "junit-timeout-thread-" + f77958a.getAndIncrement());
        }
    }

    public static /* synthetic */ Object a(r80.a aVar) {
        aVar.execute();
        return null;
    }

    public static /* synthetic */ Object b(r80.a aVar) {
        aVar.execute();
        return null;
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, r80.c cVar) {
        try {
            atomicReference.set(Thread.currentThread());
            return cVar.get();
        } catch (Throwable th2) {
            throw ba0.o1.e(th2);
        }
    }

    public static <T> T f(Duration duration, r80.c<T> cVar) {
        return (T) i(duration, cVar, null, new d0());
    }

    public static <T> T g(Duration duration, r80.c<T> cVar, final String str) {
        return (T) i(duration, cVar, str == null ? null : new Supplier() { // from class: org.junit.jupiter.api.f0
            @Override // java.util.function.Supplier
            public final Object get() {
                return h0.c(str);
            }
        }, new d0());
    }

    public static <T> T h(Duration duration, r80.c<T> cVar, Supplier<String> supplier) {
        return (T) i(duration, cVar, supplier, new d0());
    }

    public static <T, E extends Throwable> T i(Duration duration, r80.c<T> cVar, Supplier<String> supplier, m0.a<E> aVar) throws Throwable {
        final AtomicReference atomicReference = new AtomicReference();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new c());
        try {
            return (T) n(o(cVar, atomicReference, newSingleThreadExecutor), duration, supplier, new Supplier() { // from class: org.junit.jupiter.api.e0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return (Thread) atomicReference.get();
                }
            }, aVar);
        } finally {
            newSingleThreadExecutor.shutdownNow();
        }
    }

    public static void j(Duration timeout, r80.a executable) {
        k(timeout, executable, null);
    }

    public static void k(Duration timeout, final r80.a executable, String message) {
        g(timeout, new r80.c() { // from class: org.junit.jupiter.api.b0
            @Override // r80.c
            public final Object get() {
                return h0.a(r80.a.this);
            }
        }, message);
    }

    public static void l(Duration timeout, final r80.a executable, Supplier<String> messageSupplier) {
        h(timeout, new r80.c() { // from class: org.junit.jupiter.api.g0
            @Override // r80.c
            public final Object get() {
                return h0.b(r80.a.this);
            }
        }, messageSupplier);
    }

    public static AssertionFailedError m(Duration timeout, Supplier<String> messageSupplier, Throwable cause) {
        long millis;
        j0 l11 = j0.b().l(messageSupplier);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("execution timed out after ");
        millis = timeout.toMillis();
        sb2.append(millis);
        sb2.append(" ms");
        return l11.n(sb2.toString()).f(cause).c();
    }

    public static <T, E extends Throwable> T n(Future<T> future, Duration timeout, Supplier<String> messageSupplier, Supplier<Thread> threadSupplier, m0.a<E> failureFactory) throws Throwable {
        b bVar;
        long millis;
        try {
            millis = timeout.toMillis();
            return future.get(millis, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e11) {
            throw ba0.o1.e(e11.getCause());
        } catch (TimeoutException unused) {
            Thread thread = threadSupplier.get();
            if (thread != null) {
                bVar = new b("Execution timed out in thread " + thread.getName());
                bVar.setStackTrace(thread.getStackTrace());
            } else {
                bVar = null;
            }
            throw failureFactory.a(timeout, messageSupplier, bVar);
        } catch (Throwable th2) {
            throw ba0.o1.e(th2);
        }
    }

    public static <T> Future<T> o(final r80.c<T> supplier, final AtomicReference<Thread> threadReference, ExecutorService executorService) {
        return executorService.submit(new Callable() { // from class: org.junit.jupiter.api.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h0.e(threadReference, supplier);
            }
        });
    }

    public static /* synthetic */ String c(String str) {
        return str;
    }
}
