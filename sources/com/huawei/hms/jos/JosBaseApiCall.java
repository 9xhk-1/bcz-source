package com.huawei.hms.jos;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.jos.JosHmsClient;
import com.huawei.hms.jos.util.Utils;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import fr.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class JosBaseApiCall<K extends JosHmsClient, T> extends TaskApiCall<K, T> {
    public JosBaseApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public void doCommonFailed(l<T> lVar) {
        lVar.c(new ApiException(new Status(7001)));
    }

    public void doExecuteFailed(ResponseErrorCode responseErrorCode, l<T> lVar) {
        lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
    }

    public abstract void doExecuteSuccess(ResponseErrorCode responseErrorCode, String str, l<T> lVar);

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return super.getApiLevel();
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 30000000;
    }

    public void reportExit(K k11, ResponseErrorCode responseErrorCode) {
        HiAnalyticsClient.reportExit(k11.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), Utils.getSDKVersionCode(k11.getContext()));
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(K k11, ResponseErrorCode responseErrorCode, String str, l<T> lVar) {
        HMSLog.i("JosBaseApiCall", JosBaseApiCall.class.getName() + " onResult: " + responseErrorCode.getErrorCode());
        if (responseErrorCode.getStatusCode() == 0 && responseErrorCode.getErrorCode() == 0) {
            doExecuteSuccess(responseErrorCode, str, lVar);
        } else {
            doExecuteFailed(responseErrorCode, lVar);
        }
        reportExit(k11, responseErrorCode);
    }
}
