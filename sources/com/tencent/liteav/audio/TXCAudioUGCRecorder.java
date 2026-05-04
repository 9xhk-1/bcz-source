package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioUGCRecorder implements com.tencent.liteav.audio.impl.Record.c {
    private static final TXCAudioUGCRecorder INSTANCE;
    private static final String TAG = "AudioCenter:TXCAudioUGCRecorder";
    protected Context mContext;
    private WeakReference<f> mWeakRecordListener;
    private final int AAC_SAMPLE_NUM = 1024;
    protected AtomicInteger mSampleRate = new AtomicInteger(48000);
    protected int mChannels = 1;
    protected int mBits = 16;
    protected int mAACFrameLength = (1024 * 16) / 8;
    protected int mReverbType = 0;
    protected int mVoiceChangerType = 0;
    protected int mAECType = 0;
    protected boolean mIsEarphoneOn = false;
    private long mLastPTS = 0;
    private float mVolume = 1.0f;
    private com.tencent.liteav.audio.impl.Record.a mBGMRecorder = null;
    private boolean mEnableBGMRecord = false;
    private int mShouldClearAACDataCnt = 0;
    private boolean mCurBGMRecordFlag = false;
    private AtomicReference<Float> mSpeedRate = new AtomicReference<>(Float.valueOf(1.0f));
    private boolean mIsRunning = false;
    private boolean mIsPause = false;
    private boolean mIsMute = false;
    private final List<byte[]> mEncodedAudioList = new ArrayList();

    static {
        h.d();
        INSTANCE = new TXCAudioUGCRecorder();
    }

    private TXCAudioUGCRecorder() {
        TXCAudioSysRecord.getInstance();
        nativeClassInit();
    }

    public static TXCAudioUGCRecorder getInstance() {
        return INSTANCE;
    }

    private native void nativeClassInit();

    private native void nativeEnableMixMode(boolean z11);

    private native void nativeSetChangerType(int i11);

    private native void nativeSetReverbType(int i11);

    private native void nativeSetSpeedRate(float f11);

    private native void nativeSetVolume(float f11);

    private native void nativeStartAudioRecord(int i11, int i12, int i13);

    private native void nativeStopAudioRecord();

    private synchronized void updateAudioEffector() {
        try {
            boolean z11 = true;
            if (!this.mEnableBGMRecord && this.mAECType != 1) {
                z11 = false;
            }
            if (!z11) {
                nativeSetReverbType(this.mReverbType);
                nativeSetChangerType(this.mVoiceChangerType);
                if (this.mIsMute) {
                    nativeSetVolume(0.0f);
                } else {
                    nativeSetVolume(this.mVolume);
                }
            }
            if (z11) {
                nativeSetVolume(0.0f);
            }
            nativeEnableMixMode(z11);
            nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clearCache() {
        TXCLog.i(TAG, "clearCache");
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
    }

    public void enableBGMRecord(boolean z11) {
        TXCLog.i(TAG, "enableBGMRecord: " + z11);
        if (this.mEnableBGMRecord != z11 && !z11) {
            this.mShouldClearAACDataCnt = 2;
        }
        this.mEnableBGMRecord = z11;
        updateAudioEffector();
    }

    public int getAECType() {
        return this.mAECType;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public synchronized boolean getIsMute() {
        return this.mIsMute;
    }

    public f getListener() {
        WeakReference<f> weakReference = this.mWeakRecordListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getSampleRate() {
        return this.mSampleRate.get();
    }

    public boolean isPaused() {
        return this.mIsPause;
    }

    public boolean isRecording() {
        return this.mIsRunning;
    }

    @Override // com.tencent.liteav.audio.impl.Record.c
    public void onAudioRecordError(int i11, String str) {
        TXCLog.e(TAG, "sys audio record error: " + i11 + j2.O + str);
        f listener = getListener();
        if (listener != null) {
            listener.a(i11, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x000d, B:10:0x0016, B:12:0x001a, B:14:0x002c, B:17:0x0038, B:19:0x0040, B:20:0x0055, B:22:0x005d, B:23:0x004e, B:24:0x0070), top: B:7:0x000d }] */
    @Override // com.tencent.liteav.audio.impl.Record.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAudioRecordPCM(byte[] r8, int r9, long r10) {
        /*
            r7 = this;
            long r8 = r7.mLastPTS
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L9
            r10 = 2
            long r10 = r10 + r8
        L9:
            r2 = r10
        La:
            java.util.List<byte[]> r8 = r7.mEncodedAudioList
            monitor-enter(r8)
            java.util.List<byte[]> r9 = r7.mEncodedAudioList     // Catch: java.lang.Throwable -> L32
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L32
            r10 = 0
            if (r9 != 0) goto L30
            boolean r9 = r7.mIsPause     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L30
            java.util.List<byte[]> r9 = r7.mEncodedAudioList     // Catch: java.lang.Throwable -> L32
            r11 = 0
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> L32
            byte[] r9 = (byte[]) r9     // Catch: java.lang.Throwable -> L32
            java.util.List<byte[]> r0 = r7.mEncodedAudioList     // Catch: java.lang.Throwable -> L32
            r0.remove(r11)     // Catch: java.lang.Throwable -> L32
            int r11 = r7.mShouldClearAACDataCnt     // Catch: java.lang.Throwable -> L32
            if (r11 <= 0) goto L35
            int r11 = r11 + (-1)
            r7.mShouldClearAACDataCnt = r11     // Catch: java.lang.Throwable -> L32
        L30:
            r1 = r10
            goto L36
        L32:
            r0 = move-exception
            r9 = r0
            goto L74
        L35:
            r1 = r9
        L36:
            if (r1 == 0) goto L70
            r7.mLastPTS = r2     // Catch: java.lang.Throwable -> L32
            com.tencent.liteav.audio.f r0 = r7.getListener()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicInteger r9 = r7.mSampleRate     // Catch: java.lang.Throwable -> L32
            int r4 = r9.get()     // Catch: java.lang.Throwable -> L32
            int r5 = r7.mChannels     // Catch: java.lang.Throwable -> L32
            int r6 = r7.mBits     // Catch: java.lang.Throwable -> L32
            r0.b(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            goto L55
        L4e:
            java.lang.String r9 = "AudioCenter:TXCAudioUGCRecorder"
            java.lang.String r10 = "onAudioRecordPCM listener is null"
            com.tencent.liteav.basic.log.TXCLog.e(r9, r10)     // Catch: java.lang.Throwable -> L32
        L55:
            java.util.concurrent.atomic.AtomicInteger r9 = r7.mSampleRate     // Catch: java.lang.Throwable -> L32
            int r9 = r9.get()     // Catch: java.lang.Throwable -> L32
            if (r9 <= 0) goto L70
            java.util.concurrent.atomic.AtomicReference<java.lang.Float> r10 = r7.mSpeedRate     // Catch: java.lang.Throwable -> L32
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L32
            java.lang.Float r10 = (java.lang.Float) r10     // Catch: java.lang.Throwable -> L32
            float r10 = r10.floatValue()     // Catch: java.lang.Throwable -> L32
            r11 = 1232732160(0x497a0000, float:1024000.0)
            float r10 = r10 * r11
            float r9 = (float) r9     // Catch: java.lang.Throwable -> L32
            float r10 = r10 / r9
            long r9 = (long) r10     // Catch: java.lang.Throwable -> L32
            long r2 = r2 + r9
        L70:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto La
            return
        L74:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.TXCAudioUGCRecorder.onAudioRecordPCM(byte[], int, long):void");
    }

    @Override // com.tencent.liteav.audio.impl.Record.c
    public void onAudioRecordStart() {
        TXCLog.i(TAG, "sys audio record start");
    }

    @Override // com.tencent.liteav.audio.impl.Record.c
    public void onAudioRecordStop() {
        TXCLog.i(TAG, "sys audio record stop");
    }

    public void onEncodedData(byte[] bArr) {
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.add(bArr);
        }
    }

    public void pause() {
        TXCLog.i(TAG, ma.b.L);
        TXCAudioEngine.getInstance().pauseLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = true;
        }
    }

    public void resume() {
        TXCLog.i(TAG, ma.b.K);
        TXCAudioEngine.getInstance().resumeLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = false;
        }
        nativeEnableMixMode(this.mEnableBGMRecord);
        if (this.mIsMute || this.mEnableBGMRecord) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public void setAECType(int i11, Context context) {
        TXCLog.i(TAG, "setAECType: 0");
        this.mAECType = 0;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public synchronized void setChangerType(int i11) {
        TXCLog.i(TAG, "setChangerType: " + i11);
        this.mVoiceChangerType = i11;
        nativeSetChangerType(i11);
    }

    public void setChannels(int i11) {
        TXCLog.i(TAG, "setChannels: " + i11);
        this.mChannels = i11;
    }

    public synchronized void setListener(f fVar) {
        try {
            if (fVar == null) {
                this.mWeakRecordListener = null;
            } else {
                this.mWeakRecordListener = new WeakReference<>(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setMute(boolean z11) {
        TXCLog.i(TAG, "setMute: " + z11);
        this.mIsMute = z11;
        if (z11) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public synchronized void setReverbType(int i11) {
        TXCLog.i(TAG, "setReverbType: " + i11);
        this.mReverbType = i11;
        nativeSetReverbType(i11);
    }

    public void setSampleRate(int i11) {
        TXCLog.i(TAG, "setSampleRate: " + i11);
        this.mSampleRate.set(i11);
    }

    public synchronized void setSpeedRate(float f11) {
        TXCLog.i(TAG, "setSpeedRate: " + f11);
        this.mSpeedRate.set(Float.valueOf(f11));
        nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
    }

    public synchronized void setVolume(float f11) {
        try {
            TXCLog.i(TAG, "setVolume: " + f11);
            this.mVolume = f11;
            if (this.mIsMute) {
                nativeSetVolume(0.0f);
            } else {
                nativeSetVolume(f11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int startRecord(Context context) {
        TXCLog.i(TAG, "startRecord");
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        updateAudioEffector();
        TXCAudioSysRecord.getInstance().setAudioRecordListener(this);
        nativeStartAudioRecord(this.mSampleRate.get(), this.mChannels, this.mBits);
        this.mIsRunning = true;
        this.mLastPTS = 0L;
        return 0;
    }

    public int stopRecord() {
        TXCLog.i(TAG, "stopRecord");
        TXCAudioSysRecord.getInstance().setAudioRecordListener(null);
        com.tencent.liteav.audio.impl.Record.a aVar = this.mBGMRecorder;
        if (aVar != null) {
            aVar.a();
            this.mBGMRecorder = null;
        }
        nativeStopAudioRecord();
        nativeEnableMixMode(false);
        nativeSetVolume(1.0f);
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
        this.mIsRunning = false;
        this.mLastPTS = 0L;
        this.mIsPause = false;
        this.mIsMute = false;
        this.mShouldClearAACDataCnt = 0;
        return 0;
    }
}
