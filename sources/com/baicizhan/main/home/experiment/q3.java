package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class q3 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21409d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f21410a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f21411b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f21412c;

    public q3(@m80.k String icon, @m80.k String link, @m80.k String name) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(name, "name");
        this.f21410a = icon;
        this.f21411b = link;
        this.f21412c = name;
    }

    public static /* synthetic */ q3 e(q3 q3Var, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = q3Var.f21410a;
        }
        if ((i11 & 2) != 0) {
            str2 = q3Var.f21411b;
        }
        if ((i11 & 4) != 0) {
            str3 = q3Var.f21412c;
        }
        return q3Var.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f21410a;
    }

    @m80.k
    public final String b() {
        return this.f21411b;
    }

    @m80.k
    public final String c() {
        return this.f21412c;
    }

    @m80.k
    public final q3 d(@m80.k String icon, @m80.k String link, @m80.k String name) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(name, "name");
        return new q3(icon, link, name);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return kotlin.jvm.internal.g0.g(this.f21410a, q3Var.f21410a) && kotlin.jvm.internal.g0.g(this.f21411b, q3Var.f21411b) && kotlin.jvm.internal.g0.g(this.f21412c, q3Var.f21412c);
    }

    @m80.k
    public final String f() {
        return this.f21410a;
    }

    @m80.k
    public final String g() {
        return this.f21411b;
    }

    @m80.k
    public final String h() {
        return this.f21412c;
    }

    public int hashCode() {
        return (((this.f21410a.hashCode() * 31) + this.f21411b.hashCode()) * 31) + this.f21412c.hashCode();
    }

    @m80.k
    public String toString() {
        return "HomeAdItem(icon=" + this.f21410a + ", link=" + this.f21411b + ", name=" + this.f21412c + pn.j.f81007d;
    }

    public /* synthetic */ q3(String str, String str2, String str3, int i11, kotlin.jvm.internal.v vVar) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3);
    }
}
