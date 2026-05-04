package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65420a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f65421b;

    public l3(int i11, @m80.l String str) {
        this.f65420a = i11;
        this.f65421b = str;
    }

    public static /* synthetic */ l3 d(l3 l3Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = l3Var.f65420a;
        }
        if ((i12 & 2) != 0) {
            str = l3Var.f65421b;
        }
        return l3Var.c(i11, str);
    }

    public final int a() {
        return this.f65420a;
    }

    @m80.l
    public final String b() {
        return this.f65421b;
    }

    @m80.k
    public final l3 c(int i11, @m80.l String str) {
        return new l3(i11, str);
    }

    @m80.l
    public final String e() {
        return this.f65421b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.f65420a == l3Var.f65420a && kotlin.jvm.internal.g0.g(this.f65421b, l3Var.f65421b);
    }

    public final int f() {
        return this.f65420a;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f65420a) * 31;
        String str = this.f65421b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "UnitItem(unitNo=" + this.f65420a + ", unitName=" + this.f65421b + ')';
    }
}
