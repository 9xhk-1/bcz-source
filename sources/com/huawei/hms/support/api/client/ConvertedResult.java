package com.huawei.hms.support.api.client;

import com.huawei.hms.support.api.client.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ConvertedResult<R extends Result> {
    public abstract <S extends Result> ConvertedResult<S> convertResult(ResultConvert<? super R, ? extends S> resultConvert);

    public abstract void finalExec(ResultCallbacks<? super R> resultCallbacks);
}
