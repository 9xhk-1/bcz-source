package com.huawei.hms.hwid;

import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AuthAccount;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final g f35958a = new g();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f35959b = new ConcurrentHashMap();

    private g() {
    }

    public static g a() {
        return f35958a;
    }

    public final AuthAccount b() {
        as.b("[AccountSDK]AccountAuthMemCache", "getSignInAccount start.", true);
        try {
            String str = this.f35959b.get("AccountAuth");
            if (str != null) {
                return AuthAccount.fromJson(str);
            }
            return null;
        } catch (Throwable th2) {
            as.d("[AccountSDK]AccountAuthMemCache", "getSignInAccount faild, exception:" + th2.getClass().getSimpleName(), true);
            return null;
        }
    }

    public void c() {
        this.f35959b.clear();
    }

    public void a(AuthAccount authAccount, AccountAuthParams accountAuthParams) {
        String json;
        as.b("[AccountSDK]AccountAuthMemCache", "saveDefaultAccountSignInAccount start.", true);
        if (authAccount != null) {
            try {
                json = authAccount.toJson();
            } catch (Throwable th2) {
                as.d("[AccountSDK]AccountAuthMemCache", "store faild, exception:" + th2.getClass().getSimpleName(), true);
                return;
            }
        } else {
            json = null;
        }
        a(json, accountAuthParams != null ? accountAuthParams.toJson() : null);
    }

    private void a(String str, String str2) {
        as.b("[AccountSDK]AccountAuthMemCache", "saveDefaultAccountSignInAccount start.", true);
        this.f35959b.remove("AccountAuth");
        this.f35959b.remove("AccountAuthParams");
        if (str != null) {
            this.f35959b.put("AccountAuth", str);
        }
        if (str2 != null) {
            this.f35959b.put("AccountAuthParams", str2);
        }
    }
}
