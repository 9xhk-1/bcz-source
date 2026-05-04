package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<a> f43984a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f43985b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f43986c = 1280;

    /* renamed from: d, reason: collision with root package name */
    private int f43987d = 720;

    /* renamed from: e, reason: collision with root package name */
    private final Semaphore f43988e = new Semaphore(0);

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.liteav.basic.c.b f43989f = null;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.basic.c.a f43990g = null;

    /* renamed from: h, reason: collision with root package name */
    private Object f43991h = null;

    public b(WeakReference<a> weakReference) {
        this.f43984a = weakReference;
    }

    private com.tencent.liteav.basic.util.d f() {
        com.tencent.liteav.basic.c.a aVar = this.f43990g;
        if (aVar != null) {
            return aVar.f();
        }
        com.tencent.liteav.basic.c.b bVar = this.f43989f;
        if (bVar != null) {
            return bVar.c();
        }
        com.tencent.liteav.basic.c.g.a("getSurfaceSize");
        return new com.tencent.liteav.basic.util.d(0, 0);
    }

    private void g() {
        try {
            a aVar = this.f43984a.get();
            if (aVar != null) {
                aVar.a(this);
            }
        } catch (Exception e11) {
            TXCLog.e("TXCVideoRenderThread", "init texture render failed.", e11);
        }
    }

    private void h() {
        try {
            a aVar = this.f43984a.get();
            if (aVar != null) {
                aVar.b(this);
            }
        } catch (Exception e11) {
            TXCLog.e("TXCVideoRenderThread", "destroy texture render failed", e11);
        }
    }

    private void i() {
        a aVar;
        WeakReference<a> weakReference = this.f43984a;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.j();
    }

    private void j() {
        a aVar;
        WeakReference<a> weakReference = this.f43984a;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.k();
    }

    private void k() {
        a aVar = this.f43984a.get();
        if (aVar == null) {
            return;
        }
        SurfaceTexture c11 = aVar.c();
        Surface surface = c11 != null ? new Surface(c11) : null;
        Object obj = this.f43991h;
        if (obj == null || (obj instanceof EGLContext)) {
            this.f43990g = com.tencent.liteav.basic.c.a.a(null, (EGLContext) obj, surface, this.f43986c, this.f43987d);
        } else {
            this.f43989f = com.tencent.liteav.basic.c.b.a(null, (android.opengl.EGLContext) obj, surface, this.f43986c, this.f43987d);
        }
        TXCLog.w("TXCVideoRenderThread", "vrender: init egl share context " + this.f43991h + ", create context" + a());
        e();
    }

    private void l() {
        TXCLog.w("TXCVideoRenderThread", "vrender: uninit egl " + a());
        com.tencent.liteav.basic.c.a aVar = this.f43990g;
        if (aVar != null) {
            aVar.c();
            this.f43990g = null;
        }
        com.tencent.liteav.basic.c.b bVar = this.f43989f;
        if (bVar != null) {
            bVar.d();
            this.f43989f = null;
        }
    }

    public void a(Object obj) {
        this.f43991h = obj;
    }

    public void b() {
        this.f43985b = false;
        c();
    }

    public void c() {
        this.f43988e.release();
    }

    public void d() {
        com.tencent.liteav.basic.c.a aVar = this.f43990g;
        if (aVar != null) {
            aVar.a();
        }
        com.tencent.liteav.basic.c.b bVar = this.f43989f;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void e() {
        com.tencent.liteav.basic.c.a aVar = this.f43990g;
        if (aVar != null) {
            aVar.b();
        }
        com.tencent.liteav.basic.c.b bVar = this.f43989f;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("VRender-" + getId());
        try {
            this.f43985b = true;
            k();
            g();
            i();
            while (this.f43985b) {
                com.tencent.liteav.basic.util.d f11 = f();
                if (a(f11.f43435a, f11.f43436b)) {
                    WeakReference<a> weakReference = this.f43984a;
                    a aVar = weakReference == null ? null : weakReference.get();
                    if (aVar != null && aVar.c() != null) {
                        d();
                    }
                }
                while (this.f43985b && !this.f43988e.tryAcquire(500L, TimeUnit.MILLISECONDS)) {
                }
            }
            j();
            h();
            l();
        } catch (Exception e11) {
            TXCLog.e("TXCVideoRenderThread", "render failed.", e11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Object a() {
        com.tencent.liteav.basic.c.a aVar = this.f43990g;
        if (aVar != null) {
            return aVar.d();
        }
        com.tencent.liteav.basic.c.b bVar = this.f43989f;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    private boolean a(int i11, int i12) {
        a aVar;
        try {
            WeakReference<a> weakReference = this.f43984a;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return false;
            }
            return aVar.b(i11, i12);
        } catch (Exception e11) {
            TXCLog.e("TXCVideoRenderThread", "drawFrame failed." + e11.getMessage());
            return false;
        }
    }
}
