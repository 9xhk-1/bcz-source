package com.tencent.liteav.basic.c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.c.e;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class d implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private volatile HandlerThread f43152a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile e f43153b = null;

    /* renamed from: c, reason: collision with root package name */
    private f f43154c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f43155d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43156e = false;

    /* renamed from: f, reason: collision with root package name */
    private float f43157f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f43158g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f43159h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f43160i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f43161j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f43162k = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43163l = false;

    /* renamed from: m, reason: collision with root package name */
    private k f43164m = null;

    /* renamed from: n, reason: collision with root package name */
    private boolean f43165n = false;

    private void f() {
        synchronized (this) {
            try {
                if (this.f43153b != null) {
                    e.a(this.f43153b, this.f43152a);
                    TXCLog.w("TXGLSurfaceRenderThread", "surface-render: destroy gl thread");
                }
                this.f43153b = null;
                this.f43152a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Surface b() {
        Surface a11;
        synchronized (this) {
            try {
                a11 = this.f43153b != null ? this.f43153b.a() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a11;
    }

    @Override // com.tencent.liteav.basic.c.e.a
    public void c() {
        f fVar = new f();
        this.f43154c = fVar;
        if (fVar.a()) {
            this.f43154c.a(i.f43240e, i.a(h.NORMAL, false, false));
        }
    }

    @Override // com.tencent.liteav.basic.c.e.a
    public void e() {
        f fVar = this.f43154c;
        if (fVar != null) {
            fVar.d();
            this.f43154c = null;
        }
    }

    public void a(Object obj, Surface surface) {
        TXCLog.i("TXGLSurfaceRenderThread", "surface-render: surface render start " + surface + j2.O + this);
        b(obj, surface);
    }

    private void b(Object obj, Surface surface) {
        f();
        synchronized (this) {
            try {
                this.f43152a = new HandlerThread("TXGLSurfaceRenderThread");
                this.f43152a.start();
                this.f43153b = new e(this.f43152a.getLooper());
                this.f43153b.a(this);
                if (obj != null && !(obj instanceof EGLContext)) {
                    this.f43153b.f43185d = true;
                    this.f43153b.f43187f = (android.opengl.EGLContext) obj;
                    this.f43153b.f43184c = surface;
                    TXCLog.w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.f43152a.getName());
                }
                this.f43153b.f43185d = false;
                this.f43153b.f43189h = (EGLContext) obj;
                this.f43153b.f43184c = surface;
                TXCLog.w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.f43152a.getName());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(100);
    }

    public void a() {
        TXCLog.i("TXGLSurfaceRenderThread", "surface-render: surface render stop " + this);
        f();
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f43153b != null) {
                    this.f43153b.post(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(final int i11, final boolean z11, final int i12, final int i13, final int i14, final int i15, final int i16, final boolean z12, final boolean z13) {
        GLES20.glFinish();
        synchronized (this) {
            try {
                if (this.f43153b != null) {
                    this.f43153b.post(new Runnable() { // from class: com.tencent.liteav.basic.c.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                d.this.b(i11, z11, i12, i13, i14, i15, i16, z12, z13);
                            } catch (Exception e11) {
                                TXCLog.e("TXGLSurfaceRenderThread", "surface-render: render texture error occurred!" + e11.getMessage());
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(k kVar) {
        this.f43164m = kVar;
        this.f43163l = true;
    }

    private void a(int i11) {
        synchronized (this) {
            try {
                if (this.f43153b != null) {
                    this.f43153b.sendEmptyMessage(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.basic.c.e.a
    public void d() {
    }

    private int[] a(int i11, int i12, int i13, int i14) {
        int i15;
        float f11 = i12;
        float f12 = i11;
        float f13 = i14 / i13;
        int i16 = 0;
        if (f11 / f12 > f13) {
            int i17 = (int) (f12 * f13);
            i15 = (i12 - i17) / 2;
            i12 = i17;
        } else {
            int i18 = (int) (f11 / f13);
            i16 = (i11 - i18) / 2;
            i11 = i18;
            i15 = 0;
        }
        return new int[]{i11, i12, i16, i15};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r20, boolean r21, int r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.c.d.b(int, boolean, int, int, int, int, int, boolean, boolean):void");
    }

    private void a(int i11, int i12) {
        d dVar;
        int i13;
        int i14;
        int i15;
        if (this.f43163l) {
            int i16 = this.f43161j;
            if (i16 != 0 && (i13 = this.f43162k) != 0) {
                boolean z11 = i16 <= i13;
                int i17 = i13 >= i16 ? i13 : i16;
                if (i13 < i16) {
                    i16 = i13;
                }
                if (z11) {
                    i15 = i16;
                    i14 = i17;
                } else {
                    i14 = i16;
                    i15 = i17;
                }
                final ByteBuffer allocate = ByteBuffer.allocate(i15 * i14 * 4);
                final Bitmap createBitmap = Bitmap.createBitmap(i15, i14, Bitmap.Config.ARGB_8888);
                allocate.position(0);
                GLES20.glReadPixels(i11, i12, i15, i14, 6408, com.badlogic.gdx.graphics.f.f11673u1, allocate);
                final k kVar = this.f43164m;
                if (kVar != null) {
                    dVar = this;
                    final int i18 = i15;
                    final int i19 = i14;
                    new Thread(new Runnable() { // from class: com.tencent.liteav.basic.c.d.2
                        @Override // java.lang.Runnable
                        public void run() {
                            allocate.position(0);
                            createBitmap.copyPixelsFromBuffer(allocate);
                            Matrix matrix = new Matrix();
                            matrix.setScale(1.0f, -1.0f);
                            kVar.a(Bitmap.createBitmap(createBitmap, 0, 0, i18, i19, matrix, false));
                            createBitmap.recycle();
                        }
                    }).start();
                    dVar.f43164m = null;
                    dVar.f43163l = false;
                }
            }
            dVar = this;
            dVar.f43164m = null;
            dVar.f43163l = false;
        }
    }
}
