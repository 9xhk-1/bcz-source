package com.tencent.liteav.videoencoder;

import android.media.MediaFormat;
import androidx.media3.common.PlaybackException;
import com.tencent.liteav.basic.c.f;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends com.tencent.liteav.basic.module.a {
    protected f mEncodeFilter;
    protected boolean mInit;
    protected f mInputFilter;
    protected c mListener = null;
    protected int mInputWidth = 0;
    protected int mInputHeight = 0;
    protected int mOutputWidth = 0;
    protected int mOutputHeight = 0;
    protected int mInputTextureID = -1;
    protected Object mGLContextExternal = null;
    private long mVideoGOPEncode = 0;
    private boolean mEncodeFirstGOP = false;
    protected int mStreamType = 2;
    protected int mRotation = 0;
    protected JSONArray mEncFmt = null;
    protected boolean mEnableXMirror = false;

    public void callDelegate(int i11) {
        callDelegate(new TXSNALPacket(), i11);
    }

    public int getEncodeCost() {
        return 0;
    }

    public long getRealBitrate() {
        return 0L;
    }

    public double getRealFPS() {
        return 0.0d;
    }

    public int getVideoHeight() {
        return this.mOutputHeight;
    }

    public int getVideoWidth() {
        return this.mOutputWidth;
    }

    public boolean isH265Encoder() {
        return false;
    }

    public void onEncodeFinished(int i11, long j11, long j12) {
        c cVar = this.mListener;
        if (cVar != null) {
            cVar.a(i11, j11, j12);
        }
    }

    public long pushVideoFrame(int i11, int i12, int i13, long j11) {
        return 10000002L;
    }

    public long pushVideoFrameAsync(int i11, int i12, int i13, long j11) {
        return 10000002L;
    }

    public long pushVideoFrameSync(int i11, int i12, int i13, long j11) {
        return 10000002L;
    }

    public void setListener(c cVar) {
        this.mListener = cVar;
    }

    public void setRotation(int i11) {
        this.mRotation = i11;
    }

    public void setXMirror(boolean z11) {
        this.mEnableXMirror = z11;
    }

    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        if (tXSVideoEncoderParam != null) {
            int i11 = tXSVideoEncoderParam.width;
            this.mOutputWidth = i11;
            int i12 = tXSVideoEncoderParam.height;
            this.mOutputHeight = i12;
            this.mInputWidth = i11;
            this.mInputHeight = i12;
            this.mGLContextExternal = tXSVideoEncoderParam.glContext;
            this.mStreamType = tXSVideoEncoderParam.streamType;
            this.mEncFmt = tXSVideoEncoderParam.encFmt;
        }
        this.mVideoGOPEncode = 0L;
        this.mEncodeFirstGOP = false;
        return 10000002;
    }

    public void callDelegate(TXSNALPacket tXSNALPacket, int i11) {
        c cVar = this.mListener;
        if (cVar != null) {
            tXSNALPacket.streamType = this.mStreamType;
            cVar.a(tXSNALPacket, i11);
            if (tXSNALPacket.nalType == 0) {
                long j11 = this.mVideoGOPEncode;
                if (j11 != 0) {
                    this.mEncodeFirstGOP = true;
                    setStatusValue(PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED, Long.valueOf(j11));
                }
                this.mVideoGOPEncode = 1L;
                return;
            }
            long j12 = this.mVideoGOPEncode + 1;
            this.mVideoGOPEncode = j12;
            if (this.mEncodeFirstGOP) {
                return;
            }
            setStatusValue(PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED, Long.valueOf(j12));
        }
    }

    public void callDelegate(MediaFormat mediaFormat) {
        c cVar = this.mListener;
        if (cVar != null) {
            cVar.a(mediaFormat);
        }
    }

    public void restartIDR() {
    }

    public void signalEOSAndFlush() {
    }

    public void stop() {
    }

    public void enableNearestRPS(int i11) {
    }

    public void setBitrate(int i11) {
    }

    public void setEncodeIdrFpsFromQos(int i11) {
    }

    public void setFPS(int i11) {
    }

    public void setGLFinishedTextureNeed(boolean z11) {
    }

    public void setBitrateFromQos(int i11, int i12) {
    }

    public void setRPSRefBitmap(int i11, int i12, long j11) {
    }
}
