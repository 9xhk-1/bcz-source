package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26055d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public String f26056a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f26057b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f26058c;

    public j0(@m80.l String str, @m80.k String planType, @m80.k String strategy) {
        kotlin.jvm.internal.g0.p(planType, "planType");
        kotlin.jvm.internal.g0.p(strategy, "strategy");
        this.f26056a = str;
        this.f26057b = planType;
        this.f26058c = strategy;
    }

    public static /* synthetic */ j0 e(j0 j0Var, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = j0Var.f26056a;
        }
        if ((i11 & 2) != 0) {
            str2 = j0Var.f26057b;
        }
        if ((i11 & 4) != 0) {
            str3 = j0Var.f26058c;
        }
        return j0Var.d(str, str2, str3);
    }

    @m80.l
    public final String a() {
        return this.f26056a;
    }

    @m80.k
    public final String b() {
        return this.f26057b;
    }

    @m80.k
    public final String c() {
        return this.f26058c;
    }

    @m80.k
    public final j0 d(@m80.l String str, @m80.k String planType, @m80.k String strategy) {
        kotlin.jvm.internal.g0.p(planType, "planType");
        kotlin.jvm.internal.g0.p(strategy, "strategy");
        return new j0(str, planType, strategy);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.g0.g(this.f26056a, j0Var.f26056a) && kotlin.jvm.internal.g0.g(this.f26057b, j0Var.f26057b) && kotlin.jvm.internal.g0.g(this.f26058c, j0Var.f26058c);
    }

    @m80.l
    public final String f() {
        return this.f26056a;
    }

    @m80.k
    public final String g() {
        return this.f26057b;
    }

    @m80.k
    public final String h() {
        return this.f26058c;
    }

    public int hashCode() {
        String str = this.f26056a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f26057b.hashCode()) * 31) + this.f26058c.hashCode();
    }

    public final void i(@m80.l String str) {
        this.f26056a = str;
    }

    @m80.k
    public String toString() {
        return "TopicReportData(entryAction=" + this.f26056a + ", planType=" + this.f26057b + ", strategy=" + this.f26058c + pn.j.f81007d;
    }
}
