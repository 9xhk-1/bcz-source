package l3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<z> f69266a;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@m80.k List<? extends z> leftPanel) {
        kotlin.jvm.internal.g0.p(leftPanel, "leftPanel");
        this.f69266a = leftPanel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a0 c(a0 a0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = a0Var.f69266a;
        }
        return a0Var.b(list);
    }

    @m80.k
    public final List<z> a() {
        return this.f69266a;
    }

    @m80.k
    public final a0 b(@m80.k List<? extends z> leftPanel) {
        kotlin.jvm.internal.g0.p(leftPanel, "leftPanel");
        return new a0(leftPanel);
    }

    @m80.k
    public final List<z> d() {
        return this.f69266a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.g0.g(this.f69266a, ((a0) obj).f69266a);
    }

    public int hashCode() {
        return this.f69266a.hashCode();
    }

    @m80.k
    public String toString() {
        return "SidebarPromotion(leftPanel=" + this.f69266a + ')';
    }
}
