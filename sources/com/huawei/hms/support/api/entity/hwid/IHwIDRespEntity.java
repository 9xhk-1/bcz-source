package com.huawei.hms.support.api.entity.hwid;

import android.content.Intent;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class IHwIDRespEntity extends AbstractMessageEntity {

    @Packed
    private Intent data;

    @Packed
    private int retCode;

    public Intent getData() {
        return this.data;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public void setData(Intent intent) {
        this.data = intent;
    }

    public void setRetCode(int i11) {
        this.retCode = i11;
    }
}
