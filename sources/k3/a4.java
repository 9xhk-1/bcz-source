package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65221a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65222b;

    public a4(@m80.k String key, @m80.k String value) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f65221a = key;
        this.f65222b = value;
    }

    public static /* synthetic */ a4 d(a4 a4Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a4Var.f65221a;
        }
        if ((i11 & 2) != 0) {
            str2 = a4Var.f65222b;
        }
        return a4Var.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f65221a;
    }

    @m80.k
    public final String b() {
        return this.f65222b;
    }

    @m80.k
    public final a4 c(@m80.k String key, @m80.k String value) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        return new a4(key, value);
    }

    @m80.k
    public final String e() {
        return this.f65221a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return kotlin.jvm.internal.g0.g(this.f65221a, a4Var.f65221a) && kotlin.jvm.internal.g0.g(this.f65222b, a4Var.f65222b);
    }

    @m80.k
    public final String f() {
        return this.f65222b;
    }

    public int hashCode() {
        return (this.f65221a.hashCode() * 31) + this.f65222b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WebHeader(key=" + this.f65221a + ", value=" + this.f65222b + ')';
    }
}
