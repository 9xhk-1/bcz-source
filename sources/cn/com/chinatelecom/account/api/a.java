package cn.com.chinatelecom.account.api;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.d.f;
import cn.com.chinatelecom.account.api.d.g;
import cn.com.chinatelecom.account.api.d.j;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f8832a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f8833b = "";

    /* renamed from: c, reason: collision with root package name */
    public static Context f8834c = null;

    /* renamed from: d, reason: collision with root package name */
    public static d f8835d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8836e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Handler f8837f = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private static final String f8838g = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f8839h;

    public static a a() {
        if (f8839h == null) {
            synchronized (a.class) {
                try {
                    if (f8839h == null) {
                        f8839h = new a();
                    }
                } finally {
                }
            }
        }
        return f8839h;
    }

    public void a(Context context, String str, String str2, d dVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null!");
        }
        if (str == null) {
            throw new IllegalArgumentException("appId must not be null!");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("appSecret must not be null!");
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        f8834c = context;
        cn.com.chinatelecom.account.api.c.c.a(f8834c);
        f8832a = str;
        f8833b = str2;
        f8835d = dVar;
    }

    public void a(CtSetting ctSetting, int i11, c cVar) {
        a(f8838g, "called requestPreLogin()");
        if (cVar == null) {
            return;
        }
        if (f8834c == null || TextUtils.isEmpty(f8832a) || TextUtils.isEmpty(f8833b)) {
            a((String) null, j.e(), cVar);
            return;
        }
        if (!g.b(f8834c)) {
            a((String) null, j.a(), cVar);
            return;
        }
        if (g.c(f8834c)) {
            new cn.com.chinatelecom.account.api.b.a(f8834c, f8832a, f8833b).a(cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.d.b.f8957e), ctSetting, i11, cVar);
        } else if (g.d(f8834c)) {
            new cn.com.chinatelecom.account.api.b.a(f8834c, f8832a, f8833b).b(cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.d.b.f8957e), ctSetting, i11, cVar);
        } else {
            a((String) null, j.d(), cVar);
        }
    }

    public void a(CtSetting ctSetting, c cVar) {
        a(ctSetting, b.f8853d, cVar);
    }

    public static void a(String str, String str2) {
        if (f8835d != null) {
            f8835d.a("CT_" + str, str2);
        }
    }

    public void a(String str, String str2, String str3) {
        g.f8993a = str;
        g.f8994b = str2;
        g.f8995c = str3;
    }

    public static void a(String str, String str2, Throwable th2) {
        if (f8835d != null) {
            f8835d.a("CT_" + str, str2, th2);
        }
    }

    public static void a(final String str, final JSONObject jSONObject, final c cVar) {
        f8837f.post(new Runnable() { // from class: cn.com.chinatelecom.account.api.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this != null) {
                    try {
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("reqId", str2);
                        }
                        c.this.a(jSONObject.toString());
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    f.c(str);
                }
            }
        });
    }
}
