package org.junit.platform.engine.support.hierarchical;

import ca0.c0;
import ca0.s;
import ja0.p;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.support.hierarchical.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public abstract class c<C extends p> implements c0 {
    @Override // ca0.c0
    public final void c(s request) {
        try {
            e e11 = e(request);
            try {
                new d(request, d(request), e11, f(request)).a().get();
                if (e11 != null) {
                    e11.close();
                }
            } finally {
            }
        } catch (Exception e12) {
            throw new JUnitException("Error executing tests for engine " + getId(), e12);
        }
    }

    public abstract C d(s request);

    @API(since = "1.10", status = API.Status.STABLE)
    public e e(s request) {
        return new k();
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public m.b f(s request) {
        return new m.b() { // from class: ja0.d0
            @Override // org.junit.platform.engine.support.hierarchical.m.b
            public final org.junit.platform.engine.support.hierarchical.m create() {
                return new k1();
            }
        };
    }
}
