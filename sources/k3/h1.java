package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65334a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f65335b;

    public h1(boolean z11, @m80.k x00.a<yz.g2> enter) {
        kotlin.jvm.internal.g0.p(enter, "enter");
        this.f65334a = z11;
        this.f65335b = enter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h1 d(h1 h1Var, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = h1Var.f65334a;
        }
        if ((i11 & 2) != 0) {
            aVar = h1Var.f65335b;
        }
        return h1Var.c(z11, aVar);
    }

    public final boolean a() {
        return this.f65334a;
    }

    @m80.k
    public final x00.a<yz.g2> b() {
        return this.f65335b;
    }

    @m80.k
    public final h1 c(boolean z11, @m80.k x00.a<yz.g2> enter) {
        kotlin.jvm.internal.g0.p(enter, "enter");
        return new h1(z11, enter);
    }

    @m80.k
    public final x00.a<yz.g2> e() {
        return this.f65335b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f65334a == h1Var.f65334a && kotlin.jvm.internal.g0.g(this.f65335b, h1Var.f65335b);
    }

    public final boolean f() {
        return this.f65334a;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f65334a) * 31) + this.f65335b.hashCode();
    }

    @m80.k
    public String toString() {
        return "JpEntrance(firstTime=" + this.f65334a + ", enter=" + this.f65335b + ')';
    }
}
