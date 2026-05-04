package org.junit.platform.engine.support.hierarchical;

import ca0.r;
import org.junit.platform.engine.support.hierarchical.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f78305a;

    /* renamed from: b, reason: collision with root package name */
    public final e f78306b;

    /* renamed from: c, reason: collision with root package name */
    public final m.b f78307c;

    /* renamed from: d, reason: collision with root package name */
    public final g f78308d;

    public i(r listener, e executorService, m.b throwableCollectorFactory, g executionAdvisor) {
        this.f78305a = listener;
        this.f78306b = executorService;
        this.f78307c = throwableCollectorFactory;
        this.f78308d = executionAdvisor;
    }

    public g a() {
        return this.f78308d;
    }

    public e b() {
        return this.f78306b;
    }

    public r c() {
        return this.f78305a;
    }

    public m.b d() {
        return this.f78307c;
    }

    public i e(r listener) {
        return this.f78305a == listener ? this : new i(listener, this.f78306b, this.f78307c, this.f78308d);
    }
}
