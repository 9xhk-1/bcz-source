package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RegionUtils {
    private static String a(Context context) {
        return (context == null || context.getApplicationContext() == null) ? "" : GrsApp.getInstance().getIssueCountryCode(context);
    }

    public static boolean isChinaROM(Context context) {
        return "CN".equalsIgnoreCase(a(context));
    }
}
