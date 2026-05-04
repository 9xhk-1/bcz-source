package com.igexin.push.core.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38059a = "MsgSPManager";

    /* renamed from: b, reason: collision with root package name */
    private static final String f38060b = "gx_msg_sp";

    /* renamed from: c, reason: collision with root package name */
    private static final String f38061c = "taskIdList";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38062d = "gx_vendor_token";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38063e = "tokeninfo";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38064f = "usfdl";

    /* renamed from: h, reason: collision with root package name */
    private static final Object f38065h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f38066i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static volatile d f38067j;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences f38068g;

    private d(Context context) {
        if (context != null) {
            this.f38068g = context.getSharedPreferences(f38060b, 0);
        }
    }

    public static d a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (f38067j == null) {
            synchronized (d.class) {
                try {
                    if (f38067j == null) {
                        f38067j = new d(applicationContext);
                    }
                } finally {
                }
            }
        }
        return f38067j;
    }

    private Object b(String str, Object obj) {
        return obj instanceof String ? this.f38068g.getString(str, (String) obj) : obj;
    }

    private JSONObject d() {
        try {
            String str = (String) b(f38061c, "");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new JSONObject(str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    private JSONObject e() {
        try {
            String str = (String) b(f38064f, "");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new JSONObject(str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    private String f() {
        try {
            return (String) b(f38062d, null);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    public final JSONObject c() {
        try {
            String valueOf = String.valueOf(b(f38063e, ""));
            return valueOf.isEmpty() ? new JSONObject() : new JSONObject(valueOf);
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            return new JSONObject();
        }
    }

    private void c(String str) {
        try {
            a(f38062d, str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final JSONObject a() {
        synchronized (f38065h) {
            try {
                String str = (String) b(f38064f, "");
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(keys.next());
                    if (!jSONObject2.has(com.alipay.sdk.m.t.a.f11034k) || Long.parseLong(jSONObject2.getString(com.alipay.sdk.m.t.a.f11034k)) < System.currentTimeMillis() - yr.f.f100282b) {
                        keys.remove();
                    }
                }
                return jSONObject;
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                return null;
            }
        }
    }

    public final void b() {
        synchronized (f38065h) {
            try {
                if (this.f38068g != null) {
                    a(f38064f, "");
                }
            } finally {
            }
        }
    }

    private void a(String str, Object obj) {
        SharedPreferences.Editor edit = this.f38068g.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        }
        edit.apply();
    }

    private static void c(JSONObject jSONObject) {
        try {
            if (jSONObject.length() < 20) {
                return;
            }
            Iterator<String> keys = jSONObject.keys();
            boolean z11 = false;
            long j11 = Long.MAX_VALUE;
            String str = null;
            while (keys.hasNext()) {
                String next = keys.next();
                long parseLong = Long.parseLong(jSONObject.getJSONObject(next).getString(com.alipay.sdk.m.t.a.f11034k));
                if (j11 > parseLong) {
                    str = next;
                    j11 = parseLong;
                }
                if (parseLong < System.currentTimeMillis() - yr.f.f100282b) {
                    keys.remove();
                    z11 = true;
                }
            }
            if (z11 || str == null) {
                return;
            }
            jSONObject.remove(str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final void b(String str) {
        if (this.f38068g == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f38066i) {
            try {
                JSONObject d11 = d();
                if (d11 == null) {
                    d11 = new JSONObject();
                }
                if (d11.length() > 0) {
                    b(d11);
                }
                d11.put(str, System.currentTimeMillis());
                a(f38061c, d11.toString());
            } finally {
            }
        }
    }

    private static void b(JSONObject jSONObject) {
        try {
            if (jSONObject.length() < 150) {
                return;
            }
            Iterator<String> keys = jSONObject.keys();
            boolean z11 = false;
            long j11 = Long.MAX_VALUE;
            String str = null;
            while (keys.hasNext()) {
                String next = keys.next();
                long j12 = jSONObject.getLong(next);
                if (j11 > j12) {
                    str = next;
                    j11 = j12;
                }
                if (j12 < System.currentTimeMillis() - yr.f.f100282b) {
                    keys.remove();
                    z11 = true;
                }
            }
            if (z11 || str == null) {
                return;
            }
            jSONObject.remove(str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (this.f38068g == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f38065h) {
            try {
                JSONObject e11 = e();
                if (e11 == null) {
                    e11 = new JSONObject();
                }
                if (e11.length() > 0) {
                    c(e11);
                }
                e11.put(str, jSONObject);
                a(f38064f, e11.toString());
            } finally {
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        try {
            a(f38063e, jSONObject.toString());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    public final boolean a(String str) {
        if (this.f38068g != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject d11 = d();
                if (d11 != null && d11.has(str)) {
                    com.igexin.c.a.c.a.a("sp task " + str + " already exists", new Object[0]);
                    return true;
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
        return false;
    }
}
