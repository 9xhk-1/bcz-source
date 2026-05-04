package com.mob.mgs.impl;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.utils.DeviceHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected static String f40599a;

    /* renamed from: b, reason: collision with root package name */
    private static NetCommunicator f40600b;

    static {
        try {
            f40599a = NetCommunicator.dynamicModifyUrl("api-gd.dutils.com");
        } catch (Throwable th2) {
            e.a().b(th2);
        }
    }

    public static <T> T a(List<HashMap<String, String>> list, String str, boolean z11) throws Throwable {
        HashMap<String, Object> a11 = a();
        a11.put("guardId", str);
        a11.put("targetAppInfoDtoList", list);
        a11.put("deviceSwitch", Integer.valueOf(z11 ? 1 : 0));
        e.a().a("[request][/v6/gd] request: " + a11);
        return (T) a("/v6/gd", a11);
    }

    private static synchronized NetCommunicator b() {
        NetCommunicator netCommunicator;
        synchronized (d.class) {
            try {
                if (f40600b == null) {
                    f40600b = new NetCommunicator(1024, "009cbd92ccef123be840deec0c6ed0547194c1e471d11b6f375e56038458fb18833e5bab2e1206b261495d7e2d1d9e5aa859e6d4b671a8ca5d78efede48e291a3f", "1dfd1d615cb891ce9a76f42d036af7fce5f8b8efaa11b2f42590ecc4ea4cff28f5f6b0726aeb76254ab5b02a58c1d5b486c39d9da1a58fa6ba2f22196493b3a4cbc283dcf749bf63679ee24d185de70c8dfe05605886c9b53e9f569082eabdf98c4fb0dcf07eb9bb3e647903489ff0b5d933bd004af5be4a1022fdda41f347f1");
                }
                netCommunicator = f40600b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return netCommunicator;
    }

    public static <T> T a(List<HashMap<String, Object>> list, String str, String str2) throws Throwable {
        HashMap<String, Object> a11 = a();
        a11.put("guardId", str);
        a11.put("workId", str2);
        a11.put("pkgList", list);
        e.a().a("[request][/v6/pu] request: " + a11);
        return (T) a("/v6/pu", a11);
    }

    public static <T> T a(String str, String str2, String str3, String str4, String str5, String str6, int i11) throws Throwable {
        HashMap<String, Object> a11 = a();
        a11.put("guardId", str5);
        a11.put("workId", str6);
        a11.put("pullDuid", str);
        a11.put("pullAppkey", str2);
        a11.put("pullPkg", str3);
        a11.put("pullGuardId", str4);
        a11.put("pullTime", Long.valueOf(System.currentTimeMillis()));
        a11.put("actType", Integer.valueOf(i11));
        e.a().a("[request][/v6/bpu] request: " + a11);
        return (T) a("/v6/bpu", a11);
    }

    public static <T> T a(String str, String str2, String str3) throws Throwable {
        HashMap<String, Object> a11 = a();
        a11.put("workId", str3);
        a11.put("oldGuardId", str);
        a11.put("newGuardId", str2);
        e.a().a("[request][guardId/uploadV5] request: " + a11);
        return (T) a("/guard/guardId/uploadV5", a11);
    }

    public static <T> T a(boolean z11, boolean z12) throws Throwable {
        HashMap<String, Object> a11 = a();
        a11.put("guardId", com.mob.mcl.b.a.a());
        if (z12) {
            if (!TextUtils.isEmpty(i.c())) {
                a11.put("duid", i.c());
            }
            if (!TextUtils.isEmpty(i.d())) {
                a11.put("guardId", i.d());
            }
        }
        a11.put("deviceSwitch", Integer.valueOf(z11 ? 1 : 0));
        e.a().a("[request][deviceSwitch/updateV5] request: " + a11);
        return (T) a("/v6/dsu", a11);
    }

    private static HashMap<String, Object> a() {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("versionTime", "2021.11.17 18:38");
        hashMap.put(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
        hashMap.put("appver", Integer.valueOf(deviceHelper.getAppVersion()));
        hashMap.put("platVersion", deviceHelper.getOSVersionName());
        hashMap.put("apppkg", MobSDK.getContext().getPackageName());
        hashMap.put("sdkver", 50000);
        hashMap.put("duid", f.a().f());
        hashMap.put("product", 1);
        hashMap.put("plat", 1);
        hashMap.put(Constants.PHONE_BRAND, DeviceHelper.getInstance(MobSDK.getContext()).getManufacturer());
        hashMap.put("model", DeviceHelper.getInstance(MobSDK.getContext()).getModel());
        hashMap.put("modelVersion", DeviceHelper.getInstance(MobSDK.getContext()).getOSVersionName());
        return hashMap;
    }

    private static <T> T a(String str, HashMap<String, Object> hashMap) throws Throwable {
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("versionTime", "2021.11.17 18:38");
        return (T) b().requestSynchronized(hashMap2, hashMap, f40599a + str, false);
    }
}
