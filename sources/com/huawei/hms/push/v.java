package com.huawei.hms.push;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f36234a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f36235b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f36234a) {
            threadPoolExecutor = f36235b;
        }
        return threadPoolExecutor;
    }
}
