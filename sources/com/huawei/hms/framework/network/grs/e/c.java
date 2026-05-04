package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f35649b = "c";

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, PLSharedPreferences> f35650c = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f35651a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(f35649b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = f35650c;
        if (map.containsKey(str + packageName)) {
            this.f35651a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, str + packageName);
            this.f35651a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        a(context);
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f35651a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f35651a.getString(str, str2);
        }
        return string;
    }

    public void b() {
        PLSharedPreferences pLSharedPreferences = this.f35651a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f35651a.clear();
        }
    }

    public Map<String, ?> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f35651a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f35651a.getAll();
        }
        return all;
    }

    public void b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f35651a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f35651a.putString(str, str2);
        }
    }

    private void a(Context context) {
        String str = f35649b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String l11 = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String a11 = a("version", "");
            if (l11.equals(a11)) {
                return;
            }
            Logger.i(str, "app version changed! old version{%s} and new version{%s}", a11, l11);
            b();
            b("version", l11);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w(f35649b, "get app version failed and catch NameNotFoundException");
        }
    }

    public void a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f35651a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f35651a.remove(str);
        }
    }
}
