package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65370a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z[] f65371b;

    public i3(@m80.k String name, @m80.k z[] categorys) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(categorys, "categorys");
        this.f65370a = name;
        this.f65371b = categorys;
    }

    public static /* synthetic */ i3 d(i3 i3Var, String str, z[] zVarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = i3Var.f65370a;
        }
        if ((i11 & 2) != 0) {
            zVarArr = i3Var.f65371b;
        }
        return i3Var.c(str, zVarArr);
    }

    @m80.k
    public final String a() {
        return this.f65370a;
    }

    @m80.k
    public final z[] b() {
        return this.f65371b;
    }

    @m80.k
    public final i3 c(@m80.k String name, @m80.k z[] categorys) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(categorys, "categorys");
        return new i3(name, categorys);
    }

    @m80.k
    public final z[] e() {
        return this.f65371b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return kotlin.jvm.internal.g0.g(this.f65370a, i3Var.f65370a) && Arrays.equals(this.f65371b, i3Var.f65371b);
    }

    @m80.k
    public final String f() {
        return this.f65370a;
    }

    public int hashCode() {
        return (this.f65370a.hashCode() * 31) + Arrays.hashCode(this.f65371b);
    }

    @m80.k
    public String toString() {
        return "TopLevel(name=" + this.f65370a + ", categorys=" + Arrays.toString(this.f65371b) + ')';
    }
}
