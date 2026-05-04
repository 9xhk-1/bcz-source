package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class JosBaseResp implements IMessageEntity {

    @Packed
    private int statusCode;

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int i11) {
        this.statusCode = i11;
    }
}
