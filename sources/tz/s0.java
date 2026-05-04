package tz;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes8.dex */
public class s0 implements RejectedExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f91369a;

    public s0(q0 q0Var) {
        this.f91369a = q0Var;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
    }
}
