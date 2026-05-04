package com.alipay.sdk.m.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static final String A = "act_info";
    public static final String B = "UTF-8";
    public static final String C = "new_external_info==";

    /* renamed from: m, reason: collision with root package name */
    public static final String f10999m = "\"&";

    /* renamed from: n, reason: collision with root package name */
    public static final String f11000n = "&";

    /* renamed from: o, reason: collision with root package name */
    public static final String f11001o = "bizcontext=\"";

    /* renamed from: p, reason: collision with root package name */
    public static final String f11002p = "bizcontext=";

    /* renamed from: q, reason: collision with root package name */
    public static final String f11003q = "\"";

    /* renamed from: r, reason: collision with root package name */
    public static final String f11004r = "appkey";

    /* renamed from: s, reason: collision with root package name */
    public static final String f11005s = "ty";

    /* renamed from: t, reason: collision with root package name */
    public static final String f11006t = "sv";

    /* renamed from: u, reason: collision with root package name */
    public static final String f11007u = "an";

    /* renamed from: v, reason: collision with root package name */
    public static final String f11008v = "setting";

    /* renamed from: w, reason: collision with root package name */
    public static final String f11009w = "av";

    /* renamed from: x, reason: collision with root package name */
    public static final String f11010x = "sdk_start_time";

    /* renamed from: y, reason: collision with root package name */
    public static final String f11011y = "extInfo";

    /* renamed from: z, reason: collision with root package name */
    public static final String f11012z = "ap_link_token";

    /* renamed from: a, reason: collision with root package name */
    public String f11013a;

    /* renamed from: b, reason: collision with root package name */
    public String f11014b;

    /* renamed from: c, reason: collision with root package name */
    public Context f11015c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11016d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11017e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11018f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11019g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11020h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11021i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11022j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ActivityInfo f11023k;

    /* renamed from: l, reason: collision with root package name */
    public final com.alipay.sdk.m.k.b f11024l;

    public a(Context context, String str, String str2) {
        String str3;
        this.f11013a = "";
        this.f11014b = "";
        this.f11015c = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.f11024l = new com.alipay.sdk.m.k.b(context, isEmpty);
        String b11 = b(str, this.f11014b);
        this.f11016d = b11;
        this.f11017e = SystemClock.elapsedRealtime();
        this.f11018f = n.g();
        ActivityInfo a11 = n.a(context);
        this.f11023k = a11;
        this.f11019g = str2;
        if (!isEmpty) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "eptyp", str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + b11);
            if (a11 != null) {
                str3 = a11.name + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a11.launchMode;
            } else {
                str3 = "null";
            }
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "actInfo", str3);
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, NotificationCompat.CATEGORY_SYSTEM, n.a(this));
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "sdkv", "1281fd4-clean");
        }
        try {
            this.f11015c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f11013a = packageInfo.versionName;
            this.f11014b = packageInfo.packageName;
        } catch (Exception e11) {
            e.a(e11);
        }
        if (!isEmpty) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "u" + n.g());
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.Q, "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.m.k.a.a(context, this, str, this.f11016d);
        }
        if (isEmpty || !com.alipay.sdk.m.m.a.D().s()) {
            return;
        }
        com.alipay.sdk.m.m.a.D().a(this, this.f11015c, true, 2);
    }

    private String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", b(jSONObject.optString("bizcontext")));
            return C + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private String e(String str) {
        try {
            String a11 = a(str, f10999m, f11001o);
            if (TextUtils.isEmpty(a11)) {
                return str + "&" + a(f11001o, "\"");
            }
            if (!a11.endsWith("\"")) {
                a11 = a11 + "\"";
            }
            int indexOf = str.indexOf(a11);
            return str.substring(0, indexOf) + b(a11, f11001o, "\"") + str.substring(indexOf + a11.length());
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "fmt2", th2, str);
            return str;
        }
    }

    private boolean f(String str) {
        return !str.contains(f10999m);
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f11012z, this.f11016d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static a h() {
        return null;
    }

    public Context a() {
        return this.f11015c;
    }

    public String b() {
        return this.f11014b;
    }

    public String c() {
        return this.f11013a;
    }

    private String b(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z11 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith("\"") && substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z11 = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        String a11 = a(jSONObject);
        if (z11) {
            a11 = "\"" + a11 + "\"";
        }
        return str2 + a11 + str3;
    }

    private String c(String str) {
        try {
            String a11 = a(str, "&", f11002p);
            if (TextUtils.isEmpty(a11)) {
                return str + "&" + a(f11002p, "");
            }
            int indexOf = str.indexOf(a11);
            return str.substring(0, indexOf) + b(a11, f11002p, "") + str.substring(indexOf + a11.length());
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "fmt1", th2, str);
            return str;
        }
    }

    public String a(String str) {
        return TextUtils.isEmpty(str) ? str : str.startsWith(C) ? d(str) : f(str) ? c(str) : e(str);
    }

    public boolean f() {
        return this.f11022j;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.s.a$a, reason: collision with other inner class name */
    public static final class C0175a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f11025a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        public static final HashMap<String, a> f11026b = new HashMap<>();

        /* renamed from: c, reason: collision with root package name */
        public static final String f11027c = "i_uuid_b_c";

        public static void a(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID randomUUID = UUID.randomUUID();
            f11025a.put(randomUUID, aVar);
            intent.putExtra(f11027c, randomUUID);
        }

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(f11027c);
            if (serializableExtra instanceof UUID) {
                return f11025a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void a(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            f11026b.put(str, aVar);
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f11026b.remove(str);
        }
    }

    public boolean d() {
        return this.f11021i;
    }

    private String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i11 = 0; i11 < split.length; i11++) {
            if (!TextUtils.isEmpty(split[i11]) && split[i11].startsWith(str3)) {
                return split[i11];
            }
        }
        return null;
    }

    private String b(String str) throws JSONException {
        return a(new JSONObject(str));
    }

    public void c(boolean z11) {
        this.f11022j = z11;
    }

    public static String b(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return String.format("EP%s%s_%s", "1", n.g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    public boolean e() {
        return this.f11020h;
    }

    private String a(String str, String str2) {
        return str + a(new JSONObject()) + str2;
    }

    public String a(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has(f11004r)) {
                jSONObject.put(f11004r, com.alipay.sdk.m.l.a.f10704g);
            }
            if (!jSONObject.has(f11005s)) {
                jSONObject.put(f11005s, "and_lite");
            }
            if (!jSONObject.has(f11006t)) {
                jSONObject.put(f11006t, "h.a.3.8.15");
            }
            if (!jSONObject.has(f11007u)) {
                jSONObject.put(f11007u, this.f11014b);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f11013a);
            }
            if (!jSONObject.has(f11010x)) {
                jSONObject.put(f11010x, System.currentTimeMillis());
            }
            if (!jSONObject.has(f11011y)) {
                jSONObject.put(f11011y, g());
            }
            if (!jSONObject.has(A)) {
                if (this.f11023k != null) {
                    str = this.f11023k.name + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f11023k.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(A, str);
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.f10653l, "fmt3", th2, String.valueOf(jSONObject));
            e.a(th2);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public void b(boolean z11) {
        this.f11020h = z11;
    }

    public static HashMap<String, String> a(a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar != null) {
            hashMap.put("sdk_ver", "15.8.15");
            hashMap.put("app_name", aVar.f11014b);
            hashMap.put("token", aVar.f11016d);
            hashMap.put("call_type", aVar.f11019g);
            hashMap.put("ts_api_invoke", String.valueOf(aVar.f11017e));
            com.alipay.sdk.m.u.a.a(aVar, hashMap);
        }
        return hashMap;
    }

    public void a(boolean z11) {
        this.f11021i = z11;
    }
}
