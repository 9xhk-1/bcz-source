package org.junit.platform.engine.support.hierarchical;

import ca0.s;
import ja0.p;
import java.util.concurrent.Future;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.support.hierarchical.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d<C extends p> {

    /* renamed from: a, reason: collision with root package name */
    public final s f78282a;

    /* renamed from: b, reason: collision with root package name */
    public final C f78283b;

    /* renamed from: c, reason: collision with root package name */
    public final e f78284c;

    /* renamed from: d, reason: collision with root package name */
    public final m.b f78285d;

    public d(s request, C rootContext, e executorService, m.b throwableCollectorFactory) {
        this.f78282a = request;
        this.f78283b = rootContext;
        this.f78284c = executorService;
        this.f78285d = throwableCollectorFactory;
    }

    public Future<Void> a() {
        TestDescriptor d11 = this.f78282a.d();
        h hVar = new h(new i(this.f78282a.c(), this.f78284c, this.f78285d, new j().m(d11)), d11);
        hVar.w(this.f78283b);
        return this.f78284c.e3(hVar);
    }
}
