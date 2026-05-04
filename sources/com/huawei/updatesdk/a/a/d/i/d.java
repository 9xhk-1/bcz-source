package com.huawei.updatesdk.a.a.d.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static int f36837a = -1;

    public static int a() {
        if (f36837a == -1) {
            f36837a = ("zh".equals(c.a("ro.product.locale.language", "")) && "CN".equals(c.a("ro.product.locale.region", ""))) ? 0 : 1;
        }
        return f36837a;
    }
}
