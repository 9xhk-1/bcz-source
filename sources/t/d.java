package t;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.zxing.h;
import java.io.IOException;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final String f89075n = "CameraManager";

    /* renamed from: a, reason: collision with root package name */
    public int f89076a;

    /* renamed from: b, reason: collision with root package name */
    public int f89077b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f89078c;

    /* renamed from: d, reason: collision with root package name */
    public final c f89079d;

    /* renamed from: e, reason: collision with root package name */
    public Camera f89080e;

    /* renamed from: f, reason: collision with root package name */
    public a f89081f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f89082g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f89083h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f89084i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f89085j;

    /* renamed from: k, reason: collision with root package name */
    public int f89086k;

    /* renamed from: l, reason: collision with root package name */
    public int f89087l;

    /* renamed from: m, reason: collision with root package name */
    public final f f89088m;

    public d(Context context) {
        this.f89078c = context;
        this.f89076a = i.a(context, 120.0f);
        this.f89077b = i.a(context, 300.0f);
        c cVar = new c(context);
        this.f89079d = cVar;
        this.f89088m = new f(cVar);
    }

    public static int c(int resolution, int hardMin, int hardMax) {
        int i11 = (resolution * 5) / 8;
        return i11 < hardMin ? hardMin : i11 > hardMax ? hardMax : i11;
    }

    public h a(byte[] data, int width, int height) {
        Rect e11 = e();
        if (e11 == null) {
            return null;
        }
        return new h(data, width, height, e11.left, e11.top, e11.width(), e11.height(), false);
    }

    public synchronized void b() {
        Camera camera = this.f89080e;
        if (camera != null) {
            camera.release();
            this.f89080e = null;
            this.f89082g = null;
            this.f89083h = null;
        }
    }

    public synchronized Rect d() {
        try {
            if (this.f89082g == null) {
                if (this.f89080e == null) {
                    return null;
                }
                Point f11 = this.f89079d.f();
                if (f11 == null) {
                    return null;
                }
                int c11 = c(f11.x, this.f89076a, this.f89077b);
                int i11 = (f11.x - c11) / 2;
                int i12 = (f11.y - c11) / 2;
                this.f89082g = new Rect(i11, i12, i11 + c11, c11 + i12);
                qb.c.b(f89075n, "Calculated framing rect: " + this.f89082g, new Object[0]);
            }
            return this.f89082g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Rect e() {
        if (this.f89083h == null) {
            Rect d11 = d();
            if (d11 == null) {
                return null;
            }
            Rect rect = new Rect(d11);
            Point d12 = this.f89079d.d();
            Point f11 = this.f89079d.f();
            if (d12 != null && f11 != null) {
                int i11 = rect.left;
                int i12 = d12.y;
                int i13 = f11.x;
                rect.left = (i11 * i12) / i13;
                rect.right = (rect.right * i12) / i13;
                int i14 = rect.top;
                int i15 = d12.x;
                int i16 = f11.y;
                rect.top = (i14 * i15) / i16;
                rect.bottom = (rect.bottom * i15) / i16;
                this.f89083h = rect;
                qb.c.b(f89075n, "Calculated framingRectInPreview rect: " + this.f89083h, new Object[0]);
                qb.c.b(f89075n, "cameraResolution: " + d12, new Object[0]);
                qb.c.b(f89075n, "screenResolution: " + f11, new Object[0]);
            }
            return null;
        }
        return this.f89083h;
    }

    public synchronized boolean f() {
        return this.f89080e != null;
    }

    public synchronized void g(SurfaceHolder holder) throws IOException {
        int i11;
        try {
            Camera camera = this.f89080e;
            if (camera == null) {
                camera = e.a();
                if (camera == null) {
                    throw new IOException();
                }
                this.f89080e = camera;
            }
            camera.setPreviewDisplay(holder);
            if (!this.f89084i) {
                this.f89084i = true;
                this.f89079d.h(camera);
                int i12 = this.f89086k;
                if (i12 > 0 && (i11 = this.f89087l) > 0) {
                    j(i12, i11);
                    this.f89086k = 0;
                    this.f89087l = 0;
                }
            }
            Camera.Parameters parameters = camera.getParameters();
            String flatten = parameters == null ? null : parameters.flatten();
            try {
                this.f89079d.j(camera, false);
            } catch (RuntimeException unused) {
                qb.c.q(f89075n, "Camera rejected parameters. Setting only minimal safe-mode parameters", new Object[0]);
                qb.c.i(f89075n, "Resetting to saved camera params: " + flatten, new Object[0]);
                if (flatten != null) {
                    Camera.Parameters parameters2 = camera.getParameters();
                    parameters2.unflatten(flatten);
                    try {
                        camera.setParameters(parameters2);
                        this.f89079d.j(camera, true);
                    } catch (RuntimeException unused2) {
                        qb.c.q(f89075n, "Camera rejected even safe-mode parameters! No configuration", new Object[0]);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(Handler handler, int message) {
        Camera camera = this.f89080e;
        if (camera != null && this.f89085j) {
            this.f89088m.a(handler, message);
            camera.setOneShotPreviewCallback(this.f89088m);
        }
    }

    public void i(int scale) {
        Camera camera = this.f89080e;
        if (camera == null || !camera.getParameters().isZoomSupported() || scale > this.f89080e.getParameters().getMaxZoom() || scale < 0) {
            return;
        }
        Camera.Parameters parameters = this.f89080e.getParameters();
        parameters.setZoom(scale);
        this.f89080e.setParameters(parameters);
    }

    public synchronized void j(int width, int height) {
        try {
            if (this.f89084i) {
                Point f11 = this.f89079d.f();
                int i11 = f11.x;
                if (width > i11) {
                    width = i11;
                }
                int i12 = f11.y;
                if (height > i12) {
                    height = i12;
                }
                int i13 = (i11 - width) / 2;
                int i14 = (i12 - height) / 2;
                this.f89082g = new Rect(i13, i14, width + i13, height + i14);
                qb.c.b(f89075n, "Calculated manual framing rect: " + this.f89082g, new Object[0]);
                this.f89083h = null;
            } else {
                this.f89086k = width;
                this.f89087l = height;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k(boolean newSetting) {
        try {
            if (newSetting != this.f89079d.g(this.f89080e) && this.f89080e != null) {
                a aVar = this.f89081f;
                if (aVar != null) {
                    aVar.c();
                }
                this.f89079d.k(this.f89080e, newSetting);
                a aVar2 = this.f89081f;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void l() {
        Camera camera = this.f89080e;
        if (camera != null && !this.f89085j) {
            camera.startPreview();
            this.f89085j = true;
            this.f89081f = new a(this.f89078c, this.f89080e);
        }
    }

    public synchronized void m() {
        try {
            a aVar = this.f89081f;
            if (aVar != null) {
                aVar.c();
                this.f89081f = null;
            }
            Camera camera = this.f89080e;
            if (camera != null && this.f89085j) {
                camera.stopPreview();
                this.f89088m.a(null, 0);
                this.f89085j = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void n() {
        Camera camera = this.f89080e;
        if (camera == null || !camera.getParameters().isZoomSupported()) {
            return;
        }
        Camera.Parameters parameters = this.f89080e.getParameters();
        if (parameters.getZoom() >= parameters.getMaxZoom()) {
            return;
        }
        parameters.setZoom(parameters.getZoom() + 1);
        this.f89080e.setParameters(parameters);
    }

    public void o() {
        Camera camera = this.f89080e;
        if (camera == null || !camera.getParameters().isZoomSupported()) {
            return;
        }
        Camera.Parameters parameters = this.f89080e.getParameters();
        if (parameters.getZoom() <= 0) {
            return;
        }
        parameters.setZoom(parameters.getZoom() - 1);
        this.f89080e.setParameters(parameters);
    }
}
