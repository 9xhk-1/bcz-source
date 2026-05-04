package com.baicizhan.client.business.util;

import android.os.Handler;
import android.os.Looper;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class PreciseCountdown extends Timer {
    private Handler UIHandler;
    private boolean UIThread;
    private long delay;
    private FinishTask finishTask;
    private long interval;
    private boolean restart;
    private long startTime;
    private TimerTask task;
    private TickTask tickTask;
    private long totalTime;
    private boolean wasCancelled;
    private boolean wasStarted;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class FinishTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            PreciseCountdown.this.onFinish();
        }

        private FinishTask() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class TickTask implements Runnable {
        long timeLeft;

        @Override // java.lang.Runnable
        public void run() {
            PreciseCountdown.this.onTick(this.timeLeft);
        }

        private TickTask() {
        }
    }

    public PreciseCountdown(long totalTime, long interval, boolean ui2) {
        this(totalTime, interval, 0L, ui2);
    }

    private TimerTask getTask(final long totalTime) {
        return new TimerTask() { // from class: com.baicizhan.client.business.util.PreciseCountdown.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                long j11;
                if (PreciseCountdown.this.startTime < 0 || PreciseCountdown.this.restart) {
                    PreciseCountdown.this.startTime = scheduledExecutionTime();
                    j11 = totalTime;
                    PreciseCountdown.this.restart = false;
                } else {
                    j11 = totalTime - (scheduledExecutionTime() - PreciseCountdown.this.startTime);
                    if (j11 <= 0) {
                        cancel();
                        PreciseCountdown.this.startTime = -1L;
                        if (PreciseCountdown.this.UIThread) {
                            PreciseCountdown.this.UIHandler.post(PreciseCountdown.this.finishTask);
                            return;
                        } else {
                            PreciseCountdown.this.onFinish();
                            return;
                        }
                    }
                }
                if (!PreciseCountdown.this.UIThread) {
                    PreciseCountdown.this.onTick(j11);
                } else {
                    PreciseCountdown.this.tickTask.timeLeft = j11;
                    PreciseCountdown.this.UIHandler.post(PreciseCountdown.this.tickTask);
                }
            }
        };
    }

    public void dispose() {
        cancel();
        purge();
    }

    public abstract void onFinish();

    public abstract void onTick(long timeLeft);

    public void restart() {
        if (!this.wasStarted) {
            start();
        } else {
            if (!this.wasCancelled) {
                this.restart = true;
                return;
            }
            this.wasCancelled = false;
            this.task = getTask(this.totalTime);
            start();
        }
    }

    public void start() {
        this.wasStarted = true;
        scheduleAtFixedRate(this.task, this.delay, this.interval);
    }

    public void stop() {
        this.wasCancelled = true;
        this.task.cancel();
    }

    public PreciseCountdown(long totalTime, long interval, long delay, boolean ui2) {
        super("PreciseCountdown", true);
        this.startTime = -1L;
        this.restart = false;
        this.wasCancelled = false;
        this.wasStarted = false;
        this.UIHandler = new Handler(Looper.getMainLooper());
        this.tickTask = new TickTask();
        this.finishTask = new FinishTask();
        this.delay = delay;
        this.interval = interval;
        this.totalTime = totalTime;
        this.task = getTask(totalTime);
        this.UIThread = ui2;
    }
}
