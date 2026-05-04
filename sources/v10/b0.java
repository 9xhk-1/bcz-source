package v10;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 extends u implements f20.u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n20.c f92822a;

    public b0(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        this.f92822a = fqName;
    }

    @Override // f20.u
    @m80.k
    public Collection<f20.g> F(@m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        return a00.h0.J();
    }

    @Override // f20.u
    @m80.k
    public n20.c d() {
        return this.f92822a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof b0) && kotlin.jvm.internal.g0.g(d(), ((b0) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // f20.d
    @m80.l
    public f20.a i(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return null;
    }

    @Override // f20.u
    @m80.k
    public Collection<f20.u> r() {
        return a00.h0.J();
    }

    @m80.k
    public String toString() {
        return b0.class.getName() + ": " + d();
    }

    @Override // f20.d
    public boolean x() {
        return false;
    }

    @Override // f20.d
    @m80.k
    public List<f20.a> getAnnotations() {
        return a00.h0.J();
    }
}
