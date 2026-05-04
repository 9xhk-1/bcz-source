package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.f;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends a {

    /* renamed from: c, reason: collision with root package name */
    private String f36901c = "";

    @Override // com.huawei.updatesdk.b.e.a
    public String a() {
        return "com.huawei.apptouch.updatesdk";
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String b() {
        return f.e().c();
    }

    @Override // com.huawei.updatesdk.b.e.a
    public int c() {
        return 34;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String a(Context context) {
        if (!TextUtils.isEmpty(this.f36901c)) {
            return this.f36901c;
        }
        this.f36901c = TextUtils.equals("SECURITY", com.huawei.updatesdk.a.a.c.a.a.b.a()) ? d.a(context, "grs_sdk_global_route_config_apptouchupdatesdk.json", "SECURITY") : d.a(context, "grs_sdk_global_route_config_apptouchupdatesdk.json", "DR3");
        return this.f36901c;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public boolean c(Context context) {
        return com.huawei.updatesdk.b.h.b.d(context, b());
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void a(List<String> list) {
    }
}
