package cn.com.chinatelecom.account.sdk.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import cn.com.chinatelecom.account.sdk.AuthPageConfig;
import cn.com.chinatelecom.account.sdk.AuthViewConfig;
import cn.com.chinatelecom.account.sdk.ui.AuthActivity;
import cn.com.chinatelecom.account.sdk.ui.MiniAuthActivity;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static AuthPageConfig f9188a;

    /* renamed from: b, reason: collision with root package name */
    private static AuthViewConfig f9189b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f9190c;

    public static d a() {
        if (f9190c == null) {
            synchronized (d.class) {
                try {
                    if (f9190c == null) {
                        f9190c = new d();
                    }
                } finally {
                }
            }
        }
        return f9190c;
    }

    public static synchronized void f() {
        synchronized (d.class) {
            f9188a = null;
            f9189b = null;
        }
    }

    public AuthPageConfig b() {
        AuthPageConfig authPageConfig;
        synchronized (d.class) {
            authPageConfig = f9188a;
        }
        return authPageConfig;
    }

    public AuthViewConfig c() {
        AuthViewConfig authViewConfig;
        synchronized (d.class) {
            authViewConfig = f9189b;
        }
        return authViewConfig;
    }

    public void d() {
        AuthActivity a11 = AuthActivity.a();
        if (a11 != null) {
            a11.b();
            AuthPageConfig authPageConfig = f9188a;
            if (authPageConfig == null || !authPageConfig.D()) {
                return;
            }
            a11.overridePendingTransition(f9188a.G(), f9188a.H());
        }
    }

    public void e() {
        MiniAuthActivity a11 = MiniAuthActivity.a();
        if (a11 != null) {
            a11.b();
            AuthPageConfig authPageConfig = f9188a;
            if (authPageConfig == null || !authPageConfig.D()) {
                return;
            }
            a11.overridePendingTransition(f9188a.G(), f9188a.H());
        }
    }

    public void a(Context context) {
        if (cn.com.chinatelecom.account.api.b.a(context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "cn.com.chinatelecom.account.sdk.ui.AuthActivity");
        context.startActivity(intent);
        AuthPageConfig authPageConfig = f9188a;
        if (authPageConfig != null && authPageConfig.C() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(f9188a.E(), f9188a.F());
        }
    }

    public void b(Context context) {
        if (cn.com.chinatelecom.account.api.b.a(context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "cn.com.chinatelecom.account.sdk.ui.MiniAuthActivity");
        context.startActivity(intent);
        AuthPageConfig authPageConfig = f9188a;
        if (authPageConfig != null && authPageConfig.C() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(f9188a.E(), f9188a.F());
        }
    }

    public void a(AuthPageConfig authPageConfig) {
        synchronized (d.class) {
            f9188a = authPageConfig;
        }
    }

    public void a(AuthViewConfig authViewConfig) {
        synchronized (d.class) {
            f9189b = authViewConfig;
        }
    }
}
