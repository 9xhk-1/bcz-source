package k3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Long> f65344a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<p3> f65345b;

    public h4(@m80.k List<Long> collectedBook, @m80.k List<p3> allBooks) {
        kotlin.jvm.internal.g0.p(collectedBook, "collectedBook");
        kotlin.jvm.internal.g0.p(allBooks, "allBooks");
        this.f65344a = collectedBook;
        this.f65345b = allBooks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h4 d(h4 h4Var, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = h4Var.f65344a;
        }
        if ((i11 & 2) != 0) {
            list2 = h4Var.f65345b;
        }
        return h4Var.c(list, list2);
    }

    @m80.k
    public final List<Long> a() {
        return this.f65344a;
    }

    @m80.k
    public final List<p3> b() {
        return this.f65345b;
    }

    @m80.k
    public final h4 c(@m80.k List<Long> collectedBook, @m80.k List<p3> allBooks) {
        kotlin.jvm.internal.g0.p(collectedBook, "collectedBook");
        kotlin.jvm.internal.g0.p(allBooks, "allBooks");
        return new h4(collectedBook, allBooks);
    }

    @m80.k
    public final List<p3> e() {
        return this.f65345b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return kotlin.jvm.internal.g0.g(this.f65344a, h4Var.f65344a) && kotlin.jvm.internal.g0.g(this.f65345b, h4Var.f65345b);
    }

    @m80.k
    public final List<Long> f() {
        return this.f65344a;
    }

    public int hashCode() {
        return (this.f65344a.hashCode() * 31) + this.f65345b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordCollectedNativeModel(collectedBook=" + this.f65344a + ", allBooks=" + this.f65345b + ')';
    }
}
