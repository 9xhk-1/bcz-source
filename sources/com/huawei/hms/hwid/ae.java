package com.huawei.hms.hwid;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.UIUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ae extends TaskApiCall<u, Intent> {
    public ae(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fr.l<Intent> lVar) {
        if (responseErrorCode == null) {
            as.b("NoticeTaskApiCall", "header is null.", true);
            lVar.c(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        if (responseErrorCode.getStatusCode() == 0 && responseErrorCode.getErrorCode() == 0) {
            as.b("NoticeTaskApiCall", "Jos Notice onResult success.", true);
            a(responseErrorCode.getParcelable(), uVar, responseErrorCode, lVar);
        } else {
            as.c("NoticeTaskApiCall", "Jos Notice onResult failed, ErrCode" + responseErrorCode.getErrorCode(), true);
        }
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    private void a(Parcelable parcelable, u uVar, ResponseErrorCode responseErrorCode, fr.l<Intent> lVar) {
        Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            as.b("NoticeTaskApiCall", "launchNoticeActivity failed, activity is invalid", true);
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                currentActivity.startActivity((Intent) parcelable);
            } catch (Exception unused) {
                as.d("NoticeTaskApiCall", "Jos Notice startActivity meet exception", true);
            }
        } else if (parcelable instanceof PendingIntent) {
            PendingIntent pendingIntent = (PendingIntent) parcelable;
            try {
                if (UIUtil.isBackground(uVar.getContext())) {
                    as.b("NoticeTaskApiCall", "ui isBackground.", true);
                    lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), pendingIntent)));
                } else {
                    currentActivity.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
                }
            } catch (IntentSender.SendIntentException unused2) {
                as.d("NoticeTaskApiCall", "Jos Notice startIntentSender meet exception", true);
            }
        }
    }
}
