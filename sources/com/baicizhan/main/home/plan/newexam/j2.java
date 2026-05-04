package com.baicizhan.main.home.plan.newexam;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class j2 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f22708h = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f22709a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f22710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22712d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22713e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22714f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22715g;

    public j2(@m80.k String bookName, @m80.k String bookImg, int i11, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        this.f22709a = bookName;
        this.f22710b = bookImg;
        this.f22711c = i11;
        this.f22712d = i12;
        this.f22713e = i13;
        this.f22714f = i14;
        this.f22715g = z11;
    }

    public static /* synthetic */ j2 i(j2 j2Var, String str, String str2, int i11, int i12, int i13, int i14, boolean z11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = j2Var.f22709a;
        }
        if ((i15 & 2) != 0) {
            str2 = j2Var.f22710b;
        }
        if ((i15 & 4) != 0) {
            i11 = j2Var.f22711c;
        }
        if ((i15 & 8) != 0) {
            i12 = j2Var.f22712d;
        }
        if ((i15 & 16) != 0) {
            i13 = j2Var.f22713e;
        }
        if ((i15 & 32) != 0) {
            i14 = j2Var.f22714f;
        }
        if ((i15 & 64) != 0) {
            z11 = j2Var.f22715g;
        }
        int i16 = i14;
        boolean z12 = z11;
        int i17 = i13;
        int i18 = i11;
        return j2Var.h(str, str2, i18, i12, i17, i16, z12);
    }

    @m80.k
    public final String a() {
        return this.f22709a;
    }

    @m80.k
    public final String b() {
        return this.f22710b;
    }

    public final int c() {
        return this.f22711c;
    }

    public final int d() {
        return this.f22712d;
    }

    public final int e() {
        return this.f22713e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return kotlin.jvm.internal.g0.g(this.f22709a, j2Var.f22709a) && kotlin.jvm.internal.g0.g(this.f22710b, j2Var.f22710b) && this.f22711c == j2Var.f22711c && this.f22712d == j2Var.f22712d && this.f22713e == j2Var.f22713e && this.f22714f == j2Var.f22714f && this.f22715g == j2Var.f22715g;
    }

    public final int f() {
        return this.f22714f;
    }

    public final boolean g() {
        return this.f22715g;
    }

    @m80.k
    public final j2 h(@m80.k String bookName, @m80.k String bookImg, int i11, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        return new j2(bookName, bookImg, i11, i12, i13, i14, z11);
    }

    public int hashCode() {
        return (((((((((((this.f22709a.hashCode() * 31) + this.f22710b.hashCode()) * 31) + Integer.hashCode(this.f22711c)) * 31) + Integer.hashCode(this.f22712d)) * 31) + Integer.hashCode(this.f22713e)) * 31) + Integer.hashCode(this.f22714f)) * 31) + Boolean.hashCode(this.f22715g);
    }

    @m80.k
    public final String j() {
        return this.f22710b;
    }

    @m80.k
    public final String k() {
        return this.f22709a;
    }

    public final int l() {
        return this.f22711c;
    }

    public final boolean m() {
        return this.f22715g;
    }

    public final int n() {
        return this.f22713e;
    }

    public final int o() {
        return this.f22714f;
    }

    public final int p() {
        return this.f22712d;
    }

    @m80.k
    public String toString() {
        return "LearnCardBookUi(bookName=" + this.f22709a + ", bookImg=" + this.f22710b + ", current=" + this.f22711c + ", total=" + this.f22712d + ", remainDay=" + this.f22713e + ", round=" + this.f22714f + ", needUpgrade=" + this.f22715g + pn.j.f81007d;
    }
}
