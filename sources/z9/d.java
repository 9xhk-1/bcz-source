package z9;

import tv.e;
import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@e
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final t<com.baicizhan.client.business.managers.winningstreak.a> f102430a;

    /* renamed from: b, reason: collision with root package name */
    public final t<a> f102431b;

    /* renamed from: c, reason: collision with root package name */
    public final t<u9.d> f102432c;

    public d(t<com.baicizhan.client.business.managers.winningstreak.a> winningProvider, t<a> dakaProvider, t<u9.d> expRepoProvider) {
        this.f102430a = winningProvider;
        this.f102431b = dakaProvider;
        this.f102432c = expRepoProvider;
    }

    public static d a(t<com.baicizhan.client.business.managers.winningstreak.a> winningProvider, t<a> dakaProvider, t<u9.d> expRepoProvider) {
        return new d(winningProvider, dakaProvider, expRepoProvider);
    }

    public static c c(com.baicizhan.client.business.managers.winningstreak.a winning, a daka, u9.d expRepo) {
        return new c(winning, daka, expRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f102430a.get(), this.f102431b.get(), this.f102432c.get());
    }
}
