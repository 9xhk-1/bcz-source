package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static v f46406a;

    /* renamed from: a, reason: collision with other field name */
    private Context f1037a;

    /* renamed from: a, reason: collision with other field name */
    private List<String> f1038a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f46407b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f46408c = new ArrayList();

    private v(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1037a = applicationContext;
        if (applicationContext == null) {
            this.f1037a = context;
        }
        SharedPreferences sharedPreferences = this.f1037a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.f1038a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                this.f46407b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!TextUtils.isEmpty(str3)) {
                this.f46408c.add(str3);
            }
        }
    }

    public static v a(Context context) {
        if (f46406a == null) {
            f46406a = new v(context);
        }
        return f46406a;
    }

    public void b(String str) {
        synchronized (this.f46407b) {
            try {
                if (!this.f46407b.contains(str)) {
                    this.f46407b.add(str);
                    this.f1037a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bo.a(this.f46407b, ",")).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(String str) {
        synchronized (this.f46408c) {
            try {
                if (!this.f46408c.contains(str)) {
                    this.f46408c.add(str);
                    this.f1037a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bo.a(this.f46408c, ",")).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(String str) {
        synchronized (this.f1038a) {
            try {
                if (this.f1038a.contains(str)) {
                    this.f1038a.remove(str);
                    this.f1037a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bo.a(this.f1038a, ",")).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(String str) {
        synchronized (this.f46407b) {
            try {
                if (this.f46407b.contains(str)) {
                    this.f46407b.remove(str);
                    this.f1037a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bo.a(this.f46407b, ",")).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(String str) {
        synchronized (this.f46408c) {
            try {
                if (this.f46408c.contains(str)) {
                    this.f46408c.remove(str);
                    this.f1037a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bo.a(this.f46408c, ",")).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str) {
        synchronized (this.f1038a) {
            try {
                if (!this.f1038a.contains(str)) {
                    this.f1038a.add(str);
                    this.f1037a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bo.a(this.f1038a, ",")).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6302b(String str) {
        boolean contains;
        synchronized (this.f46407b) {
            contains = this.f46407b.contains(str);
        }
        return contains;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6303c(String str) {
        boolean contains;
        synchronized (this.f46408c) {
            contains = this.f46408c.contains(str);
        }
        return contains;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6301a(String str) {
        boolean contains;
        synchronized (this.f1038a) {
            contains = this.f1038a.contains(str);
        }
        return contains;
    }
}
