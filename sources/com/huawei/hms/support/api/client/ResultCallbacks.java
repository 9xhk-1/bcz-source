package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = "ResultCallbacks";

    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r11);

    @Override // com.huawei.hms.support.api.client.ResultCallback
    public final void onResult(R r11) {
        try {
            Status status = r11.getStatus();
            if (status.isSuccess()) {
                onSuccess(r11);
                return;
            }
            onFailure(status);
            if (r11 instanceof Releasable) {
                ((Releasable) r11).release();
            }
        } catch (Exception e11) {
            HMSLog.w(TAG, "Failed to release " + r11 + ", reason: " + e11);
        }
    }
}
