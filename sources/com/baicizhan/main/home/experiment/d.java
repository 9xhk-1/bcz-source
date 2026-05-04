package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@yz.n(message = "Former experimental version")
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21126c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21128b;

    public d(int i11, int i12) {
        this.f21127a = i11;
        this.f21128b = i12;
    }

    public static /* synthetic */ d d(d dVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f21127a;
        }
        if ((i13 & 2) != 0) {
            i12 = dVar.f21128b;
        }
        return dVar.c(i11, i12);
    }

    public final int a() {
        return this.f21127a;
    }

    public final int b() {
        return this.f21128b;
    }

    @m80.k
    public final d c(int i11, int i12) {
        return new d(i11, i12);
    }

    public final int e() {
        return this.f21128b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21127a == dVar.f21127a && this.f21128b == dVar.f21128b;
    }

    public final int f() {
        return this.f21127a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f21127a) * 31) + Integer.hashCode(this.f21128b);
    }

    @m80.k
    public String toString() {
        return "BookProgress(masteredCount=" + this.f21127a + ", learntCount=" + this.f21128b + pn.j.f81007d;
    }
}
