package com.huawei.hms.support.api.entity.pay;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes7.dex */
public class WalletUiIntentReq implements IMessageEntity {

    @Packed
    private int type;

    public int getType() {
        return this.type;
    }

    public void setType(int i11) {
        this.type = i11;
    }
}
