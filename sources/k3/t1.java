package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65615a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65616b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public String f65617c;

    public t1(int i11, @m80.k String type, @m80.k String meaning) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        this.f65615a = i11;
        this.f65616b = type;
        this.f65617c = meaning;
    }

    public static /* synthetic */ t1 e(t1 t1Var, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = t1Var.f65615a;
        }
        if ((i12 & 2) != 0) {
            str = t1Var.f65616b;
        }
        if ((i12 & 4) != 0) {
            str2 = t1Var.f65617c;
        }
        return t1Var.d(i11, str, str2);
    }

    public final int a() {
        return this.f65615a;
    }

    @m80.k
    public final String b() {
        return this.f65616b;
    }

    @m80.k
    public final String c() {
        return this.f65617c;
    }

    @m80.k
    public final t1 d(int i11, @m80.k String type, @m80.k String meaning) {
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(meaning, "meaning");
        return new t1(i11, type, meaning);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f65615a == t1Var.f65615a && kotlin.jvm.internal.g0.g(this.f65616b, t1Var.f65616b) && kotlin.jvm.internal.g0.g(this.f65617c, t1Var.f65617c);
    }

    public final int f() {
        return this.f65615a;
    }

    @m80.k
    public final String g() {
        return this.f65617c;
    }

    @m80.k
    public final String h() {
        return this.f65616b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f65615a) * 31) + this.f65616b.hashCode()) * 31) + this.f65617c.hashCode();
    }

    public final void i(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f65617c = str;
    }

    @m80.k
    public String toString() {
        return "Meaning(id=" + this.f65615a + ", type=" + this.f65616b + ", meaning=" + this.f65617c + ')';
    }
}
