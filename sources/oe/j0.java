package oe;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f76885d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public String f76886a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76887b;

    /* renamed from: c, reason: collision with root package name */
    public int f76888c;

    public j0(@m80.k String categoryId, boolean z11, int i11) {
        kotlin.jvm.internal.g0.p(categoryId, "categoryId");
        this.f76886a = categoryId;
        this.f76887b = z11;
        this.f76888c = i11;
    }

    public static /* synthetic */ j0 e(j0 j0Var, String str, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = j0Var.f76886a;
        }
        if ((i12 & 2) != 0) {
            z11 = j0Var.f76887b;
        }
        if ((i12 & 4) != 0) {
            i11 = j0Var.f76888c;
        }
        return j0Var.d(str, z11, i11);
    }

    @m80.k
    public final String a() {
        return this.f76886a;
    }

    public final boolean b() {
        return this.f76887b;
    }

    public final int c() {
        return this.f76888c;
    }

    @m80.k
    public final j0 d(@m80.k String categoryId, boolean z11, int i11) {
        kotlin.jvm.internal.g0.p(categoryId, "categoryId");
        return new j0(categoryId, z11, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.g0.g(this.f76886a, j0Var.f76886a) && this.f76887b == j0Var.f76887b && this.f76888c == j0Var.f76888c;
    }

    @m80.k
    public final String f() {
        return this.f76886a;
    }

    public final int g() {
        return this.f76888c;
    }

    public final boolean h() {
        return this.f76887b;
    }

    public int hashCode() {
        return (((this.f76886a.hashCode() * 31) + Boolean.hashCode(this.f76887b)) * 31) + Integer.hashCode(this.f76888c);
    }

    public final void i(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f76886a = str;
    }

    public final void j(int i11) {
        this.f76888c = i11;
    }

    public final void k(boolean z11) {
        this.f76887b = z11;
    }

    @m80.k
    public String toString() {
        return "CategoryStatus(categoryId=" + this.f76886a + ", selected=" + this.f76887b + ", groupIndex=" + this.f76888c + pn.j.f81007d;
    }
}
