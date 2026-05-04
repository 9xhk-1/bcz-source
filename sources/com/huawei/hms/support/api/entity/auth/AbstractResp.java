package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class AbstractResp implements IMessageEntity {

    @Packed
    private String errorReason;

    @Packed
    private int rtnCode = 0;

    public String getErrorReason() {
        return this.errorReason;
    }

    public int getRtnCode() {
        return this.rtnCode;
    }

    public void setErrorReason(String str) {
        this.errorReason = str;
    }

    public void setRtnCode(int i11) {
        this.rtnCode = i11;
    }
}
