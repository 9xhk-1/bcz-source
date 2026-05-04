package com.huawei.hms.support.api.client;

import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class InnerPendingResult<R extends Result> extends PendingResult<R> {
    public abstract R awaitOnAnyThread();

    public abstract R awaitOnAnyThread(long j11, TimeUnit timeUnit);
}
