package qg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"com.baicizhan.client.business.managers.ThriftKv"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class o0 implements tv.h<n0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.plan.module.exam.a> f82145a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<nc.a> f82146b;

    public o0(tv.t<com.baicizhan.main.home.plan.module.exam.a> bridgeProvider, tv.t<nc.a> memProvider) {
        this.f82145a = bridgeProvider;
        this.f82146b = memProvider;
    }

    public static o0 a(tv.t<com.baicizhan.main.home.plan.module.exam.a> bridgeProvider, tv.t<nc.a> memProvider) {
        return new o0(bridgeProvider, memProvider);
    }

    public static n0 c(com.baicizhan.main.home.plan.module.exam.a bridge, nc.a mem) {
        return new n0(bridge, mem);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f82145a.get(), this.f82146b.get());
    }
}
