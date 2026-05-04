package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;

    @Nullable
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Target {
        void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i11, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i11;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isDelivered;
    }

    @uo.a
    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    @Nullable
    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z11) {
        this.isDelivered = z11 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    @uo.a
    public PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    @uo.a
    public PlayerMessage setDeleteAfterDelivery(boolean z11) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z11;
        return this;
    }

    @uo.a
    public PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    @uo.a
    public PlayerMessage setPayload(@Nullable Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    @uo.a
    public PlayerMessage setPosition(long j11) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j11;
        return this;
    }

    @uo.a
    public PlayerMessage setType(int i11) {
        Assertions.checkState(!this.isSent);
        this.type = i11;
        return this;
    }

    @uo.a
    public PlayerMessage setPosition(int i11, long j11) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j11 != C.TIME_UNSET);
        if (i11 >= 0 && (this.timeline.isEmpty() || i11 < this.timeline.getWindowCount())) {
            this.mediaItemIndex = i11;
            this.positionMs = j11;
            return this;
        }
        throw new IllegalSeekPositionException(this.timeline, i11, j11);
    }

    public synchronized boolean blockUntilDelivered(long j11) throws InterruptedException, TimeoutException {
        boolean z11;
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            long elapsedRealtime = this.clock.elapsedRealtime() + j11;
            while (true) {
                z11 = this.isProcessed;
                if (z11 || j11 <= 0) {
                    break;
                }
                this.clock.onThreadBlocked();
                wait(j11);
                j11 = elapsedRealtime - this.clock.elapsedRealtime();
            }
            if (!z11) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isDelivered;
    }
}
