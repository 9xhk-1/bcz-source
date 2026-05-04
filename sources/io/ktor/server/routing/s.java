package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61734a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f61735b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f61736c;

    public /* synthetic */ s(String str, String str2, String str3, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ s f(s sVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sVar.f61734a;
        }
        if ((i11 & 2) != 0) {
            str2 = sVar.f61735b;
        }
        if ((i11 & 4) != 0) {
            str3 = sVar.f61736c;
        }
        return sVar.e(str, str2, str3);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return j0.a(p1Var.f(), i11, this.f61734a, this.f61735b, this.f61736c, false);
    }

    @m80.k
    public final String b() {
        return this.f61734a;
    }

    @m80.l
    public final String c() {
        return this.f61735b;
    }

    @m80.l
    public final String d() {
        return this.f61736c;
    }

    @m80.k
    public final s e(@m80.k String name, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new s(name, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.g0.g(this.f61734a, sVar.f61734a) && kotlin.jvm.internal.g0.g(this.f61735b, sVar.f61735b) && kotlin.jvm.internal.g0.g(this.f61736c, sVar.f61736c);
    }

    @m80.k
    public final String g() {
        return this.f61734a;
    }

    @m80.l
    public final String h() {
        return this.f61735b;
    }

    public int hashCode() {
        int hashCode = this.f61734a.hashCode() * 31;
        String str = this.f61735b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61736c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f61736c;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f61735b;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(l50.b.f69927i);
        sb2.append(this.f61734a);
        sb2.append(l50.b.f69928j);
        String str2 = this.f61736c;
        sb2.append(str2 != null ? str2 : "");
        return sb2.toString();
    }

    public s(@m80.k String name, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f61734a = name;
        this.f61735b = str;
        this.f61736c = str2;
    }
}
