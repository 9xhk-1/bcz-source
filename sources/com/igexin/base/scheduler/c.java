package com.igexin.base.scheduler;

import com.igexin.base.scheduler.BaseTask;

/* loaded from: classes7.dex */
public interface c<T extends BaseTask> {
    void execute(T t11);

    void submit(T t11);
}
