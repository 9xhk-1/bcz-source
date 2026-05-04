package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCVideoFfmpegDecoder implements b {
    private boolean mFirstDec;
    private g mListener;
    private long mNativeDecoder;
    private long mNativeNotify;
    private ByteBuffer mPps;
    private byte[] mRawData;
    private ByteBuffer mSps;
    private int mVideoHeight;
    private int mVideoWidth;

    static {
        h.d();
        nativeClassInit();
    }

    private static native void nativeClassInit();

    private native boolean nativeDecode(byte[] bArr, long j11, long j12, long j13);

    private native void nativeInit(WeakReference<TXCVideoFfmpegDecoder> weakReference, boolean z11);

    private native void nativeLoadRawData(byte[] bArr, long j11, int i11);

    private native void nativeRelease();

    @Override // com.tencent.liteav.videodecoder.b
    public int GetDecodeCost() {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int config(Surface surface) {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void decode(TXSNALPacket tXSNALPacket) {
        TXCVideoFfmpegDecoder tXCVideoFfmpegDecoder;
        g gVar;
        g gVar2;
        if (this.mFirstDec) {
            ByteBuffer byteBuffer = this.mSps;
            if (byteBuffer == null || this.mPps == null) {
                tXCVideoFfmpegDecoder = this;
            } else {
                byte[] array = byteBuffer.array();
                byte[] array2 = this.mPps.array();
                byte[] bArr = new byte[array.length + array2.length];
                System.arraycopy(array, 0, bArr, 0, array.length);
                System.arraycopy(array2, 0, bArr, array.length, array2.length);
                tXCVideoFfmpegDecoder = this;
                if (!nativeDecode(bArr, tXSNALPacket.pts - 1, tXSNALPacket.dts - 1, tXSNALPacket.rotation) && (gVar2 = tXCVideoFfmpegDecoder.mListener) != null) {
                    gVar2.onDecodeFailed(-2);
                }
            }
            tXCVideoFfmpegDecoder.mFirstDec = false;
        } else {
            tXCVideoFfmpegDecoder = this;
        }
        if (tXCVideoFfmpegDecoder.nativeDecode(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation) || (gVar = tXCVideoFfmpegDecoder.mListener) == null) {
            return;
        }
        gVar.onDecodeFailed(-2);
    }

    public boolean isH265() {
        return false;
    }

    public void loadNativeData(byte[] bArr, long j11, int i11) {
        nativeLoadRawData(bArr, j11, i11);
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setListener(g gVar) {
        this.mListener = gVar;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z11, boolean z12) {
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mFirstDec = true;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        nativeInit(new WeakReference<>(this), z11);
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void stop() {
        nativeRelease();
    }

    public void config(JSONArray jSONArray) {
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void enableLimitDecCache(boolean z11) {
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setNotifyListener(WeakReference<com.tencent.liteav.basic.b.b> weakReference) {
    }

    private static void postEventFromNative(WeakReference<TXCVideoFfmpegDecoder> weakReference, long j11, int i11, int i12, long j12, long j13, int i13) {
    }
}
