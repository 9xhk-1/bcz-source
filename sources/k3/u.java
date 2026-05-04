package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65625a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f65626b;

    public u(boolean z11, @m80.l String str) {
        this.f65625a = z11;
        this.f65626b = str;
    }

    public static /* synthetic */ u d(u uVar, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uVar.f65625a;
        }
        if ((i11 & 2) != 0) {
            str = uVar.f65626b;
        }
        return uVar.c(z11, str);
    }

    public final boolean a() {
        return this.f65625a;
    }

    @m80.l
    public final String b() {
        return this.f65626b;
    }

    @m80.k
    public final u c(boolean z11, @m80.l String str) {
        return new u(z11, str);
    }

    public final boolean e() {
        return this.f65625a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f65625a == uVar.f65625a && kotlin.jvm.internal.g0.g(this.f65626b, uVar.f65626b);
    }

    @m80.l
    public final String f() {
        return this.f65626b;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f65625a) * 31;
        String str = this.f65626b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "BridgeRsp(consume=" + this.f65625a + ", msgRsp=" + this.f65626b + ')';
    }
}
