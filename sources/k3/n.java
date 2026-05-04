package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65455a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65456b;

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ n d(n nVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nVar.f65455a;
        }
        if ((i11 & 2) != 0) {
            str2 = nVar.f65456b;
        }
        return nVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f65455a;
    }

    @m80.k
    public final String b() {
        return this.f65456b;
    }

    @m80.k
    public final n c(@m80.k String bondingDes, @m80.k String tip) {
        kotlin.jvm.internal.g0.p(bondingDes, "bondingDes");
        kotlin.jvm.internal.g0.p(tip, "tip");
        return new n(bondingDes, tip);
    }

    @m80.k
    public final String e() {
        return this.f65455a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.g0.g(this.f65455a, nVar.f65455a) && kotlin.jvm.internal.g0.g(this.f65456b, nVar.f65456b);
    }

    @m80.k
    public final String f() {
        return this.f65456b;
    }

    public int hashCode() {
        return (this.f65455a.hashCode() * 31) + this.f65456b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BondingTip(bondingDes=" + this.f65455a + ", tip=" + this.f65456b + ')';
    }

    public n(@m80.k String bondingDes, @m80.k String tip) {
        kotlin.jvm.internal.g0.p(bondingDes, "bondingDes");
        kotlin.jvm.internal.g0.p(tip, "tip");
        this.f65455a = bondingDes;
        this.f65456b = tip;
    }

    public /* synthetic */ n(String str, String str2, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
