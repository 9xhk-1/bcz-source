package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i4;
import com.google.common.collect.q6;
import com.google.common.util.concurrent.d1;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Use ClosingFuture.from(Futures.immediate*Future)")
@go.d
@l0
/* loaded from: classes7.dex */
public final class f0<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final o1 f34566d = new o1(f0.class);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<w> f34567a;

    /* renamed from: b, reason: collision with root package name */
    public final m f34568b;

    /* renamed from: c, reason: collision with root package name */
    public final q0<V> f34569c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f34570a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f34571b;

        public a(final f0 this$0, final y val$consumer) {
            this.f34570a = val$consumer;
            this.f34571b = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.x(this.f34570a, this.f34571b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f34572a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f34573b;

        public b(final n val$callable, final m val$closeables) {
            this.f34572a = val$callable;
            this.f34573b = val$closeables;
        }

        @Override // java.util.concurrent.Callable
        @z1
        public V call() throws Exception {
            return (V) this.f34572a.a(this.f34573b.f34588a);
        }

        public String toString() {
            return this.f34572a.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements com.google.common.util.concurrent.w<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f34574a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f34575b;

        public c(final k val$callable, final m val$closeables) {
            this.f34574a = val$callable;
            this.f34575b = val$closeables;
        }

        @Override // com.google.common.util.concurrent.w
        public p1<V> call() throws Exception {
            m mVar = new m(null);
            try {
                f0<V> a11 = this.f34574a.a(mVar.f34588a);
                a11.i(this.f34575b);
                return a11.f34569c;
            } finally {
                this.f34575b.j(mVar, w1.c());
            }
        }

        public String toString() {
            return this.f34574a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<U> implements com.google.common.util.concurrent.x<V, U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f34578a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f34579b;

        public e(final f0 this$0, final o val$function) {
            this.f34578a = val$function;
            this.f34579b = this$0;
        }

        @Override // com.google.common.util.concurrent.x
        public p1<U> apply(V input) throws Exception {
            return this.f34579b.f34568b.a0(this.f34578a, input);
        }

        public String toString() {
            return this.f34578a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f<U> implements com.google.common.util.concurrent.x<V, U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34580a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f34581b;

        public f(final f0 this$0, final l val$function) {
            this.f34580a = val$function;
            this.f34581b = this$0;
        }

        @Override // com.google.common.util.concurrent.x
        public p1<U> apply(V input) throws Exception {
            return this.f34581b.f34568b.w(this.f34580a, input);
        }

        public String toString() {
            return this.f34580a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g<U> implements l<V, U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.common.util.concurrent.x f34582a;

        public g(final com.google.common.util.concurrent.x val$function) {
            this.f34582a = val$function;
        }

        @Override // com.google.common.util.concurrent.f0.l
        public f0<U> a(u closer, V input) throws Exception {
            return f0.w(this.f34582a.apply(input));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h<W, X> implements com.google.common.util.concurrent.x<X, W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f34583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f34584b;

        public h(final f0 this$0, final o val$fallback) {
            this.f34583a = val$fallback;
            this.f34584b = this$0;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/p1<TW;>; */
        @Override // com.google.common.util.concurrent.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p1 apply(Throwable exception) throws Exception {
            return this.f34584b.f34568b.a0(this.f34583a, exception);
        }

        public String toString() {
            return this.f34583a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i<W, X> implements com.google.common.util.concurrent.x<X, W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34585a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f34586b;

        public i(final f0 this$0, final l val$fallback) {
            this.f34585a = val$fallback;
            this.f34586b = this$0;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/p1<TW;>; */
        @Override // com.google.common.util.concurrent.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p1 apply(Throwable exception) throws Exception {
            return this.f34586b.f34568b.w(this.f34585a, exception);
        }

        public String toString() {
            return this.f34585a.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            w wVar = w.WILL_CLOSE;
            w wVar2 = w.CLOSING;
            f0Var.o(wVar, wVar2);
            f0.this.p();
            f0.this.o(wVar2, w.CLOSED);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k<V> {
        f0<V> a(u closer) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface l<T, U> {
        f0<U> a(u closer, @z1 T input) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface n<V> {
        @z1
        V a(u closer) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface o<T, U> {
        @z1
        U a(u closer, @z1 T input) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public final m f34591a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34592b;

        /* renamed from: c, reason: collision with root package name */
        public final ImmutableList<f0<?>> f34593c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Callable<V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f34594a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f34595b;

            public a(final p this$0, final d val$combiningCallable) {
                this.f34594a = val$combiningCallable;
                this.f34595b = this$0;
            }

            @Override // java.util.concurrent.Callable
            @z1
            public V call() throws Exception {
                return (V) new v(this.f34595b.f34593c, null).c(this.f34594a, this.f34595b.f34591a);
            }

            public String toString() {
                return this.f34594a.toString();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements com.google.common.util.concurrent.w<V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f34596a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f34597b;

            public b(final p this$0, final c val$combiningCallable) {
                this.f34596a = val$combiningCallable;
                this.f34597b = this$0;
            }

            @Override // com.google.common.util.concurrent.w
            public p1<V> call() throws Exception {
                return new v(this.f34597b.f34593c, null).d(this.f34596a, this.f34597b.f34591a);
            }

            public String toString() {
                return this.f34596a.toString();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface c<V> {
            f0<V> a(u closer, v peeker) throws Exception;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface d<V> {
            @z1
            V a(u closer, v peeker) throws Exception;
        }

        public /* synthetic */ p(boolean z11, Iterable iterable, b bVar) {
            this(z11, iterable);
        }

        public <V> f0<V> c(final d<V> combiningCallable, Executor executor) {
            f0<V> f0Var = new f0<>(e().a(new a(this, combiningCallable), executor), (b) null);
            f0Var.f34568b.j(this.f34591a, w1.c());
            return f0Var;
        }

        public <V> f0<V> d(final c<V> combiningCallable, Executor executor) {
            f0<V> f0Var = new f0<>(e().b(new b(this, combiningCallable), executor), (b) null);
            f0Var.f34568b.j(this.f34591a, w1.c());
            return f0Var;
        }

        public final d1.c<Object> e() {
            return this.f34592b ? d1.D(f()) : d1.B(f());
        }

        public final ImmutableList<q0<?>> f() {
            return i4.u(this.f34593c).L(new ho.r() { // from class: com.google.common.util.concurrent.g0
                @Override // ho.r
                public final Object apply(Object obj) {
                    q0 q0Var;
                    q0Var = ((f0) obj).f34569c;
                    return q0Var;
                }
            }).F();
        }

        public p(boolean allMustSucceed, Iterable<? extends f0<?>> inputs) {
            this.f34591a = new m(null);
            this.f34592b = allMustSucceed;
            this.f34593c = ImmutableList.copyOf(inputs);
            Iterator<? extends f0<?>> it = inputs.iterator();
            while (it.hasNext()) {
                it.next().i(this.f34591a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q<V1, V2> extends p {

        /* renamed from: d, reason: collision with root package name */
        public final f0<V1> f34598d;

        /* renamed from: e, reason: collision with root package name */
        public final f0<V2> f34599e;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a<U> implements p.d<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f34600a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f34601b;

            public a(final q this$0, final d val$function) {
                this.f34600a = val$function;
                this.f34601b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.d
            @z1
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f34600a.a(uVar, vVar.e(this.f34601b.f34598d), vVar.e(this.f34601b.f34599e));
            }

            public String toString() {
                return this.f34600a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b<U> implements p.c<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f34602a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f34603b;

            public b(final q this$0, final c val$function) {
                this.f34602a = val$function;
                this.f34603b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.c
            public f0<U> a(u closer, v peeker) throws Exception {
                return this.f34602a.a(closer, peeker.e(this.f34603b.f34598d), peeker.e(this.f34603b.f34599e));
            }

            public String toString() {
                return this.f34602a.toString();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface c<V1, V2, U> {
            f0<U> a(u closer, @z1 V1 value1, @z1 V2 value2) throws Exception;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface d<V1, V2, U> {
            @z1
            U a(u closer, @z1 V1 value1, @z1 V2 value2) throws Exception;
        }

        public /* synthetic */ q(f0 f0Var, f0 f0Var2, b bVar) {
            this(f0Var, f0Var2);
        }

        public <U> f0<U> i(d<V1, V2, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> f0<U> j(c<V1, V2, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        public q(f0<V1> future1, f0<V2> future2) {
            super(true, ImmutableList.of((f0<V2>) future1, future2), null);
            this.f34598d = future1;
            this.f34599e = future2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r<V1, V2, V3> extends p {

        /* renamed from: d, reason: collision with root package name */
        public final f0<V1> f34604d;

        /* renamed from: e, reason: collision with root package name */
        public final f0<V2> f34605e;

        /* renamed from: f, reason: collision with root package name */
        public final f0<V3> f34606f;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a<U> implements p.d<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f34607a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f34608b;

            public a(final r this$0, final d val$function) {
                this.f34607a = val$function;
                this.f34608b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.d
            @z1
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f34607a.a(uVar, vVar.e(this.f34608b.f34604d), vVar.e(this.f34608b.f34605e), vVar.e(this.f34608b.f34606f));
            }

            public String toString() {
                return this.f34607a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b<U> implements p.c<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f34609a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f34610b;

            public b(final r this$0, final c val$function) {
                this.f34609a = val$function;
                this.f34610b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.c
            public f0<U> a(u closer, v peeker) throws Exception {
                return this.f34609a.a(closer, peeker.e(this.f34610b.f34604d), peeker.e(this.f34610b.f34605e), peeker.e(this.f34610b.f34606f));
            }

            public String toString() {
                return this.f34609a.toString();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface c<V1, V2, V3, U> {
            f0<U> a(u closer, @z1 V1 value1, @z1 V2 value2, @z1 V3 value3) throws Exception;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface d<V1, V2, V3, U> {
            @z1
            U a(u closer, @z1 V1 value1, @z1 V2 value2, @z1 V3 value3) throws Exception;
        }

        public /* synthetic */ r(f0 f0Var, f0 f0Var2, f0 f0Var3, b bVar) {
            this(f0Var, f0Var2, f0Var3);
        }

        public <U> f0<U> j(d<V1, V2, V3, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> f0<U> k(c<V1, V2, V3, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        public r(f0<V1> future1, f0<V2> future2, f0<V3> future3) {
            super(true, ImmutableList.of((f0<V3>) future1, (f0<V3>) future2, future3), null);
            this.f34604d = future1;
            this.f34605e = future2;
            this.f34606f = future3;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s<V1, V2, V3, V4> extends p {

        /* renamed from: d, reason: collision with root package name */
        public final f0<V1> f34611d;

        /* renamed from: e, reason: collision with root package name */
        public final f0<V2> f34612e;

        /* renamed from: f, reason: collision with root package name */
        public final f0<V3> f34613f;

        /* renamed from: g, reason: collision with root package name */
        public final f0<V4> f34614g;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a<U> implements p.d<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f34615a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f34616b;

            public a(final s this$0, final d val$function) {
                this.f34615a = val$function;
                this.f34616b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.d
            @z1
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f34615a.a(uVar, vVar.e(this.f34616b.f34611d), vVar.e(this.f34616b.f34612e), vVar.e(this.f34616b.f34613f), vVar.e(this.f34616b.f34614g));
            }

            public String toString() {
                return this.f34615a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b<U> implements p.c<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f34617a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f34618b;

            public b(final s this$0, final c val$function) {
                this.f34617a = val$function;
                this.f34618b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.c
            public f0<U> a(u closer, v peeker) throws Exception {
                return this.f34617a.a(closer, peeker.e(this.f34618b.f34611d), peeker.e(this.f34618b.f34612e), peeker.e(this.f34618b.f34613f), peeker.e(this.f34618b.f34614g));
            }

            public String toString() {
                return this.f34617a.toString();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface c<V1, V2, V3, V4, U> {
            f0<U> a(u closer, @z1 V1 value1, @z1 V2 value2, @z1 V3 value3, @z1 V4 value4) throws Exception;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface d<V1, V2, V3, V4, U> {
            @z1
            U a(u closer, @z1 V1 value1, @z1 V2 value2, @z1 V3 value3, @z1 V4 value4) throws Exception;
        }

        public /* synthetic */ s(f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, b bVar) {
            this(f0Var, f0Var2, f0Var3, f0Var4);
        }

        public <U> f0<U> k(d<V1, V2, V3, V4, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> f0<U> l(c<V1, V2, V3, V4, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        public s(f0<V1> future1, f0<V2> future2, f0<V3> future3, f0<V4> future4) {
            super(true, ImmutableList.of((f0<V4>) future1, (f0<V4>) future2, (f0<V4>) future3, future4), null);
            this.f34611d = future1;
            this.f34612e = future2;
            this.f34613f = future3;
            this.f34614g = future4;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t<V1, V2, V3, V4, V5> extends p {

        /* renamed from: d, reason: collision with root package name */
        public final f0<V1> f34619d;

        /* renamed from: e, reason: collision with root package name */
        public final f0<V2> f34620e;

        /* renamed from: f, reason: collision with root package name */
        public final f0<V3> f34621f;

        /* renamed from: g, reason: collision with root package name */
        public final f0<V4> f34622g;

        /* renamed from: h, reason: collision with root package name */
        public final f0<V5> f34623h;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a<U> implements p.d<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f34624a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f34625b;

            public a(final t this$0, final d val$function) {
                this.f34624a = val$function;
                this.f34625b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.d
            @z1
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f34624a.a(uVar, vVar.e(this.f34625b.f34619d), vVar.e(this.f34625b.f34620e), vVar.e(this.f34625b.f34621f), vVar.e(this.f34625b.f34622g), vVar.e(this.f34625b.f34623h));
            }

            public String toString() {
                return this.f34624a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b<U> implements p.c<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f34626a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f34627b;

            public b(final t this$0, final c val$function) {
                this.f34626a = val$function;
                this.f34627b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.f0.p.c
            public f0<U> a(u closer, v peeker) throws Exception {
                return this.f34626a.a(closer, peeker.e(this.f34627b.f34619d), peeker.e(this.f34627b.f34620e), peeker.e(this.f34627b.f34621f), peeker.e(this.f34627b.f34622g), peeker.e(this.f34627b.f34623h));
            }

            public String toString() {
                return this.f34626a.toString();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface c<V1, V2, V3, V4, V5, U> {
            f0<U> a(u closer, @z1 V1 value1, @z1 V2 value2, @z1 V3 value3, @z1 V4 value4, @z1 V5 value5) throws Exception;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface d<V1, V2, V3, V4, V5, U> {
            @z1
            U a(u closer, @z1 V1 value1, @z1 V2 value2, @z1 V3 value3, @z1 V4 value4, @z1 V5 value5) throws Exception;
        }

        public /* synthetic */ t(f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, b bVar) {
            this(f0Var, f0Var2, f0Var3, f0Var4, f0Var5);
        }

        public <U> f0<U> l(d<V1, V2, V3, V4, V5, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> f0<U> m(c<V1, V2, V3, V4, V5, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        public t(f0<V1> future1, f0<V2> future2, f0<V3> future3, f0<V4> future4, f0<V5> future5) {
            super(true, ImmutableList.of((f0<V5>) future1, (f0<V5>) future2, (f0<V5>) future3, (f0<V5>) future4, future5), null);
            this.f34619d = future1;
            this.f34620e = future2;
            this.f34621f = future3;
            this.f34622g = future4;
            this.f34623h = future5;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u {

        /* renamed from: a, reason: collision with root package name */
        @RetainedWith
        public final m f34628a;

        public u(m list) {
            this.f34628a = list;
        }

        @z1
        @uo.a
        public <C extends AutoCloseable> C a(@z1 C closeable, Executor closingExecutor) {
            Preconditions.checkNotNull(closingExecutor);
            if (closeable != null) {
                this.f34628a.j(closeable, closingExecutor);
            }
            return closeable;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList<f0<?>> f34629a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f34630b;

        public /* synthetic */ v(ImmutableList immutableList, b bVar) {
            this(immutableList);
        }

        @z1
        public final <V> V c(p.d<V> combiner, m closeables) throws Exception {
            this.f34630b = true;
            m mVar = new m(null);
            try {
                return combiner.a(mVar.f34588a, this);
            } finally {
                closeables.j(mVar, w1.c());
                this.f34630b = false;
            }
        }

        public final <V> q0<V> d(p.c<V> combiner, m closeables) throws Exception {
            this.f34630b = true;
            m mVar = new m(null);
            try {
                f0<V> a11 = combiner.a(mVar.f34588a, this);
                a11.i(closeables);
                return a11.f34569c;
            } finally {
                closeables.j(mVar, w1.c());
                this.f34630b = false;
            }
        }

        @z1
        public final <D> D e(f0<D> f0Var) throws ExecutionException {
            Preconditions.checkState(this.f34630b);
            Preconditions.checkArgument(this.f34629a.contains(f0Var));
            return (D) d1.j(f0Var.f34569c);
        }

        public v(ImmutableList<f0<?>> futures) {
            this.f34629a = (ImmutableList) Preconditions.checkNotNull(futures);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum w {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x<V> {

        /* renamed from: a, reason: collision with root package name */
        public final f0<? extends V> f34638a;

        public x(f0<? extends V> closingFuture) {
            this.f34638a = (f0) Preconditions.checkNotNull(closingFuture);
        }

        public void a() {
            this.f34638a.p();
        }

        @z1
        public V b() throws ExecutionException {
            return (V) d1.j(this.f34638a.f34569c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface y<V> {
        void a(x<V> valueAndCloser);
    }

    public /* synthetic */ f0(p1 p1Var, b bVar) {
        this(p1Var);
    }

    public static <V> f0<V> A(k<V> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        m mVar = new m(null);
        w2 N = w2.N(new c(callable, mVar));
        executor.execute(N);
        return new f0<>(N, mVar);
    }

    public static p D(f0<?> future1, f0<?>... moreFutures) {
        return E(q6.c(future1, moreFutures));
    }

    public static p E(Iterable<? extends f0<?>> futures) {
        return new p(false, futures, null);
    }

    public static <V1, V2> q<V1, V2> F(f0<V1> future1, f0<V2> future2) {
        return new q<>(future1, future2, null);
    }

    public static <V1, V2, V3> r<V1, V2, V3> G(f0<V1> future1, f0<V2> future2, f0<V3> future3) {
        return new r<>(future1, future2, future3, null);
    }

    public static <V1, V2, V3, V4> s<V1, V2, V3, V4> H(f0<V1> future1, f0<V2> future2, f0<V3> future3, f0<V4> future4) {
        return new s<>(future1, future2, future3, future4, null);
    }

    public static <V1, V2, V3, V4, V5> t<V1, V2, V3, V4, V5> I(f0<V1> future1, f0<V2> future2, f0<V3> future3, f0<V4> future4, f0<V5> future5) {
        return new t<>(future1, future2, future3, future4, future5, null);
    }

    public static p J(f0<?> future1, f0<?> future2, f0<?> future3, f0<?> future4, f0<?> future5, f0<?> future6, f0<?>... moreFutures) {
        return K(i4.C(future1, future2, future3, future4, future5, future6).f(moreFutures));
    }

    public static p K(Iterable<? extends f0<?>> futures) {
        return new p(true, futures, null);
    }

    public static <V, U> l<V, U> M(final com.google.common.util.concurrent.x<V, U> function) {
        Preconditions.checkNotNull(function);
        return new g(function);
    }

    public static /* synthetic */ void a(AutoCloseable autoCloseable) {
        try {
            androidx.documentfile.provider.a.a(autoCloseable);
        } catch (Exception e11) {
            b2.b(e11);
            f34566d.a().log(Level.WARNING, "thrown by close()", (Throwable) e11);
        }
    }

    public static void q(@CheckForNull final AutoCloseable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: com.google.common.util.concurrent.e0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.a(closeable);
                }
            });
        } catch (RejectedExecutionException e11) {
            o1 o1Var = f34566d;
            Logger a11 = o1Var.a();
            Level level = Level.WARNING;
            if (a11.isLoggable(level)) {
                o1Var.a().log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e11);
            }
            q(closeable, w1.c());
        }
    }

    @Deprecated
    public static <C extends AutoCloseable> f0<C> t(p1<C> future, final Executor closingExecutor) {
        Preconditions.checkNotNull(closingExecutor);
        f0<C> f0Var = new f0<>(d1.s(future));
        d1.c(future, new d(closingExecutor), w1.c());
        return f0Var;
    }

    public static <V> f0<V> w(p1<V> future) {
        return new f0<>(future);
    }

    public static <C, V extends C> void x(y<C> consumer, f0<V> closingFuture) {
        consumer.a(new x<>(closingFuture));
    }

    public static <V> f0<V> z(n<V> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        m mVar = new m(null);
        w2 P = w2.P(new b(callable, mVar));
        executor.execute(P);
        return new f0<>(P, mVar);
    }

    public <U> f0<U> B(final o<? super V, U> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return s(this.f34569c.L(new e(this, function), executor));
    }

    public <U> f0<U> C(final l<? super V, U> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return s(this.f34569c.L(new f(this, function), executor));
    }

    @go.e
    public CountDownLatch L() {
        return this.f34568b.v0();
    }

    public void finalize() {
        if (this.f34567a.get().equals(w.OPEN)) {
            f34566d.a().log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            u();
        }
    }

    public final void i(m otherCloseables) {
        o(w.OPEN, w.SUBSUMED);
        otherCloseables.j(this.f34568b, w1.c());
    }

    @uo.a
    public boolean j(boolean mayInterruptIfRunning) {
        f34566d.a().log(Level.FINER, "cancelling {0}", this);
        boolean cancel = this.f34569c.cancel(mayInterruptIfRunning);
        if (cancel) {
            p();
        }
        return cancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> f0<V> k(Class<X> exceptionType, o<? super X, ? extends V> fallback, Executor executor) {
        return n(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> f0<V> l(Class<X> exceptionType, l<? super X, ? extends V> fallback, Executor executor) {
        return m(exceptionType, fallback, executor);
    }

    public final <X extends Throwable, W extends V> f0<V> m(Class<X> cls, l<? super X, W> lVar, Executor executor) {
        Preconditions.checkNotNull(lVar);
        return (f0<V>) s(this.f34569c.H(cls, new i(this, lVar), executor));
    }

    public final <X extends Throwable, W extends V> f0<V> n(Class<X> cls, o<? super X, W> oVar, Executor executor) {
        Preconditions.checkNotNull(oVar);
        return (f0<V>) s(this.f34569c.H(cls, new h(this, oVar), executor));
    }

    public final void o(w oldState, w newState) {
        Preconditions.checkState(r(oldState, newState), "Expected state to be %s, but it was %s", oldState, newState);
    }

    public final void p() {
        f34566d.a().log(Level.FINER, "closing {0}", this);
        this.f34568b.close();
    }

    public final boolean r(w oldState, w newState) {
        return androidx.camera.view.q.a(this.f34567a, oldState, newState);
    }

    public final <U> f0<U> s(q0<U> future) {
        f0<U> f0Var = new f0<>(future);
        i(f0Var.f34568b);
        return f0Var;
    }

    public String toString() {
        return ho.b0.c(this).f("state", this.f34567a.get()).s(this.f34569c).toString();
    }

    public q0<V> u() {
        if (r(w.OPEN, w.WILL_CLOSE)) {
            f34566d.a().log(Level.FINER, "will close {0}", this);
            this.f34569c.addListener(new j(), w1.c());
        } else {
            int ordinal = this.f34567a.get().ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.f34569c;
    }

    public void v(final y<? super V> consumer, Executor executor) {
        Preconditions.checkNotNull(consumer);
        if (r(w.OPEN, w.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.f34569c.addListener(new a(this, consumer), executor);
            return;
        }
        int ordinal = this.f34567a.get().ordinal();
        if (ordinal == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
        }
        if (ordinal == 5) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
        }
        throw new AssertionError(this.f34567a);
    }

    public p1<?> y() {
        return d1.s(this.f34569c.K(ho.t.b(null), w1.c()));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends IdentityHashMap<AutoCloseable, Executor> implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final u f34588a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f34589b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public volatile CountDownLatch f34590c;

        public m() {
            this.f34588a = new u(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <V, U> p1<U> a0(o<? super V, U> transformation, @z1 V input) throws Exception {
            m mVar = new m();
            try {
                return d1.o(transformation.a(mVar.f34588a, input));
            } finally {
                j(mVar, w1.c());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f34589b) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f34589b) {
                        return;
                    }
                    this.f34589b = true;
                    for (Map.Entry<AutoCloseable, Executor> entry : entrySet()) {
                        f0.q(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.f34590c != null) {
                        this.f34590c.countDown();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void j(@CheckForNull AutoCloseable closeable, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f34589b) {
                        f0.q(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public CountDownLatch v0() {
            if (this.f34589b) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.f34589b) {
                        return new CountDownLatch(0);
                    }
                    Preconditions.checkState(this.f34590c == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.f34590c = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public <V, U> q0<U> w(l<V, U> transformation, @z1 V input) throws Exception {
            m mVar = new m();
            try {
                f0<U> a11 = transformation.a(mVar.f34588a, input);
                a11.i(mVar);
                return a11.f34569c;
            } finally {
                j(mVar, w1.c());
            }
        }

        public /* synthetic */ m(b bVar) {
            this();
        }
    }

    public f0(p1<V> future) {
        this(future, new m(null));
    }

    public f0(p1<V> future, m closeables) {
        this.f34567a = new AtomicReference<>(w.OPEN);
        this.f34569c = q0.J(future);
        this.f34568b = closeables;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements a1<AutoCloseable> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f34577b;

        public d(final Executor val$closingExecutor) {
            this.f34577b = val$closingExecutor;
        }

        @Override // com.google.common.util.concurrent.a1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@CheckForNull AutoCloseable result) {
            f0.this.f34568b.f34588a.a(result, this.f34577b);
        }

        @Override // com.google.common.util.concurrent.a1
        public void onFailure(Throwable t11) {
        }
    }
}
