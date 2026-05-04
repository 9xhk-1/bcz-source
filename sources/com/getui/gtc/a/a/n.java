package com.getui.gtc.a.a;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static String f29735a = "dj1om0z0za9kwzxrphkqxsu9oc21tez1";

    /* renamed from: b, reason: collision with root package name */
    private static String f29736b = "PHLa/XQjrIl5cU/kj+C+Ig==";

    /* renamed from: c, reason: collision with root package name */
    private static String f29737c = a.a();

    public static String a() {
        try {
            if (TextUtils.isEmpty(f29737c)) {
                f29737c = a.a();
            }
            return c.a(m.a(a.a(f29737c.getBytes("UTF-8")), m.a(c.a("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC8UA4F9zfelx7qoRjTXEViE8WT60FBHJVl3T3/B+Nmljxiqa7H6GtOnmLFfpTVT+QdgBhxsU097DEBQhX8Z/9rVMp825T10jLefXly84/6p6B9Q0rNYX37zoWD5QT+5JWVgERX9P2o7fCXtlplLjv3dDXbzLdlWwdl53vtnAIidQIDAQAB".getBytes("UTF-8")))), 0);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return "";
        }
    }

    public static String a(String str) {
        try {
            if (TextUtils.isEmpty(f29737c)) {
                f29737c = a.a();
            }
            return a.a(f29737c.getBytes("UTF-8"), str.getBytes("UTF-8"), h.a(f29735a.getBytes("UTF-8")));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return null;
        }
    }
}
