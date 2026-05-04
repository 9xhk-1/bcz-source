package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35855a;

    /* renamed from: b, reason: collision with root package name */
    private String f35856b;

    /* renamed from: c, reason: collision with root package name */
    private String f35857c;

    /* renamed from: d, reason: collision with root package name */
    private List<b1> f35858d;

    /* renamed from: e, reason: collision with root package name */
    private String f35859e;

    public l0(String str, String str2, String str3, List<b1> list, String str4) {
        this.f35855a = str;
        this.f35856b = str2;
        this.f35857c = str3;
        this.f35858d = list;
        this.f35859e = str4;
    }

    private String a(String str, String str2) {
        String str3;
        String f11 = a1.f(str, str2);
        if (TextUtils.isEmpty(f11)) {
            v.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", f11);
    }

    private void b() {
        if (c0.a(q0.i(), "backup_event", 5242880)) {
            v.d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray c11 = c();
        String a11 = n1.a(this.f35855a, this.f35856b, this.f35859e);
        v.c("hmsSdk", "Update data cached into backup,spKey: " + a11);
        d.b(q0.i(), "backup_event", a11, c11.toString());
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<b1> it = this.f35858d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().d());
            } catch (JSONException unused) {
                v.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    private h1 d() {
        return k.a(this.f35858d, this.f35855a, this.f35856b, this.f35859e, this.f35857c);
    }

    public void a() {
        String a11 = a(this.f35855a, this.f35856b);
        if (TextUtils.isEmpty(a11) && !"preins".equals(this.f35856b)) {
            v.e("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.f35855a) && !"_openness_config_tag".equals(this.f35855a)) {
            b();
        }
        h1 d11 = d();
        if (d11 == null) {
            b0.c().a(new d1(this.f35858d, this.f35855a, this.f35859e, this.f35856b));
            return;
        }
        byte[] a12 = a(d11);
        if (a12.length == 0) {
            v.e("hmsSdk", "request body is empty");
        } else {
            b0.b().a(new f(a12, a11, this.f35855a, this.f35856b, this.f35859e, this.f35858d));
        }
    }

    private byte[] a(h1 h1Var) {
        String str;
        try {
            JSONObject a11 = h1Var.a();
            if (a11 != null) {
                return k1.a(a11.toString().getBytes("UTF-8"));
            }
            v.e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            v.e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            v.e("hmsSdk", str);
            return new byte[0];
        }
    }
}
