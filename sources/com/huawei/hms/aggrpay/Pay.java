package com.huawei.hms.aggrpay;

import android.app.Activity;
import com.huawei.hms.utils.Checker;

/* loaded from: classes7.dex */
public class Pay {
    private Pay() {
    }

    public static AggrPayClient getPayClient(Activity activity) {
        Checker.assertNonNull(activity);
        return new d(activity);
    }
}
