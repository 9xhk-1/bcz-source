package com.huawei.hms.aggrpay;

import android.app.PendingIntent;
import android.content.Intent;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import fr.l;
import org.junit.jupiter.api.j2;

/* loaded from: classes7.dex */
public abstract class BaseAggrPayServiceTaskApiCall<U extends HmsClient, V> extends TaskApiCall<U, V> {
    public BaseAggrPayServiceTaskApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public void dealException(l lVar, ResponseErrorCode responseErrorCode) {
        HMSLog.e("BaseAggrPayServiceTaskApiCall", ("call " + getUri() + j2.O) + "dealException, returnCode: " + responseErrorCode.getErrorCode());
        lVar.c(new AggrPayApiException(getStatus(responseErrorCode)));
    }

    public abstract void dealSuccess(l<V> lVar, ResponseErrorCode responseErrorCode, String str);

    public Status getStatus(ResponseErrorCode responseErrorCode) {
        String str = "call " + getUri() + j2.O;
        if (responseErrorCode.getParcelable() instanceof Intent) {
            HMSLog.i("BaseAggrPayServiceTaskApiCall", str + "getStatus, getParcelable is instanceof Intent");
            return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (Intent) responseErrorCode.getParcelable());
        }
        if (!(responseErrorCode.getParcelable() instanceof PendingIntent)) {
            HMSLog.i("BaseAggrPayServiceTaskApiCall", str + "getStatus, no parcelable");
            return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason());
        }
        HMSLog.i("BaseAggrPayServiceTaskApiCall", str + "getStatus, getParcelable is instanceof PendingIntent");
        return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (PendingIntent) responseErrorCode.getParcelable());
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(U u11, ResponseErrorCode responseErrorCode, String str, l<V> lVar) {
        if (responseErrorCode == null) {
            HMSLog.e("BaseAggrPayServiceTaskApiCall", "responseErrorCode is null");
            lVar.c(new AggrPayApiException(new Status(1)));
            return;
        }
        HiAnalyticsClient.reportExit(u11.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 1);
        if (lVar == null) {
            HMSLog.e("BaseAggrPayServiceTaskApiCall", "taskCompletionSource is null");
        } else if (responseErrorCode.getErrorCode() == 0) {
            dealSuccess(lVar, responseErrorCode, str);
        } else {
            dealException(lVar, responseErrorCode);
        }
    }
}
