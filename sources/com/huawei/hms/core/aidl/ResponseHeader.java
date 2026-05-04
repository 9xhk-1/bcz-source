package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ResponseHeader implements IMessageEntity {

    @Packed
    protected int statusCode;

    public ResponseHeader() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public ResponseHeader(int i11) {
        this.statusCode = i11;
    }
}
