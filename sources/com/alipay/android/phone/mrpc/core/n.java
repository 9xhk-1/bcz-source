package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f10301a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f10301a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
