package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static e f35783b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Long> f35784c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private Context f35785a;

    public static e a() {
        return b();
    }

    private static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f35783b == null) {
                    f35783b = new e();
                }
                eVar = f35783b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    private void b(Context context) {
        String d11 = o.d(context);
        q0.a(d11);
        if (!q1.b().a()) {
            v.c("hmsSdk", "userManager.isUserUnlocked() == false");
            return;
        }
        String a11 = d.a(context, "global_v2", Constants.PARAM_APP_VER, "");
        d.b(context, "global_v2", Constants.PARAM_APP_VER, d11);
        q0.b(a11);
        if (TextUtils.isEmpty(a11)) {
            v.c("hmsSdk", "app ver is first save!");
        } else {
            if (a11.equals(d11)) {
                return;
            }
            v.c("hmsSdk", "the appVers are different!");
            a().a("", "alltype", a11);
        }
    }

    public void a(Context context) {
        this.f35785a = context;
        b(context);
        s.c().b().h(o.a());
    }

    public void a(String str, int i11) {
        if (this.f35785a == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            v.c("hmsSdk", "onReport: Before calling runtaskhandler()");
            a(str, n1.a(i11), q0.g());
        }
    }

    public void a(String str, int i11, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i11) {
            currentTimeMillis = n1.a("yyyy-MM-dd", currentTimeMillis);
        }
        b0.c().a(new a0(str2, jSONObject, str, n1.a(i11), currentTimeMillis));
    }

    public void a(String str, int i11, String str2, JSONObject jSONObject, long j11) {
        new i1(str, n1.a(i11), str2, jSONObject.toString(), j11).a();
    }

    public void a(String str, String str2) {
        if (!a1.a(str, str2)) {
            v.c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long j11 = a1.j(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j11 <= 30000) {
            v.f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        v.a("hmsSdk", "begin to call onReport!");
        a1.a(str, str2, currentTimeMillis);
        a(str, str2, q0.g());
    }

    public void a(String str, String str2, String str3) {
        Context context = this.f35785a;
        if (context == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String b11 = r0.b(context);
        if (a1.e(str, str2) && !"WIFI".equals(b11)) {
            v.c("hmsSdk", "strNetworkType is :" + b11);
            return;
        }
        if ("unknown".equals(b11) || "none".equals(b11) || "2G".equals(b11)) {
            v.e("hmsSdk", "The network is bad.");
        } else {
            b0.c().a(new v0(str, str2, str3));
        }
    }
}
