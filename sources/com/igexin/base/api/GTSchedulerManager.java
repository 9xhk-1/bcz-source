package com.igexin.base.api;

import com.igexin.base.scheduler.BaseTask;
import com.igexin.base.scheduler.a;
import com.igexin.base.scheduler.c;

/* loaded from: classes7.dex */
public class GTSchedulerManager implements c {
    private static GTSchedulerManager mInstance;
    private c mBase = new a();

    public enum TASKLEVEL {
        LEVEL_MIN(1),
        LEVEL_LOW(2),
        LEVEL_DEFAULT(3),
        LEVEL_HIGH(4),
        LEVEL_MAX(5);

        public int val;

        TASKLEVEL(int i11) {
            this.val = i11;
        }
    }

    private GTSchedulerManager() {
    }

    private void checkTask(BaseTask baseTask) {
        baseTask.getClass();
    }

    public static GTSchedulerManager getInstance() {
        if (mInstance == null) {
            synchronized (GTSchedulerManager.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new GTSchedulerManager();
                    }
                } finally {
                }
            }
        }
        return mInstance;
    }

    @Override // com.igexin.base.scheduler.c
    public void execute(BaseTask baseTask) {
        checkTask(baseTask);
        this.mBase.execute(baseTask);
    }

    @Override // com.igexin.base.scheduler.c
    public void submit(BaseTask baseTask) {
        checkTask(baseTask);
        this.mBase.submit(baseTask);
    }
}
