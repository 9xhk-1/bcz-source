package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65410a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65411b;

    public l(@m80.k String provider, @m80.k String display) {
        kotlin.jvm.internal.g0.p(provider, "provider");
        kotlin.jvm.internal.g0.p(display, "display");
        this.f65410a = provider;
        this.f65411b = display;
    }

    public static /* synthetic */ l d(l lVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lVar.f65410a;
        }
        if ((i11 & 2) != 0) {
            str2 = lVar.f65411b;
        }
        return lVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f65410a;
    }

    @m80.k
    public final String b() {
        return this.f65411b;
    }

    @m80.k
    public final l c(@m80.k String provider, @m80.k String display) {
        kotlin.jvm.internal.g0.p(provider, "provider");
        kotlin.jvm.internal.g0.p(display, "display");
        return new l(provider, display);
    }

    @m80.k
    public final String e() {
        return this.f65411b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.g0.g(this.f65410a, lVar.f65410a) && kotlin.jvm.internal.g0.g(this.f65411b, lVar.f65411b);
    }

    @m80.k
    public final String f() {
        return this.f65410a;
    }

    public int hashCode() {
        return (this.f65410a.hashCode() * 31) + this.f65411b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BindItem(provider=" + this.f65410a + ", display=" + this.f65411b + ')';
    }
}
