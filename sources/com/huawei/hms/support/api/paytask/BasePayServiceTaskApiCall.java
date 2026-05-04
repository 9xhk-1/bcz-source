package com.huawei.hms.support.api.paytask;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import fr.l;
import org.junit.jupiter.api.j2;

/* loaded from: classes7.dex */
public abstract class BasePayServiceTaskApiCall<U extends HmsClient, V> extends TaskApiCall<U, V> {
    protected static final int MIN_APK_VERSION_FOR_SIGNALGORITHM = 60000300;
    protected static final int MIN_PAY_API_LEVEL_FOR_SIGNALGORITHM = 4;

    /* renamed from: a, reason: collision with root package name */
    private boolean f36331a;

    public BasePayServiceTaskApiCall(String str, String str2) {
        super(str, str2);
        this.f36331a = false;
    }

    public void dealException(@NonNull l lVar, @NonNull ResponseErrorCode responseErrorCode) {
        Exception resolvableApiException;
        String str = "call " + getUri() + j2.O;
        HMSLog.e("BasePayServiceTaskApiCall", str + "dealException, returnCode: " + responseErrorCode.getErrorCode());
        if (responseErrorCode.getErrorCode() == 1212 || responseErrorCode.getErrorCode() == 907135003) {
            HMSLog.e("BasePayServiceTaskApiCall", str + "dealException, upgrade required");
            resolvableApiException = new ResolvableApiException(responseErrorCode);
        } else {
            resolvableApiException = new ApiException(getStatus(responseErrorCode));
        }
        lVar.c(resolvableApiException);
    }

    public abstract void dealSuccess(@NonNull l<V> lVar, @NonNull ResponseErrorCode responseErrorCode, String str);

    public Status getStatus(@NonNull ResponseErrorCode responseErrorCode) {
        String str = "call " + getUri() + j2.O;
        if (responseErrorCode.getParcelable() instanceof Intent) {
            HMSLog.i("BasePayServiceTaskApiCall", str + "getStatus, getParcelable is instanceof Intent");
            return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (Intent) responseErrorCode.getParcelable());
        }
        if (!(responseErrorCode.getParcelable() instanceof PendingIntent)) {
            HMSLog.i("BasePayServiceTaskApiCall", str + "getStatus, no parcelable");
            return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason());
        }
        HMSLog.i("BasePayServiceTaskApiCall", str + "getStatus, getParcelable is instanceof PendingIntent");
        return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (PendingIntent) responseErrorCode.getParcelable());
    }

    public BasePayServiceTaskApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
        this.f36331a = true;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(U u11, ResponseErrorCode responseErrorCode, String str, l<V> lVar) {
        if (responseErrorCode == null) {
            HMSLog.e("BasePayServiceTaskApiCall", "header is null");
            lVar.c(new ApiException(new Status(1)));
            return;
        }
        if (this.f36331a) {
            HMSLog.i("BasePayServiceTaskApiCall", "reportExit");
            HiAnalyticsClient.reportExit(u11.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 61300300);
        }
        if (lVar == null) {
            HMSLog.e("BasePayServiceTaskApiCall", "taskCompletionSource is null");
        } else if (responseErrorCode.getErrorCode() == 0) {
            dealSuccess(lVar, responseErrorCode, str);
        } else {
            dealException(lVar, responseErrorCode);
        }
    }
}
