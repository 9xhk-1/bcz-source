package com.huawei.hms.support.api.paytask;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.WalletIntentResp;
import com.huawei.hms.support.api.pay.GetWalletUiIntentResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import fr.l;

/* loaded from: classes7.dex */
public class GetWalletUiIntentTaskApiCall extends BasePayServiceTaskApiCall<PayHmsClient, GetWalletUiIntentResult> {
    public GetWalletUiIntentTaskApiCall(String str, String str2, int i11) {
        super(str, str2);
        switch (i11) {
            case 10056:
            case 10057:
            case 10058:
            case 10059:
                setApiLevel(5);
                break;
        }
    }

    @Override // com.huawei.hms.support.api.paytask.BasePayServiceTaskApiCall
    public void dealSuccess(@NonNull l<GetWalletUiIntentResult> lVar, @NonNull ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("GetWalletUiIntentTaskApiCall", "dealSuccess");
        WalletIntentResp walletIntentResp = new WalletIntentResp();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, walletIntentResp);
        }
        GetWalletUiIntentResult getWalletUiIntentResult = new GetWalletUiIntentResult();
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (!(parcelable instanceof PendingIntent)) {
            lVar.c(new ApiException(new Status(responseErrorCode.getStatusCode(), responseErrorCode.getErrorReason())));
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) parcelable;
        getWalletUiIntentResult.setStatus(new Status(responseErrorCode.getStatusCode(), responseErrorCode.getErrorReason(), pendingIntent));
        getWalletUiIntentResult.setPendingIntent(pendingIntent);
        lVar.d(getWalletUiIntentResult);
    }
}
