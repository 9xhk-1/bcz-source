package i9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes4.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f60407b = "KVHelperPerformance";

    /* renamed from: c, reason: collision with root package name */
    public static h f60408c;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f60409a;

    public static h f() {
        if (f60408c == null) {
            synchronized (h.class) {
                try {
                    if (f60408c == null) {
                        f60408c = new h();
                    }
                } finally {
                }
            }
        }
        return f60408c;
    }

    public boolean a(String key, boolean defaultValue) {
        return this.f60409a.getBoolean(key, defaultValue);
    }

    public int b(String key, int defaultValue) {
        return this.f60409a.getInt(key, defaultValue);
    }

    public long c(String key, long defaultValue) {
        return this.f60409a.getLong(key, defaultValue);
    }

    public String d(String key) {
        return this.f60409a.getString(key, "");
    }

    public void e(Context context, String process) {
        boolean isEmpty = TextUtils.isEmpty(process);
        String str = f60407b;
        if (!isEmpty) {
            str = f60407b + process;
        }
        this.f60409a = context.getSharedPreferences(str, 0);
    }

    public void g(String key, boolean value) {
        this.f60409a.edit().putBoolean(key, value).apply();
    }

    public void h(String key, int value) {
        this.f60409a.edit().putInt(key, value).apply();
    }

    public void i(String key, long value) {
        this.f60409a.edit().putLong(key, value).apply();
    }

    public void j(String key, String value) {
        this.f60409a.edit().putString(key, value).apply();
    }
}
