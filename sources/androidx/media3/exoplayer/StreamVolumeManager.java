package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.StreamVolumeManager;
import ho.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private AudioManager audioManager;
    private final Listener listener;

    @Nullable
    private VolumeChangeReceiver receiver;
    private final BackgroundThreadStateHandler<StreamVolumeState> stateHandler;
    private int volumeBeforeMute;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onStreamTypeChanged(int i11);

        void onStreamVolumeChanged(int i11, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StreamVolumeState {
        public final int maxVolume;
        public final int minVolume;
        public final boolean muted;
        public final int streamType;
        public final int volume;

        public StreamVolumeState(int i11, int i12, boolean z11, int i13, int i14) {
            this.streamType = i11;
            this.volume = i12;
            this.muted = z11;
            this.minVolume = i13;
            this.maxVolume = i14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        public static /* synthetic */ void a(VolumeChangeReceiver volumeChangeReceiver) {
            if (StreamVolumeManager.this.receiver == null) {
                return;
            }
            StreamVolumeManager.this.stateHandler.setStateInBackground(StreamVolumeManager.this.generateState(((StreamVolumeState) StreamVolumeManager.this.stateHandler.get()).streamType));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StreamVolumeManager.this.stateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.g4
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.VolumeChangeReceiver.a(StreamVolumeManager.VolumeChangeReceiver.this);
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Listener listener, final int i11, Looper looper, Looper looper2, Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        BackgroundThreadStateHandler<StreamVolumeState> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(new StreamVolumeState(i11, 0, false, 0, 0), looper, looper2, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.s3
            @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
            public final void onStateChanged(Object obj, Object obj2) {
                StreamVolumeManager.this.onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj, (StreamVolumeManager.StreamVolumeState) obj2);
            }
        });
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.x3
            @Override // java.lang.Runnable
            public final void run() {
                StreamVolumeManager.m(StreamVolumeManager.this, i11);
            }
        });
    }

    public static /* synthetic */ StreamVolumeState a(StreamVolumeManager streamVolumeManager, boolean z11, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        return new StreamVolumeState(streamVolumeState.streamType, streamVolumeState.muted == z11 ? streamVolumeState.volume : z11 ? 0 : streamVolumeManager.volumeBeforeMute, z11, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    public static /* synthetic */ StreamVolumeState b(int i11, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(i11, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    public static /* synthetic */ StreamVolumeState d(int i11, StreamVolumeState streamVolumeState) {
        int i12 = streamVolumeState.streamType;
        int i13 = streamVolumeState.minVolume;
        return new StreamVolumeState(i12, (i11 < i13 || i11 > streamVolumeState.maxVolume) ? streamVolumeState.volume : i11, i11 == 0, i13, streamVolumeState.maxVolume);
    }

    public static /* synthetic */ StreamVolumeState e(StreamVolumeState streamVolumeState) {
        int i11 = streamVolumeState.streamType;
        int i12 = streamVolumeState.volume;
        int i13 = streamVolumeState.minVolume;
        return new StreamVolumeState(i11, i12 > i13 ? i12 - 1 : i13, i12 <= 1, i13, streamVolumeState.maxVolume);
    }

    public static /* synthetic */ StreamVolumeState f(StreamVolumeManager streamVolumeManager, int i11, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(streamVolumeManager.audioManager)).adjustStreamVolume(streamVolumeState.streamType, -1, i11);
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    public static /* synthetic */ StreamVolumeState g(StreamVolumeManager streamVolumeManager, int i11, int i12, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (i11 == streamVolumeState.volume || i11 < streamVolumeState.minVolume || i11 > streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(streamVolumeManager.audioManager)).setStreamVolume(streamVolumeState.streamType, i11, i12);
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StreamVolumeState generateState(int i11) {
        Assertions.checkNotNull(this.audioManager);
        return new StreamVolumeState(i11, AudioManagerCompat.getStreamVolume(this.audioManager, i11), AudioManagerCompat.isStreamMute(this.audioManager, i11), AudioManagerCompat.getStreamMinVolume(this.audioManager, i11), AudioManagerCompat.getStreamMaxVolume(this.audioManager, i11));
    }

    public static /* synthetic */ StreamVolumeState h(StreamVolumeManager streamVolumeManager, int i11, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        return streamVolumeState.streamType == i11 ? streamVolumeState : streamVolumeManager.generateState(i11);
    }

    public static /* synthetic */ StreamVolumeState i(StreamVolumeManager streamVolumeManager, StreamVolumeState streamVolumeState) {
        VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.receiver;
        if (volumeChangeReceiver != null) {
            try {
                streamVolumeManager.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e11) {
                Log.w(TAG, "Error unregistering stream volume receiver", e11);
            }
            streamVolumeManager.receiver = null;
        }
        return streamVolumeState;
    }

    public static /* synthetic */ StreamVolumeState j(StreamVolumeManager streamVolumeManager, boolean z11, int i11, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (streamVolumeState.muted == z11) {
            return streamVolumeState;
        }
        Assertions.checkNotNull(streamVolumeManager.audioManager);
        if (Util.SDK_INT >= 23) {
            streamVolumeManager.audioManager.adjustStreamVolume(streamVolumeState.streamType, z11 ? -100 : 100, i11);
        } else {
            streamVolumeManager.audioManager.setStreamMute(streamVolumeState.streamType, z11);
        }
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    public static /* synthetic */ StreamVolumeState k(StreamVolumeManager streamVolumeManager, int i11, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(streamVolumeManager.audioManager)).adjustStreamVolume(streamVolumeState.streamType, 1, i11);
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    public static /* synthetic */ void m(StreamVolumeManager streamVolumeManager, int i11) {
        streamVolumeManager.audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) streamVolumeManager.applicationContext.getSystemService("audio"));
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            streamVolumeManager.applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            streamVolumeManager.receiver = volumeChangeReceiver;
        } catch (RuntimeException e11) {
            Log.w(TAG, "Error registering stream volume receiver", e11);
        }
        streamVolumeManager.stateHandler.setStateInBackground(streamVolumeManager.generateState(i11));
    }

    public static /* synthetic */ StreamVolumeState n(StreamVolumeState streamVolumeState) {
        int i11 = streamVolumeState.streamType;
        int i12 = streamVolumeState.volume;
        int i13 = streamVolumeState.maxVolume;
        return new StreamVolumeState(i11, i12 < i13 ? i12 + 1 : i13, false, streamVolumeState.minVolume, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamVolumeStateChanged(StreamVolumeState streamVolumeState, StreamVolumeState streamVolumeState2) {
        boolean z11 = streamVolumeState.muted;
        if (!z11 && streamVolumeState2.muted) {
            this.volumeBeforeMute = streamVolumeState.volume;
        }
        int i11 = streamVolumeState.volume;
        int i12 = streamVolumeState2.volume;
        if (i11 != i12 || z11 != streamVolumeState2.muted) {
            this.listener.onStreamVolumeChanged(i12, streamVolumeState2.muted);
        }
        int i13 = streamVolumeState.streamType;
        int i14 = streamVolumeState2.streamType;
        if (i13 == i14 && streamVolumeState.minVolume == streamVolumeState2.minVolume && streamVolumeState.maxVolume == streamVolumeState2.maxVolume) {
            return;
        }
        this.listener.onStreamTypeChanged(i14);
    }

    @SuppressLint({"WrongConstant"})
    public void decreaseVolume(final int i11) {
        this.stateHandler.updateStateAsync(new r() { // from class: androidx.media3.exoplayer.y3
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.e((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new r() { // from class: androidx.media3.exoplayer.z3
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.f(StreamVolumeManager.this, i11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public int getMaxVolume() {
        return this.stateHandler.get().maxVolume;
    }

    public int getMinVolume() {
        return this.stateHandler.get().minVolume;
    }

    public int getVolume() {
        return this.stateHandler.get().volume;
    }

    @SuppressLint({"WrongConstant"})
    public void increaseVolume(final int i11) {
        this.stateHandler.updateStateAsync(new r() { // from class: androidx.media3.exoplayer.v3
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.n((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new r() { // from class: androidx.media3.exoplayer.w3
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.k(StreamVolumeManager.this, i11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    public void release() {
        this.stateHandler.updateStateAsync(new r() { // from class: androidx.media3.exoplayer.t3
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.c((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new r() { // from class: androidx.media3.exoplayer.u3
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.i(StreamVolumeManager.this, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public void setMuted(final boolean z11, final int i11) {
        this.stateHandler.updateStateAsync(new r() { // from class: androidx.media3.exoplayer.e4
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.a(StreamVolumeManager.this, z11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new r() { // from class: androidx.media3.exoplayer.f4
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.j(StreamVolumeManager.this, z11, i11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setStreamType(final int i11) {
        this.stateHandler.updateStateAsync(new r() { // from class: androidx.media3.exoplayer.c4
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.b(i11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new r() { // from class: androidx.media3.exoplayer.d4
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.h(StreamVolumeManager.this, i11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public void setVolume(final int i11, final int i12) {
        this.stateHandler.updateStateAsync(new r() { // from class: androidx.media3.exoplayer.a4
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.d(i11, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new r() { // from class: androidx.media3.exoplayer.b4
            @Override // ho.r
            public final Object apply(Object obj) {
                return StreamVolumeManager.g(StreamVolumeManager.this, i11, i12, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public static /* synthetic */ StreamVolumeState c(StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }
}
