package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class az {
    public static ActivityManager.ProcessErrorStateInfo a(ActivityManager activityManager, long j11) {
        if (activityManager == null) {
            al.c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        al.c("get anr state, timeout:%d", Long.valueOf(j11));
        long j12 = j11 / 500;
        int i11 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo a11 = a(activityManager.getProcessesInErrorState());
            if (a11 == null) {
                al.c("found proc state is null", new Object[0]);
            } else {
                int i12 = a11.condition;
                if (i12 == 2) {
                    al.c("found proc state is anr! proc:%s", a11.processName);
                    return a11;
                }
                if (i12 == 1) {
                    al.c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i13 = i11 + 1;
            if (i11 >= j12) {
                return a("Find process anr, but unable to get anr message.");
            }
            al.c("try the %s times:", Integer.valueOf(i13));
            ap.b(500L);
            i11 = i13;
        }
    }

    private static ActivityManager.ProcessErrorStateInfo a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int myPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == myPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    al.c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            al.c("current proc not in the error state", new Object[0]);
            return null;
        }
        al.c("error state info list is null", new Object[0]);
        return null;
    }

    private static ActivityManager.ProcessErrorStateInfo a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = z.a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
