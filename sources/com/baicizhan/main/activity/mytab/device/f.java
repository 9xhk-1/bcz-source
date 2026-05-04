package com.baicizhan.main.activity.mytab.device;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class f implements tv.h<MyDeviceVM> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<ie.a> f18631a;

    public f(tv.t<ie.a> devicesRepoProvider) {
        this.f18631a = devicesRepoProvider;
    }

    public static f a(tv.t<ie.a> devicesRepoProvider) {
        return new f(devicesRepoProvider);
    }

    public static MyDeviceVM c(ie.a devicesRepo) {
        return new MyDeviceVM(devicesRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MyDeviceVM get() {
        return c(this.f18631a.get());
    }
}
