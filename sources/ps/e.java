package ps;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import com.badlogic.gdx.graphics.f;
import com.malmstein.fenster.videorender.gles.Texture2dProgram;
import qs.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e extends Thread {

    /* renamed from: m, reason: collision with root package name */
    public static final String f81188m = "VideoRender";

    /* renamed from: a, reason: collision with root package name */
    public volatile d f81189a;

    /* renamed from: b, reason: collision with root package name */
    public int f81190b;

    /* renamed from: c, reason: collision with root package name */
    public int f81191c;

    /* renamed from: f, reason: collision with root package name */
    public qs.a f81194f;

    /* renamed from: g, reason: collision with root package name */
    public g f81195g;

    /* renamed from: h, reason: collision with root package name */
    public qs.e f81196h;

    /* renamed from: i, reason: collision with root package name */
    public int f81197i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f81198j;

    /* renamed from: l, reason: collision with root package name */
    public com.malmstein.fenster.videorender.gles.a f81200l;

    /* renamed from: d, reason: collision with root package name */
    public Object f81192d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f81193e = false;

    /* renamed from: k, reason: collision with root package name */
    public float[] f81199k = new float[16];

    public void a() {
        qs.d.a("doFrame");
        GLES20.glViewport(0, 0, this.f81190b, this.f81191c);
        GLES20.glClearColor(0.2f, 0.2f, 0.2f, 1.0f);
        GLES20.glClear(16384);
        this.f81198j.updateTexImage();
        this.f81198j.getTransformMatrix(this.f81199k);
        if (this.f81195g != null) {
            this.f81200l.c(this.f81197i, this.f81199k);
            this.f81195g.j();
        }
        qs.d.a("doFrame end");
    }

    public d b() {
        return this.f81189a;
    }

    public SurfaceTexture c() {
        return this.f81198j;
    }

    public final void d() {
        Log.d(f81188m, "prepareGl");
        qs.e eVar = new qs.e(this.f81194f, 1, 1);
        this.f81196h = eVar;
        eVar.e();
        com.malmstein.fenster.videorender.gles.a aVar = new com.malmstein.fenster.videorender.gles.a(new Texture2dProgram(Texture2dProgram.ProgramType.TEXTURE_EXT));
        this.f81200l = aVar;
        this.f81197i = aVar.b();
        this.f81198j = new SurfaceTexture(this.f81197i);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(f.f11582f0);
        GLES20.glDisable(f.f11558b0);
    }

    public final void e() {
        qs.d.a("releaseGl start");
        g gVar = this.f81195g;
        if (gVar != null) {
            gVar.l();
            this.f81195g = null;
        }
        qs.e eVar = this.f81196h;
        if (eVar != null) {
            eVar.k();
            this.f81196h = null;
        }
        SurfaceTexture surfaceTexture = this.f81198j;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f81198j = null;
        }
        int i11 = this.f81197i;
        if (i11 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.f81197i = -1;
        }
        com.malmstein.fenster.videorender.gles.a aVar = this.f81200l;
        if (aVar != null) {
            aVar.e(false);
            this.f81200l = null;
        }
        qs.d.a("releaseGl done");
        this.f81194f.j();
    }

    public void f() {
        Log.d(f81188m, "shutdown");
        Looper.myLooper().quit();
    }

    public void g(Surface surface) {
        g gVar;
        if (surface != null) {
            gVar = new g(this.f81194f, surface, false);
            gVar.e();
        } else {
            this.f81196h.e();
            gVar = null;
        }
        g gVar2 = this.f81195g;
        if (gVar2 != null) {
            gVar2.l();
            this.f81195g = null;
        }
        this.f81195g = gVar;
    }

    public void h(int width, int height) {
        this.f81190b = width;
        this.f81191c = height;
    }

    public void i() {
        synchronized (this.f81192d) {
            while (!this.f81193e) {
                try {
                    this.f81192d.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f81189a = new d(this);
        this.f81194f = new qs.a(null, 2);
        d();
        synchronized (this.f81192d) {
            this.f81193e = true;
            this.f81192d.notify();
        }
        Looper.loop();
        Log.d(f81188m, "looper quit");
        e();
        this.f81194f.m();
        synchronized (this.f81192d) {
            this.f81193e = false;
        }
    }
}
