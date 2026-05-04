package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.squareup.picasso.h0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f45205a;

    /* renamed from: a, reason: collision with other field name */
    private Context f100a;

    /* renamed from: a, reason: collision with other field name */
    private a f101a;

    /* renamed from: a, reason: collision with other field name */
    String f102a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, a> f103a;

    public static class a {

        /* renamed from: a, reason: collision with other field name */
        private Context f104a;

        /* renamed from: a, reason: collision with other field name */
        public String f105a;

        /* renamed from: b, reason: collision with root package name */
        public String f45207b;

        /* renamed from: c, reason: collision with root package name */
        public String f45208c;

        /* renamed from: d, reason: collision with root package name */
        public String f45209d;

        /* renamed from: e, reason: collision with root package name */
        public String f45210e;

        /* renamed from: f, reason: collision with root package name */
        public String f45211f;

        /* renamed from: g, reason: collision with root package name */
        public String f45212g;

        /* renamed from: h, reason: collision with root package name */
        public String f45213h;

        /* renamed from: a, reason: collision with other field name */
        public boolean f106a = true;

        /* renamed from: b, reason: collision with other field name */
        public boolean f107b = false;

        /* renamed from: a, reason: collision with root package name */
        public int f45206a = 1;

        public a(Context context) {
            this.f104a = context;
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f105a = jSONObject.getString("appId");
                aVar.f45207b = jSONObject.getString("appToken");
                aVar.f45208c = jSONObject.getString("regId");
                aVar.f45209d = jSONObject.getString("regSec");
                aVar.f45211f = jSONObject.getString("devId");
                aVar.f45210e = jSONObject.getString("vName");
                aVar.f106a = jSONObject.getBoolean("valid");
                aVar.f107b = jSONObject.getBoolean(h0.C);
                aVar.f45206a = jSONObject.getInt("envType");
                aVar.f45212g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.a(th2);
                return null;
            }
        }

        public void b() {
            this.f106a = false;
            b.a(this.f104a).edit().putBoolean("valid", this.f106a).commit();
        }

        public void c(String str, String str2, String str3) {
            this.f105a = str;
            this.f45207b = str2;
            this.f45212g = str3;
        }

        private String a() {
            Context context = this.f104a;
            return com.xiaomi.push.g.m5976a(context, context.getPackageName());
        }

        public void b(String str, String str2, String str3) {
            this.f45208c = str;
            this.f45209d = str2;
            this.f45211f = com.xiaomi.push.i.h(this.f104a);
            this.f45210e = a();
            this.f106a = true;
            this.f45213h = str3;
            SharedPreferences.Editor edit = b.a(this.f104a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("devId", this.f45211f);
            edit.putString("vName", a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f105a);
                jSONObject.put("appToken", aVar.f45207b);
                jSONObject.put("regId", aVar.f45208c);
                jSONObject.put("regSec", aVar.f45209d);
                jSONObject.put("devId", aVar.f45211f);
                jSONObject.put("vName", aVar.f45210e);
                jSONObject.put("valid", aVar.f106a);
                jSONObject.put(h0.C, aVar.f107b);
                jSONObject.put("envType", aVar.f45206a);
                jSONObject.put("regResource", aVar.f45212g);
                return jSONObject.toString();
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.a(th2);
                return null;
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m5696a() {
            b.a(this.f104a).edit().clear().commit();
            this.f105a = null;
            this.f45207b = null;
            this.f45208c = null;
            this.f45209d = null;
            this.f45211f = null;
            this.f45210e = null;
            this.f106a = false;
            this.f107b = false;
            this.f45213h = null;
            this.f45206a = 1;
        }

        public void a(int i11) {
            this.f45206a = i11;
        }

        public void a(String str, String str2) {
            this.f45208c = str;
            this.f45209d = str2;
            this.f45211f = com.xiaomi.push.i.h(this.f104a);
            this.f45210e = a();
            this.f106a = true;
        }

        public void a(String str, String str2, String str3) {
            this.f105a = str;
            this.f45207b = str2;
            this.f45212g = str3;
            SharedPreferences.Editor edit = b.a(this.f104a).edit();
            edit.putString("appId", this.f105a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public void a(boolean z11) {
            this.f107b = z11;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5697a() {
            return m5698a(this.f105a, this.f45207b);
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5698a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f105a, str);
            boolean equals2 = TextUtils.equals(this.f45207b, str2);
            boolean isEmpty = TextUtils.isEmpty(this.f45208c);
            boolean z11 = !isEmpty;
            boolean isEmpty2 = TextUtils.isEmpty(this.f45209d);
            boolean z12 = !isEmpty2;
            boolean z13 = false;
            boolean z14 = TextUtils.equals(this.f45211f, com.xiaomi.push.i.h(this.f104a)) || TextUtils.equals(this.f45211f, com.xiaomi.push.i.g(this.f104a));
            if (equals && equals2 && !isEmpty && !isEmpty2 && z14) {
                z13 = true;
            }
            if (!z13) {
                com.xiaomi.channel.commonutils.logger.b.e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z14)));
            }
            return z13;
        }
    }

    private b(Context context) {
        this.f100a = context;
        c();
    }

    public int a() {
        return this.f101a.f45206a;
    }

    public String b() {
        return this.f101a.f45207b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m5691c() {
        return this.f101a.f45208c;
    }

    public String d() {
        return this.f101a.f45209d;
    }

    public String e() {
        return this.f101a.f45212g;
    }

    public String f() {
        return this.f101a.f45213h;
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    private void c() {
        this.f101a = new a(this.f100a);
        this.f103a = new HashMap();
        SharedPreferences a11 = a(this.f100a);
        this.f101a.f105a = a11.getString("appId", null);
        this.f101a.f45207b = a11.getString("appToken", null);
        this.f101a.f45208c = a11.getString("regId", null);
        this.f101a.f45209d = a11.getString("regSec", null);
        this.f101a.f45211f = a11.getString("devId", null);
        if (!TextUtils.isEmpty(this.f101a.f45211f) && com.xiaomi.push.i.a(this.f101a.f45211f)) {
            this.f101a.f45211f = com.xiaomi.push.i.h(this.f100a);
            a11.edit().putString("devId", this.f101a.f45211f).commit();
        }
        this.f101a.f45210e = a11.getString("vName", null);
        this.f101a.f106a = a11.getBoolean("valid", true);
        this.f101a.f107b = a11.getBoolean(h0.C, false);
        this.f101a.f45206a = a11.getInt("envType", 1);
        this.f101a.f45212g = a11.getString("regResource", null);
        this.f101a.f45213h = a11.getString("appRegion", null);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5689b() {
        this.f101a.b();
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m5693d() {
        return (TextUtils.isEmpty(this.f101a.f105a) || TextUtils.isEmpty(this.f101a.f45207b) || TextUtils.isEmpty(this.f101a.f45208c) || TextUtils.isEmpty(this.f101a.f45209d)) ? false : true;
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m5694e() {
        return this.f101a.f107b;
    }

    /* renamed from: f, reason: collision with other method in class */
    public boolean m5695f() {
        return !this.f101a.f106a;
    }

    public a a(String str) {
        if (this.f103a.containsKey(str)) {
            return this.f103a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a11 = a(this.f100a);
        if (!a11.contains(str2)) {
            return null;
        }
        a a12 = a.a(this.f100a, a11.getString(str2, ""));
        this.f103a.put(str2, a12);
        return a12;
    }

    public void b(String str) {
        this.f103a.remove(str);
        a(this.f100a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m5692c() {
        return this.f101a.m5697a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static b m5683a(Context context) {
        if (f45205a == null) {
            synchronized (b.class) {
                try {
                    if (f45205a == null) {
                        f45205a = new b(context);
                    }
                } finally {
                }
            }
        }
        return f45205a;
    }

    public void b(String str, String str2, String str3) {
        this.f101a.b(str, str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5684a() {
        return this.f101a.f105a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m5690b() {
        if (this.f101a.m5697a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5685a() {
        this.f101a.m5696a();
    }

    public void a(int i11) {
        this.f101a.a(i11);
        a(this.f100a).edit().putInt("envType", i11).commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5686a(String str) {
        SharedPreferences.Editor edit = a(this.f100a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f101a.f45210e = str;
    }

    public void a(String str, a aVar) {
        this.f103a.put(str, aVar);
        a(this.f100a).edit().putString("hybrid_app_info_" + str, a.a(aVar)).commit();
    }

    public void a(String str, String str2, String str3) {
        this.f101a.a(str, str2, str3);
    }

    public void a(boolean z11) {
        this.f101a.a(z11);
        a(this.f100a).edit().putBoolean(h0.C, z11).commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5687a() {
        Context context = this.f100a;
        return !TextUtils.equals(com.xiaomi.push.g.m5976a(context, context.getPackageName()), this.f101a.f45210e);
    }

    public boolean a(String str, String str2) {
        return this.f101a.m5698a(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5688a(String str, String str2, String str3) {
        a a11 = a(str3);
        return a11 != null && TextUtils.equals(str, a11.f105a) && TextUtils.equals(str2, a11.f45207b);
    }
}
