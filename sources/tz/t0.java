package tz;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public class t0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f91372a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f91373b;

    public t0(q0 q0Var) {
        this.f91373b = q0Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("tt#" + this.f91372a.getAndIncrement());
        return thread;
    }
}
