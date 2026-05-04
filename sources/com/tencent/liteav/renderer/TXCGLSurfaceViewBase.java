package com.tencent.liteav.renderer;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.heytap.mcssdk.constant.MessageConstant;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCGLSurfaceViewBase extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    private static final j f43906a = new j();

    /* renamed from: b, reason: collision with root package name */
    protected boolean f43907b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f43908c;

    /* renamed from: d, reason: collision with root package name */
    protected final WeakReference<TXCGLSurfaceViewBase> f43909d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f43910e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f43911f;

    /* renamed from: g, reason: collision with root package name */
    private i f43912g;

    /* renamed from: h, reason: collision with root package name */
    private GLSurfaceView.Renderer f43913h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f43914i;

    /* renamed from: j, reason: collision with root package name */
    private e f43915j;

    /* renamed from: k, reason: collision with root package name */
    private f f43916k;

    /* renamed from: l, reason: collision with root package name */
    private g f43917l;

    /* renamed from: m, reason: collision with root package name */
    private k f43918m;

    /* renamed from: n, reason: collision with root package name */
    private int f43919n;

    /* renamed from: o, reason: collision with root package name */
    private int f43920o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f43921p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private boolean f43942a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f43943b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43944c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43945d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43946e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f43947f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f43948g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f43949h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f43950i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f43951j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f43952k;

        /* renamed from: p, reason: collision with root package name */
        private boolean f43957p;

        /* renamed from: s, reason: collision with root package name */
        private h f43960s;

        /* renamed from: t, reason: collision with root package name */
        private WeakReference<TXCGLSurfaceViewBase> f43961t;

        /* renamed from: q, reason: collision with root package name */
        private ArrayList<Runnable> f43958q = new ArrayList<>();

        /* renamed from: r, reason: collision with root package name */
        private boolean f43959r = true;

        /* renamed from: l, reason: collision with root package name */
        private int f43953l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f43954m = 0;

        /* renamed from: o, reason: collision with root package name */
        private boolean f43956o = true;

        /* renamed from: n, reason: collision with root package name */
        private int f43955n = 1;

        public i(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f43961t = weakReference;
        }

        /* JADX WARN: Removed duplicated region for block: B:179:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void i() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 569
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.i.i():void");
        }

        private void j() {
            if (this.f43950i) {
                this.f43950i = false;
                this.f43960s.f();
            }
        }

        private void k() {
            if (this.f43949h) {
                this.f43960s.g();
                this.f43949h = false;
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f43961t.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f43911f = false;
                }
                TXCGLSurfaceViewBase.f43906a.c(this);
            }
        }

        private boolean l() {
            if (this.f43945d || !this.f43946e || this.f43947f || this.f43953l <= 0 || this.f43954m <= 0) {
                return false;
            }
            return this.f43956o || this.f43955n == 1;
        }

        public h b() {
            return this.f43960s;
        }

        public boolean c() {
            return this.f43949h && this.f43950i && l();
        }

        public int d() {
            int i11;
            synchronized (TXCGLSurfaceViewBase.f43906a) {
                i11 = this.f43955n;
            }
            return i11;
        }

        public void e() {
            synchronized (TXCGLSurfaceViewBase.f43906a) {
                this.f43946e = true;
                this.f43951j = false;
                TXCGLSurfaceViewBase.f43906a.notifyAll();
                while (this.f43948g && !this.f43951j && !this.f43943b) {
                    try {
                        TXCGLSurfaceViewBase.f43906a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void f() {
            synchronized (TXCGLSurfaceViewBase.f43906a) {
                this.f43946e = false;
                TXCGLSurfaceViewBase.f43906a.notifyAll();
                while (!this.f43948g && !this.f43943b) {
                    try {
                        TXCGLSurfaceViewBase.f43906a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void g() {
            synchronized (TXCGLSurfaceViewBase.f43906a) {
                this.f43942a = true;
                TXCGLSurfaceViewBase.f43906a.notifyAll();
                while (!this.f43943b) {
                    try {
                        TXCGLSurfaceViewBase.f43906a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h() {
            this.f43952k = true;
            TXCGLSurfaceViewBase.f43906a.notifyAll();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                i();
            } catch (InterruptedException unused) {
            } catch (Throwable th2) {
                TXCGLSurfaceViewBase.f43906a.a(this);
                throw th2;
            }
            TXCGLSurfaceViewBase.f43906a.a(this);
        }

        public int a() {
            return this.f43960s.c();
        }

        public void a(int i11) {
            if (i11 >= 0 && i11 <= 1) {
                synchronized (TXCGLSurfaceViewBase.f43906a) {
                    this.f43955n = i11;
                    TXCGLSurfaceViewBase.f43906a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public void a(int i11, int i12) {
            synchronized (TXCGLSurfaceViewBase.f43906a) {
                this.f43953l = i11;
                this.f43954m = i12;
                this.f43959r = true;
                this.f43956o = true;
                this.f43957p = false;
                TXCGLSurfaceViewBase.f43906a.notifyAll();
                while (!this.f43943b && !this.f43945d && !this.f43957p && c()) {
                    try {
                        TXCGLSurfaceViewBase.f43906a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TXCGLSurfaceViewBase.f43906a) {
                    this.f43958q.add(runnable);
                    TXCGLSurfaceViewBase.f43906a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k {
        GL a(GL gl2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private StringBuilder f43969a = new StringBuilder();

        private void a() {
            if (this.f43969a.length() > 0) {
                TXCLog.v("TXCGLSurfaceViewBase", this.f43969a.toString());
                StringBuilder sb2 = this.f43969a;
                sb2.delete(0, sb2.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                char c11 = cArr[i11 + i13];
                if (c11 == '\n') {
                    a();
                } else {
                    this.f43969a.append(c11);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends b {
        public m(boolean z11) {
            super(8, 8, 8, 0, z11 ? 16 : 0, 0);
        }
    }

    public TXCGLSurfaceViewBase(Context context) {
        super(context);
        this.f43907b = false;
        this.f43908c = false;
        this.f43909d = new WeakReference<>(this);
        e();
    }

    public void a() {
    }

    public int b() {
        return 0;
    }

    public void finalize() throws Throwable {
        try {
            i iVar = this.f43912g;
            if (iVar != null) {
                iVar.g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f43919n;
    }

    public h getEGLHelper() {
        return this.f43912g.b();
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f43921p;
    }

    public int getRenderMode() {
        return this.f43912g.d();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f43914i && this.f43913h != null) {
            i iVar = this.f43912g;
            int d11 = iVar != null ? iVar.d() : 1;
            i iVar2 = new i(this.f43909d);
            this.f43912g = iVar2;
            if (d11 != 1) {
                iVar2.a(d11);
            }
            this.f43912g.start();
        }
        this.f43914i = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        if (this.f43907b && this.f43912g != null) {
            TXCLog.w("TXCGLSurfaceViewBase", "background capture destroy surface when onDetachedFromWindow");
            this.f43912g.a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.2
                @Override // java.lang.Runnable
                public void run() {
                    TXCGLSurfaceViewBase.this.a();
                }
            });
            this.f43912g.f();
        }
        i iVar = this.f43912g;
        if (iVar != null) {
            iVar.g();
        }
        this.f43914i = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i11) {
        this.f43919n = i11;
    }

    public void setEGLConfigChooser(e eVar) {
        f();
        this.f43915j = eVar;
    }

    public void setEGLContextClientVersion(int i11) {
        f();
        this.f43920o = i11;
    }

    public void setEGLContextFactory(f fVar) {
        f();
        this.f43916k = fVar;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        f();
        this.f43917l = gVar;
    }

    public void setGLWrapper(k kVar) {
        this.f43918m = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z11) {
        this.f43921p = z11;
    }

    public void setRenderMode(int i11) {
        this.f43912g.a(i11);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        f();
        if (this.f43915j == null) {
            this.f43915j = new m(true);
        }
        if (this.f43916k == null) {
            this.f43916k = new c();
        }
        if (this.f43917l == null) {
            this.f43917l = new d();
        }
        this.f43913h = renderer;
        i iVar = new i(this.f43909d);
        this.f43912g = iVar;
        iVar.start();
        TXCLog.i("TXCGLSurfaceViewBase", "setRenderer-->mGLThread.start");
    }

    public void setRunInBackground(boolean z11) {
        this.f43908c = z11;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        this.f43912g.a(i12, i13);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f43912g.e();
        setRunInBackground(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        setRunInBackground(true);
        if (this.f43907b) {
            return;
        }
        this.f43912g.a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceViewBase.this.a();
            }
        });
        this.f43912g.f();
    }

    private void e() {
        getHolder().addCallback(this);
    }

    private void f() {
        if (this.f43912g != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public int c() {
        return this.f43912g.a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements g {
        private d() {
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.g
        public EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e11) {
                TXCLog.e("TXCGLSurfaceViewBase", "eglCreateWindowSurface");
                TXCLog.e("TXCGLSurfaceViewBase", e11.toString());
                return null;
            }
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.g
        public void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private static String f43962a = "GLThreadManager";

        /* renamed from: b, reason: collision with root package name */
        private boolean f43963b;

        /* renamed from: c, reason: collision with root package name */
        private int f43964c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43965d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43966e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f43967f;

        /* renamed from: g, reason: collision with root package name */
        private i f43968g;

        private j() {
        }

        public synchronized void a(i iVar) {
            try {
                iVar.f43943b = true;
                if (this.f43968g == iVar) {
                    this.f43968g = null;
                }
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public boolean b(i iVar) {
            i iVar2 = this.f43968g;
            if (iVar2 == iVar || iVar2 == null) {
                this.f43968g = iVar;
                notifyAll();
                return true;
            }
            c();
            if (this.f43966e) {
                return true;
            }
            i iVar3 = this.f43968g;
            if (iVar3 == null) {
                return false;
            }
            iVar3.h();
            return false;
        }

        public void c(i iVar) {
            if (this.f43968g == iVar) {
                this.f43968g = null;
            }
            notifyAll();
        }

        private void c() {
            this.f43964c = 131072;
            this.f43966e = true;
            this.f43963b = true;
        }

        public synchronized boolean a() {
            return this.f43967f;
        }

        public synchronized void a(GL10 gl10) {
            try {
                if (!this.f43965d) {
                    c();
                    String glGetString = gl10.glGetString(com.badlogic.gdx.graphics.f.f11674u2);
                    if (this.f43964c < 131072) {
                        this.f43966e = !glGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f43967f = !this.f43966e;
                    this.f43965d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean b() {
            c();
            return !this.f43966e;
        }
    }

    public void a(int i11, int i12, int i13, int i14, int i15, int i16) {
        setEGLConfigChooser(new b(i11, i12, i13, i14, i15, i16));
    }

    public void setEGLConfigChooser(boolean z11) {
        setEGLConfigChooser(new m(z11));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements f {

        /* renamed from: b, reason: collision with root package name */
        private int f43935b;

        private c() {
            this.f43935b = 12440;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.f
        public EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f43935b, TXCGLSurfaceViewBase.this.f43920o, 12344};
            if (TXCGLSurfaceViewBase.this.f43920o == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.f
        public void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            TXCLog.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            h.a("eglDestroyContex", egl10.eglGetError());
        }
    }

    public TXCGLSurfaceViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43907b = false;
        this.f43908c = false;
        this.f43909d = new WeakReference<>(this);
        e();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends a {

        /* renamed from: c, reason: collision with root package name */
        protected int f43926c;

        /* renamed from: d, reason: collision with root package name */
        protected int f43927d;

        /* renamed from: e, reason: collision with root package name */
        protected int f43928e;

        /* renamed from: f, reason: collision with root package name */
        protected int f43929f;

        /* renamed from: g, reason: collision with root package name */
        protected int f43930g;

        /* renamed from: h, reason: collision with root package name */
        protected int f43931h;

        /* renamed from: j, reason: collision with root package name */
        private int[] f43933j;

        public b(int i11, int i12, int i13, int i14, int i15, int i16) {
            super(new int[]{12324, i11, 12323, i12, 12322, i13, 12321, i14, 12325, i15, 12326, i16, 12344});
            this.f43933j = new int[1];
            this.f43926c = i11;
            this.f43927d = i12;
            this.f43928e = i13;
            this.f43929f = i14;
            this.f43930g = i15;
            this.f43931h = i16;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.a
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i11 = 0;
            while (i11 < length) {
                EGLConfig eGLConfig = eGLConfigArr[i11];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int a11 = a(egl102, eGLDisplay2, eGLConfig, 12325, 0);
                int a12 = a(egl102, eGLDisplay2, eGLConfig, 12326, 0);
                if (a11 >= this.f43930g && a12 >= this.f43931h) {
                    int a13 = a(egl102, eGLDisplay2, eGLConfig, 12324, 0);
                    int a14 = a(egl102, eGLDisplay2, eGLConfig, 12323, 0);
                    int a15 = a(egl102, eGLDisplay2, eGLConfig, 12322, 0);
                    int a16 = a(egl102, eGLDisplay2, eGLConfig, 12321, 0);
                    if (a13 == this.f43926c && a14 == this.f43927d && a15 == this.f43928e && a16 == this.f43929f) {
                        return eGLConfig;
                    }
                }
                i11++;
                egl10 = egl102;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int i12) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, this.f43933j) ? this.f43933j[0] : i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class a implements e {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f43924a;

        public a(int[] iArr) {
            this.f43924a = a(iArr);
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.e
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f43924a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i11 = iArr[0];
            if (i11 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i11];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f43924a, eGLConfigArr, i11, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a11 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a11 != null) {
                return a11;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        private int[] a(int[] iArr) {
            if (TXCGLSurfaceViewBase.this.f43920o != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i11 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            iArr2[i11] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        EGL10 f43936a;

        /* renamed from: b, reason: collision with root package name */
        EGLDisplay f43937b;

        /* renamed from: c, reason: collision with root package name */
        EGLSurface f43938c;

        /* renamed from: d, reason: collision with root package name */
        EGLConfig f43939d;

        /* renamed from: e, reason: collision with root package name */
        EGLContext f43940e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<TXCGLSurfaceViewBase> f43941f;

        public h(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f43941f = weakReference;
        }

        private void h() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f43938c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f43936a.eglMakeCurrent(this.f43937b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f43941f.get();
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f43917l.a(this.f43936a, this.f43937b, this.f43938c);
                tXCGLSurfaceViewBase.f43910e = false;
            }
            this.f43938c = null;
        }

        public void a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f43936a = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f43937b = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f43936a.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f43941f.get();
            if (tXCGLSurfaceViewBase == null) {
                this.f43939d = null;
                this.f43940e = null;
                TXCLog.w("TXCGLSurfaceViewBase", "start() error when view is null ");
            } else {
                this.f43939d = tXCGLSurfaceViewBase.f43915j.a(this.f43936a, this.f43937b);
                this.f43940e = tXCGLSurfaceViewBase.f43916k.a(this.f43936a, this.f43937b, this.f43939d);
            }
            EGLContext eGLContext = this.f43940e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f43940e = null;
                a("createContext");
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f43911f = true;
            }
            this.f43938c = null;
        }

        public boolean b() {
            if (this.f43936a == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f43937b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f43939d == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            h();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f43941f.get();
            if (tXCGLSurfaceViewBase != null) {
                this.f43938c = tXCGLSurfaceViewBase.f43917l.a(this.f43936a, this.f43937b, this.f43939d, tXCGLSurfaceViewBase.getHolder());
            } else {
                this.f43938c = null;
            }
            EGLSurface eGLSurface = this.f43938c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f43936a.eglGetError() == 12299) {
                    TXCLog.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (!this.f43936a.eglMakeCurrent(this.f43937b, eGLSurface, eGLSurface, this.f43940e)) {
                a("EGLHelper", "eglMakeCurrent", this.f43936a.eglGetError());
                return false;
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f43910e = true;
            }
            return true;
        }

        public int c() {
            return e();
        }

        public GL d() {
            GL gl2 = this.f43940e.getGL();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f43941f.get();
            if (tXCGLSurfaceViewBase == null) {
                return gl2;
            }
            if (tXCGLSurfaceViewBase.f43918m != null) {
                gl2 = tXCGLSurfaceViewBase.f43918m.a(gl2);
            }
            if ((tXCGLSurfaceViewBase.f43919n & 3) != 0) {
                return GLDebugHelper.wrap(gl2, (tXCGLSurfaceViewBase.f43919n & 1) == 0 ? 0 : 1, (tXCGLSurfaceViewBase.f43919n & 2) != 0 ? new l() : null);
            }
            return gl2;
        }

        public int e() {
            return !this.f43936a.eglSwapBuffers(this.f43937b, this.f43938c) ? this.f43936a.eglGetError() : MessageConstant.CommandId.COMMAND_BASE;
        }

        public void f() {
            h();
        }

        public void g() {
            if (this.f43940e != null) {
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f43941f.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f43916k.a(this.f43936a, this.f43937b, this.f43940e);
                }
                this.f43940e = null;
            }
            EGLDisplay eGLDisplay = this.f43937b;
            if (eGLDisplay != null) {
                this.f43936a.eglTerminate(eGLDisplay);
                this.f43937b = null;
            }
        }

        private void a(String str) {
            a(str, this.f43936a.eglGetError());
        }

        public static String b(String str, int i11) {
            return str + " failed: " + i11;
        }

        public static void a(String str, int i11) {
            throw new RuntimeException(b(str, i11));
        }

        public static void a(String str, String str2, int i11) {
            TXCLog.w(str, b(str2, i11));
        }
    }
}
