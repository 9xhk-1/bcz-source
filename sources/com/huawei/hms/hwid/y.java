package com.huawei.hms.hwid;

import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static final y f35970a = new y();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f35971b = new ConcurrentHashMap();

    private y() {
    }

    public static y a() {
        return f35970a;
    }

    public final AuthHuaweiId b() {
        try {
            String str = this.f35971b.get("HuaweiIdAccount");
            if (str != null) {
                return AuthHuaweiId.fromJson(str);
            }
            return null;
        } catch (Throwable th2) {
            as.d("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "getHuaweiSignInAccount faild, exception:" + th2.getClass().getSimpleName(), true);
            return null;
        }
    }

    public void c() {
        this.f35971b.clear();
    }

    public void a(AuthHuaweiId authHuaweiId, HuaweiIdAuthParams huaweiIdAuthParams) {
        String json;
        as.b("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "saveDefaultHuaweiIdSignInAccount start.", true);
        if (authHuaweiId != null) {
            try {
                json = authHuaweiId.toJson();
            } catch (Throwable th2) {
                as.d("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "store faild, exception:" + th2.getClass().getSimpleName(), true);
                return;
            }
        } else {
            json = null;
        }
        a(json, huaweiIdAuthParams != null ? huaweiIdAuthParams.toJson() : null);
    }

    private void a(String str, String str2) {
        as.b("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "saveDefaultHuaweiIdSignInAccount start.", true);
        this.f35971b.remove("HuaweiIdAccount");
        this.f35971b.remove("HuaweiIdAuthParams");
        if (str != null) {
            this.f35971b.put("HuaweiIdAccount", str);
        }
        if (str2 != null) {
            this.f35971b.put("HuaweiIdAuthParams", str2);
        }
    }
}
