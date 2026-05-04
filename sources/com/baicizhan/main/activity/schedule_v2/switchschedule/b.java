package com.baicizhan.main.activity.schedule_v2.switchschedule;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final int f19467k = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f19468a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f19469b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f19470c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19473f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19474g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19475h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19476i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19477j;

    public b(int i11, @m80.k String bookName, @m80.k String bookImg, boolean z11, int i12, int i13, int i14, int i15, int i16, boolean z12) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        this.f19468a = i11;
        this.f19469b = bookName;
        this.f19470c = bookImg;
        this.f19471d = z11;
        this.f19472e = i12;
        this.f19473f = i13;
        this.f19474g = i14;
        this.f19475h = i15;
        this.f19476i = i16;
        this.f19477j = z12;
    }

    public static /* synthetic */ b l(b bVar, int i11, String str, String str2, boolean z11, int i12, int i13, int i14, int i15, int i16, boolean z12, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = bVar.f19468a;
        }
        if ((i17 & 2) != 0) {
            str = bVar.f19469b;
        }
        if ((i17 & 4) != 0) {
            str2 = bVar.f19470c;
        }
        if ((i17 & 8) != 0) {
            z11 = bVar.f19471d;
        }
        if ((i17 & 16) != 0) {
            i12 = bVar.f19472e;
        }
        if ((i17 & 32) != 0) {
            i13 = bVar.f19473f;
        }
        if ((i17 & 64) != 0) {
            i14 = bVar.f19474g;
        }
        if ((i17 & 128) != 0) {
            i15 = bVar.f19475h;
        }
        if ((i17 & 256) != 0) {
            i16 = bVar.f19476i;
        }
        if ((i17 & 512) != 0) {
            z12 = bVar.f19477j;
        }
        int i18 = i16;
        boolean z13 = z12;
        int i19 = i14;
        int i21 = i15;
        int i22 = i12;
        int i23 = i13;
        return bVar.k(i11, str, str2, z11, i22, i23, i19, i21, i18, z13);
    }

    public final int a() {
        return this.f19468a;
    }

    public final boolean b() {
        return this.f19477j;
    }

    @m80.k
    public final String c() {
        return this.f19469b;
    }

    @m80.k
    public final String d() {
        return this.f19470c;
    }

    public final boolean e() {
        return this.f19471d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19468a == bVar.f19468a && kotlin.jvm.internal.g0.g(this.f19469b, bVar.f19469b) && kotlin.jvm.internal.g0.g(this.f19470c, bVar.f19470c) && this.f19471d == bVar.f19471d && this.f19472e == bVar.f19472e && this.f19473f == bVar.f19473f && this.f19474g == bVar.f19474g && this.f19475h == bVar.f19475h && this.f19476i == bVar.f19476i && this.f19477j == bVar.f19477j;
    }

    public final int f() {
        return this.f19472e;
    }

    public final int g() {
        return this.f19473f;
    }

    public final int h() {
        return this.f19474g;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f19468a) * 31) + this.f19469b.hashCode()) * 31) + this.f19470c.hashCode()) * 31) + Boolean.hashCode(this.f19471d)) * 31) + Integer.hashCode(this.f19472e)) * 31) + Integer.hashCode(this.f19473f)) * 31) + Integer.hashCode(this.f19474g)) * 31) + Integer.hashCode(this.f19475h)) * 31) + Integer.hashCode(this.f19476i)) * 31) + Boolean.hashCode(this.f19477j);
    }

    public final int i() {
        return this.f19475h;
    }

    public final int j() {
        return this.f19476i;
    }

    @m80.k
    public final b k(int i11, @m80.k String bookName, @m80.k String bookImg, boolean z11, int i12, int i13, int i14, int i15, int i16, boolean z12) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        return new b(i11, bookName, bookImg, z11, i12, i13, i14, i15, i16, z12);
    }

    public final int m() {
        return this.f19468a;
    }

    @m80.k
    public final String n() {
        return this.f19470c;
    }

    @m80.k
    public final String o() {
        return this.f19469b;
    }

    public final int p() {
        return this.f19472e;
    }

    public final int q() {
        return this.f19474g;
    }

    public final boolean r() {
        return this.f19477j;
    }

    public final int s() {
        return this.f19475h;
    }

    public final int t() {
        return this.f19476i;
    }

    @m80.k
    public String toString() {
        return "ScheduleInfo(bookId=" + this.f19468a + ", bookName=" + this.f19469b + ", bookImg=" + this.f19470c + ", isCurrent=" + this.f19471d + ", currentCount=" + this.f19472e + ", totalCount=" + this.f19473f + ", masteredCount=" + this.f19474g + ", planCount=" + this.f19475h + ", remainDay=" + this.f19476i + ", needAnimation=" + this.f19477j + pn.j.f81007d;
    }

    public final int u() {
        return this.f19473f;
    }

    public final boolean v() {
        return this.f19471d;
    }

    public final void w(boolean z11) {
        this.f19477j = z11;
    }

    public /* synthetic */ b(int i11, String str, String str2, boolean z11, int i12, int i13, int i14, int i15, int i16, boolean z12, int i17, kotlin.jvm.internal.v vVar) {
        this(i11, str, str2, z11, i12, i13, i14, i15, i16, (i17 & 512) != 0 ? false : z12);
    }
}
