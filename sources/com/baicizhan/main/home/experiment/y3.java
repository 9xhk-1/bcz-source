package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class y3 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21759c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f21760a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21761b;

    public y3(@m80.k String link, boolean z11) {
        kotlin.jvm.internal.g0.p(link, "link");
        this.f21760a = link;
        this.f21761b = z11;
    }

    public static /* synthetic */ y3 d(y3 y3Var, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = y3Var.f21760a;
        }
        if ((i11 & 2) != 0) {
            z11 = y3Var.f21761b;
        }
        return y3Var.c(str, z11);
    }

    @m80.k
    public final String a() {
        return this.f21760a;
    }

    public final boolean b() {
        return this.f21761b;
    }

    @m80.k
    public final y3 c(@m80.k String link, boolean z11) {
        kotlin.jvm.internal.g0.p(link, "link");
        return new y3(link, z11);
    }

    public final boolean e() {
        return this.f21761b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return kotlin.jvm.internal.g0.g(this.f21760a, y3Var.f21760a) && this.f21761b == y3Var.f21761b;
    }

    @m80.k
    public final String f() {
        return this.f21760a;
    }

    public int hashCode() {
        return (this.f21760a.hashCode() * 31) + Boolean.hashCode(this.f21761b);
    }

    @m80.k
    public String toString() {
        return "MsgModel(link=" + this.f21760a + ", hasNewMsg=" + this.f21761b + pn.j.f81007d;
    }
}
