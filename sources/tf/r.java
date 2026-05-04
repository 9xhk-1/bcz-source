package tf;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final int f90554d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f90555a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f90556b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f90557c;

    public r(@m80.k String opToken, @m80.k String token, @m80.k String operator) {
        kotlin.jvm.internal.g0.p(opToken, "opToken");
        kotlin.jvm.internal.g0.p(token, "token");
        kotlin.jvm.internal.g0.p(operator, "operator");
        this.f90555a = opToken;
        this.f90556b = token;
        this.f90557c = operator;
    }

    public static /* synthetic */ r e(r rVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rVar.f90555a;
        }
        if ((i11 & 2) != 0) {
            str2 = rVar.f90556b;
        }
        if ((i11 & 4) != 0) {
            str3 = rVar.f90557c;
        }
        return rVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f90555a;
    }

    @m80.k
    public final String b() {
        return this.f90556b;
    }

    @m80.k
    public final String c() {
        return this.f90557c;
    }

    @m80.k
    public final r d(@m80.k String opToken, @m80.k String token, @m80.k String operator) {
        kotlin.jvm.internal.g0.p(opToken, "opToken");
        kotlin.jvm.internal.g0.p(token, "token");
        kotlin.jvm.internal.g0.p(operator, "operator");
        return new r(opToken, token, operator);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.g0.g(this.f90555a, rVar.f90555a) && kotlin.jvm.internal.g0.g(this.f90556b, rVar.f90556b) && kotlin.jvm.internal.g0.g(this.f90557c, rVar.f90557c);
    }

    @m80.k
    public final String f() {
        return this.f90555a;
    }

    @m80.k
    public final String g() {
        return this.f90557c;
    }

    @m80.k
    public final String h() {
        return this.f90556b;
    }

    public int hashCode() {
        return (((this.f90555a.hashCode() * 31) + this.f90556b.hashCode()) * 31) + this.f90557c.hashCode();
    }

    @m80.k
    public String toString() {
        return "OneKeyLoginResult(opToken=" + this.f90555a + ", token=" + this.f90556b + ", operator=" + this.f90557c + pn.j.f81007d;
    }
}
