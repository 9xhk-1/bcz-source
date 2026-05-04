package com.igexin.base.scheduler;

import android.text.TextUtils;
import com.igexin.base.scheduler.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class a implements b.InterfaceC0459b, c {

    /* renamed from: a, reason: collision with root package name */
    private b f37062a;

    /* renamed from: b, reason: collision with root package name */
    private Map<BaseTask, ScheduledFuture> f37063b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f37064c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, LinkedBlockingQueue<BaseTask>> f37065d = new HashMap();

    public a() {
        b bVar = new b();
        this.f37062a = bVar;
        bVar.f37067a = this;
    }

    private ScheduledFuture b(BaseTask baseTask) {
        BaseTask baseTask2;
        ScheduledFuture<?> schedule;
        ScheduledFuture scheduledFuture = this.f37063b.get(baseTask);
        if (scheduledFuture != null) {
            if (scheduledFuture.cancel(false)) {
                this.f37063b.remove(baseTask);
            }
            BlockingQueue<Runnable> queue = this.f37062a.getQueue();
            if (queue != null) {
                queue.remove(scheduledFuture);
            }
        }
        long initDelay = baseTask.getInitDelay();
        if (baseTask.isPeriodic()) {
            long period = baseTask.getPeriod();
            if (period > 0) {
                baseTask2 = baseTask;
                schedule = this.f37062a.scheduleAtFixedRate(baseTask2, initDelay, period, TimeUnit.MILLISECONDS);
            } else {
                baseTask2 = baseTask;
                schedule = this.f37062a.scheduleWithFixedDelay(baseTask2, initDelay, -period, TimeUnit.MILLISECONDS);
            }
        } else {
            baseTask2 = baseTask;
            schedule = this.f37062a.schedule(baseTask2, initDelay, TimeUnit.MILLISECONDS);
        }
        this.f37063b.put(baseTask2, schedule);
        return schedule;
    }

    @Override // com.igexin.base.scheduler.b.InterfaceC0459b
    public final synchronized void a(BaseTask baseTask) {
        try {
            this.f37063b.remove(baseTask);
            String groupName = baseTask.getGroupName();
            if (!TextUtils.isEmpty(groupName)) {
                LinkedBlockingQueue<BaseTask> linkedBlockingQueue = this.f37065d.get(groupName);
                if (linkedBlockingQueue != null && linkedBlockingQueue.size() > 0) {
                    b(linkedBlockingQueue.poll());
                    return;
                }
                this.f37064c.remove(groupName);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.igexin.base.scheduler.c
    public final void execute(BaseTask baseTask) {
        try {
            baseTask.onRunTask();
            baseTask.done();
        } catch (Throwable th2) {
            baseTask.onException(th2);
        }
    }

    @Override // com.igexin.base.scheduler.c
    public final synchronized void submit(BaseTask baseTask) {
        try {
            String groupName = baseTask.getGroupName();
            boolean z11 = false;
            if (!TextUtils.isEmpty(groupName)) {
                if (this.f37064c.contains(groupName)) {
                    if (this.f37065d.get(groupName) == null) {
                        this.f37065d.put(groupName, new LinkedBlockingQueue<>());
                    }
                    z11 = this.f37065d.get(groupName).offer(baseTask);
                } else {
                    this.f37064c.add(groupName);
                }
            }
            if (z11) {
                return;
            }
            b(baseTask);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
