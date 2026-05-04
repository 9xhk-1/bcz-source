package com.baicizhan.client.business.util;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ClickProtectedEvent<T> extends SingleLiveEvent<T> {
    private static final String TAG = "ClickProtectedEvent";
    private static final long TIME = 1000;
    private long mLast = 0;

    private boolean tooFast() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.mLast;
        boolean z11 = Math.abs(j11) < 1000;
        if (!z11) {
            this.mLast = currentTimeMillis;
        }
        qb.c.i(TAG, "%d %d %d", Long.valueOf(currentTimeMillis), Long.valueOf(this.mLast), Long.valueOf(j11));
        return z11;
    }

    @Override // com.baicizhan.client.business.util.SingleLiveEvent, androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t11) {
        if (tooFast()) {
            return;
        }
        super.setValue(t11);
    }
}
