package com.tencent.liteav.audio;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCLiveBGMPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int PLAY_ERR_OPEN = -1;
    private static final int PLAY_SUCCESS = 0;
    private static final String TAG = "AudioCenter:TXCLiveBGMPlayer";
    private int mBGMId;
    private final Handler mHandler;
    private boolean mIsPause;
    private boolean mIsRunning;
    private WeakReference<g> mWeakListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static TXCLiveBGMPlayer f42933a = new TXCLiveBGMPlayer();

        public static TXCLiveBGMPlayer a() {
            return f42933a;
        }
    }

    static {
        h.d();
    }

    public static TXCLiveBGMPlayer getInstance() {
        return a.a();
    }

    private void onPlayEnd(final int i11) {
        final g gVar;
        synchronized (this) {
            try {
                WeakReference<g> weakReference = this.mWeakListener;
                gVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXCLiveBGMPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                g gVar2 = gVar;
                if (gVar2 != null) {
                    gVar2.a(i11);
                }
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0027
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void onPlayProgress(final long r9, final long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.ref.WeakReference<com.tencent.liteav.audio.g> r0 = r8.mWeakListener     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Ld
            com.tencent.liteav.audio.g r0 = (com.tencent.liteav.audio.g) r0     // Catch: java.lang.Throwable -> Ld
        Lb:
            r3 = r0
            goto L13
        Ld:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L25
        L11:
            r0 = 0
            goto Lb
        L13:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r0 = r8.mHandler
            com.tencent.liteav.audio.TXCLiveBGMPlayer$3 r1 = new com.tencent.liteav.audio.TXCLiveBGMPlayer$3
            r2 = r8
            r4 = r9
            r6 = r11
            r1.<init>()
            r0.post(r1)
            return
        L22:
            r0 = move-exception
            r2 = r8
        L24:
            r9 = r0
        L25:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L27
            throw r9
        L27:
            r0 = move-exception
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.TXCLiveBGMPlayer.onPlayProgress(long, long):void");
    }

    private void onPlayStart(int i11) {
        final g gVar;
        synchronized (this) {
            try {
                WeakReference<g> weakReference = this.mWeakListener;
                gVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXCLiveBGMPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                g gVar2 = gVar;
                if (gVar2 != null) {
                    gVar2.a();
                }
            }
        });
    }

    public int getBGMDuration(String str) {
        return (int) TXAudioEffectManagerImpl.getInstance().getMusicDurationInMS(str);
    }

    public long getBGMGetCurrentProgressInMs(String str) {
        if (str == null) {
            return TXAudioEffectManagerImpl.getInstance().getMusicCurrentPosInMS(this.mBGMId);
        }
        return 0L;
    }

    public boolean isPlaying() {
        return this.mIsRunning;
    }

    public boolean isRunning() {
        return this.mIsRunning && !this.mIsPause;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i11, int i12) {
        onPlayEnd(i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i11, int i12) {
        onPlayStart(i12);
    }

    public boolean pause() {
        TXCLog.i(TAG, ma.b.L);
        this.mIsPause = true;
        TXAudioEffectManagerImpl.getInstance().pausePlayMusic(this.mBGMId);
        return true;
    }

    public boolean resume() {
        TXCLog.i(TAG, ma.b.K);
        this.mIsPause = false;
        TXAudioEffectManagerImpl.getInstance().resumePlayMusic(this.mBGMId);
        return true;
    }

    public void setBGMPosition(int i11) {
        TXAudioEffectManagerImpl.getInstance().seekMusicToPosInMS(this.mBGMId, i11);
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

    public void setPitch(float f11) {
        TXAudioEffectManagerImpl.getInstance().setMusicPitch(this.mBGMId, f11);
    }

    public boolean setPlayoutVolume(float f11) {
        TXCLog.i(TAG, "setPlayoutVolume:" + f11);
        TXAudioEffectManagerImpl.getInstance().setMusicPlayoutVolume(this.mBGMId, (int) (f11 * 100.0f));
        return true;
    }

    public boolean setPublishVolume(float f11) {
        TXAudioEffectManagerImpl.getInstance().setMusicPublishVolume(this.mBGMId, (int) (f11 * 100.0f));
        return true;
    }

    public boolean setVolume(float f11) {
        TXCLog.i(TAG, "setVolume");
        TXAudioEffectManagerImpl.getInstance().setMusicVolume(this.mBGMId, (int) (f11 * 100.0f));
        return true;
    }

    public boolean startPlay(String str) {
        if (str == null || str.isEmpty()) {
            TXCLog.e(TAG, "start live bgm failed! invalid params!");
            return false;
        }
        this.mIsRunning = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(this.mBGMId, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        boolean startPlayMusic = TXAudioEffectManagerImpl.getInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getInstance().setMusicObserver(this.mBGMId, this);
        if (!startPlayMusic) {
            onPlayEnd(-1);
            return false;
        }
        TXCLog.i(TAG, "start bgm play : filePath = " + str);
        return true;
    }

    public void stopAll() {
        TXAudioEffectManagerImpl.getInstance().stopAllMusics();
        TXAudioEffectManagerImpl.getAutoCacheHolder().stopAllMusics();
        TXAudioEffectManagerImpl.getCacheInstance().stopAllMusics();
    }

    public boolean stopPlay() {
        this.mIsRunning = false;
        long currentTimeMillis = System.currentTimeMillis();
        TXAudioEffectManagerImpl.getInstance().setMusicObserver(this.mBGMId, null);
        TXAudioEffectManagerImpl.getInstance().stopPlayMusic(this.mBGMId);
        this.mIsPause = false;
        TXCLog.i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - currentTimeMillis));
        return true;
    }

    private TXCLiveBGMPlayer() {
        this.mIsRunning = false;
        this.mIsPause = false;
        this.mWeakListener = null;
        this.mBGMId = Integer.MAX_VALUE;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i11, long j11, long j12) {
        onPlayProgress(j11, j12);
    }
}
