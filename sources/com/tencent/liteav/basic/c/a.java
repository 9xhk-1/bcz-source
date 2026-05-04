package com.tencent.liteav.basic.c;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f43127a = "a";

    /* renamed from: l, reason: collision with root package name */
    private static int[] f43128l = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* renamed from: m, reason: collision with root package name */
    private static int[] f43129m = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, qs.a.f82676h, 1, 12344};

    /* renamed from: b, reason: collision with root package name */
    private EGL10 f43130b;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f43131c;

    /* renamed from: d, reason: collision with root package name */
    private EGLConfig f43132d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43133e;

    /* renamed from: f, reason: collision with root package name */
    private EGLContext f43134f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43135g;

    /* renamed from: h, reason: collision with root package name */
    private EGLSurface f43136h;

    /* renamed from: i, reason: collision with root package name */
    private int f43137i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f43138j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int[] f43139k = new int[2];

    private a() {
    }

    public static a a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i11, int i12) {
        a aVar = new a();
        aVar.f43137i = i11;
        aVar.f43138j = i12;
        if (aVar.a(eGLConfig, eGLContext, surface)) {
            return aVar;
        }
        return null;
    }

    private void g() throws c {
        int eglGetError = this.f43130b.eglGetError();
        if (eglGetError != 12288) {
            throw new c(eglGetError);
        }
    }

    public void b() {
        EGL10 egl10 = this.f43130b;
        EGLDisplay eGLDisplay = this.f43131c;
        EGLSurface eGLSurface = this.f43136h;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f43134f);
        e();
    }

    public void c() {
        EGL10 egl10 = this.f43130b;
        EGLDisplay eGLDisplay = this.f43131c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = this.f43136h;
        if (eGLSurface2 != null) {
            this.f43130b.eglDestroySurface(this.f43131c, eGLSurface2);
        }
        EGLContext eGLContext = this.f43134f;
        if (eGLContext != null) {
            this.f43130b.eglDestroyContext(this.f43131c, eGLContext);
        }
        this.f43130b.eglTerminate(this.f43131c);
        e();
        this.f43136h = null;
        this.f43131c = null;
    }

    public EGLContext d() {
        return this.f43134f;
    }

    public void e() {
        int eglGetError = this.f43130b.eglGetError();
        if (eglGetError != 12288) {
            TXCLog.e(f43127a, "EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    public com.tencent.liteav.basic.util.d f() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.f43130b.eglQuerySurface(this.f43131c, this.f43136h, 12375, iArr) && this.f43130b.eglQuerySurface(this.f43131c, this.f43136h, 12374, iArr2)) ? new com.tencent.liteav.basic.util.d(iArr[0], iArr2[0]) : new com.tencent.liteav.basic.util.d(0, 0);
    }

    public boolean a() {
        boolean eglSwapBuffers = this.f43130b.eglSwapBuffers(this.f43131c, this.f43136h);
        e();
        return eglSwapBuffers;
    }

    private boolean a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f43130b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f43131c = eglGetDisplay;
        this.f43130b.eglInitialize(eglGetDisplay, this.f43139k);
        if (eGLConfig == null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.f43130b.eglChooseConfig(this.f43131c, surface == null ? f43128l : f43129m, eGLConfigArr, 1, new int[1]);
            this.f43132d = eGLConfigArr[0];
            this.f43133e = true;
        } else {
            this.f43132d = eGLConfig;
        }
        if (eGLContext != null) {
            this.f43135g = true;
        }
        try {
            this.f43134f = a(this.f43131c, this.f43132d, 2, eGLContext);
        } catch (c unused) {
            TXCLog.i(f43127a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f43134f = a(this.f43131c, this.f43132d, 3, eGLContext);
            } catch (c e11) {
                TXCLog.e(f43127a, "failed to create EGLContext of 3.0. " + e11);
                return false;
            }
        }
        int[] iArr = {12375, this.f43137i, 12374, this.f43138j, 12344};
        if (surface == null) {
            this.f43136h = this.f43130b.eglCreatePbufferSurface(this.f43131c, this.f43132d, iArr);
        } else {
            this.f43136h = this.f43130b.eglCreateWindowSurface(this.f43131c, this.f43132d, surface, null);
        }
        EGLSurface eGLSurface = this.f43136h;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            e();
            return false;
        }
        if (this.f43130b.eglMakeCurrent(this.f43131c, eGLSurface, eGLSurface, this.f43134f)) {
            return true;
        }
        e();
        return false;
    }

    private EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, EGLContext eGLContext) throws c {
        int[] iArr = {12440, i11, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = this.f43130b.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        g();
        return eglCreateContext;
    }
}
