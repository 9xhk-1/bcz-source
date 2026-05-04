package com.mob.secverify.pure.core.ope.cm.c;

import androidx.core.app.NotificationCompat;
import com.heytap.mcssdk.constant.IntentConstant;
import com.mob.secverify.b.c;
import com.mob.secverify.pure.core.ope.cm.b.f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends f {

    /* renamed from: b, reason: collision with root package name */
    public static ArrayList<Throwable> f40993b = new ArrayList<>();
    private String E;

    /* renamed from: c, reason: collision with root package name */
    private String f40994c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f40995d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f40996e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f40997f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f40998g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f40999h = null;

    /* renamed from: i, reason: collision with root package name */
    private String f41000i = null;

    /* renamed from: j, reason: collision with root package name */
    private String f41001j = null;

    /* renamed from: k, reason: collision with root package name */
    private String f41002k = null;

    /* renamed from: l, reason: collision with root package name */
    private String f41003l = null;

    /* renamed from: m, reason: collision with root package name */
    private String f41004m = null;

    /* renamed from: n, reason: collision with root package name */
    private String f41005n = null;

    /* renamed from: o, reason: collision with root package name */
    private String f41006o = null;

    /* renamed from: p, reason: collision with root package name */
    private String f41007p = null;

    /* renamed from: q, reason: collision with root package name */
    private String f41008q = null;

    /* renamed from: r, reason: collision with root package name */
    private JSONArray f41009r = null;

    /* renamed from: s, reason: collision with root package name */
    private String f41010s = null;

    /* renamed from: t, reason: collision with root package name */
    private String f41011t = null;

    /* renamed from: u, reason: collision with root package name */
    private String f41012u = null;

    /* renamed from: v, reason: collision with root package name */
    private String f41013v = null;

    /* renamed from: w, reason: collision with root package name */
    private String f41014w = null;

    /* renamed from: x, reason: collision with root package name */
    private String f41015x = null;

    /* renamed from: y, reason: collision with root package name */
    private String f41016y = null;

    /* renamed from: z, reason: collision with root package name */
    private String f41017z = null;
    private JSONObject A = null;
    private String B = null;
    private String C = null;
    private String D = null;
    private String F = null;
    private String G = null;

    public void A(String str) {
        this.f40997f = str;
    }

    public void B(String str) {
        this.f41011t = str;
    }

    public void C(String str) {
        this.G = str;
    }

    public void a(String str) {
        this.E = str;
    }

    public void b(String str) {
        this.F = str;
    }

    public void c(String str) {
        this.D = str;
    }

    public void d(String str) {
        this.C = str;
    }

    public void e(String str) {
        this.f41017z = str;
    }

    public void f(String str) {
        this.f41005n = str;
    }

    public void g(String str) {
        this.f41006o = str;
    }

    public void h(String str) {
        this.f41007p = str;
    }

    public void i(String str) {
        this.f41013v = str;
    }

    public void j(String str) {
        this.f41004m = str;
    }

    public void k(String str) {
        this.f41002k = str;
    }

    public void l(String str) {
        this.f40998g = str;
    }

    public void m(String str) {
        this.f40999h = str;
    }

    public void n(String str) {
        this.f40995d = str;
    }

    public void o(String str) {
        this.f40996e = str;
    }

    public void p(String str) {
        this.f41016y = str;
    }

    public void q(String str) {
        this.f41010s = str;
    }

    public void r(String str) {
        this.f41014w = str;
    }

    public void s(String str) {
        this.f41015x = str;
    }

    public void t(String str) {
        this.f41008q = str;
    }

    public void u(String str) {
        this.f40994c = str;
    }

    public void v(String str) {
        this.f41000i = str;
    }

    public void w(String str) {
        this.f41012u = str;
    }

    public void x(String str) {
        this.f41001j = str;
    }

    public void y(String str) {
        this.f41003l = str;
    }

    public void z(String str) {
        this.B = str;
    }

    public void a(JSONArray jSONArray) {
        this.f41009r = jSONArray;
    }

    public String a() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("traceId", this.f40994c);
            hashMap.put("requestTime", this.f41000i);
            hashMap.put("responseTime", this.f41001j);
            hashMap.put("requestType", this.f41003l);
            hashMap.put("loginType", this.f41008q);
            hashMap.put(IntentConstant.SDK_VERSION, this.f40997f);
            hashMap.put("networkType", this.f41011t);
            hashMap.put("networkClass", this.f41012u);
            hashMap.put("reqDevice", this.f41014w);
            hashMap.put("reqSystem", this.f41015x);
            hashMap.put("operatorType", this.f41010s);
            hashMap.put("simCardNum", this.f41016y);
            hashMap.put("exceptionStackTrace", this.f41009r);
            hashMap.put("appName", this.f40995d);
            hashMap.put("appVersion", this.f40996e);
            hashMap.put("interfaceCode", this.f41005n);
            hashMap.put("interfaceType", this.f41004m);
            hashMap.put("interfaceElasped", this.f41006o);
            hashMap.put(NotificationCompat.CATEGORY_EVENT, this.A);
            hashMap.put("appid", this.B);
            hashMap.put(Constants.PHONE_BRAND, this.f41013v);
            hashMap.put("resultCode", this.f41017z);
            hashMap.put("is_root", this.C);
            hashMap.put("imsiState", this.D);
            hashMap.put("elapsedTime", this.f41002k);
            hashMap.put("loginTime", this.f41007p);
            hashMap.put("clientType", this.f40998g);
            hashMap.put("timeOut", this.f40999h);
            hashMap.put("is_phoneStatePermission", this.E);
            hashMap.put("AID", this.F);
            hashMap.put("sysOperType", this.G);
            return this.f40987a.fromHashMap(hashMap);
        } catch (Throwable th2) {
            c.a().a(th2, "[SecPure] ==>%s", "Error parse entity to json");
            return "";
        }
    }
}
