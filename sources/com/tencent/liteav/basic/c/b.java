package com.tencent.liteav.basic.c;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(17)
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f43140a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static final String f43141b = "b";

    /* renamed from: k, reason: collision with root package name */
    private static int[] f43142k;

    /* renamed from: l, reason: collision with root package name */
    private static int[] f43143l;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43149h;

    /* renamed from: i, reason: collision with root package name */
    private EGLSurface f43150i;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f43144c = EGL14.EGL_NO_DISPLAY;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f43145d = EGL14.EGL_NO_CONTEXT;

    /* renamed from: e, reason: collision with root package name */
    private EGLConfig f43146e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f43147f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f43148g = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f43151j = -1;

    static {
        int i11 = f43140a;
        f43142k = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i11 == 2 ? 4 : 68, qs.a.f82676h, 1, 12344};
        f43143l = new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i11 == 2 ? 4 : 68, qs.a.f82676h, 1, 12344};
    }

    public static b a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i11, int i12) {
        b bVar = new b();
        bVar.f43147f = i11;
        bVar.f43148g = i12;
        if (bVar.a(eGLConfig, eGLContext, surface)) {
            return bVar;
        }
        return null;
    }

    private static void g() throws c {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new c(eglGetError);
        }
    }

    public void b() {
        if (this.f43144c == EGL14.EGL_NO_DISPLAY) {
            Log.d(f43141b, "NOTE: makeCurrent w/o display");
        }
        EGLDisplay eGLDisplay = this.f43144c;
        EGLSurface eGLSurface = this.f43150i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f43145d)) {
            return;
        }
        TXCLog.e(f43141b, "eglMakeCurrent failed");
    }

    public com.tencent.liteav.basic.util.d c() {
        int[] iArr = new int[2];
        return (EGL14.eglQuerySurface(this.f43144c, this.f43150i, 12375, iArr, 0) && EGL14.eglQuerySurface(this.f43144c, this.f43150i, 12374, iArr, 1)) ? new com.tencent.liteav.basic.util.d(iArr[0], iArr[1]) : new com.tencent.liteav.basic.util.d(0, 0);
    }

    public void d() {
        EGLDisplay eGLDisplay = this.f43144c;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f43144c, this.f43150i);
            EGL14.eglDestroyContext(this.f43144c, this.f43145d);
            this.f43145d = EGL14.EGL_NO_CONTEXT;
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f43144c);
        }
        this.f43144c = EGL14.EGL_NO_DISPLAY;
    }

    public boolean e() {
        return EGL14.eglSwapBuffers(this.f43144c, this.f43150i);
    }

    public EGLContext f() {
        return this.f43145d;
    }

    public void a() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            TXCLog.e(f43141b, "EGL error:" + eglGetError);
        }
    }

    private boolean a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGLContext eGLContext2;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f43144c = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            TXCLog.e(f43141b, "unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f43144c, iArr, 0, iArr, 1)) {
            this.f43144c = null;
            TXCLog.e(f43141b, "unable to initialize EGL14");
        }
        if (eGLConfig != null) {
            this.f43146e = eGLConfig;
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.f43144c, surface == null ? f43143l : f43142k, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return false;
            }
            this.f43146e = eGLConfigArr[0];
        }
        if (eGLContext != null) {
            this.f43149h = true;
            eGLContext2 = eGLContext;
        } else {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        }
        try {
            this.f43145d = a(this.f43144c, this.f43146e, 2, eGLContext2);
        } catch (c unused) {
            TXCLog.i(f43141b, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f43145d = a(this.f43144c, this.f43146e, 3, eGLContext2);
            } catch (c e11) {
                TXCLog.e(f43141b, "failed to create EGLContext of 3.0. " + e11);
                return false;
            }
        }
        int[] iArr2 = {12344};
        if (surface == null) {
            this.f43150i = EGL14.eglCreatePbufferSurface(this.f43144c, this.f43146e, new int[]{12375, this.f43147f, 12374, this.f43148g, 12344}, 0);
        } else {
            this.f43150i = EGL14.eglCreateWindowSurface(this.f43144c, this.f43146e, surface, iArr2, 0);
        }
        a();
        EGLDisplay eGLDisplay = this.f43144c;
        EGLSurface eGLSurface = this.f43150i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f43145d)) {
            return true;
        }
        a();
        return false;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, EGLContext eGLContext) throws c {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i11, 12344}, 0);
        g();
        return eglCreateContext;
    }

    public void a(long j11) {
        EGLExt.eglPresentationTimeANDROID(this.f43144c, this.f43150i, j11);
    }
}
