package com.huawei.hms.support.api.entity.opendevice;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class OdidResp extends AbstractMessageEntity {

    /* renamed from: id, reason: collision with root package name */
    @Packed
    public String f36299id;

    public String getId() {
        return this.f36299id;
    }

    public void setId(String str) {
        this.f36299id = str;
    }
}
