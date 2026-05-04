package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.aa;
import com.google.common.collect.e7;
import com.google.common.collect.g7;
import com.google.common.collect.j7;
import com.google.common.collect.p8;
import com.google.common.collect.q6;
import com.google.common.collect.s7;
import com.google.common.collect.u6;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.s1;
import com.google.common.util.concurrent.v1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class f2 implements g2 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f34639c = new o1(f2.class);

    /* renamed from: d, reason: collision with root package name */
    public static final s1.a<e> f34640d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final s1.a<e> f34641e = new b();

    /* renamed from: a, reason: collision with root package name */
    public final h f34642a;

    /* renamed from: b, reason: collision with root package name */
    public final ImmutableList<Service> f34643b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements s1.a<e> {
        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e listener) {
            listener.b();
        }

        public String toString() {
            return "healthy()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements s1.a<e> {
        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e listener) {
            listener.c();
        }

        public String toString() {
            return "stopped()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Throwable {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Throwable {
        public d(Service service) {
            super(service.toString(), service.e(), false, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends q {
        public f() {
        }

        @Override // com.google.common.util.concurrent.q
        public void n() {
            v();
        }

        @Override // com.google.common.util.concurrent.q
        public void o() {
            w();
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Service.a {

        /* renamed from: a, reason: collision with root package name */
        public final Service f34644a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<h> f34645b;

        public g(Service service, WeakReference<h> state) {
            this.f34644a = service;
            this.f34645b = state;
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void a(Service.State from, Throwable failure) {
            h hVar = this.f34645b.get();
            if (hVar != null) {
                if ((!(this.f34644a instanceof f)) & (from != Service.State.STARTING)) {
                    f2.f34639c.a().log(Level.SEVERE, "Service " + this.f34644a + " has failed in the " + from + " state.", failure);
                }
                hVar.n(this.f34644a, from, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void b() {
            h hVar = this.f34645b.get();
            if (hVar != null) {
                hVar.n(this.f34644a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void c() {
            h hVar = this.f34645b.get();
            if (hVar != null) {
                hVar.n(this.f34644a, Service.State.NEW, Service.State.STARTING);
                if (this.f34644a instanceof f) {
                    return;
                }
                f2.f34639c.a().log(Level.FINE, "Starting {0}.", this.f34644a);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void d(Service.State from) {
            h hVar = this.f34645b.get();
            if (hVar != null) {
                hVar.n(this.f34644a, from, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void e(Service.State from) {
            h hVar = this.f34645b.get();
            if (hVar != null) {
                if (!(this.f34644a instanceof f)) {
                    f2.f34639c.a().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f34644a, from});
                }
                hVar.n(this.f34644a, from, Service.State.TERMINATED);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final v1 f34646a = new v1();

        /* renamed from: b, reason: collision with root package name */
        @vo.a("monitor")
        public final p8<Service.State, Service> f34647b;

        /* renamed from: c, reason: collision with root package name */
        @vo.a("monitor")
        public final j7<Service.State> f34648c;

        /* renamed from: d, reason: collision with root package name */
        @vo.a("monitor")
        public final IdentityHashMap<Service, ho.n0> f34649d;

        /* renamed from: e, reason: collision with root package name */
        @vo.a("monitor")
        public boolean f34650e;

        /* renamed from: f, reason: collision with root package name */
        @vo.a("monitor")
        public boolean f34651f;

        /* renamed from: g, reason: collision with root package name */
        public final int f34652g;

        /* renamed from: h, reason: collision with root package name */
        public final v1.a f34653h;

        /* renamed from: i, reason: collision with root package name */
        public final v1.a f34654i;

        /* renamed from: j, reason: collision with root package name */
        public final s1<e> f34655j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ho.r<Map.Entry<Service, Long>, Long> {
            public a() {
            }

            @Override // ho.r
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long apply(Map.Entry<Service, Long> input) {
                return input.getValue();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements s1.a<e> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Service f34657a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f34658b;

            public b(final h this$0, final Service val$service) {
                this.f34657a = val$service;
                this.f34658b = this$0;
            }

            @Override // com.google.common.util.concurrent.s1.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(e listener) {
                listener.a(this.f34657a);
            }

            public String toString() {
                return "failed({service=" + this.f34657a + "})";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class c extends v1.a {
            public c() {
                super(h.this.f34646a);
            }

            @Override // com.google.common.util.concurrent.v1.a
            @vo.a("ServiceManagerState.this.monitor")
            public boolean a() {
                int count = h.this.f34648c.count(Service.State.RUNNING);
                h hVar = h.this;
                return count == hVar.f34652g || hVar.f34648c.contains(Service.State.STOPPING) || h.this.f34648c.contains(Service.State.TERMINATED) || h.this.f34648c.contains(Service.State.FAILED);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class d extends v1.a {
            public d() {
                super(h.this.f34646a);
            }

            @Override // com.google.common.util.concurrent.v1.a
            @vo.a("ServiceManagerState.this.monitor")
            public boolean a() {
                return h.this.f34648c.count(Service.State.TERMINATED) + h.this.f34648c.count(Service.State.FAILED) == h.this.f34652g;
            }
        }

        public h(ImmutableCollection<Service> services) {
            p8<Service.State, Service> a11 = e7.c(Service.State.class).g().a();
            this.f34647b = a11;
            this.f34648c = a11.keys();
            this.f34649d = new IdentityHashMap<>();
            this.f34653h = new c();
            this.f34654i = new d();
            this.f34655j = new s1<>();
            this.f34652g = services.size();
            a11.putAll(Service.State.NEW, services);
        }

        public void a(e listener, Executor executor) {
            this.f34655j.b(listener, executor);
        }

        public void b() {
            this.f34646a.q(this.f34653h);
            try {
                f();
            } finally {
                this.f34646a.D();
            }
        }

        public void c(long timeout, TimeUnit unit) throws TimeoutException {
            this.f34646a.g();
            try {
                if (this.f34646a.N(this.f34653h, timeout, unit)) {
                    f();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + g7.n(this.f34647b, ho.j0.n(ImmutableSet.of(Service.State.NEW, Service.State.STARTING))));
            } finally {
                this.f34646a.D();
            }
        }

        public void d() {
            this.f34646a.q(this.f34654i);
            this.f34646a.D();
        }

        public void e(long timeout, TimeUnit unit) throws TimeoutException {
            this.f34646a.g();
            try {
                if (this.f34646a.N(this.f34654i, timeout, unit)) {
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + g7.n(this.f34647b, ho.j0.q(ho.j0.n(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
            } finally {
                this.f34646a.D();
            }
        }

        @vo.a("monitor")
        public void f() {
            j7<Service.State> j7Var = this.f34648c;
            Service.State state = Service.State.RUNNING;
            if (j7Var.count(state) != this.f34652g) {
                IllegalStateException illegalStateException = new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + g7.n(this.f34647b, ho.j0.q(ho.j0.m(state))));
                Iterator<Service> it = this.f34647b.get((p8<Service.State, Service>) Service.State.FAILED).iterator();
                while (it.hasNext()) {
                    illegalStateException.addSuppressed(new d(it.next()));
                }
                throw illegalStateException;
            }
        }

        public void g() {
            Preconditions.checkState(!this.f34646a.B(), "It is incorrect to execute listeners with the monitor held.");
            this.f34655j.c();
        }

        public void h(final Service service) {
            this.f34655j.d(new b(this, service));
        }

        public void i() {
            this.f34655j.d(f2.f34640d);
        }

        public void j() {
            this.f34655j.d(f2.f34641e);
        }

        public void k() {
            this.f34646a.g();
            try {
                if (!this.f34651f) {
                    this.f34650e = true;
                    return;
                }
                ArrayList q11 = q6.q();
                aa<Service> it = l().values().iterator();
                while (it.hasNext()) {
                    Service next = it.next();
                    if (next.h() != Service.State.NEW) {
                        q11.add(next);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + q11);
            } finally {
                this.f34646a.D();
            }
        }

        public ImmutableSetMultimap<Service.State, Service> l() {
            ImmutableSetMultimap.a builder = ImmutableSetMultimap.builder();
            this.f34646a.g();
            try {
                for (Map.Entry<Service.State, Service> entry : this.f34647b.entries()) {
                    if (!(entry.getValue() instanceof f)) {
                        builder.j(entry);
                    }
                }
                this.f34646a.D();
                return builder.a();
            } catch (Throwable th2) {
                this.f34646a.D();
                throw th2;
            }
        }

        public ImmutableMap<Service, Long> m() {
            this.f34646a.g();
            try {
                ArrayList u11 = q6.u(this.f34649d.size());
                for (Map.Entry<Service, ho.n0> entry : this.f34649d.entrySet()) {
                    Service key = entry.getKey();
                    ho.n0 value = entry.getValue();
                    if (!value.i() && !(key instanceof f)) {
                        u11.add(u6.O(key, Long.valueOf(value.g(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f34646a.D();
                Collections.sort(u11, s7.z().D(new a()));
                return ImmutableMap.copyOf(u11);
            } catch (Throwable th2) {
                this.f34646a.D();
                throw th2;
            }
        }

        public void n(final Service service, Service.State from, Service.State to2) {
            Preconditions.checkNotNull(service);
            Preconditions.checkArgument(from != to2);
            this.f34646a.g();
            try {
                this.f34651f = true;
                if (this.f34650e) {
                    Preconditions.checkState(this.f34647b.remove(from, service), "Service %s not at the expected location in the state map %s", service, from);
                    Preconditions.checkState(this.f34647b.put(to2, service), "Service %s in the state map unexpectedly at %s", service, to2);
                    ho.n0 n0Var = this.f34649d.get(service);
                    if (n0Var == null) {
                        n0Var = ho.n0.c();
                        this.f34649d.put(service, n0Var);
                    }
                    Service.State state = Service.State.RUNNING;
                    if (to2.compareTo(state) >= 0 && n0Var.i()) {
                        n0Var.l();
                        if (!(service instanceof f)) {
                            f2.f34639c.a().log(Level.FINE, "Started {0} in {1}.", new Object[]{service, n0Var});
                        }
                    }
                    Service.State state2 = Service.State.FAILED;
                    if (to2 == state2) {
                        h(service);
                    }
                    if (this.f34648c.count(state) == this.f34652g) {
                        i();
                    } else if (this.f34648c.count(Service.State.TERMINATED) + this.f34648c.count(state2) == this.f34652g) {
                        j();
                    }
                }
                this.f34646a.D();
                g();
            } catch (Throwable th2) {
                this.f34646a.D();
                g();
                throw th2;
            }
        }

        public void o(Service service) {
            this.f34646a.g();
            try {
                if (this.f34649d.get(service) == null) {
                    this.f34649d.put(service, ho.n0.c());
                }
            } finally {
                this.f34646a.D();
            }
        }
    }

    public f2(Iterable<? extends Service> services) {
        ImmutableList<Service> copyOf = ImmutableList.copyOf(services);
        if (copyOf.isEmpty()) {
            a aVar = null;
            f34639c.a().log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new c(aVar));
            copyOf = ImmutableList.of(new f(aVar));
        }
        h hVar = new h(copyOf);
        this.f34642a = hVar;
        this.f34643b = copyOf;
        WeakReference weakReference = new WeakReference(hVar);
        aa<Service> it = copyOf.iterator();
        while (it.hasNext()) {
            Service next = it.next();
            next.a(new g(next, weakReference), w1.c());
            Preconditions.checkArgument(next.h() == Service.State.NEW, "Can only manage NEW services, %s", next);
        }
        this.f34642a.k();
    }

    public void e(e listener, Executor executor) {
        this.f34642a.a(listener, executor);
    }

    public void f() {
        this.f34642a.b();
    }

    public void g(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34642a.c(timeout, unit);
    }

    public void h() {
        this.f34642a.d();
    }

    public void i(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34642a.e(timeout, unit);
    }

    public boolean j() {
        aa<Service> it = this.f34643b.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.g2
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSetMultimap<Service.State, Service> a() {
        return this.f34642a.l();
    }

    @uo.a
    public f2 l() {
        aa<Service> it = this.f34643b.iterator();
        while (it.hasNext()) {
            Preconditions.checkState(it.next().h() == Service.State.NEW, "Not all services are NEW, cannot start %s", this);
        }
        aa<Service> it2 = this.f34643b.iterator();
        while (it2.hasNext()) {
            Service next = it2.next();
            try {
                this.f34642a.o(next);
                next.g();
            } catch (IllegalStateException e11) {
                f34639c.a().log(Level.WARNING, "Unable to start Service " + next, (Throwable) e11);
            }
        }
        return this;
    }

    public ImmutableMap<Service, Long> m() {
        return this.f34642a.m();
    }

    @uo.a
    public f2 n() {
        aa<Service> it = this.f34643b.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        return this;
    }

    public String toString() {
        return ho.b0.b(f2.class).f("services", com.google.common.collect.y2.d(this.f34643b, ho.j0.q(ho.j0.o(f.class)))).toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e {
        public void b() {
        }

        public void c() {
        }

        public void a(Service service) {
        }
    }
}
