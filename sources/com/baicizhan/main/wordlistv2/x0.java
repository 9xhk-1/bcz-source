package com.baicizhan.main.wordlistv2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes5.dex */
public final class x0 implements tv.h<w0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<a> f28128a;

    public x0(tv.t<a> wordListRepoProvider) {
        this.f28128a = wordListRepoProvider;
    }

    public static x0 a(tv.t<a> wordListRepoProvider) {
        return new x0(wordListRepoProvider);
    }

    public static w0 c(a wordListRepo) {
        return new w0(wordListRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return c(this.f28128a.get());
    }
}
