package com.huawei.hms.aggrpay.entity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class a extends Result {
    private static final String TAG = "AggrPayResult";
    private Intent mIntent;

    public a(Intent intent) {
        this.mIntent = intent;
    }

    public void startActivityForResult(Activity activity, int i11) {
        String str;
        if (activity == null) {
            str = "unrecoverable error, activity is null";
        } else {
            try {
                activity.startActivityForResult(this.mIntent, i11);
                return;
            } catch (ActivityNotFoundException unused) {
                str = "AggrPayResult: ActivityNotFoundException";
            }
        }
        HMSLog.e(TAG, str);
    }
}
