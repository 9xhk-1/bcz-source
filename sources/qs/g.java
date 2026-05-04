package qs;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends b {

    /* renamed from: f, reason: collision with root package name */
    public Surface f82708f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82709g;

    public g(a eglCore, Surface surface, boolean releaseSurface) {
        super(eglCore);
        b(surface);
        this.f82708f = surface;
        this.f82709g = releaseSurface;
    }

    public void k(a newEglCore) {
        Surface surface = this.f82708f;
        if (surface == null) {
            throw new RuntimeException("not yet implemented for SurfaceTexture");
        }
        this.f82682a = newEglCore;
        b(surface);
    }

    public void l() {
        g();
        Surface surface = this.f82708f;
        if (surface != null) {
            if (this.f82709g) {
                surface.release();
            }
            this.f82708f = null;
        }
    }

    public g(a eglCore, SurfaceTexture surfaceTexture) {
        super(eglCore);
        b(surfaceTexture);
    }
}
