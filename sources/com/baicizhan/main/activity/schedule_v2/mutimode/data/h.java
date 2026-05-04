package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19319c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ModeDetail f19320a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19321b;

    public h(@k ModeDetail modeDetail, boolean z11) {
        g0.p(modeDetail, "modeDetail");
        this.f19320a = modeDetail;
        this.f19321b = z11;
    }

    public static /* synthetic */ h d(h hVar, ModeDetail modeDetail, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            modeDetail = hVar.f19320a;
        }
        if ((i11 & 2) != 0) {
            z11 = hVar.f19321b;
        }
        return hVar.c(modeDetail, z11);
    }

    @k
    public final ModeDetail a() {
        return this.f19320a;
    }

    public final boolean b() {
        return this.f19321b;
    }

    @k
    public final h c(@k ModeDetail modeDetail, boolean z11) {
        g0.p(modeDetail, "modeDetail");
        return new h(modeDetail, z11);
    }

    @k
    public final ModeDetail e() {
        return this.f19320a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(this.f19320a, hVar.f19320a) && this.f19321b == hVar.f19321b;
    }

    public final boolean f() {
        return this.f19321b;
    }

    public int hashCode() {
        return (this.f19320a.hashCode() * 31) + Boolean.hashCode(this.f19321b);
    }

    @k
    public String toString() {
        return "SelectableModel(modeDetail=" + this.f19320a + ", selected=" + this.f19321b + j.f81007d;
    }
}
