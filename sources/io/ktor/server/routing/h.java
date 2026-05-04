package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ix.e1 f61617a;

    public h(@m80.k ix.e1 method) {
        kotlin.jvm.internal.g0.p(method, "method");
        this.f61617a = method;
    }

    public static /* synthetic */ h d(h hVar, ix.e1 e1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e1Var = hVar.f61617a;
        }
        return hVar.c(e1Var);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return kotlin.jvm.internal.g0.g(py.e.o(p1Var.c().f()), this.f61617a) ? i0.f61619b.a() : i0.f61619b.d();
    }

    @m80.k
    public final ix.e1 b() {
        return this.f61617a;
    }

    @m80.k
    public final h c(@m80.k ix.e1 method) {
        kotlin.jvm.internal.g0.p(method, "method");
        return new h(method);
    }

    @m80.k
    public final ix.e1 e() {
        return this.f61617a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.g0.g(this.f61617a, ((h) obj).f61617a);
    }

    public int hashCode() {
        return this.f61617a.hashCode();
    }

    @m80.k
    public String toString() {
        return "(method:" + this.f61617a.l() + ')';
    }
}
