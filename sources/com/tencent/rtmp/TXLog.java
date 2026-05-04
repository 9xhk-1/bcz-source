package com.tencent.rtmp;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXLog {
    public static void d(String str, String str2) {
        wrietLogMessage(1, str, str2);
    }

    public static void e(String str, String str2) {
        wrietLogMessage(4, str, str2);
    }

    public static void i(String str, String str2) {
        wrietLogMessage(2, str, str2);
    }

    public static void w(String str, String str2) {
        wrietLogMessage(3, str, str2);
    }

    private static void wrietLogMessage(int i11, String str, String str2) {
        TXCLog.log(i11, str, "thread ID:" + Thread.currentThread().getId() + "|line:-1" + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
    }
}
