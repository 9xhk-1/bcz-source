package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class c {
    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences(b(context), 0);
    }

    public static int b(Context context, String str, int i11) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getInt(str, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return i11;
    }

    public static void a(Context context, String str, int i11) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a(context).edit().putInt(str, i11).commit();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static long b(Context context, String str, long j11) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getLong(str, j11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return j11;
    }

    public static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a(context).edit().putString(str, str2).commit();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private static String b(Context context) {
        return "ct_account_api_sdk";
    }

    public static boolean a(Context context, String str, long j11) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return a(context).edit().putLong(str, j11).commit();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public static String b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return a(context).getString(str, str2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return str2;
    }
}
