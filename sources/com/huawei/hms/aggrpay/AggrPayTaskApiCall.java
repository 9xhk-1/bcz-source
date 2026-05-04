package com.huawei.hms.aggrpay;

import android.content.Intent;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import fr.l;

/* loaded from: classes7.dex */
public class AggrPayTaskApiCall extends BaseAggrPayServiceTaskApiCall<a, com.huawei.hms.aggrpay.entity.a> {
    public AggrPayTaskApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
        setApiLevel(1);
    }

    @Override // com.huawei.hms.aggrpay.BaseAggrPayServiceTaskApiCall
    public void dealSuccess(l<com.huawei.hms.aggrpay.entity.a> lVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("AggrPayTaskApiCall", "dealSuccess");
        if (responseErrorCode.getParcelable() instanceof Intent) {
            HMSLog.i("AggrPayTaskApiCall", "onResult and getParcelable is instance of Intent");
            lVar.d(new com.huawei.hms.aggrpay.entity.a((Intent) responseErrorCode.getParcelable()));
        } else {
            HMSLog.e("AggrPayTaskApiCall", "onResult success but no intent");
            lVar.c(new AggrPayApiException(new Status(-1)));
        }
    }
}
