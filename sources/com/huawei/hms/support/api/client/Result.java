package com.huawei.hms.support.api.client;

import com.huawei.hms.core.aidl.IMessageEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class Result implements IMessageEntity {
    private Status status = Status.FAILURE;

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        if (status == null) {
            return;
        }
        this.status = status;
    }
}
