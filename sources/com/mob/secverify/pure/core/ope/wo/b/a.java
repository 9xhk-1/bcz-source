package com.mob.secverify.pure.core.ope.wo.b;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static void a(Context context, String str) {
        a(context, "auth02", str);
    }

    public static String b(Context context, String str) {
        try {
            return context.getSharedPreferences("cu_auth", 0).getString(str, "");
        } catch (Exception unused) {
            a(context, str, "");
            return "";
        }
    }

    public static String a(Context context) {
        return b(context, "auth02");
    }

    public static void a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("cu_auth", 0).edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception unused) {
        }
    }
}
