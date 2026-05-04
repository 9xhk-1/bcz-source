package qs;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f82673e = "Grafika";

    /* renamed from: f, reason: collision with root package name */
    public static final int f82674f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f82675g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f82676h = 12610;

    /* renamed from: a, reason: collision with root package name */
    public EGLDisplay f82677a;

    /* renamed from: b, reason: collision with root package name */
    public EGLContext f82678b;

    /* renamed from: c, reason: collision with root package name */
    public EGLConfig f82679c;

    /* renamed from: d, reason: collision with root package name */
    public int f82680d;

    public a() {
        this(null, 0);
    }

    public static void g(String msg) {
        Log.i("Grafika", "Current EGL (" + msg + "): display=" + EGL14.eglGetCurrentDisplay() + ", context=" + EGL14.eglGetCurrentContext() + ", surface=" + EGL14.eglGetCurrentSurface(12377));
    }

    public final void a(String msg) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(msg + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public EGLSurface b(int width, int height) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f82677a, this.f82679c, new int[]{12375, width, 12374, height, 12344}, 0);
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public EGLSurface c(Object surface) {
        if (!(surface instanceof Surface) && !(surface instanceof SurfaceTexture)) {
            throw new RuntimeException("invalid surface: " + surface);
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f82677a, this.f82679c, surface, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public final EGLConfig d(int flags, int version) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, version >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((flags & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f82677a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        Log.w("Grafika", "unable to find RGB8888 / " + version + " EGLConfig");
        return null;
    }

    public int e() {
        return this.f82680d;
    }

    public boolean f(EGLSurface eglSurface) {
        return this.f82678b.equals(EGL14.eglGetCurrentContext()) && eglSurface.equals(EGL14.eglGetCurrentSurface(12377));
    }

    public void finalize() throws Throwable {
        try {
            if (this.f82677a != EGL14.EGL_NO_DISPLAY) {
                Log.w("Grafika", "WARNING: EglCore was not explicitly released -- state may be leaked");
                m();
            }
        } finally {
            super.finalize();
        }
    }

    public void h(EGLSurface eglSurface) {
        if (this.f82677a == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f82677a, eglSurface, eglSurface, this.f82678b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void i(EGLSurface drawSurface, EGLSurface readSurface) {
        if (this.f82677a == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f82677a, drawSurface, readSurface, this.f82678b)) {
            throw new RuntimeException("eglMakeCurrent(draw,read) failed");
        }
    }

    public void j() {
        EGLDisplay eGLDisplay = this.f82677a;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public String k(int what) {
        return EGL14.eglQueryString(this.f82677a, what);
    }

    public int l(EGLSurface eglSurface, int what) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f82677a, eglSurface, what, iArr, 0);
        return iArr[0];
    }

    public void m() {
        EGLDisplay eGLDisplay = this.f82677a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f82677a, this.f82678b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f82677a);
        }
        this.f82677a = EGL14.EGL_NO_DISPLAY;
        this.f82678b = EGL14.EGL_NO_CONTEXT;
        this.f82679c = null;
    }

    public void n(EGLSurface eglSurface) {
        EGL14.eglDestroySurface(this.f82677a, eglSurface);
    }

    public void o(EGLSurface eglSurface, long nsecs) {
        EGLExt.eglPresentationTimeANDROID(this.f82677a, eglSurface, nsecs);
    }

    public boolean p(EGLSurface eglSurface) {
        return EGL14.eglSwapBuffers(this.f82677a, eglSurface);
    }

    public a(EGLContext sharedContext, int flags) {
        EGLConfig d11;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f82677a = eGLDisplay;
        this.f82678b = EGL14.EGL_NO_CONTEXT;
        this.f82679c = null;
        this.f82680d = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("EGL already set up");
        }
        sharedContext = sharedContext == null ? EGL14.EGL_NO_CONTEXT : sharedContext;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f82677a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.f82677a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        if ((flags & 2) != 0 && (d11 = d(flags, 3)) != null) {
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f82677a, d11, sharedContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f82679c = d11;
                this.f82678b = eglCreateContext;
                this.f82680d = 3;
            }
        }
        if (this.f82678b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig d12 = d(flags, 2);
            if (d12 == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.f82677a, d12, sharedContext, new int[]{12440, 2, 12344}, 0);
            a("eglCreateContext");
            this.f82679c = d12;
            this.f82678b = eglCreateContext2;
            this.f82680d = 2;
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f82677a, this.f82678b, 12440, iArr2, 0);
        Log.d("Grafika", "EGLContext created, client version " + iArr2[0]);
    }
}
