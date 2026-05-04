package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HianalyticsExist {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f36239a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f36240b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f36241c = false;

    public static boolean isHianalyticsExist() {
        synchronized (f36239a) {
            if (!f36240b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f36240b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + f36241c);
            }
        }
        return f36241c;
    }
}
