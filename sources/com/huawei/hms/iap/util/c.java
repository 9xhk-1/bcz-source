package com.huawei.hms.iap.util;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class c {
    public static int a(@NonNull Intent intent, String str, int i11) {
        try {
            return intent.getIntExtra(str, i11);
        } catch (Throwable th2) {
            HMSLog.e("IntentUtils", "safeGetIntExtra failed, " + th2.getMessage());
            return i11;
        }
    }

    public static String a(@NonNull Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable th2) {
            HMSLog.e("IntentUtils", "safeGetStringExtra failed, " + th2.getMessage());
            return "";
        }
    }

    public static String a(@NonNull Intent intent, String str, String str2) {
        String a11 = a(intent, str);
        return TextUtils.isEmpty(a11) ? str2 : a11;
    }

    public static boolean a(@NonNull Intent intent, String str, boolean z11) {
        try {
            return intent.getBooleanExtra(str, z11);
        } catch (Throwable th2) {
            HMSLog.e("IntentUtils", "safeGetBooleanExtra failed, " + th2.getMessage());
            return z11;
        }
    }
}
