package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.client.Status;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class InvalidVersionException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Status f36292a;

    public InvalidVersionException(Status status) {
        this.f36292a = status;
    }

    public Status getError() {
        return this.f36292a;
    }
}
