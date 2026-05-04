package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final int f23618c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f23619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23620b;

    public g(int i11, int i12) {
        this.f23619a = i11;
        this.f23620b = i12;
    }

    public static /* synthetic */ g d(g gVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = gVar.f23619a;
        }
        if ((i13 & 2) != 0) {
            i12 = gVar.f23620b;
        }
        return gVar.c(i11, i12);
    }

    public final int a() {
        return this.f23619a;
    }

    public final int b() {
        return this.f23620b;
    }

    @m80.k
    public final g c(int i11, int i12) {
        return new g(i11, i12);
    }

    public final int e() {
        return this.f23620b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f23619a == gVar.f23619a && this.f23620b == gVar.f23620b;
    }

    public final int f() {
        return this.f23619a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f23619a) * 31) + Integer.hashCode(this.f23620b);
    }

    @m80.k
    public String toString() {
        return "BookProgress(masteredCount=" + this.f23619a + ", learntCount=" + this.f23620b + pn.j.f81007d;
    }
}
