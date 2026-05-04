package ku;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f68609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68610b;

    public a2(s0 s0Var, boolean z11) {
        this.f68609a = s0Var;
        this.f68610b = z11;
    }

    public a2 a(s0 s0Var) {
        return s0Var == this.f68609a ? this : new a2(s0Var, this.f68610b);
    }

    public boolean b() {
        return this.f68610b;
    }

    public s0 c() {
        return this.f68609a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            if (a2Var.f68609a.equals(this.f68609a) && a2Var.f68610b == this.f68610b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f68609a.hashCode() + 41) * 41) + (this.f68610b ? 1 : 0)) * 41;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("${");
        sb2.append(this.f68610b ? "?" : "");
        sb2.append(this.f68609a.k());
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }
}
