package com.meizu.cloud.pushsdk.b.c;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f39387a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f39388a = new b();
    }

    private b() {
        this.f39387a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d().a((Integer) 10).a("message-pool-%d").a());
    }

    public static b a() {
        return a.f39388a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f39387a.execute(runnable);
    }
}
