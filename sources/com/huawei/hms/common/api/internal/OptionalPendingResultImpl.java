package com.huawei.hms.common.api.internal;

import android.os.Looper;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private final PendingResult<R> f35526a;

    public OptionalPendingResultImpl(PendingResult<R> pendingResult) {
        this.f35526a = pendingResult;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        return this.f35526a.await();
    }

    @Override // com.huawei.hms.common.api.OptionalPendingResult
    public final R get() {
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final boolean isCanceled() {
        return false;
    }

    @Override // com.huawei.hms.common.api.OptionalPendingResult
    public final boolean isDone() {
        return false;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        this.f35526a.setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await(long j11, TimeUnit timeUnit) {
        return this.f35526a.await(j11, timeUnit);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        this.f35526a.setResultCallback(looper, resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback, long j11, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    public final void addStatusListener() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void cancel() {
    }
}
