package u80;

import ca0.q;
import ca0.s;
import java.util.Optional;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.e;
import org.junit.platform.engine.support.hierarchical.m;
import v80.e0;
import v80.l;
import v80.o;
import w80.l2;
import x80.y0;
import z80.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class c extends org.junit.platform.engine.support.hierarchical.c<t> {
    @Override // ca0.c0
    public TestDescriptor a(q discoveryRequest, UniqueId uniqueId) {
        l2 l2Var = new l2(uniqueId, new l(new o(discoveryRequest.d())));
        new y0().f(discoveryRequest, l2Var);
        return l2Var;
    }

    @Override // ca0.c0
    public Optional<String> b() {
        return Optional.of("junit-jupiter-engine");
    }

    @Override // org.junit.platform.engine.support.hierarchical.c
    public e e(s request) {
        return h(request).d() ? new org.junit.platform.engine.support.hierarchical.b(new fa0.a(request.b(), a.f91998i)) : super.e(request);
    }

    @Override // org.junit.platform.engine.support.hierarchical.c
    public m.b f(s request) {
        return new m.b() { // from class: u80.b
            @Override // org.junit.platform.engine.support.hierarchical.m.b
            public final m create() {
                return b90.a.a();
            }
        };
    }

    @Override // org.junit.platform.engine.support.hierarchical.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public t d(s request) {
        return new t(request.c(), h(request));
    }

    @Override // ca0.c0
    public Optional<String> getGroupId() {
        return Optional.of("org.junit.jupiter");
    }

    @Override // ca0.c0
    public String getId() {
        return l2.f95855g;
    }

    public final e0 h(s request) {
        return ((l2) request.d()).J();
    }
}
