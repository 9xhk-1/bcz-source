package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65415a;

    public l1(boolean z11) {
        this.f65415a = z11;
    }

    public static /* synthetic */ l1 c(l1 l1Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = l1Var.f65415a;
        }
        return l1Var.b(z11);
    }

    public final boolean a() {
        return this.f65415a;
    }

    @m80.k
    public final l1 b(boolean z11) {
        return new l1(z11);
    }

    public final boolean d() {
        return this.f65415a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && this.f65415a == ((l1) obj).f65415a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f65415a);
    }

    @m80.k
    public String toString() {
        return "LoginRsp(isNewUser=" + this.f65415a + ')';
    }
}
