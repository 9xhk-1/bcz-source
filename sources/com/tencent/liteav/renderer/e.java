package com.tencent.liteav.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.tencent.liteav.basic.c.k;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import n6.m;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends com.tencent.liteav.basic.module.a implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f44028a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    private boolean G;

    /* renamed from: b, reason: collision with root package name */
    private SurfaceTexture f44029b;

    /* renamed from: d, reason: collision with root package name */
    protected TextureView f44031d;

    /* renamed from: e, reason: collision with root package name */
    protected d f44032e;

    /* renamed from: o, reason: collision with root package name */
    protected f f44042o;

    /* renamed from: p, reason: collision with root package name */
    WeakReference<com.tencent.liteav.basic.b.b> f44043p;

    /* renamed from: q, reason: collision with root package name */
    private com.tencent.liteav.basic.c.d f44044q;

    /* renamed from: r, reason: collision with root package name */
    private h f44045r;

    /* renamed from: s, reason: collision with root package name */
    private Surface f44046s;

    /* renamed from: u, reason: collision with root package name */
    private int f44048u;

    /* renamed from: f, reason: collision with root package name */
    protected int f44033f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f44034g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f44035h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected int f44036i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected int f44037j = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f44030c = 800;

    /* renamed from: t, reason: collision with root package name */
    private int f44047t = 0;

    /* renamed from: k, reason: collision with root package name */
    protected int f44038k = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f44049v = 2;

    /* renamed from: l, reason: collision with root package name */
    protected volatile int f44039l = -1;

    /* renamed from: m, reason: collision with root package name */
    protected int f44040m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f44041n = 0;

    /* renamed from: w, reason: collision with root package name */
    private int[] f44050w = new int[5];

    /* renamed from: x, reason: collision with root package name */
    private int f44051x = 500;

    /* renamed from: y, reason: collision with root package name */
    private long f44052y = 0;

    /* renamed from: z, reason: collision with root package name */
    private long f44053z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private boolean D = false;
    private boolean E = false;
    private a H = new a();
    private boolean F = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f44064a;

        /* renamed from: b, reason: collision with root package name */
        public long f44065b;

        /* renamed from: c, reason: collision with root package name */
        public long f44066c;

        /* renamed from: d, reason: collision with root package name */
        public long f44067d;

        /* renamed from: e, reason: collision with root package name */
        public long f44068e;

        /* renamed from: f, reason: collision with root package name */
        public long f44069f;

        /* renamed from: g, reason: collision with root package name */
        public long f44070g;

        /* renamed from: h, reason: collision with root package name */
        public long f44071h;

        /* renamed from: i, reason: collision with root package name */
        public long f44072i;

        /* renamed from: j, reason: collision with root package name */
        public long f44073j;

        /* renamed from: k, reason: collision with root package name */
        public long f44074k;

        /* renamed from: l, reason: collision with root package name */
        public int f44075l;

        /* renamed from: m, reason: collision with root package name */
        public int f44076m;

        /* renamed from: n, reason: collision with root package name */
        public long f44077n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f44078o = true;
    }

    public e() {
        this.G = false;
        this.G = true;
    }

    public SurfaceTexture a() {
        return null;
    }

    public void c(Object obj) {
    }

    public void d() {
    }

    public void e() {
        Monitor.a(2, String.format("Remote-VideoRender[%d]: Start [tinyID:%s] [streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f44037j)), "streamType: 2-big, 3-small, 7-sub", 0);
        this.E = true;
        this.F = false;
        l();
    }

    public int f() {
        TextureView textureView = this.f44031d;
        if (textureView != null) {
            return textureView.getWidth();
        }
        if (this.f44046s != null) {
            return this.f44040m;
        }
        return 0;
    }

    public int g() {
        TextureView textureView = this.f44031d;
        if (textureView != null) {
            return textureView.getHeight();
        }
        if (this.f44046s != null) {
            return this.f44041n;
        }
        return 0;
    }

    public int h() {
        return this.f44035h;
    }

    public int i() {
        return this.f44036i;
    }

    public void k() {
        synchronized (this) {
            try {
                if (this.f44044q != null) {
                    TXCLog.i("TXCVideoRender", "surface-render: onRenderThreadEGLDestroy stop render thread " + this.f44044q);
                    this.f44044q.a();
                    this.f44044q = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h hVar = this.f44045r;
        if (hVar != null) {
            hVar.c();
            this.f44045r = null;
        }
    }

    public void l() {
        m();
        a aVar = this.H;
        aVar.f44065b = 0L;
        aVar.f44066c = 0L;
        aVar.f44068e = 0L;
        aVar.f44069f = 0L;
        aVar.f44070g = 0L;
        aVar.f44071h = 0L;
        aVar.f44072i = 0L;
        aVar.f44074k = 0L;
        this.C = 0L;
        setStatusValue(6001, this.f44037j, 0L);
        setStatusValue(6003, this.f44037j, 0L);
        setStatusValue(6005, this.f44037j, 0L);
        setStatusValue(6006, this.f44037j, 0L);
        setStatusValue(6004, this.f44037j, 0L);
        setStatusValue(6012, this.f44037j, 0L);
    }

    public void m() {
        n();
        a aVar = this.H;
        aVar.f44064a = 0L;
        aVar.f44067d = 0L;
        aVar.f44073j = 0L;
        this.f44053z = 0L;
    }

    public void n() {
        a aVar = this.H;
        aVar.f44077n = 0L;
        this.B = 0L;
        this.A = 0L;
        aVar.f44075l = 0;
        aVar.f44076m = 0;
        setStatusValue(6002, this.f44037j, Double.valueOf(0.0d));
    }

    public void o() {
        a aVar = this.H;
        if (aVar.f44064a == 0) {
            aVar.f44064a = TXCTimeUtil.getTimeTick();
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick() - this.H.f44064a;
        if (timeTick >= 950) {
            setStatusValue(6002, this.f44037j, Double.valueOf(((r2.f44066c - r2.f44065b) * 1000.0d) / timeTick));
            TXCKeyPointReportProxy.a(getID(), PayStatusCodes.PRODUCT_NOT_EXIST, (int) r2, this.f44037j);
            a aVar2 = this.H;
            aVar2.f44065b = aVar2.f44066c;
            aVar2.f44064a += timeTick;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        TXCLog.w("TXCVideoRender", "play:vrender: texture available @" + surfaceTexture + "id " + getID() + "_" + this.f44037j);
        this.f44033f = i11;
        this.f44034g = i12;
        d dVar = this.f44032e;
        if (dVar != null) {
            dVar.a(i11, i12);
        }
        if (this.f44029b != null) {
            try {
                SurfaceTexture surfaceTexture2 = this.f44031d.getSurfaceTexture();
                SurfaceTexture surfaceTexture3 = this.f44029b;
                if (surfaceTexture2 != surfaceTexture3) {
                    this.f44031d.setSurfaceTexture(surfaceTexture3);
                }
            } catch (Exception e11) {
                TXCLog.e("TXCVideoRender", "setSurfaceTexture failed.", e11);
                a(surfaceTexture);
            }
            this.f44029b = null;
        } else {
            a(surfaceTexture);
        }
        this.D = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            this.D = false;
            TXCLog.w("TXCVideoRender", "play:vrender:  onSurfaceTextureDestroyed when need save texture : " + this.G + "id " + getID() + "_" + this.f44037j);
            if (this.G) {
                this.f44029b = surfaceTexture;
            } else {
                this.H.f44064a = 0L;
                b(surfaceTexture);
                if (surfaceTexture == this.f44029b) {
                    this.f44029b = null;
                }
            }
        } catch (Exception e11) {
            TXCLog.e("TXCVideoRender", "onSurfaceTextureDestroyed failed.", e11);
        }
        return this.f44029b == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        TXCLog.w("TXCVideoRender", "play:vrender: texture size change new:" + i11 + "," + i12 + " old:" + this.f44033f + "," + this.f44034g);
        if (!this.D) {
            TXCLog.w("TXCVideoRender", "play:vrender: onSurfaceCreate on onSurfaceTextureSizeChanged when onSurfaceTextureAvailable is not trigger");
            this.D = true;
            a(surfaceTexture);
        }
        this.f44033f = i11;
        this.f44034g = i12;
        d dVar = this.f44032e;
        if (dVar != null) {
            dVar.a(i11, i12);
        }
    }

    public void b(int i11) {
        if (i11 > 0) {
            this.f44030c = i11;
        }
    }

    public void c(int i11, int i12) {
        a(i11, i12);
    }

    public void d(int i11) {
        this.f44049v = i11;
        d dVar = this.f44032e;
        if (dVar != null) {
            if (i11 == 2) {
                dVar.a(false);
            } else {
                dVar.a(true);
            }
        }
    }

    public void b(boolean z11) {
        this.G = z11;
    }

    public void c(int i11) {
        this.f44048u = i11;
        d dVar = this.f44032e;
        if (dVar != null) {
            dVar.a(i11);
        }
    }

    public void a(int i11) {
        this.f44037j = i11;
    }

    public void b(SurfaceTexture surfaceTexture) {
        this.D = false;
    }

    private Bitmap a(Bitmap bitmap, int i11, int i12) {
        float height;
        float f11 = i12;
        float f12 = i11;
        if (f11 / f12 > bitmap.getHeight() / bitmap.getWidth()) {
            height = f12 / bitmap.getWidth();
        } else {
            height = f11 / bitmap.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.preScale(height, height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmap.recycle();
        return createBitmap;
    }

    private void b(TextureView textureView) {
        boolean z11 = false;
        if (textureView != null) {
            this.f44039l = 0;
        }
        TextureView textureView2 = this.f44031d;
        if ((textureView2 == null && textureView != null) || (textureView2 != null && !textureView2.equals(textureView))) {
            z11 = true;
        }
        TXCLog.w("TXCVideoRender", "play:vrender: set video view @old=" + this.f44031d + ",new=" + textureView + "id " + getID() + "_" + this.f44037j);
        if (z11) {
            TextureView textureView3 = this.f44031d;
            if (textureView3 != null && this.f44029b == null) {
                b(textureView3.getSurfaceTexture());
                this.f44031d.setSurfaceTextureListener(null);
            }
            this.f44031d = textureView;
            if (textureView != null) {
                if (textureView.getWidth() != 0) {
                    this.f44033f = this.f44031d.getWidth();
                }
                if (this.f44031d.getHeight() != 0) {
                    this.f44034g = this.f44031d.getHeight();
                }
                d dVar = new d(this.f44031d);
                this.f44032e = dVar;
                dVar.b(this.f44035h, this.f44036i);
                this.f44032e.a(this.f44033f, this.f44034g);
                this.f44032e.a(this.f44048u);
                this.f44032e.c((this.f44047t + this.f44038k) % 360);
                d(this.f44049v);
                this.f44031d.setSurfaceTextureListener(this);
                if (this.f44029b != null) {
                    if (this.f44031d.getSurfaceTexture() != this.f44029b) {
                        TXCLog.w("TXCVideoRender", "play:vrender: setSurfaceTexture " + this.f44031d + ", surfaceTexture " + this.f44029b);
                        try {
                            this.f44031d.setSurfaceTexture(this.f44029b);
                            return;
                        } catch (Exception e11) {
                            TXCLog.e("TXCVideoRender", "setSurfaceTexture error " + e11);
                            return;
                        }
                    }
                    TXCLog.w("TXCVideoRender", "play:vrender: not setSurfaceTexture old surfaceTexture " + this.f44031d.getSurfaceTexture() + ", new surfaceTexture " + this.f44029b);
                    return;
                }
                if (this.f44031d.isAvailable()) {
                    a(this.f44031d.getSurfaceTexture());
                }
            }
        }
    }

    public void e(int i11) {
        this.f44047t = i11;
        d dVar = this.f44032e;
        if (dVar != null) {
            dVar.c((i11 + this.f44038k) % 360);
        }
    }

    public void f(int i11) {
        this.f44051x = i11;
    }

    public void c(boolean z11) {
        this.H.f44078o = z11;
    }

    public void d(final int i11, final int i12) {
        TXCLog.i("TXCVideoRender", "surface-render: set setSurfaceSize " + i11 + "*" + i12);
        if (i11 == this.f44040m && i12 == this.f44041n) {
            return;
        }
        if (this.f44044q != null && this.f44039l == 1 && this.f44050w != null) {
            this.f44044q.a(new Runnable() { // from class: com.tencent.liteav.renderer.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e eVar = e.this;
                    eVar.f44040m = i11;
                    eVar.f44041n = i12;
                    if (eVar.f44044q != null) {
                        com.tencent.liteav.basic.c.d dVar = e.this.f44044q;
                        int i13 = e.this.f44050w[0];
                        boolean z11 = e.this.f44050w[3] == 1;
                        int i14 = e.this.f44050w[4];
                        e eVar2 = e.this;
                        dVar.a(i13, z11, i14, eVar2.f44040m, eVar2.f44041n, eVar2.f44050w[1], e.this.f44050w[2], true, false);
                    }
                }
            });
        } else {
            this.f44040m = i11;
            this.f44041n = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Matrix matrix, Bitmap bitmap, int i11, int i12) {
        Bitmap bitmap2;
        int i13 = 360 - ((this.f44047t + this.f44038k) % 360);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        if (i13 != 0) {
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(i13);
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, false);
            createBitmap.recycle();
            bitmap2 = createBitmap2;
        } else {
            bitmap2 = createBitmap;
        }
        if (this.f44048u != 0) {
            return (i11 == bitmap2.getWidth() || i12 == bitmap2.getHeight()) ? bitmap2 : a(bitmap2, i11, i12);
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        boolean z11 = i11 < i12;
        if (z11 == (width < height)) {
            return (i11 == bitmap2.getWidth() || i12 == bitmap2.getHeight()) ? bitmap2 : a(bitmap2, i11, i12);
        }
        if (z11) {
            float f11 = i11;
            float f12 = (height * f11) / i12;
            Matrix matrix3 = new Matrix();
            float f13 = f11 / f12;
            matrix3.preScale(f13, f13);
            Bitmap createBitmap3 = Bitmap.createBitmap(bitmap2, (int) ((width - f12) * 0.5f), 0, (int) f12, height, matrix3, false);
            bitmap2.recycle();
            return createBitmap3;
        }
        float f14 = i12;
        float f15 = (width / i11) * f14;
        Matrix matrix4 = new Matrix();
        float f16 = f14 / f15;
        matrix4.preScale(f16, f16);
        Bitmap createBitmap4 = Bitmap.createBitmap(bitmap2, 0, (int) ((height - f15) * 0.5f), width, (int) f15, (Matrix) null, false);
        Bitmap createBitmap5 = Bitmap.createBitmap(createBitmap4, 0, 0, createBitmap4.getWidth(), createBitmap4.getHeight(), matrix4, false);
        createBitmap4.recycle();
        return createBitmap5;
    }

    public void j() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private void b(Surface surface) {
        TXCLog.i("TXCVideoRender", "surface-render: set surface " + surface);
        if (this.f44046s == surface) {
            TXCLog.i("TXCVideoRender", "surface-render: set the same surface, ignore ");
            return;
        }
        this.f44046s = surface;
        this.f44039l = 1;
        if (surface != null) {
            TXCLog.i("TXCVideoRender", "surface-render: set surface start render thread " + surface);
            c((Object) null);
            return;
        }
        synchronized (this) {
            try {
                if (this.f44044q != null) {
                    TXCLog.i("TXCVideoRender", "surface-render: set surface stop render thread " + this.f44044q);
                    this.f44044q.a();
                    this.f44044q = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(final k kVar) {
        final Bitmap bitmap;
        final TextureView textureView = this.f44031d;
        if (textureView != null) {
            try {
                bitmap = textureView.getBitmap();
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                final Matrix transform = textureView.getTransform(null);
                AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.renderer.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap bitmap2 = null;
                        try {
                            bitmap2 = e.this.a(transform, bitmap, textureView.getWidth(), textureView.getHeight());
                        } catch (Error e11) {
                            TXCLog.w("TXCVideoRender", "takePhoto error " + e11);
                        } catch (Exception e12) {
                            TXCLog.w("TXCVideoRender", "takePhoto error " + e12);
                        }
                        k kVar2 = kVar;
                        if (kVar2 != null) {
                            kVar2.a(bitmap2);
                        }
                    }
                });
                return;
            }
            return;
        }
        com.tencent.liteav.basic.c.d dVar = this.f44044q;
        if (dVar != null) {
            dVar.a(new Runnable() { // from class: com.tencent.liteav.renderer.e.2
                @Override // java.lang.Runnable
                public void run() {
                    if (e.this.f44044q != null) {
                        e.this.f44044q.a(kVar);
                    }
                }
            });
        } else if (kVar != null) {
            kVar.a(null);
        }
    }

    public void a(f fVar) {
        this.f44042o = fVar;
    }

    public void a(com.tencent.liteav.basic.b.b bVar) {
        this.f44043p = new WeakReference<>(bVar);
    }

    private void b() {
        long j11;
        if (!this.F) {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_USERID", getID());
            bundle.putInt("EVT_ID", 2003);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Render the first video frame(IDR)");
            bundle.putInt("EVT_PARAM1", this.f44035h);
            bundle.putInt("EVT_PARAM2", this.f44036i);
            com.tencent.liteav.basic.util.h.a(this.f44043p, 2003, bundle);
            setStatusValue(6001, this.f44037j, Long.valueOf(TXCTimeUtil.getTimeTick()));
            setStatusValue(6010, this.f44037j, Integer.valueOf(this.f44035h));
            setStatusValue(6011, this.f44037j, Integer.valueOf(this.f44036i));
            TXCLog.i("TXCVideoRender", "[FirstFramePath][Video][Render] TXCVideoRender: render first video frame. instance:" + hashCode() + " id:" + getID() + " type:" + this.f44037j);
            this.F = true;
            Monitor.a(2, String.format("Remote-VideoRender[%d]: Render first frame [tinyID:%s][streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f44037j)), "streamType: 2-big, 3-small, 7-sub", 0);
            TXCKeyPointReportProxy.a(getID(), 40022, 0L, this.f44037j);
        }
        a aVar = this.H;
        if (aVar.f44078o) {
            aVar.f44066c++;
            o();
            long a11 = a(this.H.f44077n);
            a aVar2 = this.H;
            long j12 = aVar2.f44067d;
            if (j12 != 0) {
                aVar2.f44073j = a(j12);
                a aVar3 = this.H;
                long j13 = aVar3.f44074k;
                long j14 = aVar3.f44073j;
                aVar3.f44074k = j13 + j14;
                if (j14 > 200) {
                    long j15 = aVar3.f44068e + 1;
                    aVar3.f44068e = j15;
                    setStatusValue(6009, this.f44037j, Long.valueOf(j15));
                }
                a aVar4 = this.H;
                if (aVar4.f44073j > this.f44051x) {
                    long j16 = aVar4.f44069f + 1;
                    aVar4.f44069f = j16;
                    setStatusValue(6003, this.f44037j, Long.valueOf(j16));
                    a aVar5 = this.H;
                    long j17 = aVar5.f44073j;
                    if (j17 > aVar5.f44072i) {
                        aVar5.f44072i = j17;
                        setStatusValue(6005, this.f44037j, Long.valueOf(j17));
                    }
                    TXCLog.w("TXCVideoRender", "render frame count:" + this.H.f44066c + " block time:" + this.H.f44073j + "> 500");
                }
                long j18 = this.H.f44073j;
                if (j18 > this.f44030c) {
                    this.f44053z += j18;
                    TXCLog.w("TXCVideoRender", "render frame count:" + this.H.f44066c + " block time:" + this.H.f44073j + "> " + this.f44030c);
                    j11 = 1L;
                    com.tencent.liteav.basic.util.h.a(this.f44043p, getID(), 2105, "Current video block for " + this.H.f44073j + "ms", this.H.f44073j);
                    a aVar6 = this.H;
                    long j19 = aVar6.f44071h + aVar6.f44073j;
                    aVar6.f44071h = j19;
                    setStatusValue(6006, this.f44037j, Long.valueOf(j19));
                } else {
                    j11 = 1;
                }
                a aVar7 = this.H;
                if (aVar7.f44073j > 1000) {
                    long j21 = aVar7.f44070g + j11;
                    aVar7.f44070g = j21;
                    setStatusValue(6004, this.f44037j, Long.valueOf(j21));
                    TXCLog.w("TXCVideoRender", "render frame count:" + this.H.f44066c + " block time:" + this.H.f44073j + "> 1000");
                }
            } else {
                j11 = 1;
            }
            if (this.H.f44077n != 0 && a11 > this.f44030c) {
                this.A += j11;
                this.B += a11;
            }
            long timeTick = TXCTimeUtil.getTimeTick();
            long j22 = this.f44052y;
            if (j22 == 0) {
                this.f44052y = timeTick;
            } else if (timeTick - j22 >= 2000) {
                setStatusValue(17015, this.f44037j, Long.valueOf(this.A));
                setStatusValue(17016, this.f44037j, Long.valueOf(this.B));
                if (this.C != 0) {
                    TXCKeyPointReportProxy.a(getID(), 40005, (int) this.f44053z, this.f44037j);
                    TXCKeyPointReportProxy.a(getID(), 40065, (int) this.B, this.f44037j);
                    TXCKeyPointReportProxy.a(getID(), 40006, (int) (timeTick - this.f44052y), this.f44037j);
                    setStatusValue(6012, this.f44037j, Long.valueOf(this.H.f44074k));
                }
                this.f44053z = 0L;
                this.A = 0L;
                this.B = 0L;
                this.f44052y = timeTick;
            }
            this.H.f44067d = TXCTimeUtil.getTimeTick();
            a aVar8 = this.H;
            long j23 = aVar8.f44067d;
            aVar8.f44077n = j23;
            if (this.C == 0) {
                this.C = j23;
            }
            aVar8.f44076m = this.f44036i;
            aVar8.f44075l = this.f44035h;
        }
    }

    public void a(TextureView textureView) {
        b(textureView);
    }

    public void a(Surface surface) {
        b(surface);
    }

    public void a(TXSVideoFrame tXSVideoFrame, int i11, int i12, int i13) {
        if (i13 != this.f44038k) {
            this.f44038k = i13;
            e(this.f44047t);
        }
        a(i11, i12);
        b();
    }

    public void a(int i11, int i12, int i13, boolean z11, int i14) {
        a(i12, i13);
    }

    public void a(boolean z11) {
        l();
        if (this.E) {
            Monitor.a(2, String.format("Remote-VideoRender[%d]: Stop [tinyID:%s][streamType:%d][stopRendThread:%s]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f44037j), z11 ? m.f74525c : "false"), "streamType: 2-big, 3-small, 7-sub", 0);
        }
        this.E = false;
        this.F = false;
        if (z11 && this.f44039l == 1) {
            this.f44039l = -1;
            TXCLog.w("TXCVideoRender", "play:vrender: quit render thread when stop");
            d();
            synchronized (this) {
                try {
                    if (this.f44044q != null) {
                        TXCLog.i("TXCVideoRender", "surface-render:stop render thread " + this.f44044q);
                        this.f44044q.a();
                        this.f44044q = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.D = true;
    }

    public void a(int i11, int i12) {
        int i13 = this.f44035h;
        if (i13 == i11 && this.f44036i == i12) {
            return;
        }
        if (i13 == i11 && this.f44036i == i12) {
            return;
        }
        this.f44035h = i11;
        this.f44036i = i12;
        d dVar = this.f44032e;
        if (dVar != null) {
            dVar.b(i11, i12);
        }
    }

    public void a(Object obj, int i11, float[] fArr, boolean z11) {
        if (this.f44039l == 1) {
            int[] a11 = a(i11, this.f44035h, this.f44036i, fArr, z11);
            int i12 = a11[0];
            int i13 = a11[1];
            int i14 = a11[2];
            System.arraycopy(a11, 0, this.f44050w, 0, 3);
            if (z11) {
                int[] iArr = this.f44050w;
                iArr[3] = 1;
                iArr[4] = 180;
            } else {
                int[] iArr2 = this.f44050w;
                iArr2[3] = 0;
                iArr2[4] = 0;
            }
            synchronized (this) {
                try {
                    Surface surface = this.f44046s;
                    if (surface != null) {
                        com.tencent.liteav.basic.c.d dVar = this.f44044q;
                        if (dVar != null) {
                            Surface b11 = dVar.b();
                            if (b11 == surface) {
                                if (b11 != null && !b11.isValid()) {
                                }
                            }
                            TXCLog.i("TXCVideoRender", "surface-render: onDrawTextureToSurface surface change stop render thread " + this.f44044q + j2.O + b11 + j2.O + surface);
                            this.f44044q.a();
                            this.f44044q = null;
                        }
                        if (this.f44044q == null && this.f44039l == 1 && surface.isValid()) {
                            this.f44044q = new com.tencent.liteav.basic.c.d();
                            TXCLog.i("TXCVideoRender", "surface-render: onDrawTextureToSurface start render thread " + this.f44044q + "," + surface);
                            this.f44044q.a(obj, surface);
                        }
                        if (this.f44044q != null && this.f44039l == 1) {
                            if (z11) {
                                this.f44044q.a(i12, true, 180, this.f44040m, this.f44041n, i13, i14, false, false);
                            } else {
                                this.f44044q.a(i12, false, 0, this.f44040m, this.f44041n, i13, i14, false, false);
                            }
                        }
                    } else if (this.f44044q != null) {
                        TXCLog.i("TXCVideoRender", "surface-render: onDrawTextureToSurface stop render thread " + this.f44044q);
                        this.f44044q.a();
                        this.f44044q = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private int[] a(int i11, int i12, int i13, float[] fArr, boolean z11) {
        h hVar = this.f44045r;
        if (hVar != null && hVar.a() != z11) {
            this.f44045r.c();
            this.f44045r = null;
        }
        if (this.f44045r == null) {
            h hVar2 = new h(Boolean.valueOf(z11));
            this.f44045r = hVar2;
            hVar2.b();
        }
        if (fArr != null) {
            this.f44045r.a(fArr);
        } else {
            this.f44045r.a(f44028a);
        }
        int i14 = this.f44040m;
        int i15 = this.f44041n;
        if (this.f44048u == 0) {
            this.f44045r.a(h.f44079a);
        } else {
            this.f44045r.a(h.f44080b);
        }
        if (this.f44049v == 1) {
            this.f44045r.a(true);
        } else {
            this.f44045r.a(false);
        }
        int i16 = this.f44047t;
        int i17 = this.f44038k;
        int i18 = (i16 + i17) % 360;
        if (z11 && (i16 == 90 || i16 == 270)) {
            i18 = ((i16 + i17) + 180) % 360;
        }
        this.f44045r.b(i18);
        this.f44045r.b(i12, i13);
        this.f44045r.a(i14, i15);
        return new int[]{this.f44045r.d(i11), i14, i15};
    }

    private long a(long j11) {
        long timeTick = TXCTimeUtil.getTimeTick();
        if (j11 > timeTick) {
            return 0L;
        }
        return timeTick - j11;
    }
}
