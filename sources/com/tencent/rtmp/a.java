package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.android.SystemUtils;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.b.b;
import com.tencent.liteav.basic.c.k;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.d;
import com.tencent.liteav.e;
import com.tencent.liteav.j;
import com.tencent.liteav.l;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import javax.microedition.khronos.egl.EGLContext;
import k3.u0;
import org.json.JSONObject;
import s3.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements b {
    private long A;
    private String B;
    private long G;
    private String H;
    private int I;
    private TXLivePlayer.ITXAudioRawDataListener L;

    /* renamed from: a, reason: collision with root package name */
    private TXCloudVideoView f44629a;

    /* renamed from: b, reason: collision with root package name */
    private Surface f44630b;

    /* renamed from: c, reason: collision with root package name */
    private int f44631c;

    /* renamed from: d, reason: collision with root package name */
    private int f44632d;

    /* renamed from: f, reason: collision with root package name */
    private TXLivePlayConfig f44634f;

    /* renamed from: i, reason: collision with root package name */
    private int f44637i;

    /* renamed from: j, reason: collision with root package name */
    private int f44638j;

    /* renamed from: s, reason: collision with root package name */
    private Context f44647s;

    /* renamed from: t, reason: collision with root package name */
    private Handler f44648t;

    /* renamed from: u, reason: collision with root package name */
    private j f44649u;

    /* renamed from: y, reason: collision with root package name */
    private e f44653y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44654z;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44635g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44636h = true;

    /* renamed from: k, reason: collision with root package name */
    private String f44639k = "";

    /* renamed from: l, reason: collision with root package name */
    private boolean f44640l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f44641m = 100;

    /* renamed from: n, reason: collision with root package name */
    private int f44642n = 0;

    /* renamed from: o, reason: collision with root package name */
    private TXLivePlayer.ITXVideoRawDataListener f44643o = null;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f44644p = null;

    /* renamed from: q, reason: collision with root package name */
    private Object f44645q = null;

    /* renamed from: r, reason: collision with root package name */
    private TXLivePlayer.ITXLivePlayVideoRenderListener f44646r = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44650v = true;

    /* renamed from: w, reason: collision with root package name */
    private float f44651w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    private boolean f44652x = false;
    private int C = -1;
    private long D = 0;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener E = null;
    private int F = 0;
    private int J = 0;
    private RunnableC0527a K = null;

    /* renamed from: e, reason: collision with root package name */
    private ITXLivePlayListener f44633e = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.rtmp.a$a, reason: collision with other inner class name */
    public class RunnableC0527a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f44664b;

        private RunnableC0527a() {
            this.f44664b = 300;
        }

        public void a(int i11) {
            this.f44664b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f44649u != null && a.this.f44649u.c()) {
                int j11 = a.this.f44649u.j();
                if (a.this.E != null) {
                    a.this.E.onAudioVolumeEvaluationNotify(j11);
                }
            }
            if (a.this.f44648t == null || this.f44664b <= 0) {
                return;
            }
            a.this.f44648t.postDelayed(a.this.K, this.f44664b);
        }
    }

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f44647s = applicationContext;
        TXCCommonUtil.setAppContext(applicationContext);
        TXCLog.init();
        this.f44648t = new Handler(Looper.getMainLooper());
        TXCCommonUtil.setAppContext(this.f44647s);
        TXCLog.init();
    }

    private void h() {
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(false, 0);
        }
        Handler handler = this.f44648t;
        if (handler != null) {
            handler.removeCallbacks(this.K);
        }
        this.K = null;
        this.F = 0;
    }

    private void i() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.G > 3000) {
            this.G = currentTimeMillis;
            c("[Statistics] logStatisticsStr statistics:" + this.H);
        }
    }

    private boolean j() {
        return com.tencent.liteav.basic.util.e.f43439c.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI) && com.tencent.liteav.basic.util.e.f43437a.equalsIgnoreCase("Che2-TL00");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    @Override // com.tencent.liteav.basic.b.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotifyEvent(int r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.a.onNotifyEvent(int, android.os.Bundle):void");
    }

    private void c(String str) {
        if (str == null) {
            str = "";
        }
        TXCLog.i(TXLivePlayer.TAG, "[API] TXLivePlayer(" + hashCode() + ") " + str);
    }

    private void g() {
        j jVar = this.f44649u;
        if (jVar != null) {
            int i11 = this.F;
            jVar.a(i11 > 0, i11);
            if (this.F > 0) {
                if (this.K == null) {
                    this.K = new RunnableC0527a();
                }
                this.K.a(this.F);
                Handler handler = this.f44648t;
                if (handler != null) {
                    handler.removeCallbacks(this.K);
                    this.f44648t.postDelayed(this.K, this.F);
                }
            }
        }
    }

    public void b() {
        c(ma.b.L);
        if (this.f44649u != null) {
            TXCLog.w(TXLivePlayer.TAG, "pause play");
            this.f44649u.a();
        }
    }

    public void d(int i11) {
        c("setAudioRoute route:" + i11);
        TXCAudioEngine.setAudioRoute(i11);
    }

    public void e(int i11) {
        c("enableAudioVolumeEvaluation intervalMs:" + i11);
        if (i11 <= 0) {
            this.F = 0;
            h();
        } else {
            if (i11 < 100) {
                i11 = 100;
            }
            this.F = i11;
            g();
        }
    }

    public int f(int i11) {
        c("startRecord type:" + i11);
        if (!a()) {
            TXCLog.e(TXLivePlayer.TAG, "startRecord: there is no playing stream");
            return -1;
        }
        j jVar = this.f44649u;
        if (jVar != null) {
            return jVar.e(i11);
        }
        return -1;
    }

    public int d() {
        c("stopRecord");
        j jVar = this.f44649u;
        if (jVar != null) {
            return jVar.e();
        }
        return -1;
    }

    public void c() {
        c(ma.b.K);
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.b();
            if (this.f44649u.f()) {
                e eVar = this.f44653y;
                long a11 = eVar != null ? eVar.a() : 0L;
                this.A = a11;
                if (a11 > 0) {
                    this.f44649u.h();
                }
            }
        }
    }

    public void a(TXLivePlayConfig tXLivePlayConfig) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setConfig");
        sb2.append(tXLivePlayConfig != null ? tXLivePlayConfig.toString() : null);
        c(sb2.toString());
        this.f44634f = tXLivePlayConfig;
        if (tXLivePlayConfig == null) {
            this.f44634f = new TXLivePlayConfig();
        }
        j jVar = this.f44649u;
        if (jVar != null) {
            d w11 = jVar.w();
            if (w11 == null) {
                w11 = new d();
            }
            TXLivePlayConfig tXLivePlayConfig2 = this.f44634f;
            float f11 = tXLivePlayConfig2.mMinAutoAdjustCacheTime;
            this.I = (int) (1000.0f * f11);
            w11.f43515a = tXLivePlayConfig2.mCacheTime;
            w11.f43521g = tXLivePlayConfig2.mAutoAdjustCacheTime;
            w11.f43517c = f11;
            w11.f43516b = tXLivePlayConfig2.mMaxAutoAdjustCacheTime;
            w11.f43518d = tXLivePlayConfig2.mVideoBlockThreshold;
            w11.f43519e = tXLivePlayConfig2.mConnectRetryCount;
            w11.f43520f = tXLivePlayConfig2.mConnectRetryInterval;
            w11.f43523i = tXLivePlayConfig2.mEnableNearestIP;
            w11.f43527m = tXLivePlayConfig2.mRtmpChannelType;
            w11.f43522h = this.f44635g;
            w11.f43528n = tXLivePlayConfig2.mCacheFolderPath;
            w11.f43529o = tXLivePlayConfig2.mMaxCacheItems;
            w11.f43524j = tXLivePlayConfig2.mEnableMessage;
            w11.f43525k = tXLivePlayConfig2.mEnableMetaData;
            w11.f43526l = tXLivePlayConfig2.mFlvSessionKey;
            w11.f43531q = tXLivePlayConfig2.mHeaders;
            TXCLog.i(TXLivePlayer.TAG, "liteav_api setConfig [cacheTime:" + this.f44634f.mCacheTime + "][autoAdjustCacheTime:" + this.f44634f.mAutoAdjustCacheTime + "][minAutoAdjustCacheTime:" + this.f44634f.mMinAutoAdjustCacheTime + "][maxAutoAdjustCacheTime:" + this.f44634f.mMaxAutoAdjustCacheTime + "][videoBlockThreshold:" + this.f44634f.mVideoBlockThreshold + "][connectRetryCount:" + this.f44634f.mConnectRetryCount + "][connectRetryInterval:" + this.f44634f.mConnectRetryInterval + "][enableHWDec:" + this.f44635g + "][enableMessage:" + this.f44634f.mEnableMessage + "][enableMetaData:" + this.f44634f.mEnableMetaData + "][flvSessionKey:" + this.f44634f.mFlvSessionKey);
            this.f44649u.a(w11);
        }
    }

    public void b(int i11) {
        c("setRenderRotation rotation:" + i11);
        this.f44638j = i11;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.b(i11);
        }
    }

    @Deprecated
    public void d(boolean z11) {
        TXCLog.i(TXLivePlayer.TAG, "setAutoPlay " + z11);
        this.f44650v = z11;
    }

    public int e() {
        c("resumeLive");
        if (!this.f44654z) {
            return -1;
        }
        this.f44654z = false;
        return a(this.B, 1);
    }

    public long f() {
        j jVar = this.f44649u;
        if (jVar != null) {
            return jVar.g();
        }
        return 0L;
    }

    public boolean b(boolean z11) {
        c("enableHardwareDecode enable:" + z11);
        if (z11 && j()) {
            TXCLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + com.tencent.liteav.basic.util.e.f43439c + ", MODEL" + com.tencent.liteav.basic.util.e.f43437a);
            return false;
        }
        this.f44635g = z11;
        j jVar = this.f44649u;
        if (jVar == null) {
            return true;
        }
        d w11 = jVar.w();
        if (w11 == null) {
            w11 = new d();
        }
        w11.f43522h = this.f44635g;
        this.f44649u.a(w11);
        return true;
    }

    public void c(boolean z11) {
        c("setMute mute:" + z11);
        this.f44640l = z11;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.b(z11);
        }
    }

    public void g(int i11) {
        c("seek time:" + i11);
        j jVar = this.f44649u;
        if (jVar != null) {
            if (!jVar.f() && !this.f44654z) {
                this.f44649u.f(i11);
                return;
            }
            e eVar = this.f44653y;
            String a11 = eVar != null ? eVar.a(i11) : "";
            if (!TextUtils.isEmpty(a11)) {
                boolean z11 = a(a11, 3) == 0;
                this.f44654z = z11;
                if (z11) {
                    this.A = i11 * 1000;
                    return;
                }
                return;
            }
            ITXLivePlayListener iTXLivePlayListener = this.f44633e;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onPlayEvent(-2301, new Bundle());
            }
        }
    }

    public void c(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 > 100) {
            i11 = 100;
        }
        c("setVolume volume:" + i11);
        this.f44641m = i11;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.c(i11);
        }
    }

    private String c(String str, int i11) {
        if (i11 != 6) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb2 = new StringBuilder(bytes.length);
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    int i13 = bytes[i12];
                    if (i13 < 0) {
                        i13 += 256;
                    }
                    if (i13 > 32 && i13 < 127 && i13 != 34 && i13 != 37 && i13 != 60 && i13 != 62 && i13 != 91 && i13 != 125 && i13 != 92 && i13 != 93 && i13 != 94 && i13 != 96 && i13 != 123 && i13 != 124) {
                        sb2.append((char) i13);
                    }
                    sb2.append(String.format("%%%02X", Integer.valueOf(i13)));
                }
                str = sb2.toString();
            } catch (Exception e11) {
                TXCLog.e(TXLivePlayer.TAG, "check play url failed.", e11);
            }
        }
        return str.trim();
    }

    public void b(String str) {
        c("callExperimentalAPI json:" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(c.f87469a)) {
                TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            String string = jSONObject.getString(c.f87469a);
            JSONObject jSONObject2 = jSONObject.has("params") ? jSONObject.getJSONObject("params") : null;
            if (!string.equals("muteRemoteAudioInSpeaker")) {
                TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[illegal api]: " + string);
            } else {
                if (jSONObject2 == null) {
                    TXCLog.e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]");
                    return;
                }
                if (!jSONObject2.has(u0.f65628b)) {
                    TXCLog.e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]: enable");
                    return;
                }
                int i11 = jSONObject2.getInt(u0.f65628b);
                j jVar = this.f44649u;
                if (jVar != null) {
                    boolean z11 = true;
                    if (i11 != 1) {
                        z11 = false;
                    }
                    jVar.c(z11);
                }
            }
            if (!string.equals("setInterfaceType")) {
                TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[illegal api]: " + string);
            } else if (jSONObject2 == null) {
                TXCLog.e(TXLivePlayer.TAG, "setInterfaceType[lack parameter]");
                return;
            } else {
                if (!jSONObject2.has("type")) {
                    TXCLog.e(TXLivePlayer.TAG, "setInterfaceType[lack parameter]: type");
                    return;
                }
                this.J = jSONObject2.optInt("type", 0);
            }
            if (string.equals("setSEIPayloadType")) {
                if (jSONObject2 != null && jSONObject2.has("payloadType")) {
                    int i12 = jSONObject2.getInt("payloadType");
                    if (i12 != 5 && i12 != 242 && i12 != 100 && i12 != 243) {
                        c("callExperimentalAPI[invalid param]: payloadType[" + i12 + "]");
                        return;
                    }
                    this.f44642n = i12;
                    j jVar2 = this.f44649u;
                    if (jVar2 != null) {
                        jVar2.d(i12);
                        return;
                    }
                    return;
                }
                c("callExperimentalAPI[lack parameter or illegal type]: payloadType");
            }
        } catch (Exception unused) {
            TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[failed]: " + str);
        }
    }

    public void a(ITXLivePlayListener iTXLivePlayListener) {
        c("setPlayListener listener:" + iTXLivePlayListener);
        this.f44633e = iTXLivePlayListener;
    }

    public void a(TXCloudVideoView tXCloudVideoView) {
        c("setPlayerView old:" + this.f44629a + " new:" + tXCloudVideoView);
        this.f44629a = tXCloudVideoView;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(tXCloudVideoView);
        }
    }

    public int a(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.e(TXLivePlayer.TAG, "start play error when url is empty " + this);
            return -1;
        }
        if (!TextUtils.isEmpty(this.f44639k)) {
            if (this.f44639k.equalsIgnoreCase(str) && a()) {
                TXCLog.e(TXLivePlayer.TAG, "start play error when new url is the same with old url  " + this);
                if (this.f44654z) {
                    onNotifyEvent(2004, new Bundle());
                }
                return this.f44654z ? 0 : -1;
            }
            TXCLog.w(TXLivePlayer.TAG, " stop old play when new url is not the same with old url  " + this);
            j jVar = this.f44649u;
            if (jVar != null) {
                jVar.a(false);
            }
            this.f44639k = "";
        }
        TXCDRApi.initCrashReport(this.f44647s);
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.i(TXLivePlayer.TAG, "=====  StartPlay url = " + str + " playType = " + i11 + " DeviceName = " + com.tencent.liteav.basic.util.e.f43437a + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        int i12 = this.C;
        if (i12 == -1 || i12 != i11) {
            this.f44649u = l.a(this.f44647s, i11);
        }
        this.C = i11;
        if (this.f44649u == null) {
            TXCLog.i(TXLivePlayer.TAG, "liteav_api startPlay create palyer failed" + this);
            return -2;
        }
        this.f44639k = c(str, i11);
        c("startPlay url:" + str + " type:" + i11);
        a(this.f44634f);
        TXCloudVideoView tXCloudVideoView = this.f44629a;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f44629a.setVisibility(0);
        }
        this.f44649u.a(this.f44629a);
        this.f44649u.a(this);
        this.f44649u.e(this.f44650v);
        Surface surface = this.f44630b;
        if (surface != null) {
            this.f44649u.a(surface);
            this.f44649u.a(this.f44631c, this.f44632d);
        }
        this.f44649u.a(this.f44639k, i11);
        this.f44649u.b(this.f44640l);
        this.f44649u.c(this.f44641m);
        this.f44649u.d(this.f44642n);
        this.f44649u.b(this.f44651w);
        this.f44649u.b(this.f44638j);
        this.f44649u.a(this.f44637i);
        this.f44649u.a(this.L);
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.f44643o;
        if (iTXVideoRawDataListener != null) {
            a(iTXVideoRawDataListener);
        }
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.f44646r;
        if (iTXLivePlayVideoRenderListener != null) {
            a(iTXLivePlayVideoRenderListener, this.f44645q);
        }
        if (this.f44649u.f()) {
            this.B = this.f44639k;
            e eVar = this.f44653y;
            long a11 = eVar != null ? eVar.a() : 0L;
            this.A = a11;
            if (a11 > 0) {
                this.f44649u.h();
            }
        }
        if (this.J == 0) {
            TXCDRApi.txReportDAU(this.f44647s.getApplicationContext(), com.tencent.liteav.basic.datareport.a.f43323bu);
        } else {
            TXCDRApi.txReportDAU(this.f44647s.getApplicationContext(), com.tencent.liteav.basic.datareport.a.bH);
        }
        g();
        return 0;
    }

    public int b(String str, int i11) {
        c("prepareLiveSeek domain:" + str + " bizid:" + i11);
        if (this.f44653y == null) {
            this.f44653y = new e();
        }
        e eVar = this.f44653y;
        if (eVar != null) {
            return eVar.a(this.f44639k, str, i11, new e.a() { // from class: com.tencent.rtmp.a.4
                @Override // com.tencent.liteav.e.a
                public void a(long j11) {
                    a.this.A = j11;
                    if (a.this.f44649u != null) {
                        a.this.f44649u.h();
                    }
                }
            });
        }
        return -1;
    }

    public int a(boolean z11) {
        TXCloudVideoView tXCloudVideoView;
        c("stopPlay need clear:" + z11);
        if (z11 && (tXCloudVideoView = this.f44629a) != null) {
            tXCloudVideoView.setVisibility(8);
        }
        h();
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(z11);
        }
        this.f44639k = "";
        this.A = 0L;
        this.J = 0;
        this.f44653y = null;
        this.f44654z = false;
        return 0;
    }

    public boolean a() {
        j jVar = this.f44649u;
        if (jVar != null) {
            return jVar.c();
        }
        return false;
    }

    public void a(Surface surface) {
        c("setSurface old:" + this.f44630b + " new:" + surface);
        this.f44630b = surface;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(surface);
        }
    }

    public void a(int i11, int i12) {
        c("setSurfaceSize width:" + i11 + " height:" + i12);
        this.f44631c = i11;
        this.f44632d = i12;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(i11, i12);
        }
    }

    public void a(int i11) {
        c("setRenderMode mode:" + i11);
        this.f44637i = i11;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(i11);
        }
    }

    public int a(String str) {
        c("[SwitchStream]switchStream url:" + str);
        j jVar = this.f44649u;
        if (jVar != null) {
            return jVar.a(str);
        }
        return -1;
    }

    public void a(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.E = iTXAudioVolumeEvaluationListener;
    }

    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        c("setVideoRecordListener listener:" + iTXVideoRecordListener);
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(iTXVideoRecordListener);
        }
    }

    public void a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        c("snapshot listener:" + iTXSnapshotListener);
        if (this.f44652x || iTXSnapshotListener == null) {
            return;
        }
        this.f44652x = true;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(new k() { // from class: com.tencent.rtmp.a.1
                @Override // com.tencent.liteav.basic.c.k
                public void a(Bitmap bitmap) {
                    a.this.a(iTXSnapshotListener, bitmap);
                }
            });
        } else {
            this.f44652x = false;
        }
    }

    public boolean a(byte[] bArr) {
        String str = this.f44639k;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (this.f44635g) {
            TXLog.e(TXLivePlayer.TAG, "can not addVideoRawData because of hw decode has set!");
            return false;
        }
        if (this.f44649u == null) {
            TXCLog.e(TXLivePlayer.TAG, "player hasn't created or not instanceof live player");
            return false;
        }
        this.f44644p = bArr;
        return true;
    }

    public int a(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        c("setVideoRenderListener listener:" + iTXLivePlayVideoRenderListener + " context:" + obj);
        if (obj != null && !(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
            TXCLog.w(TXLivePlayer.TAG, "setVideoRenderListener error when glContext error " + obj);
            return -1;
        }
        this.f44645q = obj;
        this.f44646r = iTXLivePlayVideoRenderListener;
        j jVar = this.f44649u;
        if (jVar == null) {
            return 0;
        }
        if (iTXLivePlayVideoRenderListener != null) {
            jVar.a(new com.tencent.liteav.k() { // from class: com.tencent.rtmp.a.2
                @Override // com.tencent.liteav.k
                public void a(String str, int i11, TXSVideoFrame tXSVideoFrame) {
                    TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener2;
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0 || (iTXLivePlayVideoRenderListener2 = a.this.f44646r) == null) {
                        return;
                    }
                    TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
                    tXLiteAVTexture.textureId = tXSVideoFrame.textureId;
                    tXLiteAVTexture.width = tXSVideoFrame.width;
                    tXLiteAVTexture.height = tXSVideoFrame.height;
                    tXLiteAVTexture.eglContext = tXSVideoFrame.eglContext;
                    iTXLivePlayVideoRenderListener2.onRenderVideoFrame(tXLiteAVTexture);
                }
            }, com.tencent.liteav.basic.enums.b.TEXTURE_2D, obj);
            return 0;
        }
        jVar.a(null, com.tencent.liteav.basic.enums.b.UNKNOWN, null);
        return 0;
    }

    public void a(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        c("setVideoRawDataListener listener:" + iTXVideoRawDataListener);
        this.f44643o = iTXVideoRawDataListener;
        j jVar = this.f44649u;
        if (jVar == null) {
            return;
        }
        if (iTXVideoRawDataListener != null) {
            jVar.a(new com.tencent.liteav.k() { // from class: com.tencent.rtmp.a.3
                @Override // com.tencent.liteav.k
                public void a(String str, int i11, TXSVideoFrame tXSVideoFrame) {
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0) {
                        return;
                    }
                    byte[] bArr = a.this.f44644p;
                    a.this.f44644p = null;
                    TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener2 = a.this.f44643o;
                    if (iTXVideoRawDataListener2 == null || bArr == null) {
                        return;
                    }
                    if (bArr.length < ((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2) {
                        TXCLog.e(TXLivePlayer.TAG, "raw data buffer length is too large");
                        return;
                    }
                    tXSVideoFrame.loadYUVArray(bArr);
                    iTXVideoRawDataListener2.onVideoRawDataAvailable(bArr, tXSVideoFrame.width, tXSVideoFrame.height, (int) tXSVideoFrame.pts);
                    tXSVideoFrame.release();
                }
            }, com.tencent.liteav.basic.enums.b.I420, null);
        } else {
            jVar.a(null, com.tencent.liteav.basic.enums.b.UNKNOWN, null);
        }
    }

    public void a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        c("setAudioRawDataListener listener:" + iTXAudioRawDataListener);
        this.L = iTXAudioRawDataListener;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.a(iTXAudioRawDataListener);
        }
    }

    @Deprecated
    public void a(float f11) {
        TXCLog.i(TXLivePlayer.TAG, "setRate " + f11);
        this.f44651w = f11;
        j jVar = this.f44649u;
        if (jVar != null) {
            jVar.b(f11);
        }
    }

    private void a(int i11, Bundle bundle) {
        if (i11 != 15001 || bundle == null) {
            if (i11 == 2007 || i11 == 2105) {
                TXCLog.i(TXLivePlayer.TAG, "[Event]code:" + i11 + " param:" + bundle);
                i();
                return;
            }
            return;
        }
        String str = this.f44639k;
        if (str == null) {
            return;
        }
        boolean startsWith = str.startsWith("room://");
        this.H = a(bundle);
        int i12 = bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, 0);
        int i13 = bundle.getInt(TXLiveConstants.NET_STATUS_NET_SPEED, 0);
        int i14 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, 0);
        int i15 = bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL);
        int i16 = bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL);
        if ((startsWith || this.I <= i12) && i13 >= 10 && ((i14 == 0 || i14 >= 5) && Math.abs(i15) <= 5000 && Math.abs(i16) <= 5000)) {
            return;
        }
        i();
    }

    private String a(Bundle bundle) {
        return " IP:" + bundle.getString(TXLiveConstants.NET_STATUS_SERVER_IP) + " RES:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH) + "*" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT) + " FPS:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS) + " GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s Speed:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_SPEED) + "Kbps AudioSpeed:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE) + "Kbps VideoSpeed:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE) + "Kbps AudioCache:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + " VideoCache:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + " VideoCacheFrameCount:" + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + " VideoDecoderCacheFrameCount:" + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + " AVJitterSync:" + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + " AVPlaySync:" + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + " AudioParamsInfo:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.a.5
            @Override // java.lang.Runnable
            public void run() {
                TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                if (iTXSnapshotListener2 != null) {
                    iTXSnapshotListener2.onSnapshot(bitmap);
                }
                a.this.f44652x = false;
            }
        });
    }
}
