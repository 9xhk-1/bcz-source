package ix;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62955a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f62956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f62957c;

    public n0(@m80.k String name, @m80.k String value, boolean z11) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f62955a = name;
        this.f62956b = value;
        this.f62957c = z11;
    }

    public static /* synthetic */ n0 e(n0 n0Var, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = n0Var.f62955a;
        }
        if ((i11 & 2) != 0) {
            str2 = n0Var.f62956b;
        }
        if ((i11 & 4) != 0) {
            z11 = n0Var.f62957c;
        }
        return n0Var.d(str, str2, z11);
    }

    @m80.k
    public final String a() {
        return this.f62955a;
    }

    @m80.k
    public final String b() {
        return this.f62956b;
    }

    public final boolean c() {
        return this.f62957c;
    }

    @m80.k
    public final n0 d(@m80.k String name, @m80.k String value, boolean z11) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return new n0(name, value, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return u30.f0.c2(n0Var.f62955a, this.f62955a, true) && u30.f0.c2(n0Var.f62956b, this.f62956b, true);
    }

    public final boolean f() {
        return this.f62957c;
    }

    @m80.k
    public final String g() {
        return this.f62955a;
    }

    @m80.k
    public final String h() {
        return this.f62956b;
    }

    public int hashCode() {
        String str = this.f62955a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f62956b.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase2, "toLowerCase(...)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    @m80.k
    public String toString() {
        return "HeaderValueParam(name=" + this.f62955a + ", value=" + this.f62956b + ", escapeValue=" + this.f62957c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k String name, @m80.k String value) {
        this(name, value, false);
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
    }
}
