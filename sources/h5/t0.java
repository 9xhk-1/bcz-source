package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58453a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f58454b;

    public t0(int i11, @m80.l String str) {
        this.f58453a = i11;
        this.f58454b = str;
    }

    public static /* synthetic */ t0 d(t0 t0Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = t0Var.f58453a;
        }
        if ((i12 & 2) != 0) {
            str = t0Var.f58454b;
        }
        return t0Var.c(i11, str);
    }

    public final int a() {
        return this.f58453a;
    }

    @m80.l
    public final String b() {
        return this.f58454b;
    }

    @m80.k
    public final t0 c(int i11, @m80.l String str) {
        return new t0(i11, str);
    }

    @m80.l
    public final String e() {
        return this.f58454b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f58453a == t0Var.f58453a && kotlin.jvm.internal.g0.g(this.f58454b, t0Var.f58454b);
    }

    public final int f() {
        return this.f58453a;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f58453a) * 31;
        String str = this.f58454b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "UnitModel(unitNo=" + this.f58453a + ", unitName=" + this.f58454b + ')';
    }
}
