package com.meizu.cloud.pushsdk.b.c;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f39385a;

    /* renamed from: com.meizu.cloud.pushsdk.b.c.a$a, reason: collision with other inner class name */
    public static class C0473a {

        /* renamed from: a, reason: collision with root package name */
        private static a f39386a = new a();
    }

    private a() {
        this.f39385a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new d().a("io-pool-%d").a());
    }

    public static a a() {
        return C0473a.f39386a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f39385a.execute(runnable);
    }
}
