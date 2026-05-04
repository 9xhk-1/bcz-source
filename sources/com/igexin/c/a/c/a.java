package com.igexin.c.a.c;

import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.log.Logger;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.c.a.d.g;
import com.igexin.push.config.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f37178b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f37179c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public volatile Logger f37180a;

    private a() {
        try {
            this.f37180a = new Logger(GtcProvider.context());
            this.f37180a.setGlobalTag("gtsdk");
            this.f37180a.setLogcatEnable(false);
            this.f37180a.setLogFileNameSuffix("GTSDK");
            this.f37180a.setStackOffset(1);
            this.f37180a.setFileEnableProperty("sdk.debug");
            List<String> list = f37179c;
            list.add(g.f37237h);
            list.add("ScheduleQueue");
        } catch (Throwable unused) {
        }
    }

    public static a a() {
        if (f37178b == null) {
            synchronized (a.class) {
                try {
                    if (f37178b == null) {
                        f37178b = new a();
                    }
                } finally {
                }
            }
        }
        return f37178b;
    }

    private static Logger b() {
        return a().f37180a;
    }

    private static void c(String str, String str2) {
        try {
            if (a().f37180a == null || str == null || f37179c.contains(str)) {
                return;
            }
            a().f37180a.logcat(2, null, str2, null);
        } catch (Throwable unused) {
        }
    }

    private static void d(String str, String str2) {
        try {
            if (a().f37180a == null || str == null || f37179c.contains(str)) {
                return;
            }
            a().f37180a.logcat(3, null, str2, null);
        } catch (Throwable unused) {
        }
    }

    private static void e(String str, String str2) {
        try {
            if (a().f37180a == null || str == null || f37179c.contains(str)) {
                return;
            }
            a().f37180a.logcat(4, null, str2, null);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        try {
            if (a().f37180a == null || str == null || f37179c.contains(str)) {
                return;
            }
            a().f37180a.e(str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2) {
        try {
            if (a().f37180a == null || str == null || f37179c.contains(str)) {
                return;
            }
            a().f37180a.d(str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Object... objArr) {
        try {
            if (a().f37180a != null) {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                a().f37180a.filelog(1, null, str, null);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th2) {
        try {
            if (a().f37180a != null) {
                a().f37180a.e(th2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z11) {
        try {
            e.a(Boolean.valueOf(z11));
            if (a().f37180a != null) {
                a().f37180a.setLogcatEnable(false);
                a().f37180a.setFileEnableProperty("sdk.debug");
            }
        } catch (Throwable unused) {
        }
    }
}
