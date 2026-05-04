package com.igexin.push.config;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class SDKUrlConfig {

    /* renamed from: b, reason: collision with root package name */
    private static String[] f37494b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f37495c = "HZ";

    /* renamed from: d, reason: collision with root package name */
    private static final String f37496d = "socket://sdk.open.talk.igexin.com:5224";

    /* renamed from: e, reason: collision with root package name */
    private static final String f37497e = "socket://sdk.open.talk.getui.net:5224";

    /* renamed from: f, reason: collision with root package name */
    private static final String f37498f = "socket://sdk.open.talk.gepush.com:5224";

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f37500h;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f37493a = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static String[] f37499g = {"socket://sdk.open.talk.igexin.com:5224", "socket://sdk.open.talk.getui.net:5224", "socket://sdk.open.talk.gepush.com:5224"};
    public static String[] XFR_ADDRESS_BAK = {com.igexin.push.a.f37301m};
    public static String[] BI_ADDRESS_IPS = {com.igexin.push.a.f37295g};
    public static String[] CONFIG_ADDRESS_IPS = {com.igexin.push.a.f37296h};
    public static String[] LOG_ADDRESS_IPS = {com.igexin.push.a.f37300l};

    public static String getBiUploadServiceUrl() {
        return BI_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getConfigServiceUrl() {
        return CONFIG_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getConnectAddress() {
        return f37500h == null ? f37499g[0] : f37500h;
    }

    public static List<String> getDefaultXfrList() {
        String[] xfrAddress = getXfrAddress();
        ArrayList arrayList = new ArrayList();
        for (String str : xfrAddress) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String[] getIdcConfigUrl() {
        return f37494b;
    }

    public static String getLocation() {
        return f37495c;
    }

    public static String getLogServiceUrl() {
        return LOG_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String[] getXfrAddress() {
        String[] strArr;
        synchronized (f37493a) {
            strArr = f37499g;
        }
        return strArr;
    }

    public static boolean hasMultipleXfr() {
        return getDefaultXfrList().size() > 1;
    }

    public static void setConnectAddress(String str) {
        com.igexin.c.a.c.a.a("set cm address : ".concat(String.valueOf(str)), new Object[0]);
        f37500h = str;
    }

    public static void setIdcConfigUrl(String[] strArr) {
        f37494b = strArr;
    }

    public static void setLocation(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.igexin.push.core.e.f38029f = str;
        f37495c = str;
    }

    public static void setXfrAddressIps(String[] strArr) {
        synchronized (f37493a) {
            f37499g = strArr;
        }
    }
}
