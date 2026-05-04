package com.igexin.push.config;

import android.os.Bundle;
import com.igexin.push.g.n;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f37541a;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f37541a == null) {
                    f37541a = new b();
                }
                bVar = f37541a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static boolean b() {
        try {
            Bundle bundle = n.b(com.igexin.push.core.e.f38035l).metaData;
            if (bundle == null) {
                return true;
            }
            for (String str : bundle.keySet()) {
                if ("PUSH_DOMAIN".equals(str)) {
                    com.igexin.c.a.c.a.b(h.f37609a, "PUSH_DOMAIN:" + bundle.getString(str));
                    String string = bundle.getString(str);
                    SDKUrlConfig.setXfrAddressIps(new String[]{"socket://xfr." + string + ":5224"});
                    StringBuilder sb2 = new StringBuilder("XFR_ADDRESS_IPS:");
                    sb2.append(SDKUrlConfig.getXfrAddress()[0]);
                    com.igexin.c.a.c.a.b(h.f37609a, sb2.toString());
                    SDKUrlConfig.XFR_ADDRESS_BAK = new String[]{"socket://xfr_bak." + string + ":5224"};
                    StringBuilder sb3 = new StringBuilder("XFR_ADDRESS_IPS_BAK:");
                    sb3.append(SDKUrlConfig.XFR_ADDRESS_BAK[0]);
                    com.igexin.c.a.c.a.a(sb3.toString(), new Object[0]);
                    SDKUrlConfig.BI_ADDRESS_IPS = new String[]{"https://bi." + string + "/api.php"};
                    StringBuilder sb4 = new StringBuilder("BI_ADDRESS_IPS:");
                    sb4.append(SDKUrlConfig.BI_ADDRESS_IPS[0]);
                    com.igexin.c.a.c.a.b(h.f37609a, sb4.toString());
                    SDKUrlConfig.CONFIG_ADDRESS_IPS = new String[]{"https://config." + string + "/api.php"};
                    StringBuilder sb5 = new StringBuilder("CONFIG_ADDRESS_IPS:");
                    sb5.append(SDKUrlConfig.CONFIG_ADDRESS_IPS[0]);
                    com.igexin.c.a.c.a.b(h.f37609a, sb5.toString());
                    return true;
                }
            }
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a(e11.toString(), new Object[0]);
            return true;
        }
    }

    private static String c() {
        return null;
    }

    private static int d() {
        return 0;
    }
}
