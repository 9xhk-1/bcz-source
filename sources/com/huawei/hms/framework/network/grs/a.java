package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f35608e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f35609a;

    /* renamed from: b, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f35610b;

    /* renamed from: c, reason: collision with root package name */
    private g f35611c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f35612d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    public static class C0445a implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a, reason: collision with root package name */
        String f35613a;

        /* renamed from: b, reason: collision with root package name */
        Map<String, String> f35614b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f35615c;

        /* renamed from: d, reason: collision with root package name */
        Context f35616d;

        /* renamed from: e, reason: collision with root package name */
        GrsBaseInfo f35617e;

        /* renamed from: f, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f35618f;

        public C0445a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f35613a = str;
            this.f35614b = map;
            this.f35615c = iQueryUrlsCallBack;
            this.f35616d = context;
            this.f35617e = grsBaseInfo;
            this.f35618f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.f35614b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f35613a, StringUtils.anonymizeMessage(new JSONObject(this.f35614b).toString()));
                this.f35615c.onCallBackSuccess(this.f35614b);
                return;
            }
            if (this.f35614b != null) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f35613a);
                this.f35615c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> a11 = com.huawei.hms.framework.network.grs.f.b.a(this.f35616d.getPackageName()).a(this.f35616d, this.f35618f, this.f35617e, this.f35613a, true);
            if (a11 == null || a11.isEmpty()) {
                Logger.e(a.f35608e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f35613a);
            }
            if (a11 == null) {
                a11 = new ConcurrentHashMap<>();
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f35613a, StringUtils.anonymizeMessage(new JSONObject(a11).toString()));
            this.f35615c.onCallBackSuccess(a11);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String j11 = dVar.j();
            Map<String, String> a11 = a.a(j11, this.f35613a);
            if (!a11.isEmpty()) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f35613a, StringUtils.anonymizeMessage(new JSONObject(a11).toString()));
                this.f35615c.onCallBackSuccess(a11);
                return;
            }
            Map<String, String> map = this.f35614b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f35613a, StringUtils.anonymizeMessage(new JSONObject(this.f35614b).toString()));
                this.f35615c.onCallBackSuccess(this.f35614b);
                return;
            }
            if (this.f35614b != null) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f35613a);
                this.f35615c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(j11)) {
                Logger.e(a.f35608e, "The serviceName[%s] is not configured on the GRS server.", this.f35613a);
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> a12 = com.huawei.hms.framework.network.grs.f.b.a(this.f35616d.getPackageName()).a(this.f35616d, this.f35618f, this.f35617e, this.f35613a, true);
            if (a12 == null || a12.isEmpty()) {
                Logger.e(a.f35608e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f35613a);
            }
            if (a12 == null) {
                a12 = new ConcurrentHashMap<>();
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f35613a, StringUtils.anonymizeMessage(new JSONObject(a12).toString()));
            this.f35615c.onCallBackSuccess(a12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a, reason: collision with root package name */
        String f35619a;

        /* renamed from: b, reason: collision with root package name */
        String f35620b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f35621c;

        /* renamed from: d, reason: collision with root package name */
        String f35622d;

        /* renamed from: e, reason: collision with root package name */
        Context f35623e;

        /* renamed from: f, reason: collision with root package name */
        GrsBaseInfo f35624f;

        /* renamed from: g, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f35625g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f35619a = str;
            this.f35620b = str2;
            this.f35621c = iQueryUrlCallBack;
            this.f35622d = str3;
            this.f35623e = context;
            this.f35624f = grsBaseInfo;
            this.f35625g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.f35622d)) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f35619a, this.f35620b, StringUtils.anonymizeMessage(this.f35622d));
                this.f35621c.onCallBackSuccess(this.f35622d);
                return;
            }
            if (!TextUtils.isEmpty(this.f35622d)) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f35619a, this.f35620b);
                this.f35621c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String a11 = com.huawei.hms.framework.network.grs.f.b.a(this.f35623e.getPackageName()).a(this.f35623e, this.f35625g, this.f35624f, this.f35619a, this.f35620b, true);
            if (a11 == null || a11.isEmpty()) {
                Logger.e(a.f35608e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f35619a, this.f35620b);
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f35619a, this.f35620b, StringUtils.anonymizeMessage(a11));
            this.f35621c.onCallBackSuccess(a11);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String j11 = dVar.j();
            Map<String, String> a11 = a.a(j11, this.f35619a);
            if (a11.containsKey(this.f35620b)) {
                String str = a.f35608e;
                String str2 = this.f35619a;
                String str3 = this.f35620b;
                Logger.i(str, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str2, str3, StringUtils.anonymizeMessage(a11.get(str3)));
                this.f35621c.onCallBackSuccess(a11.get(this.f35620b));
                return;
            }
            if (!TextUtils.isEmpty(this.f35622d)) {
                String str4 = a.f35608e;
                String str5 = this.f35619a;
                String str6 = this.f35620b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str5, str6, StringUtils.anonymizeMessage(a11.get(str6)));
                this.f35621c.onCallBackSuccess(this.f35622d);
                return;
            }
            if (!TextUtils.isEmpty(this.f35622d)) {
                Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f35619a, this.f35620b);
                this.f35621c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(j11)) {
                Logger.e(a.f35608e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f35619a, this.f35620b);
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String a12 = com.huawei.hms.framework.network.grs.f.b.a(this.f35623e.getPackageName()).a(this.f35623e, this.f35625g, this.f35624f, this.f35619a, this.f35620b, true);
            if (a12 == null || a12.isEmpty()) {
                Logger.e(a.f35608e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f35619a, this.f35620b);
            }
            Logger.i(a.f35608e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f35619a, this.f35620b, StringUtils.anonymizeMessage(a12));
            this.f35621c.onCallBackSuccess(a12);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.f35609a = grsBaseInfo;
        this.f35610b = aVar;
        this.f35611c = gVar;
        this.f35612d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z11) {
        return new CountryCodeBean(context, z11);
    }

    public String a(Context context, String str, int i11) {
        com.huawei.hms.framework.network.grs.g.d a11 = this.f35611c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f35609a, context), str, this.f35612d, i11);
        return a11 == null ? "" : a11.m() ? this.f35610b.a().a(this.f35609a.getGrsParasKey(true, true, context), "") : a11.j();
    }

    public String a(String str, String str2, Context context, int i11) {
        String str3;
        String str4;
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str5 = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(str5)) {
            Logger.i(f35608e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str5));
            return str5;
        }
        String a11 = a(context, str, i11);
        String str6 = a(a11, str).get(str2);
        if (!TextUtils.isEmpty(str6)) {
            Logger.i(f35608e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str6));
            return str6;
        }
        if (TextUtils.isEmpty(str5)) {
            if (!TextUtils.isEmpty(a11)) {
                Logger.e(f35608e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str7 = f35608e;
            Logger.i(str7, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            str3 = str;
            str4 = str2;
            str5 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f35610b, this.f35609a, str3, str4, true);
            if (str5 == null || str5.isEmpty()) {
                Logger.e(str7, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str3, str4);
            }
        } else {
            str3 = str;
            str4 = str2;
        }
        Logger.i(f35608e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(str5));
        return str5;
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(f35608e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e11) {
            Logger.w(f35608e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return concurrentHashMap;
        }
    }

    public Map<String, String> a(String str, Context context, int i11) {
        String str2;
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a11 = a(str, bVar, context);
        if (bVar.a() && !a11.isEmpty()) {
            Logger.i(f35608e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a11).toString()));
            return a11;
        }
        String a12 = a(context, str, i11);
        Map<String, String> a13 = a(a12, str);
        if (!a13.isEmpty()) {
            Logger.i(f35608e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a13).toString()));
            return a13;
        }
        if (a11.isEmpty()) {
            if (!TextUtils.isEmpty(a12)) {
                Logger.e(f35608e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str3 = f35608e;
            Logger.i(str3, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            str2 = str;
            a11 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f35610b, this.f35609a, str2, true);
            if (a11 == null || a11.isEmpty()) {
                Logger.e(str3, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str2);
            }
        } else {
            str2 = str;
        }
        Logger.i(f35608e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str2, StringUtils.anonymizeMessage(a11 != null ? new JSONObject(a11).toString() : ""));
        return a11;
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> a11 = this.f35610b.a(this.f35609a, str, bVar, context);
        if (a11 != null && !a11.isEmpty()) {
            Logger.i(f35608e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return a11;
        }
        Map<String, String> a12 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f35610b, this.f35609a, str, false);
        Logger.i(f35608e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return a12 != null ? a12 : new HashMap();
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f35608e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(f35608e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e11) {
            Logger.w(f35608e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e11) {
            Logger.w(f35608e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return concurrentHashMap;
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i11) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a11 = a(str, bVar, context);
        if (!bVar.a()) {
            this.f35611c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f35609a, context), new C0445a(str, a11, iQueryUrlsCallBack, context, this.f35609a, this.f35610b), str, this.f35612d, i11);
        } else if (a11.isEmpty()) {
            Logger.i(f35608e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f35608e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a11).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a11).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(a11);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i11) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.f35611c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f35609a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f35609a, this.f35610b), str, this.f35612d, i11);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(f35608e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(f35608e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
