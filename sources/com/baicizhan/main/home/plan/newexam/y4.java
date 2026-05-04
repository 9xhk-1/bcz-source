package com.baicizhan.main.home.plan.newexam;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class y4 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22871d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f22872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22874c;

    public y4(@m80.k String title, int i11, int i12) {
        kotlin.jvm.internal.g0.p(title, "title");
        this.f22872a = title;
        this.f22873b = i11;
        this.f22874c = i12;
    }

    public static /* synthetic */ y4 e(y4 y4Var, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = y4Var.f22872a;
        }
        if ((i13 & 2) != 0) {
            i11 = y4Var.f22873b;
        }
        if ((i13 & 4) != 0) {
            i12 = y4Var.f22874c;
        }
        return y4Var.d(str, i11, i12);
    }

    @m80.k
    public final String a() {
        return this.f22872a;
    }

    public final int b() {
        return this.f22873b;
    }

    public final int c() {
        return this.f22874c;
    }

    @m80.k
    public final y4 d(@m80.k String title, int i11, int i12) {
        kotlin.jvm.internal.g0.p(title, "title");
        return new y4(title, i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return kotlin.jvm.internal.g0.g(this.f22872a, y4Var.f22872a) && this.f22873b == y4Var.f22873b && this.f22874c == y4Var.f22874c;
    }

    public final int f() {
        return this.f22873b;
    }

    public final int g() {
        return this.f22874c;
    }

    @m80.k
    public final String h() {
        return this.f22872a;
    }

    public int hashCode() {
        return (((this.f22872a.hashCode() * 31) + Integer.hashCode(this.f22873b)) * 31) + Integer.hashCode(this.f22874c);
    }

    @m80.k
    public String toString() {
        return "StudyState(title=" + this.f22872a + ", current=" + this.f22873b + ", plan=" + this.f22874c + pn.j.f81007d;
    }
}
