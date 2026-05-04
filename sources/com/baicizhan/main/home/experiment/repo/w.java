package com.baicizhan.main.home.experiment.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.notify.NotifyResult;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21594c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final NotifyResult f21595a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21596b;

    public w(@m80.l NotifyResult notifyResult, boolean z11) {
        this.f21595a = notifyResult;
        this.f21596b = z11;
    }

    public static /* synthetic */ w d(w wVar, NotifyResult notifyResult, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notifyResult = wVar.f21595a;
        }
        if ((i11 & 2) != 0) {
            z11 = wVar.f21596b;
        }
        return wVar.c(notifyResult, z11);
    }

    @m80.l
    public final NotifyResult a() {
        return this.f21595a;
    }

    public final boolean b() {
        return this.f21596b;
    }

    @m80.k
    public final w c(@m80.l NotifyResult notifyResult, boolean z11) {
        return new w(notifyResult, z11);
    }

    public final boolean e() {
        return this.f21596b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return g0.g(this.f21595a, wVar.f21595a) && this.f21596b == wVar.f21596b;
    }

    @m80.l
    public final NotifyResult f() {
        return this.f21595a;
    }

    public int hashCode() {
        NotifyResult notifyResult = this.f21595a;
        return ((notifyResult == null ? 0 : notifyResult.hashCode()) * 31) + Boolean.hashCode(this.f21596b);
    }

    @m80.k
    public String toString() {
        return "PopResult(notify=" + this.f21595a + ", newUser=" + this.f21596b + pn.j.f81007d;
    }
}
