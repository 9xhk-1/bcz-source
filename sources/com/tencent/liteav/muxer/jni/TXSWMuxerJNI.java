package com.tencent.liteav.muxer.jni;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXSWMuxerJNI {

    /* renamed from: a, reason: collision with root package name */
    private long f43665a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f43666b = true;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f43667c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AVOptions {
        public int videoWidth = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        public int videoHeight = 540;
        public int videoGOP = 12;
        public int audioSampleRate = 0;
        public int audioChannels = 0;
    }

    public TXSWMuxerJNI() {
        this.f43665a = -1L;
        this.f43665a = init();
    }

    private native long init();

    private native void release(long j11);

    private native void setAVParams(long j11, AVOptions aVOptions);

    private native void setAudioCSD(long j11, byte[] bArr);

    private native void setDstPath(long j11, String str);

    private native void setVideoCSD(long j11, byte[] bArr, byte[] bArr2);

    private native int start(long j11);

    private native int stop(long j11);

    private native int writeFrame(long j11, byte[] bArr, int i11, int i12, int i13, int i14, long j12);

    public void a(AVOptions aVOptions) {
        if (this.f43666b) {
            setAVParams(this.f43665a, aVOptions);
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public int b() {
        if (!this.f43666b) {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return -1;
        }
        if (!this.f43667c) {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        this.f43667c = false;
        int stop = stop(this.f43665a);
        if (stop != 0) {
            TXCLog.e("TXSWMuxerJNI", "Stop Muxer Error!!!");
        }
        return stop;
    }

    public void c() {
        if (!this.f43666b) {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return;
        }
        release(this.f43665a);
        this.f43666b = false;
        this.f43667c = false;
    }

    public void a(String str) {
        if (this.f43666b) {
            setDstPath(this.f43665a, str);
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public void a(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12) {
        if (this.f43666b) {
            setVideoCSD(this.f43665a, b(byteBuffer, i11), b(byteBuffer2, i12));
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    private byte[] b(ByteBuffer byteBuffer, int i11) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] bArr = new byte[i11];
        byteBuffer.get(bArr);
        return bArr;
    }

    public void a(ByteBuffer byteBuffer, int i11) {
        if (this.f43666b) {
            setAudioCSD(this.f43665a, b(byteBuffer, i11));
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public int a(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, long j11) {
        if (this.f43666b) {
            if (this.f43667c) {
                int writeFrame = writeFrame(this.f43665a, b(byteBuffer, i13), i11, i12, i13, i14, j11);
                if (writeFrame != 0) {
                    TXCLog.e("TXSWMuxerJNI", "Muxer write frame error!");
                }
                return writeFrame;
            }
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }

    public int a() {
        if (this.f43666b) {
            int start = start(this.f43665a);
            if (start == 0) {
                this.f43667c = true;
                return start;
            }
            TXCLog.e("TXSWMuxerJNI", "Start Muxer Error!!!");
            return start;
        }
        TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }
}
