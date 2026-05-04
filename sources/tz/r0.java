package tz;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes8.dex */
public class r0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f91368a;

    public r0(q0 q0Var) {
        this.f91368a = q0Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("it");
        return thread;
    }
}
