package com.baicizhan.main.wordlistv2.repo;

import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"com.baicizhan.main.wordlistv2.repo.WordlistKv"})
@x
@tv.e
/* loaded from: classes5.dex */
public final class v implements tv.h<WordResRepoImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<wj.b> f28052a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<nc.a> f28053b;

    public v(tv.t<wj.b> resDapProvider, tv.t<nc.a> kvProvider) {
        this.f28052a = resDapProvider;
        this.f28053b = kvProvider;
    }

    public static v a(tv.t<wj.b> resDapProvider, tv.t<nc.a> kvProvider) {
        return new v(resDapProvider, kvProvider);
    }

    public static WordResRepoImpl c(wj.b resDap, nc.a kv2) {
        return new WordResRepoImpl(resDap, kv2);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WordResRepoImpl get() {
        return c(this.f28052a.get(), this.f28053b.get());
    }
}
