package com.baicizhan.client.business.managers.winningstreak;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16508b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16509a;

    public c(boolean z11) {
        this.f16509a = z11;
    }

    public static /* synthetic */ c c(c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cVar.f16509a;
        }
        return cVar.b(z11);
    }

    public final boolean a() {
        return this.f16509a;
    }

    @k
    public final c b(boolean z11) {
        return new c(z11);
    }

    public final boolean d() {
        return this.f16509a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f16509a == ((c) obj).f16509a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f16509a);
    }

    @k
    public String toString() {
        return "TaskInfo(hasReward=" + this.f16509a + j.f81007d;
    }
}
