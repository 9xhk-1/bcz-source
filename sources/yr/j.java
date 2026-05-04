package yr;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100289a = "aegis";

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f100290b;

    public static int a(String str, int i11, Context context) {
        return f(context).getInt(str, i11);
    }

    public static long b(String str, long j11, Context context) {
        return f(context).getLong(str, j11);
    }

    public static String c(String str, String str2, Context context) {
        return f(context).getString(str, str2);
    }

    public static void d(Context context) {
        f(context).edit().clear().apply();
    }

    public static void e(String str, Context context) {
        f(context).edit().remove(str).apply();
    }

    public static synchronized SharedPreferences f(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (j.class) {
            try {
                if (f100290b == null) {
                    f100290b = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
                }
                sharedPreferences = f100290b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    public static void g(String str, int i11, Context context) {
        f(context).edit().putInt(str, i11).apply();
    }

    public static void h(String str, long j11, Context context) {
        f(context).edit().putLong(str, j11).apply();
    }

    public static void i(String str, String str2, Context context) {
        f(context).edit().putString(str, str2).apply();
    }
}
