package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61579a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f61580b;

    public b(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f61579a = name;
        this.f61580b = value;
    }

    public static /* synthetic */ b e(b bVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f61579a;
        }
        if ((i11 & 2) != 0) {
            str2 = bVar.f61580b;
        }
        return bVar.d(str, str2);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return p1Var.c().getParameters().c(this.f61579a, this.f61580b) ? i0.f61619b.a() : i0.f61619b.e();
    }

    @m80.k
    public final String b() {
        return this.f61579a;
    }

    @m80.k
    public final String c() {
        return this.f61580b;
    }

    @m80.k
    public final b d(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return new b(name, value);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.g0.g(this.f61579a, bVar.f61579a) && kotlin.jvm.internal.g0.g(this.f61580b, bVar.f61580b);
    }

    @m80.k
    public final String f() {
        return this.f61579a;
    }

    @m80.k
    public final String g() {
        return this.f61580b;
    }

    public int hashCode() {
        return (this.f61579a.hashCode() * 31) + this.f61580b.hashCode();
    }

    @m80.k
    public String toString() {
        return '[' + this.f61579a + " = " + this.f61580b + l50.b.f69930l;
    }
}
