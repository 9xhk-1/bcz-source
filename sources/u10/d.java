package u10;

import f20.u;
import java.util.Set;
import kotlin.jvm.internal.g0;
import u30.f0;
import v10.b0;
import v10.q;
import y10.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ClassLoader f91512a;

    public d(@m80.k ClassLoader classLoader) {
        g0.p(classLoader, "classLoader");
        this.f91512a = classLoader;
    }

    @Override // y10.r
    @m80.l
    public Set<String> a(@m80.k n20.c packageFqName) {
        g0.p(packageFqName, "packageFqName");
        return null;
    }

    @Override // y10.r
    @m80.l
    public f20.g b(@m80.k r.a request) {
        g0.p(request, "request");
        n20.b a11 = request.a();
        n20.c f11 = a11.f();
        String b11 = a11.g().b();
        g0.o(b11, "asString(...)");
        String y22 = f0.y2(b11, '.', '$', false, 4, null);
        if (!f11.d()) {
            y22 = f11.b() + '.' + y22;
        }
        Class<?> a12 = e.a(this.f91512a, y22);
        if (a12 != null) {
            return new q(a12);
        }
        return null;
    }

    @Override // y10.r
    @m80.l
    public u c(@m80.k n20.c fqName, boolean z11) {
        g0.p(fqName, "fqName");
        return new b0(fqName);
    }
}
