package tz;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes8.dex */
public class u0 implements RejectedExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f91377a;

    public u0(q0 q0Var) {
        this.f91377a = q0Var;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
    }
}
