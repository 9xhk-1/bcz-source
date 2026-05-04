package cn.com.chinatelecom.account.sdk.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.widget.TextView;
import cn.com.chinatelecom.account.api.d.f;
import cn.com.chinatelecom.account.api.d.g;
import cn.com.chinatelecom.account.api.d.j;
import cn.com.chinatelecom.account.sdk.PrivacyAgreementConfig;
import cn.com.chinatelecom.account.sdk.ResultListener;
import com.igexin.assist.sdk.AssistPushConsts;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9179a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static e f9180b;

    /* renamed from: c, reason: collision with root package name */
    private static e f9181c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f9182d;

    /* renamed from: e, reason: collision with root package name */
    private ResultListener f9183e;

    /* renamed from: f, reason: collision with root package name */
    private Context f9184f;

    /* renamed from: g, reason: collision with root package name */
    private String f9185g = "";

    /* renamed from: h, reason: collision with root package name */
    private boolean f9186h = false;

    private String g() {
        synchronized (a.class) {
            try {
                e eVar = f9180b;
                if (eVar == null || eVar.b() == null) {
                    return AssistPushConsts.MSG_KEY_CONTENT;
                }
                return f9180b.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Point a(Activity activity) {
        Point point = new Point();
        try {
            activity.getWindowManager().getDefaultDisplay().getSize(point);
            return point;
        } catch (Exception e11) {
            e11.printStackTrace();
            return point;
        }
    }

    public String b(PrivacyAgreementConfig privacyAgreementConfig) {
        String g11 = g();
        return (!g11.equals("CM") || privacyAgreementConfig == null || TextUtils.isEmpty(privacyAgreementConfig.chinaMobileUrl)) ? (!g11.equals("CU") || privacyAgreementConfig == null || TextUtils.isEmpty(privacyAgreementConfig.chinaUnicomUrl)) ? b.b() : privacyAgreementConfig.chinaUnicomUrl : privacyAgreementConfig.chinaMobileUrl;
    }

    public String c() {
        synchronized (a.class) {
            try {
                e eVar = f9180b;
                if (eVar == null || eVar.c() == null) {
                    return "以本机号码登录";
                }
                return f9180b.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String d() {
        String g11 = g();
        return g11.equals("CM") ? b.d() : g11.equals("CU") ? b.e() : b.c();
    }

    public boolean e() {
        String g11 = g();
        if (g11 == null || !g11.equals("CM")) {
            return g11 != null && g11.equals("CU");
        }
        return true;
    }

    public void f() {
        synchronized (a.class) {
            f9180b = null;
            f9181c = null;
        }
    }

    public static a a() {
        if (f9182d == null) {
            synchronized (a.class) {
                try {
                    if (f9182d == null) {
                        f9182d = new a();
                    }
                } finally {
                }
            }
        }
        return f9182d;
    }

    public boolean b() {
        synchronized (a.class) {
            try {
                e eVar = f9180b;
                if (eVar == null) {
                    return false;
                }
                return eVar.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String a(PrivacyAgreementConfig privacyAgreementConfig) {
        String g11 = g();
        return (!g11.equals("CM") || privacyAgreementConfig == null || TextUtils.isEmpty(privacyAgreementConfig.chinaMobileTitle)) ? (!g11.equals("CU") || privacyAgreementConfig == null || TextUtils.isEmpty(privacyAgreementConfig.chinaUnicomTitle)) ? b.a() : privacyAgreementConfig.chinaUnicomTitle : privacyAgreementConfig.chinaMobileTitle;
    }

    public void a(Context context) {
        e eVar = f9180b;
        if (eVar == null || eVar.e() == null) {
            a(j.g());
            return;
        }
        try {
            a(c.a(f9180b.e(), cn.com.chinatelecom.account.api.b.a(context, f9180b.d()).toLowerCase()));
        } catch (Throwable th2) {
            a(j.h());
            cn.com.chinatelecom.account.api.a.a(f9179a, "login exception ", th2);
            f.a(this.f9185g).g("login exception : " + th2.getMessage());
        }
        f();
    }

    public void a(Context context, String str, TextView textView) {
        try {
            e a11 = c.a(str);
            f9181c = a11;
            a(a11.a() == 0 ? c.a(f9181c.e(), cn.com.chinatelecom.account.api.b.a(context, f9181c.d()).toLowerCase()) : !TextUtils.isEmpty(f9181c.e()) ? f9181c.e() : j.h());
        } catch (Throwable th2) {
            a(j.h());
            cn.com.chinatelecom.account.api.a.a(f9179a, "login  exception 2", th2);
            f.a(this.f9185g).g("login exception 2 : " + th2.getMessage());
        }
        f();
    }

    public void a(Context context, boolean z11, String str) {
        this.f9184f = context.getApplicationContext();
        this.f9186h = z11;
        this.f9185g = str;
    }

    public synchronized void a(ResultListener resultListener) {
        this.f9183e = resultListener;
    }

    public synchronized void a(String str) {
        if (this.f9186h) {
            return;
        }
        if (this.f9183e != null) {
            try {
                cn.com.chinatelecom.account.api.a.a(f9179a, str);
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("reqId", this.f9185g);
                this.f9183e.onResult(jSONObject.toString());
                this.f9186h = true;
                this.f9183e = null;
                f.a(this.f9185g).f(g.f8996d);
                f.b(this.f9185g, jSONObject, "");
                f.c(this.f9185g);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(String str, ResultListener resultListener) {
        if (resultListener != null) {
            e a11 = c.a(str);
            f9180b = a11;
            resultListener.onResult(a11.f());
        }
    }
}
