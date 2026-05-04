package com.google.common.util.concurrent;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
@l0
/* loaded from: classes7.dex */
public abstract class f<V> extends so.a implements p1<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f34532d;

    /* renamed from: e, reason: collision with root package name */
    public static final o1 f34533e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f34534f = 1000;

    /* renamed from: g, reason: collision with root package name */
    public static final b f34535g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f34536h;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public volatile Object f34537a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public volatile e f34538b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    public volatile l f34539c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(f<?> future, @CheckForNull e expect, e update);

        public abstract boolean b(f<?> future, @CheckForNull Object expect, Object update);

        public abstract boolean c(f<?> future, @CheckForNull l expect, @CheckForNull l update);

        public abstract e d(f<?> future, e update);

        public abstract l e(f<?> future, l update);

        public abstract void f(l waiter, @CheckForNull l newValue);

        public abstract void g(l waiter, Thread newValue);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public static final c f34540c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public static final c f34541d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f34542a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public final Throwable f34543b;

        static {
            if (f.f34532d) {
                f34541d = null;
                f34540c = null;
            } else {
                f34541d = new c(false, null);
                f34540c = new c(true, null);
            }
        }

        public c(boolean wasInterrupted, @CheckForNull Throwable cause) {
            this.f34542a = wasInterrupted;
            this.f34543b = cause;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f34544b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f34545a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends Throwable {
            public a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable exception) {
            this.f34545a = (Throwable) Preconditions.checkNotNull(exception);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.util.concurrent.f$f, reason: collision with other inner class name */
    public static final class C0431f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f34550a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, l> f34551b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super f<?>, l> f34552c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super f<?>, e> f34553d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super f<?>, Object> f34554e;

        public C0431f(AtomicReferenceFieldUpdater<l, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<l, l> waiterNextUpdater, AtomicReferenceFieldUpdater<? super f<?>, l> waitersUpdater, AtomicReferenceFieldUpdater<? super f<?>, e> listenersUpdater, AtomicReferenceFieldUpdater<? super f<?>, Object> valueUpdater) {
            super();
            this.f34550a = waiterThreadUpdater;
            this.f34551b = waiterNextUpdater;
            this.f34552c = waitersUpdater;
            this.f34553d = listenersUpdater;
            this.f34554e = valueUpdater;
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean a(f<?> future, @CheckForNull e expect, e update) {
            return androidx.concurrent.futures.a.a(this.f34553d, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean b(f<?> future, @CheckForNull Object expect, Object update) {
            return androidx.concurrent.futures.a.a(this.f34554e, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean c(f<?> future, @CheckForNull l expect, @CheckForNull l update) {
            return androidx.concurrent.futures.a.a(this.f34552c, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public e d(f<?> future, e update) {
            return this.f34553d.getAndSet(future, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public l e(f<?> future, l update) {
            return this.f34552c.getAndSet(future, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public void f(l waiter, @CheckForNull l newValue) {
            this.f34551b.lazySet(waiter, newValue);
        }

        @Override // com.google.common.util.concurrent.f.b
        public void g(l waiter, Thread newValue) {
            this.f34550a.lazySet(waiter, newValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f<V> f34555a;

        /* renamed from: b, reason: collision with root package name */
        public final p1<? extends V> f34556b;

        public g(f<V> owner, p1<? extends V> future) {
            this.f34555a = owner;
            this.f34556b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34555a.f34537a != this) {
                return;
            }
            if (f.f34535g.b(this.f34555a, this, f.u(this.f34556b))) {
                f.r(this.f34555a, false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean a(f<?> future, @CheckForNull e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f34538b != expect) {
                        return false;
                    }
                    future.f34538b = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean b(f<?> future, @CheckForNull Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f34537a != expect) {
                        return false;
                    }
                    future.f34537a = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean c(f<?> future, @CheckForNull l expect, @CheckForNull l update) {
            synchronized (future) {
                try {
                    if (future.f34539c != expect) {
                        return false;
                    }
                    future.f34539c = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.b
        public e d(f<?> future, e update) {
            e eVar;
            synchronized (future) {
                try {
                    eVar = future.f34538b;
                    if (eVar != update) {
                        future.f34538b = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        public l e(f<?> future, l update) {
            l lVar;
            synchronized (future) {
                try {
                    lVar = future.f34539c;
                    if (lVar != update) {
                        future.f34539c = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        public void f(l waiter, @CheckForNull l newValue) {
            waiter.f34565b = newValue;
        }

        @Override // com.google.common.util.concurrent.f.b
        public void g(l waiter, Thread newValue) {
            waiter.f34564a = newValue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i<V> extends p1<V> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class j<V> extends f<V> implements i<V> {
        @Override // com.google.common.util.concurrent.f, com.google.common.util.concurrent.p1
        public void addListener(Runnable listener, Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @uo.a
        public boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @z1
        @uo.a
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @z1
        @uo.a
        public final V get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j11, timeUnit);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f34557a;

        /* renamed from: b, reason: collision with root package name */
        public static final long f34558b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f34559c;

        /* renamed from: d, reason: collision with root package name */
        public static final long f34560d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f34561e;

        /* renamed from: f, reason: collision with root package name */
        public static final long f34562f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e11) {
                    throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f34559c = unsafe.objectFieldOffset(f.class.getDeclaredField("c"));
                f34558b = unsafe.objectFieldOffset(f.class.getDeclaredField(yr.e.f100279a));
                f34560d = unsafe.objectFieldOffset(f.class.getDeclaredField("a"));
                f34561e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f34562f = unsafe.objectFieldOffset(l.class.getDeclaredField(yr.e.f100279a));
                f34557a = unsafe;
            } catch (NoSuchFieldException e12) {
                throw new RuntimeException(e12);
            }
        }

        public k() {
            super();
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean a(f<?> future, @CheckForNull e expect, e update) {
            return com.google.common.util.concurrent.g.a(f34557a, future, f34558b, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean b(f<?> future, @CheckForNull Object expect, Object update) {
            return com.google.common.util.concurrent.g.a(f34557a, future, f34560d, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public boolean c(f<?> future, @CheckForNull l expect, @CheckForNull l update) {
            return com.google.common.util.concurrent.g.a(f34557a, future, f34559c, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        public e d(f<?> future, e update) {
            e eVar;
            do {
                eVar = future.f34538b;
                if (update == eVar) {
                    break;
                }
            } while (!a(future, eVar, update));
            return eVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        public l e(f<?> future, l update) {
            l lVar;
            do {
                lVar = future.f34539c;
                if (update == lVar) {
                    break;
                }
            } while (!c(future, lVar, update));
            return lVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        public void f(l waiter, @CheckForNull l newValue) {
            f34557a.putObject(waiter, f34562f, newValue);
        }

        @Override // com.google.common.util.concurrent.f.b
        public void g(l waiter, Thread newValue) {
            f34557a.putObject(waiter, f34561e, newValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l {

        /* renamed from: c, reason: collision with root package name */
        public static final l f34563c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public volatile Thread f34564a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public volatile l f34565b;

        public l(boolean unused) {
        }

        public void a(@CheckForNull l next) {
            f.f34535g.f(this, next);
        }

        public void b() {
            Thread thread = this.f34564a;
            if (thread != null) {
                this.f34564a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            f.f34535g.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.common.util.concurrent.f$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z11;
        Throwable th2;
        b bVar;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f34532d = z11;
        f34533e = new o1(f.class);
        ?? r52 = 0;
        r52 = 0;
        try {
            bVar = new k();
            th2 = null;
        } catch (Error | Exception e11) {
            th2 = e11;
            try {
                bVar = new C0431f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, yr.e.f100279a), AtomicReferenceFieldUpdater.newUpdater(f.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f.class, e.class, yr.e.f100279a), AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "a"));
            } catch (Error | Exception e12) {
                h hVar = new h();
                r52 = e12;
                bVar = hVar;
            }
        }
        f34535g = bVar;
        if (r52 != 0) {
            o1 o1Var = f34533e;
            Logger a11 = o1Var.a();
            Level level = Level.SEVERE;
            a11.log(level, "UnsafeAtomicHelper is broken!", th2);
            o1Var.a().log(level, "SafeAtomicHelper is broken!", r52);
        }
        f34536h = new Object();
    }

    public static CancellationException p(String message, @CheckForNull Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    public static void r(f<?> fVar, boolean z11) {
        e eVar = null;
        while (true) {
            fVar.z();
            if (z11) {
                fVar.w();
                z11 = false;
            }
            fVar.m();
            e q11 = fVar.q(eVar);
            while (q11 != null) {
                eVar = q11.f34549c;
                Runnable runnable = q11.f34547a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    fVar = gVar.f34555a;
                    if (fVar.f34537a == gVar) {
                        if (f34535g.b(fVar, gVar, u(gVar.f34556b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = q11.f34548b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                q11 = eVar;
            }
            return;
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            f34533e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(p1<?> future) {
        Throwable a11;
        if (future instanceof i) {
            Object obj = ((f) future).f34537a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f34542a) {
                    obj = cVar.f34543b != null ? new c(false, cVar.f34543b) : c.f34541d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((future instanceof so.a) && (a11 = so.b.a((so.a) future)) != null) {
            return new d(a11);
        }
        boolean isCancelled = future.isCancelled();
        if ((!f34532d) && isCancelled) {
            c cVar2 = c.f34541d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object v11 = v(future);
            if (!isCancelled) {
                return v11 == null ? f34536h : v11;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future));
        } catch (Error | Exception e11) {
            return new d(e11);
        } catch (CancellationException e12) {
            if (isCancelled) {
                return new c(false, e12);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e12));
        } catch (ExecutionException e13) {
            if (!isCancelled) {
                return new d(e13.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future, e13));
        }
    }

    @z1
    private static <V> V v(Future<V> future) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    public final void A(l node) {
        node.f34564a = null;
        while (true) {
            l lVar = this.f34539c;
            if (lVar == l.f34563c) {
                return;
            }
            l lVar2 = null;
            while (lVar != null) {
                l lVar3 = lVar.f34565b;
                if (lVar.f34564a != null) {
                    lVar2 = lVar;
                } else if (lVar2 != null) {
                    lVar2.f34565b = lVar3;
                    if (lVar2.f34564a == null) {
                        break;
                    }
                } else if (!f34535g.c(this, lVar, lVar3)) {
                    break;
                }
                lVar = lVar3;
            }
            return;
        }
    }

    @uo.a
    public boolean B(@z1 V v11) {
        if (v11 == null) {
            v11 = (V) f34536h;
        }
        if (!f34535g.b(this, null, v11)) {
            return false;
        }
        r(this, false);
        return true;
    }

    @uo.a
    public boolean C(Throwable throwable) {
        if (!f34535g.b(this, null, new d((Throwable) Preconditions.checkNotNull(throwable)))) {
            return false;
        }
        r(this, false);
        return true;
    }

    @uo.a
    public boolean D(p1<? extends V> future) {
        d dVar;
        Preconditions.checkNotNull(future);
        Object obj = this.f34537a;
        if (obj == null) {
            if (future.isDone()) {
                if (!f34535g.b(this, null, u(future))) {
                    return false;
                }
                r(this, false);
                return true;
            }
            g gVar = new g(this, future);
            if (f34535g.b(this, null, gVar)) {
                try {
                    future.addListener(gVar, j0.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Error | Exception unused) {
                        dVar = d.f34544b;
                    }
                    f34535g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f34537a;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f34542a);
        }
        return false;
    }

    public final boolean E() {
        Object obj = this.f34537a;
        return (obj instanceof c) && ((c) obj).f34542a;
    }

    @Override // so.a
    @CheckForNull
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f34537a;
        if (obj instanceof d) {
            return ((d) obj).f34545a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.p1
    public void addListener(Runnable listener, Executor executor) {
        e eVar;
        Preconditions.checkNotNull(listener, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f34538b) != e.f34546d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f34549c = eVar;
                if (f34535g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f34538b;
                }
            } while (eVar != e.f34546d);
        }
        s(listener, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @uo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f34537a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.f.g
            r3 = r3 | r4
            if (r3 == 0) goto L5e
            boolean r3 = com.google.common.util.concurrent.f.f34532d
            if (r3 == 0) goto L1f
            com.google.common.util.concurrent.f$c r3 = new com.google.common.util.concurrent.f$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.common.util.concurrent.f$c r3 = com.google.common.util.concurrent.f.c.f34540c
            goto L26
        L24:
            com.google.common.util.concurrent.f$c r3 = com.google.common.util.concurrent.f.c.f34541d
        L26:
            java.util.Objects.requireNonNull(r3)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.common.util.concurrent.f$b r6 = com.google.common.util.concurrent.f.f34535g
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L57
            r(r4, r8)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.f.g
            if (r4 == 0) goto L56
            com.google.common.util.concurrent.f$g r0 = (com.google.common.util.concurrent.f.g) r0
            com.google.common.util.concurrent.p1<? extends V> r0 = r0.f34556b
            boolean r4 = r0 instanceof com.google.common.util.concurrent.f.i
            if (r4 == 0) goto L53
            r4 = r0
            com.google.common.util.concurrent.f r4 = (com.google.common.util.concurrent.f) r4
            java.lang.Object r0 = r4.f34537a
            if (r0 != 0) goto L4b
            r5 = r1
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.f.g
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            return r1
        L57:
            java.lang.Object r0 = r4.f34537a
            boolean r6 = r0 instanceof com.google.common.util.concurrent.f.g
            if (r6 != 0) goto L2b
            return r5
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.f.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    @z1
    @uo.a
    public V get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34537a;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f34539c;
            if (lVar != l.f34563c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f34535g.c(this, lVar, lVar2)) {
                        do {
                            y1.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34537a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(lVar2);
                    } else {
                        lVar = this.f34539c;
                    }
                } while (lVar != l.f34563c);
            }
            Object obj3 = this.f34537a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f34537a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return t(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String fVar = toString();
        String obj5 = unit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + timeout + " " + unit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = unit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - unit.toNanos(convert);
            boolean z11 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z11) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z11) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + fVar);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f34537a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f34537a != null);
    }

    public final void k(StringBuilder builder) {
        try {
            Object v11 = v(this);
            builder.append("SUCCESS, result=[");
            n(builder, v11);
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (ExecutionException e11) {
            builder.append("FAILURE, cause=[");
            builder.append(e11.getCause());
            builder.append("]");
        } catch (Exception e12) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e12.getClass());
            builder.append(" thrown from get()]");
        }
    }

    public final void l(StringBuilder builder) {
        String str;
        int length = builder.length();
        builder.append("PENDING");
        Object obj = this.f34537a;
        if (obj instanceof g) {
            builder.append(", setFuture=[");
            o(builder, ((g) obj).f34556b);
            builder.append("]");
        } else {
            try {
                str = ho.o0.c(y());
            } catch (Exception | StackOverflowError e11) {
                str = "Exception thrown from implementation: " + e11.getClass();
            }
            if (str != null) {
                builder.append(", info=[");
                builder.append(str);
                builder.append("]");
            }
        }
        if (isDone()) {
            builder.delete(length, builder.length());
            k(builder);
        }
    }

    public final void n(StringBuilder builder, @CheckForNull Object o11) {
        if (o11 == null) {
            builder.append("null");
        } else {
            if (o11 == this) {
                builder.append("this future");
                return;
            }
            builder.append(o11.getClass().getName());
            builder.append(EmailAutoCompleteEditText.f17091d);
            builder.append(Integer.toHexString(System.identityHashCode(o11)));
        }
    }

    public final void o(StringBuilder builder, @CheckForNull Object o11) {
        try {
            if (o11 == this) {
                builder.append("this future");
            } else {
                builder.append(o11);
            }
        } catch (Exception e11) {
            e = e11;
            builder.append("Exception thrown from implementation: ");
            builder.append(e.getClass());
        } catch (StackOverflowError e12) {
            e = e12;
            builder.append("Exception thrown from implementation: ");
            builder.append(e.getClass());
        }
    }

    @CheckForNull
    public final e q(@CheckForNull e onto) {
        e eVar = onto;
        e d11 = f34535g.d(this, e.f34546d);
        while (d11 != null) {
            e eVar2 = d11.f34549c;
            d11.f34549c = eVar;
            eVar = d11;
            d11 = eVar2;
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @z1
    public final V t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f34543b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f34545a);
        }
        return obj == f34536h ? (V) x1.b() : obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            k(sb2);
        } else {
            l(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void x(@CheckForNull Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void z() {
        for (l e11 = f34535g.e(this, l.f34563c); e11 != null; e11 = e11.f34565b) {
            e11.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f34546d = new e();

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public final Runnable f34547a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public final Executor f34548b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public e f34549c;

        public e(Runnable task, Executor executor) {
            this.f34547a = task;
            this.f34548b = executor;
        }

        public e() {
            this.f34547a = null;
            this.f34548b = null;
        }
    }

    @uo.g
    public void m() {
    }

    public void w() {
    }

    @Override // java.util.concurrent.Future
    @z1
    @uo.a
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f34537a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.f34539c;
            if (lVar != l.f34563c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f34535g.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f34537a;
                            } else {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.f34539c;
                } while (lVar != l.f34563c);
            }
            Object obj3 = this.f34537a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        throw new InterruptedException();
    }
}
