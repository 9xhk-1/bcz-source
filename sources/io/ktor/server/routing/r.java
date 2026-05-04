package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61725a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f61726b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f61727c;

    public /* synthetic */ r(String str, String str2, String str3, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ r f(r rVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rVar.f61725a;
        }
        if ((i11 & 2) != 0) {
            str2 = rVar.f61726b;
        }
        if ((i11 & 4) != 0) {
            str3 = rVar.f61727c;
        }
        return rVar.e(str, str2, str3);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return j0.a(p1Var.f(), i11, this.f61725a, this.f61726b, this.f61727c, true);
    }

    @m80.k
    public final String b() {
        return this.f61725a;
    }

    @m80.l
    public final String c() {
        return this.f61726b;
    }

    @m80.l
    public final String d() {
        return this.f61727c;
    }

    @m80.k
    public final r e(@m80.k String name, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new r(name, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.g0.g(this.f61725a, rVar.f61725a) && kotlin.jvm.internal.g0.g(this.f61726b, rVar.f61726b) && kotlin.jvm.internal.g0.g(this.f61727c, rVar.f61727c);
    }

    @m80.k
    public final String g() {
        return this.f61725a;
    }

    @m80.l
    public final String h() {
        return this.f61726b;
    }

    public int hashCode() {
        int hashCode = this.f61725a.hashCode() * 31;
        String str = this.f61726b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61727c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f61727c;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f61726b;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(l50.b.f69927i);
        sb2.append(this.f61725a);
        sb2.append("?}");
        String str2 = this.f61727c;
        sb2.append(str2 != null ? str2 : "");
        return sb2.toString();
    }

    public r(@m80.k String name, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f61725a = name;
        this.f61726b = str;
        this.f61727c = str2;
    }
}
