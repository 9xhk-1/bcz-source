package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.tencent.liteav.basic.c.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCSWVideoEncoder extends b {
    private static final boolean DEBUG = false;
    private static final String TAG = "TXCSWVideoEncoder";
    private f mRawFrameFilter;
    private f mResizeFilter;
    private long mNativeEncoder = 0;
    private int mBitrate = 0;
    private long mPTS = 0;
    private int mPushIdx = 0;
    private int mRendIdx = 0;
    private int mPopIdx = 0;

    static {
        h.d();
        nativeClassInit();
    }

    public static long getAndIncreaseGopIndex() {
        return nativeGetAndIncreaseGopIndex();
    }

    public static long getAndIncreateSeq() {
        return nativeGetAndIncreaseSeq();
    }

    private static native void nativeClassInit();

    private native void nativeEnableNearestRPS(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncode(long j11, int i11, int i12, int i13, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncodeSync(long j11, int i11, int i12, int i13, long j12);

    private static native long nativeGetAndIncreaseGopIndex();

    private static native long nativeGetAndIncreaseSeq();

    private native long nativeGetRealFPS(long j11);

    private native long nativeInit(WeakReference<TXCSWVideoEncoder> weakReference);

    private native void nativeRelease(long j11);

    private native void nativeRestartIDR(long j11);

    private native void nativeSetBitrate(long j11, int i11);

    private native void nativeSetBitrateFromQos(long j11, int i11, int i12);

    private native void nativeSetEncodeIdrFpsFromQos(long j11, int i11);

    private native void nativeSetFPS(long j11, int i11);

    private native void nativeSetID(long j11, String str);

    private native void nativeSetRPSRefBitmap(long j11, int i11, int i12, long j12);

    private native void nativeSignalEOSAndFlush(long j11);

    private native int nativeStart(long j11, TXSVideoEncoderParam tXSVideoEncoderParam);

    private native void nativeStop(long j11);

    private native long nativegetRealBitrate(long j11);

    private static void onEncodeFinishedFromNative(WeakReference<TXCSWVideoEncoder> weakReference, int i11, long j11, long j12) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.onEncodeFinished(i11, j11, j12);
        }
    }

    private static void postEventFromNative(WeakReference<TXCSWVideoEncoder> weakReference, byte[] bArr, int i11, long j11, long j12, long j13, long j14, long j15, long j16, int i12) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i11;
            tXSNALPacket.gopIndex = j11;
            tXSNALPacket.gopFrameIndex = j12;
            tXSNALPacket.frameIndex = j13;
            tXSNALPacket.refFremeIndex = j14;
            tXSNALPacket.pts = j15;
            tXSNALPacket.dts = j16;
            tXCSWVideoEncoder.callDelegate(tXSNALPacket, i12);
        }
    }

    private long pushVideoFrameInternal(int i11, int i12, int i13, long j11, final boolean z11) {
        f fVar = this.mResizeFilter;
        f fVar2 = this.mRawFrameFilter;
        if (this.mGLContextExternal == null) {
            return 0L;
        }
        this.mInputWidth = i12;
        this.mInputHeight = i13;
        if (fVar == null) {
            fVar = new f();
            this.mResizeFilter = fVar;
            fVar.a();
            fVar.a(true);
        }
        f fVar3 = fVar;
        fVar3.a(this.mOutputWidth, this.mOutputHeight);
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        int i14 = (720 - this.mRotation) % 360;
        fVar3.a(i12, i13, i14, null, ((i14 == 90 || i14 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i14 == 90 || i14 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, false);
        fVar3.b(i11);
        final int l11 = fVar3.l();
        int[] iArr = new int[1];
        this.mPTS = j11;
        if (fVar2 == null) {
            String str = TAG;
            TXCLog.i(str, "pushVideoFrameInternal->create mRawFrameFilter");
            fVar2 = new com.tencent.liteav.beauty.a.a(1);
            this.mRawFrameFilter = fVar2;
            fVar2.a(true);
            if (!fVar2.a()) {
                TXCLog.i(str, "pushVideoFrameInternal->destroy mRawFrameFilter, init failed!");
                this.mRawFrameFilter = null;
                return 10000004L;
            }
            fVar2.a(this.mOutputWidth, this.mOutputHeight);
            fVar2.a(new f.a() { // from class: com.tencent.liteav.videoencoder.TXCSWVideoEncoder.1
                @Override // com.tencent.liteav.basic.c.f.a
                public void a(int i15) {
                    synchronized (TXCSWVideoEncoder.this) {
                        try {
                            TXCSWVideoEncoder tXCSWVideoEncoder = TXCSWVideoEncoder.this;
                            c cVar = tXCSWVideoEncoder.mListener;
                            if (cVar != null) {
                                cVar.b(tXCSWVideoEncoder.mStreamType);
                            }
                            if (z11) {
                                TXCSWVideoEncoder tXCSWVideoEncoder2 = TXCSWVideoEncoder.this;
                                long j12 = tXCSWVideoEncoder2.mNativeEncoder;
                                int i16 = l11;
                                TXCSWVideoEncoder tXCSWVideoEncoder3 = TXCSWVideoEncoder.this;
                                tXCSWVideoEncoder2.nativeEncodeSync(j12, i16, tXCSWVideoEncoder3.mOutputWidth, tXCSWVideoEncoder3.mOutputHeight, tXCSWVideoEncoder3.mPTS);
                            } else {
                                TXCSWVideoEncoder tXCSWVideoEncoder4 = TXCSWVideoEncoder.this;
                                long j13 = tXCSWVideoEncoder4.mNativeEncoder;
                                int i17 = l11;
                                TXCSWVideoEncoder tXCSWVideoEncoder5 = TXCSWVideoEncoder.this;
                                tXCSWVideoEncoder4.nativeEncode(j13, i17, tXCSWVideoEncoder5.mOutputWidth, tXCSWVideoEncoder5.mOutputHeight, tXCSWVideoEncoder5.mPTS);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        }
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        fVar2.b(l11);
        int i15 = iArr[0];
        if (i15 == 0) {
            return 0L;
        }
        callDelegate(i15);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void enableNearestRPS(int i11) {
        synchronized (this) {
            nativeEnableNearestRPS(this.mNativeEncoder, i11);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long getRealBitrate() {
        long nativegetRealBitrate;
        synchronized (this) {
            nativegetRealBitrate = nativegetRealBitrate(this.mNativeEncoder);
        }
        return nativegetRealBitrate;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public double getRealFPS() {
        double nativeGetRealFPS;
        synchronized (this) {
            nativeGetRealFPS = nativeGetRealFPS(this.mNativeEncoder);
        }
        return nativeGetRealFPS;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long pushVideoFrame(int i11, int i12, int i13, long j11) {
        return pushVideoFrameInternal(i11, i12, i13, j11, false);
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long pushVideoFrameAsync(int i11, int i12, int i13, long j11) {
        return pushVideoFrameInternal(i11, i12, i13, j11, true);
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long pushVideoFrameSync(int i11, int i12, int i13, long j11) {
        return pushVideoFrameInternal(i11, i12, i13, j11, true);
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void restartIDR() {
        synchronized (this) {
            nativeRestartIDR(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setBitrate(int i11) {
        this.mBitrate = i11;
        synchronized (this) {
            nativeSetBitrate(this.mNativeEncoder, i11);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setBitrateFromQos(int i11, int i12) {
        this.mBitrate = i11;
        synchronized (this) {
            nativeSetBitrateFromQos(this.mNativeEncoder, i11, i12);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setEncodeIdrFpsFromQos(int i11) {
        synchronized (this) {
            nativeSetEncodeIdrFpsFromQos(this.mNativeEncoder, i11);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setFPS(int i11) {
        synchronized (this) {
            nativeSetFPS(this.mNativeEncoder, i11);
        }
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        synchronized (this) {
            nativeSetID(this.mNativeEncoder, str);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setRPSRefBitmap(int i11, int i12, long j11) {
        synchronized (this) {
            try {
                try {
                    nativeSetRPSRefBitmap(this.mNativeEncoder, i11, i12, j11);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void signalEOSAndFlush() {
        synchronized (this) {
            nativeSignalEOSAndFlush(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.b
    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        int i11 = tXSVideoEncoderParam.width;
        int i12 = ((i11 + 7) / 8) * 8;
        int i13 = tXSVideoEncoderParam.height;
        int i14 = ((i13 + 1) / 2) * 2;
        if (i12 != i11 || i14 != i13) {
            String str = TAG;
            TXCLog.w(str, "Encode Resolution not supportted, transforming...");
            TXCLog.w(str, tXSVideoEncoderParam.width + "x" + tXSVideoEncoderParam.height + "-> " + i12 + "x" + i14);
        }
        tXSVideoEncoderParam.width = i12;
        tXSVideoEncoderParam.height = i14;
        this.mOutputWidth = i12;
        this.mOutputHeight = i14;
        this.mInputWidth = i12;
        this.mInputHeight = i14;
        this.mRawFrameFilter = null;
        this.mResizeFilter = null;
        synchronized (this) {
            long nativeInit = nativeInit(new WeakReference<>(this));
            this.mNativeEncoder = nativeInit;
            nativeSetBitrate(nativeInit, this.mBitrate);
            nativeSetID(this.mNativeEncoder, getID());
            nativeStart(this.mNativeEncoder, tXSVideoEncoderParam);
        }
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void stop() {
        long j11;
        TXCLog.i(TAG, "stop->enter with mRawFrameFilter:" + this.mRawFrameFilter);
        this.mGLContextExternal = null;
        synchronized (this) {
            j11 = this.mNativeEncoder;
            this.mNativeEncoder = 0L;
        }
        nativeStop(j11);
        nativeRelease(j11);
        f fVar = this.mRawFrameFilter;
        if (fVar != null) {
            fVar.d();
            this.mRawFrameFilter = null;
        }
        f fVar2 = this.mResizeFilter;
        if (fVar2 != null) {
            fVar2.d();
            this.mResizeFilter = null;
        }
        super.stop();
    }
}
