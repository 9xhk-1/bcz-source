package com.baicizhan.main.home.experiment.repo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"com.baicizhan.client.business.managers.DefaultKv", "com.baicizhan.client.business.managers.ThriftKv"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class r implements tv.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<nc.a> f21585a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<nc.a> f21586b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<q9.x> f21587c;

    public r(tv.t<nc.a> kvProvider, tv.t<nc.a> thriftKvProvider, tv.t<q9.x> studyMgrProvider) {
        this.f21585a = kvProvider;
        this.f21586b = thriftKvProvider;
        this.f21587c = studyMgrProvider;
    }

    public static r a(tv.t<nc.a> kvProvider, tv.t<nc.a> thriftKvProvider, tv.t<q9.x> studyMgrProvider) {
        return new r(kvProvider, thriftKvProvider, studyMgrProvider);
    }

    public static p c(nc.a kv2, nc.a thriftKv, q9.x studyMgr) {
        return new p(kv2, thriftKv, studyMgr);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f21585a.get(), this.f21586b.get(), this.f21587c.get());
    }
}
