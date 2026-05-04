package com.meizu.cloud.pushsdk.b.c;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f39389a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f39390a = new c();
    }

    private c() {
        this.f39389a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d().a("single-pool-%d").a());
    }

    public static c a() {
        return a.f39390a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f39389a.execute(runnable);
    }
}
