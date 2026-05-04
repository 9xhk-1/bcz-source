package com.tencent.liteav.audio;

import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCUGCBGMPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int PLAY_ERR_OPEN = -1;
    private static final int PLAY_SUCCESS = 0;
    private static final String TAG = "AudioCenter:TXCUGCBGMPlayer";
    private int mBGMId;
    private long mEndTimeMS;
    private boolean mIsRunning;
    private long mSeekBytes;
    private float mSpeedRate;
    private long mStartTimeMS;
    private float mVolume;
    private WeakReference<g> mWeakListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static TXCUGCBGMPlayer f42935a = new TXCUGCBGMPlayer();

        public static TXCUGCBGMPlayer a() {
            return f42935a;
        }
    }

    static {
        h.d();
    }

    public static TXCUGCBGMPlayer getInstance() {
        return a.a();
    }

    private void onPlayEnd(int i11) {
        g gVar;
        synchronized (this) {
            try {
                WeakReference<g> weakReference = this.mWeakListener;
                gVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (gVar != null) {
            gVar.a(i11);
        }
    }

    private void onPlayProgress(long j11, long j12) {
        g gVar;
        synchronized (this) {
            try {
                WeakReference<g> weakReference = this.mWeakListener;
                gVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (gVar != null) {
            gVar.a(j11, j12);
        }
    }

    private void onPlayStart() {
        g gVar;
        synchronized (this) {
            try {
                WeakReference<g> weakReference = this.mWeakListener;
                gVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (gVar != null) {
            gVar.a();
        }
    }

    public long getDurationMS(String str) {
        return TXAudioEffectManagerImpl.getCacheInstance().getMusicDurationInMS(str);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i11, int i12) {
        onPlayEnd(i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i11, int i12) {
        onPlayStart();
    }

    public void pause() {
        TXCLog.i(TAG, ma.b.L);
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(this.mBGMId);
    }

    public void playFromTime(long j11, long j12) {
        TXCLog.i(TAG, "startPlayRange:" + j11 + j2.O + j12);
        this.mStartTimeMS = j11;
        this.mEndTimeMS = j12;
    }

    public void resume() {
        TXCLog.i(TAG, ma.b.K);
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(this.mBGMId);
    }

    public void seekBytes(long j11) {
        if (j11 < 0) {
            TXCLog.e(TAG, "seek bytes can not be negative. change to 0");
            j11 = 0;
        }
        long availableBGMBytes = TXAudioEffectManagerImpl.getCacheInstance().getAvailableBGMBytes(this.mBGMId);
        if (availableBGMBytes > 0) {
            j11 %= availableBGMBytes;
        }
        this.mSeekBytes = j11;
        TXCLog.i(TAG, "mSeekBytes:" + this.mSeekBytes);
        TXAudioEffectManagerImpl.getCacheInstance().seekMusicToPosInBytes(this.mBGMId, j11);
    }

    public void setChangerType(int i11) {
        TXCLog.i(TAG, "changerType:" + i11);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicChangerType(this.mBGMId, i11);
    }

    public synchronized void setOnPlayListener(g gVar) {
        if (gVar == null) {
            try {
                this.mWeakListener = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mWeakListener = new WeakReference<>(gVar);
    }

    public void setReverbType(int i11) {
        TXCLog.i(TAG, "int reverbType:" + i11);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicReverbType(this.mBGMId, i11);
    }

    public void setSpeedRate(float f11) {
        TXCLog.i(TAG, "setSpeedRate:" + f11);
        this.mSpeedRate = f11;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, f11);
    }

    public void setVolume(float f11) {
        TXCLog.i(TAG, "setVolume:" + f11);
        this.mVolume = f11;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (f11 * 100.0f));
    }

    public void startPlay(String str, boolean z11) {
        TXCLog.i(TAG, "startPlay:" + str + "record:" + z11);
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.mIsRunning) {
            TXCLog.w(TAG, "BGM is playing, restarting...");
            stopPlay();
        }
        this.mSeekBytes = 0L;
        this.mIsRunning = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(this.mBGMId, str);
        audioMusicParam.publish = z11;
        audioMusicParam.loopCount = 0;
        audioMusicParam.startTimeMS = this.mStartTimeMS;
        audioMusicParam.endTimeMS = this.mEndTimeMS;
        audioMusicParam.isShortFile = true;
        TXCLog.i(TAG, "start bgm play : filePath = " + str + " publish:" + z11 + " startTimeMS:" + this.mStartTimeMS + " endTimeMS:" + this.mEndTimeMS + " isShortFile:" + audioMusicParam.isShortFile + "mVolume:" + this.mVolume);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (this.mVolume * 100.0f));
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, this.mSpeedRate);
        if (z11) {
            TXAudioEffectManagerImpl.getCacheInstance().setMuteDataDurationToPublish(this.mBGMId, 200);
        }
        boolean startPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, this);
        if (startPlayMusic) {
            onPlayStart();
        } else {
            onPlayEnd(-1);
        }
    }

    public void stopPlay() {
        TXCLog.i(TAG, "stopPlay");
        this.mIsRunning = false;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, null);
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(this.mBGMId);
        }
        TXCLog.i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - currentTimeMillis));
    }

    private TXCUGCBGMPlayer() {
        this.mWeakListener = null;
        this.mIsRunning = false;
        this.mVolume = 1.0f;
        this.mSpeedRate = 1.0f;
        this.mStartTimeMS = 0L;
        this.mEndTimeMS = 0L;
        this.mSeekBytes = 0L;
        this.mBGMId = Integer.MIN_VALUE;
        TXCMultAudioTrackPlayer.getInstance();
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i11, long j11, long j12) {
        onPlayProgress(j11, j12);
    }
}
