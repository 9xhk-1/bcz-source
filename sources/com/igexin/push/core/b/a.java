package com.igexin.push.core.b;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.push.core.ServiceManager;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f37755a;

    /* renamed from: b, reason: collision with root package name */
    public String f37756b;

    /* renamed from: c, reason: collision with root package name */
    public String f37757c;

    /* renamed from: d, reason: collision with root package name */
    public String f37758d;

    /* renamed from: e, reason: collision with root package name */
    public String f37759e;

    /* renamed from: f, reason: collision with root package name */
    public String f37760f = "open";

    /* renamed from: g, reason: collision with root package name */
    public String f37761g;

    /* renamed from: h, reason: collision with root package name */
    public String f37762h;

    /* renamed from: i, reason: collision with root package name */
    public String f37763i;

    /* renamed from: j, reason: collision with root package name */
    public String f37764j;

    /* renamed from: k, reason: collision with root package name */
    public String f37765k;

    /* renamed from: l, reason: collision with root package name */
    public String f37766l;

    /* renamed from: m, reason: collision with root package name */
    public String f37767m;

    /* renamed from: n, reason: collision with root package name */
    public long f37768n;

    /* renamed from: o, reason: collision with root package name */
    public String f37769o;

    public a() {
        if (com.igexin.push.core.e.f38030g != null) {
            this.f37760f += ":" + com.igexin.push.core.e.f38030g;
        }
        this.f37759e = "3.3.7.0";
        this.f37756b = com.igexin.push.core.e.E;
        this.f37757c = com.igexin.push.core.e.D;
        this.f37758d = com.igexin.push.g.n.c();
        this.f37755a = com.igexin.push.core.e.F;
        this.f37762h = "ANDROID";
        this.f37764j = "android" + Build.VERSION.RELEASE;
        this.f37765k = "MDP";
        this.f37761g = com.igexin.push.core.e.H;
        this.f37768n = System.currentTimeMillis();
        this.f37766l = com.igexin.push.core.e.I;
        this.f37767m = com.igexin.push.core.e.G;
        this.f37769o = com.igexin.push.core.e.C;
        if (!com.igexin.assist.sdk.a.a().c() || AssistPushManager.checkSupportDevice(com.igexin.push.core.e.f38035l)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("FCM-");
        String str = this.f37767m;
        sb2.append(str == null ? "" : str);
        this.f37767m = sb2.toString();
    }

    private static String a(a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = aVar.f37755a;
        if (str == null) {
            str = "";
        }
        jSONObject.put("model", str);
        String str2 = aVar.f37756b;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("sim", str2);
        String str3 = aVar.f37757c;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("imei", str3);
        jSONObject.put("mac", aVar.f37758d == null ? "" : com.igexin.push.g.n.c());
        String str4 = aVar.f37759e;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("version", str4);
        String str5 = aVar.f37760f;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("channelid", str5);
        jSONObject.put("type", "ANDROID");
        String str6 = aVar.f37765k;
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("app", str6);
        StringBuilder sb2 = new StringBuilder("ANDROID-");
        String str7 = aVar.f37761g;
        if (str7 == null) {
            str7 = "";
        }
        sb2.append(str7);
        jSONObject.put("deviceid", sb2.toString());
        String str8 = aVar.f37766l;
        if (str8 == null) {
            str8 = "";
        }
        jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, str8);
        String str9 = aVar.f37767m;
        if (str9 == null) {
            str9 = "";
        }
        jSONObject.put(Constants.PHONE_BRAND, str9);
        String str10 = aVar.f37764j;
        if (str10 == null) {
            str10 = "";
        }
        jSONObject.put("system_version", str10);
        String str11 = aVar.f37763i;
        if (str11 == null) {
            str11 = "";
        }
        jSONObject.put("cell", str11);
        jSONObject.put("aid", com.igexin.push.g.n.h());
        jSONObject.put("adid", com.igexin.push.g.n.i());
        jSONObject.put("gtcid", TextUtils.isEmpty(aVar.f37769o) ? "" : aVar.f37769o);
        String str12 = com.igexin.push.core.e.f38031h;
        if (str12 == null) {
            str12 = "";
        }
        jSONObject.put("oaid", str12);
        ServiceManager.getInstance();
        String e11 = ServiceManager.e(com.igexin.push.core.e.f38035l);
        if (!com.igexin.push.core.b.f37719ap.equals(e11)) {
            jSONObject.put("us", e11);
        }
        ServiceManager.getInstance();
        jSONObject.put(com.igexin.push.g.o.f38735d, ServiceManager.d(com.igexin.push.core.e.f38035l));
        jSONObject.put("notification_enabled", com.igexin.push.g.c.b(com.igexin.push.core.e.f38035l) ? 1 : 0);
        jSONObject.put("installChannel", com.igexin.c.b.a.b(com.igexin.push.core.e.f38025b, "").replaceAll("\\|", ""));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", "addphoneinfo");
        jSONObject2.put("id", String.valueOf(aVar.f37768n));
        jSONObject2.put("info", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("guardMe", String.valueOf(com.igexin.push.config.e.b()));
        jSONObject3.put("guardOthers", String.valueOf(com.igexin.push.config.e.c()));
        jSONObject2.put("extra", jSONObject3);
        return jSONObject2.toString();
    }
}
