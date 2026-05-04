package com.huawei.hms.aaid.entity;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DeleteTokenResp implements IMessageEntity {

    @Packed
    public int retCode = 0;

    public int getRetCode() {
        return this.retCode;
    }

    public void setRetCode(int i11) {
        this.retCode = i11;
    }
}
