package com.mob.secverify.pure.core.ope.a.a;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends com.mob.secverify.pure.b.a {
    public static String a() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("ct_pre_key");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static long b() {
        return com.mob.secverify.pure.b.a.f40740a.getLong("ct_timestamp", 0L);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("ct_pre_key");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("ct_pre_key", str);
        }
    }

    public static void a(long j11) {
        if (j11 == 0) {
            com.mob.secverify.pure.b.a.f40740a.remove("ct_timestamp");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putLong("ct_timestamp", Long.valueOf(j11));
        }
    }
}
