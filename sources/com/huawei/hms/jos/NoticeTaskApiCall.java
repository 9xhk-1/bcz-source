package com.huawei.hms.jos;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.jos.apps.AppHmsClient;
import com.huawei.hms.jos.manager.InnerActivityManager;
import com.huawei.hms.support.log.HMSLog;
import fr.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NoticeTaskApiCall extends JosBaseApiCall<AppHmsClient, Intent> {
    public NoticeTaskApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    private void a(Parcelable parcelable) {
        String str;
        Activity currentActivity = InnerActivityManager.get().getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            HMSLog.i("NoticeTaskApiCall", "launchNoticeActivity failed, activity is invalid");
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                currentActivity.startActivity((Intent) parcelable);
                return;
            } catch (Exception unused) {
                str = "Jos Notice startActivity meet exception";
            }
        } else if (!(parcelable instanceof PendingIntent)) {
            HMSLog.e("NoticeTaskApiCall", "Jos Notice unKnow case ");
            return;
        } else {
            try {
                currentActivity.startIntentSender(((PendingIntent) parcelable).getIntentSender(), null, 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException unused2) {
                str = "Jos Notice startIntentSender meet exception";
            }
        }
        HMSLog.e("NoticeTaskApiCall", str);
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall
    public void doExecuteSuccess(ResponseErrorCode responseErrorCode, String str, l<Intent> lVar) {
        a(responseErrorCode.getParcelable());
    }
}
