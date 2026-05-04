package org.junit.platform.engine.support.hierarchical;

import androidx.camera.core.CameraInfo;
import ba0.c2;
import ba0.h4;
import ba0.o1;
import ca0.r;
import ja0.i1;
import ja0.p;
import ja0.p1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;
import org.junit.platform.engine.support.hierarchical.e;
import org.junit.platform.engine.support.hierarchical.h;
import org.junit.platform.engine.support.hierarchical.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h<C extends p> implements e.a {

    /* renamed from: j, reason: collision with root package name */
    public static final y90.e f78291j = y90.g.c(h.class);

    /* renamed from: k, reason: collision with root package name */
    public static final Runnable f78292k = new Runnable() { // from class: ja0.t0
        @Override // java.lang.Runnable
        public final void run() {
            org.junit.platform.engine.support.hierarchical.h.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final i f78293a;

    /* renamed from: b, reason: collision with root package name */
    public final TestDescriptor f78294b;

    /* renamed from: c, reason: collision with root package name */
    public final Node<C> f78295c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f78296d;

    /* renamed from: e, reason: collision with root package name */
    public C f78297e;

    /* renamed from: f, reason: collision with root package name */
    public C f78298f;

    /* renamed from: g, reason: collision with root package name */
    public Node.c f78299g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78300h;

    /* renamed from: i, reason: collision with root package name */
    public m f78301i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Node.a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<UniqueId, c> f78302a;

        public b() {
            this.f78302a = new ConcurrentHashMap();
        }

        @Override // org.junit.platform.engine.support.hierarchical.Node.a
        public void a() throws InterruptedException {
            Iterator<c> it = this.f78302a.values().iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (CancellationException unused) {
                } catch (ExecutionException e11) {
                    throw o1.e(e11.getCause());
                }
            }
        }

        @Override // org.junit.platform.engine.support.hierarchical.Node.a
        public void b(TestDescriptor testDescriptor) {
            c(testDescriptor, h.this.f78293a.c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.junit.platform.engine.support.hierarchical.Node.a
        public Future<?> c(TestDescriptor testDescriptor, r executionListener) {
            c2.r(testDescriptor, "testDescriptor must not be null");
            c2.r(executionListener, "executionListener must not be null");
            executionListener.d(testDescriptor);
            Set<ExclusiveResource> n11 = i1.a(testDescriptor).n();
            if (!n11.isEmpty()) {
                executionListener.c(testDescriptor);
                executionListener.b(testDescriptor, TestExecutionResult.b(new JUnitException("Dynamic test descriptors must not declare exclusive resources: " + n11)));
                return CompletableFuture.completedFuture(null);
            }
            final UniqueId uniqueId = testDescriptor.getUniqueId();
            h hVar = new h(h.this.f78293a.e(executionListener), testDescriptor, new Runnable() { // from class: ja0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.f78302a.remove(uniqueId);
                }
            });
            hVar.w(h.this.f78298f);
            this.f78302a.put(uniqueId, c.c());
            final Future<Void> e32 = h.this.f78293a.b().e3(hVar);
            this.f78302a.computeIfPresent(uniqueId, new BiFunction() { // from class: ja0.x0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    h.c b11;
                    b11 = h.c.b(e32);
                    return b11;
                }
            });
            return e32;
        }
    }

    public h(i taskContext, TestDescriptor testDescriptor) {
        this(taskContext, testDescriptor, f78292k);
    }

    public static /* synthetic */ void b(final h hVar) {
        List<? extends e.a> list = (List) hVar.f78294b.C().stream().map(new Function() { // from class: ja0.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.engine.support.hierarchical.h.n(org.junit.platform.engine.support.hierarchical.h.this, (TestDescriptor) obj);
            }
        }).collect(Collectors.toCollection(new x80.e()));
        hVar.f78298f = hVar.f78295c.D(hVar.f78298f);
        final b bVar = new b();
        hVar.f78298f = hVar.f78295c.z(hVar.f78298f, bVar);
        if (!list.isEmpty()) {
            list.forEach(new Consumer() { // from class: ja0.j0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((org.junit.platform.engine.support.hierarchical.h) obj).w(org.junit.platform.engine.support.hierarchical.h.this.f78298f);
                }
            });
            hVar.f78293a.b().v7(list);
        }
        hVar.f78301i.c(new m.a() { // from class: ja0.k0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                Node.a.this.a();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(final h hVar, p pVar) {
        hVar.f78298f = pVar;
        hVar.f78301i.c(new m.a() { // from class: ja0.i0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                org.junit.platform.engine.support.hierarchical.h.b(org.junit.platform.engine.support.hierarchical.h.this);
            }
        });
        hVar.f78301i.c(new m.a() { // from class: ja0.n0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                r0.f78295c.x(org.junit.platform.engine.support.hierarchical.h.this.f78298f);
            }
        });
    }

    public static /* synthetic */ h n(h hVar, TestDescriptor testDescriptor) {
        return new h(hVar.f78293a, testDescriptor);
    }

    @Override // org.junit.platform.engine.support.hierarchical.e.a
    public void execute() {
        try {
            this.f78301i = this.f78293a.d().create();
            u();
            if (this.f78301i.f()) {
                r();
            }
            if (this.f78301i.f() && !this.f78299g.c()) {
                t();
            }
            if (this.f78298f != null) {
                s();
            }
            v();
            if (Thread.interrupted()) {
                f78291j.h(new Supplier() { // from class: ja0.o0
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        String format;
                        format = String.format("Execution of TestDescriptor with display name [%s] and unique ID [%s] failed to clear the 'interrupted status' flag for the current thread. JUnit has cleared the flag, but you may wish to investigate why the flag was not cleared by user code.", r0.f78294b.a(), org.junit.platform.engine.support.hierarchical.h.this.f78294b.getUniqueId());
                        return format;
                    }
                });
            }
            this.f78296d.run();
            this.f78298f = null;
        } catch (Throwable th2) {
            if (Thread.interrupted()) {
                f78291j.h(new Supplier() { // from class: ja0.o0
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        String format;
                        format = String.format("Execution of TestDescriptor with display name [%s] and unique ID [%s] failed to clear the 'interrupted status' flag for the current thread. JUnit has cleared the flag, but you may wish to investigate why the flag was not cleared by user code.", r0.f78294b.a(), org.junit.platform.engine.support.hierarchical.h.this.f78294b.getUniqueId());
                        return format;
                    }
                });
            }
            this.f78296d.run();
            throw th2;
        }
    }

    @Override // org.junit.platform.engine.support.hierarchical.e.a
    public Node.ExecutionMode j() {
        return this.f78293a.a().c(this.f78294b).orElse(this.f78295c.j());
    }

    @Override // org.junit.platform.engine.support.hierarchical.e.a
    public p1 k() {
        return this.f78293a.a().d(this.f78294b);
    }

    public final void r() {
        this.f78301i.c(new m.a() { // from class: ja0.u0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                org.junit.platform.engine.support.hierarchical.h.this.f78299g = r0.f78295c.E(r0.f78298f);
            }
        });
    }

    public final void s() {
        this.f78301i.c(new m.a() { // from class: ja0.p0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                r0.f78295c.v(org.junit.platform.engine.support.hierarchical.h.this.f78298f);
            }
        });
    }

    public final void t() {
        this.f78293a.c().c(this.f78294b);
        this.f78300h = true;
        this.f78301i.c(new m.a() { // from class: ja0.s0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                r0.f78295c.h(r0.f78298f, new Node.b() { // from class: ja0.r0
                    @Override // org.junit.platform.engine.support.hierarchical.Node.b
                    public final void a(p pVar) {
                        org.junit.platform.engine.support.hierarchical.h.l(org.junit.platform.engine.support.hierarchical.h.this, pVar);
                    }
                });
            }
        });
    }

    public String toString() {
        return "NodeTestTask [" + this.f78294b + "]";
    }

    public final void u() {
        this.f78301i.c(new m.a() { // from class: ja0.q0
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                org.junit.platform.engine.support.hierarchical.h.this.f78298f = r0.f78295c.l(r0.f78297e);
            }
        });
        this.f78297e = null;
    }

    public final void v() {
        if (this.f78301i.f() && this.f78299g.c()) {
            try {
                this.f78295c.k(this.f78298f, this.f78294b, this.f78299g);
            } catch (Throwable th2) {
                h4.a(th2);
                f78291j.a(th2, new Supplier() { // from class: ja0.l0
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        String format;
                        format = String.format("Failed to invoke nodeSkipped() on Node %s", org.junit.platform.engine.support.hierarchical.h.this.f78294b.getUniqueId());
                        return format;
                    }
                });
            }
            this.f78293a.c().e(this.f78294b, this.f78299g.b().orElse(CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN));
            return;
        }
        if (!this.f78300h) {
            this.f78293a.c().c(this.f78294b);
        }
        try {
            this.f78295c.y(this.f78298f, this.f78294b, this.f78301i.h());
        } catch (Throwable th3) {
            h4.a(th3);
            f78291j.a(th3, new Supplier() { // from class: ja0.m0
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Failed to invoke nodeFinished() on Node %s", org.junit.platform.engine.support.hierarchical.h.this.f78294b.getUniqueId());
                    return format;
                }
            });
        }
        this.f78293a.c().b(this.f78294b, this.f78301i.h());
        this.f78301i = null;
    }

    public void w(C parentContext) {
        this.f78297e = parentContext;
    }

    public h(i taskContext, TestDescriptor testDescriptor, Runnable finalizer) {
        this.f78293a = taskContext;
        this.f78294b = testDescriptor;
        this.f78295c = i1.a(testDescriptor);
        this.f78296d = finalizer;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f78304a = new c() { // from class: ja0.z0
            @Override // org.junit.platform.engine.support.hierarchical.h.c
            public final void a() {
                h.c.d();
            }
        };

        static c b(final Future<Void> future) {
            Objects.requireNonNull(future);
            return new c() { // from class: ja0.y0
                @Override // org.junit.platform.engine.support.hierarchical.h.c
                public final void a() {
                    future.get();
                }
            };
        }

        static c c() {
            return f78304a;
        }

        void a() throws CancellationException, ExecutionException, InterruptedException;

        static /* synthetic */ void d() {
        }
    }

    public static /* synthetic */ void d() {
    }
}
