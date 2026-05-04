package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class r3 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21433d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f21434a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f21435b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f21436c;

    public r3(@m80.k String icon, @m80.k String link, @m80.k String name) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(name, "name");
        this.f21434a = icon;
        this.f21435b = link;
        this.f21436c = name;
    }

    public static /* synthetic */ r3 e(r3 r3Var, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = r3Var.f21434a;
        }
        if ((i11 & 2) != 0) {
            str2 = r3Var.f21435b;
        }
        if ((i11 & 4) != 0) {
            str3 = r3Var.f21436c;
        }
        return r3Var.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f21434a;
    }

    @m80.k
    public final String b() {
        return this.f21435b;
    }

    @m80.k
    public final String c() {
        return this.f21436c;
    }

    @m80.k
    public final r3 d(@m80.k String icon, @m80.k String link, @m80.k String name) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(name, "name");
        return new r3(icon, link, name);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return kotlin.jvm.internal.g0.g(this.f21434a, r3Var.f21434a) && kotlin.jvm.internal.g0.g(this.f21435b, r3Var.f21435b) && kotlin.jvm.internal.g0.g(this.f21436c, r3Var.f21436c);
    }

    @m80.k
    public final String f() {
        return this.f21434a;
    }

    @m80.k
    public final String g() {
        return this.f21435b;
    }

    @m80.k
    public final String h() {
        return this.f21436c;
    }

    public int hashCode() {
        return (((this.f21434a.hashCode() * 31) + this.f21435b.hashCode()) * 31) + this.f21436c.hashCode();
    }

    @m80.k
    public String toString() {
        return "HomeAdItemWithName(icon=" + this.f21434a + ", link=" + this.f21435b + ", name=" + this.f21436c + pn.j.f81007d;
    }
}
