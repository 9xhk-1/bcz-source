package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.hms.android.SystemUtils;
import com.tencent.liteav.basic.b.b;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.e;
import com.tencent.liteav.d;
import com.tencent.liteav.h;
import com.tencent.liteav.network.f;
import com.tencent.liteav.network.g;
import com.tencent.liteav.network.j;
import com.tencent.liteav.txcvodplayer.TextureRenderView;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXVodPlayer implements b, g {
    public static final int INDEX_AUTO = -1;
    public static final int PLAYER_TYPE_EXO = 1;
    public static final int PLAYER_TYPE_FFPLAY = 0;
    public static final String TAG = "TXVodPlayer";
    private int mBitrateIndex;
    private TXVodPlayConfig mConfig;
    private Context mContext;
    private boolean mIsGetPlayInfo;
    private boolean mLoop;
    private boolean mMirror;
    private f mNetApi;
    private final h mPlayer;
    private int mRenderMode;
    private int mRenderRotation;
    protected float mStartTime;
    private Surface mSurface;
    private TXCloudVideoView mTXCloudVideoView;
    private TextureRenderView mTextureView;
    private String mToken;
    private boolean mEnableHWDec = false;
    private String mPlayUrl = "";
    private boolean mMute = false;
    private int mAudioPlayoutVolume = -1;
    private boolean mIsGainAudioFocus = true;
    private boolean mAutoPlay = true;
    private float mRate = 1.0f;
    private boolean mSnapshotRunning = false;
    private ITXLivePlayListener mListener = null;
    private ITXVodPlayListener mNewListener = null;

    public TXVodPlayer(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        TXCCommonUtil.setAppContext(applicationContext);
        TXCLog.init();
        this.mPlayer = new h(this.mContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        com.tencent.liteav.basic.log.TXCLog.w(com.tencent.rtmp.TXVodPlayer.TAG, "URL has been transcoded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0067, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String checkPlayUrl(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "TXVodPlayer"
            java.lang.String r1 = "http"
            boolean r1 = r8.startsWith(r1)
            if (r1 == 0) goto L86
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r8.getBytes(r1)     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            int r3 = r1.length     // Catch: java.lang.Exception -> L5e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L5e
            r3 = 0
        L17:
            int r4 = r1.length     // Catch: java.lang.Exception -> L5e
            if (r3 >= r4) goto L7c
            r4 = r1[r3]     // Catch: java.lang.Exception -> L5e
            if (r4 >= 0) goto L20
            int r4 = r4 + 256
        L20:
            r5 = 32
            r6 = 37
            if (r4 <= r5) goto L60
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L60
            r5 = 34
            if (r4 == r5) goto L60
            if (r4 == r6) goto L60
            r5 = 60
            if (r4 == r5) goto L60
            r5 = 62
            if (r4 == r5) goto L60
            r5 = 91
            if (r4 == r5) goto L60
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L60
            r5 = 92
            if (r4 == r5) goto L60
            r5 = 93
            if (r4 == r5) goto L60
            r5 = 94
            if (r4 == r5) goto L60
            r5 = 96
            if (r4 == r5) goto L60
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L60
            r5 = 124(0x7c, float:1.74E-43)
            if (r4 != r5) goto L59
            goto L60
        L59:
            char r4 = (char) r4     // Catch: java.lang.Exception -> L5e
            r2.append(r4)     // Catch: java.lang.Exception -> L5e
            goto L79
        L5e:
            r1 = move-exception
            goto L81
        L60:
            if (r4 != r6) goto L68
            java.lang.String r1 = "URL has been transcoded"
            com.tencent.liteav.basic.log.TXCLog.w(r0, r1)     // Catch: java.lang.Exception -> L5e
            return r8
        L68:
            java.lang.String r5 = "%%%02X"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L5e
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L5e
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch: java.lang.Exception -> L5e
            r2.append(r4)     // Catch: java.lang.Exception -> L5e
        L79:
            int r3 = r3 + 1
            goto L17
        L7c:
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L5e
            goto L86
        L81:
            java.lang.String r2 = "get utf-8 string failed."
            com.tencent.liteav.basic.log.TXCLog.e(r0, r2, r1)
        L86:
            java.lang.String r8 = r8.trim()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.TXVodPlayer.checkPlayUrl(java.lang.String):java.lang.String");
    }

    private boolean isAVCDecBlacklistDevices() {
        return e.f43439c.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI) && e.f43437a.equalsIgnoreCase("Che2-TL00");
    }

    private void postBitmapToMainThread(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.TXVodPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                if (iTXSnapshotListener2 != null) {
                    iTXSnapshotListener2.onSnapshot(bitmap);
                }
                TXVodPlayer.this.mSnapshotRunning = false;
            }
        });
    }

    public void attachTRTC(Object obj) {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(obj);
        }
    }

    public void detachTRTC() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.r();
        }
    }

    public boolean enableHardwareDecode(boolean z11) {
        if (!z11 || !isAVCDecBlacklistDevices()) {
            this.mEnableHWDec = z11;
            updateConfig();
            return true;
        }
        TXCLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + e.f43439c + ", MODEL" + e.f43437a);
        return false;
    }

    public int getBitrateIndex() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.p();
        }
        return 0;
    }

    public float getBufferDuration() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.k();
        }
        return 0.0f;
    }

    public float getCurrentPlaybackTime() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.i();
        }
        return 0.0f;
    }

    public float getDuration() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.l();
        }
        return 0.0f;
    }

    public int getHeight() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.o();
        }
        return 0;
    }

    public float getPlayableDuration() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.m();
        }
        return 0.0f;
    }

    public ArrayList<TXBitrateItem> getSupportedBitrates() {
        h hVar = this.mPlayer;
        return hVar != null ? hVar.q() : new ArrayList<>();
    }

    public int getWidth() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.n();
        }
        return 0;
    }

    public boolean isLoop() {
        return this.mLoop;
    }

    public boolean isPlaying() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.c();
        }
        return false;
    }

    @Override // com.tencent.liteav.network.g
    public void onNetFailed(f fVar, String str, int i11) {
        if (fVar != this.mNetApi) {
            return;
        }
        this.mIsGetPlayInfo = false;
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2010);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putInt("EVT_PARAM1", i11);
        onNotifyEvent(-2306, bundle);
        TXCLog.i(TAG, "onNetFailed: eventId: -2306 description:" + str);
    }

    @Override // com.tencent.liteav.network.g
    public void onNetSuccess(f fVar) {
        if (fVar != this.mNetApi) {
            return;
        }
        j a11 = fVar.a();
        if (!this.mIsGetPlayInfo) {
            startPlay(a11.a());
        }
        this.mIsGetPlayInfo = false;
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2010);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Requested file information successfully");
        bundle.putString(TXLiveConstants.EVT_PLAY_URL, a11.a());
        bundle.putString(TXLiveConstants.EVT_PLAY_COVER_URL, a11.b());
        bundle.putString(TXLiveConstants.EVT_PLAY_NAME, a11.f());
        bundle.putString(TXLiveConstants.EVT_PLAY_DESCRIPTION, a11.g());
        if (a11.d() != null) {
            bundle.putInt(TXLiveConstants.EVT_PLAY_DURATION, a11.d().c());
        }
        onNotifyEvent(2010, bundle);
        TXCLog.i(TAG, "onNetSuccess: Requested file information successfully");
    }

    @Override // com.tencent.liteav.basic.b.b
    public void onNotifyEvent(int i11, Bundle bundle) {
        if (i11 == 15001) {
            TXCloudVideoView tXCloudVideoView = this.mTXCloudVideoView;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.setLogText(bundle, null, 0);
            }
            ITXLivePlayListener iTXLivePlayListener = this.mListener;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onNetStatus(bundle);
            }
            ITXVodPlayListener iTXVodPlayListener = this.mNewListener;
            if (iTXVodPlayListener != null) {
                iTXVodPlayListener.onNetStatus(this, bundle);
                return;
            }
            return;
        }
        TXCloudVideoView tXCloudVideoView2 = this.mTXCloudVideoView;
        if (tXCloudVideoView2 != null) {
            tXCloudVideoView2.setLogText(null, bundle, i11);
        }
        ITXLivePlayListener iTXLivePlayListener2 = this.mListener;
        if (iTXLivePlayListener2 != null) {
            iTXLivePlayListener2.onPlayEvent(i11, bundle);
        }
        ITXVodPlayListener iTXVodPlayListener2 = this.mNewListener;
        if (iTXVodPlayListener2 != null) {
            iTXVodPlayListener2.onPlayEvent(this, i11, bundle);
        }
    }

    public void pause() {
        TXCLog.i(TAG, ma.b.L);
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a();
        }
    }

    public void publishAudio() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.u();
        }
    }

    public void publishVideo() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.s();
        }
    }

    public void resume() {
        TXCLog.i(TAG, ma.b.K);
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void seek(int i11) {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.f(i11);
        }
    }

    public void setAudioPlayoutVolume(int i11) {
        TXCLog.i(TAG, "setAudioPlayoutVolume:" + i11);
        this.mAudioPlayoutVolume = i11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.g(i11);
        }
    }

    public void setAutoPlay(boolean z11) {
        TXCLog.i(TAG, "setAutoPlay:" + z11);
        this.mAutoPlay = z11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.e(z11);
        }
    }

    public void setBitrateIndex(int i11) {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.h(i11);
        }
        this.mBitrateIndex = i11;
    }

    public void setConfig(TXVodPlayConfig tXVodPlayConfig) {
        this.mConfig = tXVodPlayConfig;
        if (tXVodPlayConfig == null) {
            this.mConfig = new TXVodPlayConfig();
        }
        h hVar = this.mPlayer;
        if (hVar != null) {
            d w11 = hVar.w();
            if (w11 == null) {
                w11 = new d();
            }
            TXVodPlayConfig tXVodPlayConfig2 = this.mConfig;
            w11.f43519e = tXVodPlayConfig2.mConnectRetryCount;
            w11.f43520f = tXVodPlayConfig2.mConnectRetryInterval;
            w11.f43532r = tXVodPlayConfig2.mTimeout;
            w11.f43522h = this.mEnableHWDec;
            w11.f43528n = tXVodPlayConfig2.mCacheFolderPath;
            w11.f43529o = tXVodPlayConfig2.mMaxCacheItems;
            w11.f43530p = tXVodPlayConfig2.mPlayerType;
            w11.f43531q = tXVodPlayConfig2.mHeaders;
            w11.f43533s = tXVodPlayConfig2.enableAccurateSeek;
            w11.f43534t = tXVodPlayConfig2.autoRotate;
            w11.f43535u = tXVodPlayConfig2.smoothSwitchBitrate;
            w11.f43536v = tXVodPlayConfig2.cacheMp4ExtName;
            w11.f43537w = tXVodPlayConfig2.progressInterval;
            w11.f43538x = tXVodPlayConfig2.maxBufferSize;
            TXCLog.i(TAG, "setConfig [connectRetryCount:" + this.mConfig.mConnectRetryCount + "(default 3 times)][connectRetryInterval:" + this.mConfig.mConnectRetryInterval + "(default 3s,min:3s max:30s)][vodTimeout:" + this.mConfig.mTimeout + "(default 10s)][enableHardwareDecoder:" + this.mEnableHWDec + "(default false)][cacheFolderPath for mp4/HLS:" + this.mConfig.mCacheFolderPath + "][maxCacheItems:" + this.mConfig.mMaxCacheItems + "][enableAccurateSeek:" + this.mConfig.enableAccurateSeek + "(default true)][autoRotate:" + this.mConfig.autoRotate + "(default true)][HLS smoothSwitchBitrate:" + this.mConfig.smoothSwitchBitrate + "(default false)][progressInterval:" + this.mConfig.progressInterval + "(default 0.5s)][preload maxBufferSize:" + this.mConfig.maxBufferSize + "]");
            this.mPlayer.a(w11);
        }
    }

    public void setLoop(boolean z11) {
        TXCLog.i(TAG, "setLoop:" + z11);
        this.mLoop = z11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.f(z11);
        }
    }

    public void setMirror(boolean z11) {
        TXCLog.i(TAG, "setMirror:" + z11);
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.g(z11);
        }
        this.mMirror = z11;
    }

    public void setMute(boolean z11) {
        TXCLog.i(TAG, "setMute:" + z11);
        this.mMute = z11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.b(z11);
        }
    }

    @Deprecated
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        TXCLog.i(TAG, "setPlayerView TXCloudVideoView:" + tXCloudVideoView);
        this.mTXCloudVideoView = tXCloudVideoView;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(tXCloudVideoView);
        }
    }

    public void setRate(float f11) {
        this.mRate = f11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.b(f11);
        }
    }

    public void setRenderMode(int i11) {
        this.mRenderMode = i11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(i11);
        }
    }

    public void setRenderRotation(int i11) {
        this.mRenderRotation = i11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.b(i11);
        }
    }

    public boolean setRequestAudioFocus(boolean z11) {
        this.mIsGainAudioFocus = z11;
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.d(z11);
        }
        return true;
    }

    public void setStartTime(float f11) {
        this.mStartTime = f11;
    }

    public void setSurface(Surface surface) {
        TXCLog.i(TAG, "setSurface Surface:" + surface);
        this.mSurface = surface;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(surface);
        }
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setVodListener(ITXVodPlayListener iTXVodPlayListener) {
        this.mNewListener = iTXVodPlayListener;
    }

    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        if (this.mSnapshotRunning || iTXSnapshotListener == null) {
            return;
        }
        this.mSnapshotRunning = true;
        h hVar = this.mPlayer;
        TextureView d11 = hVar != null ? hVar.d() : null;
        if (d11 == null) {
            this.mSnapshotRunning = false;
            return;
        }
        Bitmap bitmap = d11.getBitmap();
        if (bitmap != null) {
            Matrix transform = d11.getTransform(null);
            if (this.mMirror) {
                transform.postScale(-1.0f, 1.0f);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), transform, true);
            bitmap.recycle();
            bitmap = createBitmap;
        }
        postBitmapToMainThread(iTXSnapshotListener, bitmap);
    }

    public int startPlay(String str) {
        String path;
        if (str == null || TextUtils.isEmpty(str)) {
            TXCLog.i(TAG, "startPlay playUrl is empty");
            return -1;
        }
        TXCDRApi.initCrashReport(this.mContext);
        int i11 = this.mBitrateIndex;
        stopPlay(false);
        this.mBitrateIndex = i11;
        if (this.mToken != null && (path = Uri.parse(str).getPath()) != null) {
            String[] split = path.split("/");
            if (split.length > 0) {
                int lastIndexOf = str.lastIndexOf(split[split.length - 1]);
                str = str.substring(0, lastIndexOf) + "voddrm.token." + this.mToken + "." + str.substring(lastIndexOf);
            }
        }
        this.mPlayUrl = checkPlayUrl(str);
        TXCLog.i(TAG, "===========================================================================================================================================================");
        TXCLog.i(TAG, "===========================================================================================================================================================");
        TXCLog.i(TAG, "=====  StartPlay url = " + this.mPlayUrl + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.i(TAG, "===========================================================================================================================================================");
        TXCLog.i(TAG, "===========================================================================================================================================================");
        updateConfig();
        TXCloudVideoView tXCloudVideoView = this.mTXCloudVideoView;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.mTXCloudVideoView.setVisibility(0);
            this.mPlayer.a(this.mTXCloudVideoView);
        } else {
            Surface surface = this.mSurface;
            if (surface != null) {
                this.mPlayer.a(surface);
            } else {
                TextureRenderView textureRenderView = this.mTextureView;
                if (textureRenderView != null) {
                    this.mPlayer.a(textureRenderView);
                }
            }
        }
        this.mPlayer.h(this.mBitrateIndex);
        this.mPlayer.a((b) this);
        this.mPlayer.d(this.mIsGainAudioFocus);
        this.mPlayer.e(this.mAutoPlay);
        this.mPlayer.c(this.mStartTime);
        this.mPlayer.a(this.mPlayUrl, 0);
        this.mPlayer.b(this.mMute);
        int i12 = this.mAudioPlayoutVolume;
        if (i12 >= 0) {
            this.mPlayer.g(i12);
        }
        this.mPlayer.b(this.mRate);
        this.mPlayer.b(this.mRenderRotation);
        this.mPlayer.a(this.mRenderMode);
        this.mPlayer.f(this.mLoop);
        setMirror(this.mMirror);
        return 0;
    }

    public int stopPlay(boolean z11) {
        TXCloudVideoView tXCloudVideoView;
        TXCLog.i(TAG, "stopPlay needClearLastImg:" + z11);
        if (z11 && (tXCloudVideoView = this.mTXCloudVideoView) != null) {
            tXCloudVideoView.setVisibility(8);
        }
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(z11);
        }
        this.mPlayUrl = "";
        f fVar = this.mNetApi;
        if (fVar != null) {
            fVar.a((g) null);
            this.mNetApi = null;
        }
        this.mBitrateIndex = 0;
        this.mIsGetPlayInfo = false;
        return 0;
    }

    public void unpublishAudio() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.v();
        }
    }

    public void unpublishVideo() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.t();
        }
    }

    public void updateConfig() {
        setConfig(this.mConfig);
    }

    public void seek(float f11) {
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(f11);
        }
    }

    public void setPlayerView(TextureRenderView textureRenderView) {
        TXCLog.i(TAG, "setPlayerView TextureRenderView:" + textureRenderView);
        this.mTextureView = textureRenderView;
        h hVar = this.mPlayer;
        if (hVar != null) {
            hVar.a(textureRenderView);
        }
    }

    public int startPlay(TXPlayerAuthBuilder tXPlayerAuthBuilder) {
        f fVar = new f();
        this.mNetApi = fVar;
        fVar.a(tXPlayerAuthBuilder.isHttps);
        this.mNetApi.a(this);
        TXCLog.i(TAG, "startPlay [FileId:" + tXPlayerAuthBuilder.fileId + "][Timeout:" + tXPlayerAuthBuilder.timeout + "][Unique identification request:" + tXPlayerAuthBuilder.f44625us + "][Trial duration:" + tXPlayerAuthBuilder.exper + "][Sign:" + tXPlayerAuthBuilder.sign + "]");
        return this.mNetApi.a(tXPlayerAuthBuilder.appId, tXPlayerAuthBuilder.fileId, tXPlayerAuthBuilder.timeout, tXPlayerAuthBuilder.f44625us, tXPlayerAuthBuilder.exper, tXPlayerAuthBuilder.sign);
    }
}
