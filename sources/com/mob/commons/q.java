package com.mob.commons;

import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class q {
    public static void a() {
        try {
            s.a(false);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public static void b() {
        s.a(true);
    }

    public static int c() {
        int d11 = s.d();
        if (d11 == 1) {
            return 1;
        }
        if (d11 == 0) {
            return -1;
        }
        return v.a().a(v.f40431h, n.f40395e) ? 0 : 2;
    }

    public static boolean d() {
        int c11 = c();
        if (c11 == 2 || c11 == 1) {
            return b.c();
        }
        return false;
    }

    public static boolean e() {
        int c11 = c();
        if (c11 != 2 && c11 != 1) {
            return true;
        }
        s.f();
        return !b.b();
    }

    public static HashMap<String, Object> f() {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(i.a("006Lfh*ggYfl(k-fk"), MobSDK.getAppkey());
        hashMap.put(i.a("006;fhSggg2flhh"), deviceHelper.getPackageName());
        hashMap.put(i.a("0068fhQgglkRfj"), deviceHelper.getAppVersionName());
        hashMap.put(i.a("004g+gffh3f"), String.valueOf(deviceHelper.getPlatformCode()));
        hashMap.put(i.a("011;fmRkf2hfgefjfl^f3fk6gk"), deviceHelper.getDetailNetworkTypeForStatic());
        String b11 = e.b();
        if (!TextUtils.isEmpty(b11)) {
            hashMap.put(i.a("004j(fefg;j"), b11);
        }
        return hashMap;
    }

    public static HashMap<String, Object> g() {
        Location location;
        HashMap<String, Object> hashMap = new HashMap<>();
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        hashMap.put(i.a("006Ofh$gg flUkZfk"), MobSDK.getAppkey());
        hashMap.put(i.a("0062hi7j5flVlk fj"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
        hashMap.put(i.a("004g5gffhOf"), 1);
        hashMap.put(i.a("004j>fefg-j"), e.a((MobProduct) null));
        hashMap.put(i.a("0064fh[ggg(flhh"), MobSDK.getContext().getPackageName());
        hashMap.put(i.a("006?fhNgglkOfj"), Integer.valueOf(deviceHelper.getAppVersion()));
        hashMap.put("iemt", deviceHelper.getIMEI());
        hashMap.put("snmt", deviceHelper.getSerialno());
        hashMap.put(i.a("007 fifhfjfjfg?kCfj"), deviceHelper.getCarrier());
        hashMap.put(i.a("005n=geXjkOgf"), deviceHelper.getModel());
        hashMap.put(i.a("007-hjfhfi*fGgefjfk"), deviceHelper.getManufacturer());
        hashMap.put(i.a("011]fm^kf(hfgefjflgkfk4gk"), deviceHelper.getNetworkType());
        hashMap.put(i.a("006FhifkhiJlkDfj"), deviceHelper.getOSVersionName());
        hashMap.put(i.a("005_fefg.lk5fj"), deviceHelper.getMIUIVersion());
        hashMap.put(i.a("0091hifkhiClk*fjfgfmFf"), Integer.valueOf(deviceHelper.getOSVersionInt()));
        if (1 == ((Integer) b.a(i.a("0028gegf"), 0)).intValue() && (location = deviceHelper.getLocation(0, 0, true)) != null) {
            hashMap.put("accmt", Float.valueOf(location.getAccuracy()));
            hashMap.put("ltdmt", Double.valueOf(location.getLatitude()));
            hashMap.put("lndmt", Double.valueOf(location.getLongitude()));
        }
        hashMap.put(i.a("010HfigffgAkFfmZfDgkfg nk"), Long.valueOf(System.currentTimeMillis()));
        hashMap.put(i.a("006IfhMggnj'jg"), deviceHelper.getSignMD5());
        hashMap.put("ismt", deviceHelper.getIMSI());
        hashMap.put(i.a("005Ihefjfhfm,j"), Build.BRAND);
        return hashMap;
    }
}
