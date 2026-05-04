package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.renderer.a;
import com.tencent.liteav.videodecoder.TXCVideoDecoder;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCRenderAndDec extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.basic.b.b, a.InterfaceC0516a, com.tencent.liteav.renderer.f, com.tencent.liteav.videodecoder.g {
    public static final String TAG = "TXCRenderAndDec";
    private Context mContext;
    private WeakReference<com.tencent.liteav.basic.b.b> mNotifyListener;
    private WeakReference<b> mRenderAndDecDelegate;
    private k mVideoFrameListener;
    private d mConfig = null;
    private boolean mEnableLimitHWDecCache = false;
    private TXCVideoDecoder mVideoDecoder = null;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private com.tencent.liteav.renderer.e mVideoRender = null;
    private com.tencent.liteav.basic.c.f mRGBA2YUVFilter = null;
    private int mCustomRenderFrameBufferId = -1;
    private com.tencent.liteav.basic.enums.b mVideoFrameFormat = com.tencent.liteav.basic.enums.b.UNKNOWN;
    private boolean mRealTime = false;
    private boolean mIsRendering = false;
    private int mStreamType = 0;
    private long mFrameDecErrCnt = 0;
    private long mLastReqKeyFrameTS = 0;
    private boolean mFirstRender = false;
    private int mRenderMode = 0;
    private int mRenderRotation = 0;
    private long mLastRenderCalculateTS = 0;
    private long mRenderFrameCount = 0;
    private long mLastRenderFrameCount = 0;
    private long mCurrentRenderPts = 0;
    private a mDecListener = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(SurfaceTexture surfaceTexture);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void b(String str, int i11);
    }

    public TXCRenderAndDec(Context context) {
        this.mContext = null;
        this.mContext = context;
        com.tencent.liteav.basic.d.c.a().a(this.mContext);
    }

    private void notifyEvent(int i11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", i11);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        com.tencent.liteav.basic.util.h.a(this.mNotifyListener, i11, bundle);
    }

    private void requestKeyFrame() {
        b bVar;
        long timeTick = TXCTimeUtil.getTimeTick();
        if (timeTick > this.mLastReqKeyFrameTS + 3000) {
            this.mLastReqKeyFrameTS = timeTick;
            TXCLog.e(TAG, "requestKeyFrame: " + getID());
            WeakReference<b> weakReference = this.mRenderAndDecDelegate;
            if (weakReference == null || (bVar = weakReference.get()) == null) {
                return;
            }
            bVar.b(getID(), this.mStreamType);
        }
    }

    private void startDecode(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.stop();
            tXCVideoDecoder.enableHWDec(this.mConfig.f43522h);
            tXCVideoDecoder.config(this.mConfig.f43539y);
            TXCLog.i(TAG, "trtc_ start decode " + surfaceTexture + ", hw: " + this.mConfig.f43522h + ", id " + getID() + "_" + this.mStreamType);
            if (surfaceTexture != null) {
                tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            } else {
                if (this.mConfig.f43522h) {
                    return;
                }
                tXCVideoDecoder.setup((Surface) null, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            }
        }
    }

    public void enableDecoderChange(boolean z11) {
        this.mEnableDecoderChange = z11;
    }

    public void enableLimitDecCache(boolean z11) {
        this.mEnableLimitHWDecCache = z11;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.enableLimitDecCache(z11);
        }
    }

    public void enableReport(boolean z11) {
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.c(z11);
        }
    }

    public void enableRestartDecoder(boolean z11) {
        this.mEnableRestartDecoder = z11;
    }

    public long getAVNetRecvInterval() {
        return getLongValue(6108, 2);
    }

    public long getAVPlayInterval() {
        return getLongValue(6107, 2);
    }

    public d getConfig() {
        return this.mConfig;
    }

    public long getCurrentRenderPts() {
        return this.mCurrentRenderPts;
    }

    public int getStreamType() {
        return this.mStreamType;
    }

    public long getVideoCacheDuration() {
        return getIntValue(6104, 2);
    }

    public long getVideoCacheFrameCount() {
        return getIntValue(6105, 2);
    }

    public int getVideoDecCacheFrameCount() {
        return getIntValue(6106, 2);
    }

    public int getVideoGop() {
        return getIntValue(7120);
    }

    public com.tencent.liteav.renderer.e getVideoRender() {
        return this.mVideoRender;
    }

    public boolean isRendering() {
        return this.mIsRendering;
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onDecodeFailed(int i11) {
        TXCVideoDecoder tXCVideoDecoder;
        TXCLog.e(TAG, "video decode failed " + i11);
        if (i11 != -2) {
            if (-4 == i11) {
                notifyEvent(TXLiteAVCode.ERR_HEVC_SOFTDECODER_START_FAIL, "h265 softdecoder start fail.");
                return;
            }
            requestKeyFrame();
            int i12 = this.mStreamType;
            long j11 = this.mFrameDecErrCnt + 1;
            this.mFrameDecErrCnt = j11;
            setStatusValue(17014, i12, Long.valueOf(j11));
            return;
        }
        TXCLog.w(TAG, "use h265 softdecoder but not set h265 softdecoder to sdk, isH265SoftDecodeExist= " + com.tencent.liteav.basic.a.a());
        if (com.tencent.liteav.basic.a.a() || (tXCVideoDecoder = this.mVideoDecoder) == null || !tXCVideoDecoder.isH265()) {
            return;
        }
        this.mConfig.f43522h = true;
        tXCVideoDecoder.restart(true);
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i11, int i12, long j11, long j12, int i13) {
        com.tencent.liteav.basic.enums.b bVar;
        int i14 = i13;
        this.mCurrentRenderPts = j11;
        if (i14 == 0 || i14 == 1 || i14 == 2 || i14 == 3) {
            i14 = 360 - (i14 * 90);
        }
        k kVar = this.mVideoFrameListener;
        if (kVar != null && tXSVideoFrame != null && ((bVar = this.mVideoFrameFormat) == com.tencent.liteav.basic.enums.b.I420 || bVar == com.tencent.liteav.basic.enums.b.NV21)) {
            TXSVideoFrame m5636clone = this.mVideoRender != null ? tXSVideoFrame.m5636clone() : tXSVideoFrame;
            m5636clone.rotation = (this.mRenderRotation + i14) % 360;
            if (this.mVideoFrameFormat == com.tencent.liteav.basic.enums.b.NV21) {
                m5636clone.loadNV21BufferFromI420Buffer();
            }
            kVar.a(getID(), this.mStreamType, m5636clone);
        }
        if (!this.mFirstRender) {
            this.mFirstRender = true;
            TXCEventRecorderProxy.a(getID(), 5007, -1L, -1L, "", this.mStreamType);
            if (this.mVideoRender == null) {
                TXCKeyPointReportProxy.a(getID(), 40022, 0L, this.mStreamType);
            }
            if (this.mVideoDecoder != null) {
                TXCKeyPointReportProxy.a(getID(), 40029, this.mVideoDecoder.GetDecodeFirstFrameTS(), this.mStreamType);
            }
            if (this.mStreamType == 2) {
                TXCKeyPointReportProxy.a(getID(), 32004);
            }
        }
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.a(tXSVideoFrame, i11, i12, i14);
        } else {
            if (this.mLastRenderCalculateTS != 0) {
                this.mRenderFrameCount++;
                return;
            }
            this.mLastRenderCalculateTS = System.currentTimeMillis();
            this.mLastRenderFrameCount = 0L;
            this.mRenderFrameCount = 0L;
        }
    }

    @Override // com.tencent.liteav.basic.b.b
    public void onNotifyEvent(int i11, Bundle bundle) {
        if (i11 == 2106) {
            this.mConfig.f43522h = false;
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder != null) {
                tXCVideoDecoder.restart(false);
            }
        } else if (i11 == -2304) {
            if (com.tencent.liteav.basic.a.a()) {
                this.mConfig.f43522h = false;
                TXCVideoDecoder tXCVideoDecoder2 = this.mVideoDecoder;
                if (tXCVideoDecoder2 != null) {
                    tXCVideoDecoder2.restart(false);
                    return;
                }
                return;
            }
        } else if (i11 == 2020) {
            TXCLog.e(TAG, "decoding too many frame(>40) without output! request key frame now.");
            requestKeyFrame();
            return;
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        com.tencent.liteav.basic.util.h.a(this.mNotifyListener, i11, bundle);
    }

    @Override // com.tencent.liteav.renderer.f
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.w(TAG, "play decode when surface texture create hw " + this.mConfig.f43522h);
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
        }
        if (this.mConfig.f43522h) {
            startDecode(surfaceTexture);
        }
        resetPeriodStatistics();
        enableReport(true);
    }

    @Override // com.tencent.liteav.renderer.f
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder;
        try {
            TXCLog.w(TAG, "play:stop decode when surface texture release");
            if (this.mConfig.f43522h && (tXCVideoDecoder = this.mVideoDecoder) != null) {
                tXCVideoDecoder.stop();
            }
            int i11 = this.mCustomRenderFrameBufferId;
            if (i11 != -1) {
                com.tencent.liteav.basic.c.g.a(i11);
                this.mCustomRenderFrameBufferId = -1;
            }
            com.tencent.liteav.basic.c.f fVar = this.mRGBA2YUVFilter;
            if (fVar != null) {
                fVar.d();
                this.mRGBA2YUVFilter = null;
            }
            a aVar = this.mDecListener;
            if (aVar != null) {
                aVar.a(surfaceTexture);
            }
            resetPeriodStatistics();
            enableReport(false);
        } catch (Exception e11) {
            TXCLog.e(TAG, "onSurfaceTextureDestroy failed.", e11);
        }
    }

    @Override // com.tencent.liteav.renderer.a.InterfaceC0516a
    public void onTextureProcess(int i11, int i12, int i13, int i14) {
        k kVar = this.mVideoFrameListener;
        if (kVar == null) {
            return;
        }
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = i12;
        tXSVideoFrame.height = i13;
        tXSVideoFrame.pts = TXCTimeUtil.getTimeTick();
        tXSVideoFrame.rotation = (i14 + this.mRenderRotation) % 360;
        com.tencent.liteav.basic.enums.b bVar = this.mVideoFrameFormat;
        if (bVar == com.tencent.liteav.basic.enums.b.RGBA) {
            tXSVideoFrame.textureId = i11;
            tXSVideoFrame.eglContext = com.tencent.liteav.basic.c.g.d();
            if (this.mCustomRenderFrameBufferId == -1) {
                this.mCustomRenderFrameBufferId = com.tencent.liteav.basic.c.g.c();
            }
            com.tencent.liteav.basic.c.g.a(i11, this.mCustomRenderFrameBufferId);
            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, this.mCustomRenderFrameBufferId);
            this.mVideoFrameListener.a(getID(), this.mStreamType, tXSVideoFrame);
            com.tencent.liteav.basic.c.g.b(this.mCustomRenderFrameBufferId);
            return;
        }
        if (bVar == com.tencent.liteav.basic.enums.b.TEXTURE_2D) {
            tXSVideoFrame.textureId = i11;
            com.tencent.liteav.renderer.e eVar = this.mVideoRender;
            if (eVar instanceof com.tencent.liteav.renderer.a) {
                tXSVideoFrame.eglContext = ((com.tencent.liteav.renderer.a) eVar).b();
            }
            kVar.a(getID(), this.mStreamType, tXSVideoFrame);
            return;
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder == null || tXCVideoDecoder.isHardwareDecode()) {
            if (this.mRGBA2YUVFilter == null) {
                if (this.mVideoFrameFormat == com.tencent.liteav.basic.enums.b.NV21) {
                    this.mRGBA2YUVFilter = new com.tencent.liteav.beauty.a.a(3);
                } else {
                    this.mRGBA2YUVFilter = new com.tencent.liteav.beauty.a.a(1);
                }
                this.mRGBA2YUVFilter.a(true);
                if (this.mRGBA2YUVFilter.a()) {
                    this.mRGBA2YUVFilter.a(i12, i13);
                } else {
                    TXCLog.i(TAG, "throwVideoFrame->release mVideoFrameFilter");
                    this.mRGBA2YUVFilter = null;
                }
            }
            if (this.mRGBA2YUVFilter != null) {
                GLES20.glViewport(0, 0, i12, i13);
                this.mRGBA2YUVFilter.a(i12, i13);
                this.mRGBA2YUVFilter.b(i11);
                GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, this.mRGBA2YUVFilter.m());
                kVar.a(getID(), this.mStreamType, tXSVideoFrame);
                GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onVideoSizeChange(int i11, int i12) {
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.c(i11, i12);
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Resolution changed to" + i11 + "x" + i12);
        bundle.putInt("EVT_PARAM1", i11);
        bundle.putInt("EVT_PARAM2", i12);
        bundle.putString("EVT_USERID", getID());
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        onNotifyEvent(2009, bundle);
        setStatusValue(PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED, this.mStreamType, Integer.valueOf((i11 << 16) | i12));
        long j11 = i11;
        long j12 = i12;
        TXCEventRecorderProxy.a(getID(), PlaybackException.ERROR_CODE_DECODING_FAILED, j11, j12, "", this.mStreamType);
        TXCKeyPointReportProxy.a(getID(), PayStatusCodes.PRODUCT_AUTHENTICATION_FAILED, j11, this.mStreamType);
        TXCKeyPointReportProxy.a(getID(), PayStatusCodes.PRODUCT_SERVER_INTERNAL_EXCEPTION, j12, this.mStreamType);
    }

    public void resetPeriodFeelingStatistics() {
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.n();
        }
    }

    public void resetPeriodStatistics() {
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.m();
        }
    }

    public void restartDecoder() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder == null || !tXCVideoDecoder.isH265()) {
            return;
        }
        tXCVideoDecoder.restart(true);
    }

    public void setBlockInterval(int i11) {
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.f(i11);
        }
    }

    public void setConfig(d dVar) {
        this.mConfig = dVar;
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.b(dVar.f43518d);
        }
    }

    public void setDecListener(a aVar) {
        this.mDecListener = aVar;
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setUserId(str);
        }
    }

    public void setNotifyListener(com.tencent.liteav.basic.b.b bVar) {
        this.mNotifyListener = new WeakReference<>(bVar);
    }

    public void setRenderAndDecDelegate(b bVar) {
        this.mRenderAndDecDelegate = new WeakReference<>(bVar);
    }

    public void setRenderMirrorType(int i11) {
        TXCLog.i(TAG, "setRenderMirrorType " + i11);
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.d(i11);
        }
    }

    public void setRenderMode(int i11) {
        this.mRenderMode = i11;
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.c(i11);
        }
    }

    public void setRenderRotation(int i11) {
        TXCLog.i(TAG, "vrotation setRenderRotation " + i11);
        this.mRenderRotation = i11;
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.e(i11);
        }
    }

    public void setStreamType(int i11) {
        this.mStreamType = i11;
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.a(i11);
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setStreamType(this.mStreamType);
        }
    }

    public void setVideoFrameListener(k kVar, com.tencent.liteav.basic.enums.b bVar) {
        this.mVideoFrameListener = kVar;
        this.mVideoFrameFormat = bVar;
        TXCLog.i(TAG, "setVideoFrameListener->enter listener: " + kVar + ", format: " + bVar);
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar == null || !(eVar instanceof com.tencent.liteav.renderer.a)) {
            return;
        }
        if (kVar == null) {
            TXCLog.i(TAG, "setCustomRenderListener-> clean listener.");
            ((com.tencent.liteav.renderer.a) this.mVideoRender).b((a.InterfaceC0516a) null);
        } else {
            TXCLog.i(TAG, "setCustomRenderListener-> set listener.");
            ((com.tencent.liteav.renderer.a) this.mVideoRender).b((a.InterfaceC0516a) this);
        }
    }

    public void setVideoRender(com.tencent.liteav.renderer.e eVar) {
        TXCLog.i(TAG, "set video render " + eVar + " id " + getID() + j2.O + this.mStreamType);
        this.mVideoRender = eVar;
        if (eVar == null) {
            return;
        }
        eVar.setID(getID());
        this.mVideoRender.a(this.mStreamType);
        this.mVideoRender.a((com.tencent.liteav.basic.b.b) this);
        this.mVideoRender.c(this.mRenderMode);
        this.mVideoRender.e(this.mRenderRotation);
        if (this.mVideoFrameListener != null) {
            com.tencent.liteav.renderer.e eVar2 = this.mVideoRender;
            if (eVar2 instanceof com.tencent.liteav.renderer.a) {
                ((com.tencent.liteav.renderer.a) eVar2).b((a.InterfaceC0516a) this);
            }
        }
        d dVar = this.mConfig;
        if (dVar != null) {
            this.mVideoRender.b(dVar.f43518d);
        }
    }

    public void start(boolean z11) {
        TXCLog.i(TAG, "start render dec " + getID() + j2.O + this.mStreamType);
        this.mRealTime = z11;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.a((com.tencent.liteav.renderer.f) this);
            this.mVideoRender.e();
            this.mVideoRender.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder = tXCVideoDecoder;
        tXCVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        startDecode();
        this.mIsRendering = true;
    }

    public void startVideo() {
        stopVideo();
        this.mRealTime = true;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        this.mCurrentRenderPts = 0L;
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.a((com.tencent.liteav.renderer.f) this);
            this.mVideoRender.e();
            this.mVideoRender.setID(getID());
        }
        TXCLog.i(TAG, "start video dec " + getID() + j2.O + this.mStreamType);
        TXCVideoDecoder tXCVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder = tXCVideoDecoder;
        tXCVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        startDecode();
        this.mIsRendering = true;
    }

    public void stop() {
        TXCLog.i(TAG, "stop video render dec " + getID() + j2.O + this.mStreamType);
        this.mIsRendering = false;
        this.mRealTime = false;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.a(true);
            this.mVideoRender.a((com.tencent.liteav.renderer.f) null);
        }
    }

    public void stopVideo() {
        this.mIsRendering = false;
        if (this.mVideoDecoder != null) {
            TXCLog.i(TAG, "stop video dec " + getID() + j2.O + this.mStreamType);
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.a(false);
            this.mVideoRender.a((com.tencent.liteav.renderer.f) null);
        }
    }

    public void updateLoadInfo() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            setStatusValue(PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED, this.mStreamType, Long.valueOf(tXCVideoDecoder.isHardwareDecode() ? 1L : 0L));
        }
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        if (eVar != null) {
            eVar.o();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.mLastRenderCalculateTS;
        if (j11 >= 1000) {
            this.mLastRenderFrameCount = this.mRenderFrameCount;
            this.mLastRenderCalculateTS = currentTimeMillis;
            setStatusValue(6002, this.mStreamType, Double.valueOf(((r4 - this.mLastRenderFrameCount) * 1000.0d) / j11));
        }
    }

    private void startDecode() {
        com.tencent.liteav.renderer.e eVar = this.mVideoRender;
        startDecode(eVar != null ? eVar.a() : null);
    }

    public void decVideo(TXSNALPacket tXSNALPacket) {
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onDecoderChange(String str, boolean z11) {
    }
}
