package com.getui.gtc.dim.c;

import android.content.Context;
import android.location.Location;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.getui.gtc.dim.DimRequest;
import com.getui.gtc.dim.a;
import com.getui.gtc.dim.bean.GtLocation;
import com.getui.gtc.dim.bean.GtWifiInfo;
import com.huawei.hms.android.SystemUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f29928a = new HashMap<String, String>() { // from class: com.getui.gtc.dim.c.b.1
        {
            put("dim-2-1-18-4", "dim-2-1-18-1");
            put("dim-2-1-18-3", "dim-2-1-18-4");
            put("dim-2-1-17-3", "dim-2-1-17-1");
            put("dim-2-1-17-4", "dim-2-1-17-2");
            put("dim-2-1-5-2", "dim-2-1-5-1");
        }
    };

    public static Object a(DimRequest dimRequest) {
        return !SystemUtils.PRODUCT_HONOR.equals(d.f29932d) ? "" : b(dimRequest);
    }

    private static Object b(DimRequest dimRequest) {
        com.getui.gtc.dim.a aVar;
        String str = f29928a.get(dimRequest.getKey());
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        DimRequest build = new DimRequest.Builder(dimRequest).key(str).build();
        aVar = a.C0350a.f29855a;
        return aVar.a(build, false);
    }

    public static String a(Context context, DimRequest dimRequest) {
        try {
            GtWifiInfo parseJson = GtWifiInfo.parseJson((String) b(dimRequest));
            return a.b(context, parseJson != null ? parseJson.getSSID() : "");
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
            return null;
        }
    }

    public static String b(DimRequest dimRequest, int i11) {
        GtLocation gtLocation;
        String str = null;
        try {
            com.getui.gtc.dim.e.b.a("get " + dimRequest.getKey() + " policy:" + i11);
            Location location = (Location) b(dimRequest);
            if (location == null) {
                return null;
            }
            if (i11 == 0) {
                gtLocation = new GtLocation(location);
            } else {
                if (i11 == 1) {
                    return c.a(location);
                }
                try {
                    str = c.a(location);
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                    gtLocation = new GtLocation(location);
                } catch (Throwable th2) {
                    if (TextUtils.isEmpty(null)) {
                        new GtLocation(location).toJsonString();
                    }
                    throw th2;
                }
            }
            return gtLocation.toJsonString();
        } catch (Throwable th3) {
            com.getui.gtc.dim.e.b.b(th3);
            return str;
        }
    }

    public static String a(DimRequest dimRequest, int i11) {
        GtWifiInfo gtWifiInfo;
        String str = null;
        try {
            com.getui.gtc.dim.e.b.a("get " + dimRequest.getKey() + " policy:" + i11);
            WifiInfo wifiInfo = (WifiInfo) b(dimRequest);
            if (wifiInfo == null) {
                return null;
            }
            if (i11 == 0) {
                gtWifiInfo = new GtWifiInfo(wifiInfo);
            } else {
                if (i11 == 1) {
                    return e.a(wifiInfo);
                }
                try {
                    str = e.a(wifiInfo);
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                    gtWifiInfo = new GtWifiInfo(wifiInfo);
                } catch (Throwable th2) {
                    if (TextUtils.isEmpty(null)) {
                        new GtWifiInfo(wifiInfo).toJsonString();
                    }
                    throw th2;
                }
            }
            return gtWifiInfo.toJsonString();
        } catch (Throwable th3) {
            com.getui.gtc.dim.e.b.b(th3);
            return str;
        }
    }
}
