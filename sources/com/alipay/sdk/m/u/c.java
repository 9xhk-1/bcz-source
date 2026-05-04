package com.alipay.sdk.m.u;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11050a = "00:00:00:00:00:00";

    /* renamed from: b, reason: collision with root package name */
    public static c f11051b;

    public c(Context context) {
    }

    public String a() {
        String str = b() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        String c11 = c();
        if (TextUtils.isEmpty(c11)) {
            return str + "000000000000000";
        }
        return str + c11;
    }

    public String b() {
        return "000000000000000";
    }

    public String c() {
        return "000000000000000";
    }

    public String d() {
        return f11050a;
    }

    public static c b(Context context) {
        if (f11051b == null) {
            f11051b = new c(context);
        }
        return f11051b;
    }

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static g d(Context context) {
        try {
            NetworkInfo a11 = com.alipay.sdk.m.w.b.a(null, context);
            return (a11 == null || a11.getType() != 0) ? (a11 == null || a11.getType() != 1) ? g.NONE : g.WIFI : g.a(a11.getSubtype());
        } catch (Exception unused) {
            return g.NONE;
        }
    }

    public static String a(Context context) {
        return b(context).a().substring(0, 8);
    }
}
