package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.HiAnalyticsOfCpUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HiAnalyticsUtils {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f36372c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f36373d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static HiAnalyticsUtils f36374e;

    /* renamed from: a, reason: collision with root package name */
    private int f36375a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36376b = HianalyticsExist.isHianalyticsExist();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36377a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36378b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f36379c;

        public a(Context context, String str, Map map) {
            this.f36377a = context;
            this.f36378b = str;
            this.f36379c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent(this.f36377a, this.f36378b, this.f36379c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36381a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36383c;

        public b(Context context, String str, String str2) {
            this.f36381a = context;
            this.f36382b = str;
            this.f36383c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent2(this.f36381a, this.f36382b, this.f36383c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f36387c;

        public c(Context context, String str, Map map) {
            this.f36385a = context;
            this.f36386b = str;
            this.f36387c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f36385a, this.f36386b, this.f36387c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36389a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36390b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f36391c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36392d;

        public d(Context context, String str, Map map, int i11) {
            this.f36389a = context;
            this.f36390b = str;
            this.f36391c = map;
            this.f36392d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f36389a, this.f36390b, this.f36391c, this.f36392d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f36396c;

        public e(Context context, String str, Map map) {
            this.f36394a = context;
            this.f36395b = str;
            this.f36396c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f36394a, this.f36395b, this.f36396c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f36400c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36401d;

        public f(Context context, String str, Map map, int i11) {
            this.f36398a = context;
            this.f36399b = str;
            this.f36400c = map;
            this.f36401d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f36398a, this.f36399b, this.f36400c, this.f36401d);
        }
    }

    private HiAnalyticsUtils() {
    }

    private static LinkedHashMap<String, String> a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private void b(Context context) {
        synchronized (f36373d) {
            try {
                int i11 = this.f36375a;
                if (i11 < 60) {
                    this.f36375a = i11 + 1;
                } else {
                    this.f36375a = 0;
                    if (this.f36376b) {
                        HiAnalyticsOfCpUtils.onReport(context, 0);
                        HiAnalyticsOfCpUtils.onReport(context, 1);
                    } else {
                        HmsHiAnalyticsUtils.onReport();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void c(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new e(context.getApplicationContext(), str, map));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnReportToCache> failed. " + th2.getMessage());
        }
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f36372c) {
            try {
                if (f36374e == null) {
                    f36374e = new HiAnalyticsUtils();
                }
                hiAnalyticsUtils = f36374e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (this.f36376b) {
            HiAnalyticTools.enableLog(context);
        } else {
            HmsHiAnalyticsUtils.enableLog();
        }
    }

    public boolean getInitFlag() {
        return !this.f36376b ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public int getOobeAnalyticsState(Context context) {
        if (context == null) {
            return 0;
        }
        int a11 = a(context);
        if (a11 == 1) {
            return a11;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hms_cp_bundle_key", "content://com.huawei.hms.contentprovider/com.huawei.hms.privacy.HmsAnalyticsStateProvider");
        try {
            Bundle call = context.getApplicationContext().getContentResolver().call(Uri.parse("content://com.huawei.hms.contentprovider"), "getAnalyticsState", (String) null, bundle);
            if (call == null) {
                return a11;
            }
            a11 = call.getInt("SWITCH_IS_CHECKED");
            HMSLog.i("HiAnalyticsUtils", "get hms analyticsOobe state " + a11);
            return a11;
        } catch (IllegalArgumentException unused) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState IllegalArgumentException ");
            return a11;
        } catch (SecurityException unused2) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState SecurityException ");
            return a11;
        } catch (Exception unused3) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState Exception ");
            return a11;
        }
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
            a(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f36376b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, a(map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, a(map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, a(map));
                HmsHiAnalyticsUtils.onEvent(1, str, a(map));
            }
            b(context);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent2> context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (!initFlag && andRefreshAnalyticsState != 2 && a(str2)) {
            a(context, str, str2);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f36376b) {
                HiAnalyticsOfCpUtils.onEvent(context, str, str2);
            } else {
                HmsHiAnalyticsUtils.onEvent(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            b(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f36376b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, a((Map<String, String>) map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onEvent(1, str, a((Map<String, String>) map));
            }
            b(context);
        }
    }

    public void onReport(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onReport> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            c(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f36376b) {
                HiAnalyticsOfCpUtils.onStreamEvent(context, 0, str, a((Map<String, String>) map));
                HiAnalyticsOfCpUtils.onStreamEvent(context, 1, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onStreamEvent(0, str, a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onStreamEvent(1, str, a((Map<String, String>) map));
            }
        }
    }

    public void enableLog() {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.f36376b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    private int a(Context context) {
        int i11 = 0;
        try {
            i11 = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
            HMSLog.i("HiAnalyticsUtils", "getOobeStateForSettings value is " + i11);
            return i11;
        } catch (Settings.SettingNotFoundException e11) {
            HMSLog.i("HiAnalyticsUtils", "Settings.SettingNotFoundException " + e11.getMessage());
            return i11;
        }
    }

    private boolean a(boolean z11, boolean z12, Map<?, ?> map) {
        return !z11 && z12 && b(map);
    }

    private boolean b(Map<?, ?> map) {
        try {
            Iterator<?> it = map.values().iterator();
            long j11 = 0;
            while (it.hasNext()) {
                if (it.next() instanceof String) {
                    j11 += ((String) r3).getBytes(Charset.forName("UTF-8")).length;
                }
            }
            return j11 <= 512;
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<isValidSize map> Exception: " + th2.getMessage());
            return false;
        }
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.getBytes(Charset.forName("UTF-8")).length <= 512;
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<isValidSize String> Exception: " + th2.getMessage());
            return false;
        }
    }

    public void onReport(Context context, String str, Map map, int i11) {
        if (i11 != 0 && i11 != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onReport with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
                b(context, str, map, i11);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.f36376b) {
                    HmsHiAnalyticsUtils.onStreamEvent(i11, str, a((Map<String, String>) map));
                    return;
                } else {
                    HiAnalyticsOfCpUtils.onStreamEvent(context, i11, str, a((Map<String, String>) map));
                    return;
                }
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onReport with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    private void a(Context context, String str, Map<String, String> map) {
        try {
            com.huawei.hms.stats.a.c().a(new a(context.getApplicationContext(), str, map));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnEventToCache> failed. " + th2.getMessage());
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i11) {
        if (i11 != 0 && i11 != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
                a(context, str, map, i11);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.f36376b) {
                    HmsHiAnalyticsUtils.onEvent(i11, str, a((Map<String, String>) map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, i11, str, a((Map<String, String>) map));
                }
                b(context);
                return;
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    private void b(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new c(context.getApplicationContext(), str, map));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnNewEventToCache> failed. " + th2.getMessage());
        }
    }

    private void a(Context context, String str, String str2) {
        try {
            com.huawei.hms.stats.a.c().a(new b(context.getApplicationContext(), str, str2));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnEvent2ToCache> Failed. " + th2.getMessage());
        }
    }

    private void b(Context context, String str, Map map, int i11) {
        try {
            com.huawei.hms.stats.a.c().a(new f(context.getApplicationContext(), str, map, i11));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnReportToCache with type> failed. " + th2.getMessage());
        }
    }

    private void a(Context context, String str, Map map, int i11) {
        try {
            com.huawei.hms.stats.a.c().a(new d(context.getApplicationContext(), str, map, i11));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnNewEventToCache with type> failed. " + th2.getMessage());
        }
    }
}
