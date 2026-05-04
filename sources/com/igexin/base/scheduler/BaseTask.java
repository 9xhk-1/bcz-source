package com.igexin.base.scheduler;

import com.igexin.base.api.GTSchedulerManager;
import com.igexin.base.scheduler.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class BaseTask implements Runnable {
    private static final String TAG = "BaseTask";
    private String groupName;
    private long initDelay;
    private volatile int isRunVal;
    private b.a mParent;
    private long period;
    private AtomicBoolean isCanceled = new AtomicBoolean();
    private GTSchedulerManager.TASKLEVEL taskLevel = GTSchedulerManager.TASKLEVEL.LEVEL_DEFAULT;

    public BaseTask(long j11, long j12, TimeUnit timeUnit, boolean z11) {
        setDelayImpl(j11, j12, timeUnit, z11);
    }

    private void setDelayImpl(long j11, long j12, TimeUnit timeUnit, boolean z11) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        this.initDelay = timeUnit2.convert(j11, timeUnit);
        this.period = (z11 ? 1 : -1) * timeUnit2.convert(j12, timeUnit);
    }

    public void bind(b.a aVar) {
        if (aVar == null) {
            return;
        }
        this.mParent = aVar;
    }

    public boolean cancel() {
        b.a aVar = this.mParent;
        if (aVar != null) {
            return aVar.cancel(false);
        }
        this.isCanceled.set(true);
        return true;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getInitDelay() {
        return this.initDelay;
    }

    public long getPeriod() {
        return this.period;
    }

    public int getTaskLevel() {
        return this.taskLevel.val;
    }

    public boolean interrupt() {
        b.a aVar = this.mParent;
        if (aVar != null) {
            return aVar.cancel(true);
        }
        this.isCanceled.set(true);
        return true;
    }

    public boolean isPeriodic() {
        return this.period != 0;
    }

    public boolean isRunning() {
        return this.isRunVal != 0;
    }

    public abstract void onRunTask();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.isCanceled.get()) {
            return;
        }
        setIsRunning(true);
        onRunTask();
    }

    public void setDelay(long j11, long j12, TimeUnit timeUnit, boolean z11) {
        setDelayImpl(j11, j12, timeUnit, z11);
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setIsRunning(boolean z11) {
        this.isRunVal = z11 ? 1 : 0;
    }

    public void setTaskLevel(GTSchedulerManager.TASKLEVEL tasklevel) {
        this.taskLevel = tasklevel;
    }

    public BaseTask(long j11, TimeUnit timeUnit) {
        setDelayImpl(j11, 0L, timeUnit, true);
    }

    public void setDelay(long j11, TimeUnit timeUnit) {
        setDelayImpl(j11, 0L, timeUnit, true);
    }

    public void done() {
    }

    public void onCancel() {
    }

    public void onException(Throwable th2) {
    }
}
