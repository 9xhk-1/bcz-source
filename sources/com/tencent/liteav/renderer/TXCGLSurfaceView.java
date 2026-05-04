package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.heytap.mcssdk.constant.MessageConstant;
import com.tencent.liteav.basic.c.i;
import com.tencent.liteav.basic.c.j;
import com.tencent.liteav.basic.c.k;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCGLSurfaceView extends TXCGLSurfaceViewBase implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {
    private k A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private j F;
    private long G;
    private byte[] H;
    private long I;
    private int J;
    private int K;
    private final Queue<Runnable> L;

    /* renamed from: a, reason: collision with root package name */
    WeakReference<com.tencent.liteav.basic.b.b> f43878a;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f43879g;

    /* renamed from: h, reason: collision with root package name */
    private EGLContext f43880h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.liteav.basic.c.f f43881i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f43882j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f43883k;

    /* renamed from: l, reason: collision with root package name */
    private int f43884l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43885m;

    /* renamed from: n, reason: collision with root package name */
    private float f43886n;

    /* renamed from: o, reason: collision with root package name */
    private float f43887o;

    /* renamed from: p, reason: collision with root package name */
    private int f43888p;

    /* renamed from: q, reason: collision with root package name */
    private long f43889q;

    /* renamed from: r, reason: collision with root package name */
    private long f43890r;

    /* renamed from: s, reason: collision with root package name */
    private int f43891s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f43892t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43893u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43894v;

    /* renamed from: w, reason: collision with root package name */
    private Handler f43895w;

    /* renamed from: x, reason: collision with root package name */
    private int f43896x;

    /* renamed from: y, reason: collision with root package name */
    private int f43897y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f43898z;

    public TXCGLSurfaceView(Context context) {
        super(context);
        this.f43883k = new float[16];
        this.f43884l = 0;
        this.f43885m = false;
        this.f43886n = 1.0f;
        this.f43887o = 1.0f;
        this.f43888p = 20;
        this.f43889q = 0L;
        this.f43890r = 0L;
        this.f43891s = MessageConstant.CommandId.COMMAND_BASE;
        this.f43892t = true;
        this.f43893u = false;
        this.f43894v = new Object();
        this.f43896x = 0;
        this.f43897y = 0;
        this.f43898z = true;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.D = true;
        this.E = true;
        this.H = null;
        this.I = 0L;
        this.J = 0;
        this.K = 0;
        this.L = new LinkedList();
        setEGLContextClientVersion(2);
        a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    private void e() {
        if (!this.E) {
            SurfaceTexture surfaceTexture = this.f43879g;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
                return;
            }
            return;
        }
        if (this.f43879g != null) {
            if (this.f43895w == null) {
                HandlerThread handlerThread = new HandlerThread("VideoCaptureThread");
                handlerThread.start();
                this.f43895w = new Handler(handlerThread.getLooper());
            }
            this.f43879g.setOnFrameAvailableListener(this, this.f43895w);
        }
    }

    public EGLContext getGLContext() {
        return this.f43880h;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.f43879g;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f43895w;
        if (handler != null) {
            handler.getLooper().quitSafely();
            this.f43895w = null;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        long currentTimeMillis;
        long j11;
        boolean z11;
        byte[] bArr;
        boolean z12;
        boolean z13;
        int c11;
        a(this.L);
        boolean z14 = true;
        while (true) {
            currentTimeMillis = System.currentTimeMillis();
            long j12 = this.f43890r;
            if (j12 == 0 || currentTimeMillis < j12) {
                this.f43890r = currentTimeMillis;
            }
            j11 = this.f43890r;
            if (currentTimeMillis - j11 >= (this.f43889q * 1000) / this.f43888p) {
                break;
            }
            a(15L);
            z14 = false;
        }
        if (currentTimeMillis - j11 > 1000) {
            this.f43889q = 1L;
            this.f43890r = System.currentTimeMillis();
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f43892t) {
            return;
        }
        try {
            synchronized (this) {
                try {
                    bArr = null;
                    if (this.f43893u) {
                        byte[] bArr2 = this.H;
                        if (bArr2 != null) {
                            this.H = null;
                            SurfaceTexture surfaceTexture = this.f43879g;
                            if (surfaceTexture != null) {
                                surfaceTexture.updateTexImage();
                                this.f43879g.getTransformMatrix(this.f43883k);
                            }
                            bArr = bArr2;
                        } else {
                            SurfaceTexture surfaceTexture2 = this.f43879g;
                            if (surfaceTexture2 != null) {
                                surfaceTexture2.updateTexImage();
                                this.f43879g.getTransformMatrix(this.f43883k);
                            }
                        }
                        if (z11) {
                            this.f43889q = 1L;
                        } else {
                            this.f43889q++;
                        }
                        this.f43893u = false;
                        z14 = false;
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } finally {
                }
            }
            if (true == z12) {
                if (true == z14) {
                    a(5L);
                    return;
                }
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 > this.I + 1000.0d) {
                this.J = ((int) ((this.K * 1000.0d) / (currentTimeMillis2 - r7))) + 1;
                this.I = currentTimeMillis2;
                this.K = 0;
            }
            this.K++;
            j jVar = this.F;
            if (jVar != null) {
                if (bArr != null) {
                    jVar.a(bArr, this.f43883k);
                } else {
                    jVar.a(this.f43882j[0], this.f43883k);
                }
            }
            synchronized (this) {
                z13 = this.f43908c;
            }
            if (z13 || (c11 = c()) == 12288 || System.currentTimeMillis() - this.G <= 2000) {
                return;
            }
            TXCLog.w("TXCGLSurfaceView", "background capture swapBuffer error : " + c11);
            this.G = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putInt("EVT_PARAM1", c11);
            bundle.putInt("EVT_ID", 2110);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to render video");
            com.tencent.liteav.basic.util.h.a(this.f43878a, 2110, bundle);
        } catch (Exception e11) {
            TXCLog.e("TXCGLSurfaceView", "onDrawFrame failed", e11);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f43892t = false;
        synchronized (this) {
            this.f43893u = true;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f43880h = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.f43882j = new int[]{com.tencent.liteav.basic.c.g.a()};
        if (this.f43882j[0] <= 0) {
            this.f43882j = null;
            TXCLog.e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
            return;
        }
        this.f43879g = new SurfaceTexture(this.f43882j[0]);
        e();
        com.tencent.liteav.basic.c.f fVar = new com.tencent.liteav.basic.c.f();
        this.f43881i = fVar;
        if (fVar.a()) {
            this.f43881i.a(i.f43240e, i.a(com.tencent.liteav.basic.c.h.NORMAL, false, false));
            j jVar = this.F;
            if (jVar != null) {
                jVar.a(this.f43879g);
            }
        }
    }

    public void setFPS(final int i11) {
        a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.f43888p = i11;
                if (TXCGLSurfaceView.this.f43888p <= 0) {
                    TXCGLSurfaceView.this.f43888p = 1;
                } else if (TXCGLSurfaceView.this.f43888p > 60) {
                    TXCGLSurfaceView.this.f43888p = 60;
                }
                TXCGLSurfaceView.this.f43890r = 0L;
                TXCGLSurfaceView.this.f43889q = 0L;
            }
        });
    }

    public void setNotifyListener(com.tencent.liteav.basic.b.b bVar) {
        this.f43878a = new WeakReference<>(bVar);
    }

    public void setRendMirror(final int i11) {
        a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.C = i11;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    public void setRendMode(final int i11) {
        a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.B = i11;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    public void setRunInBackground(boolean z11) {
        if (!z11) {
            a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        TXCLog.i("TXCGLSurfaceView", "background capture exit background");
                        TXCGLSurfaceView.this.f43908c = false;
                    }
                }
            });
            return;
        }
        synchronized (this) {
            TXCLog.i("TXCGLSurfaceView", "background capture enter background");
            this.f43908c = true;
        }
    }

    public void setSurfaceTextureListener(j jVar) {
        this.F = jVar;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    public int b() {
        if (this.f43891s != 12288) {
            TXCLog.e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.f43891s);
        }
        return this.f43891s;
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    public void a() {
        TXCLog.i("TXCGLSurfaceView", "onSurfaceDestroyed-->enter with mSurfaceTextureListener:" + this.F);
        j jVar = this.F;
        if (jVar != null) {
            jVar.b(this.f43879g);
        }
        SurfaceTexture surfaceTexture = this.f43879g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f43879g = null;
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.L) {
            this.L.add(runnable);
        }
    }

    private boolean a(Queue<Runnable> queue) {
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return false;
                }
                Runnable poll = queue.poll();
                if (poll == null) {
                    return false;
                }
                poll.run();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception unused) {
        }
    }

    public TXCGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43883k = new float[16];
        this.f43884l = 0;
        this.f43885m = false;
        this.f43886n = 1.0f;
        this.f43887o = 1.0f;
        this.f43888p = 20;
        this.f43889q = 0L;
        this.f43890r = 0L;
        this.f43891s = MessageConstant.CommandId.COMMAND_BASE;
        this.f43892t = true;
        this.f43893u = false;
        this.f43894v = new Object();
        this.f43896x = 0;
        this.f43897y = 0;
        this.f43898z = true;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.D = true;
        this.E = true;
        this.H = null;
        this.I = 0L;
        this.J = 0;
        this.K = 0;
        this.L = new LinkedList();
        setEGLContextClientVersion(2);
        a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
    }
}
