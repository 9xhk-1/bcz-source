package z80;

import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class t implements ja0.p {

    /* renamed from: a, reason: collision with root package name */
    public final c f102401a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f102402b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f102403c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public c f102404a;

        /* renamed from: b, reason: collision with root package name */
        public c f102405b;

        public t a() {
            c cVar = this.f102405b;
            if (cVar != null) {
                this.f102404a = cVar;
                this.f102405b = null;
            }
            return new t(this.f102404a);
        }

        public final c b() {
            if (this.f102405b == null) {
                this.f102405b = this.f102404a.clone();
            }
            return this.f102405b;
        }

        public b c(p80.n extensionContext) {
            b().f102410e = extensionContext;
            return this;
        }

        public b d(a90.b0 extensionRegistry) {
            b().f102409d = extensionRegistry;
            return this;
        }

        public b e(l0 testInstancesProvider) {
            b().f102408c = testInstancesProvider;
            return this;
        }

        public b f(org.junit.platform.engine.support.hierarchical.m throwableCollector) {
            b().f102411f = throwableCollector;
            return this;
        }

        public b(c originalState) {
            this.f102405b = null;
            this.f102404a = originalState;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public final ca0.r f102406a;

        /* renamed from: b, reason: collision with root package name */
        public final v80.e0 f102407b;

        /* renamed from: c, reason: collision with root package name */
        public l0 f102408c;

        /* renamed from: d, reason: collision with root package name */
        public a90.b0 f102409d;

        /* renamed from: e, reason: collision with root package name */
        public p80.n f102410e;

        /* renamed from: f, reason: collision with root package name */
        public org.junit.platform.engine.support.hierarchical.m f102411f;

        public c(ca0.r executionListener, v80.e0 configuration) {
            this.f102406a = executionListener;
            this.f102407b = configuration;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException e11) {
                throw new JUnitException("State could not be cloned", e11);
            }
        }
    }

    public void a(boolean beforeAllCallbacksExecuted) {
        this.f102402b = beforeAllCallbacksExecuted;
    }

    public boolean b() {
        return this.f102402b;
    }

    public void c(boolean beforeAllMethodsExecuted) {
        this.f102403c = beforeAllMethodsExecuted;
    }

    public boolean d() {
        return this.f102403c;
    }

    public void e() throws Exception {
        p80.n i11 = i();
        if (i11 instanceof AutoCloseable) {
            try {
                androidx.documentfile.provider.a.a((AutoCloseable) i11);
            } catch (Exception e11) {
                throw new JUnitException("Failed to close extension context", e11);
            }
        }
    }

    public b f() {
        return new b(this.f102401a);
    }

    public v80.e0 g() {
        return this.f102401a.f102407b;
    }

    public ca0.r h() {
        return this.f102401a.f102406a;
    }

    public p80.n i() {
        return this.f102401a.f102410e;
    }

    public a90.b0 j() {
        return this.f102401a.f102409d;
    }

    public l0 k() {
        return this.f102401a.f102408c;
    }

    public org.junit.platform.engine.support.hierarchical.m l() {
        return this.f102401a.f102411f;
    }

    public t(ca0.r executionListener, v80.e0 configuration) {
        this(new c(executionListener, configuration));
    }

    public t(c state) {
        this.f102402b = false;
        this.f102403c = false;
        this.f102401a = state;
    }
}
