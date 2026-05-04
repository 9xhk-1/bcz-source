package aa;

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
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final t<nc.a> f2478a;

    public d(t<nc.a> memProvider) {
        this.f2478a = memProvider;
    }

    public static d a(t<nc.a> memProvider) {
        return new d(memProvider);
    }

    public static c c(nc.a mem) {
        return new c(mem);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f2478a.get());
    }
}
