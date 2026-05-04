package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65444a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65445b;

    public m2(@m80.k String majorName, int i11) {
        kotlin.jvm.internal.g0.p(majorName, "majorName");
        this.f65444a = majorName;
        this.f65445b = i11;
    }

    public static /* synthetic */ m2 d(m2 m2Var, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = m2Var.f65444a;
        }
        if ((i12 & 2) != 0) {
            i11 = m2Var.f65445b;
        }
        return m2Var.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f65444a;
    }

    public final int b() {
        return this.f65445b;
    }

    @m80.k
    public final m2 c(@m80.k String majorName, int i11) {
        kotlin.jvm.internal.g0.p(majorName, "majorName");
        return new m2(majorName, i11);
    }

    public final int e() {
        return this.f65445b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return kotlin.jvm.internal.g0.g(this.f65444a, m2Var.f65444a) && this.f65445b == m2Var.f65445b;
    }

    @m80.k
    public final String f() {
        return this.f65444a;
    }

    public int hashCode() {
        return (this.f65444a.hashCode() * 31) + Integer.hashCode(this.f65445b);
    }

    @m80.k
    public String toString() {
        return "SchoolMajorItem(majorName=" + this.f65444a + ", majorId=" + this.f65445b + ')';
    }
}
