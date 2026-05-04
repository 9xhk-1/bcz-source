package ca;

import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"com.baicizhan.client.business.managers.ThriftKv"})
@x
@tv.e
/* loaded from: classes4.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final t<nc.a> f8449a;

    public d(t<nc.a> storeProvider) {
        this.f8449a = storeProvider;
    }

    public static d a(t<nc.a> storeProvider) {
        return new d(storeProvider);
    }

    public static b c(nc.a store) {
        return new b(store);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f8449a.get());
    }
}
