package com.mob.secverify.pure.core.ope.cm.d;

import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {
    public static String a() {
        return d();
    }

    public static String b() {
        return d();
    }

    public static String c() {
        return UUID.randomUUID().toString();
    }

    public static String d() {
        return c().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    public static String e() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
    }

    public static String f() {
        String str = "%" + d();
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "generate aid = " + str);
        i.a(str);
        return str;
    }
}
