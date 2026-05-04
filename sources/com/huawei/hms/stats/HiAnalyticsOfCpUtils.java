package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HiAnalyticsOfCpUtils {

    /* renamed from: a, reason: collision with root package name */
    private static HiAnalyticsInstance f36238a;

    private static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f36238a = analyticsInstance;
        return analyticsInstance;
    }

    public static void onEvent(Context context, String str, String str2) {
        if (a(context) != null) {
            f36238a.onEvent(context, str, str2);
        }
    }

    public static void onReport(Context context, int i11) {
        if (a(context) != null) {
            f36238a.onReport(i11);
        }
    }

    public static void onStreamEvent(Context context, int i11, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f36238a.onStreamEvent(i11, str, linkedHashMap);
        }
    }

    public static void onEvent(Context context, int i11, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f36238a.onEvent(i11, str, linkedHashMap);
        }
    }
}
