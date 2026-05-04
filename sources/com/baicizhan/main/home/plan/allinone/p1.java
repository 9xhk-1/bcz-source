package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class p1 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f22302h = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f22303a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f22304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22305c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22309g;

    public p1(@m80.k String bookName, @m80.k String bookImg, int i11, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        this.f22303a = bookName;
        this.f22304b = bookImg;
        this.f22305c = i11;
        this.f22306d = i12;
        this.f22307e = i13;
        this.f22308f = i14;
        this.f22309g = z11;
    }

    public static /* synthetic */ p1 i(p1 p1Var, String str, String str2, int i11, int i12, int i13, int i14, boolean z11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = p1Var.f22303a;
        }
        if ((i15 & 2) != 0) {
            str2 = p1Var.f22304b;
        }
        if ((i15 & 4) != 0) {
            i11 = p1Var.f22305c;
        }
        if ((i15 & 8) != 0) {
            i12 = p1Var.f22306d;
        }
        if ((i15 & 16) != 0) {
            i13 = p1Var.f22307e;
        }
        if ((i15 & 32) != 0) {
            i14 = p1Var.f22308f;
        }
        if ((i15 & 64) != 0) {
            z11 = p1Var.f22309g;
        }
        int i16 = i14;
        boolean z12 = z11;
        int i17 = i13;
        int i18 = i11;
        return p1Var.h(str, str2, i18, i12, i17, i16, z12);
    }

    @m80.k
    public final String a() {
        return this.f22303a;
    }

    @m80.k
    public final String b() {
        return this.f22304b;
    }

    public final int c() {
        return this.f22305c;
    }

    public final int d() {
        return this.f22306d;
    }

    public final int e() {
        return this.f22307e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return kotlin.jvm.internal.g0.g(this.f22303a, p1Var.f22303a) && kotlin.jvm.internal.g0.g(this.f22304b, p1Var.f22304b) && this.f22305c == p1Var.f22305c && this.f22306d == p1Var.f22306d && this.f22307e == p1Var.f22307e && this.f22308f == p1Var.f22308f && this.f22309g == p1Var.f22309g;
    }

    public final int f() {
        return this.f22308f;
    }

    public final boolean g() {
        return this.f22309g;
    }

    @m80.k
    public final p1 h(@m80.k String bookName, @m80.k String bookImg, int i11, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        return new p1(bookName, bookImg, i11, i12, i13, i14, z11);
    }

    public int hashCode() {
        return (((((((((((this.f22303a.hashCode() * 31) + this.f22304b.hashCode()) * 31) + Integer.hashCode(this.f22305c)) * 31) + Integer.hashCode(this.f22306d)) * 31) + Integer.hashCode(this.f22307e)) * 31) + Integer.hashCode(this.f22308f)) * 31) + Boolean.hashCode(this.f22309g);
    }

    public final int j() {
        return this.f22305c;
    }

    @m80.k
    public final String k() {
        return this.f22304b;
    }

    @m80.k
    public final String l() {
        return this.f22303a;
    }

    public final int m() {
        return this.f22306d;
    }

    public final int n() {
        return this.f22307e;
    }

    public final boolean o() {
        return this.f22309g;
    }

    public final int p() {
        return this.f22308f;
    }

    @m80.k
    public String toString() {
        return "UIBookModel(bookName=" + this.f22303a + ", bookImg=" + this.f22304b + ", bookId=" + this.f22305c + ", learningCount=" + this.f22306d + ", masteredWordCount=" + this.f22307e + ", totalCount=" + this.f22308f + ", needUpgrade=" + this.f22309g + pn.j.f81007d;
    }
}
