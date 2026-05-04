package com.alipay.sdk.m.x;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final String f11162c = "v1";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11163d = "v2";

    /* renamed from: a, reason: collision with root package name */
    public Activity f11164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11165b;

    public c(Activity activity, String str) {
        super(activity);
        this.f11164a = activity;
        this.f11165b = str;
    }

    public abstract void a(String str);

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.f11164a.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    public abstract boolean b();

    public abstract void c();

    public boolean a() {
        return f11162c.equals(this.f11165b);
    }

    public static void a(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }
}
