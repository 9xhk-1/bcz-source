package com.huawei.updatesdk.b.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static com.huawei.updatesdk.service.otaupdate.b f36897a;

    public static void a(com.huawei.updatesdk.service.otaupdate.b bVar) {
        f36897a = bVar;
    }

    public static void a(boolean z11) {
        com.huawei.updatesdk.b.g.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(z11 ? com.huawei.updatesdk.service.otaupdate.f.e().c() : null), new a(z11));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements com.huawei.updatesdk.a.b.c.c.a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f36898a;

        public a(boolean z11) {
            this.f36898a = z11;
        }

        @Override // com.huawei.updatesdk.a.b.c.c.a
        public void b(com.huawei.updatesdk.a.b.c.c.c cVar, com.huawei.updatesdk.a.b.c.c.d dVar) {
            if (f.f36897a == null) {
                return;
            }
            if (!(dVar instanceof com.huawei.updatesdk.service.appmgr.bean.b)) {
                f.f36897a.a(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVar;
            if (!bVar.e()) {
                f.f36897a.b(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.c f11 = bVar.f();
            if (f11 == null) {
                f.f36897a.a(dVar.d());
                return;
            }
            if (!this.f36898a) {
                com.huawei.updatesdk.b.e.e.a(false).a(f11.d());
            }
            f.f36897a.a(f11);
        }

        @Override // com.huawei.updatesdk.a.b.c.c.a
        public void a(com.huawei.updatesdk.a.b.c.c.c cVar, com.huawei.updatesdk.a.b.c.c.d dVar) {
        }
    }
}
