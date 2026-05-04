package com.baicizhan.main.activity.mytab.device.data;

import tv.e;
import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"com.baicizhan.client.business.managers.DefaultKv"})
@x
@e
/* loaded from: classes4.dex */
public final class b implements h<DeviceRepoImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final t<nc.a> f18629a;

    public b(t<nc.a> memProvider) {
        this.f18629a = memProvider;
    }

    public static b a(t<nc.a> memProvider) {
        return new b(memProvider);
    }

    public static DeviceRepoImpl c(nc.a mem) {
        return new DeviceRepoImpl(mem);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DeviceRepoImpl get() {
        return c(this.f18629a.get());
    }
}
