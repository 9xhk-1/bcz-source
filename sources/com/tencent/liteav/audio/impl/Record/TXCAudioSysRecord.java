package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import android.media.AudioRecord;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioSysRecord implements Runnable {
    private static final String TAG = "AudioCenter:" + TXCAudioSysRecord.class.getSimpleName();
    private static TXCAudioSysRecord instance = null;
    private Context mContext;
    private AudioRecord mMic;
    private WeakReference<c> mWeakRefListener;
    private int mSampleRate = 48000;
    private int mChannels = 1;
    private int mBits = 16;
    private int mAECType = 0;
    private byte[] mRecordBuffer = null;
    private Thread mRecordThread = null;
    private boolean mIsRunning = false;
    private boolean mIsCapFirstFrame = false;
    private boolean mSendMuteData = false;
    private AtomicBoolean mPause = new AtomicBoolean(false);
    private Object threadMutex = new Object();

    private TXCAudioSysRecord() {
        nativeClassInit();
    }

    public static TXCAudioSysRecord getInstance() {
        if (instance == null) {
            synchronized (TXCAudioSysRecord.class) {
                try {
                    if (instance == null) {
                        instance = new TXCAudioSysRecord();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private void init() {
        int i11 = this.mSampleRate;
        int i12 = this.mChannels;
        int i13 = this.mBits;
        int i14 = this.mAECType;
        String str = TAG;
        TXCLog.i(str, String.format("audio record sampleRate = %d, channels = %d, bits = %d, aectype = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        int i15 = i12 == 1 ? 16 : 12;
        int i16 = i13 == 8 ? 3 : 2;
        int minBufferSize = AudioRecord.getMinBufferSize(i11, i15, i16);
        try {
            TXCLog.i(str, "audio record type: system normal");
            this.mMic = new AudioRecord(1, i11, i15, i16, minBufferSize * 2);
        } catch (IllegalArgumentException e11) {
            TXCLog.e(TAG, "create AudioRecord failed.", e11);
        }
        AudioRecord audioRecord = this.mMic;
        if (audioRecord == null || audioRecord.getState() != 1) {
            TXCLog.e(TAG, "audio record: initialize the mic failed.");
            uninit();
            onRecordError(-1, "microphone permission denied!");
            return;
        }
        int i17 = ((i12 * 1024) * i13) / 8;
        if (i17 > minBufferSize) {
            this.mRecordBuffer = new byte[minBufferSize];
        } else {
            this.mRecordBuffer = new byte[i17];
        }
        TXCLog.i(TAG, String.format("audio record: mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(minBufferSize), Integer.valueOf(this.mRecordBuffer.length), Integer.valueOf(this.mMic.getState())));
        AudioRecord audioRecord2 = this.mMic;
        if (audioRecord2 != null) {
            try {
                audioRecord2.startRecording();
            } catch (Exception e12) {
                TXCLog.e(TAG, "mic startRecording failed.", e12);
                onRecordError(-1, "start recording failed!");
            }
        }
    }

    private native void nativeClassInit();

    private native void nativeSendSysRecordAudioData(byte[] bArr, int i11, int i12, int i13, int i14);

    private void onRecordError(int i11, String str) {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.mWeakRefListener;
                cVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.onAudioRecordError(i11, str);
        } else {
            TXCLog.e(TAG, "onRecordError:no callback");
        }
    }

    private void onRecordPcmData(byte[] bArr, int i11, long j11) {
        WeakReference<c> weakReference = this.mWeakRefListener;
        c cVar = weakReference != null ? weakReference.get() : null;
        if (cVar != null) {
            cVar.onAudioRecordPCM(bArr, i11, j11);
        } else {
            TXCLog.e(TAG, "onRecordPcmData:no callback");
        }
    }

    private void onRecordStart() {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.mWeakRefListener;
                cVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.onAudioRecordStart();
        } else {
            TXCLog.e(TAG, "onRecordStart:no callback");
        }
    }

    private void onRecordStop() {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.mWeakRefListener;
                cVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.onAudioRecordStop();
        } else {
            TXCLog.e(TAG, "onRecordStop:no callback");
        }
    }

    private void uninit() {
        if (this.mMic != null) {
            TXCLog.i(TAG, "stop mic");
            try {
                this.mMic.setRecordPositionUpdateListener(null);
                this.mMic.stop();
                this.mMic.release();
            } catch (Exception e11) {
                TXCLog.e(TAG, "stop AudioRecord failed.", e11);
            }
        }
        this.mMic = null;
        this.mRecordBuffer = null;
        this.mIsCapFirstFrame = false;
    }

    public synchronized boolean isRecording() {
        return this.mIsRunning;
    }

    public void pause(boolean z11) {
        TXCLog.i(TAG, "system audio record pause");
        this.mPause.set(true);
        this.mSendMuteData = z11;
    }

    public void resume() {
        TXCLog.i(TAG, "system audio record resume");
        this.mPause.set(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i11;
        if (!this.mIsRunning) {
            TXCLog.w(TAG, "audio record: abandom start audio sys record thread!");
            return;
        }
        onRecordStart();
        TXCLog.i(TAG, "start capture audio data ...,mIsRunning:" + this.mIsRunning + " Thread.interrupted:" + Thread.interrupted() + " mMic:" + this.mMic);
        init();
        loop0: while (true) {
            i11 = 0;
            int i12 = 0;
            while (this.mIsRunning && !Thread.interrupted() && this.mMic != null && i11 <= 5) {
                System.currentTimeMillis();
                AudioRecord audioRecord = this.mMic;
                byte[] bArr = this.mRecordBuffer;
                int read = audioRecord.read(bArr, i12, bArr.length - i12);
                if (read == this.mRecordBuffer.length - i12) {
                    if (!this.mIsCapFirstFrame) {
                        onRecordError(-6, "First frame captured#");
                        this.mIsCapFirstFrame = true;
                    }
                    if (this.mSendMuteData) {
                        Arrays.fill(this.mRecordBuffer, (byte) 0);
                    }
                    if (!this.mPause.get() || this.mSendMuteData) {
                        byte[] bArr2 = this.mRecordBuffer;
                        onRecordPcmData(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
                        byte[] bArr3 = this.mRecordBuffer;
                        nativeSendSysRecordAudioData(bArr3, bArr3.length, this.mSampleRate, this.mChannels, this.mBits);
                    }
                } else if (read <= 0) {
                    TXCLog.e(TAG, "read pcm error, len =" + read);
                    i11++;
                } else {
                    i12 += read;
                }
            }
        }
        TXCLog.d(TAG, "stop capture audio data ...,mIsRunning:" + this.mIsRunning + " mMic:" + this.mMic + " nFailedCount:" + i11);
        uninit();
        if (i11 > 5) {
            onRecordError(-1, "read data failed!");
        } else {
            onRecordStop();
        }
    }

    public synchronized void setAudioRecordListener(c cVar) {
        try {
            if (cVar == null) {
                this.mWeakRefListener = null;
            } else {
                this.mWeakRefListener = new WeakReference<>(cVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void start(int i11, int i12, int i13) {
        String str = TAG;
        TXCLog.i(str, TtmlNode.START);
        synchronized (this.threadMutex) {
            stop();
            this.mSampleRate = i11;
            this.mChannels = i12;
            this.mBits = i13;
            this.mIsRunning = true;
            Thread thread = new Thread(this, "AudioSysRecord Thread");
            this.mRecordThread = thread;
            thread.start();
        }
        TXCLog.i(str, "start ok");
    }

    public void stop() {
        String str;
        TXCLog.i(TAG, "stop");
        synchronized (this.threadMutex) {
            this.mIsRunning = false;
            long currentTimeMillis = System.currentTimeMillis();
            Thread thread = this.mRecordThread;
            if (thread != null && thread.isAlive() && Thread.currentThread().getId() != this.mRecordThread.getId()) {
                try {
                    this.mRecordThread.join();
                } catch (Exception e11) {
                    TXCLog.e(TAG, "record stop Exception: " + e11.getMessage());
                }
            }
            str = TAG;
            TXCLog.i(str, "stop ok,stop record cost time(MS): " + (System.currentTimeMillis() - currentTimeMillis));
            this.mRecordThread = null;
        }
        TXCLog.i(str, "stop ok");
    }
}
