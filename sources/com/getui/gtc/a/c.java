package com.getui.gtc.a;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.NetworkUtil;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.DimManager;
import com.getui.gtc.dim.DimRequest;
import com.getui.gtc.e.c;
import com.heytap.mcssdk.constant.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class c implements b {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f29742e = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public long f29743a;

    /* renamed from: b, reason: collision with root package name */
    public long f29744b;

    /* renamed from: c, reason: collision with root package name */
    private String f29745c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29746d = false;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f29747f = new AtomicBoolean(false);

    private c() {
        this.f29743a = 300000L;
        this.f29744b = 5000L;
        Map<String, String> a11 = com.getui.gtc.f.c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, (com.getui.gtc.f.e) null);
        if (a11 == null || a11.size() <= 0) {
            return;
        }
        try {
            String str = a11.get("sdk.gtc.type256.interval");
            if (str != null) {
                this.f29743a = Long.parseLong(str) * 1000;
            }
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.b(e11);
        }
        try {
            String str2 = a11.get("sdk.gtc.type256.delay");
            if (str2 != null) {
                this.f29744b = Long.parseLong(str2) * 1000;
            }
        } catch (Exception e12) {
            com.getui.gtc.i.c.a.b(e12);
        }
    }

    private static Object a(String str) {
        return DimManager.getInstance().get(new DimRequest.Builder().skipCache(true).key(str).caller(Caller.UNKNOWN).build());
    }

    private static NetworkInfo b(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    private void c() {
        com.getui.gtc.e.c cVar;
        JSONArray jSONArray;
        com.getui.gtc.e.c cVar2;
        com.getui.gtc.e.c cVar3;
        com.getui.gtc.e.c cVar4;
        try {
            cVar = c.a.f30027a;
            String str = cVar.f30024a.f30029b;
            try {
                jSONArray = !TextUtils.isEmpty(str) ? new JSONArray(str) : new JSONArray();
            } catch (Throwable unused) {
                jSONArray = new JSONArray();
            }
            if (jSONArray.length() < 100) {
                jSONArray.put(this.f29745c);
            }
            cVar2 = c.a.f30027a;
            cVar2.f30024a.e(jSONArray.toString());
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                com.getui.gtc.h.a.a(jSONArray.getString(i11), 256);
            }
            cVar3 = c.a.f30027a;
            com.getui.gtc.e.d dVar = cVar3.f30024a;
            long currentTimeMillis = System.currentTimeMillis();
            if (dVar.a(19, currentTimeMillis)) {
                dVar.f30040m = currentTimeMillis;
            }
            cVar4 = c.a.f30027a;
            cVar4.f30024a.e("");
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.c("type 256 report error: " + e11.toString());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j11;
        float f11;
        String str;
        com.getui.gtc.e.c cVar;
        try {
            if (!this.f29747f.getAndSet(true)) {
                try {
                    String str2 = com.getui.gtc.f.c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, (com.getui.gtc.f.e) null).get("sdk.gtc.type256.enable");
                    if (str2 != null) {
                        this.f29746d = Boolean.parseBoolean(str2);
                    }
                } catch (Exception e11) {
                    com.getui.gtc.i.c.a.b(e11);
                }
                long currentTimeMillis = System.currentTimeMillis();
                cVar = c.a.f30027a;
                if (currentTimeMillis - cVar.f30024a.f30040m < this.f29743a) {
                    com.getui.gtc.i.c.a.c("type 256 collect time not expired");
                    return;
                }
            }
            if (!this.f29746d) {
                str = "type 256 is not enabled";
            } else {
                if (!CommonUtil.isAppDebugEnable()) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                    Location location = (Location) a("dim-2-1-17-1");
                    if (location == null) {
                        location = (Location) a("dim-2-1-17-2");
                    }
                    if (location != null) {
                        j11 = location.getTime();
                        f11 = location.getAccuracy();
                    } else {
                        j11 = 0;
                        f11 = 0.0f;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (location == null) {
                        sb2.append("none");
                        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb2.append("0");
                        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb2.append("0");
                        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb2.append("0");
                    } else {
                        sb2.append(location.getProvider());
                        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb2.append(location.getLongitude());
                        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb2.append(location.getLatitude());
                        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb2.append(location.getAltitude());
                    }
                    String sb3 = sb2.toString();
                    Pair<String, String> b11 = b();
                    String a11 = a((List<ScanResult>) a("dim-2-1-18-2"));
                    String a12 = a(GtcProvider.context());
                    String str3 = (String) a("dim-2-1-18-3");
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = simpleDateFormat.format(new Date()) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.getui.gtc.c.b.f29827d + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.getui.gtc.c.b.f29824a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + sb3 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ((String) b11.first) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + f11 + "||ANDROID|" + a12 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ((String) b11.second) + "||";
                    this.f29745c = str4;
                    com.getui.gtc.i.c.a.a(str4);
                    c();
                    return;
                }
                str = "type 256 is debug, disallow";
            }
            com.getui.gtc.i.c.a.b(str);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.a("type 256", th2);
        }
    }

    private static String a(Context context) {
        StringBuilder sb2;
        String str;
        try {
            if (!NetworkUtil.isNetWorkAvailable(context)) {
                com.getui.gtc.i.c.a.a("Iv6 network not connected.");
                return "no network|-1";
            }
            NetworkInfo b11 = b(context);
            boolean z11 = false;
            boolean z12 = b11 != null && b11.getType() == 0;
            if (b11 != null && b11.getType() == 1) {
                z11 = true;
            }
            String str2 = (String) a("dim-2-1-16-2");
            if (str2 == null) {
                str2 = "";
            }
            if (z12) {
                com.getui.gtc.i.c.a.a("Phone Iv6 List = ".concat(str2));
                sb2 = new StringBuilder();
                sb2.append(str2);
                str = "|1";
            } else {
                if (!z11) {
                    return "error|-1";
                }
                com.getui.gtc.i.c.a.a("Wifi Iv6 List = ".concat(str2));
                sb2 = new StringBuilder();
                sb2.append(str2);
                str = "|2";
            }
            sb2.append(str);
            return sb2.toString();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return "error|-1";
        }
    }

    private static Pair<String, String> b() {
        try {
            String str = (String) a("dim-2-1-19-2");
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                if (split.length > 0) {
                    String str2 = split[split.length - 1];
                    if (!TextUtils.isEmpty(str2)) {
                        return new Pair<>(str2.substring(0, str2.lastIndexOf(124)), str2.substring(str2.lastIndexOf(124) + 1));
                    }
                }
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.a(th2);
        }
        return new Pair<>("0|0|0|0", "0");
    }

    private static String a(ScanResult scanResult) {
        if (scanResult == null) {
            return "";
        }
        try {
            String str = scanResult.SSID;
            if (str == null) {
                return "";
            }
            return str.replace(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "").replace("#", "").replace(",", "") + "#" + scanResult.BSSID + "#" + scanResult.level + "#" + scanResult.capabilities + "#" + (System.currentTimeMillis() - (((SystemClock.elapsedRealtimeNanos() / 1000) / 1000) - (scanResult.timestamp / 1000)));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return "";
        }
    }

    private static String a(List<ScanResult> list) {
        StringBuilder sb2 = new StringBuilder();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(a(list.get(i11)));
                if (i11 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    public static void a() {
        if (f29742e.getAndSet(true)) {
            return;
        }
        c cVar = new c();
        ScheduleQueue.getInstance().addSchedule(cVar, cVar.f29744b, cVar.f29743a);
    }
}
