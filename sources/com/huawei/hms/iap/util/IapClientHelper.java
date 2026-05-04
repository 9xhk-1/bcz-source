package com.huawei.hms.iap.util;

import android.content.Intent;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class IapClientHelper {
    private static int a(Intent intent, String str, int i11) {
        if (intent != null) {
            return c.a(intent, str, i11);
        }
        HMSLog.e("IapClientHelper", "parseIntDataFromIntent: intent is null.");
        return -1;
    }

    @Deprecated
    public static int parseAccountFlagFromIntent(Intent intent) {
        return a(intent, CommonConstant.KEY_ACCOUNT_FLAG, 0);
    }

    public static String parseCarrierIdFromIntent(Intent intent) {
        return a(intent, CommonConstant.KEY_CARRIER_ID, (String) null);
    }

    public static String parseCountryFromIntent(Intent intent) {
        return a(intent, HwPayConstant.KEY_COUNTRY, (String) null);
    }

    public static int parseRespCodeFromIntent(Intent intent) {
        return a(intent, "returnCode", -1);
    }

    public static String parseRespMessageFromIntent(Intent intent) {
        return a(intent, "errMsg", "");
    }

    private static String a(Intent intent, String str, String str2) {
        if (intent != null) {
            return c.a(intent, str, str2);
        }
        HMSLog.i("IapClientHelper", "parseStringDataFromIntent: intent is null.");
        return str2;
    }
}
