package com.baicizhan.main.wordlistv2;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f27845m = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f27846a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f27847b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f27848c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f27849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27850e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27851f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27852g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27853h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27854i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27855j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27856k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27857l;

    public c1(int i11, @m80.k String word, @m80.k String mean, @m80.k String audioUsUrl, int i12, long j11, boolean z11, int i13, boolean z12, int i14, boolean z13, boolean z14) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(audioUsUrl, "audioUsUrl");
        this.f27846a = i11;
        this.f27847b = word;
        this.f27848c = mean;
        this.f27849d = audioUsUrl;
        this.f27850e = i12;
        this.f27851f = j11;
        this.f27852g = z11;
        this.f27853h = i13;
        this.f27854i = z12;
        this.f27855j = i14;
        this.f27856k = z13;
        this.f27857l = z14;
    }

    public static /* synthetic */ c1 n(c1 c1Var, int i11, String str, String str2, String str3, int i12, long j11, boolean z11, int i13, boolean z12, int i14, boolean z13, boolean z14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = c1Var.f27846a;
        }
        return c1Var.m(i11, (i15 & 2) != 0 ? c1Var.f27847b : str, (i15 & 4) != 0 ? c1Var.f27848c : str2, (i15 & 8) != 0 ? c1Var.f27849d : str3, (i15 & 16) != 0 ? c1Var.f27850e : i12, (i15 & 32) != 0 ? c1Var.f27851f : j11, (i15 & 64) != 0 ? c1Var.f27852g : z11, (i15 & 128) != 0 ? c1Var.f27853h : i13, (i15 & 256) != 0 ? c1Var.f27854i : z12, (i15 & 512) != 0 ? c1Var.f27855j : i14, (i15 & 1024) != 0 ? c1Var.f27856k : z13, (i15 & 2048) != 0 ? c1Var.f27857l : z14);
    }

    public final void A(boolean z11) {
        this.f27854i = z11;
    }

    public final void B(boolean z11) {
        this.f27856k = z11;
    }

    public final void C(boolean z11) {
        this.f27857l = z11;
    }

    public final int a() {
        return this.f27846a;
    }

    public final int b() {
        return this.f27855j;
    }

    public final boolean c() {
        return this.f27856k;
    }

    public final boolean d() {
        return this.f27857l;
    }

    @m80.k
    public final String e() {
        return this.f27847b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f27846a == c1Var.f27846a && kotlin.jvm.internal.g0.g(this.f27847b, c1Var.f27847b) && kotlin.jvm.internal.g0.g(this.f27848c, c1Var.f27848c) && kotlin.jvm.internal.g0.g(this.f27849d, c1Var.f27849d) && this.f27850e == c1Var.f27850e && this.f27851f == c1Var.f27851f && this.f27852g == c1Var.f27852g && this.f27853h == c1Var.f27853h && this.f27854i == c1Var.f27854i && this.f27855j == c1Var.f27855j && this.f27856k == c1Var.f27856k && this.f27857l == c1Var.f27857l;
    }

    @m80.k
    public final String f() {
        return this.f27848c;
    }

    @m80.k
    public final String g() {
        return this.f27849d;
    }

    public final int h() {
        return this.f27850e;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.f27846a) * 31) + this.f27847b.hashCode()) * 31) + this.f27848c.hashCode()) * 31) + this.f27849d.hashCode()) * 31) + Integer.hashCode(this.f27850e)) * 31) + Long.hashCode(this.f27851f)) * 31) + Boolean.hashCode(this.f27852g)) * 31) + Integer.hashCode(this.f27853h)) * 31) + Boolean.hashCode(this.f27854i)) * 31) + Integer.hashCode(this.f27855j)) * 31) + Boolean.hashCode(this.f27856k)) * 31) + Boolean.hashCode(this.f27857l);
    }

    public final long i() {
        return this.f27851f;
    }

    public final boolean j() {
        return this.f27852g;
    }

    public final int k() {
        return this.f27853h;
    }

    public final boolean l() {
        return this.f27854i;
    }

    @m80.k
    public final c1 m(int i11, @m80.k String word, @m80.k String mean, @m80.k String audioUsUrl, int i12, long j11, boolean z11, int i13, boolean z12, int i14, boolean z13, boolean z14) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(audioUsUrl, "audioUsUrl");
        return new c1(i11, word, mean, audioUsUrl, i12, j11, z11, i13, z12, i14, z13, z14);
    }

    @m80.k
    public final String o() {
        return this.f27849d;
    }

    public final boolean p() {
        return this.f27856k;
    }

    public final int q() {
        return this.f27850e;
    }

    @m80.k
    public final String r() {
        return this.f27848c;
    }

    public final long s() {
        return this.f27851f;
    }

    public final int t() {
        return this.f27853h;
    }

    @m80.k
    public String toString() {
        return "WordListWordModel(topicId=" + this.f27846a + ", word=" + this.f27847b + ", mean=" + this.f27848c + ", audioUsUrl=" + this.f27849d + ", mastered=" + this.f27850e + ", modifyTime=" + this.f27851f + ", isKilled=" + this.f27852g + ", nextReviewDay=" + this.f27853h + ", isCollected=" + this.f27854i + ", status=" + this.f27855j + ", hideMean=" + this.f27856k + ", isSelected=" + this.f27857l + pn.j.f81007d;
    }

    public final int u() {
        return this.f27855j;
    }

    public final int v() {
        return this.f27846a;
    }

    @m80.k
    public final String w() {
        return this.f27847b;
    }

    public final boolean x() {
        return this.f27854i;
    }

    public final boolean y() {
        return this.f27852g;
    }

    public final boolean z() {
        return this.f27857l;
    }

    public /* synthetic */ c1(int i11, String str, String str2, String str3, int i12, long j11, boolean z11, int i13, boolean z12, int i14, boolean z13, boolean z14, int i15, kotlin.jvm.internal.v vVar) {
        this(i11, str, str2, str3, i12, j11, z11, i13, z12, i14, (i15 & 1024) != 0 ? true : z13, (i15 & 2048) != 0 ? false : z14);
    }
}
