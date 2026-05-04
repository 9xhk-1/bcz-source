package androidx.media3.common.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z11 = false;
        while (!this.isOpen) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z11;
        z11 = this.isOpen;
        this.isOpen = false;
        return z11;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean block(long j11) throws InterruptedException {
        if (j11 <= 0) {
            return this.isOpen;
        }
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j12 = j11 + elapsedRealtime;
        if (j12 < elapsedRealtime) {
            block();
        } else {
            while (!this.isOpen && elapsedRealtime < j12) {
                wait(j12 - elapsedRealtime);
                elapsedRealtime = this.clock.elapsedRealtime();
            }
        }
        return this.isOpen;
    }
}
