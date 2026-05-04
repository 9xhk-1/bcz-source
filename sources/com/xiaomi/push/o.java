package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static volatile o f46189a;

    /* renamed from: a, reason: collision with other field name */
    private Context f853a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f854a = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with other field name */
    private Map<String, Map<String, String>> f855a = new HashMap();

    private o(Context context) {
        this.f853a = context;
    }

    private synchronized void b(String str, String str2, String str3) {
        try {
            if (this.f855a == null) {
                this.f855a = new HashMap();
            }
            Map<String, String> map = this.f855a.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.f855a.put(str, map);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static o a(Context context) {
        if (f46189a == null) {
            synchronized (o.class) {
                try {
                    if (f46189a == null) {
                        f46189a = new o(context);
                    }
                } finally {
                }
            }
        }
        return f46189a;
    }

    private synchronized String a(String str, String str2) {
        if (this.f855a != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Map<String, String> map = this.f855a.get(str);
                    if (map == null) {
                        return "";
                    }
                    return map.get(str2);
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return "";
    }

    public synchronized String a(String str, String str2, String str3) {
        String a11 = a(str, str2);
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        return this.f853a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m6182a(String str, String str2, String str3) {
        b(str, str2, str3);
        this.f854a.post(new p(this, str, str2, str3));
    }
}
