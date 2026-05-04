package oe;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f76892c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f76893a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f76894b;

    public k1(@m80.k String id2, @m80.k String name) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(name, "name");
        this.f76893a = id2;
        this.f76894b = name;
    }

    public static /* synthetic */ k1 d(k1 k1Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = k1Var.f76893a;
        }
        if ((i11 & 2) != 0) {
            str2 = k1Var.f76894b;
        }
        return k1Var.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f76893a;
    }

    @m80.k
    public final String b() {
        return this.f76894b;
    }

    @m80.k
    public final k1 c(@m80.k String id2, @m80.k String name) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(name, "name");
        return new k1(id2, name);
    }

    @m80.k
    public final String e() {
        return this.f76893a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return kotlin.jvm.internal.g0.g(this.f76893a, k1Var.f76893a) && kotlin.jvm.internal.g0.g(this.f76894b, k1Var.f76894b);
    }

    @m80.k
    public final String f() {
        return this.f76894b;
    }

    public int hashCode() {
        return (this.f76893a.hashCode() * 31) + this.f76894b.hashCode();
    }

    @m80.k
    public String toString() {
        return "Tab(id=" + this.f76893a + ", name=" + this.f76894b + pn.j.f81007d;
    }
}
