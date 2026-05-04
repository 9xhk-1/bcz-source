package com.huawei.hms.common.api;

import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BooleanResult extends Result {
    private final Status myStatus;
    private final boolean resultValue;

    public BooleanResult(Status status, boolean z11) {
        Preconditions.checkNotNull(status, "status cannot be null");
        this.myStatus = status;
        this.resultValue = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BooleanResult) {
            BooleanResult booleanResult = (BooleanResult) obj;
            if (this.resultValue == booleanResult.getValue() && this.myStatus.equals(booleanResult.getStatus())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public Status getStatus() {
        return this.myStatus;
    }

    public boolean getValue() {
        return this.resultValue;
    }

    public final int hashCode() {
        boolean z11 = this.resultValue;
        return (z11 ? 1 : 0) + ((this.myStatus.hashCode() + 127) * 77);
    }
}
