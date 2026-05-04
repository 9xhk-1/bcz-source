package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends e implements SurfaceTexture.OnFrameAvailableListener {
    private c A;
    private TXSVideoFrame B;
    private TXCYuvTextureRender C;
    private h F;
    private TXCYuvTextureRender G;

    /* renamed from: a, reason: collision with root package name */
    g f43971a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0516a f43972b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC0516a f43973c;

    /* renamed from: v, reason: collision with root package name */
    private b f43979v;

    /* renamed from: w, reason: collision with root package name */
    private SurfaceTexture f43980w;

    /* renamed from: x, reason: collision with root package name */
    private c f43981x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f43982y;

    /* renamed from: q, reason: collision with root package name */
    private final int f43974q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final int f43975r = 0;

    /* renamed from: s, reason: collision with root package name */
    private final int f43976s = 0;

    /* renamed from: t, reason: collision with root package name */
    private final int f43977t = 0;

    /* renamed from: u, reason: collision with root package name */
    private Object f43978u = new Object();
    private Object D = null;
    private Object E = new Object();
    private final Queue<Runnable> H = new LinkedList();

    /* renamed from: z, reason: collision with root package name */
    private float[] f43983z = new float[16];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.renderer.a$a, reason: collision with other inner class name */
    public interface InterfaceC0516a {
        void onTextureProcess(int i11, int i12, int i13, int i14);
    }

    private boolean e(int i11, int i12) {
        TXSVideoFrame tXSVideoFrame;
        TXCYuvTextureRender tXCYuvTextureRender;
        int i13;
        c cVar;
        synchronized (this) {
            try {
                boolean z11 = this.f43982y;
                if (z11) {
                    this.f43982y = false;
                    tXSVideoFrame = null;
                } else {
                    TXSVideoFrame tXSVideoFrame2 = this.B;
                    if (tXSVideoFrame2 == null) {
                        return false;
                    }
                    this.B = null;
                    tXSVideoFrame = tXSVideoFrame2;
                    z11 = false;
                }
                if (i11 <= 0 || i12 <= 0) {
                    return false;
                }
                GLES20.glViewport(0, 0, i11, i12);
                Object b11 = this.f44039l == 1 ? b() : null;
                InterfaceC0516a interfaceC0516a = this.f43973c;
                if (z11) {
                    SurfaceTexture surfaceTexture = this.f43980w;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        this.f43980w.getTransformMatrix(this.f43983z);
                    }
                    g gVar = this.f43971a;
                    if (gVar != null) {
                        c cVar2 = this.f43981x;
                        if (cVar2 != null) {
                            gVar.a(cVar2.a(), this.f43983z);
                        }
                    } else if (this.f43981x != null) {
                        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
                        this.f43981x.a(this.f43980w);
                    }
                    if (interfaceC0516a != null) {
                        int a11 = this.f43981x.a();
                        if (this.F == null) {
                            h hVar = new h(Boolean.TRUE);
                            this.F = hVar;
                            hVar.b();
                            this.F.a(true);
                            this.F.b(180);
                            this.F.a(h.f44079a);
                        }
                        this.F.a(this.f43983z);
                        this.F.b(this.f44035h, this.f44036i);
                        this.F.a(this.f44035h, this.f44036i);
                        interfaceC0516a.onTextureProcess(this.F.d(a11), h(), i(), this.f44038k);
                    }
                    if (this.f44039l == 1 && (cVar = this.f43981x) != null) {
                        a(b11, cVar.a(), this.f43983z, true);
                    }
                } else if (tXSVideoFrame != null && (tXCYuvTextureRender = this.C) != null) {
                    if (this.f43972b != null) {
                        tXCYuvTextureRender.setHasFrameBuffer(this.f44035h, this.f44036i);
                        i13 = this.C.drawToTexture(tXSVideoFrame);
                        this.f43972b.onTextureProcess(i13, h(), i(), this.f44038k);
                    } else {
                        if (this.f44039l == 0) {
                            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
                            this.C.drawFrame(tXSVideoFrame);
                        }
                        i13 = -1;
                    }
                    if (this.f44039l == 1) {
                        if (i13 == -1) {
                            this.C.setHasFrameBuffer(this.f44035h, this.f44036i);
                            i13 = this.C.drawToTexture(tXSVideoFrame);
                        }
                        a(b11, i13, (float[]) null, false);
                    }
                    if (interfaceC0516a != null) {
                        if (this.G == null) {
                            TXCYuvTextureRender tXCYuvTextureRender2 = new TXCYuvTextureRender();
                            this.G = tXCYuvTextureRender2;
                            tXCYuvTextureRender2.createTexture();
                            this.G.flipVertical(false);
                        }
                        this.G.setHasFrameBuffer(this.f44035h, this.f44036i);
                        interfaceC0516a.onTextureProcess(this.G.drawToTexture(tXSVideoFrame), h(), i(), this.f44038k);
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p() {
        this.f43981x = new c(true);
        this.C = new TXCYuvTextureRender();
        this.A = new c(false);
    }

    public void a(g gVar) {
        this.f43971a = gVar;
    }

    public void b(InterfaceC0516a interfaceC0516a) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f43973c = interfaceC0516a;
        if (interfaceC0516a == null || (tXCYuvTextureRender = this.C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f44035h, this.f44036i);
    }

    public SurfaceTexture c() {
        TextureView textureView = this.f44031d;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    @Override // com.tencent.liteav.renderer.e
    public void d() {
        synchronized (this.f43978u) {
            try {
                b bVar = this.f43979v;
                if (bVar != null) {
                    bVar.b();
                    this.f43979v.c();
                    this.f43979v = null;
                    TXCLog.w("TXCVideoRender", "play:vrender: quit render thread id" + getID() + j2.O + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.basic.module.a
    public void finalize() throws Throwable {
        super.finalize();
        TXCLog.w("TXCVideoRender", "play:vrender: quit render thread when finalize");
        try {
            d();
        } catch (Exception e11) {
            TXCLog.e("TXCVideoRender", "quit render thread failed.", e11);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f43982y = true;
        }
        synchronized (this.f43978u) {
            try {
                b bVar = this.f43979v;
                if (bVar != null) {
                    bVar.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(InterfaceC0516a interfaceC0516a) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f43972b = interfaceC0516a;
        if (interfaceC0516a == null || (tXCYuvTextureRender = this.C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f44035h, this.f44036i);
    }

    @Override // com.tencent.liteav.renderer.e
    public void c(Object obj) {
        synchronized (this.f43978u) {
            try {
                if (this.f43979v == null) {
                    b bVar = new b(new WeakReference(this));
                    this.f43979v = bVar;
                    bVar.a(obj);
                    this.f43979v.start();
                    this.f43979v.c();
                    TXCLog.w("TXCVideoRender", "play:vrender: start render thread id " + getID() + ", glContext " + obj + j2.O + this);
                } else {
                    TXCLog.w("TXCVideoRender", "play:vrender: start render thread when running " + getID() + j2.O + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object b() {
        Object a11;
        synchronized (this.f43978u) {
            try {
                b bVar = this.f43979v;
                a11 = bVar != null ? bVar.a() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a11;
    }

    @Override // com.tencent.liteav.renderer.e
    public void a(TXSVideoFrame tXSVideoFrame, int i11, int i12, int i13) {
        synchronized (this) {
            try {
                TXSVideoFrame tXSVideoFrame2 = this.B;
                if (tXSVideoFrame2 != null) {
                    tXSVideoFrame2.release();
                }
                this.B = tXSVideoFrame;
            } finally {
            }
        }
        super.a(tXSVideoFrame, i11, i12, i13);
        synchronized (this.f43978u) {
            try {
                b bVar = this.f43979v;
                if (bVar != null) {
                    bVar.c();
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.liteav.renderer.e
    public void b(SurfaceTexture surfaceTexture) {
        super.b(surfaceTexture);
        TXCLog.w("TXCVideoRender", "play:vrender: quit render thread when onSurfaceRelease");
        d();
    }

    public void b(Object obj) {
        synchronized (this.E) {
            try {
                if (this.D != obj) {
                    TXCLog.w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender ignore when not the same gl thread " + this);
                    return;
                }
                this.D = null;
                TXCLog.w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender " + this);
                try {
                    f fVar = this.f44042o;
                    if (fVar != null) {
                        fVar.onSurfaceTextureDestroy(this.f43980w);
                    }
                } catch (Exception e11) {
                    TXCLog.e("TXCVideoRender", "callback failed.", e11);
                }
                c cVar = this.f43981x;
                if (cVar != null) {
                    cVar.c();
                    this.f43981x = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender = this.C;
                if (tXCYuvTextureRender != null) {
                    tXCYuvTextureRender.onSurfaceDestroy();
                    this.C = null;
                }
                c cVar2 = this.A;
                if (cVar2 != null) {
                    cVar2.c();
                    this.A = null;
                }
                this.f43980w = null;
                h hVar = this.F;
                if (hVar != null) {
                    hVar.c();
                    this.F = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.G;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.onSurfaceDestroy();
                    this.G = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.e
    public void a(int i11, int i12, int i13, boolean z11, int i14) {
        GLES20.glViewport(0, 0, f(), g());
        c cVar = this.A;
        if (cVar != null) {
            cVar.a(i11, z11, i14);
        }
        super.a(i11, i12, i13, z11, i14);
        synchronized (this.f43978u) {
            try {
                b bVar = this.f43979v;
                if (bVar != null) {
                    bVar.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.e
    public SurfaceTexture a() {
        return this.f43980w;
    }

    @Override // com.tencent.liteav.renderer.e
    public void a(SurfaceTexture surfaceTexture) {
        super.a(surfaceTexture);
        TXCLog.w("TXCVideoRender", "play:vrender: create render thread when onSurfaceCreate");
        c((Object) null);
    }

    @Override // com.tencent.liteav.renderer.e, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.liteav.renderer.e
    public void a(int i11, int i12) {
        super.a(i11, i12);
        TXCYuvTextureRender tXCYuvTextureRender = this.C;
        if (tXCYuvTextureRender != null) {
            tXCYuvTextureRender.setVideoSize(i11, i12);
        }
        c cVar = this.f43981x;
        if (cVar != null) {
            cVar.a(i11, i12);
        }
    }

    public void a(Object obj) {
        TXCYuvTextureRender tXCYuvTextureRender;
        synchronized (this.E) {
            try {
                this.D = obj;
                TXCLog.w("TXCVideoRender", "play:vrender: TXCGLRender initTextureRender " + this);
                p();
                d dVar = this.f44032e;
                if (dVar != null) {
                    dVar.a(this.f44033f, this.f44034g);
                    this.f44032e.b(this.f44035h, this.f44036i);
                }
                c cVar = this.f43981x;
                if (cVar != null) {
                    cVar.b();
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f43981x.a());
                    this.f43980w = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.C;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.createTexture();
                }
                if (this.f43972b != null && (tXCYuvTextureRender = this.C) != null) {
                    tXCYuvTextureRender.setHasFrameBuffer(this.f44035h, this.f44036i);
                }
                c cVar2 = this.A;
                if (cVar2 != null) {
                    cVar2.b();
                }
                f fVar = this.f44042o;
                if (fVar != null) {
                    fVar.onSurfaceTextureAvailable(this.f43980w);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b(int i11, int i12) {
        while (a(this.H)) {
        }
        return e(i11, i12);
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
}
