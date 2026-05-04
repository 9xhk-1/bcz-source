package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ApplySharedPref"})
/* loaded from: classes7.dex */
public class d {
    public static long a(Context context, String str, String str2, long j11) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j11;
        }
        SharedPreferences b11 = b(context, str);
        return b11 != null ? b11.getLong(str2, j11) : j11;
    }

    private static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String n11 = a1.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(n11)) {
            return "hms_" + str + "_" + packageName;
        }
        return "hms_" + str + "_" + packageName + "_" + n11;
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b11 = b(context, str);
        return b11 != null ? b11.getString(str2, str3) : str3;
    }

    public static void b(Context context, String str, String str2, long j11) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b11 = b(context, str);
        if (b11 != null) {
            SharedPreferences.Editor edit = b11.edit();
            edit.putLong(str2, j11);
            edit.commit();
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b11 = b(context, str);
        if (b11 != null) {
            SharedPreferences.Editor edit = b11.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static void a(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            v.f("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        if (strArr == null) {
            v.f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
            return;
        }
        SharedPreferences b11 = b(context, str);
        if (b11 != null) {
            SharedPreferences.Editor edit = b11.edit();
            if (strArr.length == 0) {
                edit.clear();
                edit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (b11.contains(str2)) {
                    edit.remove(str2);
                    edit.commit();
                }
            }
        }
    }
}
