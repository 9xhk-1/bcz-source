package ps;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends a implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b, reason: collision with root package name */
    public Surface f81180b = null;

    /* renamed from: c, reason: collision with root package name */
    public e f81181c = null;

    @Override // ps.a
    public void a(int width, int height) {
        Log.i(a.f81179a, "onSizeChange w = " + width + " h = " + height);
        e eVar = this.f81181c;
        if (eVar != null) {
            eVar.b().d(width, height);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        e eVar = this.f81181c;
        if (eVar != null) {
            eVar.b().a();
        }
    }

    @Override // android.media.MediaPlayer
    public void release() {
        Log.i(a.f81179a, "release");
        this.f81180b = null;
        e eVar = this.f81181c;
        if (eVar != null) {
            eVar.b().b();
            this.f81181c = null;
        }
        super.release();
    }

    @Override // android.media.MediaPlayer
    public void setSurface(Surface surface) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setSurface old ");
        Surface surface2 = this.f81180b;
        sb2.append(surface2 == null ? "null" : surface2.toString());
        sb2.append("new ");
        sb2.append(surface != null ? surface.toString() : "null");
        Log.i(a.f81179a, sb2.toString());
        this.f81180b = surface;
        e eVar = this.f81181c;
        if (eVar != null) {
            eVar.b().c(this.f81180b);
        }
    }

    @Override // android.media.MediaPlayer
    public void start() throws IllegalStateException {
        if (this.f81181c == null) {
            e eVar = new e();
            this.f81181c = eVar;
            eVar.start();
            this.f81181c.i();
            this.f81181c.b().c(this.f81180b);
            SurfaceTexture c11 = this.f81181c.c();
            c11.setOnFrameAvailableListener(this);
            super.setSurface(new Surface(c11));
        }
        super.start();
    }
}
