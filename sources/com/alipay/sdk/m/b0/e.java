package com.alipay.sdk.m.b0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {
    public static String a(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void a(Context context, String str, Map<String, String> map) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if (edit != null) {
            for (String str2 : map.keySet()) {
                edit.putString(str2, map.get(str2));
            }
            edit.commit();
        }
    }
}
