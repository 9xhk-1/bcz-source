package com.huawei.hms.framework.common;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ThreadPoolExcutorEnhance extends ThreadPoolExecutor {
    public ThreadPoolExcutorEnhance(int i11, int i12, long j11, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i11, i12, j11, timeUnit, blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof RunnableEnhance) {
            String parentName = ((RunnableEnhance) runnable).getParentName();
            int lastIndexOf = parentName.lastIndexOf(" -->");
            if (lastIndexOf != -1) {
                parentName = StringUtils.substring(parentName, lastIndexOf + 4);
            }
            String name = thread.getName();
            int lastIndexOf2 = name.lastIndexOf(" -->");
            if (lastIndexOf2 != -1) {
                name = StringUtils.substring(name, lastIndexOf2 + 4);
            }
            thread.setName(parentName + " -->" + name);
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new RunnableEnhance(runnable));
    }

    public ThreadPoolExcutorEnhance(int i11, int i12, int i13, TimeUnit timeUnit, LinkedBlockingQueue<Runnable> linkedBlockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i11, i12, i13, timeUnit, linkedBlockingQueue, threadFactory, rejectedExecutionHandler);
    }
}
