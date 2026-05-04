package pm;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class l extends c {

    /* renamed from: h, reason: collision with root package name */
    public Path f80916h;

    public l(cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80916h = new Path();
    }

    public void n(Canvas canvas, float f11, float f12, km.h hVar) {
        this.f80887d.setColor(hVar.k1());
        this.f80887d.setStrokeWidth(hVar.Q0());
        this.f80887d.setPathEffect(hVar.e1());
        if (hVar.D()) {
            this.f80916h.reset();
            this.f80916h.moveTo(f11, this.f80939a.j());
            this.f80916h.lineTo(f11, this.f80939a.f());
            canvas.drawPath(this.f80916h, this.f80887d);
        }
        if (hVar.o1()) {
            this.f80916h.reset();
            this.f80916h.moveTo(this.f80939a.h(), f12);
            this.f80916h.lineTo(this.f80939a.i(), f12);
            canvas.drawPath(this.f80916h, this.f80887d);
        }
    }
}
