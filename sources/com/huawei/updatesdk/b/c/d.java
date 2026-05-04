package com.huawei.updatesdk.b.c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends c {
    @Override // com.huawei.updatesdk.b.c.c
    public String a() {
        String a11 = com.huawei.updatesdk.a.a.d.i.c.a("ro.product.hw_model", "");
        return TextUtils.isEmpty(a11) ? com.huawei.updatesdk.a.a.d.i.c.a("ro.product.hn_model", "") : a11;
    }

    @Override // com.huawei.updatesdk.b.c.c
    public String b() {
        return "com.huawei.appmarket";
    }

    @Override // com.huawei.updatesdk.b.c.c
    public String c() {
        return com.huawei.updatesdk.a.a.d.i.c.a("ro.product.manufacturer", "");
    }

    @Override // com.huawei.updatesdk.b.c.c
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F");
        arrayList.add("FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212");
        arrayList.add("A9436644E0BD71FF512C63839F8AC27114399F36956958688555DFCC63257EDE");
        return arrayList;
    }
}
