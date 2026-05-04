package qs;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f82681e = "Grafika";

    /* renamed from: a, reason: collision with root package name */
    public a f82682a;

    /* renamed from: b, reason: collision with root package name */
    public EGLSurface f82683b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c, reason: collision with root package name */
    public int f82684c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f82685d = -1;

    public b(a eglCore) {
        this.f82682a = eglCore;
    }

    public void a(int width, int height) {
        if (this.f82683b != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException("surface already created");
        }
        this.f82683b = this.f82682a.b(width, height);
        this.f82684c = width;
        this.f82685d = height;
    }

    public void b(Object surface) {
        if (this.f82683b != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException("surface already created");
        }
        this.f82683b = this.f82682a.c(surface);
    }

    public int c() {
        int i11 = this.f82685d;
        return i11 < 0 ? this.f82682a.l(this.f82683b, 12374) : i11;
    }

    public int d() {
        int i11 = this.f82684c;
        return i11 < 0 ? this.f82682a.l(this.f82683b, 12375) : i11;
    }

    public void e() {
        this.f82682a.h(this.f82683b);
    }

    public void f(b readSurface) {
        this.f82682a.i(this.f82683b, readSurface.f82683b);
    }

    public void g() {
        this.f82682a.n(this.f82683b);
        this.f82683b = EGL14.EGL_NO_SURFACE;
        this.f82685d = -1;
        this.f82684c = -1;
    }

    public void h(File file) throws IOException {
        Throwable th2;
        if (!this.f82682a.f(this.f82683b)) {
            throw new RuntimeException("Expected EGL context/surface is not current");
        }
        String file2 = file.toString();
        int d11 = d();
        int c11 = c();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(d11 * c11 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, d11, c11, 6408, com.badlogic.gdx.graphics.f.f11673u1, allocateDirect);
        d.a("glReadPixels");
        allocateDirect.rewind();
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                Bitmap createBitmap = Bitmap.createBitmap(d11, c11, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                createBitmap.compress(Bitmap.CompressFormat.PNG, 90, bufferedOutputStream2);
                createBitmap.recycle();
                bufferedOutputStream2.close();
                Log.d("Grafika", "Saved " + d11 + "x" + c11 + " frame as '" + file2 + "'");
            } catch (Throwable th3) {
                th2 = th3;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream == null) {
                    throw th2;
                }
                bufferedOutputStream.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public void i(long nsecs) {
        this.f82682a.o(this.f82683b, nsecs);
    }

    public boolean j() {
        boolean p11 = this.f82682a.p(this.f82683b);
        if (!p11) {
            Log.d("Grafika", "WARNING: swapBuffers() failed");
        }
        return p11;
    }
}
