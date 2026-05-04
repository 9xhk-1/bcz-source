package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.a.a;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.renderer.a;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class c extends j implements TXCRenderAndDec.a, TXCRenderAndDec.b, com.tencent.liteav.audio.c, com.tencent.liteav.audio.e, com.tencent.liteav.basic.b.b, com.tencent.liteav.network.i, a.InterfaceC0516a, com.tencent.liteav.renderer.g {
    private b A;
    private int B;
    private int C;
    private com.tencent.liteav.renderer.h D;
    private com.tencent.liteav.renderer.h E;
    private float[] F;
    private float[] G;
    private String H;
    private int I;
    private boolean J;
    private com.tencent.liteav.basic.enums.b K;
    private Object L;
    private com.tencent.liteav.basic.b.a M;
    private TXLivePlayer.ITXAudioRawDataListener N;
    private String O;
    private boolean P;
    private long Q;
    private long R;
    private a S;

    /* renamed from: a, reason: collision with root package name */
    private TXCRenderAndDec f43482a;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.liteav.renderer.a f43483f;

    /* renamed from: g, reason: collision with root package name */
    private TXCStreamDownloader f43484g;

    /* renamed from: h, reason: collision with root package name */
    private int f43485h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f43486i;

    /* renamed from: j, reason: collision with root package name */
    private TextureView f43487j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43488k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43489l;

    /* renamed from: m, reason: collision with root package name */
    private int f43490m;

    /* renamed from: n, reason: collision with root package name */
    private int f43491n;

    /* renamed from: o, reason: collision with root package name */
    private int f43492o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f43493p;

    /* renamed from: q, reason: collision with root package name */
    private Surface f43494q;

    /* renamed from: r, reason: collision with root package name */
    private int f43495r;

    /* renamed from: s, reason: collision with root package name */
    private int f43496s;

    /* renamed from: t, reason: collision with root package name */
    private int f43497t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43498u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f43499v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f43500w;

    /* renamed from: x, reason: collision with root package name */
    private int f43501x;

    /* renamed from: y, reason: collision with root package name */
    private com.tencent.liteav.a.a f43502y;

    /* renamed from: z, reason: collision with root package name */
    private TXRecordCommon.ITXVideoRecordListener f43503z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<c> f43514a;

        public a(c cVar) {
            this.f43514a = new WeakReference<>(cVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = this.f43514a.get();
            if (cVar == null) {
                return;
            }
            cVar.i();
            cVar.v();
        }
    }

    public c(Context context) {
        super(context);
        this.f43482a = null;
        this.f43483f = null;
        this.f43484g = null;
        this.f43485h = 0;
        this.f43488k = false;
        this.f43489l = false;
        this.f43490m = 100;
        this.f43491n = 0;
        this.f43492o = 0;
        this.f43493p = false;
        this.f43495r = 2;
        this.f43496s = 48000;
        this.f43497t = 16;
        this.f43498u = false;
        this.f43499v = false;
        this.f43500w = false;
        this.f43501x = 0;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.E = null;
        this.F = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.G = new float[16];
        this.H = "";
        this.J = false;
        this.K = com.tencent.liteav.basic.enums.b.UNKNOWN;
        this.L = null;
        this.M = new com.tencent.liteav.basic.b.a() { // from class: com.tencent.liteav.c.1
            @Override // com.tencent.liteav.basic.b.a
            public void a(String str, int i11, String str2, String str3) {
                TXCLog.i("TXCLivePlayer", "onEvent => id:" + str + " code:" + i11 + " msg:" + str2 + " params:" + str3);
                d(str, i11, str2, str3);
            }

            @Override // com.tencent.liteav.basic.b.a
            public void b(String str, int i11, String str2, String str3) {
                TXCLog.i("TXCLivePlayer", "onWarning => id:" + str + " code:" + i11 + " msg:" + str2 + " params:" + str3);
                d(str, i11, str2, str3);
            }

            @Override // com.tencent.liteav.basic.b.a
            public void c(String str, int i11, String str2, String str3) {
                TXCLog.e("TXCLivePlayer", "onError => id:" + str + " code:" + i11 + " msg:" + str2 + " params:" + str3);
                d(str, i11, str2, str3);
            }

            public void d(String str, int i11, String str2, String str3) {
                WeakReference<com.tencent.liteav.basic.b.b> weakReference = c.this.f43622e;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    if (i11 == 10048 || i11 == 10049 || i11 == 10053) {
                        i11 = 1205;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("EVT_ID", i11);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                    if (str2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb2.append(str3);
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, sb2.toString());
                    }
                    c.this.onNotifyEvent(i11, bundle);
                }
            }
        };
        this.O = "";
        this.P = false;
        this.Q = 0L;
        this.R = 0L;
        this.S = null;
        com.tencent.liteav.basic.d.c.a().a(context);
        TXCAudioEngine.CreateInstance(context, com.tencent.liteav.basic.d.c.a().b(), AudioServerConfig.loadFromSharedPreferences(context).isAudioDeviceDSPEnabled());
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.M));
        long a11 = com.tencent.liteav.basic.d.c.a().a("Audio", "EnableAutoRestartDevice");
        TXCAudioEngine.getInstance().enableAutoRestartDevice(a11 == 1 || a11 == -1);
        this.f43486i = new Handler(Looper.getMainLooper());
        com.tencent.liteav.renderer.a aVar = new com.tencent.liteav.renderer.a();
        this.f43483f = aVar;
        aVar.a((com.tencent.liteav.basic.b.b) this);
        this.S = new a(this);
        TXCLog.i("TXCLivePlayer", "[FirstFramePath] TXCLivePlayer: create player success. instance:" + hashCode());
    }

    private void k() {
        if (this.f43502y == null) {
            this.B = this.f43483f.h();
            this.C = this.f43483f.i();
            a.C0506a m11 = m();
            com.tencent.liteav.a.a aVar = new com.tencent.liteav.a.a(this.f43620c);
            this.f43502y = aVar;
            aVar.a(m11);
            this.f43502y.a(new a.b() { // from class: com.tencent.liteav.c.2
                @Override // com.tencent.liteav.a.a.b
                public void a(int i11, String str, String str2, String str3) {
                    if (c.this.f43503z != null) {
                        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                        if (i11 == 0) {
                            tXRecordResult.retCode = 0;
                        } else {
                            tXRecordResult.retCode = -1;
                        }
                        tXRecordResult.descMsg = str;
                        tXRecordResult.videoPath = str2;
                        tXRecordResult.coverPath = str3;
                        c.this.f43503z.onRecordComplete(tXRecordResult);
                    }
                    c.this.f43483f.a((com.tencent.liteav.renderer.g) null);
                    c.this.f43483f.a((a.InterfaceC0516a) null);
                }

                @Override // com.tencent.liteav.a.a.b
                public void a(long j11) {
                    if (c.this.f43503z != null) {
                        c.this.f43503z.onRecordProgress(j11);
                    }
                }
            });
        }
        if (this.D == null) {
            com.tencent.liteav.renderer.h hVar = new com.tencent.liteav.renderer.h(Boolean.TRUE);
            this.D = hVar;
            hVar.b();
            this.D.b(this.B, this.C);
            this.D.a(this.B, this.C);
        }
        if (this.E == null) {
            com.tencent.liteav.renderer.h hVar2 = new com.tencent.liteav.renderer.h(Boolean.FALSE);
            this.E = hVar2;
            hVar2.b();
            this.E.b(this.f43483f.f(), this.f43483f.g());
            this.E.a(this.f43483f.f(), this.f43483f.g());
            Matrix.setIdentityM(this.G, 0);
        }
    }

    private void l() {
        com.tencent.liteav.renderer.h hVar = this.D;
        if (hVar != null) {
            hVar.c();
            this.D = null;
        }
        com.tencent.liteav.renderer.h hVar2 = this.E;
        if (hVar2 != null) {
            hVar2.c();
            this.E = null;
        }
    }

    private a.C0506a m() {
        int i11;
        int i12 = this.B;
        if (i12 <= 0 || (i11 = this.C) <= 0) {
            i12 = 480;
            i11 = 640;
        }
        a.C0506a c0506a = new a.C0506a();
        c0506a.f42912a = i12;
        c0506a.f42913b = i11;
        c0506a.f42914c = 20;
        c0506a.f42915d = (int) (Math.sqrt((i12 * i12 * 1.0d) + (i11 * i11)) * 1.2d);
        c0506a.f42919h = this.f43495r;
        c0506a.f42920i = this.f43496s;
        c0506a.f42921j = this.f43497t;
        c0506a.f42917f = com.tencent.liteav.a.a.a(this.f43620c, ".mp4");
        c0506a.f42918g = com.tencent.liteav.a.a.a(this.f43620c, ".jpg");
        c0506a.f42916e = this.f43483f.b();
        TXCLog.d("TXCLivePlayer", "record config: " + c0506a);
        return c0506a;
    }

    private void n() {
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.stop();
            this.f43482a.setVideoRender(null);
            this.f43482a.setDecListener(null);
            this.f43482a.setNotifyListener(null);
            this.f43482a = null;
        }
    }

    private void o() {
        boolean z11 = this.I == 5;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(this.J, 300);
        a(this.N);
        if (this.I == 5) {
            TXCAudioEngine tXCAudioEngine = TXCAudioEngine.getInstance();
            String str = this.O;
            boolean z12 = !this.f43619b.f43521g;
            float f11 = com.tencent.liteav.basic.enums.a.f43353b;
            tXCAudioEngine.setRemoteAudioCacheParams(str, z12, (int) (f11 * 1000.0f), (int) (f11 * 1000.0f), (int) (com.tencent.liteav.basic.enums.a.f43354c * 1000.0f));
        } else {
            TXCAudioEngine tXCAudioEngine2 = TXCAudioEngine.getInstance();
            String str2 = this.O;
            d dVar = this.f43619b;
            tXCAudioEngine2.setRemoteAudioCacheParams(str2, !dVar.f43521g, (int) (dVar.f43515a * 1000.0f), (int) (dVar.f43517c * 1000.0f), (int) (dVar.f43516b * 1000.0f));
        }
        TXCAudioEngine.getInstance().muteRemoteAudio(this.O, this.f43488k);
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.O, this.f43489l);
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.O, this.f43490m);
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.O, this);
        z();
        TXCAudioEngine.getInstance().startRemoteAudio(this.O, z11);
    }

    private void p() {
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.O, null);
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.O, null);
        TXCAudioEngine.getInstance().stopRemoteAudio(this.O);
    }

    private void q() {
        TXCStreamDownloader tXCStreamDownloader = this.f43484g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setListener(null);
            this.f43484g.setNotifyListener(null);
            this.f43484g.stop();
            this.f43484g = null;
        }
    }

    private void r() {
        b bVar = new b(this.f43620c);
        this.A = bVar;
        bVar.a(this.H);
        this.A.a(this.I == 5);
        this.A.d(this.O);
        this.A.e(this.f43484g.getRTMPProxyUserId());
        this.A.a();
    }

    private void s() {
        b bVar = this.A;
        if (bVar != null) {
            bVar.b();
            this.A = null;
        }
    }

    private void t() {
        this.P = false;
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.Q > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (this.Q / 1000));
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) this.Q);
            onNotifyEvent(2005, bundle);
        }
        Handler handler = this.f43486i;
        if (handler == null || !this.P) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.P) {
                    c.this.u();
                }
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Handler handler = this.f43486i;
        if (handler != null) {
            handler.postDelayed(this.S, 2000L);
        }
    }

    private void x() {
        Handler handler = this.f43486i;
        if (handler != null) {
            handler.removeCallbacks(this.S);
        }
    }

    private void y() {
        ArrayList arrayList = new ArrayList();
        String str = this.O;
        if (str != null) {
            arrayList.add(str);
        }
        com.tencent.liteav.a.a("18446744073709551615", arrayList);
    }

    private void z() {
        if (this.f43498u || this.N != null || this.P) {
            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.O, this);
        }
        if (this.f43498u || this.N != null || this.P) {
            return;
        }
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.O, null);
    }

    @Override // com.tencent.liteav.j
    public boolean f() {
        return true;
    }

    @Override // com.tencent.liteav.j
    public long g() {
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            return tXCRenderAndDec.getCurrentRenderPts();
        }
        return 0L;
    }

    @Override // com.tencent.liteav.j
    public void h() {
        this.R = 0L;
        if (this.P) {
            return;
        }
        this.P = true;
        z();
        Handler handler = this.f43486i;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.c.3
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.P) {
                        c.this.u();
                    }
                }
            }, 1000L);
        }
    }

    public void i() {
        y();
        int[] a11 = com.tencent.liteav.basic.util.h.a();
        String str = (a11[0] / 10) + "/" + (a11[1] / 10) + "%";
        int c11 = TXCStatus.c(this.O, 7102);
        int c12 = TXCStatus.c(this.O, 7101);
        String b11 = TXCStatus.b(this.O, 7110);
        int d11 = (int) TXCStatus.d(this.O, 6002);
        Bundle bundle = new Bundle();
        com.tencent.liteav.renderer.a aVar = this.f43483f;
        if (aVar != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH, aVar.h());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, this.f43483f.i());
        }
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, (int) tXCRenderAndDec.getVideoCacheDuration());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE, (int) this.f43482a.getVideoCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE, this.f43482a.getVideoDecCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL, (int) this.f43482a.getAVPlayInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL, (int) this.f43482a.getAVNetRecvInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) ((((TXCStatus.c(this.O, 7120) * 10) / (d11 == 0 ? 15 : d11)) / 10.0f) + 0.5d));
        }
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, TXCAudioEngine.getInstance().getPlayAECType() + " | " + TXCStatus.c(this.O, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE) + "," + TXCStatus.c(this.O, 2020) + " | " + TXCAudioEngine.getInstance().getPlaySampleRate() + "," + TXCAudioEngine.getInstance().getPlayChannels());
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, TXCStatus.c(this.O, 2007));
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_JITTER, TXCStatus.c(this.O, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED));
        bundle.putFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD, ((float) TXCStatus.c(this.O, TXLiteAVCode.EVT_HW_DECODER_START_SUCC)) / 1000.0f);
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_SPEED, c12 + c11);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, d11);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE, c12);
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE, c11);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_SERVER_IP, b11);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_CPU_USAGE, str);
        int i11 = this.f43501x + 1;
        this.f43501x = i11;
        if (i11 == 5) {
            if (this.f43500w) {
                TXCStatus.a(this.O, 6013, (Object) 0L);
            } else {
                TXCStatus.a(this.O, 6013, (Object) 1L);
            }
        }
        com.tencent.liteav.basic.util.h.a(this.f43622e, 15001, bundle);
        TXCRenderAndDec tXCRenderAndDec2 = this.f43482a;
        if (tXCRenderAndDec2 != null) {
            tXCRenderAndDec2.updateLoadInfo();
        }
        b bVar = this.A;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // com.tencent.liteav.j
    public int j() {
        return TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(this.O);
    }

    @Override // com.tencent.liteav.basic.b.b
    public void onNotifyEvent(final int i11, final Bundle bundle) {
        if (2003 == i11 && !this.f43500w) {
            this.f43500w = true;
        }
        if (2003 == i11 || 2026 == i11) {
            if (this.f43499v) {
                a(2004, "Video play started");
                this.f43499v = false;
            }
            if (2026 == i11) {
                a(2026, "Audio play started");
                TXCStatus.a(this.O, 2033, Long.valueOf(TXCTimeUtil.getTimeTick()));
                return;
            }
        }
        if (2025 == i11) {
            a(2004, "Video play started");
            return;
        }
        if (2023 == i11 || 2024 == i11) {
            a(2007, "Video play loading");
            return;
        }
        Handler handler = this.f43486i;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.c.6
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.liteav.basic.util.h.a(c.this.f43622e, i11, bundle);
                    if (i11 != 2103 || c.this.f43482a == null) {
                        return;
                    }
                    c.this.f43482a.restartDecoder();
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.i
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        if (this.f43493p) {
            try {
                TXCRenderAndDec tXCRenderAndDec = this.f43482a;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.decVideo(tXSNALPacket);
                }
            } catch (Exception e11) {
                TXCLog.e("TXCLivePlayer", "decode video failed." + e11.getMessage());
            }
        }
    }

    @Override // com.tencent.liteav.renderer.a.InterfaceC0516a
    public void onTextureProcess(int i11, int i12, int i13, int i14) {
        com.tencent.liteav.renderer.h hVar;
        com.tencent.liteav.a.a aVar = this.f43502y;
        if (this.f43498u && aVar != null && (hVar = this.E) != null) {
            hVar.a(this.F);
            aVar.a(this.E.d(i11), TXCTimeUtil.getTimeTick());
            this.E.a(this.G);
            this.E.c(i11);
        }
        if (this.f43498u) {
            k();
        } else {
            l();
        }
    }

    @Override // com.tencent.liteav.j
    public void a(TXCloudVideoView tXCloudVideoView) {
        TextureView videoView;
        TXCloudVideoView tXCloudVideoView2 = this.f43621d;
        if (tXCloudVideoView2 != null && tXCloudVideoView2 != tXCloudVideoView && (videoView = tXCloudVideoView2.getVideoView()) != null) {
            this.f43621d.removeView(videoView);
        }
        super.a(tXCloudVideoView);
        TXCloudVideoView tXCloudVideoView3 = this.f43621d;
        if (tXCloudVideoView3 != null) {
            TextureView videoView2 = tXCloudVideoView3.getVideoView();
            this.f43487j = videoView2;
            if (videoView2 == null) {
                this.f43487j = new TextureView(this.f43621d.getContext());
            }
            this.f43621d.addVideoView(this.f43487j);
        }
        com.tencent.liteav.renderer.a aVar = this.f43483f;
        if (aVar != null) {
            aVar.a(this.f43487j);
        }
    }

    @Override // com.tencent.liteav.j
    public void b() {
        a(this.H, this.I);
    }

    @Override // com.tencent.liteav.j
    public boolean c() {
        return this.f43493p;
    }

    @Override // com.tencent.liteav.j
    public void d(int i11) {
        this.f43485h = i11;
        TXCStreamDownloader tXCStreamDownloader = this.f43484g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setPayloadType(i11);
        }
    }

    @Override // com.tencent.liteav.j
    public int e(int i11) {
        if (this.f43498u) {
            TXCLog.e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
            return -1;
        }
        this.f43498u = true;
        this.f43483f.a((com.tencent.liteav.renderer.g) this);
        this.f43483f.a((a.InterfaceC0516a) this);
        z();
        TXCDRApi.txReportDAU(this.f43620c, com.tencent.liteav.basic.datareport.a.f43298aw);
        return 0;
    }

    private void g(int i11) {
        TextureView textureView = this.f43487j;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        TXCRenderAndDec tXCRenderAndDec = new TXCRenderAndDec(this.f43620c);
        this.f43482a = tXCRenderAndDec;
        tXCRenderAndDec.setNotifyListener(this);
        this.f43482a.setVideoRender(this.f43483f);
        this.f43482a.setDecListener(this);
        this.f43482a.setRenderAndDecDelegate(this);
        this.f43482a.setConfig(this.f43619b);
        this.f43482a.setID(this.O);
        this.f43482a.start(i11 == 5);
        this.f43482a.setRenderMode(this.f43492o);
        this.f43482a.setRenderRotation(this.f43491n);
    }

    @Override // com.tencent.liteav.j
    public void b(int i11) {
        this.f43491n = i11;
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderRotation(i11);
        }
    }

    @Override // com.tencent.liteav.j
    public void c(boolean z11) {
        this.f43489l = z11;
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.O, z11);
    }

    @Override // com.tencent.liteav.j
    public void c(int i11) {
        this.f43490m = i11;
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.O, this.f43490m);
    }

    @Override // com.tencent.liteav.j
    public TextureView d() {
        return this.f43487j;
    }

    @Override // com.tencent.liteav.j
    public void b(boolean z11) {
        this.f43488k = z11;
        TXCAudioEngine.getInstance().muteRemoteAudio(this.O, this.f43488k);
    }

    private int c(String str, int i11) {
        if (i11 == 0) {
            this.f43484g = new TXCStreamDownloader(this.f43620c, 1);
        } else if (i11 == 5) {
            this.f43484g = new TXCStreamDownloader(this.f43620c, 4);
        } else {
            this.f43484g = new TXCStreamDownloader(this.f43620c, 0);
            if (!TextUtils.isEmpty(this.f43619b.f43526l)) {
                this.f43484g.setFlvSessionKey(this.f43619b.f43526l);
            }
        }
        this.f43484g.setID(this.O);
        this.f43484g.setListener(this);
        this.f43484g.setNotifyListener(this);
        this.f43484g.setHeaders(this.f43619b.f43531q);
        this.f43484g.setPayloadType(this.f43485h);
        if (i11 == 5) {
            this.f43484g.setRetryTimes(5);
            this.f43484g.setRetryInterval(1);
        } else {
            this.f43484g.setRetryTimes(this.f43619b.f43519e);
            this.f43484g.setRetryInterval(this.f43619b.f43520f);
        }
        TXCStreamDownloader tXCStreamDownloader = this.f43484g;
        d dVar = this.f43619b;
        return tXCStreamDownloader.start(str, dVar.f43523i, dVar.f43527m, dVar.f43524j, dVar.f43525k);
    }

    private void b(String str) {
        String format = String.format("%s-%d", str, Long.valueOf(TXCTimeUtil.getTimeTick() % 10000));
        this.O = format;
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setID(format);
        }
        com.tencent.liteav.renderer.a aVar = this.f43483f;
        if (aVar != null) {
            aVar.setID(this.O);
        }
        TXCStreamDownloader tXCStreamDownloader = this.f43484g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setID(this.O);
        }
        b bVar = this.A;
        if (bVar != null) {
            bVar.d(this.O);
        }
    }

    @Override // com.tencent.liteav.j
    public int e() {
        if (!this.f43498u) {
            TXCLog.w("TXCLivePlayer", "stopRecord: no recording task exist");
            return -1;
        }
        this.f43498u = false;
        z();
        com.tencent.liteav.a.a aVar = this.f43502y;
        if (aVar != null) {
            aVar.a();
            this.f43502y = null;
        }
        return 0;
    }

    @Override // com.tencent.liteav.j
    public void a(Surface surface) {
        this.f43494q = surface;
        com.tencent.liteav.renderer.a aVar = this.f43483f;
        if (aVar != null) {
            aVar.a(surface);
        }
    }

    @Override // com.tencent.liteav.j
    public void a(int i11, int i12) {
        com.tencent.liteav.renderer.a aVar = this.f43483f;
        if (aVar != null) {
            aVar.d(i11, i12);
        }
    }

    @Override // com.tencent.liteav.j
    public void a(d dVar) {
        super.a(dVar);
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setConfig(dVar);
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.b
    public void b(String str, int i11) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!this.f43493p || (tXCStreamDownloader = this.f43484g) == null) {
            return;
        }
        tXCStreamDownloader.requestKeyFrame(this.H);
    }

    @Override // com.tencent.liteav.j
    public int a(String str, int i11) {
        com.tencent.liteav.renderer.a aVar;
        if (c()) {
            TXCLog.w("TXCLivePlayer", "play: ignore start play when is playing");
            return -2;
        }
        d dVar = this.f43619b;
        if (dVar != null && dVar.f43517c > dVar.f43516b) {
            TXCLog.e("TXCLivePlayer", "play: can not start play while invalid cache config [minAutoAdjustCacheTime(" + this.f43619b.f43517c + ") > maxAutoAdjustCacheTime(" + this.f43619b.f43516b + ")]!!!!!!");
            return -1;
        }
        float f11 = dVar.f43515a;
        if (f11 > dVar.f43516b || f11 < dVar.f43517c) {
            TXCLog.w("TXCLivePlayer", "play: invalid cacheTime " + this.f43619b.f43515a + ", need between minAutoAdjustCacheTime " + this.f43619b.f43517c + " and maxAutoAdjustCacheTime " + this.f43619b.f43516b + " , fix to maxAutoAdjustCacheTime");
            d dVar2 = this.f43619b;
            dVar2.f43515a = dVar2.f43516b;
        }
        TXCLog.i("TXCLivePlayer", "[FirstFramePath] TXCLivePlayer: start play. instance: " + hashCode());
        this.H = str;
        this.I = i11;
        b(str);
        this.f43493p = true;
        this.f43501x = 0;
        this.f43499v = true;
        g(i11);
        o();
        int c11 = c(str, i11);
        if (c11 != 0) {
            this.f43493p = false;
            q();
            n();
            p();
            TextureView textureView = this.f43487j;
            if (textureView != null) {
                textureView.setVisibility(8);
                return c11;
            }
        } else {
            a(this.f43494q);
            r();
            v();
            if (this.K == com.tencent.liteav.basic.enums.b.TEXTURE_2D && this.f43487j == null && (aVar = this.f43483f) != null) {
                aVar.c(this.L);
            }
            try {
                Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
                TXCDRApi.txReportDAU(this.f43620c, com.tencent.liteav.basic.datareport.a.bF);
            } catch (Exception unused) {
            }
        }
        return c11;
    }

    @Override // com.tencent.liteav.network.i
    public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
    }

    @Override // com.tencent.liteav.j
    public int a(boolean z11) {
        com.tencent.liteav.renderer.a aVar;
        if (!c()) {
            TXCLog.w("TXCLivePlayer", "play: ignore stop play when not started");
            return -2;
        }
        TXCLog.v("TXCLivePlayer", "play: stop");
        this.f43493p = false;
        q();
        com.tencent.liteav.renderer.a aVar2 = this.f43483f;
        if (aVar2 != null) {
            aVar2.b(!z11);
        }
        n();
        TextureView textureView = this.f43487j;
        if (textureView != null && z11) {
            textureView.setVisibility(8);
        }
        com.tencent.liteav.renderer.a aVar3 = this.f43483f;
        if (aVar3 != null) {
            aVar3.a((Surface) null);
        }
        if (this.f43487j == null && (aVar = this.f43483f) != null) {
            aVar.d();
        }
        p();
        s();
        x();
        t();
        return 0;
    }

    @Override // com.tencent.liteav.j
    public int a(String str) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!c() || (tXCStreamDownloader = this.f43484g) == null) {
            return -1;
        }
        boolean switchStream = tXCStreamDownloader.switchStream(str);
        long c11 = TXCStatus.c(this.O, 2007);
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        TXCLog.i("TXCLivePlayer", "[SwitchStream] current jitter size when start switch stream. video:" + (tXCRenderAndDec != null ? tXCRenderAndDec.getVideoCacheDuration() : 0L) + " audio:" + c11);
        if (!switchStream) {
            return -2;
        }
        this.H = str;
        return 0;
    }

    @Override // com.tencent.liteav.j
    public void a() {
        a(false);
    }

    @Override // com.tencent.liteav.j
    public void a(int i11) {
        this.f43492o = i11;
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderMode(i11);
        }
    }

    @Override // com.tencent.liteav.j
    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f43503z = iTXVideoRecordListener;
    }

    @Override // com.tencent.liteav.j
    public void a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.N = iTXAudioRawDataListener;
        z();
    }

    @Override // com.tencent.liteav.j
    public void a(k kVar, com.tencent.liteav.basic.enums.b bVar, Object obj) {
        com.tencent.liteav.renderer.a aVar;
        this.K = bVar;
        this.L = obj;
        if (c() && this.K == com.tencent.liteav.basic.enums.b.TEXTURE_2D && this.f43487j == null && kVar != null && (aVar = this.f43483f) != null) {
            aVar.c(this.L);
        }
        TXCRenderAndDec tXCRenderAndDec = this.f43482a;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setVideoFrameListener(kVar, bVar);
        } else {
            TXCLog.w("TXCLivePlayer", "setVideoFrameListener->enter with renderAndDec is empty");
        }
    }

    @Override // com.tencent.liteav.j
    public void a(com.tencent.liteav.basic.c.k kVar) {
        com.tencent.liteav.renderer.a aVar = this.f43483f;
        if (aVar != null) {
            aVar.a(kVar);
        }
    }

    private void a(final int i11, String str) {
        if (this.f43622e != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt("EVT_ID", i11);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            if (str != null) {
                bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
            }
            Handler handler = this.f43486i;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.c.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.liteav.basic.util.h.a(c.this.f43622e, i11, bundle);
                    }
                });
            }
        }
    }

    @Override // com.tencent.liteav.renderer.g
    public int a(int i11, float[] fArr) {
        com.tencent.liteav.renderer.h hVar;
        com.tencent.liteav.a.a aVar = this.f43502y;
        if (this.f43498u && aVar != null && (hVar = this.D) != null) {
            int d11 = hVar.d(i11);
            aVar.a(d11, TXCTimeUtil.getTimeTick());
            this.f43483f.a(d11, this.B, this.C, false, 0);
        }
        if (this.f43498u) {
            k();
            return i11;
        }
        l();
        return i11;
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.a
    public void a(SurfaceTexture surfaceTexture) {
        l();
        e();
    }

    @Override // com.tencent.liteav.audio.e
    public void a(String str, byte[] bArr, long j11, int i11, int i12, byte[] bArr2) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener;
        this.f43496s = i11;
        this.f43495r = i12;
        if (this.f43502y != null) {
            if (j11 <= 0) {
                j11 = TXCTimeUtil.getTimeTick();
            }
            this.f43502y.a(bArr, j11);
        }
        if (this.R <= 0 && (iTXAudioRawDataListener = this.N) != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i11, i12, 16);
        }
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener2 = this.N;
        if (iTXAudioRawDataListener2 != null) {
            iTXAudioRawDataListener2.onPcmDataAvailable(bArr, j11);
        }
        long j12 = this.R;
        if (j12 <= 0) {
            this.R = j11;
        } else {
            this.Q = j11 - j12;
        }
    }

    @Override // com.tencent.liteav.audio.c
    public void a(String str, int i11, String str2) {
        onNotifyEvent(i11, null);
    }

    @Override // com.tencent.liteav.j
    public void a(boolean z11, int i11) {
        this.J = z11;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z11, i11);
    }
}
