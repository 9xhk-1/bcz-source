package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.s1;
import com.google.common.util.concurrent.v1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class q implements Service {

    /* renamed from: h, reason: collision with root package name */
    public static final s1.a<Service.a> f34786h = new a();

    /* renamed from: i, reason: collision with root package name */
    public static final s1.a<Service.a> f34787i = new b();

    /* renamed from: j, reason: collision with root package name */
    public static final s1.a<Service.a> f34788j;

    /* renamed from: k, reason: collision with root package name */
    public static final s1.a<Service.a> f34789k;

    /* renamed from: l, reason: collision with root package name */
    public static final s1.a<Service.a> f34790l;

    /* renamed from: m, reason: collision with root package name */
    public static final s1.a<Service.a> f34791m;

    /* renamed from: n, reason: collision with root package name */
    public static final s1.a<Service.a> f34792n;

    /* renamed from: o, reason: collision with root package name */
    public static final s1.a<Service.a> f34793o;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f34794a = new v1();

    /* renamed from: b, reason: collision with root package name */
    public final v1.a f34795b = new h();

    /* renamed from: c, reason: collision with root package name */
    public final v1.a f34796c = new i();

    /* renamed from: d, reason: collision with root package name */
    public final v1.a f34797d = new g();

    /* renamed from: e, reason: collision with root package name */
    public final v1.a f34798e = new j();

    /* renamed from: f, reason: collision with root package name */
    public final s1<Service.a> f34799f = new s1<>();

    /* renamed from: g, reason: collision with root package name */
    public volatile k f34800g = new k(Service.State.NEW);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements s1.a<Service.a> {
        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.a listener) {
            listener.c();
        }

        public String toString() {
            return "starting()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements s1.a<Service.a> {
        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.a listener) {
            listener.b();
        }

        public String toString() {
            return "running()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements s1.a<Service.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Service.State f34801a;

        public c(final Service.State val$from) {
            this.f34801a = val$from;
        }

        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.a listener) {
            listener.e(this.f34801a);
        }

        public String toString() {
            return "terminated({from = " + this.f34801a + "})";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements s1.a<Service.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Service.State f34802a;

        public d(final Service.State val$from) {
            this.f34802a = val$from;
        }

        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.a listener) {
            listener.d(this.f34802a);
        }

        public String toString() {
            return "stopping({from = " + this.f34802a + "})";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements s1.a<Service.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Service.State f34803a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f34804b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f34805c;

        public e(final q this$0, final Service.State val$from, final Throwable val$cause) {
            this.f34803a = val$from;
            this.f34804b = val$cause;
            this.f34805c = this$0;
        }

        @Override // com.google.common.util.concurrent.s1.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.a listener) {
            listener.a(this.f34803a, this.f34804b);
        }

        public String toString() {
            return "failed({from = " + this.f34803a + ", cause = " + this.f34804b + "})";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34806a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f34806a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34806a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34806a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34806a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34806a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34806a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends v1.a {
        public g() {
            super(q.this.f34794a);
        }

        @Override // com.google.common.util.concurrent.v1.a
        public boolean a() {
            return q.this.h().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class h extends v1.a {
        public h() {
            super(q.this.f34794a);
        }

        @Override // com.google.common.util.concurrent.v1.a
        public boolean a() {
            return q.this.h() == Service.State.NEW;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class i extends v1.a {
        public i() {
            super(q.this.f34794a);
        }

        @Override // com.google.common.util.concurrent.v1.a
        public boolean a() {
            return q.this.h().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class j extends v1.a {
        public j() {
            super(q.this.f34794a);
        }

        @Override // com.google.common.util.concurrent.v1.a
        public boolean a() {
            return q.this.h().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final Service.State f34811a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34812b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public final Throwable f34813c;

        public k(Service.State internalState) {
            this(internalState, false, null);
        }

        public Service.State a() {
            return (this.f34812b && this.f34811a == Service.State.STARTING) ? Service.State.STOPPING : this.f34811a;
        }

        public Throwable b() {
            Service.State state = this.f34811a;
            Preconditions.checkState(state == Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", state);
            Throwable th2 = this.f34813c;
            Objects.requireNonNull(th2);
            return th2;
        }

        public k(Service.State internalState, boolean shutdownWhenStartupFinishes, @CheckForNull Throwable failure) {
            Preconditions.checkArgument(!shutdownWhenStartupFinishes || internalState == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", internalState);
            Preconditions.checkArgument((failure != null) == (internalState == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", internalState, failure);
            this.f34811a = internalState;
            this.f34812b = shutdownWhenStartupFinishes;
            this.f34813c = failure;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f34788j = x(state);
        Service.State state2 = Service.State.RUNNING;
        f34789k = x(state2);
        f34790l = y(Service.State.NEW);
        f34791m = y(state);
        f34792n = y(state2);
        f34793o = y(Service.State.STOPPING);
    }

    public static s1.a<Service.a> x(final Service.State from) {
        return new d(from);
    }

    public static s1.a<Service.a> y(final Service.State from) {
        return new c(from);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a listener, Executor executor) {
        this.f34799f.b(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        if (this.f34794a.r(this.f34797d, timeout, unit)) {
            try {
                k(Service.State.RUNNING);
            } finally {
                this.f34794a.D();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        if (this.f34794a.r(this.f34798e, timeout, unit)) {
            try {
                k(Service.State.TERMINATED);
            } finally {
                this.f34794a.D();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + h());
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f34794a.q(this.f34797d);
        try {
            k(Service.State.RUNNING);
        } finally {
            this.f34794a.D();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f34800g.b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f34794a.q(this.f34798e);
        try {
            k(Service.State.TERMINATED);
        } finally {
            this.f34794a.D();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service g() {
        if (!this.f34794a.i(this.f34795b)) {
            throw new IllegalStateException("Service " + this + " has already been started");
        }
        try {
            this.f34800g = new k(Service.State.STARTING);
            r();
            n();
        } finally {
            try {
                return this;
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f34800g.a();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service i() {
        if (!this.f34794a.i(this.f34796c)) {
            return this;
        }
        try {
            Service.State h11 = h();
            switch (f.f34806a[h11.ordinal()]) {
                case 1:
                    this.f34800g = new k(Service.State.TERMINATED);
                    t(Service.State.NEW);
                    break;
                case 2:
                    Service.State state = Service.State.STARTING;
                    this.f34800g = new k(state, true, null);
                    s(state);
                    m();
                    break;
                case 3:
                    this.f34800g = new k(Service.State.STOPPING);
                    s(Service.State.RUNNING);
                    o();
                    break;
                case 4:
                case 5:
                case 6:
                    throw new AssertionError("isStoppable is incorrectly implemented, saw: " + h11);
            }
        } finally {
            try {
                return this;
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return h() == Service.State.RUNNING;
    }

    @vo.a("monitor")
    public final void k(Service.State expected) {
        Service.State h11 = h();
        if (h11 != expected) {
            if (h11 == Service.State.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + expected + ", but the service has FAILED", e());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + expected + ", but was " + h11);
        }
    }

    public final void l() {
        if (this.f34794a.B()) {
            return;
        }
        this.f34799f.c();
    }

    @uo.g
    public abstract void n();

    @uo.g
    public abstract void o();

    public final void p(final Service.State from, final Throwable cause) {
        this.f34799f.d(new e(this, from, cause));
    }

    public final void q() {
        this.f34799f.d(f34787i);
    }

    public final void r() {
        this.f34799f.d(f34786h);
    }

    public final void s(final Service.State from) {
        if (from == Service.State.STARTING) {
            this.f34799f.d(f34788j);
        } else {
            if (from != Service.State.RUNNING) {
                throw new AssertionError();
            }
            this.f34799f.d(f34789k);
        }
    }

    public final void t(final Service.State from) {
        switch (f.f34806a[from.ordinal()]) {
            case 1:
                this.f34799f.d(f34790l);
                return;
            case 2:
                this.f34799f.d(f34791m);
                return;
            case 3:
                this.f34799f.d(f34792n);
                return;
            case 4:
                this.f34799f.d(f34793o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + h() + "]";
    }

    public final void u(Throwable cause) {
        Preconditions.checkNotNull(cause);
        this.f34794a.g();
        try {
            Service.State h11 = h();
            int i11 = f.f34806a[h11.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3 || i11 == 4) {
                    this.f34800g = new k(Service.State.FAILED, false, cause);
                    p(h11, cause);
                } else if (i11 != 5) {
                }
                return;
            }
            throw new IllegalStateException("Failed while in state:" + h11, cause);
        } finally {
            this.f34794a.D();
            l();
        }
    }

    public final void v() {
        this.f34794a.g();
        try {
            if (this.f34800g.f34811a != Service.State.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f34800g.f34811a);
                u(illegalStateException);
                throw illegalStateException;
            }
            if (this.f34800g.f34812b) {
                this.f34800g = new k(Service.State.STOPPING);
                o();
            } else {
                this.f34800g = new k(Service.State.RUNNING);
                q();
            }
            this.f34794a.D();
            l();
        } catch (Throwable th2) {
            this.f34794a.D();
            l();
            throw th2;
        }
    }

    public final void w() {
        this.f34794a.g();
        try {
            Service.State h11 = h();
            switch (f.f34806a[h11.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + h11);
                case 2:
                case 3:
                case 4:
                    this.f34800g = new k(Service.State.TERMINATED);
                    t(h11);
                    break;
            }
        } finally {
            this.f34794a.D();
            l();
        }
    }

    @uo.g
    public void m() {
    }
}
