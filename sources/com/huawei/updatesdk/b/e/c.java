package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private String f36902c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f36903d = "";

    private void d() {
        com.huawei.updatesdk.a.b.c.c.c.c(b(com.huawei.updatesdk.a.b.a.a.c().a()));
        com.huawei.updatesdk.a.b.c.c.d a11 = com.huawei.updatesdk.b.g.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(null));
        if (a11.e()) {
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) a11;
            if (bVar.f() != null) {
                this.f36902c = bVar.f().d();
            } else {
                com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "can not getPackageName from store, HiApp info is null.");
            }
        }
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String a() {
        return "com.huawei.updatesdk";
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String b() {
        if (TextUtils.isEmpty(this.f36902c)) {
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "appgallery packagename is null and query again!");
            this.f36902c = b(new ArrayList());
        }
        return this.f36902c;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public int c() {
        return 0;
    }

    private String b(List<String> list) {
        String str = null;
        try {
            Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
            ServiceVerifyKit.Builder builder = new ServiceVerifyKit.Builder();
            builder.j(a11).p(new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId"), ServiceVerifyKit.Builder.ComponentType.ACTIVITY);
            a(list, a11, builder);
            com.huawei.updatesdk.b.c.c a12 = com.huawei.updatesdk.b.c.b.a();
            Iterator<String> it = a12.f().iterator();
            while (it.hasNext()) {
                builder.b(a12.b(), it.next());
            }
            str = builder.e();
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "get market packagename from verify kit is: " + str);
            return str;
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("DefaultTaskInit", "genVerifiedPackageName error: " + th2.getMessage());
            return str;
        }
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String a(Context context) {
        if (!TextUtils.isEmpty(this.f36903d)) {
            return this.f36903d;
        }
        if (TextUtils.equals("SECURITY", com.huawei.updatesdk.a.a.c.a.a.b.a())) {
            this.f36903d = d.a(context, "grs_sdk_global_route_config_updatesdk.json", "SECURITY");
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "UpdateSDK Get url is security url");
        } else {
            this.f36903d = d.a(context, "grs_sdk_global_route_config_updatesdk.json", "DR3");
        }
        return this.f36903d;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public boolean c(Context context) {
        return com.huawei.updatesdk.b.h.b.c(context, b()) > 100200000;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void a(String str) {
        com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "resetMarketPkgName: " + str);
        this.f36902c = str;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void a(List<String> list) {
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        if (!TextUtils.isEmpty(this.f36902c) && com.huawei.updatesdk.b.h.b.d(a11, this.f36902c)) {
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "AppMarket packageName has been obtained and is: " + this.f36902c);
            com.huawei.updatesdk.b.b.a.d().d(this.f36902c);
            return;
        }
        String b11 = b(list);
        this.f36902c = b11;
        if (TextUtils.isEmpty(b11)) {
            d();
        }
        com.huawei.updatesdk.b.b.a.d().d(this.f36902c);
        com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "initAppGalleryPkg and get AppMarket packageName is: " + this.f36902c);
    }

    private void a(List<String> list, Context context, ServiceVerifyKit.Builder builder) {
        if (com.huawei.updatesdk.b.h.d.a(list) || list.size() >= 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String b11 = com.huawei.updatesdk.b.h.b.b(context, it.next());
            if (!TextUtils.isEmpty(b11)) {
                arrayList.add(b11);
            }
        }
        if (com.huawei.updatesdk.b.h.d.a(arrayList)) {
            return;
        }
        builder.n(arrayList);
    }
}
