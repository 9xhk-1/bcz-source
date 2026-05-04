package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes7.dex */
public class HwWalletInoResp extends AbstractMessageEntity {

    @Packed
    public String result;

    public String getResult() {
        return (String) get(this.result);
    }

    public void setResult(String str) {
        this.result = str;
    }

    private static <T> T get(T t11) {
        return t11;
    }
}
