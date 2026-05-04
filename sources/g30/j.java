package g30;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import m80.k;
import p10.q0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@k ErrorScopeKind kind, @k String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
    }

    @Override // g30.f, x20.k
    @k
    public Set<n20.f> b() {
        throw new IllegalStateException();
    }

    @Override // g30.f, x20.k
    @k
    public Set<n20.f> d() {
        throw new IllegalStateException();
    }

    @Override // g30.f, x20.n
    @k
    public Collection<p10.h> f(@k x20.d kindFilter, @k l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        throw new IllegalStateException(k());
    }

    @Override // g30.f, x20.k
    @k
    public Set<n20.f> g() {
        throw new IllegalStateException();
    }

    @Override // g30.f, x20.n
    @k
    public p10.d h(@k n20.f name, @k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        throw new IllegalStateException(k() + ", required name: " + name);
    }

    @Override // g30.f, x20.k, x20.n
    @k
    /* renamed from: i */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@k n20.f name, @k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        throw new IllegalStateException(k() + ", required name: " + name);
    }

    @Override // g30.f, x20.k
    @k
    /* renamed from: j */
    public Set<q0> c(@k n20.f name, @k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        throw new IllegalStateException(k() + ", required name: " + name);
    }

    @Override // g30.f, x20.n
    @k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Void e(@k n20.f name, @k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        throw new IllegalStateException();
    }

    @Override // g30.f
    @k
    public String toString() {
        return "ThrowingScope{" + k() + l50.b.f69928j;
    }
}
