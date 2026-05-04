package g30;

import a00.h0;
import a00.w1;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import m80.k;
import m80.l;
import p10.a0;
import p10.n0;
import p10.z;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f52668a = new d();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final n20.f f52669b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final List<a0> f52670c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<a0> f52671d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Set<a0> f52672e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c0 f52673f;

    static {
        n20.f k11 = n20.f.k(ErrorEntity.ERROR_MODULE.getDebugText());
        g0.o(k11, "special(...)");
        f52669b = k11;
        f52670c = h0.J();
        f52671d = h0.J();
        f52672e = w1.k();
        f52673f = e0.c(c.f52667a);
    }

    public static final n10.g V() {
        return n10.g.f73969i.a();
    }

    @Override // p10.a0
    @l
    public <T> T A0(@k z<T> capability) {
        g0.p(capability, "capability");
        return null;
    }

    @Override // p10.a0
    @k
    public List<a0> R() {
        return f52671d;
    }

    @Override // p10.a0
    public boolean X(@k a0 targetModule) {
        g0.p(targetModule, "targetModule");
        return false;
    }

    @Override // p10.h
    @l
    public p10.h b() {
        return null;
    }

    @Override // q10.a
    @k
    public q10.g getAnnotations() {
        return q10.g.A0.b();
    }

    @Override // p10.c0
    @k
    public n20.f getName() {
        return p0();
    }

    @Override // p10.a0
    @k
    public n0 h0(@k n20.c fqName) {
        g0.p(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p10.a0
    @k
    public Collection<n20.c> m(@k n20.c fqName, @k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(fqName, "fqName");
        g0.p(nameFilter, "nameFilter");
        return h0.J();
    }

    @k
    public n20.f p0() {
        return f52669b;
    }

    @Override // p10.a0
    @k
    public n10.j q() {
        return (n10.j) f52673f.getValue();
    }

    @Override // p10.h
    @l
    public <R, D> R y(@k p10.j<R, D> visitor, D d11) {
        g0.p(visitor, "visitor");
        return null;
    }

    @Override // p10.h
    @k
    public p10.h a() {
        return this;
    }
}
