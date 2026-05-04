package com.baicizhan.client.business.managers.winningstreak;

import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class e implements h<WinningStreakImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final t<ca.b> f16522a;

    /* renamed from: b, reason: collision with root package name */
    public final t<aa.a> f16523b;

    /* renamed from: c, reason: collision with root package name */
    public final t<q9.x> f16524c;

    public e(t<ca.b> localProvider, t<aa.a> serverTimeProvider, t<q9.x> studyMgrProvider) {
        this.f16522a = localProvider;
        this.f16523b = serverTimeProvider;
        this.f16524c = studyMgrProvider;
    }

    public static e a(t<ca.b> localProvider, t<aa.a> serverTimeProvider, t<q9.x> studyMgrProvider) {
        return new e(localProvider, serverTimeProvider, studyMgrProvider);
    }

    public static WinningStreakImpl c(ca.b local, aa.a serverTime, q9.x studyMgr) {
        return new WinningStreakImpl(local, serverTime, studyMgr);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WinningStreakImpl get() {
        return c(this.f16522a.get(), this.f16523b.get(), this.f16524c.get());
    }
}
