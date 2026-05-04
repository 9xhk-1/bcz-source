package com.huawei.hms.aggrpay;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;

/* loaded from: classes7.dex */
public class AggrPayApiException extends ApiException {
    public AggrPayApiException(Status status) {
        super(status);
    }

    public Status getStatus() {
        return this.mStatus;
    }
}
