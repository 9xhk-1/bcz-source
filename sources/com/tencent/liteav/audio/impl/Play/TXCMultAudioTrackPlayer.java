package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import android.media.AudioTrack;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCMultAudioTrackPlayer {
    private static final String TAG = "AudioCenter:" + TXCMultAudioTrackPlayer.class.getSimpleName();
    private int mAudioMode;
    private AudioTrackThread mAudioThread;
    private volatile boolean mAudioTrackStarted;
    private int mBits;
    private int mChannel;
    private Context mContext;
    private volatile boolean mIsStarted;
    private boolean mMute;
    private int mSampleRate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AudioTrackThread extends Thread {
        volatile boolean mIsLooping;

        public AudioTrackThread(String str) {
            super(str);
            this.mIsLooping = false;
        }

        public void startLoop() {
            this.mIsLooping = true;
        }

        public void stopLoop() {
            this.mIsLooping = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TXCMultAudioTrackPlayerHolder {
        private static TXCMultAudioTrackPlayer instance = new TXCMultAudioTrackPlayer();

        private TXCMultAudioTrackPlayerHolder() {
        }

        public static TXCMultAudioTrackPlayer getInstance() {
            return instance;
        }
    }

    public static TXCMultAudioTrackPlayer getInstance() {
        return TXCMultAudioTrackPlayerHolder.getInstance();
    }

    private native void nativeClassInit();

    /* JADX INFO: Access modifiers changed from: private */
    public native byte[] nativeGetMixedTracksDataToAudioTrack();

    public boolean isPlaying() {
        return this.mIsStarted;
    }

    public synchronized void setAudioMode(Context context, int i11) {
        try {
            this.mContext = context;
            this.mAudioMode = i11;
            if (this.mAudioTrackStarted) {
                TXCLog.w(TAG, "mult-track-player setAudioRoute~");
            } else {
                TXCLog.w(TAG, "mult-track-player do'not setAudioRoute~");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setMute(boolean z11) {
        this.mMute = z11;
    }

    public void start() {
        String str = TAG;
        TXCLog.w(str, "mult-track-player start!");
        if (this.mIsStarted) {
            TXCLog.e(str, "mult-track-player can not start because of has started!");
            return;
        }
        if (this.mSampleRate == 0 || this.mChannel == 0) {
            TXCLog.e(str, "strat mult-track-player failed with invalid audio info , samplerate:" + this.mSampleRate + ", channels:" + this.mChannel);
            return;
        }
        this.mIsStarted = true;
        if (this.mAudioThread == null) {
            AudioTrackThread audioTrackThread = new AudioTrackThread("AUDIO_TRACK") { // from class: com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        int i11 = TXCMultAudioTrackPlayer.this.mChannel == 1 ? 2 : 3;
                        int i12 = TXCMultAudioTrackPlayer.this.mBits == 8 ? 3 : 2;
                        int minBufferSize = AudioTrack.getMinBufferSize(TXCMultAudioTrackPlayer.this.mSampleRate, i11, i12);
                        AudioTrack audioTrack = new AudioTrack(3, TXCMultAudioTrackPlayer.this.mSampleRate, i11, i12, minBufferSize, 1);
                        TXCLog.i(TXCMultAudioTrackPlayer.TAG, "create audio track, samplerate:" + TXCMultAudioTrackPlayer.this.mSampleRate + ", channels:" + TXCMultAudioTrackPlayer.this.mChannel + ", bits:" + TXCMultAudioTrackPlayer.this.mBits + " mMinBufferLength:" + minBufferSize);
                        try {
                            audioTrack.play();
                            TXCMultAudioTrackPlayer.this.mAudioTrackStarted = true;
                            TXCMultAudioTrackPlayer tXCMultAudioTrackPlayer = TXCMultAudioTrackPlayer.this;
                            tXCMultAudioTrackPlayer.setAudioMode(tXCMultAudioTrackPlayer.mContext, TXCMultAudioTrackPlayer.this.mAudioMode);
                            int i13 = 100;
                            int i14 = 0;
                            while (this.mIsLooping) {
                                byte[] nativeGetMixedTracksDataToAudioTrack = TXCMultAudioTrackPlayer.this.nativeGetMixedTracksDataToAudioTrack();
                                if (nativeGetMixedTracksDataToAudioTrack == null || nativeGetMixedTracksDataToAudioTrack.length <= 0) {
                                    try {
                                        Thread.sleep(5L);
                                    } catch (InterruptedException unused) {
                                    }
                                } else {
                                    TXCAudioEngine.onCorePlayPcmData(nativeGetMixedTracksDataToAudioTrack, 0L, TXCMultAudioTrackPlayer.this.mSampleRate, TXCMultAudioTrackPlayer.this.mChannel);
                                    if (TXCMultAudioTrackPlayer.this.mMute) {
                                        Arrays.fill(nativeGetMixedTracksDataToAudioTrack, (byte) 0);
                                    }
                                    if (i13 != 0 && i14 < 800) {
                                        int length = nativeGetMixedTracksDataToAudioTrack.length / 2;
                                        short[] sArr = new short[length];
                                        ByteBuffer.wrap(nativeGetMixedTracksDataToAudioTrack).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                                        for (int i15 = 0; i15 < length; i15++) {
                                            sArr[i15] = (short) (sArr[i15] / i13);
                                        }
                                        ByteBuffer.wrap(nativeGetMixedTracksDataToAudioTrack).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr);
                                        i14 += nativeGetMixedTracksDataToAudioTrack.length / ((TXCMultAudioTrackPlayer.this.mSampleRate * 2) / 1000);
                                        i13 = (i13 * (800 - i14)) / 800;
                                    }
                                    audioTrack.write(nativeGetMixedTracksDataToAudioTrack, 0, nativeGetMixedTracksDataToAudioTrack.length);
                                }
                            }
                            try {
                                audioTrack.pause();
                                audioTrack.flush();
                                audioTrack.stop();
                                audioTrack.release();
                            } catch (Exception e11) {
                                TXCLog.e(TXCMultAudioTrackPlayer.TAG, "stop AudioTrack failed.", e11);
                            }
                            TXCLog.e(TXCMultAudioTrackPlayer.TAG, "mult-player thread stop finish!");
                        } catch (Exception e12) {
                            TXCLog.e(TXCMultAudioTrackPlayer.TAG, "start play failed.", e12);
                        }
                    } catch (Exception e13) {
                        TXCLog.e(TXCMultAudioTrackPlayer.TAG, "create AudioTrack failed.", e13);
                    }
                }
            };
            this.mAudioThread = audioTrackThread;
            audioTrackThread.startLoop();
            this.mAudioThread.start();
        }
        TXCLog.w(str, "mult-track-player thread start finish!");
    }

    public void stop() {
        String str = TAG;
        TXCLog.w(str, "mult-track-player stop!");
        if (!this.mIsStarted) {
            TXCLog.w(str, "mult-track-player can not stop because of not started yet!");
            return;
        }
        AudioTrackThread audioTrackThread = this.mAudioThread;
        if (audioTrackThread != null) {
            audioTrackThread.stopLoop();
            this.mAudioThread = null;
        }
        this.mAudioMode = 0;
        this.mContext = null;
        this.mAudioTrackStarted = false;
        this.mIsStarted = false;
        TXCLog.w(str, "mult-track-player stop finish!");
    }

    private TXCMultAudioTrackPlayer() {
        this.mAudioThread = null;
        this.mMute = false;
        this.mIsStarted = false;
        this.mAudioTrackStarted = false;
        this.mContext = null;
        this.mAudioMode = 0;
        this.mSampleRate = 48000;
        this.mChannel = 2;
        this.mBits = 16;
        nativeClassInit();
    }
}
