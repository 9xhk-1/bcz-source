package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import com.bumptech.glide.load.engine.GlideException;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.basic.c.f;
import com.tencent.liteav.basic.c.h;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.e;
import com.tencent.liteav.basic.util.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends b {
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private f Z;

    /* renamed from: ac, reason: collision with root package name */
    private ArrayList<Long> f44284ac;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44307o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44308p;

    /* renamed from: u, reason: collision with root package name */
    private i f44313u;

    /* renamed from: z, reason: collision with root package name */
    private Object f44318z;

    /* renamed from: a, reason: collision with root package name */
    private int f44281a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f44294b = 0;

    /* renamed from: c, reason: collision with root package name */
    private double f44295c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    private long f44296d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f44297e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f44298f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44299g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44300h = true;

    /* renamed from: i, reason: collision with root package name */
    private long f44301i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f44302j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f44303k = 0;

    /* renamed from: l, reason: collision with root package name */
    private long f44304l = 0;

    /* renamed from: m, reason: collision with root package name */
    private long f44305m = 0;

    /* renamed from: n, reason: collision with root package name */
    private long f44306n = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f44309q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f44310r = 0;

    /* renamed from: s, reason: collision with root package name */
    private MediaCodec f44311s = null;

    /* renamed from: t, reason: collision with root package name */
    private String f44312t = MimeTypes.VIDEO_H264;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f44314v = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.10
        @Override // java.lang.Runnable
        public void run() {
            a.this.e();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private Runnable f44315w = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.11
        @Override // java.lang.Runnable
        public void run() {
            a.this.b(10);
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private Runnable f44316x = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.2
        @Override // java.lang.Runnable
        public void run() {
            a.this.b(1);
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private ArrayDeque<Long> f44317y = new ArrayDeque<>(10);
    private Surface A = null;
    private boolean B = true;
    private boolean C = true;
    private boolean D = false;
    private ByteBuffer[] E = null;
    private byte[] F = null;
    private volatile long G = 0;
    private long H = 0;
    private long I = 0;
    private boolean P = true;
    private boolean Q = false;
    private boolean R = false;
    private int S = 0;
    private int T = 0;
    private int U = 0;
    private long V = 0;
    private int W = 0;
    private int X = 0;
    private int Y = -1;

    /* renamed from: aa, reason: collision with root package name */
    private final Object f44282aa = new Object();

    /* renamed from: ab, reason: collision with root package name */
    private boolean f44283ab = false;

    /* renamed from: ad, reason: collision with root package name */
    private int f44285ad = 0;

    /* renamed from: ae, reason: collision with root package name */
    private boolean f44286ae = true;

    /* renamed from: af, reason: collision with root package name */
    private long f44287af = 0;

    /* renamed from: ag, reason: collision with root package name */
    private int f44288ag = 3;

    /* renamed from: ah, reason: collision with root package name */
    private int f44289ah = 0;

    /* renamed from: ai, reason: collision with root package name */
    private boolean f44290ai = false;

    /* renamed from: aj, reason: collision with root package name */
    private boolean f44291aj = true;

    /* renamed from: ak, reason: collision with root package name */
    private long f44292ak = 0;

    /* renamed from: al, reason: collision with root package name */
    private Runnable f44293al = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.3
        @Override // java.lang.Runnable
        public void run() {
            a.this.f44292ak = System.currentTimeMillis();
            a.this.b();
            a.this.d();
            a.this.c();
        }
    };

    public a() {
        this.f44313u = null;
        this.f44313u = new i("HWVideoEncoder");
    }

    public static /* synthetic */ int d(a aVar) {
        int i11 = aVar.S;
        aVar.S = i11 + 1;
        return i11;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public int getEncodeCost() {
        return this.f44285ad;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long getRealBitrate() {
        return this.f44294b;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public double getRealFPS() {
        return this.f44295c;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public boolean isH265Encoder() {
        return this.R;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long pushVideoFrame(int i11, int i12, int i13, long j11) {
        int b11;
        if (this.C) {
            return 10000004L;
        }
        synchronized (this.f44282aa) {
            try {
                if (this.Z == null) {
                    b(i12, i13);
                }
                this.Z.a(i12, i13);
                GLES20.glViewport(0, 0, i12, i13);
                b11 = this.Z.b(i11);
                if (this.f44286ae) {
                    GLES20.glFinish();
                } else {
                    GLES20.glFlush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.U++;
        this.G = j11;
        this.Y = b11;
        this.mInputWidth = i12;
        this.mInputHeight = i13;
        if (this.O) {
            f();
        }
        if (!this.P || this.f44283ab) {
            this.X++;
            this.f44313u.b(this.f44315w);
            this.f44283ab = false;
        }
        int i14 = this.S;
        if (i14 > this.T + 30) {
            TXCLog.e("TXCHWVideoEncoder", String.format("hw encoder error when render[%d] pop[%d]", Integer.valueOf(i14), Integer.valueOf(this.T)));
            c cVar = this.mListener;
            if (cVar != null) {
                cVar.a(this.mStreamType);
                if (this.R) {
                    Monitor.a(2, String.format(Locale.getDefault(), "VideoEncoder: hevc hardware encoder error: mRendIdx= %d,mPopIdx= %d , switch to 264 hardware encoder. %s", Integer.valueOf(this.S), Integer.valueOf(this.T), TXCCommonUtil.getDeviceInfo()), "", 0);
                }
            }
        }
        if (this.V + 5000 >= System.currentTimeMillis()) {
            return 0L;
        }
        this.V = System.currentTimeMillis();
        int i15 = this.W;
        if (i15 != 0 && i15 == this.S) {
            TXCLog.i("TXCHWVideoEncoder", String.format("hw encoder error when push[%d] render task[%d] render[%d] pop[%d]", Integer.valueOf(this.U), Integer.valueOf(this.X), Integer.valueOf(this.S), Integer.valueOf(this.T)));
            c cVar2 = this.mListener;
            if (cVar2 != null) {
                cVar2.a(this.mStreamType);
                if (this.R) {
                    Monitor.a(2, String.format(Locale.getDefault(), "VideoEncoder: hevc hardware encoder error: timecheck , switch to 264 hardware encoder. %s", TXCCommonUtil.getDeviceInfo()), "", 0);
                }
            }
        }
        this.W = this.S;
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long pushVideoFrameAsync(final int i11, int i12, int i13, final long j11) {
        if (this.C) {
            return 10000004L;
        }
        if (this.f44286ae) {
            GLES20.glFinish();
        } else {
            GLES20.glFlush();
        }
        if (this.O) {
            f();
        }
        this.f44313u.a().post(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.8
            @Override // java.lang.Runnable
            public void run() {
                int a11;
                if (a.this.B || a.this.f44318z == null) {
                    return;
                }
                int i14 = i11;
                long j12 = j11;
                a.this.a(j12);
                a aVar = a.this;
                int i15 = (720 - aVar.mRotation) % 360;
                aVar.mEncodeFilter.a(aVar.mInputWidth, aVar.mInputHeight, i15, null, ((i15 == 90 || i15 == 270) ? aVar.mOutputHeight : aVar.mOutputWidth) / ((i15 == 90 || i15 == 270) ? aVar.mOutputWidth : aVar.mOutputHeight), aVar.mEnableXMirror, true);
                a.this.mEncodeFilter.a(i14);
                if (a.this.f44318z instanceof com.tencent.liteav.basic.c.b) {
                    ((com.tencent.liteav.basic.c.b) a.this.f44318z).a(j12 * 1000000);
                    ((com.tencent.liteav.basic.c.b) a.this.f44318z).e();
                }
                if (a.this.f44318z instanceof com.tencent.liteav.basic.c.a) {
                    ((com.tencent.liteav.basic.c.a) a.this.f44318z).a();
                }
                a aVar2 = a.this;
                c cVar = aVar2.mListener;
                if (cVar != null) {
                    cVar.b(aVar2.mStreamType);
                }
                do {
                    a11 = a.this.a(1);
                } while (a11 > 0);
                if (a11 != -1 && a11 != -2) {
                    a.d(a.this);
                    return;
                }
                TXCLog.e("TXCHWVideoEncoder", "[Encoder] dequeEncoder ret = " + a11);
                if (a11 == -1) {
                    a.this.callDelegate(10000005);
                }
                a.this.B = true;
                a.this.e();
            }
        });
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public long pushVideoFrameSync(int i11, int i12, int i13, long j11) {
        if (this.C) {
            return 10000004L;
        }
        if (this.f44286ae) {
            GLES20.glFinish();
        } else {
            GLES20.glFlush();
        }
        this.G = j11;
        this.Y = i11;
        if (this.O) {
            f();
        }
        this.f44313u.a(this.f44316x);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setBitrate(final int i11) {
        this.f44281a = i11;
        this.f44313u.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.6
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(i11);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setBitrateFromQos(final int i11, int i12) {
        this.f44281a = i11;
        this.f44313u.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.7
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(i11);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setFPS(final int i11) {
        this.f44313u.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.5
            @Override // java.lang.Runnable
            public void run() {
                a.this.d(i11);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setGLFinishedTextureNeed(boolean z11) {
        this.f44286ae = z11;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void signalEOSAndFlush() {
        if (this.C) {
            return;
        }
        this.f44313u.a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f44311s == null) {
                    return;
                }
                try {
                    a.this.f44311s.signalEndOfInputStream();
                } catch (Exception e11) {
                    TXCLog.e("TXCHWVideoEncoder", "signalEndOfInputStream failed.", e11);
                }
                while (a.this.a(10) >= 0) {
                }
                a.this.e();
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.b
    public int start(final TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        this.f44313u.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.1
            /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.AnonymousClass1.run():void");
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void stop() {
        this.C = true;
        this.f44313u.b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.4
            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                if (aVar.mInit) {
                    Monitor.a(2, String.format("VideoEncoder[%d]: Stop, streamType:%d", Integer.valueOf(aVar.hashCode()), Integer.valueOf(a.this.mStreamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                    a.this.e();
                }
            }
        });
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.mInit) {
            this.B = true;
            this.C = true;
            b();
            d();
            this.Y = -1;
            this.f44294b = 0L;
            this.f44295c = 0.0d;
            this.f44296d = 0L;
            this.f44297e = 0L;
            this.f44298f = 0;
            this.f44301i = 0L;
            this.f44302j = 0L;
            this.f44303k = 0L;
            this.f44304l = 0L;
            this.f44305m = 0L;
            this.f44309q = 0L;
            this.f44310r = 0L;
            this.mGLContextExternal = null;
            this.E = null;
            this.F = null;
            this.G = 0L;
            this.mOutputWidth = 0;
            this.mOutputHeight = 0;
            this.mInit = false;
            this.mListener = null;
            this.f44317y.clear();
            this.f44284ac.clear();
            this.f44285ad = 0;
        }
    }

    private void f() {
        if (this.f44311s != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f44311s.setParameters(bundle);
        }
    }

    private void g() {
        if (this.f44287af > 0) {
            int i11 = this.L;
            int i12 = i11 - ((int) this.f44295c);
            int i13 = i11 / 2;
            if (i13 < 5) {
                i13 = 5;
            }
            if (i12 <= i13) {
                long currentTimeMillis = System.currentTimeMillis() - this.f44287af;
                int i14 = this.f44288ag;
                if (currentTimeMillis > (4 - i14) * 2000) {
                    long j11 = this.f44289ah - this.f44294b;
                    long j12 = this.f44301i / 2;
                    if (j12 < 100) {
                        j12 = 100;
                    }
                    if (j11 <= j12) {
                        int i15 = i14 - 1;
                        this.f44288ag = i15;
                        if (i15 <= 0) {
                            this.f44287af = 0L;
                            return;
                        }
                        return;
                    }
                    this.f44290ai = true;
                    String str = "real bitrate is too much lower than target bitrate![current profile:" + this.N + "][targetBr:" + this.f44289ah + "] [realBr:" + this.f44294b + "]. restart encoder. [module:" + e.f43437a + "] [Hardware:" + e.f43440d + "] [osVersion:" + e.f43441e + "]";
                    TXCLog.e("TXCHWVideoEncoder", str);
                    Monitor.a(3, str, "", 0);
                    if (this.R) {
                        this.N = 1;
                        TXCLog.w("TXCHWVideoEncoder", "[Encoder] force reset hevc profile to HEVCProfileMain when restart encoder. device:" + TXCCommonUtil.getDeviceInfo());
                    } else if (this.N != 1) {
                        this.N = 1;
                        TXCLog.e("TXCHWVideoEncoder", "[Encoder] force reset profile to baseline when restart encoder. device:" + TXCCommonUtil.getDeviceInfo());
                    }
                    i iVar = this.f44313u;
                    if (iVar != null) {
                        iVar.b(this.f44293al);
                    }
                    this.f44287af = 0L;
                }
            }
        }
    }

    private void h() {
        TXCLog.i("TXCHWVideoEncoder", "destroyCopyTexture");
        synchronized (this.f44282aa) {
            try {
                f fVar = this.Z;
                if (fVar != null) {
                    fVar.d();
                    this.Z = null;
                }
                this.Y = -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities a11;
        if (mediaFormat == null || (a11 = a(i11, i12)) == null) {
            return false;
        }
        int widthAlignment = a11.getWidthAlignment();
        int heightAlignment = a11.getHeightAlignment();
        TXCLog.i("TXCHWVideoEncoder", "widthAlignment:" + widthAlignment + " heightAlignment:");
        if (widthAlignment < 2 || heightAlignment < 2 || widthAlignment % 2 != 0 || heightAlignment % 2 != 0) {
            return false;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        int i13 = (integer / widthAlignment) * widthAlignment;
        int i14 = (integer2 / heightAlignment) * heightAlignment;
        if (integer == i13 && integer2 == i14) {
            return false;
        }
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i14);
        TXCLog.i("TXCHWVideoEncoder", "updateMediaFormatWithAlignment: fixSize: src:" + integer + " " + integer2 + " fix:" + i13 + " " + i14 + " widthAlignment：" + widthAlignment + "  heightAlignment：" + heightAlignment);
        return true;
    }

    private boolean d(MediaFormat mediaFormat, int i11, int i12) {
        return a(mediaFormat, i11, i12) || b(mediaFormat, i11, i12) || c(mediaFormat, i11, i12);
    }

    private boolean b(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities a11;
        if (mediaFormat == null || (a11 = a(i11, i12)) == null) {
            return false;
        }
        Range<Integer> supportedWidths = a11.getSupportedWidths();
        Range<Integer> supportedHeights = a11.getSupportedHeights();
        if (supportedWidths != null && supportedHeights != null) {
            Integer lower = supportedWidths.getLower();
            Integer lower2 = supportedHeights.getLower();
            MediaCodecInfo.VideoCapabilities a12 = a(this.f44311s, this.f44312t);
            if (a12 != null) {
                Range<Integer> supportedWidths2 = a12.getSupportedWidths();
                Range<Integer> supportedHeights2 = a12.getSupportedHeights();
                if (supportedWidths2 != null && supportedHeights2 != null) {
                    lower = Integer.valueOf(Math.max(lower.intValue(), supportedWidths2.getLower().intValue()));
                    lower2 = Integer.valueOf(Math.max(lower2.intValue(), supportedHeights2.getLower().intValue()));
                }
            }
            if (lower.intValue() >= 0 && lower2.intValue() >= 0) {
                int integer = mediaFormat.getInteger("width");
                int integer2 = mediaFormat.getInteger("height");
                if (lower.intValue() <= integer && lower2.intValue() <= integer2) {
                    return false;
                }
                float f11 = integer;
                float f12 = integer2;
                float max = Math.max(lower2.intValue() / (1.0f * f12), lower.intValue() / (f11 * 1.0f));
                int i13 = (int) (f11 * max);
                int i14 = (int) (max * f12);
                mediaFormat.setInteger("width", i13);
                mediaFormat.setInteger("height", i14);
                TXCLog.i("TXCHWVideoEncoder", "updateMediaFormatToLowerSize:lowerW:" + lower + " lowerH:" + lower2 + " fixLowW:" + i13 + " fixLowH:" + i14);
                return true;
            }
        }
        return false;
    }

    @TargetApi(16)
    private MediaFormat a(int i11, int i12, int i13, int i14, int i15) {
        TXCLog.i("TXCHWVideoEncoder", "createBaseFormat:" + i11 + GlideException.a.f28776d + i12);
        if (i11 == 0 || i12 == 0 || i13 == 0 || i14 == 0) {
            return null;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f44312t, i11, i12);
        createVideoFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, i13 * 1024);
        createVideoFormat.setInteger("frame-rate", i14);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", i15);
        return createVideoFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        MediaCodec mediaCodec = this.f44311s;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                try {
                    mediaCodec.stop();
                    this.f44311s.release();
                    Surface surface = this.A;
                    if (surface != null) {
                        surface.release();
                    }
                } catch (Throwable th2) {
                    try {
                        this.f44311s.release();
                        Surface surface2 = this.A;
                        if (surface2 != null) {
                            surface2.release();
                        }
                        this.A = null;
                    } catch (Exception e11) {
                        TXCLog.e("TXCHWVideoEncoder", "release encoder failed.", e11);
                    }
                    throw th2;
                }
            } catch (IllegalStateException e12) {
                TXCLog.e("TXCHWVideoEncoder", "stop encoder failed.", e12);
                this.f44311s.release();
                Surface surface3 = this.A;
                if (surface3 != null) {
                    surface3.release();
                }
            }
            this.A = null;
        } catch (Exception e13) {
            TXCLog.e("TXCHWVideoEncoder", "release encoder failed.", e13);
        }
        this.f44311s = null;
    }

    @TargetApi(16)
    private MediaFormat a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11) {
        MediaFormat a11 = a(i11, i12, i13, i14, i15);
        if (a11 == null) {
            TXCLog.w("TXCHWVideoEncoder", "createFormat fmt = null");
            return null;
        }
        MediaCodecInfo a12 = a(this.f44312t);
        if (a12 == null) {
            TXCLog.w("TXCHWVideoEncoder", "selectCodec info = null, mMimeType = " + this.f44312t);
            return a11;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = a12.getCapabilitiesForType(this.f44312t);
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (z11) {
            a11.setInteger("bitrate-mode", i16);
        } else if (encoderCapabilities.isBitrateModeSupported(i16)) {
            a11.setInteger("bitrate-mode", i16);
        } else if (this.O) {
            if (encoderCapabilities.isBitrateModeSupported(1)) {
                a11.setInteger("bitrate-mode", 1);
            } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                a11.setInteger("bitrate-mode", 2);
            }
        } else if (encoderCapabilities.isBitrateModeSupported(2)) {
            a11.setInteger("bitrate-mode", 2);
        }
        a11.setInteger("complexity", encoderCapabilities.getComplexityRange().clamp(5).intValue());
        int i18 = 0;
        int i19 = 0;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
            int i21 = codecProfileLevel.profile;
            if (i21 <= i17 && (i21 > i19 || (i21 == i19 && codecProfileLevel.level > i18))) {
                i18 = codecProfileLevel.level;
                a11.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, i21);
                a11.setInteger("level", codecProfileLevel.level);
                i19 = i21;
            }
        }
        TXCLog.i("TXCHWVideoEncoder", "profile:" + i17 + "  level:" + i18);
        if (i19 > 0) {
            try {
                if (d(a11, i17, i18)) {
                    this.mOutputHeight = a11.getInteger("height");
                    this.mOutputWidth = a11.getInteger("width");
                    return a11;
                }
            } catch (Exception e11) {
                TXCLog.e("TXCHWVideoEncoder", "createFromProfileLevel e = " + e11.toString());
            }
        }
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018d A[Catch: Exception -> 0x0192, TryCatch #7 {Exception -> 0x0192, blocks: (B:59:0x0180, B:61:0x0184, B:52:0x0187, B:54:0x018d, B:55:0x0190), top: B:58:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.c():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        TXCLog.i("TXCHWVideoEncoder", "HWVideoEncode destroyGL");
        f fVar = this.mEncodeFilter;
        if (fVar != null) {
            fVar.d();
            this.mEncodeFilter = null;
        }
        Object obj = this.f44318z;
        if (obj instanceof com.tencent.liteav.basic.c.a) {
            ((com.tencent.liteav.basic.c.a) obj).c();
            this.f44318z = null;
        }
        Object obj2 = this.f44318z;
        if (obj2 instanceof com.tencent.liteav.basic.c.b) {
            ((com.tencent.liteav.basic.c.b) obj2).d();
            this.f44318z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i11) {
        if (!this.mInit || i11 == 0 || this.L == i11) {
            return;
        }
        TXCLog.i("TXCHWVideoEncoder", "set fps " + i11 + ", restart encoder.");
        b();
        d();
        this.L = i11;
        c();
    }

    @Override // com.tencent.liteav.videoencoder.b
    public void setEncodeIdrFpsFromQos(int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x000e, B:10:0x0015, B:12:0x0019, B:13:0x001b, B:16:0x0021, B:18:0x0035, B:20:0x0037, B:24:0x004b, B:28:0x0055, B:29:0x005a, B:31:0x0078, B:32:0x008a, B:34:0x0090, B:35:0x0095, B:50:0x0058, B:51:0x004e), top: B:7:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x000e, B:10:0x0015, B:12:0x0019, B:13:0x001b, B:16:0x0021, B:18:0x0035, B:20:0x0037, B:24:0x004b, B:28:0x0055, B:29:0x005a, B:31:0x0078, B:32:0x008a, B:34:0x0090, B:35:0x0095, B:50:0x0058, B:51:0x004e), top: B:7:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.b(int):void");
    }

    private boolean a(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities a11;
        Integer num = -1;
        if (mediaFormat == null || (a11 = a(i11, i12)) == null) {
            return false;
        }
        Range<Integer> supportedWidths = a11.getSupportedWidths();
        Integer upper = supportedWidths != null ? supportedWidths.getUpper() : num;
        Range<Integer> supportedHeights = a11.getSupportedHeights();
        if (supportedHeights != null) {
            num = supportedHeights.getUpper();
        }
        if (upper.intValue() < 0 || num.intValue() < 0) {
            return false;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        TXCLog.i("TXCHWVideoEncoder", "updateToCodecSupportSize: srcWidth:" + integer + " srcHeight:" + integer2);
        if (upper.intValue() >= integer && num.intValue() >= integer2) {
            return false;
        }
        float f11 = integer;
        float f12 = integer2;
        float min = Math.min(num.intValue() / (1.0f * f12), upper.intValue() / (f11 * 1.0f));
        int i13 = (int) (f11 * min);
        int i14 = (int) (min * f12);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i14);
        TXCLog.i("TXCHWVideoEncoder", "updateMediaFormatToUpperSize:upperW:" + upper + " upperH:" + num + " fixUpperW:" + i13 + " fixUpperH:" + i14);
        return true;
    }

    private MediaCodecInfo.VideoCapabilities a(int i11, int i12) {
        MediaCodecInfo.CodecCapabilities createFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f44312t, i11, i12);
        if (createFromProfileLevel == null) {
            return null;
        }
        return createFromProfileLevel.getVideoCapabilities();
    }

    private MediaCodecInfo.VideoCapabilities a(MediaCodec mediaCodec, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (mediaCodec == null || (capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str)) == null) {
            return null;
        }
        return capabilitiesForType.getVideoCapabilities();
    }

    private void b(int i11, int i12) {
        TXCLog.i("TXCHWVideoEncoder", "createCopyTexture");
        synchronized (this.f44282aa) {
            f fVar = new f();
            this.Z = fVar;
            fVar.a(true);
            this.Z.a();
            this.Z.a(i11, i12);
        }
    }

    @TargetApi(16)
    private static MediaCodecInfo a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i11) {
        if (this.mInit) {
            long j11 = this.f44301i;
            int i12 = this.f44281a;
            if (j11 == i12) {
                return;
            }
            boolean z11 = false;
            if (i12 < j11 && this.f44291aj) {
                if (this.f44290ai) {
                    Monitor.a(4, "restart video hw encoder when down bps。[module:" + e.f43437a + "] [Hardware:" + e.f43440d + "] [osVersion:" + e.f43441e + "]", "", 0);
                    z11 = true;
                } else {
                    this.f44288ag = 3;
                    this.f44287af = System.currentTimeMillis();
                    this.f44289ah = this.f44281a;
                }
            }
            this.f44301i = this.f44281a;
            if (this.f44311s != null) {
                if (z11) {
                    this.f44313u.a().removeCallbacks(this.f44293al);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j12 = this.f44292ak;
                    if (currentTimeMillis - j12 >= 2000) {
                        this.f44293al.run();
                        return;
                    } else {
                        this.f44313u.a(this.f44293al, 2000 - (currentTimeMillis - j12));
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.f44281a * 1024);
                this.f44311s.setParameters(bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j11) {
        this.f44317y.add(Long.valueOf(j11));
    }

    private long a() {
        Long poll = this.f44317y.poll();
        if (poll == null) {
            return 0L;
        }
        return poll.longValue();
    }

    private boolean a(Surface surface, int i11, int i12) {
        if (surface == null) {
            return false;
        }
        TXCLog.i("TXCHWVideoEncoder", "HWVideoEncode createGL: " + this.mGLContextExternal);
        Object obj = this.mGLContextExternal;
        if (obj != null && (obj instanceof EGLContext)) {
            this.f44318z = com.tencent.liteav.basic.c.b.a(null, (EGLContext) obj, surface, i11, i12);
        } else {
            this.f44318z = com.tencent.liteav.basic.c.a.a(null, (javax.microedition.khronos.egl.EGLContext) obj, surface, i11, i12);
        }
        if (this.f44318z == null) {
            return false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        f fVar = new f();
        this.mEncodeFilter = fVar;
        fVar.a(com.tencent.liteav.basic.c.i.f43240e, com.tencent.liteav.basic.c.i.a(h.NORMAL, false, false));
        if (!this.mEncodeFilter.a()) {
            this.mEncodeFilter = null;
            return false;
        }
        GLES20.glViewport(0, 0, i11, i12);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.liteav.videoencoder.TXSVideoEncoderParam r11) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.a(com.tencent.liteav.videoencoder.TXSVideoEncoderParam):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r31) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoencoder.a.a(int):int");
    }

    private byte[] a(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length + 20];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            byte b11 = bArr[i11];
            if (b11 == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 1) {
                bArr2 = bArr;
                i13 = a(i11, i12, bArr3, bArr2, i13);
                i11 += 3;
            } else {
                bArr2 = bArr;
                if (b11 == 0 && bArr2[i11 + 1] == 0 && bArr2[i11 + 2] == 0 && bArr2[i11 + 3] == 1) {
                    i13 = a(i11, i12, bArr3, bArr2, i13);
                    i11 += 4;
                }
                if (i11 != length - 4 && (bArr2[i11 + 1] != 0 || bArr2[i11 + 2] != 0 || bArr2[i11 + 3] != 1)) {
                    i11 = length;
                    break;
                }
                i11++;
                bArr = bArr2;
            }
            i12 = i11;
            if (i11 != length - 4) {
            }
            i11++;
            bArr = bArr2;
        }
        bArr2 = bArr;
        int a11 = a(i11, i12, bArr3, bArr2, i13);
        byte[] bArr4 = new byte[a11];
        System.arraycopy(bArr3, 0, bArr4, 0, a11);
        return bArr4;
    }

    private int a(int i11, int i12, byte[] bArr, byte[] bArr2, int i13) {
        if (i12 > 0 && i11 > i12) {
            int i14 = i11 - i12;
            try {
                ByteBuffer wrap = ByteBuffer.wrap(new byte[4]);
                wrap.asIntBuffer().put(i14);
                wrap.order(ByteOrder.BIG_ENDIAN);
                System.arraycopy(wrap.array(), 0, bArr, i13, 4);
                System.arraycopy(bArr2, i12, bArr, i13 + 4, i14);
                return i13 + i14 + 4;
            } catch (Exception unused) {
                TXCLog.e("TXCHWVideoEncoder", "setNalData exception");
            }
        }
        return i13;
    }
}
