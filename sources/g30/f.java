package g30;

import a00.h0;
import a00.v1;
import a00.w1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p10.q0;
import x00.l;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f implements k {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ErrorScopeKind f52675b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f52676c;

    public f(@m80.k ErrorScopeKind kind, @m80.k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
        this.f52675b = kind;
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        g0.o(format, "format(...)");
        this.f52676c = format;
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> b() {
        return w1.k();
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> d() {
        return w1.k();
    }

    @Override // x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
    }

    @Override // x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k x20.d kindFilter, @m80.k l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        return h0.J();
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> g() {
        return w1.k();
    }

    @Override // x20.n
    @m80.k
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        g0.o(format, "format(...)");
        n20.f k11 = n20.f.k(format);
        g0.o(k11, "special(...)");
        return new a(k11);
    }

    @Override // x20.k, x20.n
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return v1.f(new b(i.f52687a.h()));
    }

    @Override // x20.k
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set<q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return i.f52687a.j();
    }

    @m80.k
    public final String k() {
        return this.f52676c;
    }

    @m80.k
    public String toString() {
        return "ErrorScope{" + this.f52676c + l50.b.f69928j;
    }
}
