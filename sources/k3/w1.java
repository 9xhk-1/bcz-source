package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65676a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65677b;

    public w1(@m80.k String url, int i11) {
        kotlin.jvm.internal.g0.p(url, "url");
        this.f65676a = url;
        this.f65677b = i11;
    }

    public static /* synthetic */ w1 d(w1 w1Var, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = w1Var.f65676a;
        }
        if ((i12 & 2) != 0) {
            i11 = w1Var.f65677b;
        }
        return w1Var.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f65676a;
    }

    public final int b() {
        return this.f65677b;
    }

    @m80.k
    public final w1 c(@m80.k String url, int i11) {
        kotlin.jvm.internal.g0.p(url, "url");
        return new w1(url, i11);
    }

    public final int e() {
        return this.f65677b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return kotlin.jvm.internal.g0.g(this.f65676a, w1Var.f65676a) && this.f65677b == w1Var.f65677b;
    }

    @m80.k
    public final String f() {
        return this.f65676a;
    }

    public int hashCode() {
        return (this.f65676a.hashCode() * 31) + Integer.hashCode(this.f65677b);
    }

    @m80.k
    public String toString() {
        return "MyTabState(url=" + this.f65676a + ", unreadCount=" + this.f65677b + ')';
    }
}
