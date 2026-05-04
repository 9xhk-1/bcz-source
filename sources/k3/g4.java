package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String[] f65327a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o3[] f65328b;

    public g4(@m80.k String[] collectedBooks, @m80.k o3[] allBooks) {
        kotlin.jvm.internal.g0.p(collectedBooks, "collectedBooks");
        kotlin.jvm.internal.g0.p(allBooks, "allBooks");
        this.f65327a = collectedBooks;
        this.f65328b = allBooks;
    }

    public static /* synthetic */ g4 d(g4 g4Var, String[] strArr, o3[] o3VarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = g4Var.f65327a;
        }
        if ((i11 & 2) != 0) {
            o3VarArr = g4Var.f65328b;
        }
        return g4Var.c(strArr, o3VarArr);
    }

    @m80.k
    public final String[] a() {
        return this.f65327a;
    }

    @m80.k
    public final o3[] b() {
        return this.f65328b;
    }

    @m80.k
    public final g4 c(@m80.k String[] collectedBooks, @m80.k o3[] allBooks) {
        kotlin.jvm.internal.g0.p(collectedBooks, "collectedBooks");
        kotlin.jvm.internal.g0.p(allBooks, "allBooks");
        return new g4(collectedBooks, allBooks);
    }

    @m80.k
    public final o3[] e() {
        return this.f65328b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Arrays.equals(this.f65327a, g4Var.f65327a) && Arrays.equals(this.f65328b, g4Var.f65328b);
    }

    @m80.k
    public final String[] f() {
        return this.f65327a;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f65327a) * 31) + Arrays.hashCode(this.f65328b);
    }

    @m80.k
    public String toString() {
        return "WordCollectedModel(collectedBooks=" + Arrays.toString(this.f65327a) + ", allBooks=" + Arrays.toString(this.f65328b) + ')';
    }
}
