package com.igexin.push.g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.media.MediaDrm;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.getui.gtc.api.GtcManager;
import com.getui.gtc.api.OnDycEnableChangedListener;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.DimManager;
import com.getui.gtc.dim.DimRequest;
import com.getui.gtc.dim.bean.GtWifiInfo;
import com.igexin.push.g.f;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38725a = "PhoneInfoUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final String f38726b = "";

    /* renamed from: c, reason: collision with root package name */
    static boolean f38727c = false;

    /* renamed from: d, reason: collision with root package name */
    private static volatile PackageInfo f38728d;

    /* renamed from: e, reason: collision with root package name */
    private static String f38729e;

    public static int a(Context context) {
        try {
            return c(context).applicationInfo.targetSdkVersion;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return 0;
        }
    }

    public static ApplicationInfo b(Context context) {
        try {
            return c(context).applicationInfo;
        } catch (PackageManager.NameNotFoundException e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    private static PackageInfo c(Context context) throws PackageManager.NameNotFoundException {
        if (f38728d != null) {
            com.igexin.c.a.c.a.b(f38725a, "getSelfPackageInfo cache");
            return f38728d;
        }
        synchronized (n.class) {
            try {
                if (f38728d == null) {
                    f38728d = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                    com.igexin.c.a.c.a.b(f38725a, "getSelfPackageInfo");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f38728d;
    }

    public static String d() {
        return Build.BRAND;
    }

    public static String e() {
        return Build.MODEL;
    }

    public static String f() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38642f).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    public static String g() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38638b).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    public static String h() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38653q).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    public static String i() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38654r).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    public static List<ScanResult> j() {
        try {
            return (List) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.G).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    public static String k() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return "";
        }
    }

    public static boolean l() {
        try {
            if (!com.igexin.push.config.d.G.contains("*")) {
                return Arrays.asList(com.igexin.push.config.d.G.toUpperCase().split(",")).contains(Build.BRAND.toUpperCase());
            }
            com.igexin.c.a.c.a.a("PhoneInfoUtils|delAlarm all", new Object[0]);
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a("PhoneInfoUtils|delAlarm " + com.igexin.push.config.d.G + " err " + e11.toString(), new Object[0]);
            return false;
        }
    }

    public static String m() {
        String str;
        try {
            str = (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38648l).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            str = null;
        }
        if (!TextUtils.isEmpty(str) && !str.equals(com.igexin.push.core.e.f38031h)) {
            com.igexin.push.core.e.f38031h = str;
        }
        return str;
    }

    public static String n() {
        try {
            return c(com.igexin.push.core.e.f38035l).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    public static long o() {
        try {
            return c(com.igexin.push.core.e.f38035l).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            com.igexin.c.a.c.a.a(e11);
            return 0L;
        }
    }

    public static String p() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.H).caller(Caller.PUSH).build());
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a("PhoneInfoUtils|".concat(String.valueOf(th2)), new Object[0]);
            return "";
        }
    }

    public static String q() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray("deviceUniqueId");
            if (propertyByteArray == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : propertyByteArray) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Error | Exception unused) {
            return "";
        }
    }

    public static Location r() {
        try {
            return (Location) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.B).caller(Caller.PUSH).build());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Location s() {
        try {
            return (Location) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.C).caller(Caller.PUSH).build());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String t() {
        try {
            Context context = com.igexin.push.core.e.f38035l;
            if (CommonUtil.hasPermission(context, "android.permission.READ_PHONE_STATE", false)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (telephonyManager != null ? telephonyManager.getDataNetworkType() : 0) {
                }
            }
            return "";
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return "";
        }
    }

    public static void u() {
        if (d.b("3.2.16.0")) {
            return;
        }
        GtcManager.getInstance().addOnDycEnableChangedListener(com.igexin.push.core.e.f38035l, new OnDycEnableChangedListener.Stub() { // from class: com.igexin.push.g.n.1
            @Override // com.getui.gtc.api.OnDycEnableChangedListener
            public final void onDycEnableChanged(final Map map) throws RemoteException {
                if (map == null || n.f38727c) {
                    return;
                }
                n.f38727c = true;
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.d() { // from class: com.igexin.push.g.n.1.1
                    @Override // com.igexin.push.f.d
                    public final void b() {
                        try {
                            Iterator it = map.keySet().iterator();
                            while (it.hasNext()) {
                                com.igexin.c.a.c.a.b(n.f38725a, String.valueOf(it.next()));
                            }
                            Object obj = map.get(f.a.f38648l);
                            Boolean bool = Boolean.TRUE;
                            if (Objects.equals(obj, bool)) {
                                if (com.igexin.push.core.e.f38044u) {
                                    com.igexin.push.core.a.b.d().i();
                                } else {
                                    com.igexin.push.core.e.aM = true;
                                }
                            }
                            if (Objects.equals(map.get(f.a.O), bool)) {
                                com.igexin.push.core.c.a.a().a(false);
                            }
                        } catch (Throwable th2) {
                            com.igexin.c.a.c.a.a(th2);
                        }
                    }
                }, false, true);
            }
        });
    }

    private static String v() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38641e).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    private static String w() {
        String str;
        if (!TextUtils.isEmpty(f38729e)) {
            return f38729e;
        }
        try {
            str = Build.BRAND;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.toLowerCase();
        HashMap hashMap = new HashMap();
        hashMap.put("huawei", com.alipay.sdk.m.c.a.f10484a);
        hashMap.put("blackshark", "ro.build.version.incremental");
        hashMap.put("redmi", "ro.build.version.incremental");
        hashMap.put("xiaomi", "ro.build.version.incremental");
        hashMap.put("samsang", "ro.build.version.incremental");
        hashMap.put("vivo", "ro.vivo.os.version");
        hashMap.put("oppo", "ro.build.version.opporom");
        hashMap.put("meizu", "ro.build.display.id");
        hashMap.put("lenovo", "ro.build.version.incremental");
        hashMap.put("smartisan", "ro.modversion");
        hashMap.put("htc", "ro.build.sense.version");
        hashMap.put("oneplus", "ro.rom.version");
        hashMap.put("yunos", "ro.cta.yunos.version");
        hashMap.put("360", "ro.build.uiversion");
        hashMap.put("nubia", "ro.build.rom.internal.id");
        if (hashMap.containsKey(lowerCase)) {
            String a11 = a((String) hashMap.get(lowerCase), "");
            f38729e = a11;
            return a11;
        }
        return "";
    }

    private static boolean x() {
        return Build.VERSION.SDK_INT > 28;
    }

    private static String y() {
        return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38657u).caller(Caller.PUSH).build());
    }

    private static String z() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.J).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    private static String a(String str, String str2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()));
            String str3 = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return str3;
                }
                str3 = str3 + readLine;
            }
        } catch (Exception unused) {
            return str2;
        }
    }

    public static Pair<String, String> b() {
        String ssid;
        String bssid;
        Pair<String, String> pair = null;
        try {
            if (!com.igexin.push.config.d.X || d.b("3.1.12.0")) {
                com.igexin.c.a.c.a.b(f38725a, "use wf");
                WifiInfo wifiInfo = (WifiInfo) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.F).caller(Caller.PUSH).build());
                if (wifiInfo == null) {
                    return null;
                }
                ssid = wifiInfo.getSSID();
                bssid = wifiInfo.getBSSID();
            } else {
                com.igexin.c.a.c.a.b(f38725a, "use gt wf");
                GtWifiInfo parseJson = GtWifiInfo.parseJson((String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.I).caller(Caller.PUSH).build()));
                if (parseJson == null) {
                    return null;
                }
                ssid = parseJson.getSSID();
                bssid = parseJson.getBSSID();
            }
            pair = Pair.create(ssid, bssid);
            return pair;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return pair;
        }
    }

    public static String c() {
        try {
            return (String) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.f38646j).caller(Caller.PUSH).build());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return "";
        }
    }

    public static List<PackageInfo> a() {
        List<PackageInfo> list;
        try {
            list = (List) DimManager.getInstance().get(new DimRequest.Builder().key(f.a.O).caller(Caller.PUSH).build());
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            list = null;
        }
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
