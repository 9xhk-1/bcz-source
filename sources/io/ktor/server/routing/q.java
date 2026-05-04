package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61721a;

    public q(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f61721a = value;
    }

    public static /* synthetic */ q d(q qVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qVar.f61721a;
        }
        return qVar.c(str);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return (i11 >= p1Var.f().size() || !kotlin.jvm.internal.g0.g(p1Var.f().get(i11), this.f61721a)) ? i0.f61619b.f() : i0.f61619b.b();
    }

    @m80.k
    public final String b() {
        return this.f61721a;
    }

    @m80.k
    public final q c(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return new q(value);
    }

    @m80.k
    public final String e() {
        return this.f61721a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.g0.g(this.f61721a, ((q) obj).f61721a);
    }

    public int hashCode() {
        return this.f61721a.hashCode();
    }

    @m80.k
    public String toString() {
        return this.f61721a;
    }
}
