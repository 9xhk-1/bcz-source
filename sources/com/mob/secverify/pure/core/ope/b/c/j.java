package com.mob.secverify.pure.core.ope.b.c;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j extends com.mob.secverify.pure.b.a {
    public static String a() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("ctc");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static String b() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("cu_cache_info");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("ctc");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("ctc", str);
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("cu_cache_info");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("cu_cache_info", str);
        }
    }
}
