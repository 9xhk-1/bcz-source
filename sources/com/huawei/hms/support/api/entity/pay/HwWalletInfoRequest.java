package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes7.dex */
public class HwWalletInfoRequest implements IMessageEntity {

    @Packed
    public String merchantId;

    @Packed
    public String queryFlag;

    public String getMerchantId() {
        return (String) get(this.merchantId);
    }

    public String getQueryFlag() {
        return (String) get(this.queryFlag);
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setQueryFlag(String str) {
        this.queryFlag = str;
    }

    private static <T> T get(T t11) {
        return t11;
    }
}
