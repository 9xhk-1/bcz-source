package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.ijk.media.player.IjkBitrateItem;
import com.tencent.ijk.media.player.MediaInfo;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.renderer.a;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.TextureRenderView;
import com.tencent.rtmp.TXBitrateItem;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class h extends j implements a.InterfaceC0516a, com.tencent.liteav.renderer.f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f43590a;

    /* renamed from: f, reason: collision with root package name */
    private TXCVodVideoView f43591f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.d f43592g;

    /* renamed from: h, reason: collision with root package name */
    private f f43593h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f43594i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f43595j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43596k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43597l;

    /* renamed from: m, reason: collision with root package name */
    private float f43598m;

    /* renamed from: n, reason: collision with root package name */
    private Surface f43599n;

    /* renamed from: o, reason: collision with root package name */
    private com.tencent.liteav.renderer.a f43600o;

    /* renamed from: p, reason: collision with root package name */
    private Object f43601p;

    /* renamed from: q, reason: collision with root package name */
    private a f43602q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f43603r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f43604s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.e f43605t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Class f43607a;

        /* renamed from: b, reason: collision with root package name */
        private Class f43608b;

        /* renamed from: c, reason: collision with root package name */
        private Class f43609c;

        /* renamed from: d, reason: collision with root package name */
        private Field f43610d;

        /* renamed from: e, reason: collision with root package name */
        private Field f43611e;

        /* renamed from: f, reason: collision with root package name */
        private Field f43612f;

        /* renamed from: g, reason: collision with root package name */
        private Field f43613g;

        /* renamed from: h, reason: collision with root package name */
        private Field f43614h;

        /* renamed from: i, reason: collision with root package name */
        private Field f43615i;

        /* renamed from: j, reason: collision with root package name */
        private Field f43616j;

        /* renamed from: k, reason: collision with root package name */
        private Field f43617k;

        /* renamed from: l, reason: collision with root package name */
        private Field f43618l;

        public a(Object obj) {
            try {
                this.f43607a = obj.getClass();
                this.f43608b = Class.forName("com.tencent.trtc.TRTCCloudDef$TRTCTexture");
                this.f43609c = Class.forName("com.tencent.trtc.TRTCCloudDef$TRTCVideoFrame");
                this.f43610d = this.f43608b.getDeclaredField("textureId");
                this.f43611e = this.f43608b.getDeclaredField("eglContext10");
                this.f43613g = this.f43609c.getDeclaredField("texture");
                this.f43614h = this.f43609c.getDeclaredField("width");
                this.f43615i = this.f43609c.getDeclaredField("height");
                this.f43616j = this.f43609c.getDeclaredField("pixelFormat");
                this.f43617k = this.f43609c.getDeclaredField("bufferType");
                this.f43618l = this.f43609c.getDeclaredField(com.alipay.sdk.m.t.a.f11034k);
                this.f43612f = this.f43608b.getDeclaredField("eglContext14");
            } catch (Exception e11) {
                TXCLog.e(TXVodPlayer.TAG, "init TRTCCloudClassInvokeWrapper error ", e11);
            }
        }

        public void a(Object obj, com.tencent.liteav.renderer.a aVar, int i11, int i12, int i13) {
            try {
                Object newInstance = this.f43608b.newInstance();
                this.f43610d.set(newInstance, Integer.valueOf(i11));
                if (aVar.b() instanceof EGLContext) {
                    this.f43611e.set(newInstance, aVar.b());
                } else {
                    this.f43612f.set(newInstance, aVar.b());
                }
                Object newInstance2 = this.f43609c.newInstance();
                this.f43613g.set(newInstance2, newInstance);
                this.f43614h.set(newInstance2, Integer.valueOf(i12));
                this.f43615i.set(newInstance2, Integer.valueOf(i13));
                this.f43616j.set(newInstance2, 2);
                this.f43617k.set(newInstance2, 3);
                this.f43618l.set(newInstance2, 0);
                this.f43607a.getDeclaredMethod("sendCustomVideoData", Integer.TYPE, newInstance2.getClass()).invoke(obj, 2, newInstance2);
            } catch (Exception e11) {
                TXCLog.e(TXVodPlayer.TAG, "sendCustomVideoData method error ", e11);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f43593h = null;
        this.f43595j = true;
        this.f43596k = true;
        this.f43597l = true;
        this.f43598m = 1.0f;
        this.f43605t = new com.tencent.liteav.txcvodplayer.e() { // from class: com.tencent.liteav.h.1
            @Override // com.tencent.liteav.txcvodplayer.e
            public void a(int i11, Bundle bundle) {
                com.tencent.liteav.basic.b.b bVar;
                int i12;
                String str;
                Bundle bundle2 = new Bundle(bundle);
                int i13 = -2301;
                if (i11 != -2301) {
                    i13 = 2011;
                    if (i11 != 2011) {
                        i13 = 2103;
                        if (i11 != 2103) {
                            i13 = 2106;
                            if (i11 != 2106) {
                                i13 = 2013;
                                if (i11 != 2013) {
                                    i13 = 2014;
                                    if (i11 != 2014) {
                                        switch (i11) {
                                            case -2305:
                                                i12 = -2305;
                                                h.this.f43593h.a(-2305, "HLS decrypt key error");
                                                i13 = i12;
                                                break;
                                            case -2304:
                                                i12 = -2304;
                                                h.this.f43593h.a(-2304, "h265 decode failed");
                                                if (!h.this.f43594i) {
                                                    h.this.f43592g.a(false);
                                                }
                                                i13 = i12;
                                                break;
                                            case -2303:
                                                i12 = -2303;
                                                h.this.f43593h.a(-2303, "file not found");
                                                i13 = i12;
                                                break;
                                            default:
                                                i13 = 2008;
                                                int i14 = 1;
                                                switch (i11) {
                                                    case 2003:
                                                        if (!h.this.f43594i) {
                                                            h.this.f43594i = true;
                                                            h.this.f43593h.f();
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putInt("EVT_ID", 2008);
                                                            bundle3.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                                                            bundle3.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                                                            MediaInfo mediaInfo = h.this.f43591f.getMediaInfo();
                                                            int i15 = (mediaInfo == null || (str = mediaInfo.mVideoDecoderImpl) == null || !str.contains("hevc")) ? 0 : 1;
                                                            if (h.this.f43591f.getPlayerType() == 0) {
                                                                if (i15 == 0) {
                                                                    bundle3.putCharSequence("description", h.this.f43592g.a() ? "Enables hardware decoding" : "Enables software decoding");
                                                                } else {
                                                                    bundle3.putCharSequence("description", h.this.f43592g.a() ? "Enables hardware decoding H265" : "Enables software decoding h265");
                                                                }
                                                                bundle3.putInt("EVT_PARAM1", h.this.f43592g.a() ? 1 : 2);
                                                                bundle3.putInt("hevc", i15);
                                                            } else {
                                                                bundle3.putCharSequence("description", "Enables hardware decoding");
                                                                bundle3.putInt("EVT_PARAM1", 2);
                                                            }
                                                            if (!h.this.f43592g.a()) {
                                                                i14 = i15 != 0 ? 2 : 0;
                                                            } else if (i15 != 0) {
                                                                i14 = 3;
                                                            }
                                                            h.this.f43593h.b(i14);
                                                            a(2008, bundle3);
                                                            i13 = 2003;
                                                            break;
                                                        }
                                                        break;
                                                    case 2004:
                                                        h.this.f43593h.e();
                                                        i13 = 2004;
                                                        break;
                                                    case 2005:
                                                        h.this.f43593h.a(bundle.getInt(TXLiveConstants.EVT_PLAY_DURATION, 0), bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS, 0));
                                                        i13 = 2005;
                                                        break;
                                                    case 2006:
                                                        h.this.f43593h.b();
                                                        h hVar = h.this;
                                                        if (!hVar.f43590a) {
                                                            i13 = 2006;
                                                            break;
                                                        } else {
                                                            hVar.f43591f.b();
                                                            h.this.f43593h.a(true);
                                                            TXCLog.d(TXVodPlayer.TAG, "loop play");
                                                            break;
                                                        }
                                                    case 2007:
                                                        h.this.f43593h.j();
                                                        i13 = 2007;
                                                        break;
                                                    case 2008:
                                                        break;
                                                    case 2009:
                                                        if (h.this.f43600o != null) {
                                                            h.this.f43600o.c(h.this.f43591f.getVideoWidth(), h.this.f43591f.getVideoHeight());
                                                        }
                                                        i13 = 2009;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC /* 2016 */:
                                                                TXCLog.i(TXVodPlayer.TAG, "vod play tcp connect success");
                                                                h.this.f43593h.g();
                                                                break;
                                                            case TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET /* 2017 */:
                                                                TXCLog.i(TXVodPlayer.TAG, "vod play first video packet");
                                                                h.this.f43593h.i();
                                                                break;
                                                            case TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED /* 2018 */:
                                                                TXCLog.i(TXVodPlayer.TAG, "vod play dns resolved");
                                                                h.this.f43593h.h();
                                                                break;
                                                            case TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE /* 2019 */:
                                                                break;
                                                            default:
                                                                TXCLog.d(TXVodPlayer.TAG, "miss match event " + i11);
                                                                break;
                                                        }
                                                }
                                        }
                                        return;
                                    }
                                } else {
                                    h.this.f43593h.e();
                                }
                            } else if (!h.this.f43594i) {
                                h.this.f43592g.a(false);
                            }
                        }
                    } else {
                        bundle2.putInt("EVT_PARAM1", h.this.f43591f.getMetaRotationDegree());
                    }
                } else {
                    h.this.f43593h.a(-2301, "network disconnect, has retry reconnect, but still failed!");
                }
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, bundle.getString("description", ""));
                WeakReference<com.tencent.liteav.basic.b.b> weakReference = h.this.f43622e;
                if (weakReference == null || (bVar = weakReference.get()) == null) {
                    return;
                }
                bVar.onNotifyEvent(i13, bundle2);
            }

            @Override // com.tencent.liteav.txcvodplayer.e
            public void a(Bundle bundle) {
                com.tencent.liteav.basic.b.b bVar;
                Bundle bundle2 = new Bundle();
                int[] a11 = com.tencent.liteav.basic.util.h.a();
                bundle2.putCharSequence(TXLiveConstants.NET_STATUS_CPU_USAGE, (a11[0] / 10) + "/" + (a11[1] / 10) + "%");
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, (int) bundle.getFloat("fps"));
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_DPS, (int) bundle.getFloat("dps"));
                bundle2.putInt(TXLiveConstants.NET_STATUS_NET_SPEED, ((int) bundle.getLong("tcpSpeed")) / 1000);
                bundle2.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, ((int) bundle.getLong("cachedBytes")) / 1000);
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH, h.this.f43591f.getVideoWidth());
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, h.this.f43591f.getVideoHeight());
                bundle2.putString(TXLiveConstants.NET_STATUS_SERVER_IP, h.this.f43591f.getServerIp());
                h.this.f43593h.e(h.this.f43591f.getServerIp());
                WeakReference<com.tencent.liteav.basic.b.b> weakReference = h.this.f43622e;
                if (weakReference == null || (bVar = weakReference.get()) == null) {
                    return;
                }
                bVar.onNotifyEvent(15001, bundle2);
            }
        };
        TXCVodVideoView tXCVodVideoView = new TXCVodVideoView(context);
        this.f43591f = tXCVodVideoView;
        tXCVodVideoView.setListener(this.f43605t);
    }

    @Override // com.tencent.liteav.j
    public void a(com.tencent.liteav.basic.c.k kVar) {
    }

    @Override // com.tencent.liteav.j
    public void c(boolean z11) {
    }

    @Override // com.tencent.liteav.j
    public void d(int i11) {
    }

    @Override // com.tencent.liteav.j
    public int e() {
        return 0;
    }

    @Override // com.tencent.liteav.j
    public void f(int i11) {
        f fVar;
        this.f43591f.a(i11 * 1000);
        if (!this.f43594i || (fVar = this.f43593h) == null) {
            return;
        }
        fVar.k();
    }

    public void g(int i11) {
        this.f43591f.setAudioPlayoutVolume(i11);
    }

    public void h(int i11) {
        f fVar;
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setBitrateIndex(i11);
        }
        if (i11 == -1 || !this.f43594i || (fVar = this.f43593h) == null) {
            return;
        }
        fVar.l();
    }

    public float i() {
        if (this.f43591f != null) {
            return r0.getCurrentPosition() / 1000.0f;
        }
        return 0.0f;
    }

    @Override // com.tencent.liteav.j
    public int j() {
        return 0;
    }

    public float k() {
        if (this.f43591f != null) {
            return r0.getBufferDuration() / 1000.0f;
        }
        return 0.0f;
    }

    public float l() {
        if (this.f43591f != null) {
            return r0.getDuration() / 1000.0f;
        }
        return 0.0f;
    }

    public float m() {
        if (this.f43591f != null) {
            return r0.getBufferDuration() / 1000.0f;
        }
        return 0.0f;
    }

    public int n() {
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.getVideoWidth();
        }
        return 0;
    }

    public int o() {
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.getVideoHeight();
        }
        return 0;
    }

    @Override // com.tencent.liteav.renderer.f
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        this.f43599n = surface;
        this.f43591f.setRenderSurface(surface);
    }

    @Override // com.tencent.liteav.renderer.f
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        this.f43599n = null;
        this.f43591f.setRenderSurface(null);
    }

    @Override // com.tencent.liteav.renderer.a.InterfaceC0516a
    public void onTextureProcess(int i11, int i12, int i13, int i14) {
        Object obj;
        try {
            if (this.f43602q == null && (obj = this.f43601p) != null) {
                this.f43602q = new a(obj);
            }
            a aVar = this.f43602q;
            if (aVar != null) {
                aVar.a(this.f43601p, this.f43600o, i11, i12, i13);
            }
        } catch (Exception e11) {
            TXCLog.e(TXVodPlayer.TAG, "get enableCustomVideoCapture method error ", e11);
        }
    }

    public int p() {
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.getBitrateIndex();
        }
        return 0;
    }

    public ArrayList<TXBitrateItem> q() {
        ArrayList<IjkBitrateItem> supportedBitrates;
        ArrayList<TXBitrateItem> arrayList = new ArrayList<>();
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null && (supportedBitrates = tXCVodVideoView.getSupportedBitrates()) != null) {
            Iterator<IjkBitrateItem> it = supportedBitrates.iterator();
            while (it.hasNext()) {
                IjkBitrateItem next = it.next();
                TXBitrateItem tXBitrateItem = new TXBitrateItem();
                tXBitrateItem.index = next.index;
                tXBitrateItem.width = next.width;
                tXBitrateItem.height = next.height;
                tXBitrateItem.bitrate = next.bitrate;
                arrayList.add(tXBitrateItem);
            }
        }
        return arrayList;
    }

    public void r() {
        this.f43601p = null;
        v();
        t();
    }

    public void s() {
        com.tencent.liteav.renderer.a aVar = this.f43600o;
        if (aVar != null) {
            aVar.b((a.InterfaceC0516a) this);
        }
        h(true);
    }

    public void t() {
        com.tencent.liteav.renderer.a aVar = this.f43600o;
        if (aVar != null) {
            aVar.b((a.InterfaceC0516a) null);
        }
        h(false);
    }

    public void u() {
        this.f43604s = true;
        this.f43591f.f();
    }

    public void v() {
        this.f43604s = false;
        this.f43591f.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.h.b(java.lang.String):java.lang.String");
    }

    @Override // com.tencent.liteav.j
    public void a(boolean z11, int i11) {
    }

    @Override // com.tencent.liteav.j
    public int e(int i11) {
        return 0;
    }

    public void g(boolean z11) {
        TextureView d11 = d();
        if (d11 != null) {
            if (this.f43619b.f43534t && (this.f43591f.getMetaRotationDegree() == 90 || this.f43591f.getMetaRotationDegree() == 270)) {
                d11.setScaleY(z11 ? -1.0f : 1.0f);
            } else {
                d11.setScaleX(z11 ? -1.0f : 1.0f);
            }
        }
        f fVar = this.f43593h;
        if (fVar != null) {
            fVar.b(z11);
        }
    }

    @Override // com.tencent.liteav.j
    public void c(int i11) {
        this.f43591f.setVolume(i11);
    }

    @Override // com.tencent.liteav.j
    public TextureView d() {
        TXCloudVideoView tXCloudVideoView = this.f43621d;
        if (tXCloudVideoView != null) {
            return tXCloudVideoView.getVideoView();
        }
        return null;
    }

    @Override // com.tencent.liteav.j
    public boolean c() {
        return this.f43591f.e();
    }

    @Override // com.tencent.liteav.j
    public void e(boolean z11) {
        this.f43596k = z11;
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setAutoPlay(z11);
        }
    }

    public void f(boolean z11) {
        this.f43590a = z11;
    }

    private void h(boolean z11) {
        this.f43603r = z11;
        try {
            Object obj = this.f43601p;
            if (obj != null) {
                obj.getClass().getDeclaredMethod("enableCustomVideoCapture", Integer.TYPE, Boolean.TYPE).invoke(obj, 2, Boolean.valueOf(this.f43603r));
            }
        } catch (Exception e11) {
            TXCLog.e(TXVodPlayer.TAG, "setTRTCCustomVideoCapture error ", e11);
        }
    }

    @Override // com.tencent.liteav.j
    public void a(d dVar) {
        super.a(dVar);
        if (this.f43592g == null) {
            this.f43592g = new com.tencent.liteav.txcvodplayer.d();
        }
        this.f43592g.a(this.f43619b.f43519e);
        this.f43592g.b(this.f43619b.f43520f);
        this.f43592g.c(this.f43619b.f43532r);
        this.f43592g.a(this.f43619b.f43522h);
        this.f43592g.a(this.f43619b.f43528n);
        this.f43592g.a(this.f43619b.f43529o);
        this.f43592g.b(this.f43619b.f43530p);
        this.f43592g.a(this.f43619b.f43531q);
        this.f43592g.b(this.f43619b.f43533s);
        this.f43592g.c(this.f43619b.f43535u);
        this.f43592g.b(this.f43619b.f43536v);
        this.f43592g.c(this.f43619b.f43537w);
        this.f43592g.d(this.f43619b.f43538x);
        this.f43591f.setConfig(this.f43592g);
        this.f43597l = dVar.f43534t;
    }

    public void c(float f11) {
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setStartTime(f11);
        }
    }

    @Override // com.tencent.liteav.j
    public boolean d(boolean z11) {
        this.f43595j = z11;
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.b(z11);
        }
        return true;
    }

    @Override // com.tencent.liteav.j
    public int a(String str, int i11) {
        TXCloudVideoView tXCloudVideoView = this.f43621d;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (this.f43621d.getVideoView() == null) {
                TextureRenderView textureRenderView = new TextureRenderView(this.f43621d.getContext());
                this.f43621d.addVideoView(textureRenderView);
                this.f43591f.setTextureRenderView(textureRenderView);
            }
            this.f43621d.getVideoView().setVisibility(0);
        } else {
            Surface surface = this.f43599n;
            if (surface != null) {
                this.f43591f.setRenderSurface(surface);
            }
        }
        com.tencent.liteav.renderer.a aVar = this.f43600o;
        if (aVar != null) {
            aVar.e();
        }
        this.f43593h = new f(this.f43620c);
        String b11 = b(str);
        this.f43593h.a(b11);
        this.f43593h.a(this.f43596k);
        this.f43594i = false;
        this.f43591f.setPlayerType(this.f43592g.b());
        this.f43591f.b(this.f43595j);
        this.f43591f.setVideoPath(b11);
        this.f43591f.setAutoPlay(this.f43596k);
        this.f43591f.setRate(this.f43598m);
        this.f43591f.setAutoRotate(this.f43597l);
        this.f43591f.b();
        this.f43593h.a(1);
        if (this.f43603r) {
            s();
        }
        if (this.f43604s) {
            u();
        }
        TXCLog.d(TXVodPlayer.TAG, "startPlay " + b11);
        TXCDRApi.txReportDAU(this.f43620c, com.tencent.liteav.basic.datareport.a.f43322bt);
        try {
            Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
            TXCDRApi.txReportDAU(this.f43620c, com.tencent.liteav.basic.datareport.a.bE);
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // com.tencent.liteav.j
    public void b() {
        this.f43591f.b();
        f fVar = this.f43593h;
        if (fVar != null) {
            fVar.d();
        }
    }

    @Override // com.tencent.liteav.j
    public void b(boolean z11) {
        this.f43591f.setMute(z11);
    }

    @Override // com.tencent.liteav.j
    public void b(int i11) {
        this.f43591f.setVideoRotationDegree(360 - i11);
        com.tencent.liteav.renderer.a aVar = this.f43600o;
        if (aVar != null) {
            aVar.e(i11);
        }
    }

    @Override // com.tencent.liteav.j
    public void b(float f11) {
        this.f43598m = f11;
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setRate(f11);
        }
        f fVar = this.f43593h;
        if (fVar != null) {
            fVar.a(f11);
        }
    }

    @Override // com.tencent.liteav.j
    public int a(boolean z11) {
        this.f43591f.c();
        com.tencent.liteav.renderer.a aVar = this.f43600o;
        if (aVar != null) {
            aVar.a(true);
        }
        TXCloudVideoView tXCloudVideoView = this.f43621d;
        if (tXCloudVideoView != null && tXCloudVideoView.getVideoView() != null && z11) {
            this.f43621d.getVideoView().setVisibility(8);
        }
        f fVar = this.f43593h;
        if (fVar == null) {
            return 0;
        }
        fVar.b();
        return 0;
    }

    @Override // com.tencent.liteav.j
    public void a(Surface surface) {
        this.f43599n = surface;
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setRenderSurface(surface);
        }
    }

    @Override // com.tencent.liteav.j
    public void a() {
        this.f43591f.d();
        f fVar = this.f43593h;
        if (fVar != null) {
            fVar.c();
        }
    }

    public void a(float f11) {
        f fVar;
        this.f43591f.a((int) (f11 * 1000.0f));
        if (!this.f43594i || (fVar = this.f43593h) == null) {
            return;
        }
        fVar.k();
    }

    @Override // com.tencent.liteav.j
    public void a(int i11) {
        if (i11 == 1) {
            this.f43591f.setRenderMode(0);
        } else {
            this.f43591f.setRenderMode(1);
        }
        com.tencent.liteav.renderer.a aVar = this.f43600o;
        if (aVar != null) {
            aVar.c(i11);
        }
    }

    @Override // com.tencent.liteav.j
    public void a(TXCloudVideoView tXCloudVideoView) {
        TXCloudVideoView tXCloudVideoView2 = this.f43621d;
        if (tXCloudVideoView != tXCloudVideoView2) {
            if (tXCloudVideoView2 != null) {
                tXCloudVideoView2.removeVideoView();
            }
            if (tXCloudVideoView != null) {
                tXCloudVideoView.removeVideoView();
            }
        }
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (this.f43600o != null && this.f43601p != null) {
                if (tXCloudVideoView.getVideoView() == null) {
                    TextureView textureView = new TextureView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(textureView);
                    this.f43600o.a((com.tencent.liteav.renderer.f) this);
                    this.f43600o.a(textureView);
                }
            } else if (tXCloudVideoView.getVideoView() == null) {
                TextureRenderView textureRenderView = new TextureRenderView(tXCloudVideoView.getContext());
                tXCloudVideoView.addVideoView(textureRenderView);
                this.f43591f.setTextureRenderView(textureRenderView);
            }
            tXCloudVideoView.getVideoView().setVisibility(0);
        }
        super.a(tXCloudVideoView);
    }

    public void a(TextureRenderView textureRenderView) {
        TXCVodVideoView tXCVodVideoView = this.f43591f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setRenderView(textureRenderView);
        }
    }

    public void a(Object obj) {
        this.f43601p = obj;
    }
}
