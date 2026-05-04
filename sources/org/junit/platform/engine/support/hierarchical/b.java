package org.junit.platform.engine.support.hierarchical;

import ba0.o1;
import ja0.l1;
import ja0.p1;
import java.lang.Thread;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.support.hierarchical.Node;
import org.junit.platform.engine.support.hierarchical.b;
import org.junit.platform.engine.support.hierarchical.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class b implements org.junit.platform.engine.support.hierarchical.e {

    /* renamed from: a, reason: collision with root package name */
    public final ForkJoinPool f78272a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0959b f78273b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78274c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<c> f78275d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Deque<p1> f78279a = new ArrayDeque(2);

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f78280b = new ArrayList();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface a extends AutoCloseable {
            @Override // java.lang.AutoCloseable
            void close();
        }

        public void c(a task) {
            this.f78280b.add(task);
        }

        public boolean d(final p1 lock) {
            return this.f78279a.stream().allMatch(new Predicate() { // from class: ja0.c0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean Z7;
                    Z7 = ((p1) obj).Z7(p1.this);
                    return Z7;
                }
            });
        }

        public a e(p1 lock) {
            this.f78279a.push(lock);
            final Deque<p1> deque = this.f78279a;
            Objects.requireNonNull(deque);
            return new a() { // from class: ja0.b0
                @Override // org.junit.platform.engine.support.hierarchical.b.c.a, java.lang.AutoCloseable
                public final void close() {
                    deque.pop();
                }
            };
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends ForkJoinWorkerThread {
        public d(ForkJoinPool pool, ClassLoader contextClassLoader) {
            super(pool);
            setContextClassLoader(contextClassLoader);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements ForkJoinPool.ForkJoinWorkerThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ClassLoader f78281a = Thread.currentThread().getContextClassLoader();

        @Override // java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory
        public ForkJoinWorkerThread newThread(ForkJoinPool pool) {
            return new d(pool, this.f78281a);
        }
    }

    public b(ca0.j configurationParameters) {
        this(r(configurationParameters));
    }

    public static boolean L(e.a testTask) {
        return testTask.k().v8().contains(ExclusiveResource.f78259f);
    }

    public static Callable<ForkJoinPool> U(final l1 configuration, final ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory) {
        return new Callable() { // from class: ja0.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return org.junit.platform.engine.support.hierarchical.b.i(l1.this, threadFactory);
            }
        };
    }

    public static Optional<Constructor<ForkJoinPool>> V() {
        return x90.b.f(new Callable() { // from class: ja0.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return org.junit.platform.engine.support.hierarchical.b.e();
            }
        }).q();
    }

    public static Function<Constructor<ForkJoinPool>, Callable<ForkJoinPool>> Z(final l1 configuration, final ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory) {
        return new Function() { // from class: ja0.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.engine.support.hierarchical.b.j(l1.this, threadFactory, (Constructor) obj);
            }
        };
    }

    public static /* synthetic */ String a(b bVar) {
        bVar.getClass();
        return "Using ForkJoinPool with parallelism of " + bVar.f78274c;
    }

    public static /* synthetic */ ForkJoinPool c(Constructor constructor, l1 l1Var, ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory) {
        return (ForkJoinPool) constructor.newInstance(Integer.valueOf(l1Var.a()), forkJoinWorkerThreadFactory, null, Boolean.FALSE, Integer.valueOf(l1Var.e()), Integer.valueOf(l1Var.f()), Integer.valueOf(l1Var.c()), l1Var.d(), Integer.valueOf(l1Var.b()), TimeUnit.SECONDS);
    }

    public static /* synthetic */ Constructor e() {
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        return ForkJoinPool.class.getDeclaredConstructor(cls2, ForkJoinPool.ForkJoinWorkerThreadFactory.class, Thread.UncaughtExceptionHandler.class, Boolean.TYPE, cls2, cls2, cls2, Predicate.class, cls, TimeUnit.class);
    }

    public static /* synthetic */ JUnitException f(Exception exc) {
        return new JUnitException("Failed to create ForkJoinPool", exc);
    }

    public static /* synthetic */ ForkJoinPool i(l1 l1Var, ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory) {
        return new ForkJoinPool(l1Var.a(), forkJoinWorkerThreadFactory, null, false);
    }

    public static /* synthetic */ Callable j(final l1 l1Var, final ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory, final Constructor constructor) {
        return new Callable() { // from class: ja0.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return org.junit.platform.engine.support.hierarchical.b.c(constructor, l1Var, forkJoinWorkerThreadFactory);
            }
        };
    }

    public static l1 r(ca0.j configurationParameters) {
        return DefaultParallelExecutionConfigurationStrategy.getStrategy(configurationParameters).a(configurationParameters);
    }

    public final void C(Deque<a> tasks) {
        Iterator<a> it = tasks.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void E(List<? extends e.a> tasks, Deque<a> isolatedTasks, Deque<a> sameThreadTasks, Deque<a> concurrentTasksInReverseOrder) {
        for (e.a aVar : tasks) {
            a aVar2 = new a(aVar);
            if (L(aVar)) {
                isolatedTasks.add(aVar2);
            } else if (aVar.j() == Node.ExecutionMode.SAME_THREAD) {
                sameThreadTasks.add(aVar2);
            } else {
                aVar2.fork();
                concurrentTasksInReverseOrder.addFirst(aVar2);
            }
        }
    }

    public final boolean H() {
        return ForkJoinTask.getPool() == this.f78272a;
    }

    public final void I(Deque<a> concurrentTasksInReverseOrder) {
        Iterator<a> it = concurrentTasksInReverseOrder.iterator();
        while (it.hasNext()) {
            it.next().join();
            S();
        }
    }

    public final void S() {
        List<a> list = this.f78275d.get().f78280b;
        for (a aVar : list) {
            if (!aVar.isDone()) {
                aVar.fork();
            }
        }
        list.clear();
    }

    @Override // org.junit.platform.engine.support.hierarchical.e, java.lang.AutoCloseable
    public void close() {
        this.f78272a.shutdownNow();
    }

    @Override // org.junit.platform.engine.support.hierarchical.e
    public Future<Void> e3(e.a testTask) {
        a aVar = new a(testTask);
        if (!H()) {
            return this.f78272a.submit(aVar);
        }
        if (testTask.j() == Node.ExecutionMode.CONCURRENT && ForkJoinTask.getSurplusQueuedTaskCount() < this.f78274c) {
            return aVar.fork();
        }
        aVar.a();
        return CompletableFuture.completedFuture(null);
    }

    @Override // org.junit.platform.engine.support.hierarchical.e
    public void v7(List<? extends e.a> tasks) {
        if (tasks.size() == 1) {
            new a(tasks.get(0)).a();
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        E(tasks, linkedList, linkedList2, linkedList3);
        C(linkedList2);
        I(linkedList3);
        C(linkedList);
    }

    public final ForkJoinPool w(l1 configuration) {
        e eVar = new e();
        return (ForkJoinPool) x90.b.f((Callable) V().map(Z(configuration, eVar)).orElse(U(configuration, eVar))).j(new Function() { // from class: ja0.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.engine.support.hierarchical.b.f((Exception) obj);
            }
        });
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public b(l1 configuration) {
        this(configuration, InterfaceC0959b.f78278a);
    }

    public b(l1 configuration, InterfaceC0959b taskEventListener) {
        this.f78275d = new androidx.emoji2.text.flatbuffer.b(new Supplier() { // from class: ja0.u
            @Override // java.util.function.Supplier
            public final Object get() {
                return new b.c();
            }
        });
        ForkJoinPool w11 = w(configuration);
        this.f78272a = w11;
        this.f78273b = taskEventListener;
        this.f78274c = w11.getParallelism();
        y90.g.c(getClass()).j(new Supplier() { // from class: ja0.v
            @Override // java.util.function.Supplier
            public final Object get() {
                return org.junit.platform.engine.support.hierarchical.b.a(org.junit.platform.engine.support.hierarchical.b.this);
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ForkJoinTask<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final e.a f78276a;

        public a(e.a testTask) {
            this.f78276a = testTask;
        }

        public void a() {
            if (exec()) {
                return;
            }
            throw new IllegalStateException("Task was deferred but should have been executed synchronously: " + this.f78276a);
        }

        @Override // java.util.concurrent.ForkJoinTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void getRawResult() {
            return null;
        }

        @Override // java.util.concurrent.ForkJoinTask
        public boolean exec() {
            p1 k11 = this.f78276a.k();
            c cVar = (c) b.this.f78275d.get();
            if (!cVar.d(k11)) {
                cVar.c(this);
                b.this.f78273b.b(this.f78276a);
                return false;
            }
            try {
                p1 acquire = k11.acquire();
                try {
                    c.a e11 = cVar.e(acquire);
                    try {
                        this.f78276a.execute();
                        if (e11 != null) {
                            e11.close();
                        }
                        if (acquire == null) {
                            return true;
                        }
                        acquire.close();
                        return true;
                    } finally {
                    }
                } finally {
                }
            } catch (InterruptedException e12) {
                throw o1.e(e12);
            }
        }

        public String toString() {
            return "ExclusiveTask [" + this.f78276a + "]";
        }

        @Override // java.util.concurrent.ForkJoinTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void setRawResult(Void mustBeNull) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: org.junit.platform.engine.support.hierarchical.b$b, reason: collision with other inner class name */
    public interface InterfaceC0959b {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0959b f78278a = new InterfaceC0959b() { // from class: ja0.a0
            @Override // org.junit.platform.engine.support.hierarchical.b.InterfaceC0959b
            public final void b(e.a aVar) {
                b.InterfaceC0959b.a(aVar);
            }
        };

        void b(e.a testTask);

        static /* synthetic */ void a(e.a aVar) {
        }
    }
}
