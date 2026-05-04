package com.huawei.hms.aggrpay.util;

import com.huawei.hms.support.log.HMSLog;
import java.lang.Thread;

/* loaded from: classes7.dex */
public class a {
    public static boolean a(Thread.State state) {
        HMSLog.i("IOUtils", "isWaiting thread state = " + state);
        return Thread.State.WAITING.equals(state) || Thread.State.TIMED_WAITING.equals(state);
    }
}
