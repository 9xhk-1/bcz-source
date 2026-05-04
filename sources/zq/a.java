package zq;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f102822d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f102823e;

    /* renamed from: a, reason: collision with root package name */
    public String f102824a;

    /* renamed from: b, reason: collision with root package name */
    public long f102825b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f102826c;

    public a(Context context) {
        try {
            this.f102826c = context.createDeviceProtectedStorageContext().getSharedPreferences("MarketHomeCountry.DataStorage", 0);
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "getSharedPreference error");
        }
    }

    public static a a(Context context) {
        if (f102823e == null) {
            synchronized (f102822d) {
                try {
                    if (f102823e == null) {
                        f102823e = new a(context);
                    }
                } finally {
                }
            }
        }
        return f102823e;
    }

    public void b() {
        try {
            SharedPreferences.Editor edit = this.f102826c.edit();
            edit.clear();
            edit.commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "clear error");
        }
    }

    public void c(long j11) {
        try {
            this.f102826c.edit().putLong("effectiveduration", j11).commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "setEffectiveDuration, putLong error");
        }
    }

    public void d(String str) {
        try {
            this.f102826c.edit().putString("homeCountryInProvider", str).commit();
            this.f102826c.edit().putLong("providerUpdateTime", System.currentTimeMillis()).commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "setHomeCountryInProvider, putString error");
        }
    }

    public long e() {
        try {
            return this.f102826c.getLong("effectiveduration", 47839000L);
        } catch (Exception unused) {
            return 47839000L;
        }
    }

    public void f(String str) {
        this.f102824a = str;
        this.f102825b = str != null ? System.currentTimeMillis() : 0L;
    }

    public String g() {
        return this.f102826c.getString("homeCountryInProvider", null);
    }

    public long h() {
        try {
            return this.f102826c.getLong("providerUpdateTime", 0L);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String i() {
        return this.f102824a;
    }

    public long j() {
        return this.f102825b;
    }
}
