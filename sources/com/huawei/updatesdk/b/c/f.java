package com.huawei.updatesdk.b.c;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f extends c {
    @Override // com.huawei.updatesdk.b.c.c
    public String a() {
        return com.huawei.updatesdk.a.a.d.i.e.a() ? Build.PRODUCT : "";
    }

    @Override // com.huawei.updatesdk.b.c.c
    public String b() {
        return "com.huawei.appmarketwear";
    }

    @Override // com.huawei.updatesdk.b.c.c
    public String c() {
        return com.huawei.updatesdk.a.a.d.i.c.a("ro.product.manufacturer", "");
    }

    @Override // com.huawei.updatesdk.b.c.c
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("CE1EF7188F820973C191227D95D54311ED3A65EC83E37009E898A1C058BBC775");
        return arrayList;
    }
}
