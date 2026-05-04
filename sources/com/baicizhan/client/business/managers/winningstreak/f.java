package com.baicizhan.client.business.managers.winningstreak;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16525c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f16526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16527b;

    public f(int i11, int i12) {
        this.f16526a = i11;
        this.f16527b = i12;
    }

    public static /* synthetic */ f d(f fVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fVar.f16526a;
        }
        if ((i13 & 2) != 0) {
            i12 = fVar.f16527b;
        }
        return fVar.c(i11, i12);
    }

    public final int a() {
        return this.f16526a;
    }

    public final int b() {
        return this.f16527b;
    }

    @k
    public final f c(int i11, int i12) {
        return new f(i11, i12);
    }

    public final int e() {
        return this.f16526a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16526a == fVar.f16526a && this.f16527b == fVar.f16527b;
    }

    public final int f() {
        return this.f16527b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f16526a) * 31) + Integer.hashCode(this.f16527b);
    }

    @k
    public String toString() {
        return "WinningStreakInfo(days=" + this.f16526a + ", lastDate=" + this.f16527b + j.f81007d;
    }
}
