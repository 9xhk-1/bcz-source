package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.h;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCVideoDecoder implements com.tencent.liteav.basic.b.b, g {
    private static final boolean NEW_DECODER = true;
    private static final String TAG = "TXCVideoDecoder";
    private static long mDecodeFirstFrameTS;
    private int mDecoderCacheNum;
    private a mDecoderHandler;
    g mDecoderListener;
    private long mNativeContext;
    private WeakReference<com.tencent.liteav.basic.b.b> mNotifyListener;
    private ByteBuffer mPps;
    private ByteBuffer mSps;
    Surface mSurface;
    private String mUserId;
    b mVideoDecoder;
    private boolean mRestarting = false;
    private int mStreamType = 0;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private boolean mEnableLimitDecCache = false;
    private JSONArray mDecFormat = null;
    private ArrayList<TXSNALPacket> mNALList = new ArrayList<>();
    boolean mHWDec = true;
    boolean mH265 = false;
    boolean mNeedSortFrame = true;
    boolean mRecvFirstFrame = false;

    static {
        h.d();
    }

    public TXCVideoDecoder() {
        mDecodeFirstFrameTS = 0L;
    }

    private void addOneNalToDecoder(TXSNALPacket tXSNALPacket) {
        boolean z11 = tXSNALPacket.nalType == 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("iframe", z11);
        bundle.putByteArray("nal", tXSNALPacket.nalData);
        bundle.putLong("pts", tXSNALPacket.pts);
        bundle.putLong("dts", tXSNALPacket.dts);
        bundle.putInt("codecId", tXSNALPacket.codecId);
        Message message = new Message();
        message.what = 101;
        message.setData(bundle);
        a aVar = this.mDecoderHandler;
        if (aVar != null) {
            aVar.sendMessage(message);
        }
        this.mDecoderCacheNum++;
    }

    private void decNALByNewWay(TXSNALPacket tXSNALPacket) {
        if (this.mHWDec) {
            decodeFrame(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId, 0, 0, tXSNALPacket.nalType);
        } else {
            synchronized (this) {
                nativeDecodeFrame(this.mNativeContext, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId);
            }
        }
    }

    private void decNALByOldWay(TXSNALPacket tXSNALPacket) {
        try {
            boolean z11 = tXSNALPacket.nalType == 0;
            boolean z12 = this.mRecvFirstFrame;
            if (!z12 && !z11) {
                TXCLog.i(TAG, "play:decode: push nal ignore p frame when not got i frame");
                return;
            }
            if (!z12 && z11) {
                TXCLog.w(TAG, "play:decode: push first i frame");
                this.mRecvFirstFrame = true;
            }
            if (!this.mRestarting && tXSNALPacket.codecId == 1 && !this.mHWDec) {
                TXCLog.w(TAG, "play:decode: hevc decode error  ");
                h.a(this.mNotifyListener, -2304, "h265 Decoding failed");
                this.mRestarting = true;
            }
            if (this.mDecoderHandler != null) {
                if (!this.mNALList.isEmpty()) {
                    Iterator<TXSNALPacket> it = this.mNALList.iterator();
                    while (it.hasNext()) {
                        addOneNalToDecoder(it.next());
                    }
                }
                this.mNALList.clear();
                addOneNalToDecoder(tXSNALPacket);
                return;
            }
            if (z11 && !this.mNALList.isEmpty()) {
                this.mNALList.clear();
            }
            this.mNALList.add(tXSNALPacket);
            if (this.mRestarting) {
                return;
            }
            start();
        } catch (Exception e11) {
            TXCLog.e(TAG, "decode NAL By Old way failed.", e11);
        }
    }

    private void decodeFrame(byte[] bArr, long j11, long j12, int i11, int i12, int i13, int i14, int i15) {
        TXSNALPacket tXSNALPacket = new TXSNALPacket();
        tXSNALPacket.nalData = bArr;
        tXSNALPacket.pts = j11;
        tXSNALPacket.dts = j12;
        tXSNALPacket.rotation = i11;
        tXSNALPacket.codecId = i12;
        tXSNALPacket.nalType = i15;
        synchronized (this) {
            try {
                if (this.mNativeContext != 0 && this.mVideoDecoder == null) {
                    if (i12 == 1) {
                        this.mH265 = true;
                    } else {
                        this.mH265 = false;
                    }
                    f fVar = new f();
                    fVar.a(i13, i14);
                    fVar.setListener(this);
                    fVar.setNotifyListener(new WeakReference<>(this));
                    fVar.a(this.mDecFormat);
                    fVar.config(this.mSurface);
                    fVar.enableLimitDecCache(this.mEnableLimitDecCache);
                    fVar.start(this.mSps, this.mPps, this.mNeedSortFrame, this.mH265);
                    notifyDecoderStartEvent(true, this.mH265);
                    this.mVideoDecoder = fVar;
                }
                b bVar = this.mVideoDecoder;
                if (bVar != null) {
                    bVar.decode(tXSNALPacket);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean hasSurface() {
        return this.mSurface != null;
    }

    private native long nativeCreateContext(boolean z11, Object obj);

    private native void nativeDecCache(long j11);

    private native void nativeDecodeFrame(long j11, byte[] bArr, int i11, long j12, long j13, int i12, int i13);

    private native void nativeDestroyContext(long j11);

    private native void nativeEnableDecodeChange(long j11, boolean z11);

    private native void nativeEnableRestartDecoder(long j11, boolean z11);

    private native void nativeNotifyHWDecoderError(long j11);

    private native void nativeNotifyPts(long j11, long j12, int i11, int i12);

    private native void nativeReStart(long j11, boolean z11);

    private native void nativeSetID(long j11, String str);

    private native void nativeSetStreamType(long j11, int i11);

    private void notifyDecoderStartEvent(boolean z11, boolean z12) {
        TXCEventRecorderProxy.a(this.mUserId, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED, z11 ? 1L : 0L, -1L, "", this.mStreamType);
        reportDecoderEvent(z11, z12);
        TXCKeyPointReportProxy.a(this.mUserId, 40026, z11 ? 1L : 2L, this.mStreamType);
    }

    private void onDecodeDone(TXSVideoFrame tXSVideoFrame, int i11, int i12, long j11, long j12, int i13, int i14) {
        if (mDecodeFirstFrameTS == 0) {
            mDecodeFirstFrameTS = TXCTimeUtil.getTimeTick();
            TXCLog.i(TAG, "[FirstFramePath][Video][Decoder] TXCVideoDecoder: decode first frame success. instance:" + hashCode() + " isHWAcc:false isH265:" + this.mH265 + " userId:" + this.mUserId + " type:" + this.mStreamType);
            TXCStatus.a(this.mUserId, 5005, this.mStreamType, Long.valueOf(mDecodeFirstFrameTS));
            TXCStatus.a(this.mUserId, PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, this.mStreamType, Integer.valueOf(this.mH265 ? 2 : 0));
        }
        g gVar = this.mDecoderListener;
        if (gVar != null) {
            tXSVideoFrame.width = i11;
            tXSVideoFrame.height = i12;
            tXSVideoFrame.rotation = i13;
            tXSVideoFrame.pts = j11;
            tXSVideoFrame.frameType = i14;
            gVar.onDecodeFrame(tXSVideoFrame, i11, i12, j11, j12, i13);
            if (this.mVideoWidth == i11 && this.mVideoHeight == i12) {
                return;
            }
            this.mVideoWidth = i11;
            this.mVideoHeight = i12;
            gVar.onVideoSizeChange(i11, i12);
        }
    }

    private void onStartDecoder(boolean z11, boolean z12) {
        this.mH265 = z12;
        this.mHWDec = z11;
        notifyDecoderStartEvent(z11, z12);
    }

    private void reportDecoderEvent(boolean z11, boolean z12) {
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2008);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        StringBuilder sb2 = new StringBuilder("Enables ");
        if (z12) {
            sb2.append("H265 ");
        } else {
            sb2.append("H264 ");
        }
        if (z11) {
            sb2.append("hardware ");
        } else {
            sb2.append("software ");
        }
        sb2.append("decoding");
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, sb2.toString());
        bundle.putInt("EVT_PARAM1", z11 ? 1 : 2);
        h.a(this.mNotifyListener, this.mUserId, 2008, bundle);
        TXCLog.i(TAG, "start video decoder:" + sb2.toString());
    }

    private int startDecodeThread() {
        synchronized (this) {
            try {
                try {
                    if (this.mDecoderHandler != null) {
                        TXCLog.e(TAG, "play:decode: start decoder error when decoder is started");
                        return -1;
                    }
                    this.mDecoderCacheNum = 0;
                    this.mRestarting = false;
                    HandlerThread handlerThread = new HandlerThread("VDecoder");
                    handlerThread.start();
                    if (this.mHWDec) {
                        handlerThread.setName("VideoWDec" + handlerThread.getId());
                    } else {
                        handlerThread.setName("VideoSWDec" + handlerThread.getId());
                    }
                    a aVar = new a(handlerThread.getLooper());
                    aVar.a(this.mH265, this.mHWDec, this.mSurface, this.mSps, this.mPps, this, this);
                    TXCLog.w(TAG, "play:decode: start decode thread");
                    Message obtain = Message.obtain();
                    obtain.what = 100;
                    obtain.obj = Boolean.valueOf(this.mNeedSortFrame);
                    aVar.sendMessage(obtain);
                    this.mDecoderHandler = aVar;
                    return 0;
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

    private void stopDecodeThread() {
        synchronized (this) {
            try {
                a aVar = this.mDecoderHandler;
                if (aVar != null) {
                    aVar.sendEmptyMessage(102);
                }
                this.mDecoderHandler = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void stopHWDecoder() {
        b bVar = this.mVideoDecoder;
        if (bVar != null) {
            bVar.stop();
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder = null;
        }
    }

    public long GetDecodeFirstFrameTS() {
        return mDecodeFirstFrameTS;
    }

    public void config(JSONArray jSONArray) {
        this.mDecFormat = jSONArray;
    }

    public void enableChange(boolean z11) {
        this.mEnableDecoderChange = z11;
        synchronized (this) {
            nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        }
    }

    public void enableHWDec(boolean z11) {
        this.mHWDec = z11;
    }

    public void enableLimitDecCache(boolean z11) {
        this.mEnableLimitDecCache = z11;
        b bVar = this.mVideoDecoder;
        if (bVar != null) {
            bVar.enableLimitDecCache(z11);
        }
    }

    public void enableRestart(boolean z11) {
        this.mEnableRestartDecoder = z11;
    }

    public int getDecoderCacheNum() {
        return this.mDecoderCacheNum + this.mNALList.size();
    }

    public boolean isH265() {
        return this.mH265;
    }

    public boolean isHardwareDecode() {
        return this.mVideoDecoder != null;
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onDecodeFailed(int i11) {
        TXCStatus.a(this.mUserId, 5006, this.mStreamType, Integer.valueOf(i11));
        g gVar = this.mDecoderListener;
        if (gVar != null) {
            gVar.onDecodeFailed(i11);
        }
        synchronized (this) {
            nativeDecCache(this.mNativeContext);
        }
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i11, int i12, long j11, long j12, int i13) {
        if (mDecodeFirstFrameTS == 0) {
            mDecodeFirstFrameTS = TXCTimeUtil.getTimeTick();
            TXCLog.i(TAG, "[FirstFramePath][Video][Decoder] TXCVideoDecoder: decode first frame success. instance:" + hashCode() + " isHWAcc:true isH265:" + this.mH265 + " userId:" + this.mUserId + " type:" + this.mStreamType);
            TXCStatus.a(this.mUserId, 5005, this.mStreamType, Long.valueOf(mDecodeFirstFrameTS));
            TXCStatus.a(this.mUserId, PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, this.mStreamType, Integer.valueOf(this.mH265 ? 3 : 1));
        }
        g gVar = this.mDecoderListener;
        if (gVar != null) {
            gVar.onDecodeFrame(tXSVideoFrame, i11, i12, j11, j12, i13);
        }
        int i14 = this.mDecoderCacheNum;
        if (i14 > 0) {
            this.mDecoderCacheNum = i14 - 1;
        }
        if (tXSVideoFrame == null) {
            synchronized (this) {
                nativeNotifyPts(this.mNativeContext, j11, i11, i12);
            }
        }
        int GetDecodeCost = this.mVideoDecoder.GetDecodeCost();
        if (this.mHWDec) {
            TXCStatus.a(this.mUserId, 8004, this.mStreamType, Integer.valueOf(GetDecodeCost));
        } else {
            TXCStatus.a(this.mUserId, TXLiteAVCode.EVT_ROOM_REQUEST_AVSEAT_SUCC, this.mStreamType, Integer.valueOf(GetDecodeCost));
        }
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onDecoderChange(String str, boolean z11) {
        this.mH265 = z11;
        this.mHWDec = true;
        TXCLog.i(TAG, "onDecoderChange " + str + " , isH265 = " + z11);
        reportDecoderEvent(this.mHWDec, z11);
    }

    @Override // com.tencent.liteav.basic.b.b
    public void onNotifyEvent(int i11, Bundle bundle) {
        if (i11 == 2106 || i11 == -2304) {
            nativeNotifyHWDecoderError(this.mNativeContext);
        }
        h.a(this.mNotifyListener, this.mUserId, i11, bundle);
    }

    @Override // com.tencent.liteav.videodecoder.g
    public void onVideoSizeChange(int i11, int i12) {
        g gVar = this.mDecoderListener;
        if (gVar != null) {
            if (this.mVideoWidth == i11 && this.mVideoHeight == i12) {
                return;
            }
            this.mVideoWidth = i11;
            this.mVideoHeight = i12;
            gVar.onVideoSizeChange(i11, i12);
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        decNALByNewWay(tXSNALPacket);
    }

    public void restart(boolean z11) {
        synchronized (this) {
            this.mHWDec = z11;
            nativeReStart(this.mNativeContext, z11);
        }
    }

    public void setListener(g gVar) {
        this.mDecoderListener = gVar;
    }

    public void setNotifyListener(com.tencent.liteav.basic.b.b bVar) {
        this.mNotifyListener = new WeakReference<>(bVar);
    }

    public void setStreamType(int i11) {
        this.mStreamType = i11;
        synchronized (this) {
            nativeSetStreamType(this.mNativeContext, this.mStreamType);
        }
    }

    public void setUserId(String str) {
        this.mUserId = str;
        synchronized (this) {
            nativeSetID(this.mNativeContext, this.mUserId);
        }
    }

    public int setup(SurfaceTexture surfaceTexture, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z11) {
        synchronized (this) {
            try {
                Surface surface = this.mSurface;
                if (surface != null) {
                    surface.release();
                    this.mSurface = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return setup(new Surface(surfaceTexture), byteBuffer, byteBuffer2, z11);
    }

    public synchronized int start() {
        if (this.mHWDec && this.mSurface == null) {
            TXCLog.i(TAG, "play:decode: start decoder error when not setup surface, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        if (this.mNativeContext != 0) {
            TXCLog.w(TAG, "play:decode: start decoder error when decoder is started, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        TXCLog.i(TAG, "[FirstFramePath][Video][Decoder] TXCVideoDecoder: start decode. instance:" + this + " userId:" + this.mUserId + " type:" + this.mStreamType);
        long nativeCreateContext = nativeCreateContext(this.mHWDec, com.tencent.liteav.basic.a.b());
        this.mNativeContext = nativeCreateContext;
        nativeSetID(nativeCreateContext, this.mUserId);
        nativeSetStreamType(this.mNativeContext, this.mStreamType);
        nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        nativeEnableRestartDecoder(this.mNativeContext, this.mEnableRestartDecoder);
        return 0;
    }

    public synchronized void stop() {
        if (this.mNativeContext == 0) {
            TXCLog.w(TAG, "play:decode: stop decoder ignore when decoder is stopped, id " + this.mUserId + "_" + this.mStreamType);
            return;
        }
        TXCLog.w(TAG, "play:decode: stop decoder java id " + this.mUserId + "_" + this.mStreamType + " " + hashCode());
        nativeDestroyContext(this.mNativeContext);
        this.mNativeContext = 0L;
        this.mNALList.clear();
        this.mRecvFirstFrame = false;
        this.mDecoderCacheNum = 0;
        mDecodeFirstFrameTS = 0L;
        synchronized (this) {
            try {
                b bVar = this.mVideoDecoder;
                if (bVar != null) {
                    bVar.stop();
                    this.mVideoDecoder.setListener(null);
                    this.mVideoDecoder.setNotifyListener(null);
                    this.mVideoDecoder = null;
                }
                Surface surface = this.mSurface;
                if (surface != null) {
                    surface.release();
                    this.mSurface = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        b f44237a;

        /* renamed from: b, reason: collision with root package name */
        g f44238b;

        /* renamed from: c, reason: collision with root package name */
        WeakReference<com.tencent.liteav.basic.b.b> f44239c;

        /* renamed from: d, reason: collision with root package name */
        boolean f44240d;

        /* renamed from: e, reason: collision with root package name */
        boolean f44241e;

        /* renamed from: f, reason: collision with root package name */
        Surface f44242f;

        /* renamed from: g, reason: collision with root package name */
        private ByteBuffer f44243g;

        /* renamed from: h, reason: collision with root package name */
        private ByteBuffer f44244h;

        public a(Looper looper) {
            super(looper);
        }

        public void a(boolean z11, boolean z12, Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, g gVar, com.tencent.liteav.basic.b.b bVar) {
            this.f44241e = z11;
            this.f44240d = z12;
            this.f44242f = surface;
            this.f44243g = byteBuffer;
            this.f44244h = byteBuffer2;
            this.f44238b = gVar;
            this.f44239c = new WeakReference<>(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data;
            switch (message.what) {
                case 100:
                    a(((Boolean) message.obj).booleanValue());
                    break;
                case 101:
                    try {
                        data = message.getData();
                    } catch (Exception e11) {
                        e = e11;
                    }
                    try {
                        a(data.getByteArray("nal"), data.getLong("pts"), data.getLong("dts"), data.getInt("codecId"));
                        break;
                    } catch (Exception e12) {
                        e = e12;
                        TXCLog.e(TXCVideoDecoder.TAG, "decode frame failed." + e.getMessage());
                        return;
                    }
                case 102:
                    a();
                    break;
                case 103:
                    a(message.arg1 == 1, message.arg2 == 1);
                    break;
            }
        }

        private void a(byte[] bArr, long j11, long j12, int i11) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.pts = j11;
            tXSNALPacket.dts = j12;
            tXSNALPacket.codecId = i11;
            b bVar = this.f44237a;
            if (bVar != null) {
                bVar.decode(tXSNALPacket);
            }
        }

        private void a() {
            b bVar = this.f44237a;
            if (bVar != null) {
                bVar.stop();
                this.f44237a.setListener(null);
                this.f44237a.setNotifyListener(null);
                this.f44237a = null;
            }
            Looper.myLooper().quit();
            TXCLog.w(TXCVideoDecoder.TAG, "play:decode: stop decode hwdec: " + this.f44240d);
        }

        private void a(boolean z11, boolean z12) {
            this.f44240d = z11;
            TXCLog.w(TXCVideoDecoder.TAG, "play:decode: restart decode hwdec: " + this.f44240d);
            b bVar = this.f44237a;
            if (bVar != null) {
                bVar.stop();
                this.f44237a.setListener(null);
                this.f44237a.setNotifyListener(null);
                this.f44237a = null;
            }
            a(z12);
        }

        private void a(boolean z11) {
            if (this.f44237a != null) {
                TXCLog.i(TXCVideoDecoder.TAG, "play:decode: start decode ignore hwdec: " + this.f44240d);
                return;
            }
            if (this.f44240d) {
                this.f44237a = new f();
            } else {
                this.f44237a = new TXCVideoFfmpegDecoder();
            }
            this.f44237a.setListener(this.f44238b);
            this.f44237a.setNotifyListener(this.f44239c);
            this.f44237a.config(this.f44242f);
            this.f44237a.start(this.f44243g, this.f44244h, z11, this.f44241e);
            TXCLog.w(TXCVideoDecoder.TAG, "play:decode: start decode hwdec: " + this.f44240d + ", h265: " + this.f44241e);
        }
    }

    public int setup(Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z11) {
        synchronized (this) {
            this.mSurface = surface;
        }
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mNeedSortFrame = z11;
        return 0;
    }
}
