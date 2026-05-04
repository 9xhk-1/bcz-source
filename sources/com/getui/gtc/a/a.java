package com.getui.gtc.a;

import android.text.TextUtils;
import com.getui.gtc.base.util.ScheduleQueue;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f29677a = new AtomicBoolean(false);

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : str.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR) ? str.replace(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "$") : str;
    }

    public static void a() {
        if (f29677a.getAndSet(true)) {
            return;
        }
        b[] bVarArr = {new d(), new e(), new f(), new g()};
        for (int i11 = 0; i11 < 4; i11++) {
            ScheduleQueue.getInstance().addSchedule(bVarArr[i11], 10000L);
        }
    }

    public static void a(int i11) {
        if (i11 == 256) {
            c.a();
        }
    }
}
