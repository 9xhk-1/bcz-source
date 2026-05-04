package com.baicizhan.main.vld.bonding;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class s2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f25473c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f25474a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f25475b;

    public s2(@m80.k String title, @m80.k String description) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        this.f25474a = title;
        this.f25475b = description;
    }

    public static /* synthetic */ s2 d(s2 s2Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = s2Var.f25474a;
        }
        if ((i11 & 2) != 0) {
            str2 = s2Var.f25475b;
        }
        return s2Var.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f25474a;
    }

    @m80.k
    public final String b() {
        return this.f25475b;
    }

    @m80.k
    public final s2 c(@m80.k String title, @m80.k String description) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        return new s2(title, description);
    }

    @m80.k
    public final String e() {
        return this.f25475b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return kotlin.jvm.internal.g0.g(this.f25474a, s2Var.f25474a) && kotlin.jvm.internal.g0.g(this.f25475b, s2Var.f25475b);
    }

    @m80.k
    public final String f() {
        return this.f25474a;
    }

    public int hashCode() {
        return (this.f25474a.hashCode() * 31) + this.f25475b.hashCode();
    }

    @m80.k
    public String toString() {
        return "TipInfo(title=" + this.f25474a + ", description=" + this.f25475b + pn.j.f81007d;
    }
}
