package com.mob.commons;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.mgs.MobMGS;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f40420a = {"SHARESDK", com.mob.commons.a.l.a("006Hfihififigjik"), "MOBLINK", "MOBPUSH", com.mob.commons.a.l.a("0092fihdhghfhdhefhiejj"), com.mob.commons.a.l.a("008)higlgkfkgjfigjik"), MobMGS.MGS_TAG};

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f40421b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, MobProduct> f40422c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static String f40423d;

    public static void a() {
        f();
        t.f40414c.execute(new com.mob.tools.utils.d() { // from class: com.mob.commons.u.1
            @Override // com.mob.tools.utils.d
            public void a() {
                MobLog.getInstance().d("init sks start", new Object[0]);
                u.b();
                MobLog.getInstance().d("init sks over", new Object[0]);
            }
        });
    }

    public static synchronized ArrayList<MobProduct> b() {
        ArrayList<MobProduct> arrayList;
        synchronized (u.class) {
            try {
                if (f40421b.compareAndSet(false, true)) {
                    f40422c.putAll(g());
                }
                arrayList = new ArrayList<>();
                arrayList.addAll(f40422c.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public static synchronized String c() {
        String a11;
        synchronized (u.class) {
            a11 = a(b(), 0);
        }
        return a11;
    }

    public static synchronized String d() {
        String a11;
        synchronized (u.class) {
            a11 = a(b(), 1);
        }
        return a11;
    }

    public static synchronized String e() {
        String a11;
        synchronized (u.class) {
            a11 = a(b(), 2);
        }
        return a11;
    }

    private static void f() {
        try {
            MOBLINK moblink = new MOBLINK();
            if (moblink instanceof MobProduct) {
                moblink.getProductTag();
            }
        } catch (Throwable unused) {
        }
    }

    private static HashMap<String, MobProduct> g() {
        HashMap<String, MobProduct> hashMap = new HashMap<>();
        for (Object obj : p.f40403a) {
            try {
                Class<?> cls = obj instanceof String ? Class.forName(String.valueOf(obj).trim()) : (Class) obj;
                if (!MobProduct.class.isAssignableFrom(cls) || MobProduct.class.equals(cls)) {
                    cls.newInstance();
                } else {
                    MobProduct mobProduct = (MobProduct) cls.newInstance();
                    String productTag = mobProduct.getProductTag();
                    String[] strArr = f40420a;
                    int length = strArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            String str = strArr[i11];
                            if (str.equals(productTag)) {
                                hashMap.put(str, mobProduct);
                                break;
                            }
                            i11++;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    private static String h() {
        if (!TextUtils.isEmpty(f40423d)) {
            return f40423d;
        }
        String g11 = com.mob.tools.a.b.a(MobSDK.getContext()).g();
        if (!"-1".equals(g11) && !TextUtils.isEmpty(g11)) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(Data.MD5(DeviceHelper.getInstance(MobSDK.getContext()).getManufacturer()), g11), 2);
                f40423d = encodeToString;
                return encodeToString;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return null;
    }

    public static synchronized void a(MobProduct mobProduct) {
        synchronized (u.class) {
            if (mobProduct != null) {
                HashMap<String, MobProduct> hashMap = f40422c;
                if (!hashMap.containsKey(mobProduct.getProductTag())) {
                    hashMap.put(mobProduct.getProductTag(), mobProduct);
                }
            }
        }
    }

    private static synchronized String a(ArrayList<MobProduct> arrayList, int i11) {
        String deviceKey;
        String str;
        DeviceHelper deviceHelper;
        synchronized (u.class) {
            try {
                DeviceHelper deviceHelper2 = DeviceHelper.getInstance(MobSDK.getContext());
                String encode = TextUtils.isEmpty(deviceHelper2.getPackageName()) ? "" : URLEncoder.encode(deviceHelper2.getPackageName(), "utf-8");
                String encode2 = TextUtils.isEmpty(deviceHelper2.getAppVersionName()) ? "" : URLEncoder.encode(deviceHelper2.getAppVersionName(), "utf-8");
                String encode3 = TextUtils.isEmpty(deviceHelper2.getManufacturer()) ? "" : URLEncoder.encode(deviceHelper2.getManufacturer(), "utf-8");
                String encode4 = TextUtils.isEmpty(deviceHelper2.getModel()) ? "" : URLEncoder.encode(deviceHelper2.getModel(), "utf-8");
                String encode5 = TextUtils.isEmpty(deviceHelper2.getMIUIVersion()) ? "" : URLEncoder.encode(deviceHelper2.getMIUIVersion(), "utf-8");
                String encode6 = TextUtils.isEmpty(deviceHelper2.getOSVersionName()) ? "" : URLEncoder.encode(deviceHelper2.getOSVersionName(), "utf-8");
                HashMap<String, Object> b11 = o.a().b();
                String str2 = com.mob.commons.a.l.a("004AfkhhhhNh") + encode + com.alipay.sdk.m.u.i.f11097b + encode2;
                String str3 = com.mob.commons.a.l.a("012Ifijjfi+hEfkel5iIeifdefHi=ke") + deviceHelper2.getOSVersionInt() + com.alipay.sdk.m.u.i.f11097b + encode6;
                if (s.b()) {
                    deviceKey = deviceHelper2.getDeviceKey();
                } else {
                    deviceKey = deviceHelper2.getDeviceKey(true);
                }
                String str4 = com.mob.commons.a.l.a("004_figjfhLh") + deviceKey;
                String str5 = com.mob.commons.a.l.a("003Ziehi.h") + encode3 + com.alipay.sdk.m.u.i.f11097b + encode4;
                if (!TextUtils.isEmpty(encode5)) {
                    str5 = str5 + com.alipay.sdk.m.u.i.f11097b + encode5;
                }
                String str6 = com.mob.commons.a.l.a("003*fghd4h") + deviceHelper2.getNetworkTypeForStatic() + com.alipay.sdk.m.u.i.f11097b + deviceHelper2.getCarrier();
                String str7 = com.mob.commons.a.l.a("0058flegelggWh") + Locale.getDefault().toString().replace(com.mob.commons.a.l.a("0023ijei"), Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                String str8 = com.mob.commons.a.l.a("004QhgflhfAh") + MobSDK.SDK_VERSION_CODE;
                String a11 = com.mob.commons.a.l.a("004!figjikIh");
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        try {
                            MobProduct mobProduct = arrayList.get(i12);
                            if (i12 != 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(a11);
                                deviceHelper = deviceHelper2;
                                try {
                                    sb2.append(",");
                                    a11 = sb2.toString();
                                } catch (Throwable unused) {
                                }
                            } else {
                                deviceHelper = deviceHelper2;
                            }
                            a11 = a11 + mobProduct.getProductTag() + com.alipay.sdk.m.u.i.f11097b + mobProduct.getSdkver() + com.alipay.sdk.m.u.i.f11097b + b11.get(mobProduct.getProductTag());
                        } catch (Throwable unused2) {
                            deviceHelper = deviceHelper2;
                        }
                        i12++;
                        deviceHelper2 = deviceHelper;
                    }
                }
                DeviceHelper deviceHelper3 = deviceHelper2;
                String str9 = "DC/2";
                if (i11 == 1) {
                    str9 = "DC/[DC]";
                } else if (i11 == 2) {
                    str9 = "DC/[DC2]";
                }
                String str10 = "";
                String timezone = deviceHelper3.getTimezone();
                if (!TextUtils.isEmpty(timezone)) {
                    str10 = com.mob.commons.a.l.a("003*fjleee") + timezone;
                }
                String c11 = w.a().c();
                String str11 = "TID/";
                if (!TextUtils.isEmpty(c11)) {
                    str11 = "TID/" + c11;
                }
                String str12 = "IED/";
                String h11 = h();
                if (!TextUtils.isEmpty(h11)) {
                    str12 = "IED/" + h11;
                }
                str = str2 + " " + str3 + " " + str4 + " " + str5 + " " + str6 + " " + str7 + " " + str8 + " " + a11 + " " + str9 + " " + str10 + " " + str11 + " " + str12 + " " + ("SVM/" + com.mob.commons.cc.b.a());
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return "";
            }
        }
        return str;
    }
}
