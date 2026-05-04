package ku;

import com.typesafe.config.ConfigException;
import java.util.Collection;
import java.util.Collections;
import ku.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d0 extends b {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f68677a;

    public d0(b2 b2Var) {
        this.f68677a = b2Var;
    }

    @Override // ku.a
    public Collection<b2> a() {
        return Collections.singletonList(this.f68677a);
    }

    public b2 c() {
        return this.f68677a;
    }

    public d d() {
        if (e2.p(this.f68677a)) {
            return e2.i(this.f68677a);
        }
        if (e2.o(this.f68677a)) {
            return new j0.b(this.f68677a.d(), e2.h(this.f68677a));
        }
        if (!e2.n(this.f68677a)) {
            throw new ConfigException.BugOrBroken("ConfigNodeSimpleValue did not contain a valid value token");
        }
        return new i0(this.f68677a.d(), new a2(u0.e(e2.g(this.f68677a).iterator(), this.f68677a.d()), e2.f(this.f68677a)));
    }
}
