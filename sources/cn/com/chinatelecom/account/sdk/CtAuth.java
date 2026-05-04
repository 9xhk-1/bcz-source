package cn.com.chinatelecom.account.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.a;
import cn.com.chinatelecom.account.api.b;
import cn.com.chinatelecom.account.api.c;
import cn.com.chinatelecom.account.api.d;

/* loaded from: classes3.dex */
public final class CtAuth {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9171a = "CtAuth";

    /* renamed from: b, reason: collision with root package name */
    private static volatile CtAuth f9172b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9173c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f9174d = false;

    /* renamed from: e, reason: collision with root package name */
    private d f9175e = new d() { // from class: cn.com.chinatelecom.account.sdk.CtAuth.2
        @Override // cn.com.chinatelecom.account.api.d
        public void a(String str, String str2) {
            if (CtAuth.f9173c) {
                Log.i(str, str2);
            }
        }

        @Override // cn.com.chinatelecom.account.api.d
        public void a(String str, String str2, Throwable th2) {
            if (CtAuth.f9173c) {
                Log.w(str, str2);
                if (th2 != null) {
                    th2.printStackTrace();
                }
            }
        }
    };

    public static CtAuth getInstance() {
        if (f9172b == null) {
            synchronized (CtAuth.class) {
                try {
                    if (f9172b == null) {
                        f9172b = new CtAuth();
                    }
                } finally {
                }
            }
        }
        return f9172b;
    }

    public void finishAuthActivity() {
        cn.com.chinatelecom.account.sdk.a.d.a().d();
        cn.com.chinatelecom.account.sdk.a.d.f();
    }

    public void finishMiniAuthActivity() {
        cn.com.chinatelecom.account.sdk.a.d.a().e();
        cn.com.chinatelecom.account.sdk.a.d.f();
    }

    public void init(Context context, String str, String str2, boolean z11) {
        f9173c = z11;
        b.a();
        a.a().a(context, str, str2, this.f9175e);
    }

    public void openAuthActivity(Context context, AuthPageConfig authPageConfig, AuthViewConfig authViewConfig, ResultListener resultListener) {
        String str = f9171a;
        a.a(str, "called openAuthActivity()");
        if (context == null || TextUtils.isEmpty(b.b()) || TextUtils.isEmpty(b.c())) {
            throw new IllegalArgumentException("Please call the init method");
        }
        if (!f9174d) {
            a.a(str, "Please call the requestPreLogin method");
            return;
        }
        if (authPageConfig == null) {
            a.a(str, "The authPageConfig is empty");
            return;
        }
        cn.com.chinatelecom.account.sdk.a.d.a().a(authPageConfig);
        cn.com.chinatelecom.account.sdk.a.d.a().a(authViewConfig);
        cn.com.chinatelecom.account.sdk.a.a.a().a(resultListener);
        cn.com.chinatelecom.account.sdk.a.d.a().a(context);
    }

    public void openMiniAuthActivity(Context context, AuthPageConfig authPageConfig, AuthViewConfig authViewConfig, ResultListener resultListener) {
        String str = f9171a;
        a.a(str, "called openCenterMiniAuthActivity()");
        if (context == null || TextUtils.isEmpty(b.b()) || TextUtils.isEmpty(b.c())) {
            throw new IllegalArgumentException("Please call the init method");
        }
        if (!f9174d) {
            a.a(str, "Please call the requestPreLogin method");
            return;
        }
        if (authPageConfig == null) {
            a.a(str, "The authPageConfig is empty");
            return;
        }
        cn.com.chinatelecom.account.sdk.a.d.a().a(authPageConfig);
        cn.com.chinatelecom.account.sdk.a.d.a().a(authViewConfig);
        cn.com.chinatelecom.account.sdk.a.a.a().a(resultListener);
        cn.com.chinatelecom.account.sdk.a.d.a().b(context);
    }

    public void requestPreLogin(CtSetting ctSetting, final ResultListener resultListener) {
        f9174d = true;
        a.a().a(ctSetting, new c() { // from class: cn.com.chinatelecom.account.sdk.CtAuth.1
            @Override // cn.com.chinatelecom.account.api.c
            public void a(String str) {
                cn.com.chinatelecom.account.sdk.a.a.a().a(str, resultListener);
                try {
                    a.f8834c.sendBroadcast(new Intent("cn.com.chinatelecom.account.sdk.preAuth.Action"));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    public void setDomainName(String str, String str2, String str3) {
        a.a().a(str, str2, str3);
    }

    public void openAuthActivity(Context context, AuthPageConfig authPageConfig, ResultListener resultListener) {
        openAuthActivity(context, authPageConfig, null, resultListener);
    }

    public void openMiniAuthActivity(Context context, AuthPageConfig authPageConfig, ResultListener resultListener) {
        openMiniAuthActivity(context, authPageConfig, null, resultListener);
    }
}
