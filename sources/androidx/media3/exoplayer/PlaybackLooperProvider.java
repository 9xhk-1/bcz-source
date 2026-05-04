package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackLooperProvider {

    @GuardedBy(vb.a.f93813p)
    private HandlerThread internalPlaybackThread;
    private final Object lock;

    @GuardedBy(vb.a.f93813p)
    private Looper playbackLooper;

    @GuardedBy(vb.a.f93813p)
    private int referenceCount;

    public PlaybackLooperProvider() {
        this(null);
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.lock) {
            try {
                if (this.playbackLooper == null) {
                    Assertions.checkState(this.referenceCount == 0 && this.internalPlaybackThread == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.internalPlaybackThread = handlerThread;
                    handlerThread.start();
                    this.playbackLooper = this.internalPlaybackThread.getLooper();
                }
                this.referenceCount++;
                looper = this.playbackLooper;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.lock) {
            try {
                Assertions.checkState(this.referenceCount > 0);
                int i11 = this.referenceCount - 1;
                this.referenceCount = i11;
                if (i11 == 0 && (handlerThread = this.internalPlaybackThread) != null) {
                    handlerThread.quit();
                    this.internalPlaybackThread = null;
                    this.playbackLooper = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PlaybackLooperProvider(Looper looper) {
        this.lock = new Object();
        this.playbackLooper = looper;
        this.internalPlaybackThread = null;
        this.referenceCount = 0;
    }
}
