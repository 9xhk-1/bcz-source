package com.igexin.push.config;

import android.os.Bundle;
import com.igexin.push.g.n;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37609a = "MetaDataConfig";

    private static void a() {
        try {
            Bundle bundle = n.b(com.igexin.push.core.e.f38035l).metaData;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    if ("PUSH_DOMAIN".equals(str)) {
                        com.igexin.c.a.c.a.b(f37609a, "PUSH_DOMAIN:" + bundle.getString(str));
                        String string = bundle.getString(str);
                        SDKUrlConfig.setXfrAddressIps(new String[]{"socket://xfr." + string + ":5224"});
                        StringBuilder sb2 = new StringBuilder("XFR_ADDRESS_IPS:");
                        sb2.append(SDKUrlConfig.getXfrAddress()[0]);
                        com.igexin.c.a.c.a.b(f37609a, sb2.toString());
                        SDKUrlConfig.XFR_ADDRESS_BAK = new String[]{"socket://xfr_bak." + string + ":5224"};
                        StringBuilder sb3 = new StringBuilder("XFR_ADDRESS_IPS_BAK:");
                        sb3.append(SDKUrlConfig.XFR_ADDRESS_BAK[0]);
                        com.igexin.c.a.c.a.a(sb3.toString(), new Object[0]);
                        SDKUrlConfig.BI_ADDRESS_IPS = new String[]{"https://bi." + string + "/api.php"};
                        StringBuilder sb4 = new StringBuilder("BI_ADDRESS_IPS:");
                        sb4.append(SDKUrlConfig.BI_ADDRESS_IPS[0]);
                        com.igexin.c.a.c.a.b(f37609a, sb4.toString());
                        SDKUrlConfig.CONFIG_ADDRESS_IPS = new String[]{"https://config." + string + "/api.php"};
                        StringBuilder sb5 = new StringBuilder("CONFIG_ADDRESS_IPS:");
                        sb5.append(SDKUrlConfig.CONFIG_ADDRESS_IPS[0]);
                        com.igexin.c.a.c.a.b(f37609a, sb5.toString());
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a(e11.toString(), new Object[0]);
        }
    }

    private static void a(String str) {
        SDKUrlConfig.setXfrAddressIps(new String[]{"socket://xfr." + str + ":5224"});
        StringBuilder sb2 = new StringBuilder("XFR_ADDRESS_IPS:");
        sb2.append(SDKUrlConfig.getXfrAddress()[0]);
        com.igexin.c.a.c.a.b(f37609a, sb2.toString());
        SDKUrlConfig.XFR_ADDRESS_BAK = new String[]{"socket://xfr_bak." + str + ":5224"};
        StringBuilder sb3 = new StringBuilder("XFR_ADDRESS_IPS_BAK:");
        sb3.append(SDKUrlConfig.XFR_ADDRESS_BAK[0]);
        com.igexin.c.a.c.a.a(sb3.toString(), new Object[0]);
        SDKUrlConfig.BI_ADDRESS_IPS = new String[]{"https://bi." + str + "/api.php"};
        StringBuilder sb4 = new StringBuilder("BI_ADDRESS_IPS:");
        sb4.append(SDKUrlConfig.BI_ADDRESS_IPS[0]);
        com.igexin.c.a.c.a.b(f37609a, sb4.toString());
        SDKUrlConfig.CONFIG_ADDRESS_IPS = new String[]{"https://config." + str + "/api.php"};
        StringBuilder sb5 = new StringBuilder("CONFIG_ADDRESS_IPS:");
        sb5.append(SDKUrlConfig.CONFIG_ADDRESS_IPS[0]);
        com.igexin.c.a.c.a.b(f37609a, sb5.toString());
    }
}
