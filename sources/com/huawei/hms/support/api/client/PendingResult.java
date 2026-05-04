package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class PendingResult<R extends Result> {
    public abstract R await();

    public abstract R await(long j11, TimeUnit timeUnit);

    @Deprecated
    public abstract void cancel();

    public <S extends Result> ConvertedResult<S> convertResult(ResultConvert<? super R, ? extends S> resultConvert) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public abstract boolean isCanceled();

    public abstract void setResultCallback(Looper looper, ResultCallback<R> resultCallback);

    public abstract void setResultCallback(ResultCallback<R> resultCallback);

    @Deprecated
    public abstract void setResultCallback(ResultCallback<R> resultCallback, long j11, TimeUnit timeUnit);
}
