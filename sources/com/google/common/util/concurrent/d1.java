package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.d1;
import com.google.common.util.concurrent.f;
import com.google.common.util.concurrent.h0;
import com.google.common.util.concurrent.k1;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class d1 extends j1 {

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<O> implements Future<O> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Future f34497a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ho.r f34498b;

        public a(final Future val$input, final ho.r val$function) {
            this.f34497a = val$input;
            this.f34498b = val$function;
        }

        public final O a(I i11) throws ExecutionException {
            try {
                return (O) this.f34498b.apply(i11);
            } catch (Throwable th2) {
                throw new ExecutionException(th2);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            return this.f34497a.cancel(mayInterruptIfRunning);
        }

        @Override // java.util.concurrent.Future
        public O get() throws InterruptedException, ExecutionException {
            return a(this.f34497a.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f34497a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f34497a.isDone();
        }

        @Override // java.util.concurrent.Future
        public O get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return a(this.f34497a.get(timeout, unit));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Future<V> f34499a;

        /* renamed from: b, reason: collision with root package name */
        public final a1<? super V> f34500b;

        public b(Future<V> future, a1<? super V> callback) {
            this.f34499a = future;
            this.f34500b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a11;
            Future<V> future = this.f34499a;
            if ((future instanceof so.a) && (a11 = so.b.a((so.a) future)) != null) {
                this.f34500b.onFailure(a11);
                return;
            }
            try {
                this.f34500b.onSuccess(d1.j(this.f34499a));
            } catch (ExecutionException e11) {
                this.f34500b.onFailure(e11.getCause());
            } catch (Throwable th2) {
                this.f34500b.onFailure(th2);
            }
        }

        public String toString() {
            return ho.b0.c(this).s(this.f34500b).toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static final class c<V> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f34501a;

        /* renamed from: b, reason: collision with root package name */
        public final ImmutableList<p1<? extends V>> f34502b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Callable<Void> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f34503a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f34504b;

            public a(final c this$0, final Runnable val$combiner) {
                this.f34503a = val$combiner;
                this.f34504b = this$0;
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f34503a.run();
                return null;
            }
        }

        public /* synthetic */ c(boolean z11, ImmutableList immutableList, a aVar) {
            this(z11, immutableList);
        }

        public <C> p1<C> a(Callable<C> combiner, Executor executor) {
            return new i0(this.f34502b, this.f34501a, executor, combiner);
        }

        public <C> p1<C> b(w<C> combiner, Executor executor) {
            return new i0(this.f34502b, this.f34501a, executor, combiner);
        }

        public p1<?> c(final Runnable combiner, Executor executor) {
            return a(new a(this, combiner), executor);
        }

        public c(boolean allMustSucceed, ImmutableList<p1<? extends V>> futures) {
            this.f34501a = allMustSucceed;
            this.f34502b = futures;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends com.google.common.util.concurrent.f<T> {

        /* renamed from: i, reason: collision with root package name */
        @CheckForNull
        public e<T> f34505i;

        public /* synthetic */ d(e eVar, a aVar) {
            this(eVar);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public boolean cancel(boolean interruptIfRunning) {
            e<T> eVar = this.f34505i;
            if (!super.cancel(interruptIfRunning)) {
                return false;
            }
            Objects.requireNonNull(eVar);
            eVar.g(interruptIfRunning);
            return true;
        }

        @Override // com.google.common.util.concurrent.f
        public void m() {
            this.f34505i = null;
        }

        @Override // com.google.common.util.concurrent.f
        @CheckForNull
        public String y() {
            e<T> eVar = this.f34505i;
            if (eVar == null) {
                return null;
            }
            return "inputCount=[" + eVar.f34509d.length + "], remaining=[" + eVar.f34508c.get() + "]";
        }

        public d(e<T> state) {
            this.f34505i = state;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f34506a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f34507b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f34508c;

        /* renamed from: d, reason: collision with root package name */
        public final p1<? extends T>[] f34509d;

        /* renamed from: e, reason: collision with root package name */
        public volatile int f34510e;

        public /* synthetic */ e(p1[] p1VarArr, a aVar) {
            this(p1VarArr);
        }

        public final void e() {
            if (this.f34508c.decrementAndGet() == 0 && this.f34506a) {
                for (p1<? extends T> p1Var : this.f34509d) {
                    if (p1Var != null) {
                        p1Var.cancel(this.f34507b);
                    }
                }
            }
        }

        public final void f(ImmutableList<com.google.common.util.concurrent.f<T>> delegates, int inputFutureIndex) {
            p1<? extends T> p1Var = this.f34509d[inputFutureIndex];
            Objects.requireNonNull(p1Var);
            p1<? extends T> p1Var2 = p1Var;
            this.f34509d[inputFutureIndex] = null;
            for (int i11 = this.f34510e; i11 < delegates.size(); i11++) {
                if (delegates.get(i11).D(p1Var2)) {
                    e();
                    this.f34510e = i11 + 1;
                    return;
                }
            }
            this.f34510e = delegates.size();
        }

        public final void g(boolean interruptIfRunning) {
            this.f34506a = true;
            if (!interruptIfRunning) {
                this.f34507b = false;
            }
            e();
        }

        public e(p1<? extends T>[] inputFutures) {
            this.f34506a = false;
            this.f34507b = true;
            this.f34510e = 0;
            this.f34509d = inputFutures;
            this.f34508c = new AtomicInteger(inputFutures.length);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<V> extends f.j<V> implements Runnable {

        /* renamed from: i, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public p1<V> f34511i;

        public f(final p1<V> delegate) {
            this.f34511i = delegate;
        }

        @Override // com.google.common.util.concurrent.f
        public void m() {
            this.f34511i = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            p1<V> p1Var = this.f34511i;
            if (p1Var != null) {
                D(p1Var);
            }
        }

        @Override // com.google.common.util.concurrent.f
        @CheckForNull
        public String y() {
            p1<V> p1Var = this.f34511i;
            if (p1Var == null) {
                return null;
            }
            return "delegate=[" + p1Var + "]";
        }
    }

    public static <I, O> p1<O> A(p1<I> input, x<? super I, ? extends O> function, Executor executor) {
        return r.O(input, function, executor);
    }

    public static <V> c<V> B(Iterable<? extends p1<? extends V>> futures) {
        return new c<>(false, ImmutableList.copyOf(futures), null);
    }

    @SafeVarargs
    public static <V> c<V> C(p1<? extends V>... futures) {
        return new c<>(false, ImmutableList.copyOf(futures), null);
    }

    public static <V> c<V> D(Iterable<? extends p1<? extends V>> futures) {
        return new c<>(true, ImmutableList.copyOf(futures), null);
    }

    @SafeVarargs
    public static <V> c<V> E(p1<? extends V>... futures) {
        return new c<>(true, ImmutableList.copyOf(futures), null);
    }

    @go.d
    @go.c
    public static <V> p1<V> F(p1<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return delegate.isDone() ? delegate : v2.Q(delegate, time, unit, scheduledExecutor);
    }

    public static void G(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new UncheckedExecutionException(cause);
        }
        throw new ExecutionError((Error) cause);
    }

    public static <V> void c(final p1<V> future, final a1<? super V> callback, Executor executor) {
        Preconditions.checkNotNull(callback);
        future.addListener(new b(future, callback), executor);
    }

    public static <V> p1<List<V>> d(Iterable<? extends p1<? extends V>> futures) {
        return new h0.a(ImmutableList.copyOf(futures), true);
    }

    @SafeVarargs
    public static <V> p1<List<V>> e(p1<? extends V>... futures) {
        return new h0.a(ImmutableList.copyOf(futures), true);
    }

    @go.d
    @a2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> p1<V> f(p1<? extends V> input, Class<X> exceptionType, ho.r<? super X, ? extends V> fallback, Executor executor) {
        return com.google.common.util.concurrent.a.N(input, exceptionType, fallback, executor);
    }

    @go.d
    @a2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> p1<V> g(p1<? extends V> input, Class<X> exceptionType, x<? super X, ? extends V> fallback, Executor executor) {
        return com.google.common.util.concurrent.a.O(input, exceptionType, fallback, executor);
    }

    @z1
    @go.d
    @go.c
    @uo.a
    public static <V, X extends Exception> V h(Future<V> future, Class<X> cls) throws Exception {
        return (V) h1.g(future, cls);
    }

    @z1
    @go.d
    @go.c
    @uo.a
    public static <V, X extends Exception> V i(Future<V> future, Class<X> cls, long j11, TimeUnit timeUnit) throws Exception {
        return (V) h1.h(future, cls, j11, timeUnit);
    }

    @z1
    @uo.a
    public static <V> V j(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) y2.f(future);
    }

    @z1
    @uo.a
    public static <V> V k(Future<V> future) {
        Preconditions.checkNotNull(future);
        try {
            return (V) y2.f(future);
        } catch (ExecutionException e11) {
            G(e11.getCause());
            throw new AssertionError();
        }
    }

    public static <T> p1<? extends T>[] l(Iterable<? extends p1<? extends T>> futures) {
        return (p1[]) (futures instanceof Collection ? (Collection) futures : ImmutableList.copyOf(futures)).toArray(new p1[0]);
    }

    public static <V> p1<V> m() {
        k1.a<Object> aVar = k1.a.f34700i;
        return aVar != null ? aVar : new k1.a();
    }

    public static <V> p1<V> n(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        return new k1.b(throwable);
    }

    public static <V> p1<V> o(@z1 V v11) {
        return v11 == null ? (p1<V>) k1.f34697b : new k1(v11);
    }

    public static p1<Void> p() {
        return k1.f34697b;
    }

    public static <T> ImmutableList<p1<T>> q(Iterable<? extends p1<? extends T>> futures) {
        p1[] l11 = l(futures);
        a aVar = null;
        final e eVar = new e(l11, aVar);
        ImmutableList.a builderWithExpectedSize = ImmutableList.builderWithExpectedSize(l11.length);
        for (int i11 = 0; i11 < l11.length; i11++) {
            builderWithExpectedSize.g(new d(eVar, aVar));
        }
        final ImmutableList<p1<T>> e11 = builderWithExpectedSize.e();
        for (final int i12 = 0; i12 < l11.length; i12++) {
            l11[i12].addListener(new Runnable() { // from class: com.google.common.util.concurrent.b1
                @Override // java.lang.Runnable
                public final void run() {
                    d1.e.this.f(e11, i12);
                }
            }, w1.c());
        }
        return e11;
    }

    @go.d
    @go.c
    public static <I, O> Future<O> r(final Future<I> input, final ho.r<? super I, ? extends O> function) {
        Preconditions.checkNotNull(input);
        Preconditions.checkNotNull(function);
        return new a(input, function);
    }

    public static <V> p1<V> s(p1<V> future) {
        if (future.isDone()) {
            return future;
        }
        f fVar = new f(future);
        future.addListener(fVar, w1.c());
        return fVar;
    }

    @go.d
    @go.c
    public static <O> p1<O> t(w<O> callable, long delay, TimeUnit timeUnit, ScheduledExecutorService executorService) {
        w2 N = w2.N(callable);
        final ScheduledFuture<?> schedule = executorService.schedule(N, delay, timeUnit);
        N.addListener(new Runnable() { // from class: com.google.common.util.concurrent.c1
            @Override // java.lang.Runnable
            public final void run() {
                schedule.cancel(false);
            }
        }, w1.c());
        return N;
    }

    public static p1<Void> u(Runnable runnable, Executor executor) {
        w2 O = w2.O(runnable, null);
        executor.execute(O);
        return O;
    }

    public static <O> p1<O> v(Callable<O> callable, Executor executor) {
        w2 P = w2.P(callable);
        executor.execute(P);
        return P;
    }

    public static <O> p1<O> w(w<O> callable, Executor executor) {
        w2 N = w2.N(callable);
        executor.execute(N);
        return N;
    }

    public static <V> p1<List<V>> x(Iterable<? extends p1<? extends V>> futures) {
        return new h0.a(ImmutableList.copyOf(futures), false);
    }

    @SafeVarargs
    public static <V> p1<List<V>> y(p1<? extends V>... futures) {
        return new h0.a(ImmutableList.copyOf(futures), false);
    }

    public static <I, O> p1<O> z(p1<I> input, ho.r<? super I, ? extends O> function, Executor executor) {
        return r.N(input, function, executor);
    }
}
