package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65285a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o[] f65286b;

    public e3(@m80.k String name, @m80.k o[] books) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(books, "books");
        this.f65285a = name;
        this.f65286b = books;
    }

    public static /* synthetic */ e3 d(e3 e3Var, String str, o[] oVarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = e3Var.f65285a;
        }
        if ((i11 & 2) != 0) {
            oVarArr = e3Var.f65286b;
        }
        return e3Var.c(str, oVarArr);
    }

    @m80.k
    public final String a() {
        return this.f65285a;
    }

    @m80.k
    public final o[] b() {
        return this.f65286b;
    }

    @m80.k
    public final e3 c(@m80.k String name, @m80.k o[] books) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(books, "books");
        return new e3(name, books);
    }

    @m80.k
    public final o[] e() {
        return this.f65286b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return kotlin.jvm.internal.g0.g(this.f65285a, e3Var.f65285a) && Arrays.equals(this.f65286b, e3Var.f65286b);
    }

    @m80.k
    public final String f() {
        return this.f65285a;
    }

    public int hashCode() {
        return (this.f65285a.hashCode() * 31) + Arrays.hashCode(this.f65286b);
    }

    @m80.k
    public String toString() {
        return "SubCategory(name=" + this.f65285a + ", books=" + Arrays.toString(this.f65286b) + ')';
    }
}
