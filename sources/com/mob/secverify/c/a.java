package com.mob.secverify.c;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.mob.MobSDK;
import com.mob.commons.SECVERIFY;
import com.mob.commons.authorize.DeviceAuthorizer;
import com.mob.secverify.SecPure;
import com.mob.secverify.a.j;
import com.mob.secverify.e.e;
import com.mob.secverify.e.g;
import com.mob.secverify.e.h;
import com.mob.tools.utils.DeviceHelper;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f40711a;

    /* renamed from: b, reason: collision with root package name */
    private DeviceHelper f40712b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.mob.secverify.c.a$a, reason: collision with other inner class name */
    public static class C0488a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f40713a = new a();
    }

    public static a a() {
        return C0488a.f40713a;
    }

    public HashMap<String, Object> b() {
        HashMap<String, Object> hashMap = new HashMap<>(16);
        try {
            hashMap.put(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
            hashMap.put("appVersion", this.f40712b.getAppVersionName());
            hashMap.put("plat", "1");
            hashMap.put(IntentConstant.SDK_VERSION, Integer.valueOf(SecPure.SDK_VERSION_CODE));
            hashMap.put(IntentConstant.APP_PACKAGE, this.f40712b.getPackageName());
            hashMap.put("duid", e());
            DeviceHelper deviceHelper = this.f40712b;
            hashMap.put("md5", deviceHelper.getSignMD5(deviceHelper.getPackageName()));
            return hashMap;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "ParamBuilder", "buildCommonParams", th2.getMessage());
            return hashMap;
        }
    }

    public String c() {
        String str;
        Throwable th2;
        try {
            String e11 = e();
            if (TextUtils.isEmpty(e11)) {
                return "";
            }
            String packageName = this.f40712b.getPackageName();
            String appkey = MobSDK.getAppkey();
            String signMD5 = this.f40712b.getSignMD5(packageName);
            String appVersionName = this.f40712b.getAppVersionName();
            if (appVersionName.contains("#")) {
                try {
                    appVersionName = appVersionName.replace("#", "_");
                } catch (Throwable th3) {
                    th2 = th3;
                    str = "";
                    com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "ParamBuilder", "getOriginToken", th2.getMessage());
                    return str;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a11 = !com.mob.secverify.pure.b.c.a().d().contains("imsi") ? com.mob.secverify.e.a.a() : "";
            String str2 = TextUtils.isEmpty(a11) ? "" : a11;
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "imsi cost time: " + (System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            String b11 = !com.mob.secverify.pure.b.c.a().d().contains("oaid") ? com.mob.secverify.e.c.a().b() : "";
            String str3 = TextUtils.isEmpty(b11) ? "" : b11;
            com.mob.secverify.b.c a12 = com.mob.secverify.b.c.a();
            StringBuilder sb2 = new StringBuilder();
            str = "";
            try {
                sb2.append("oaid cost time: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis2);
                a12.a("[SecPure] ==>%s", sb2.toString());
                long currentTimeMillis3 = System.currentTimeMillis();
                String deviceKey = !com.mob.secverify.pure.b.c.a().d().contains("deviceId") ? this.f40712b.getDeviceKey() : str;
                if (TextUtils.isEmpty(deviceKey)) {
                    deviceKey = str;
                }
                com.mob.secverify.b.c a13 = com.mob.secverify.b.c.a();
                StringBuilder sb3 = new StringBuilder();
                String str4 = deviceKey;
                sb3.append("deviceId cost time: ");
                sb3.append(System.currentTimeMillis() - currentTimeMillis3);
                a13.a("[SecPure] ==>%s", sb3.toString());
                long currentTimeMillis4 = System.currentTimeMillis();
                int i11 = SecPure.SDK_VERSION_CODE;
                long currentTimeMillis5 = System.currentTimeMillis();
                String c11 = h.c();
                com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "mnc cost time: " + (System.currentTimeMillis() - currentTimeMillis5));
                return String.format("%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001%s\u0001", appkey, e11, "1", packageName, appVersionName, Integer.valueOf(i11), "", signMD5, str4, Long.valueOf(currentTimeMillis4), str2, str3, "", "", c11, String.valueOf(g.f()), com.mob.secverify.pure.core.ope.a.f40831b);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "ParamBuilder", "getOriginToken", th2.getMessage());
                return str;
            }
        } catch (Throwable th5) {
            th = th5;
            str = "";
        }
    }

    public HashMap<String, Object> d() {
        HashMap<String, Object> hashMap = new HashMap<>(16);
        try {
            String packageName = this.f40712b.getPackageName();
            hashMap.put(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
            hashMap.put("appVersion", this.f40712b.getAppVersionName());
            hashMap.put("plat", "1");
            hashMap.put(IntentConstant.SDK_VERSION, Integer.valueOf(SecPure.SDK_VERSION_CODE));
            hashMap.put(IntentConstant.APP_PACKAGE, packageName);
            hashMap.put("old", Boolean.FALSE);
            hashMap.put("duid", 0);
            hashMap.put("md5", this.f40712b.getSignMD5(packageName));
            return hashMap;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "ParamBuilder", "buildInitParams", th2.getMessage());
            return hashMap;
        }
    }

    public String e() {
        if (TextUtils.isEmpty(this.f40711a)) {
            try {
                this.f40711a = DeviceAuthorizer.authorize(new SECVERIFY());
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "ParamBuilder", "getDUID lock Interrupted", th2.getMessage());
            }
        }
        return this.f40711a;
    }

    private a() {
        this.f40712b = DeviceHelper.getInstance(MobSDK.getContext());
    }

    public HashMap<String, Object> a(j jVar) {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            hashMap.put("serialId", jVar.b());
            hashMap.put("isFirstPre", Boolean.valueOf(jVar.a()));
            hashMap.put("type", jVar.d());
            hashMap.put("method", jVar.e());
            hashMap.put(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
            hashMap.put("plat", "1");
            hashMap.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, Locale.getDefault().toString().replace("-r", Constants.ACCEPT_TIME_SEPARATOR_SERVER));
            hashMap.put("model", deviceHelper.getModel());
            hashMap.put("deviceName", Build.BRAND);
            hashMap.put(NotificationCompat.CATEGORY_SYSTEM, String.valueOf(deviceHelper.getOSVersionInt()));
            hashMap.put("duid", e());
            hashMap.put("operator", TextUtils.isEmpty(com.mob.secverify.pure.core.ope.a.f40830a) ? "UNKNOWN" : com.mob.secverify.pure.core.ope.a.f40830a);
            hashMap.put("sdkver", SecPure.getVersion());
            hashMap.put(com.igexin.push.core.b.aC, deviceHelper.getPackageName());
            hashMap.put("md5", deviceHelper.getSignMD5(deviceHelper.getPackageName()));
            hashMap.put("time", Long.valueOf(jVar.j()));
            hashMap.put("sdkMode", "standard");
            hashMap.put("romVersion", deviceHelper.getMIUIVersion());
            hashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, Long.valueOf(jVar.k()));
            hashMap.put("stepTime", Long.valueOf(jVar.l()));
            hashMap.put("removeTelcom", Boolean.valueOf(jVar.n()));
            hashMap.put("isCache", Boolean.valueOf(jVar.m()));
            hashMap.put("appId", jVar.o());
            hashMap.put("isCdn", Boolean.valueOf(jVar.q()));
            boolean p11 = jVar.p();
            hashMap.put("isError", Boolean.valueOf(p11));
            if (p11) {
                hashMap.put("resCode", Integer.valueOf(jVar.f()));
                hashMap.put("resDesc", jVar.g());
                hashMap.put("innerCode", Integer.valueOf(jVar.h()));
                hashMap.put("innerDesc", jVar.i());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("oaid")) {
                String b11 = com.mob.secverify.e.c.a().b();
                if (TextUtils.isEmpty(b11)) {
                    b11 = "";
                }
                hashMap.put("oaid", b11);
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("imei")) {
                hashMap.put("imei", deviceHelper.getIMEI());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("imsi")) {
                hashMap.put("imsi", com.mob.secverify.e.a.a());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("iccid")) {
                hashMap.put("iccid", com.mob.secverify.e.a.b());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP)) {
                hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, h.f());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("deviceId")) {
                hashMap.put("deviceId", deviceHelper.getDeviceKey());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains(com.alipay.sdk.m.k.b.f10651k)) {
                hashMap.put(com.alipay.sdk.m.k.b.f10651k, e.a().b());
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("dbm")) {
                hashMap.put("dbm", Integer.valueOf(e.a().d()));
            }
            if (!com.mob.secverify.pure.b.c.a().d().contains("wifidbm")) {
                hashMap.put("wifidbm", e.a().c());
            }
            return hashMap;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "buildLogParams" + th2.getMessage());
            return hashMap;
        }
    }

    public HashMap<String, Object> a(String str) {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap = new HashMap<>(22);
        try {
            hashMap.put(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
            hashMap.put(IntentConstant.APP_SECRET, MobSDK.getAppSecret());
            hashMap.put("appVersion", deviceHelper.getAppVersionName());
            hashMap.put("duid", e());
            hashMap.put("plat", "1");
            hashMap.put(IntentConstant.SDK_VERSION, Integer.valueOf(SecPure.SDK_VERSION_CODE));
            hashMap.put(IntentConstant.APP_PACKAGE, deviceHelper.getPackageName());
            hashMap.put("operator", com.mob.secverify.pure.core.ope.a.f40830a);
            hashMap.put("phone", str);
            long currentTimeMillis = System.currentTimeMillis();
            if (!com.mob.secverify.pure.b.c.a().d().contains("oaid")) {
                String b11 = com.mob.secverify.e.c.a().b();
                if (TextUtils.isEmpty(b11)) {
                    b11 = "";
                }
                hashMap.put("oaid", b11);
            }
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "oaid cost time: " + (System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!com.mob.secverify.pure.b.c.a().d().contains("simserial")) {
                hashMap.put("simserial", deviceHelper.getSimSerialNumber());
            }
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "simserial cost time: " + (System.currentTimeMillis() - currentTimeMillis2));
            long currentTimeMillis3 = System.currentTimeMillis();
            if (!com.mob.secverify.pure.b.c.a().d().contains("imsi")) {
                hashMap.put("imsi", com.mob.secverify.e.a.a());
            }
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "imsi cost time: " + (System.currentTimeMillis() - currentTimeMillis3));
            long currentTimeMillis4 = System.currentTimeMillis();
            if (!com.mob.secverify.pure.b.c.a().d().contains("dbm")) {
                hashMap.put("dbm", Integer.valueOf(e.a().d()));
            }
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "dbm cost time: " + (System.currentTimeMillis() - currentTimeMillis4));
            long currentTimeMillis5 = System.currentTimeMillis();
            if (!com.mob.secverify.pure.b.c.a().d().contains("mnc")) {
                hashMap.put("mnc", h.c());
            }
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "mnc cost time: " + (System.currentTimeMillis() - currentTimeMillis5));
            return hashMap;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "ParamBuilder", "buildCacheParams", th2.getMessage());
            return hashMap;
        }
    }
}
