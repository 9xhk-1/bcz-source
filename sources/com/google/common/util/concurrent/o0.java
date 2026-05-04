package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@l0
/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<p1<Void>> f34763a = new AtomicReference<>(d1.p());

    /* renamed from: b, reason: collision with root package name */
    @vo.b
    public e f34764b = new e(null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f34765a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f34766b;

        public a(final o0 this$0, final Callable val$callable) {
            this.f34765a = val$callable;
            this.f34766b = this$0;
        }

        @Override // com.google.common.util.concurrent.w
        public p1<T> call() throws Exception {
            return d1.o(this.f34765a.call());
        }

        public String toString() {
            return this.f34765a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f34767a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f34768b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0 f34769c;

        public b(final o0 this$0, final d val$taskExecutor, final w val$callable) {
            this.f34767a = val$taskExecutor;
            this.f34768b = val$callable;
            this.f34769c = this$0;
        }

        @Override // com.google.common.util.concurrent.w
        public p1<T> call() throws Exception {
            return !this.f34767a.d() ? d1.m() : this.f34768b.call();
        }

        public String toString() {
            return this.f34768b.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends AtomicReference<c> implements Executor, Runnable {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public o0 f34774a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Executor f34775b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Runnable f34776c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public Thread f34777d;

        public /* synthetic */ d(Executor executor, o0 o0Var, a aVar) {
            this(executor, o0Var);
        }

        public final boolean c() {
            return compareAndSet(c.NOT_RUN, c.CANCELLED);
        }

        public final boolean d() {
            return compareAndSet(c.NOT_RUN, c.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable task) {
            if (get() == c.CANCELLED) {
                this.f34775b = null;
                this.f34774a = null;
                return;
            }
            this.f34777d = Thread.currentThread();
            try {
                o0 o0Var = this.f34774a;
                Objects.requireNonNull(o0Var);
                e eVar = o0Var.f34764b;
                if (eVar.f34778a == this.f34777d) {
                    this.f34774a = null;
                    Preconditions.checkState(eVar.f34779b == null);
                    eVar.f34779b = task;
                    Executor executor = this.f34775b;
                    Objects.requireNonNull(executor);
                    eVar.f34780c = executor;
                    this.f34775b = null;
                } else {
                    Executor executor2 = this.f34775b;
                    Objects.requireNonNull(executor2);
                    this.f34775b = null;
                    this.f34776c = task;
                    executor2.execute(this);
                }
                this.f34777d = null;
            } catch (Throwable th2) {
                this.f34777d = null;
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread currentThread = Thread.currentThread();
            Thread thread = null;
            Object[] objArr = 0;
            if (currentThread != this.f34777d) {
                Runnable runnable = this.f34776c;
                Objects.requireNonNull(runnable);
                this.f34776c = null;
                runnable.run();
                return;
            }
            e eVar = new e(objArr == true ? 1 : 0);
            eVar.f34778a = currentThread;
            o0 o0Var = this.f34774a;
            Objects.requireNonNull(o0Var);
            o0Var.f34764b = eVar;
            this.f34774a = null;
            try {
                Runnable runnable2 = this.f34776c;
                Objects.requireNonNull(runnable2);
                this.f34776c = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = eVar.f34779b;
                    if (runnable3 == null || (executor = eVar.f34780c) == null) {
                        break;
                    }
                    eVar.f34779b = null;
                    eVar.f34780c = null;
                    executor.execute(runnable3);
                }
            } finally {
                eVar.f34778a = null;
            }
        }

        public d(Executor delegate, o0 sequencer) {
            super(c.NOT_RUN);
            this.f34775b = delegate;
            this.f34774a = sequencer;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public Thread f34778a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Runnable f34779b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Executor f34780c;

        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(w2 w2Var, h2 h2Var, p1 p1Var, p1 p1Var2, d dVar) {
        if (w2Var.isDone()) {
            h2Var.D(p1Var);
        } else if (p1Var2.isCancelled() && dVar.c()) {
            w2Var.cancel(false);
        }
    }

    public static o0 d() {
        return new o0();
    }

    public <T> p1<T> e(Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        return f(new a(this, callable), executor);
    }

    public <T> p1<T> f(w<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        final d dVar = new d(executor, this, null);
        b bVar = new b(this, dVar, callable);
        final h2 F = h2.F();
        final p1<Void> andSet = this.f34763a.getAndSet(F);
        final w2 N = w2.N(bVar);
        andSet.addListener(N, dVar);
        final p1<T> s11 = d1.s(N);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.n0
            @Override // java.lang.Runnable
            public final void run() {
                o0.a(w2.this, F, andSet, s11, dVar);
            }
        };
        s11.addListener(runnable, w1.c());
        N.addListener(runnable, w1.c());
        return s11;
    }
}
