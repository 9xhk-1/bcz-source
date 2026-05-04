package com.mob.secverify.pure.core.ope.cm.d;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {
    public static String a() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
    }

    public static String b() {
        return a(new Date());
    }

    private static String a(Date date) {
        return a("yyyyMMdd", date);
    }

    private static String a(String str, Date date) {
        if (date == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return new SimpleDateFormat(str).format(date);
    }

    public static String a(long j11) {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(j11));
    }
}
