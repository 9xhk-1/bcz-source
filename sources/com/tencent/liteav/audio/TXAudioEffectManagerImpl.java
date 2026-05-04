package com.tencent.liteav.audio;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final int NEW_BGM_PLAYER_ID_TYPE = 1;
    private static final int OLD_BGM_PLAYER_ID_TYPE = 0;
    private static final String TAG = "AudioCenter:TXAudioEffectManager";
    private TXAudioEffectManagerListener mAudioEffectManagerListener;
    private final int mIdType;
    private final List<Long> mPlayingMusicIDList;
    private static final HashMap<Long, TXAudioEffectManager.TXMusicPlayObserver> mMusicObserverMap = new HashMap<>();
    private static final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private static final b sCopyrightedMediaProcessor = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AudioEffectManagerAutoCacheHolder {
        private static final TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(1);

        private AudioEffectManagerAutoCacheHolder() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AudioEffectManagerCacheHolder {
        private static final TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(2);

        private AudioEffectManagerCacheHolder() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AudioEffectManagerHolder {
        private static final TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(0);

        private AudioEffectManagerHolder() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface TXAudioEffectManagerListener {
        void onSwitchVoiceEarMonitor(boolean z11);
    }

    static {
        h.d();
        nativeClassInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long convertIdToInt64(int i11, int i12) {
        return i12 | (i11 << 32);
    }

    public static TXAudioEffectManagerImpl getAutoCacheHolder() {
        return AudioEffectManagerAutoCacheHolder.INSTANCE;
    }

    public static TXAudioEffectManagerImpl getCacheInstance() {
        return AudioEffectManagerCacheHolder.INSTANCE;
    }

    public static TXAudioEffectManagerImpl getInstance() {
        return AudioEffectManagerHolder.INSTANCE;
    }

    private static native void nativeClassInit();

    private native long nativeGetAvailableBGMBytes(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeGetCurrentPositionInMs(long j11);

    private static native long nativeGetDurationMSByPath(String str);

    private native void nativePause(long j11);

    private native void nativeResume(long j11);

    private native void nativeSeekToPosition(long j11, long j12);

    private native void nativeSeekToTime(long j11, int i11);

    private native void nativeSetAllVolume(int i11);

    private native void nativeSetChangerType(long j11, int i11);

    private native void nativeSetMuteDataDurationToPublish(long j11, int i11);

    private native void nativeSetPitch(long j11, float f11);

    private native void nativeSetPlayoutSpeedRate(long j11, float f11);

    private native void nativeSetPlayoutVolume(long j11, int i11);

    private native void nativeSetPublishVolume(long j11, int i11);

    private native void nativeSetReverbType(long j11, int i11);

    private native void nativeSetSpeedRate(long j11, float f11);

    private native void nativeSetVolume(long j11, int i11);

    private native boolean nativeStartPlay(long j11, String str, int i11, boolean z11, boolean z12, boolean z13);

    private native void nativeStartPlayRange(long j11, long j12, long j13);

    private native void nativeStopPlay(long j11);

    public static void onEffectFinish(final long j11, final int i11) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.i(TXAudioEffectManagerImpl.TAG, "onEffectFinish -> effect id = " + ((int) j11) + ", errCode = " + i11);
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j11)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j11))).onComplete((int) j11, i11);
                }
                TXAudioEffectManagerImpl.sCopyrightedMediaProcessor.f(j11, TXAudioEffectManagerImpl.getAutoCacheHolder().nativeGetCurrentPositionInMs(j11));
            }
        });
    }

    public static void onEffectLoop(final long j11, final long j12) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.6
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.i(TXAudioEffectManagerImpl.TAG, "onEffectLoop -> id = " + ((int) j11) + " loopCountRemain = " + j12);
                TXAudioEffectManagerImpl.sCopyrightedMediaProcessor.e(j11, TXAudioEffectManagerImpl.getAutoCacheHolder().nativeGetCurrentPositionInMs(j11));
            }
        });
    }

    public static void onEffectProgress(final long j11, final long j12, final long j13) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.5
            @Override // java.lang.Runnable
            public void run() {
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j11)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j11))).onPlayProgress((int) j11, j12, j13);
                }
                TXAudioEffectManagerImpl.sCopyrightedMediaProcessor.a(j11, TXAudioEffectManagerImpl.getAutoCacheHolder().nativeGetCurrentPositionInMs(j11));
            }
        });
    }

    public static void onEffectStart(final long j11, final int i11) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.i(TXAudioEffectManagerImpl.TAG, "onEffectStart -> effect id = " + ((int) j11) + ", errCode = " + i11);
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j11)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j11))).onStart((int) j11, i11);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z11) {
        TXCLog.i(TAG, "enableVoiceEarMonitor enable:" + z11);
        TXAudioEffectManagerListener tXAudioEffectManagerListener = this.mAudioEffectManagerListener;
        if (tXAudioEffectManagerListener != null) {
            tXAudioEffectManagerListener.onSwitchVoiceEarMonitor(z11);
        }
        TXCAudioEngine.enableAudioEarMonitoring(z11);
    }

    public long getAvailableBGMBytes(int i11) {
        return nativeGetAvailableBGMBytes(convertIdToInt64(this.mIdType, i11));
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i11) {
        return nativeGetCurrentPositionInMs(convertIdToInt64(this.mIdType, i11));
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(String str) {
        String a11 = sCopyrightedMediaProcessor.a(str);
        if (TextUtils.isEmpty(a11)) {
            return -1L;
        }
        return nativeGetDurationMSByPath(a11);
    }

    public void interruptAllMusics() {
        TXCLog.i(TAG, "interruptAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            nativePause(it.next().longValue());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i11) {
        TXCLog.i(TAG, "pausePlayMusic id:" + i11);
        long convertIdToInt64 = convertIdToInt64(this.mIdType, i11);
        this.mPlayingMusicIDList.remove(Long.valueOf(convertIdToInt64));
        sCopyrightedMediaProcessor.b(convertIdToInt64, nativeGetCurrentPositionInMs(convertIdToInt64));
        nativePause(convertIdToInt64);
    }

    public boolean preloadMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        TXCLog.i("AudioBGMPlayer", "loadMusic");
        long max = Math.max(audioMusicParam.startTimeMS, 0L);
        long max2 = Math.max(audioMusicParam.endTimeMS, 0L);
        String a11 = sCopyrightedMediaProcessor.a(audioMusicParam.path);
        if (TextUtils.isEmpty(a11)) {
            return false;
        }
        long convertIdToInt64 = convertIdToInt64(this.mIdType, audioMusicParam.f42922id);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(convertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(convertIdToInt64));
        }
        nativeStartPlayRange(convertIdToInt64, max, max2);
        return nativeStartPlay(convertIdToInt64, a11, audioMusicParam.loopCount, audioMusicParam.publish, audioMusicParam.isShortFile, true);
    }

    public void recoverAllMusics() {
        TXCLog.i(TAG, "recoverAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            nativeResume(it.next().longValue());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i11) {
        TXCLog.i(TAG, "resumePlayMusic id:" + i11);
        long convertIdToInt64 = convertIdToInt64(this.mIdType, i11);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(convertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(convertIdToInt64));
        }
        sCopyrightedMediaProcessor.c(convertIdToInt64, nativeGetCurrentPositionInMs(convertIdToInt64));
        nativeResume(convertIdToInt64);
    }

    public void seekMusicToPosInBytes(int i11, long j11) {
        nativeSeekToPosition(convertIdToInt64(this.mIdType, i11), j11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i11, int i12) {
        long convertIdToInt64 = convertIdToInt64(this.mIdType, i11);
        sCopyrightedMediaProcessor.d(convertIdToInt64, i12);
        nativeSeekToTime(convertIdToInt64, i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i11) {
        nativeSetAllVolume(i11);
    }

    public void setAudioEffectManagerListener(TXAudioEffectManagerListener tXAudioEffectManagerListener) {
        this.mAudioEffectManagerListener = tXAudioEffectManagerListener;
    }

    public void setAudioPlayoutVolume(int i11) {
        TXCAudioEngine.getInstance().setMixingPlayoutVolume(i11 / 100.0f);
    }

    public void setMusicChangerType(int i11, int i12) {
        TXCLog.i(TAG, "setMusicChangerType id:" + i11 + " voiceChangerType:" + i12);
        nativeSetChangerType(convertIdToInt64(this.mIdType, i11), i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(final int i11, final TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (tXMusicPlayObserver == null) {
                    TXAudioEffectManagerImpl.mMusicObserverMap.remove(Long.valueOf(TXAudioEffectManagerImpl.convertIdToInt64(TXAudioEffectManagerImpl.this.mIdType, i11)));
                } else {
                    TXAudioEffectManagerImpl.mMusicObserverMap.put(Long.valueOf(TXAudioEffectManagerImpl.convertIdToInt64(TXAudioEffectManagerImpl.this.mIdType, i11)), tXMusicPlayObserver);
                }
                TXCLog.i(TXAudioEffectManagerImpl.TAG, "setMusicObserver map count: %d", Integer.valueOf(TXAudioEffectManagerImpl.mMusicObserverMap.size()));
            }
        };
        Looper myLooper = Looper.myLooper();
        Handler handler = mMainHandler;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i11, float f11) {
        nativeSetPitch(convertIdToInt64(this.mIdType, i11), f11);
    }

    public void setMusicPlayoutSpeedRate(int i11, float f11) {
        nativeSetPlayoutSpeedRate(convertIdToInt64(this.mIdType, i11), f11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i11, int i12) {
        nativeSetPlayoutVolume(convertIdToInt64(this.mIdType, i11), i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i11, int i12) {
        nativeSetPublishVolume(convertIdToInt64(this.mIdType, i11), i12);
    }

    public void setMusicReverbType(int i11, int i12) {
        TXCLog.i(TAG, "setMusicReverbType id:" + i11 + " reverbType:" + i12);
        nativeSetReverbType(convertIdToInt64(this.mIdType, i11), i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i11, float f11) {
        nativeSetSpeedRate(convertIdToInt64(this.mIdType, i11), f11);
    }

    public void setMusicVolume(int i11, int i12) {
        TXCLog.i(TAG, "setMusicVolume " + i12);
        nativeSetVolume(convertIdToInt64(this.mIdType, i11), i12);
    }

    public void setMuteDataDurationToPublish(int i11, int i12) {
        TXCLog.i(TAG, "setMuteDataDurationToPublish id:" + i11 + " millis:" + i12);
        nativeSetMuteDataDurationToPublish(convertIdToInt64(this.mIdType, i11), i12);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i11) {
        TXCAudioEngine.getInstance().setSoftwareCaptureVolume(i11 / 100.0f);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCLog.i(TAG, "setVoiceChangerType voiceChangerType:" + tXVoiceChangerType);
        TXCAudioEngine.getInstance().setVoiceChangerType(tXVoiceChangerType);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i11) {
        TXCAudioEngine.setAudioEarMonitoringVolume(i11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        TXCLog.i(TAG, "setVoiceReverbType reverbType:" + tXVoiceReverbType);
        TXCAudioEngine.getInstance().setReverbType(tXVoiceReverbType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || TextUtils.isEmpty(audioMusicParam.path)) {
            TXCLog.e(TAG, "startPlayMusic failed. invalid param:" + audioMusicParam);
            return false;
        }
        TXCLog.i(TAG, "startPlayMusic param:" + audioMusicParam);
        long j11 = audioMusicParam.startTimeMS;
        long j12 = audioMusicParam.endTimeMS;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j12 < 0 ? 0L : j12;
        b bVar = sCopyrightedMediaProcessor;
        String a11 = bVar.a(audioMusicParam.path);
        if (TextUtils.isEmpty(a11)) {
            return false;
        }
        long convertIdToInt64 = convertIdToInt64(this.mIdType, audioMusicParam.f42922id);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(convertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(convertIdToInt64));
        }
        bVar.a(convertIdToInt64, audioMusicParam.path);
        nativeStartPlayRange(convertIdToInt64, j11, j13);
        return nativeStartPlay(convertIdToInt64, a11, audioMusicParam.loopCount, audioMusicParam.publish, audioMusicParam.isShortFile, false);
    }

    public void stopAllMusics() {
        TXCLog.i(TAG, "stopAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            final long longValue = it.next().longValue();
            nativeStopPlay(longValue);
            mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    TXAudioEffectManagerImpl.mMusicObserverMap.remove(Long.valueOf(longValue));
                }
            });
        }
        this.mPlayingMusicIDList.clear();
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i11) {
        TXCLog.i(TAG, "stopPlayMusic id:" + i11);
        long convertIdToInt64 = convertIdToInt64(this.mIdType, i11);
        this.mPlayingMusicIDList.remove(Long.valueOf(convertIdToInt64));
        sCopyrightedMediaProcessor.f(convertIdToInt64, nativeGetCurrentPositionInMs(convertIdToInt64));
        nativeStopPlay(convertIdToInt64);
    }

    private TXAudioEffectManagerImpl(int i11) {
        this.mPlayingMusicIDList = new ArrayList();
        this.mIdType = i11;
    }
}
