package com.mob.tools;

import com.mob.MobSDK;
import com.mob.commons.a.l;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;

/* loaded from: classes7.dex */
public class MobLog implements EverythingKeeper {
    public static synchronized NLog getInstance() {
        NLog nLog;
        synchronized (MobLog.class) {
            nLog = NLog.getInstance("MobSDK", MobSDK.SDK_VERSION_CODE, l.a("009mBfdgdfm[e3fdfdfegh"));
        }
        return nLog;
    }
}
